package io.github.shizuki.site.user.config;

import io.github.shizuki.common.oauth.config.OAuthProviderProperties;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentMatchers;
import org.mockito.Mockito;
import org.springframework.boot.DefaultApplicationArguments;

class OAuthPreheatRunnerTest {

    @Test
    @SuppressWarnings("unchecked")
    void shouldPreheatConfiguredProviderEndpoints() throws Exception {
        OAuthProviderProperties properties = new OAuthProviderProperties();
        OAuthProviderProperties.ProviderProperties github = new OAuthProviderProperties.ProviderProperties();
        github.setTokenUrl("https://github.com/login/oauth/access_token");
        github.setUserApiUrl("https://api.github.com/user");
        properties.setProviders(Map.of("github", github));

        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse<Void> response = Mockito.mock(HttpResponse.class);
        Mockito.when(response.statusCode()).thenReturn(401);
        Mockito.when(httpClient.send(
                ArgumentMatchers.any(HttpRequest.class),
                ArgumentMatchers.<HttpResponse.BodyHandler<Void>>any())
        ).thenReturn(response);

        OAuthPreheatRunner.DnsResolver dnsResolver = Mockito.mock(OAuthPreheatRunner.DnsResolver.class);
        OAuthPreheatRunner runner = new OAuthPreheatRunner(properties, httpClient, dnsResolver);

        runner.run(new DefaultApplicationArguments(new String[0]));

        Mockito.verify(dnsResolver).resolve("github.com");
        Mockito.verify(dnsResolver).resolve("api.github.com");
        Mockito.verify(httpClient, Mockito.times(2)).send(
            ArgumentMatchers.any(HttpRequest.class),
            ArgumentMatchers.<HttpResponse.BodyHandler<Void>>any()
        );
    }

    @Test
    void shouldContinueWhenDnsResolveFails() throws Exception {
        OAuthProviderProperties properties = new OAuthProviderProperties();
        OAuthProviderProperties.ProviderProperties github = new OAuthProviderProperties.ProviderProperties();
        github.setTokenUrl("https://github.com/login/oauth/access_token");
        github.setUserApiUrl("https://api.github.com/user");
        properties.setProviders(Map.of("github", github));

        HttpClient httpClient = Mockito.mock(HttpClient.class);
        OAuthPreheatRunner.DnsResolver dnsResolver = Mockito.mock(OAuthPreheatRunner.DnsResolver.class);
        Mockito.doThrow(new RuntimeException("dns timeout")).when(dnsResolver).resolve(Mockito.anyString());

        OAuthPreheatRunner runner = new OAuthPreheatRunner(properties, httpClient, dnsResolver);

        Assertions.assertDoesNotThrow(() -> runner.run(new DefaultApplicationArguments(new String[0])));
        Mockito.verify(httpClient, Mockito.never()).send(
            ArgumentMatchers.any(HttpRequest.class),
            ArgumentMatchers.<HttpResponse.BodyHandler<Void>>any()
        );
    }

    @Test
    void shouldSkipWhenNoProvidersConfigured() {
        OAuthProviderProperties properties = new OAuthProviderProperties();
        properties.setProviders(Map.of());
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        OAuthPreheatRunner.DnsResolver dnsResolver = Mockito.mock(OAuthPreheatRunner.DnsResolver.class);

        OAuthPreheatRunner runner = new OAuthPreheatRunner(properties, httpClient, dnsResolver);

        Assertions.assertDoesNotThrow(() -> runner.run(new DefaultApplicationArguments(new String[0])));
        Mockito.verifyNoInteractions(dnsResolver);
        Mockito.verifyNoInteractions(httpClient);
    }
}
