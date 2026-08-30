package io.github.shizuki.site.content.service.widget;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import io.github.shizuki.common.core.error.BusinessException;
import io.github.shizuki.common.core.error.ErrorCode;
import io.github.shizuki.common.security.context.LoginUserContext;
import io.github.shizuki.common.security.model.LoginUser;
import io.github.shizuki.site.content.entity.QuoteEntity;
import io.github.shizuki.site.content.mapper.QuoteMapper;
import java.util.List;
import java.util.Set;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class LocalQuoteCurationServiceTest {

    @Mock
    private QuoteMapper quoteMapper;
    @Mock
    private SiteWidgetCacheInvalidator cacheInvalidator;

    private LocalQuoteCurationService service;

    @BeforeEach
    void setUp() {
        service = new LocalQuoteCurationService(quoteMapper, cacheInvalidator);
        LoginUserContext.set(new LoginUser(7L, Set.of("ADMIN"), Set.of("site.widgets.manage")));
    }

    @AfterEach
    void tearDown() {
        LoginUserContext.clear();
    }

    @Test
    void createsTrimmedDisabledDraftWithoutAutoApproval() {
        when(quoteMapper.insert(any(QuoteEntity.class))).thenAnswer(invocation -> {
            QuoteEntity entity = invocation.getArgument(0);
            entity.setId(41L);
            return 1;
        });

        QuoteEntity created = service.create(new LocalQuoteCommand(
            "  山高水长  ",
            "  佚名  ",
            "  本地精选  ",
            "  life  ",
            null,
            null,
            null
        ));

        assertThat(created.getId()).isEqualTo(41L);
        assertThat(created.getText()).isEqualTo("山高水长");
        assertThat(created.getProviderCode()).isEqualTo("LOCAL");
        assertThat(created.getApprovalStatus()).isEqualTo("DRAFT");
        assertThat(created.getEnabled()).isFalse();
        verify(cacheInvalidator, never()).invalidate(any());
    }

    @Test
    void editingApprovedContentReturnsItToDisabledDraftReview() {
        QuoteEntity current = quote(41L, 2, "APPROVED", true);
        when(quoteMapper.selectById(41L)).thenReturn(current);
        when(quoteMapper.updateContentVersioned(
            41L, 2, "修改后", null, "本地", "life", "LOCAL", null, null
        )).thenReturn(1);

        QuoteEntity edited = service.edit(41L, 2, new LocalQuoteCommand(
            "修改后", null, "本地", "life", "LOCAL", null, null
        ));

        assertThat(edited.getApprovalStatus()).isEqualTo("DRAFT");
        assertThat(edited.getEnabled()).isFalse();
        assertThat(edited.getVersion()).isEqualTo(3);
        verify(cacheInvalidator).invalidate(new SiteWidgetCacheInvalidation(null, 0L, false, true));
    }

    @Test
    void onlyApprovedQuoteCanBeEnabled() {
        QuoteEntity current = quote(41L, 1, "DRAFT", false);
        when(quoteMapper.selectById(41L)).thenReturn(current);

        assertThatThrownBy(() -> service.review(41L, 1, "DRAFT", true))
            .isInstanceOfSatisfying(BusinessException.class, exception ->
                assertThat(exception.getErrorCode()).isEqualTo(ErrorCode.BAD_REQUEST));
        verify(quoteMapper, never()).reviewVersioned(41L, 1, "DRAFT", 1);

        when(quoteMapper.reviewVersioned(41L, 1, "APPROVED", 1)).thenReturn(1);
        QuoteEntity approved = service.review(41L, 1, "APPROVED", true);
        assertThat(approved.getApprovalStatus()).isEqualTo("APPROVED");
        assertThat(approved.getEnabled()).isTrue();
    }

    @Test
    void externalCurationRequiresStableIdentifierAndHttpsSource() {
        assertThatThrownBy(() -> service.create(new LocalQuoteCommand(
            "文本", null, "作品", "i", "HITOKOTO", null, null
        ))).isInstanceOfSatisfying(BusinessException.class, exception ->
            assertThat(exception.getErrorCode()).isEqualTo(ErrorCode.BAD_REQUEST));
        assertThatThrownBy(() -> service.create(new LocalQuoteCommand(
            "文本", null, "作品", "i", "HITOKOTO", "uuid", "http://example.com/source"
        ))).isInstanceOf(BusinessException.class);
        verify(quoteMapper, never()).insert(any(QuoteEntity.class));
    }

    @Test
    void externalCurationRejectsCredentialBearingOrSignedAttributionUrls() {
        assertThatThrownBy(() -> service.create(new LocalQuoteCommand(
            "文本", null, "作品", "i", "HITOKOTO", "uuid", "https://token@example.com/source"
        ))).isInstanceOfSatisfying(BusinessException.class, exception ->
            assertThat(exception.getErrorCode()).isEqualTo(ErrorCode.BAD_REQUEST));
        assertThatThrownBy(() -> service.create(new LocalQuoteCommand(
            "文本", null, "作品", "i", "HITOKOTO", "uuid",
            "https://example.com/source?X-Amz-Signature=secret"
        ))).isInstanceOfSatisfying(BusinessException.class, exception ->
            assertThat(exception.getErrorCode()).isEqualTo(ErrorCode.BAD_REQUEST));
        verify(quoteMapper, never()).insert(any(QuoteEntity.class));
    }

    @Test
    void staleVersionAndNonAdminPerformNoMutation() {
        when(quoteMapper.selectById(41L)).thenReturn(quote(41L, 4, "DRAFT", false));
        assertThatThrownBy(() -> service.delete(41L, 3))
            .isInstanceOfSatisfying(BusinessException.class, exception -> {
                assertThat(exception.getErrorCode()).isEqualTo(ErrorCode.CONFLICT);
                assertThat(exception.getDetails()).containsEntry("currentVersion", 4);
            });

        LoginUserContext.set(new LoginUser(8L, Set.of("USER"), Set.of("site.widgets.manage")));
        assertThatThrownBy(() -> service.get(41L))
            .isInstanceOfSatisfying(BusinessException.class, exception ->
                assertThat(exception.getErrorCode()).isEqualTo(ErrorCode.FORBIDDEN));
        verify(quoteMapper, never()).softDeleteVersioned(41L, 3);
    }

    @Test
    void adminListIncludesDraftsForCurationWhileVisitorSelectionStaysSeparate() {
        QuoteEntity draft = quote(41L, 0, "DRAFT", false);
        when(quoteMapper.selectAdminList(50)).thenReturn(List.of(draft));

        assertThat(service.list(50)).containsExactly(draft);
        verify(quoteMapper, never()).selectApprovedEnabled(50);
    }

    private QuoteEntity quote(long id, int version, String approval, boolean enabled) {
        QuoteEntity entity = new QuoteEntity();
        entity.setId(id);
        entity.setText("原文");
        entity.setProviderCode("LOCAL");
        entity.setApprovalStatus(approval);
        entity.setEnabled(enabled);
        entity.setDeleted(0);
        entity.setVersion(version);
        return entity;
    }
}
