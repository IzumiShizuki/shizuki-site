## Purpose

Give people importing Workshop wallpapers an accurate, readable view of the server-side download and processing lifecycle until the job reaches a terminal outcome.

## ADDED Requirements

### Requirement: Workshop import status exposes execution progress
The system SHALL return a bounded progress percentage and a human-readable stage for every Workshop wallpaper import job through the existing job-status resource.

#### Scenario: Queued job is reported before download starts
- **WHEN** a Workshop import task has been accepted but has not begun execution
- **THEN** its status response identifies the queued stage with a progress value below the download stage

#### Scenario: Downloading job reports active work
- **WHEN** SteamCMD is downloading a Workshop item
- **THEN** its status response identifies the download stage with a non-terminal progress value

#### Scenario: Resource processing reports post-download work
- **WHEN** the downloaded item is being inspected or persisted
- **THEN** its status response identifies the active processing stage with progress greater than the download stage and less than completion

#### Scenario: Terminal status completes progress
- **WHEN** an import job succeeds, fails, or requires a fallback
- **THEN** its status response reports 100 percent progress and retains the terminal outcome information

### Requirement: Workshop import interface renders server progress
The system SHALL render the active Workshop job's reported progress and stage in an accessible progress bar until a terminal result is returned.

#### Scenario: Active progress is visible
- **WHEN** an import job reports a non-terminal stage and percentage
- **THEN** the Workshop import interface displays the stage, percentage, and matching progress-bar value

#### Scenario: Terminal result remains understandable
- **WHEN** an import job reaches a terminal status
- **THEN** the interface displays a completed progress value with its success, failure, or fallback message
