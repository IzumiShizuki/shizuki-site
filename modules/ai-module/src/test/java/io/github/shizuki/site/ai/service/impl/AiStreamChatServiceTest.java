package io.github.shizuki.site.ai.service.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.shizuki.common.security.context.LoginUserContext;
import io.github.shizuki.common.security.model.LoginUser;
import io.github.shizuki.site.ai.config.AiChatProperties;
import io.github.shizuki.site.ai.config.AiQuotaProperties;
import io.github.shizuki.site.ai.entity.AiMessageEntity;
import io.github.shizuki.site.ai.entity.AiQuotaUsageEntity;
import io.github.shizuki.site.ai.entity.AiSessionEntity;
import io.github.shizuki.site.ai.integration.MemoryOsClient;
import io.github.shizuki.site.ai.integration.OpenAiCompatibleChatClient;
import io.github.shizuki.site.ai.integration.UserQuotaGateway;
import io.github.shizuki.site.ai.mapper.AiCharacterMapper;
import io.github.shizuki.site.ai.mapper.AiCompanionProfileMapper;
import io.github.shizuki.site.ai.mapper.AiMemoryScopeMapper;
import io.github.shizuki.site.ai.mapper.AiMessageMapper;
import io.github.shizuki.site.ai.mapper.AiQuotaUsageMapper;
import io.github.shizuki.site.ai.mapper.AiSessionMapper;
import io.github.shizuki.site.ai.mapper.AiTownAssetImportMapper;
import io.github.shizuki.site.ai.mapper.AiWorldbookEntryMapper;
import io.github.shizuki.site.ai.mapper.AiWorldbookMapper;
import io.github.shizuki.site.ai.request.SendMessageRequest;
import io.github.shizuki.site.ai.response.AiMessageSendResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.ArgumentMatchers;
import org.mockito.Mockito;

class AiStreamChatServiceTest {

    private AiQuotaUsageMapper aiQuotaUsageMapper;
    private AiSessionMapper aiSessionMapper;
    private AiMessageMapper aiMessageMapper;
    private OpenAiCompatibleChatClient aiChatClient;

    private AiServiceImpl aiService;

    @BeforeEach
    void setUp() {
        aiQuotaUsageMapper = Mockito.mock(AiQuotaUsageMapper.class);
        aiSessionMapper = Mockito.mock(AiSessionMapper.class);
        aiMessageMapper = Mockito.mock(AiMessageMapper.class);
        aiChatClient = Mockito.mock(OpenAiCompatibleChatClient.class);
        UserQuotaGateway userQuotaGateway = Mockito.mock(UserQuotaGateway.class);

        AiQuotaProperties aiQuotaProperties = new AiQuotaProperties();
        aiQuotaProperties.setCode("ai_round_total");
        aiQuotaProperties.setDefaultTotalRounds(20L);

        Mockito.when(userQuotaGateway.resolveQuota(ArgumentMatchers.anyString(), ArgumentMatchers.anySet(), ArgumentMatchers.anyLong()))
            .thenAnswer(invocation -> invocation.getArgument(2));

        aiService = new AiServiceImpl(
            aiQuotaUsageMapper,
            Mockito.mock(AiCharacterMapper.class),
            Mockito.mock(AiCompanionProfileMapper.class),
            Mockito.mock(AiMemoryScopeMapper.class),
            aiSessionMapper,
            aiMessageMapper,
            Mockito.mock(AiTownAssetImportMapper.class),
            Mockito.mock(AiWorldbookMapper.class),
            Mockito.mock(AiWorldbookEntryMapper.class),
            new AiChatProperties(),
            aiQuotaProperties,
            Mockito.mock(MemoryOsClient.class),
            aiChatClient,
            userQuotaGateway,
            new ObjectMapper()
        );
    }

    @AfterEach
    void tearDown() {
        LoginUserContext.clear();
    }

