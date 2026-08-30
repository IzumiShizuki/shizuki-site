package io.github.shizuki.site.content.provider;

import java.io.InputStream;
import java.net.URI;

/** Executes one bounded provider GET without allowing callers to alter the network policy. */
@FunctionalInterface
public interface ProviderHttpTransport {

    InputStream get(URI endpoint, ProviderHttpPolicy policy);
}
