package io.github.shizuki.site.user.notification;

import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import io.github.shizuki.common.security.context.LoginUserContext;
import io.github.shizuki.common.security.model.LoginUser;
import io.github.shizuki.common.web.exception.GlobalExceptionHandler;
import java.time.Instant;
import java.util.*;
import org.junit.jupiter.api.*;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

class WechatNotificationControllerTest {
    WechatNotificationService service;
    MockMvc mvc;
    static final String SECRET="abcdefghijklmnopqrstuvwxyz0123456789";
    @BeforeEach void setup() {
        service=mock(WechatNotificationService.class);
        var mapper=new ObjectMapper().findAndRegisterModules().setPropertyNamingStrategy(PropertyNamingStrategies.SNAKE_CASE);
        mvc=MockMvcBuilders.standaloneSetup(new WechatNotificationController(service),
            new AstrBotBridgeController(new WechatNotificationSettings(true,SECRET,"wechat","https://site.shizuki.online"),service))
            .setMessageConverters(new MappingJackson2HttpMessageConverter(mapper))
            .setControllerAdvice(new GlobalExceptionHandler()).build();
    }
    @AfterEach void clear() { LoginUserContext.clear(); }
    @Test void privateSettingsRequireLogin() throws Exception {
        mvc.perform(get("/api/v1/me/wechat-notifications")).andExpect(status().isUnauthorized());
        verifyNoInteractions(service);
    }
    @Test void missingOrWrongBridgeSecretCannotReachService() throws Exception {
        String body="{\"platform_ids\":[\"wechat\"]}";
        mvc.perform(post("/api/v1/integrations/astrbot/deliveries/lease").contentType("application/json").content(body))
            .andExpect(status().isUnauthorized());
        mvc.perform(post("/api/v1/integrations/astrbot/deliveries/lease").header("Authorization","Bearer wrong")
            .contentType("application/json").content(body)).andExpect(status().isUnauthorized());
        verifyNoInteractions(service);
    }
    @Test void bridgeAcceptsActualSnakeCaseContractAndNeverCachesIt() throws Exception {
        mvc.perform(post("/api/v1/integrations/astrbot/bindings/confirm").header("Authorization","Bearer "+SECRET)
            .contentType("application/json").content("""
            {"code":"single-use","sender":{"platform_id":"wechat","sender_id":"wx","origin":"wechat:FriendMessage:wx"}}
            """)).andExpect(status().isOk()).andExpect(header().string("Cache-Control","no-store"));
        verify(service).confirm(new WechatNotificationModels.Confirmation("single-use",
            new WechatNotificationModels.PrivateSender("wechat","wx","wechat:FriendMessage:wx")));
    }
    @Test void codeResponseIsOwnedByLoggedInUserAndNotCached() throws Exception {
        LoginUserContext.set(new LoginUser(7L,Set.of("FRIEND"),Set.of()));
        when(service.challenge(7L)).thenReturn(new WechatNotificationModels.Challenge("code","/shizuki_bind code",Instant.parse("2026-10-18T00:00:00Z")));
        mvc.perform(post("/api/v1/me/wechat-notifications/binding-code"))
            .andExpect(status().isOk()).andExpect(header().string("Cache-Control","no-store"))
            .andExpect(jsonPath("$.data.command").value("/shizuki_bind code"))
            .andExpect(jsonPath("$.data.expires_at").exists());
        verify(service).challenge(7L);
    }
    @Test void invalidSubscriptionsFailValidationBeforeMutation() throws Exception {
        LoginUserContext.set(new LoginUser(7L,Set.of("FRIEND"),Set.of()));
        mvc.perform(put("/api/v1/me/wechat-notifications/preferences").contentType("application/json")
            .content("{\"paused\":false,\"subscriptions\":[{\"group_code\":\"FRIEND\",\"kind\":\"PASSWORD\"}]}"))
            .andExpect(status().isBadRequest());
        mvc.perform(put("/api/v1/me/wechat-notifications/preferences").contentType("application/json")
            .content("{\"paused\":false,\"subscriptions\":[null]}"))
            .andExpect(status().isBadRequest());
        verifyNoInteractions(service);
    }
}
