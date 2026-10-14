## Purpose

Present an ordinary companion to general visitors while keeping the existing owner-only Galgame character experience behind an intentional hidden mode, with strict separation of assets, sessions and navigation.

## ADDED Requirements

### Requirement: Ordinary companion by default
The site SHALL default to a generic cat companion for visitors and authenticated users, including ADMIN. Ordinary companion surfaces and their navigation SHALL NOT render Galgame names, character images, restricted-mode teasers, AI Hub role tabs or requests to the Meguri runtime. Its panel SHALL provide ordinary focus and music shortcuts.

#### Scenario: Fresh visitor and owner
- **WHEN** a visitor or ADMIN starts a new browser session and opens the companion
- **THEN** only the ordinary companion appears and no Meguri stage is mounted

### Requirement: Hidden owner mode
Only authenticated ADMIN SHALL be able to activate anime mode through five activations of the ordinary cat within three seconds. The gesture SHALL support pointer and keyboard button activation. Anime mode SHALL provide an explicit return-to-normal control and use the existing authenticated Meguri runtime.

#### Scenario: Visitor attempts hidden gesture
- **WHEN** a visitor or ordinary account performs the gesture
- **THEN** ordinary mode remains active and no character assets are requested

#### Scenario: Owner deliberately activates mode
- **WHEN** ADMIN performs the gesture within its time window
- **THEN** anime mode becomes active and the owner can open the Galgame companion

### Requirement: Mode lifecycle isolation
The site SHALL clear anime mode on account changes, logout or return to normal. It SHALL unmount character views on loss of mode/access. A direct AI Hub `mode=meguri` URL SHALL NOT activate the hidden mode by itself.

#### Scenario: Logout while character is open
- **WHEN** the owner logs out or changes accounts
- **THEN** character views and sprites are removed and the ordinary companion is shown

#### Scenario: Direct role URL in ordinary mode
- **WHEN** ADMIN or a visitor visits AI Hub with `mode=meguri` in ordinary mode
- **THEN** the ordinary AI Hub remains visible without mounting the character

#### Scenario: Return to normal
- **WHEN** the owner selects return to normal
- **THEN** the role stage is unmounted, the role tab disappears and ordinary companion controls return