    private void mockOwnedSessionAndQuota() {
        AiSessionEntity session = new AiSessionEntity();
        session.setId(601L);
        session.setSessionId("session-stream");
        session.setUserId(9L);
        session.setTitle("stream session");
        session.setMode("normal");
        session.setBoundWorldbookJson("[]");

        AiQuotaUsageEntity usage = new AiQuotaUsageEntity();
        usage.setId(901L);
        usage.setUserId(9L);
        usage.setQuotaCode("ai_round_total");
        usage.setTotalRounds(20L);
        usage.setUsedRounds(0L);

        Mockito.when(aiSessionMapper.selectOne(ArgumentMatchers.any())).thenReturn(session);
        Mockito.when(aiQuotaUsageMapper.selectOne(ArgumentMatchers.any())).thenReturn(usage);
    }

    @Test
    void shouldStreamDeltasAndPersistAccumulatedReply() {
        LoginUserContext.set(new LoginUser(9L, Set.of("USER"), Set.of()));
        mockOwnedSessionAndQuota();

        Mockito.when(aiChatClient.isConfigured()).thenReturn(true);
        Mockito.when(aiChatClient.streamComplete(ArgumentMatchers.anyList(), ArgumentMatchers.any()))
            .thenAnswer(invocation -> {
                Consumer<String> onDelta = invocation.getArgument(1);
                onDelta.accept("你好");
                onDelta.accept("，世界");
                return "你好，世界";
            });

        SendMessageRequest request = new SendMessageRequest();
        request.setMessage("打个招呼");

        List<String> received = new ArrayList<>();
        AiMessageSendResponse response = aiService.streamMessage("session-stream", request, received::add);

        Assertions.assertEquals(List.of("你好", "，世界"), received);
        Assertions.assertEquals("你好，世界", response.assistantMessage());
        Assertions.assertEquals(19L, response.remainingRounds());

        ArgumentCaptor<AiMessageEntity> captor = ArgumentCaptor.forClass(AiMessageEntity.class);
        Mockito.verify(aiMessageMapper, Mockito.times(2)).insert(captor.capture());
        Assertions.assertEquals("user", captor.getAllValues().get(0).getRoleName());
        Assertions.assertEquals("assistant", captor.getAllValues().get(1).getRoleName());
        Assertions.assertEquals("你好，世界", captor.getAllValues().get(1).getContent());
    }

    @Test
    void shouldEmitFallbackReplyAsSingleDeltaWhenClientUnconfigured() {
        LoginUserContext.set(new LoginUser(9L, Set.of("USER"), Set.of()));
        mockOwnedSessionAndQuota();
        Mockito.when(aiChatClient.isConfigured()).thenReturn(false);

        SendMessageRequest request = new SendMessageRequest();
        request.setMessage("hello without upstream");

        List<String> received = new ArrayList<>();
        AiMessageSendResponse response = aiService.streamMessage("session-stream", request, received::add);

        Assertions.assertEquals(1, received.size());
        Assertions.assertEquals(response.assistantMessage(), received.get(0));
        Mockito.verify(aiChatClient, Mockito.never()).streamComplete(ArgumentMatchers.anyList(), ArgumentMatchers.any());
    }

    @Test
    void shouldKeepNonStreamingSendBehaviourUnchanged() {
        LoginUserContext.set(new LoginUser(9L, Set.of("USER"), Set.of()));
        mockOwnedSessionAndQuota();

        Mockito.when(aiChatClient.isConfigured()).thenReturn(true);
        Mockito.when(aiChatClient.complete(ArgumentMatchers.anyList())).thenReturn("plain reply");

        SendMessageRequest request = new SendMessageRequest();
        request.setMessage("plain send");

        AiMessageSendResponse response = aiService.sendMessage("session-stream", request);

        Assertions.assertEquals("plain reply", response.assistantMessage());
        Mockito.verify(aiChatClient).complete(ArgumentMatchers.anyList());
        Mockito.verify(aiChatClient, Mockito.never()).streamComplete(ArgumentMatchers.anyList(), ArgumentMatchers.any());
    }
}
