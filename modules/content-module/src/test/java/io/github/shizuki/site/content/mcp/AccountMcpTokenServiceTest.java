package io.github.shizuki.site.content.mcp;

import io.github.shizuki.common.core.error.BusinessException;
import io.github.shizuki.common.core.error.ErrorCode;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;
import static org.mockito.ArgumentMatchers.*;
import static org.mockito.Mockito.*;

class AccountMcpTokenServiceTest {
    private final AccountMcpTokenRepository repository = mock(AccountMcpTokenRepository.class);
    private final AccountMcpTokenService service = new AccountMcpTokenService(repository);

    @Test
    void rotateAndRevokeInvalidatePreviousDigestAndNeverSendPlaintextToStorage() {
        Map<Long, String> digests = new HashMap<>();
        when(repository.lockAccount(7)).thenReturn(true);
        when(repository.updateToken(eq(7L), anyString(), any())).thenAnswer(call -> {
            if (!digests.containsKey(7L)) return 0;
            digests.put(7L, call.getArgument(1));
            return 1;
        });
        doAnswer(call -> { digests.put(7L, call.getArgument(1)); return null; })
            .when(repository).insertToken(eq(7L), anyString(), any());
        doAnswer(call -> { digests.remove(7L); return null; }).when(repository).revoke(7);
        when(repository.find(7)).thenAnswer(call -> Optional.of(new AccountMcpTokenRepository.Row(
            digests.containsKey(7L), null, null, 29L)));
        when(repository.findGrant(anyString())).thenAnswer(call -> digests.containsValue(call.getArgument(0))
            ? Optional.of(new AccountMcpTokenRepository.Grant(7, 29L)) : Optional.empty());

        var first = service.rotate(7);
        assertThat(first.token()).matches("mcp_[A-Za-z0-9_-]{43}");
        assertThat(digests.get(7L)).isEqualTo(AccountMcpTokenService.digest(first.token()))
            .matches("[0-9a-f]{64}").doesNotContain(first.token());
        assertThat(first.toString()).doesNotContain(first.token());
        assertThat(service.authorize(first.token(), "todo-dev")).isEqualTo(new AccountMcpTokenService.ScopedGrant(7, 29));
        var second = service.rotate(7);
        assertThat(second.token()).isNotEqualTo(first.token());
        assertError(ErrorCode.UNAUTHORIZED, () -> service.authorize(first.token(), "todo-dev"));
        assertThat(service.authorize(second.token(), "todo-dev").projectId()).isEqualTo(29);
        assertThat(service.revoke(7).active()).isFalse();
        assertError(ErrorCode.UNAUTHORIZED, () -> service.authorize(second.token(), "todo-dev"));
        verify(repository, times(3)).lockAccount(7);
        verify(repository, times(1)).insertToken(eq(7L), anyString(), any(LocalDateTime.class));
    }

    @Test
    void grantDefaultsToNoneAndUnknownMcpScopesFailClosed() {
        String testCredential = "mcp_" + "a".repeat(43);
        String hash = AccountMcpTokenService.digest(testCredential);
        assertThat(service.status(2)).isEqualTo(new AccountMcpTokenService.Status(false, null, null, java.util.List.of(), null));
        when(repository.findGrant(hash)).thenReturn(Optional.of(new AccountMcpTokenRepository.Grant(7, null)));
        assertError(ErrorCode.FORBIDDEN, () -> service.authorize(testCredential, "todo-dev"));
        when(repository.findGrant(hash)).thenReturn(Optional.of(new AccountMcpTokenRepository.Grant(7, 29L)));
        assertError(ErrorCode.FORBIDDEN, () -> service.authorize(testCredential, "another-module"));
        assertError(ErrorCode.UNAUTHORIZED, () -> service.authorize("a-website-jwt", "todo-dev"));
    }

    @Test
    void bindingCannotSelectAnothersProjectAndDeletedAccountsCannotIssue() {
        when(repository.lockAccount(7)).thenReturn(true);
        when(repository.ownsProject(7, 19)).thenReturn(true);
        assertError(ErrorCode.NOT_FOUND, () -> service.bindTodoProject(7, 88L));
        assertError(ErrorCode.UNAUTHORIZED, () -> service.rotate(101));
        verify(repository, never()).setProject(anyLong(), eq(88L));
        verify(repository, never()).insertToken(anyLong(), anyString(), any());
        service.bindTodoProject(7, 19L);
        service.bindTodoProject(7, null);
        verify(repository).setProject(7, 19L);
        verify(repository).setProject(7, null);
    }

    private static void assertError(ErrorCode expected, org.assertj.core.api.ThrowableAssert.ThrowingCallable action) {
        assertThatThrownBy(action).isInstanceOfSatisfying(BusinessException.class,
            error -> assertThat(error.getErrorCode()).isEqualTo(expected));
    }
}
