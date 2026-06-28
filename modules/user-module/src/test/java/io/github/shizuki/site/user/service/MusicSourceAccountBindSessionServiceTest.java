package io.github.shizuki.site.user.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.shizuki.site.user.config.MusicNcmProperties;
import io.github.shizuki.site.user.config.MusicSourceAccountNeteaseProperties;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentMatchers;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;

@ExtendWith(MockitoExtension.class)
class MusicSourceAccountBindSessionServiceTest {

    @Mock
    private StringRedisTemplate redisTemplate;
    @Mock
    private ValueOperations<String, String> valueOperations;
    @Mock
    private MusicSourceAccountCookieVerifier cookieVerifier;
    @Mock
    private UserService userService;
    @Mock
    private NcmQrAuthClient ncmQrAuthClient;

    private final Map<String, String> redisStore = new HashMap<>();
    private MusicSourceAccountBindSessionService bindSessionService;

    @BeforeEach
    void setUp() {
        Mockito.when(redisTemplate.opsForValue()).thenReturn(valueOperations);
        Mockito.doAnswer(invocation -> {
            redisStore.put(invocation.getArgument(0), invocation.getArgument(1));
            return null;
        }).when(valueOperations).set(ArgumentMatchers.anyString(), ArgumentMatchers.anyString(), ArgumentMatchers.any(Duration.class));
        Mockito.lenient().when(valueOperations.get(ArgumentMatchers.anyString()))
            .thenAnswer(invocation -> redisStore.get(invocation.getArgument(0)));
        Mockito.when(cookieVerifier.normalizeProvider(ArgumentMatchers.anyString()))
            .thenAnswer(invocation -> String.valueOf((Object) invocation.getArgument(0)).trim().toLowerCase());

        MusicNcmProperties musicNcmProperties = new MusicNcmProperties();
        musicNcmProperties.setPollIntervalMs(900);
        musicNcmProperties.setSessionTtlSeconds(120);
        MusicSourceAccountNeteaseProperties neteaseProperties = new MusicSourceAccountNeteaseProperties();

        bindSessionService = new MusicSourceAccountBindSessionService(
            redisTemplate,
            new ObjectMapper().findAndRegisterModules(),
            cookieVerifier,
            userService,
            ncmQrAuthClient,
            musicNcmProperties,
            neteaseProperties
        );
    }

    @Test
    void shouldCreateNeteaseQrBindSession() {
        Mockito.when(ncmQrAuthClient.createQrSession()).thenReturn(
            new NcmQrAuthClient.QrCreateResult(
                "qr-key-1",
                "https://music.163.com/login?codekey=demo",
                "data:image/png;base64,abc"
            )
        );

        var response = bindSessionService.createSession(7L, "netease");

        Assertions.assertEquals("netease", response.getProvider());
        Assertions.assertEquals("PENDING", response.getStatus());
        Assertions.assertEquals("qr", response.getLoginMode());
        Assertions.assertEquals("WAIT_SCAN", response.getQrStatus());
        Assertions.assertEquals("data:image/png;base64,abc", response.getQrImage());
        Assertions.assertEquals(900, response.getPollIntervalMs());
        Assertions.assertFalse(redisStore.isEmpty());
    }

    @Test
    void shouldCompleteNeteaseQrSessionAfterAuthorization() {
        Mockito.when(ncmQrAuthClient.createQrSession()).thenReturn(
            new NcmQrAuthClient.QrCreateResult(
                "qr-key-2",
                "https://music.163.com/login?codekey=done",
                "data:image/png;base64,done"
            )
        );
        Mockito.when(ncmQrAuthClient.checkQrStatus("qr-key-2")).thenReturn(
            new NcmQrAuthClient.QrCheckResult(803, "authorized", "MUSIC_U=abc; __csrf=xyz")
        );
        Mockito.when(cookieVerifier.verify(ArgumentMatchers.eq("netease"), ArgumentMatchers.anyString()))
            .thenReturn(MusicSourceAccountCookieVerifier.VerificationResult.valid(null));

        var created = bindSessionService.createSession(7L, "netease");
        var status = bindSessionService.getSessionStatus(7L, "netease", created.getSessionId());

        Assertions.assertEquals("COMPLETED", status.getStatus());
        Assertions.assertEquals("qr", status.getLoginMode());
        Assertions.assertEquals("AUTHORIZED", status.getQrStatus());
        Mockito.verify(userService).upsertMusicSourceAccountCookie(
            ArgumentMatchers.eq(7L),
            ArgumentMatchers.eq("netease"),
            ArgumentMatchers.contains("MUSIC_U=abc")
        );
    }

    @Test
    void shouldExposeWaitConfirmStatusForNeteaseQrSession() {
        Mockito.when(ncmQrAuthClient.createQrSession()).thenReturn(
            new NcmQrAuthClient.QrCreateResult(
                "qr-key-3",
                "https://music.163.com/login?codekey=pending",
                "data:image/png;base64,pending"
            )
        );
        Mockito.when(ncmQrAuthClient.checkQrStatus("qr-key-3")).thenReturn(
            new NcmQrAuthClient.QrCheckResult(802, "", "")
        );

        var created = bindSessionService.createSession(7L, "netease");
        var status = bindSessionService.getSessionStatus(7L, "netease", created.getSessionId());

        Assertions.assertEquals("PENDING", status.getStatus());
        Assertions.assertEquals("WAIT_CONFIRM", status.getQrStatus());
        Assertions.assertTrue(String.valueOf(status.getQrMessage()).contains("确认"));
    }
}
