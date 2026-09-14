## Purpose

Present the account entry flows (login, register, forgot password, OAuth) as a cute, kawaii personal-site page and let the site owner customize the page background image, mascot image, and theme preset for the current browser.

## ADDED Requirements

### Requirement: Cute entry presentation
The account entry page SHALL render the login, register, and forgot-password forms in a rounded, pastel personal-site style with a mascot area, pill tabs/buttons, rounded inputs, and floating decorative elements, without changing the form fields or submission behavior.

#### Scenario: The entry page opens
- **WHEN** a visitor opens the account entry page
- **THEN** the page SHALL show the pastel gradient scene, the mascot, the three account tabs, and the active form, all styled consistently and interactively

### Requirement: Owner customization of images and theme
The entry page SHALL expose a customization panel where the owner can choose a theme preset, set a background image, and set a mascot image by URL or by uploading a local image, and SHALL persist those choices in the current browser so they reappear on later visits.

#### Scenario: The owner applies a preset
- **WHEN** the owner picks a theme preset in the customization panel
- **THEN** the page background and accent colors SHALL update immediately and the choice SHALL be restored on the next visit in the same browser

#### Scenario: The owner sets images
- **WHEN** the owner provides a background image and a mascot image by URL or upload
- **THEN** the page background SHALL show the background image and the mascot area SHALL show the mascot image, and both SHALL be restored on later visits

#### Scenario: The owner restores defaults
- **WHEN** the owner resets the customization
- **THEN** the default pastel theme and the default CSS mascot SHALL be restored
