## Context

See `proposal.md` for motivation. `AsmrMusicProvider` currently creates two JDK HTTP clients that connect directly: one backs Spring `RestClient` metadata requests, and one handles raw stream redirects. Production has an authenticated Mihomo HTTP proxy and the backend container already has a stable host-gateway alias, but ASMR-specific proxy configuration is missing.

## Goals / Non-Goals

**Goals:**

- Apply one optional proxy definition to both ASMR HTTP clients.
- Support authenticated HTTPS CONNECT without putting credentials in source control or logs.
- Preserve direct mode, source failover, timeouts, and public API behavior.
- Give the backend container a stable route to the host proxy.
- Keep FRIEND access aligned with the existing voice-library authorization policy on PostgreSQL deployments.

**Non-Goals:**

- Do not apply a JVM-wide proxy to unrelated HTTP integrations.
- Do not move ASMR calls into the browser or bypass `music.asmr.access` permission checks.
- Do not change ASMR data parsing, filtering, or persistence.

## Decisions

### Decision: Configure the proxy inside the ASMR provider

Add host, port, username, and password fields under `shizuki.music.asmr`. Both JDK HTTP clients will receive the same `ProxySelector`; an `Authenticator` will answer only proxy authentication challenges for the configured endpoint. This keeps routing scoped to ASMR traffic. A JVM-wide `HTTP_PROXY` or Java proxy property was rejected because it could unexpectedly route Spotify, Meting, storage, and other integrations.

### Decision: Preserve direct mode as the default

Proxy routing is enabled only when both a nonblank host and a valid port are configured. Local development and tests therefore retain current direct behavior without extra configuration.

### Decision: Reuse Docker's existing host-gateway alias

Production private configuration will point the ASMR proxy at the backend service's existing `host.docker.internal:host-gateway` mapping. A hard-coded bridge IP was rejected because bridge gateways can change across hosts or Compose networks.

### Decision: Keep credentials in the protected deployment environment

Only placeholder environment references belong in `application.yml`; real credentials stay in the server's protected `.env.server`. Tests assert routing configuration and authentication selection without embedding production secrets.

### Decision: Repair missing FRIEND permission with an idempotent PostgreSQL migration

The PostgreSQL runtime migration chain currently seeds `music.asmr.access` only for ADMIN, while the product policy and legacy migration grant it to FRIEND as well. Add a new versioned migration that inserts both mappings with conflict-safe update semantics. Editing an already-applied migration was rejected because it would not repair existing production databases and could invalidate Flyway checksums.

## Risks / Trade-offs

- [Authenticated Basic CONNECT may be disabled by the JDK default tunneling policy] → Enable Basic tunneling only when authenticated ASMR proxy configuration is active and verify against the real proxy during deployment.
- [The host proxy becomes a runtime dependency for voice works] → Preserve the current multi-source failover and allow proxy settings to be removed for direct rollback.
- [Proxy credentials could leak through diagnostics] → Never include credentials in exceptions, structured error details, or log arguments.

## Migration Plan

1. Deploy the backend code and Docker host-gateway mapping while proxy settings remain optional.
2. Add the existing Mihomo endpoint and credentials to the protected production `.env.server`.
3. Apply the idempotent FRIEND/ADMIN ASMR permission migration while rebuilding and recreating only the backend service.
4. Verify health, a FRIEND-authenticated voice-work request, and the absence of proxy credentials in logs.
5. Roll back proxy routing by removing the four ASMR proxy environment variables and recreating the prior backend image; retain the permission grant because it restores the documented access policy.
