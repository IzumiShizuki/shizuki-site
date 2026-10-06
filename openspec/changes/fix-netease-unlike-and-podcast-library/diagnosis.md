# Unlike failure and personal podcast contract evidence

## Ranked hypotheses before changes

1. A cloud playlist code reaches local playlist deletion and fails its database lookup.
2. A successful unlike is hidden by an immediate failing full playlist refresh.
3. NetEase rejects the upstream unlike payload.

## Reproduction and fixes

- The real media service test deleting `account_netease_5` failed with `BusinessException: Playlist not found` from `requireOwnedUserPlaylist`. A compatibility branch now validates that this code is the current user's actual cloud liked playlist and delegates to explicit platform unlike. Existing local playlist behavior is preserved.
- The music-page integration test supplied a successful account unlike and a failing subsequent cloud bundle read. It reproduced the unwanted post-write error. The acknowledged heart now removes the visible row and adjusts the count without rereading the full playlist or replacing playback; route/account generations invalidate obsolete reads.
- The installed NCM 4.32.0 proxy caches POST requests by URL and parsed cookies, ignoring JSON bodies. A live read probe sent account and subscribed-radio bodies to one `/api` URL: the second returned the cached account payload. Forcing the same radio request returned `djRadios`. All account-platform requests now send `X-APICACHE-FORCE-FETCH: true`, retaining body-only credentials.
- The live song probe confirmed that `/like` accepts literal strings `"false"` and `"true"`. Fresh likelist reads verified restoration of the original song's like. Cached acknowledgements were not accepted as verification.

## Verified podcast contracts

The official NetEase web client's [core JavaScript](https://s3.music.126.net/web/s/core_c7686f506f6f2607bb7f6cea1951f039.js) defines `program_fav-list`, `program_fav-add` and `program_fav-del` as `/api/djprogram/subscribed/paged`, `/api/djprogram/subscribe` and `/api/djprogram/unsubscribe`. These use program IDs; list rows include `mainSong` for playback. `program-like` uses a different public resource thumbs-up contract and is not the selectable favourite library.

The installed [NeteaseCloudMusicApiEnhanced](https://github.com/NeteaseCloudMusicApiEnhanced/api-enhanced) generic `/api` module supports those favourite URIs with JSON `data` and `crypto: weapi`. Detail's `program.subscribed` is the voice favourite flag; `radio.subed` represents subscribing to a whole collection.

- Favourite voices: generic `/api` with URI `/api/djprogram/subscribed/paged`, current account UID, limit and offset; response `programs`, `more`, `count`.
- Favourite writes: generic `/api` with URI `subscribe` / `unsubscribe` and `data.id` equal to program ID.
- Subscribed collections: `/dj/sublist`, `djRadios`, `hasMore`; pages use actual row count as the next offset.
- Created collections: `/user/audio` for current account UID, `djRadios`; the installed endpoint accepts no offset and explicit truncation is rejected.
- Program playback: `/dj/program`, main song ID in `trackId`, program ID in metadata. Song and program heart keys stay separate.

Before release, fresh account reads returned 0 favourite voices, 23 subscribed collections and 2 created collections. A controlled favourite/unfavourite roundtrip added one voice, confirmed its main-song payload in the favourite library, removed it, and verified the original empty favourite state was restored. No credentials or tokens were saved in this report.
