package io.github.shizuki.common.security.filter;

import io.github.shizuki.common.security.context.LoginUserContext;
import io.github.shizuki.common.security.model.LoginUser;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.web.filter.OncePerRequestFilter;

@Component
public class LoginUserContextFilter extends OncePerRequestFilter {

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
        throws ServletException, IOException {
        String userIdHeader = request.getHeader("X-User-Id");
        try {
            if (StringUtils.hasText(userIdHeader)) {
                Long userId = Long.parseLong(userIdHeader);
                Set<String> groups = splitHeader(request.getHeader("X-User-Groups"));
                Set<String> permissions = splitHeader(request.getHeader("X-User-Permissions"));
                LoginUserContext.set(new LoginUser(userId, groups, permissions));
            }
            filterChain.doFilter(request, response);
        } finally {
            LoginUserContext.clear();
        }
    }

    private Set<String> splitHeader(String raw) {
        if (!StringUtils.hasText(raw)) {
            return Set.of();
        }
        return Arrays.stream(raw.split(","))
            .map(String::trim)
            .filter(StringUtils::hasText)
            .collect(Collectors.toSet());
    }
}
