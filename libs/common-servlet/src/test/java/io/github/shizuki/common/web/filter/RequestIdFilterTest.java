package io.github.shizuki.common.web.filter;

import jakarta.servlet.FilterChain;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.slf4j.MDC;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpServletResponse;

class RequestIdFilterTest {

    @Test
    void shouldGenerateRequestIdAndWriteMdcDuringFilterChain() throws Exception {
        RequestIdFilter filter = new RequestIdFilter();
        MockHttpServletRequest request = new MockHttpServletRequest("GET", "/api/test");
        MockHttpServletResponse response = new MockHttpServletResponse();
        String[] seenInChain = new String[1];
        FilterChain chain = (req, res) -> seenInChain[0] = MDC.get(RequestIdFilter.MDC_REQUEST_ID);

        filter.doFilter(request, response, chain);

        String responseHeader = response.getHeader(RequestIdFilter.HEADER_REQUEST_ID);
        Assertions.assertNotNull(responseHeader);
        Assertions.assertFalse(responseHeader.isBlank());
        Assertions.assertEquals(responseHeader, seenInChain[0]);
        Assertions.assertNull(MDC.get(RequestIdFilter.MDC_REQUEST_ID));
    }

    @Test
    void shouldReuseIncomingRequestIdHeader() throws Exception {
        RequestIdFilter filter = new RequestIdFilter();
        MockHttpServletRequest request = new MockHttpServletRequest("GET", "/api/test");
        request.addHeader(RequestIdFilter.HEADER_REQUEST_ID, "req-123");
        MockHttpServletResponse response = new MockHttpServletResponse();

        filter.doFilter(request, response, (req, res) -> {
        });

        Assertions.assertEquals("req-123", response.getHeader(RequestIdFilter.HEADER_REQUEST_ID));
        Assertions.assertNull(MDC.get(RequestIdFilter.MDC_REQUEST_ID));
    }
}
