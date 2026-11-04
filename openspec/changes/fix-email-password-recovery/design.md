## Context

Desktop and mobile already submit the same password reset request. The account settings endpoint already checks ownership and consumes a password reset code.

## Goals / Non-Goals

Restore both entry points with the existing email verification and password validation.

## Decisions

- Add the single reset path to the gateway public list in both monolith configurations. This matches the existing public verification endpoints and keeps the authenticated password endpoint protected.
- Display the profile email as read-only and use the loaded account email for code delivery and submission. Accounts without an email can open the existing email binding section from the password panel.

## Risks / Trade-offs

The public endpoint can be called without an access token. A matching, unexpired code for the requested email and valid new passwords are required before any credential update.

## Migration Plan

Build the frontend against the deployed main-site revision and layer its entry and bundles onto the running image. The running backend includes a separate DJ overlay. Update only the gateway configuration in that image's application JAR and verify the other JAR entries. Retain both previous images for rollback and check the public reset and protected password endpoints after activation.
