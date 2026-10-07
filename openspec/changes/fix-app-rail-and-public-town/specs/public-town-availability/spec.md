## Purpose

Allow visitors to browse the existing public town scenes reliably in the local development environment, with stable compact layout, useful failure feedback and a working retry path, while keeping administrative operations restricted.

## ADDED Requirements

### Requirement: Reachable public scene requests
The development frontend SHALL request the personal website backend through a working development gateway without requiring an unrelated inactive local service. Public scene listing, map and scene details SHALL remain available to unauthenticated visitors when that backend is reachable.

#### Scenario: Guest enters public roam
- **WHEN** a guest opens the town workspace with the personal website backend available
- **THEN** the scene list, map and selected scene details load successfully
- **AND** no service-unreachable banner appears

### Requirement: Compact town workspace
The town workspace SHALL keep its mode switch and scene heading at the top, followed by the map and destination list, without distributing excess viewport height into headings or intermediate blank regions.

#### Scenario: Tall viewport
- **WHEN** the town page appears in a tall viewport
- **THEN** its toolbar and scene heading retain their content height
- **AND** map and scene details follow with consistent section gaps

### Requirement: Recoverable scene failure
The town workspace SHALL retain previously loaded map data when a scene detail request fails, report a useful error, and allow retry. A subsequent successful load SHALL clear that error and display the requested scene. Failed requests SHALL NOT make a previously selected scene appear as a newly loaded destination.

#### Scenario: Detail fails then recovers
- **WHEN** a visitor selects a destination whose detail request fails and retries after service recovery
- **THEN** the failure is shown without an unhandled rejection
- **AND** the successful retry updates the selection and clears the failure feedback

#### Scenario: Partial initial failure
- **WHEN** the map request fails but the scene list remains available
- **THEN** the scene list remains usable and the visitor can retry the map
