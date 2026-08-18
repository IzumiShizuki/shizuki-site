## 1. Regression Coverage

- [x] 1.1 Add a media asset creation regression test that captures a numeric disabled home flag at the mapper boundary
- [x] 1.2 Cover numeric enabled-flag conversion and home-pool filtering behavior

## 2. Persistence Alignment

- [x] 2.1 Change the media asset entity home flag to numeric `0`/`1`
- [x] 2.2 Update asset creation, wallpaper bootstrap/import, administration, responses, and queries to use the numeric flag consistently

## 3. Verification and Delivery

- [x] 3.1 Run focused media tests, monolith tests, and the backend package build
- [x] 3.2 Validate the OpenSpec change and commit the fix
- [ ] 3.3 Deploy the rebuilt backend to `111.228.35.186` and verify an authenticated online import succeeds without the PostgreSQL type error
