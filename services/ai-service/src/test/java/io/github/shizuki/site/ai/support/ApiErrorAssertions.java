package io.github.shizuki.site.ai.support;

import org.springframework.test.web.servlet.ResultMatcher;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

public final class ApiErrorAssertions {

    private ApiErrorAssertions() {
    }

    public static ResultMatcher hasProblem(int httpStatus, String code) {
        return result -> {
            MockMvcResultMatchers.status().is(httpStatus).match(result);
            MockMvcResultMatchers.jsonPath("$.status").value(httpStatus).match(result);
            MockMvcResultMatchers.jsonPath("$.code").value(code).match(result);
            MockMvcResultMatchers.jsonPath("$.detail").exists().match(result);
            MockMvcResultMatchers.jsonPath("$.instance").exists().match(result);
        };
    }
}
