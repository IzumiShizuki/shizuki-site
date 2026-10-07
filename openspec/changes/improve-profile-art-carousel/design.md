## Context

DailyArtwork uses 4:3 and 3:4 frames with object-fit:contain. DailyArtPanel repeats six small cards in a three-column grid and stretches the character sidebar to the gallery height. The same panel serves desktop and mobile; its data and safe previews already work.

## Goals / Non-Goals

**Goals:** Large readable illustrations, complete original proportions, deliberate manual navigation, accessible desktop/touch use, and compact natural character/search cards.

**Non-Goals:** New recommendation logic, automatic advancing, third-party carousel dependencies, API changes, credential updates, or backend restarts.

## Decisions

- Introduce a focused DailyArtCarousel presentation component that receives the existing artwork list. Own only a local slide index; reset when artwork IDs change and wrap previous/next indices. Reuse DailyArtwork for original links and errors.
- Use one large illustration, a quiet bottom navigation row and numbered image selectors. Keyboard Left/Right and Home/End act only inside the focusable carousel; touch changes require at least 48px horizontal movement stronger than vertical movement and exactly one touch.
- Remove hardcoded image ratios. Ordinary previews use width:100% and height:auto; featured artwork uses intrinsic dimensions constrained by available width and 65svh/640px height. The image link shrinks around the visible image with a transparent backdrop. Cropping to a uniform cover frame was rejected because recommendations include manga with meaningful edge content.
- Keep the existing warm theme tokens: peach #F2B39D, rose #EFA0A8, ink #403843, soft surface #FFF8F5 and muted #8B7885. Inherit the body face, retain the restrained serif character name, use tabular digits for slide position. The enlarged artwork is the sole visual emphasis; no extra decorative container or animation.
- Keep the companion sidebar top-aligned and adapt it below the carousel on narrow layouts. Search cards align to their own image height. Use visible focus and minimum 44px navigation targets.

## Risks / Trade-offs

- Natural image heights vary between slides → cap featured dimensions to the viewport while retaining full content; let the containing region follow the artwork rather than padding a fixed ratio.
- Horizontal touch gestures can conflict with scrolling → require clear horizontal dominance, ignore multi-touch/cancel, keep vertical pan available.
- Source tree has an unrelated TopMenu edit → explicitly stage only carousel files and OpenSpec artifacts; build/deploy from the clean release checkout.

## Migration Plan

Run meaningful carousel interaction regressions plus existing daily-art tests, build and inspect desktop/mobile fixtures. Commit on master and push under the ongoing explicit publication request, then rebuild from the clean checkout and publish only the verified frontend artifact, retaining the previous site image and hashed assets. Backend, database and private configuration remain unchanged. Verify live navigation and complete loaded image sizing before recording delivery.
