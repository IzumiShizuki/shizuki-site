package io.github.shizuki.site.content.service;

import io.github.shizuki.common.core.error.BusinessException;
import io.github.shizuki.common.core.error.ErrorCode;
import io.github.shizuki.common.security.context.LoginUserContext;
import io.github.shizuki.common.security.model.LoginUser;
import io.github.shizuki.site.content.request.PostVideoProcessRequest;
import io.github.shizuki.site.content.response.PostVideoSourceResponse;
import io.github.shizuki.site.content.service.impl.PostVideoServiceImpl;
import io.github.shizuki.site.content.support.PostVideoConverterClient;
import io.github.shizuki.site.content.support.PostVideoProperties;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class PostVideoServiceImplTest {

    private PostVideoConverterClient converterClient;
    private PostVideoServiceImpl service;

    @BeforeEach
    void setUp() {
        PostVideoProperties properties = new PostVideoProperties();
        converterClient = Mockito.mock(PostVideoConverterClient.class);
        service = new PostVideoServiceImpl(converterClient, properties);
    }

    @AfterEach
    void tearDown() {
        LoginUserContext.clear();
    }

    @Test
    void shouldRejectGuestAccess() {
        PostVideoProcessRequest request = request("https://www.youtube.com/watch?v=abc");

        BusinessException exception = Assertions.assertThrows(BusinessException.class, () -> service.inspect(request));

        Assertions.assertEquals(ErrorCode.UNAUTHORIZED, exception.getErrorCode());
    }

    @Test
    void shouldRejectUserWithoutBlogWritePermission() {
        LoginUserContext.set(new LoginUser(10L, Set.of("USER"), Set.of()));
        PostVideoProcessRequest request = request("https://www.youtube.com/watch?v=abc");

        BusinessException exception = Assertions.assertThrows(BusinessException.class, () -> service.inspect(request));

        Assertions.assertEquals(ErrorCode.FORBIDDEN, exception.getErrorCode());
    }

    @Test
    void shouldRejectNonWhitelistedUrlBeforeConverterCall() {
        LoginUserContext.set(new LoginUser(10L, Set.of("USER"), Set.of("blog.post.write")));
        PostVideoProcessRequest request = request("https://example.com/video");

        BusinessException exception = Assertions.assertThrows(BusinessException.class, () -> service.inspect(request));

        Assertions.assertEquals(ErrorCode.BAD_REQUEST, exception.getErrorCode());
        Mockito.verifyNoInteractions(converterClient);
    }

    @Test
    void shouldClampMaxKeyframesAndCallConverter() {
        LoginUserContext.set(new LoginUser(10L, Set.of("USER"), Set.of("blog.post.write")));
        PostVideoProcessRequest request = request("https://www.bilibili.com/video/BV1xx411c7mD");
        request.setMaxKeyframes(100);
        Mockito.when(converterClient.inspect(request)).thenReturn(new PostVideoSourceResponse(
            request.getSourceUrl(),
            "bilibili",
            "demo",
            "up",
            60,
            "",
            List.of(),
            List.of(),
            List.of(),
            false,
            Map.of()
        ));

        PostVideoSourceResponse response = service.inspect(request);

        Assertions.assertEquals("bilibili", response.platform());
        Assertions.assertEquals(12, request.getMaxKeyframes());
        Mockito.verify(converterClient).inspect(request);
    }

    private PostVideoProcessRequest request(String sourceUrl) {
        PostVideoProcessRequest request = new PostVideoProcessRequest();
        request.setSourceUrl(sourceUrl);
        return request;
    }
}
