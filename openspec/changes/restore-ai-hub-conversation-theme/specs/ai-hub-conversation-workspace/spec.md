## Purpose

Provide a resilient AI Hub where visitors can recover from temporary service loss, enter the existing full conversation workbench, and see every workspace surface follow the active site appearance instead of an unrelated dark neutral palette.

## ADDED Requirements

### Requirement: AI Hub service failures are recoverable
The AI Hub SHALL describe unreachable AI services in clear Chinese recovery language and MUST retain a visible retry action that can reload the affected workspace without navigating away.

#### Scenario: AI Town service is unreachable
- **WHEN** the AI Town scene request fails because the service cannot be reached
- **THEN** the page explains that the AI service is temporarily unavailable and tells the visitor to retry or confirm that the backend is running
- **AND** the scene refresh action remains available

#### Scenario: AI Town service recovers
- **WHEN** the visitor retries after the AI service becomes reachable
- **THEN** the scene data replaces the error state without a full route change

### Requirement: Ordinary conversation uses the shared GPT-style workbench
The AI Hub SHALL use its existing shared session history and embedded chat workspace as the canonical ordinary-conversation experience, and MUST start that workspace in normal conversation mode.

#### Scenario: Visitor enters ordinary conversation
- **WHEN** the visitor activates “普通对话模式”
- **THEN** the AI Hub displays the shared session history beside the embedded chat workspace
- **AND** the current conversation is normal mode unless the visitor explicitly selects another allowed conversation type

#### Scenario: Ordinary conversation status is displayed
- **WHEN** ordinary conversation is active
- **THEN** the workspace identifies itself as a shared conversation workbench
- **AND** the page does not claim that AI Chat is disabled

#### Scenario: Guest enters ordinary conversation
- **WHEN** an unauthenticated visitor opens ordinary conversation
- **THEN** the shared workspace remains visible
- **AND** it clearly presents the existing login requirement instead of appearing broken

### Requirement: AI Hub surfaces follow the active appearance setting
The AI Hub SHALL derive its workspace, history rail, chat canvas, message, composer, input, and control surfaces from the active accent and theme tokens in both night and day modes, and MUST NOT fall back to unrelated dark gray or blue-gray fills when those setting tokens are available.

#### Scenario: Accent setting changes
- **WHEN** the active site accent/background setting changes
- **THEN** the large AI Hub surfaces and nested conversation surfaces visibly inherit the new accent family without reloading the route

#### Scenario: Theme mode changes
- **WHEN** the visitor switches between night and day themes
- **THEN** the AI Hub preserves readable text, boundaries, focus states, and active-state contrast while remaining in the selected accent family
