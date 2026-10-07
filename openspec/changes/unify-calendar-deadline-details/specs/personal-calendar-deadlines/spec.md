## Purpose

Let users inspect their TimePrism deadlines from public content calendars and the Todo calendar without exposing personal records to other visitors.

## ADDED Requirements

### Requirement: Shared personal calendar entries
The system SHALL project visible Todos, board tasks, and schedules into a consistent calendar with local date grouping, source, project, full title, start time, deadline, detail, and completed/overdue state. Items with no valid deadline or with calendar visibility disabled MUST be omitted.

#### Scenario: Deadline and range items
- **WHEN** visible timed items and multi-day items are loaded alongside hidden or undated items
- **THEN** deadline items appear on their due date and range items appear throughout their date range, with hidden and undated items omitted

#### Scenario: Date precision
- **WHEN** a day-precision item and a minute-precision item are inspected
- **THEN** the day item shows its full date and the minute item shows its full date and time

### Requirement: Complete date details
The system SHALL let users open any date in the compact and TimePrism calendars and inspect every matching item, including overflow beyond the grid preview limit. Dates and range entries MUST be keyboard operable.

#### Scenario: Inspect a busy day
- **WHEN** a user opens a date containing more than four items or clicks a range entry
- **THEN** the detail view shows all items for that date, including full deadlines and completion state

#### Scenario: Empty date
- **WHEN** a user opens a date with no personal entries
- **THEN** the detail view explains that there are no calendar items for that date

### Requirement: Public articles and personal deadlines coexist
Blog and site introduction calendars SHALL distinguish public article counts from personal calendar markers. Opening date details MUST NOT apply an article filter; an explicit article action SHALL retain the existing public date browsing behavior.

#### Scenario: A task-only date
- **WHEN** a user opens a date containing only a personal deadline
- **THEN** its details are shown without navigating away or filtering the article list

#### Scenario: Public article action
- **WHEN** a date has public articles and the user chooses to view those articles
- **THEN** the calendar emits the existing public date selection and retains clear-filter behavior

### Requirement: Account isolation and fresh data
Calendar data SHALL refresh after local writes, on focus, and while visible to pick up changes from other clients. Personal data MUST be cleared on account transitions and stale responses MUST be ignored. Anonymous visitors SHALL read only the local guest store. Remote cache fallback MUST be scoped to the active account; private data failures MUST NOT hide the public calendar.

#### Scenario: Account changes during loading
- **WHEN** a private request finishes after logout or an account switch
- **THEN** neither its response nor a previous account cache is displayed

#### Scenario: Live Todo edit
- **WHEN** a Todo deadline, title, or completion state changes locally or is refreshed from another client
- **THEN** every open calendar and date detail updates to the current value

#### Scenario: Offline private data
- **WHEN** private loading fails
- **THEN** only the same account's cached calendar entries may be shown with a retry message, and public dates remain usable
