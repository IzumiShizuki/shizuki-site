## Purpose

Give visitors a fast, discoverable way to tune the site's color mood from the existing atmosphere panel while keeping one synchronized source of truth with the full appearance settings.

## ADDED Requirements

### Requirement: Atmosphere panel exposes a color shortcut
The atmosphere panel SHALL include a clearly labeled color destination alongside its existing scene, sound, effect, and music destinations. The color destination SHALL expose the current color mode, seed selection, day/night mode, and palette personality with an immediate visual preview.

#### Scenario: Color destination is opened
- **WHEN** a visitor selects the color destination in the atmosphere panel
- **THEN** the panel shows the active color mood and controls without closing the panel or navigating away from the current route

#### Scenario: Color control is changed
- **WHEN** a visitor changes a color preset, accent mode, day/night mode, or palette personality in the atmosphere panel
- **THEN** the site and the panel preview update immediately using the same persisted appearance state

### Requirement: Atmosphere and appearance controls stay synchronized
The atmosphere color destination and the full appearance settings SHALL read from and write to the same preference state. Changes made in either location SHALL be observable in the other without requiring a reload or duplicate migration path.

#### Scenario: Full appearance setting changes first
- **WHEN** a visitor changes colors in the full appearance settings and later opens the atmosphere color destination
- **THEN** the atmosphere controls and preview reflect the current saved selection

#### Scenario: Atmosphere shortcut changes first
- **WHEN** a visitor changes colors in the atmosphere panel and later opens the full appearance settings
- **THEN** the full settings reflect the same selection and allow further customization

### Requirement: Color shortcut remains accessible and responsive
The color destination SHALL use native controls or equivalent keyboard semantics, visible focus treatment, descriptive labels, and a layout that remains usable within the atmosphere panel at mobile and desktop widths.

#### Scenario: Visitor uses keyboard navigation
- **WHEN** a visitor operates the color destination with a keyboard
- **THEN** each control is reachable, its selected state is exposed, and focus remains visible

#### Scenario: Atmosphere panel is narrow
- **WHEN** the color destination is displayed in a narrow panel or mobile viewport
- **THEN** controls reflow without clipping, horizontal page overflow, or loss of labels
