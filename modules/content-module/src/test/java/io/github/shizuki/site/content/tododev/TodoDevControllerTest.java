package io.github.shizuki.site.content.tododev;

import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import io.github.shizuki.common.web.exception.GlobalExceptionHandler;
import io.github.shizuki.site.content.mcp.AccountMcpTokenService;
import io.github.shizuki.site.content.tododev.TodoDevContract.*;
import io.github.shizuki.site.content.tododev.TodoDevCredential.Actor;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.springframework.http.MediaType;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

class TodoDevControllerTest {
    private static final String BASE = TodoDevController.PREFIX;
    private static final String TOKEN = "controller-test-only-token-1234567890";
    private final TodoDevService service = mock(TodoDevService.class);
    private final AccountMcpTokenService accountTokens = mock(AccountMcpTokenService.class);
    private final TodoDevCredential credential = new TodoDevCredential(accountTokens);
    private final Actor actor = new Actor(1, 10L, "MCP");
    private final org.springframework.test.web.servlet.MockMvc mvc = MockMvcBuilders
        .standaloneSetup(new TodoDevController(credential, service))
        .setControllerAdvice(new GlobalExceptionHandler())
        .setMessageConverters(new MappingJackson2HttpMessageConverter(
            new ObjectMapper().findAndRegisterModules().setPropertyNamingStrategy(PropertyNamingStrategies.SNAKE_CASE)))
        .build();

    @Test
    void mcpUsesSnakeCaseForProgressAndPreservesBigIntIds() throws Exception {
        when(accountTokens.authorize(TOKEN, "todo-dev")).thenReturn(new AccountMcpTokenService.ScopedGrant(1, 10));
        long id = 9_007_199_254_740_993L;
        var body = new Write(0, "request-123", "Plan update", "Write tests", Status.IN_PROGRESS, null);
        when(service.progress(actor, id, body)).thenReturn(new Context(String.valueOf(id), "10", "Example",
            "owner/repo", Stage.DESIGN, Status.IN_PROGRESS, 1, "Write tests",
            List.of("todo-dev-design"), "design", List.of(), List.of()));
        mvc.perform(post(BASE + "/" + id + "/progress")
            .header(AccountMcpTokenService.HEADER, TOKEN)
            .contentType(MediaType.APPLICATION_JSON)
            .content("""
                {"expected_version":0,"request_id":"request-123","summary":"Plan update",
                 "next_step":"Write tests","status":"IN_PROGRESS"}
                """))
            .andExpect(status().isOk())
            .andExpect(jsonPath("$.code").value("OK"))
            .andExpect(jsonPath("$.data.todo_id").value("9007199254740993"))
            .andExpect(jsonPath("$.data.next_step").value("Write tests"))
            .andExpect(jsonPath("$.data.required_artifact").value("design"));
        verify(service).progress(actor, id, body);
    }

    @Test
    void invalidCredentialAndTokenApprovalNeverReachService() throws Exception {
        when(accountTokens.authorize("wrong", "todo-dev")).thenThrow(new
            io.github.shizuki.common.core.error.BusinessException(io.github.shizuki.common.core.error.ErrorCode.UNAUTHORIZED, "Invalid"));
        mvc.perform(get(BASE + "/42").header(TodoDevCredential.RETIRED_HEADER, TOKEN))
            .andExpect(status().isUnauthorized());
        mvc.perform(get(BASE + "/42").header(AccountMcpTokenService.HEADER, TOKEN)
            .header(TodoDevCredential.RETIRED_HEADER, TOKEN)).andExpect(status().isUnauthorized());
        mvc.perform(get(BASE + "/42").header(AccountMcpTokenService.HEADER, TOKEN, TOKEN))
            .andExpect(status().isUnauthorized());
        mvc.perform(get(BASE + "/42").header(AccountMcpTokenService.HEADER, "wrong"))
            .andExpect(status().isUnauthorized());
        mvc.perform(post(BASE + "/42/approve").header(AccountMcpTokenService.HEADER, TOKEN)
            .contentType(MediaType.APPLICATION_JSON)
            .content("{\"expected_version\":0,\"request_id\":\"request-123\"}"))
            .andExpect(status().isForbidden());
        mvc.perform(post(BASE + "/42/submit").header(AccountMcpTokenService.HEADER, TOKEN)
            .contentType(MediaType.APPLICATION_JSON).content("{}"))
            .andExpect(status().isBadRequest());
        verifyNoInteractions(service);
    }
}
