package io.github.shizuki.site.content.controller;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import io.github.shizuki.common.audit.annotation.AuditLog;
import io.github.shizuki.common.ratelimit.annotation.RateLimit;
import io.github.shizuki.common.security.annotation.RequireGroup;
import io.github.shizuki.common.security.annotation.RequirePermission;
import io.github.shizuki.site.content.entity.QuoteEntity;
import io.github.shizuki.site.content.request.LocalQuoteRequest;
import io.github.shizuki.site.content.request.SiteWidgetConfigurationRequest;
import io.github.shizuki.site.content.service.widget.DailyQuoteAdminService;
import io.github.shizuki.site.content.service.widget.LocalQuoteCommand;
import io.github.shizuki.site.content.service.widget.LocalQuoteCurationService;
import io.github.shizuki.site.content.service.widget.SiteWidgetConfigurationCommand;
import io.github.shizuki.site.content.service.widget.SiteWidgetConfigurationService;
import io.github.shizuki.site.content.service.widget.SiteWidgetConfigurationSnapshot;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class AdminSiteWidgetControllerTest {

    @Mock
    private SiteWidgetConfigurationService configurationService;
    @Mock
    private LocalQuoteCurationService quoteService;
    @Mock
    private DailyQuoteAdminService dailyQuoteAdminService;

    @Test
    void classRequiresAdminGroupAndDedicatedWidgetPermission() {
        RequireGroup group = AdminSiteWidgetController.class.getAnnotation(RequireGroup.class);
        RequirePermission permission = AdminSiteWidgetController.class.getAnnotation(RequirePermission.class);

        assertThat(group).isNotNull();
        assertThat(group.value()).isEqualTo("ADMIN");
        assertThat(permission).isNotNull();
        assertThat(permission.value()).isEqualTo("site.widgets.manage");
    }

    @Test
    void configurationRequestMapsEveryVersionedSettingAndIsNoStore() {
        SiteWidgetConfigurationRequest request = new SiteWidgetConfigurationRequest(
            4,
            "上海",
            new BigDecimal("31.2304"),
            new BigDecimal("121.4737"),
            "Asia/Shanghai",
            true,
            360,
            "LOCAL",
            false
        );
        SiteWidgetConfigurationSnapshot saved = new SiteWidgetConfigurationSnapshot(
            5,
            9L,
            "上海",
            new BigDecimal("31.230400"),
            new BigDecimal("121.473700"),
            "Asia/Shanghai",
            true,
            360,
            io.github.shizuki.site.content.service.widget.SiteWidgetQuoteSourceMode.LOCAL,
            false
        );
        when(configurationService.save(any())).thenReturn(saved);

        var response = controller().saveConfiguration(request);

        ArgumentCaptor<SiteWidgetConfigurationCommand> command =
            ArgumentCaptor.forClass(SiteWidgetConfigurationCommand.class);
        verify(configurationService).save(command.capture());
        assertThat(command.getValue()).isEqualTo(new SiteWidgetConfigurationCommand(
            4,
            "上海",
            new BigDecimal("31.2304"),
            new BigDecimal("121.4737"),
            "Asia/Shanghai",
            true,
            360,
            "LOCAL",
            false
        ));
        assertThat(response.getHeaders().getCacheControl()).isEqualTo("no-store");
        assertThat(response.getBody()).isNotNull();
        assertThat(response.getBody().data()).isEqualTo(saved);
    }

    @Test
    void localQuoteRequestPreservesProvenanceAndIsNoStore() {
        LocalQuoteRequest request = new LocalQuoteRequest(
            "句子",
            "作者",
            "作品",
            "文学",
            "LOCAL",
            null,
            "https://example.com/source"
        );
        QuoteEntity created = new QuoteEntity();
        created.setId(7L);
        when(quoteService.create(any())).thenReturn(created);

        var response = controller().createQuote(request);

        ArgumentCaptor<LocalQuoteCommand> command = ArgumentCaptor.forClass(LocalQuoteCommand.class);
        verify(quoteService).create(command.capture());
        assertThat(command.getValue()).isEqualTo(new LocalQuoteCommand(
            "句子",
            "作者",
            "作品",
            "文学",
            "LOCAL",
            null,
            "https://example.com/source"
        ));
        assertThat(response.getHeaders().getCacheControl()).isEqualTo("no-store");
        assertThat(response.getBody()).isNotNull();
        assertThat(response.getBody().data()).isSameAs(created);
    }

    @Test
    void everyAdministratorMutationIsRateLimitedAndAudited() {
        List<String> mutationNames = List.of(
            "saveConfiguration",
            "createQuote",
            "editQuote",
            "reviewQuote",
            "deleteQuote",
            "refreshQuote"
        );

        for (String name : mutationNames) {
            Method method = List.of(AdminSiteWidgetController.class.getDeclaredMethods()).stream()
                .filter(candidate -> candidate.getName().equals(name))
                .findFirst()
                .orElseThrow();
            assertThat(method.getAnnotation(RateLimit.class)).as(name).isNotNull();
            assertThat(method.getAnnotation(AuditLog.class)).as(name).isNotNull();
        }
    }

    private AdminSiteWidgetController controller() {
        return new AdminSiteWidgetController(
            configurationService,
            quoteService,
            dailyQuoteAdminService
        );
    }
}
