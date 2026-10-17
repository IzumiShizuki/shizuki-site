## Purpose

Provide stable, readable public content URLs whose first HTTP response contains meaningful content and sharing metadata, while keeping drafts, private content and link-only visibility outside public discovery and preserving existing application links.

## ADDED Requirements

### Requirement: Server-rendered public content
The system SHALL deliver readable initial HTML for published public posts, albums and moments with a unique title, description, canonical URL, Open Graph and Twitter metadata, and appropriate structured data. It SHALL retain a working link to the interactive application.

#### Scenario: Public article without JavaScript
- **WHEN** a guest requests the stable public URL of a published public article without executing scripts
- **THEN** the response contains the article heading and safely rendered body, content-specific metadata and an interactive reading link

#### Scenario: Missing or private content
- **WHEN** a guest requests a draft, deleted, private or group-restricted content URL
- **THEN** the response does not disclose its title, body or cover and uses a meaningful non-success status with noindex

### Requirement: Visibility-safe public discovery
The system SHALL provide a sitemap and robots document using one configured canonical origin. Public discovery SHALL exclude non-public and link-only records and SHALL not depend on the requesting user's identity.

#### Scenario: Public sitemap
- **WHEN** the sitemap is requested by a guest or administrator
- **THEN** it contains the same canonical public URLs, excludes drafts/private/link-only content, and covers all applicable records without an arbitrary first-page truncation

#### Scenario: Link-only direct share
- **WHEN** a visitor follows an existing link-only album or moment URL
- **THEN** the direct public reader preserves its existing access semantics and responds with noindex and private no-store headers

#### Scenario: Public preview image crawling
- **WHEN** a crawler follows a public media image referenced by a reader or its sharing metadata
- **THEN** robots rules permit the public image route while other API routes and capability-bearing queries remain disallowed, and a display variant is preferred over a thumbnail when available

### Requirement: Safe portable sharing
The application SHALL offer share/copy actions using stable public URLs for published articles, albums and moments and SHALL preserve existing hash routes for interactive navigation and desktop compatibility.

#### Scenario: Share from article
- **WHEN** a visitor shares a public article
- **THEN** native sharing or clipboard fallback receives the sanitized stable content URL without credentials, transient filters or authorization data

#### Scenario: Untrusted content in HTML
- **WHEN** article text, metadata or image addresses contain markup or executable URL schemes
- **THEN** the generated document escapes metadata and structured data, disables raw executable HTML and rejects executable resource URLs

#### Scenario: Clipboard and native sharing unavailable
- **WHEN** a visitor cannot use native sharing, clipboard APIs or the document copy fallback
- **THEN** the interface exposes a selectable sanitized stable URL, including in desktop file-protocol contexts, and a later content change cannot show a stale sharing result
