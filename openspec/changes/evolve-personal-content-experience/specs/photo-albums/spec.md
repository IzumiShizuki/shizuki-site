## Purpose

为个人站提供可长期维护、可独立浏览且默认保护隐私的照片与相册能力，使精选预览、沉浸式画廊、后台发布、媒体派生和安全回收遵循同一套可验证规则。

## ADDED Requirements

### Requirement: Albums separate lifecycle from audience visibility
The system SHALL manage an album lifecycle independently from its audience visibility, and MUST enforce the resulting access matrix consistently across lists, featured rails, detail routes, media delivery, search, and previews.

#### Scenario: Draft album remains private
- **WHEN** an album is saved as a draft with any intended visibility
- **THEN** only an authorized administrator can preview it, and it is absent from every visitor-facing list, featured rail, search result, and detail response

#### Scenario: Published public album is discoverable
- **WHEN** an album is published with `PUBLIC` visibility
- **THEN** visitors can discover it in eligible lists and open its detail route

#### Scenario: Published unlisted album is link-only
- **WHEN** an album is published with `UNLISTED` visibility
- **THEN** a visitor with its non-enumerable link can open it, but it is excluded from lists, featured rails, search, feeds, and sitemap output
- **AND** the detail response instructs search engines not to index the album

#### Scenario: Published private album is administrator-only
- **WHEN** an album is published with `PRIVATE` visibility
- **THEN** an authorized administrator can open it and every visitor request is denied without disclosing protected album data

#### Scenario: Recycled album is unavailable
- **WHEN** an album enters the recycle state
- **THEN** it is absent from normal administration and all visitor surfaces until restored or purged

#### Scenario: Archived album is withdrawn
- **WHEN** a published album is archived
- **THEN** it is removed from visitor lists, featured rails, direct visitor access, search, feeds, and sitemap output while remaining available in the authorized administration archive

### Requirement: Albums provide ordered, reusable photo composition
The system SHALL let an authorized administrator choose a cover, attach photos, provide album-specific captions, and persist an explicit photo order without requiring duplicate uploads of the same photo.

#### Scenario: Administrator reorders an album
- **WHEN** an administrator submits a complete valid order for the photos in an album
- **THEN** subsequent admin previews and visitor responses expose exactly that order atomically

#### Scenario: Photo is reused across personal content
- **WHEN** an existing photo is attached to another album or a life moment
- **THEN** the system reuses the same managed photo and original asset instead of requiring or creating a duplicate original upload

#### Scenario: Album cover is removed
- **WHEN** the selected cover photo is detached from an album
- **THEN** the album enters a state that requires another valid cover before it can be newly published or featured

### Requirement: Photo originals remain private by default
The system MUST store original photo objects as private media and MUST NOT expose their storage bucket, object key, or durable public URL through album display responses.

#### Scenario: Visitor opens a public album
- **WHEN** a visitor opens an album containing privately stored originals
- **THEN** the album supplies authorized display derivatives and does not reveal or serve the original objects

#### Scenario: Original download is not enabled
- **WHEN** an administrator has not explicitly enabled original-download access for that album-photo association
- **THEN** no visitor-facing album response or media endpoint offers an original download

#### Scenario: Original download is explicitly enabled
- **WHEN** an administrator explicitly enables original-download access for a photo association in an otherwise visitor-accessible album
- **THEN** the system presents the privacy consequence before confirmation and subsequently grants only a time-limited, authorization-checked association-bound download rather than making the original object permanently public
- **AND** the setting does not enable original download for another album or moment that reuses the photo

### Requirement: Display media is derived and metadata-safe
The system MUST generate optimized display variants from an uploaded original, MUST remove EXIF and equivalent embedded metadata from every visitor-facing variant, and MUST reject publication while required variants are unavailable.

#### Scenario: Photo containing GPS metadata is processed
- **WHEN** an uploaded original contains GPS, device, camera, or other EXIF metadata
- **THEN** every thumbnail, display, and sanitized-download derivative contains none of that metadata

