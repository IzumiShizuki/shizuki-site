package io.github.shizuki.site.media.service;

import io.github.shizuki.common.core.error.BusinessException;
import io.github.shizuki.common.security.context.LoginUserContext;
import io.github.shizuki.common.security.model.LoginUser;
import io.github.shizuki.site.media.integration.NeteaseCookieProvider;
import io.github.shizuki.site.media.integration.UserMusicGateway;
import java.util.Set;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class PlatformMusicLibraryServiceTest {
    private final NeteaseCookieProvider netease = Mockito.mock(NeteaseCookieProvider.class);
    private final UserMusicGateway users = Mockito.mock(UserMusicGateway.class);
    private final PlatformMusicLibraryService service = new PlatformMusicLibraryService(netease, users);

    @AfterEach
    void cleanup() { LoginUserContext.clear(); }

    @Test
    void shouldUseOnlyCurrentUsersCookieForLikes() {
        LoginUserContext.set(new LoginUser(7L, Set.of("USER"), Set.of()));
        Mockito.when(users.getSourceAccountCookiePlaintext(7L, "netease")).thenReturn("user-seven-cookie");
        Assertions.assertEquals(false, service.setTrackLiked("netease", "42", false).get("liked"));
        Mockito.verify(netease).setTrackLiked("42", false, "user-seven-cookie");
        Mockito.verify(users).getSourceAccountCookiePlaintext(7L, "netease");
        Mockito.verifyNoMoreInteractions(users);
    }

    @Test
    void shouldRequireBindingAndRejectUnavailableProviders() {
        LoginUserContext.set(new LoginUser(7L, Set.of("USER"), Set.of()));
        Assertions.assertThrows(BusinessException.class, () -> service.setTrackLiked("netease", "42", true));
        Assertions.assertThrows(BusinessException.class, () -> service.setTrackLiked("qq", "42", true));
        Assertions.assertThrows(BusinessException.class, () -> service.personalFm());
        Mockito.verifyNoInteractions(netease);
    }

    @Test
    void shouldNotReadAnotherUsersAccountWhenAnonymous() {
        Assertions.assertThrows(BusinessException.class, () -> service.playlistBundle("account_netease_42"));
        Mockito.verifyNoInteractions(users, netease);
    }
}
