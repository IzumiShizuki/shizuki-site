## Purpose

Make Workshop import failures understandable and recoverable, while respecting Steam authentication, content ownership and real downloader availability.

## ADDED Requirements

### Requirement: Classify downloader failures without exposing credentials
The import job SHALL distinguish timeout, transient network failure, account authentication or Steam Guard failure, content permission failure, unavailable downloader and invalid or missing downloaded content where evidence permits. Unknown failures SHALL remain explicit unknown failures. Public responses and stored diagnostics SHALL NOT expose credentials or raw authentication output.

#### Scenario: Authentication rejected
- **WHEN** the downloader reports invalid login or Steam Guard authorization
- **THEN** the job provides a safe account authorization explanation rather than a generic download failure

#### Scenario: Downloader timeout
- **WHEN** a download exceeds its allowed execution time
- **THEN** the job reports timeout as the cause and preserves observed byte progress without reporting successful completion

### Requirement: Retry recoverable failures within a bounded budget
The system SHALL provide bounded automatic retries for identified transient downloader failures and SHALL allow an authenticated user to explicitly retry a failed import. Permanent authentication and ownership failures SHALL NOT enter an automatic retry loop.

#### Scenario: Transient failure recovers
- **WHEN** the first download attempt reports a transient network error and the next attempt produces valid content
- **THEN** the same import completes without requiring a local package upload

#### Scenario: Retry budget exhausted
- **WHEN** transient failures exhaust the retry budget
- **THEN** the job reaches an actionable failure state offering retry and optional local import with a truthful reason

#### Scenario: User retries a failed item
- **WHEN** the user invokes retry for the selected failed item
- **THEN** the system starts or attaches to its legitimate authenticated import flow without duplicating imported wallpapers

### Requirement: Channel readiness and job outcome remain truthful
The interface SHALL describe SteamCMD configuration readiness separately from confirmed download success. A failed or fallback-required job SHALL NOT display a successful 100 percent download bar, and SHALL keep retry and local import discoverable.

#### Scenario: Configured downloader fails at runtime
- **WHEN** a configured SteamCMD channel later fails
- **THEN** the inspector shows the observed failure and available next actions without claiming guaranteed import availability or completion
