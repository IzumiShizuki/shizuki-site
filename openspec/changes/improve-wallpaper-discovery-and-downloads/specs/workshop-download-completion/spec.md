## Purpose

Finish validated Workshop downloads promptly even when the downloader stays alive after reporting success, while preserving error handling and preventing incomplete or stale files from being imported.

## ADDED Requirements

### Requirement: Prompt verified download completion
The downloader SHALL stop waiting for process exit after it observes success for the requested item and validates the downloaded content. It MUST clean up the process and preserve permanent-error precedence.

#### Scenario: Process lingers after success
- **WHEN** the requested item is reported downloaded and validation passes while the process remains alive
- **THEN** the import proceeds without waiting for its configured timeout and the process is cleaned up.

#### Scenario: Success reports invalid content
- **WHEN** the requested item success marker is present but content fails validation
- **THEN** the import fails with a content diagnostic without spending another download attempt.

#### Scenario: Different item or authentication failure
- **WHEN** only a different item's success marker or permanent authentication failure is observed
- **THEN** the run is not accepted as a verified download for the requested item.
