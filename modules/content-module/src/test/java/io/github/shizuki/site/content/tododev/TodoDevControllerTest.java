package io.github.shizuki.site.content.tododev;

import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import io.github.shizuki.common.web.exception.GlobalExceptionHandler;
import io.github.shizuki.site.content.tododev.TodoDevContract.*;
import io.github.shizuki.site.content.tododev.TodoDevCredential.Actor;
import java.util.HexFormat;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.springframework.http.MediaType;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

class TodoDevControllerTest {
    private static final String BASE = TodoDevController.PREFIX;
    private static final String TOKEN = "controller-test-only-token-1234567890";
    private final TodoDevService service = mock(TodoDevService.class);
    private final TodoDevCredential credential = new TodoDevCredential(
        HexFormat.of().formatHex(TodoDevCredential.sha256(TOKEN)), 1, 10);
    private final Actor actor = new Actor(1, 10L, "MCP");
    private final org.springframework.test.web.servlet.MockMvc mvc = MockMvcBuilders
        .standaloneSetup(new TodoDevController(credential, service))
        .setControllerAdvice(new GlobalExceptionHandler())
        .setMessageConverters(new MappingJackson2HttpMessageConverter(
            new ObjectMapper().findAndRegisterModules().setPropertyNamingStrategy(PropertyNamingStrategies.SNAKE_CASE)))
        .build();

    @Test
    void mcpUsesSnakeCaseForProgressAndPreservesBigIntIds() throws Exception {
        long id = 9_007_199_254_740_993L;
        var body = new Write(0, "request-123", "Plan update", "Write tests", Status.IN_PROGRESS, null);
        when(service.progress(actor, id, body)).thenReturn(new Context(String.valueOf(id), "10", "Example",
            "owner/repo", Stage.DESIGN, Status.IN_PROGRESS, 1, "Write tests",
            List.of("todo-dev-design"), "design", List.of()));
        mvc.perform(post(BASE + "/" + id + "/progress")
            .header(TodoDevCredential.HEADER, TOKEN)
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
        mvc.perform(get(BASE + "/42").header(TodoDevCredential.HEADER, "wrong"))
            .andExpect(status().isUnauthorized());
        mvc.perform(post(BASE + "/42/approve").header(TodoDevCredential.HEADER, TOKEN)
            .contentType(MediaType.APPLICATION_JSON)
            .content("{\"expected_version\":0,\"request_id\":\"request-123\"}"))
            .andExpect(status().isForbidden());
        mvc.perform(post(BASE + "/42/submit").header(TodoDevCredential.HEADER, TOKEN)
            .contentType(MediaType.APPLICATION_JSON).content("{}"))
            .andExpect(status().isBadRequest());
        verifyNoInteractions(service);
    }
}
