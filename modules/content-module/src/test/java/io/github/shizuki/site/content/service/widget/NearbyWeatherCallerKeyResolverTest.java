package io.github.shizuki.site.content.service.widget;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Set;
import org.junit.jupiter.api.Test;
import org.springframework.mock.web.MockHttpServletRequest;

class NearbyWeatherCallerKeyResolverTest {

    @Test
    void ignoresForgeableForwardingHeadersWhenTransportPeerIsNotTrusted() {
        NearbyWeatherCallerKeyResolver resolver = resolver(Set.of());
        MockHttpServletRequest request = request("198.51.100.10");
        request.addHeader("X-Forwarded-For", "203.0.113.99");
        request.addHeader("X-Real-IP", "203.0.113.98");

        assertThat(resolver.resolve(request))
            .isEqualTo(resolver.resolve(request("198.51.100.10")))
            .isNotEqualTo(resolver.resolve(request("203.0.113.99")));
    }

    @Test
    void acceptsForwardedCallerAddressOnlyFromExplicitlyTrustedProxy() {
        NearbyWeatherCallerKeyResolver resolver = resolver(Set.of("127.0.0.1"));
        MockHttpServletRequest request = request("127.0.0.1");
        request.addHeader("X-Forwarded-For", "203.0.113.99, 127.0.0.1");

        assertThat(resolver.resolve(request))
            .isEqualTo(resolver.resolve(request("203.0.113.99")))
            .isNotEqualTo(resolver.resolve(request("127.0.0.1")));
    }

    private NearbyWeatherCallerKeyResolver resolver(Set<String> trustedProxyAddresses) {
        NearbyWeatherProperties properties = new NearbyWeatherProperties();
        properties.setCallerKeySecret("test-nearby-caller-key-secret");
        properties.setTrustedProxyAddresses(trustedProxyAddresses);
        return new NearbyWeatherCallerKeyResolver(properties);
    }

    private MockHttpServletRequest request(String remoteAddress) {
        MockHttpServletRequest request = new MockHttpServletRequest();
        request.setRemoteAddr(remoteAddress);
        return request;
    }
}
