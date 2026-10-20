## 1. Domain and persistence

- [x] 1.1 Add PostgreSQL and MySQL migrations for contact bindings and challenges.
- [x] 1.2 Add request/response models and a service with hashing, expiry, ownership and capability validation.
- [x] 1.3 Add authenticated website endpoints and bridge confirmation endpoint.

## 2. Frontend

- [x] 2.1 Add shared contact-binding API client and panel.
- [x] 2.2 Mount the panel in desktop and mobile personal settings.
- [x] 2.3 Add focused component/API tests for empty, unavailable, bound, challenge and unbind states.

## 3. Verification

- [x] 3.1 Add backend tests for challenge replay, origin validation, duplicate identity and capability updates.
- [x] 3.2 Run affected Java tests and frontend tests/build.
- [x] 3.3 Run strict OpenSpec validation and create a local commit.

Follow-up integration: Todo command authorization and reminder fan-out must consume the `todo_edit_enabled` / `todo_notify_enabled` bindings before these switches affect bot behavior.
