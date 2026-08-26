## Purpose

为个人站提供适合短篇生活记录的可维护发布能力，使动态预览、原位展开、图片灯箱、独立浏览和后台回收在不同可见性下保持一致且可测试。

## ADDED Requirements

### Requirement: Moments enforce a complete publication matrix
The system SHALL keep moment lifecycle and audience visibility distinct, and MUST enforce the same decision across featured previews, moment feeds, direct routes, embedded media, and administrator previews.

#### Scenario: Draft moment is preview-only
- **WHEN** a moment is a draft
- **THEN** only an authorized administrator can preview it and visitors cannot discover or open it regardless of its intended visibility

#### Scenario: Public moment is listed
- **WHEN** a moment is published with `PUBLIC` visibility
- **THEN** it can appear in its chronological feed and in a featured preview when selected

#### Scenario: Unlisted moment is direct-link only
- **WHEN** a moment is published with `UNLISTED` visibility
- **THEN** its non-enumerable direct link can resolve for a visitor while the moment remains absent from feeds, featured previews, search, feeds, and sitemap output
- **AND** the detail response instructs search engines not to index the moment

#### Scenario: Private moment is denied to visitors
- **WHEN** a moment is published with `PRIVATE` visibility
- **THEN** only an authorized administrator can retrieve its text and media

#### Scenario: Recycled moment disappears
- **WHEN** a moment is moved to the recycle state
- **THEN** visitors and normal administration listings no longer receive it until it is restored

#### Scenario: Archived moment is withdrawn
- **WHEN** a published moment is archived
- **THEN** it is removed from feeds, featured previews, direct visitor access, search, feeds, and sitemap output while remaining available in the authorized administration archive

### Requirement: Moment feeds are stable and bounded
The system SHALL return moments in a deterministic newest-first order with bounded pagination and MUST avoid duplicate or skipped visible entries as a client continues through an unchanged result set.

#### Scenario: Visitor loads the next moment page
- **WHEN** a visitor continues from a valid pagination cursor
- **THEN** the system returns the next eligible moments in stable order without repeating moments already covered by that cursor

#### Scenario: No public moments exist
- **WHEN** no moment is eligible for the requested feed or featured preview
- **THEN** the system returns an intentional empty result and the interface does not invent production content

### Requirement: Moment cards expand in place
The system SHALL let a visitor expand a moment body within its current feed context and collapse it again without forcing navigation to another page.

#### Scenario: Visitor expands a truncated moment
- **WHEN** a visitor activates the expansion control on a truncated moment card
- **THEN** the full eligible body becomes available in place and the surrounding feed position is preserved

#### Scenario: Visitor collapses an expanded moment
- **WHEN** a visitor collapses an expanded moment
- **THEN** the card returns to its compact presentation and focus remains associated with that moment

### Requirement: Moment media uses managed safe derivatives
The system MUST reuse managed photos and authorized metadata-safe derivatives, MUST preserve administrator-defined image order, and MUST NOT expose private original object locations through moment responses.

#### Scenario: Existing album photo is attached to a moment
- **WHEN** an administrator attaches an already managed photo to a moment
- **THEN** the moment reuses that photo and its eligible derivatives without duplicating the original upload

#### Scenario: Moment media is not ready
- **WHEN** a required photo derivative is pending or failed
- **THEN** the system rejects moment publication and identifies the blocking photo to the administrator

### Requirement: Moment images support an accessible dark lightbox
The system SHALL open moment images in an accessible dark lightbox with ordered previous and next navigation while continuing to enforce current media authorization.

#### Scenario: Visitor opens an image group
- **WHEN** a visitor activates an image in a published moment
- **THEN** the lightbox opens at that image, preserves the moment-defined order, and offers only navigation actions that are valid for the group

#### Scenario: Moment becomes private while open
- **WHEN** a subsequent media request occurs after the moment has been made private
- **THEN** the request is denied even if the visitor previously opened the lightbox

### Requirement: Visitors have a read-only first-phase moment experience
The system MUST reserve moment creation, editing, ordering, publication, visibility changes, deletion, and restoration for authorized administrators and MUST NOT expose visitor like, comment, or moment-authoring mutations in this phase.

#### Scenario: Visitor attempts to modify a moment
- **WHEN** a visitor or authenticated non-administrator calls a moment mutation endpoint
- **THEN** the system rejects the request without changing moment text, state, ordering, or media

#### Scenario: Visitor browses a public moment
- **WHEN** a visitor requests an eligible public moment
- **THEN** the system returns its read-only presentation without requiring a social interaction record

### Requirement: Moment deletion is recoverable and reference-aware
The system SHALL preserve a soft-deleted moment for restoration until permanent purge and MUST retain every photo still referenced by another non-purged album or moment.

#### Scenario: Administrator restores a moment
- **WHEN** an administrator restores a moment before permanent purge
- **THEN** its text, photo associations, and ordering are restored
- **AND** a moment recycled from draft returns to `DRAFT`, while one recycled from published or archived content returns to `ARCHIVED` and is not automatically republished

#### Scenario: Shared moment photo remains in use
- **WHEN** a deleted moment is purged while one of its photos remains attached to another item
- **THEN** the system removes the purged association but retains the shared photo and required derivatives