#### Scenario: Required derivative is still processing
- **WHEN** an administrator attempts to publish an album whose required photo variant is pending or failed
- **THEN** publication is rejected with the affected photo and processing status identified, while no broken album becomes visitor-visible

#### Scenario: Unsupported or deceptive image is uploaded
- **WHEN** an uploaded object cannot be safely decoded as its declared image type or exceeds configured safety limits
- **THEN** processing fails without publishing a derivative and the administrator receives a safe validation error

### Requirement: Location disclosure is explicit
The system MUST NOT publish coordinates or a location inferred from photo metadata, and SHALL expose only a location label that an administrator explicitly reviews and publishes.

#### Scenario: EXIF includes a location
- **WHEN** a new photo contains GPS coordinates but the administrator does not publish a location label
- **THEN** album responses contain no coordinates, inferred place, or location label for that photo

#### Scenario: Administrator publishes a location label
- **WHEN** an administrator explicitly saves a human-readable location label for display
- **THEN** visitor responses may show that label but still contain no source coordinates or hidden EXIF values

### Requirement: Media authorization follows current album visibility
The system MUST authorize each derivative delivery against the current content state and MUST revoke visitor access when an album or photo becomes non-public.

#### Scenario: Public album becomes private
- **WHEN** an administrator successfully changes a published public album to private
- **THEN** subsequent visitor requests to its album and association-specific media delivery no longer return content unique to that album
- **AND** a shared photo remains publicly deliverable only when another currently eligible public item independently references it

#### Scenario: Private derivative is requested anonymously
- **WHEN** an anonymous visitor requests media that is reachable only from a draft or private album
- **THEN** the request is denied and no private storage address is returned

### Requirement: Published albums support immersive Polaroid browsing
The system SHALL present album previews as a Polaroid-style stacked composition in immersive mode, SHALL provide an ordered standalone gallery, and SHALL use an accessible dark lightbox that preserves the selected photo context without switching to an unprotected original asset. Soothing mode MUST retain the same information and actions without spatial stacking or large displacement.

#### Scenario: Visitor focuses an album preview in immersive mode
- **WHEN** the effective motion mode is immersive and a visitor hovers, focuses, or activates an album preview
- **THEN** its Polaroid layers lift or separate to reveal the album identity
- **AND** activation continues from that selected card into the album experience

#### Scenario: Visitor focuses an album preview in soothing mode
- **WHEN** the effective motion mode is soothing and a visitor focuses or activates an album preview
- **THEN** the album identity and action remain clearly available through a stable or lightly fading card
- **AND** no layered tilt or large shared-element displacement is required

#### Scenario: Visitor opens and closes a photo
- **WHEN** a visitor activates a photo card and later closes the lightbox
- **THEN** the lightbox opens on that photo, supports previous and next navigation when available, and returns focus to the originating card

#### Scenario: Visitor uses keyboard navigation
- **WHEN** a lightbox has focus and the visitor uses supported escape or directional keys
- **THEN** the lightbox closes or changes photos consistently with the visible controls

### Requirement: Album deletion is recoverable and reference-aware
The system SHALL soft-delete albums and photos before permanent purge, and MUST NOT delete an original or derivative that is still referenced by non-purged personal content.

#### Scenario: Administrator restores an album
- **WHEN** an administrator restores an album before permanent purge
- **THEN** its metadata, photo order, and captions are restored without re-uploading media
- **AND** an item recycled from draft returns to `DRAFT`, while an item recycled from published or archived content returns to `ARCHIVED` and is not automatically republished

#### Scenario: Shared photo is purged from one album
- **WHEN** an album is permanently purged but one of its photos remains referenced by another album or moment
- **THEN** the shared photo and all variants required by the remaining content are retained

### Requirement: Empty album surfaces are intentional
The system MUST NOT seed fictional production albums or photos and SHALL return an intentional empty result when no eligible album has been published.

#### Scenario: No public albums exist
- **WHEN** a visitor opens an album preview or standalone album route before any eligible album is published
- **THEN** the interface presents a designed empty state and does not display demo or test photography
