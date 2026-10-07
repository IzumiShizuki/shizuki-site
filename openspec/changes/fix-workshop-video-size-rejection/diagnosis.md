# Workshop video import diagnosis — 2026-10-07

## Confirmed production evidence

- Personal-site server: `111.228.35.186`; investigation used read-only SSH/database/cache checks.
- Import job `23`, Workshop item `3813102939`, ended in `FALLBACK_REQUIRED` with `Wallpaper Engine native scene requires conversion before it can be used on this site`.
- Steam Workshop log explicitly recorded `Download item 3813102939 result : OK` and `Finished Workshop download job : No Error`.
- The downloaded project contains `preview.jpg` (187,782 bytes), `project.json` (759 bytes), and `可燃冰的和栗熏子.mp4` (242,378,122 bytes). Its manifest declares `type: video` and references the MP4 as the runtime file.
- The existing converter's `ffprobe` recognizes that real file as a 3840×2160 HEVC video with a 15.933333-second duration. This establishes a readable MP4, not browser playback compatibility.
- The normal media upload cap is 52,428,800 bytes. Directory inspection reused this cap, skipped the runtime MP4, and treated `project.json` as a native-scene marker.
- The distinct earlier item `3810220900` actually contains `scene.pkg` with manifest `type: Scene`; its native-scene conversion requirement remains valid.

No Steam credentials, account identifiers, signed CDN URLs or private configuration values are included here. No production library record or service configuration was changed.

## Deterministic reproduction

After activating `D:\environment\activate-shizuki-site.cmd`, run:

```text
mvn -B -pl modules/media-module -am -Dtest=WallpaperServiceImplTest#shouldImportDownloadedVideoAboveOrdinaryUploadLimit -Dsurefire.failIfNoSpecifiedTests=false test
```

The test calls the real directory-inspection method with only `project.json` and a four-byte runtime MP4 while reducing the ordinary upload cap to three bytes. Both runs failed with the same incorrect native-scene exception. Removing the presentation preview did not change the failure, so the size boundary and project marker are the necessary inputs.

The failing test itself takes about two seconds, requires no network/account, and becomes green only when supported downloaded media can cross the ordinary upload cap.

## Ranked predictions

1. Shared upload cap: a dedicated Workshop cap above the video size permits the MP4 to be selected.
2. Incorrect native marker: an oversized ordinary video project reports a size restriction rather than native conversion when only actual native resources trigger that classification.
3. Corrupted/incompatible file: media probing would reject the real MP4; the existing probe successfully read its video stream, excluding corruption as the demonstrated cause. Codec playback depends on the browser and is outside this import failure.
