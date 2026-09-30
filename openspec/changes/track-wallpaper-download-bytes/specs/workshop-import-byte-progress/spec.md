## Purpose

Give Workshop import users a byte-based view of resource downloads so that the interface reflects content received during long transfers instead of displaying a fixed stage estimate.

## ADDED Requirements

### Requirement: Import status exposes observed download bytes
The Workshop import status resource SHALL report a non-negative `downloadedBytes` value while a resource is being downloaded and retain its final observed value after the download phase. It SHALL report `totalBytes` only when a trustworthy total size is available; unknown totals SHALL remain absent or null.

#### Scenario: Direct download has a known total size
- **WHEN** a direct Workshop response includes a valid content length and its body is being read
- **THEN** the status reports bytes consumed from the response body and the response content length as the total

#### Scenario: Direct download has no known total size
- **WHEN** a direct Workshop response has no usable content length
- **THEN** the status reports bytes consumed so far and leaves the total unknown

#### Scenario: SteamCMD download is in progress
- **WHEN** SteamCMD is downloading a Workshop item
- **THEN** the status reports the bytes of item content currently materialized in the target download directory and leaves the total unknown until a trustworthy total is available

#### Scenario: Download reaches a later import stage
- **WHEN** the resource download completes and the job moves to inspection or persistence
- **THEN** the job retains the final observed download byte count while its stage reports the current post-download work

### Requirement: Import interface presents byte-based download progress
The Workshop import interface SHALL display the observed download amount in MB while downloading. It SHALL calculate a proportional bar only when a known positive total is available; otherwise it SHALL show an indeterminate bar alongside the byte amount.

#### Scenario: Download total is known
- **WHEN** a downloading job reports both downloaded bytes and a positive total
- **THEN** the interface displays the downloaded and total MB values and sets the bar width from their bounded ratio

#### Scenario: Download total is unknown
- **WHEN** a downloading job reports downloaded bytes without a known total
- **THEN** the interface displays the downloaded MB amount and keeps the bar indeterminate without presenting a fabricated percentage

#### Scenario: Job leaves the download stage
- **WHEN** the import is inspecting, persisting, or terminal
- **THEN** the interface presents the existing stage or terminal state and does not treat the retained download amount as an active transfer percentage
