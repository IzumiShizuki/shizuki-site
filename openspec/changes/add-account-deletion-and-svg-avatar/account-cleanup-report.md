# navidias account cleanup

- Date: 2026-10-24 (Asia/Shanghai).
- Personal server: `111.228.35.186`; database `shizuki_app`; active account schema `shizuki_app` verified against the backend's configured search path.
- Identified one exact active nickname match, user ID `20`, group `USER`. No matching account in the separate `public` account table.
- Executed guarded transaction with a second identity check under an account table lock. Anonymized the account and cleared email, password, avatar, groups and permissions; retained the ID for historical references.
- Removed OAuth bindings/transactions, provider secrets, preferences and available daily-art/contact/notification account data from the effective application search path.
- Revoked the one indexed refresh session before database commit. Afterwards the refresh index contains zero sessions and no active account matches ID `20` or nickname/username `navidias`.
- Existing access tokens can no longer resolve an active account through the application's account-backed introspection. Sa-Token access state is held in application memory, so this maintenance operation relies on the deleted-account guard rather than restarting the server.
- Kept all other accounts and historical business content. No application deployment, Git push, or other server changes were performed.

No credentials, email address, token values, or identity-binding payloads are included in this report.
