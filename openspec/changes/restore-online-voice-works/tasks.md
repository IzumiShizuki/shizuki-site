## 1. Regression Coverage

- [x] 1.1 Add a failing test proving configured ASMR metadata requests use the proxy
- [x] 1.2 Cover authenticated proxy selection and direct-mode compatibility without exposing credentials

## 2. Backend Proxy Support

- [x] 2.1 Add optional ASMR proxy properties and environment placeholders
- [x] 2.2 Apply the proxy and proxy authenticator to both ASMR HTTP clients
- [x] 2.3 Verify and reuse the backend service's stable Docker host-gateway alias
- [x] 2.4 Add an idempotent PostgreSQL migration granting ASMR access to FRIEND and ADMIN

## 3. Verification and Deployment

- [x] 3.1 Run focused tests, the media-module suite, and the monolith package build
- [x] 3.2 Validate the OpenSpec change and review the diff for secret exposure
- [x] 3.3 Configure the protected production environment, deploy the backend, and verify authenticated voice works load online
