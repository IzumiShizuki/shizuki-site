## 1. Regression Coverage

- [x] 1.1 Add an abort-aware authentication API test proving a response after six seconds succeeds.
- [x] 1.2 Add a bounded-failure assertion proving requests beyond the authentication deadline still surface the existing `TIMEOUT` contract.

## 2. Client Fix

- [x] 2.1 Raise the shared authentication request budget from five seconds to fifteen seconds without adding automatic token retries.
- [x] 2.2 Run the focused authentication and HTTP-client tests and confirm the delayed-success regression passes.

## 3. Delivery Verification

- [x] 3.1 Run the frontend production build and strict OpenSpec validation.
- [x] 3.2 Commit only the authentication fix, its tests, and this change's OpenSpec artifacts without disturbing unrelated worktree changes.
- [x] 3.3 Push and deploy the verified frontend update, then confirm public authentication latency, backend health, and site availability.
