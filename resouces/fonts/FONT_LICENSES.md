# Font Assets Used by Frontend

The current workspace cannot fetch external font files directly.  
To keep delivery unblocked, font binaries were copied from local system font cache and versioned into this repository.

## Bundled font files

- `Roboto-Regular.ttf`
- `NotoSansJP-VF.ttf`
- `NotoSansSC-VF.ttf`

## Runtime placement

- Source archive: `resouces/fonts/`
- Frontend runtime files: `fronted/vue3-merged/public/fonts/`

## Upstream families and typical licenses

- Roboto: Apache License 2.0
- Noto Sans JP / Noto Sans SC: SIL Open Font License 1.1

## Notes

- CSS variables still reserve `Zen Maru Gothic` as primary display family for future drop-in replacement.
- If exact `Zen Maru Gothic` / cute-family assets are provided later, replace files in both directories and keep variable names unchanged.
