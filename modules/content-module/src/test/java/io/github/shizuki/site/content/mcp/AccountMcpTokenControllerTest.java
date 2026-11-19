package io.github.shizuki.site.content.mcp;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import io.github.shizuki.common.security.context.LoginUserContext;
import io.github.shizuki.common.security.model.LoginUser;
import io.github.shizuki.common.web.exception.GlobalExceptionHandler;
import java.util.List;
import java.util.Set;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.springframework.http.MediaType;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

class AccountMcpTokenControllerTest {
    private static final String BASE = AccountMcpTokenController.PREFIX;
    private static final String PROJECT = "9007199254740993";
    private final AccountMcpTokenService service = mock(AccountMcpTokenService.class);
    private final AccountMcpTokenService.Status issuedStatus = new AccountMcpTokenService.Status(true,
        "2026-01-01T00:00:00Z", "2026-01-01T00:30:00Z", List.of("todo-dev"), PROJECT);
    private final org.springframework.test.web.servlet.MockMvc mvc = MockMvcBuilders
        .standaloneSetup(new AccountMcpTokenController(service)).setControllerAdvice(new GlobalExceptionHandler())
        .setMessageConverters(new MappingJackson2HttpMessageConverter(new ObjectMapper().findAndRegisterModules()
            .setPropertyNamingStrategy(PropertyNamingStrategies.SNAKE_CASE))).build();

    @AfterEach void resetLogin() { LoginUserContext.clear(); }

    @Test
    void statusNeverHasTokenAndIssueHasNoStore() throws Exception {
        signedIn();
        String fake = "test-credential-only";
        when(service.status(7)).thenReturn(issuedStatus);
        when(service.rotate(7)).thenReturn(new AccountMcpTokenService.Issued(issuedStatus, fake));
        mvc.perform(get(BASE)).andExpect(status().isOk())
            .andExpect(jsonPath("$.data.token").doesNotExist())
            .andExpect(jsonPath("$.data.todoProjectId").value(PROJECT))
            .andExpect(jsonPath("$.data.createdAt").value("2026-01-01T00:00:00Z"));
        mvc.perform(post(BASE + "/rotate")).andExpect(status().isOk())
            .andExpect(header().string("Cache-Control", "no-store"))
            .andExpect(jsonPath("$.data.token").value(fake));
    }

    @Test
    void exactIdRoundTripsAndMalformedRequestsNeverImplicitlyClearScope() throws Exception {
        signedIn();
        when(service.projects(7)).thenReturn(List.of(new AccountMcpTokenService.Project(PROJECT, "Example")));
        when(service.bindTodoProject(7, Long.parseLong(PROJECT))).thenReturn(issuedStatus);
        when(service.bindTodoProject(7, null)).thenReturn(issuedStatus);
        mvc.perform(get(BASE + "/scopes/todo-dev/projects")).andExpect(status().isOk())
            .andExpect(jsonPath("$.data[0].projectId").value(PROJECT));
        for (String bad : List.of("{}", "{\"projectId\":9007199254740993}", "{\"projectId\":\"9223372036854775808\"}",
                "{\"projectId\":\"0\"}", "{\"projectId\":null,\"userId\":7}")) {
            mvc.perform(put(BASE + "/scopes/todo-dev").contentType(MediaType.APPLICATION_JSON).content(bad))
                .andExpect(status().isBadRequest());
        }
        verify(service, never()).bindTodoProject(anyLong(), nullable(Long.class));
        mvc.perform(put(BASE + "/scopes/todo-dev").contentType(MediaType.APPLICATION_JSON)
            .content("{\"projectId\":\"" + PROJECT + "\"}")).andExpect(status().isOk());
        mvc.perform(put(BASE + "/scopes/todo-dev").contentType(MediaType.APPLICATION_JSON)
            .content("{\"projectId\":null}")).andExpect(status().isOk());
        verify(service).bindTodoProject(7, 9007199254740993L);
        verify(service).bindTodoProject(7, null);
    }

    @Test
    void accountManagementRejectsMissingIdentityGuestAndMcpEvenWithWebIdentity() throws Exception {
        mvc.perform(post(BASE + "/rotate")).andExpect(status().isUnauthorized());
        LoginUserContext.set(new LoginUser(7L, Set.of("GUEST_AUTHOR"), Set.of()));
        mvc.perform(delete(BASE)).andExpect(status().isUnauthorized());
        signedIn();
        mvc.perform(post(BASE + "/rotate").header(AccountMcpTokenService.HEADER, "fake"))
            .andExpect(status().isForbidden());
        mvc.perform(delete(BASE).header("X-Todo-Dev-Token", "retired"))
            .andExpect(status().isForbidden());
        verifyNoInteractions(service);
    }

    private static void signedIn() { LoginUserContext.set(new LoginUser(7L, Set.of("USER"), Set.of())); }
}
