# LPC Victorian Town Preview — imported complete scene

This is bluecarrot16's existing **128 × 128**, 32 px tile town, downloaded from
[OpenGameArt](https://opengameart.org/content/lpc-victorian-town-decorations).
It is not a newly generated arrangement of a tileset.

- [Original complete archive](https://opengameart.org/sites/default/files/lpc-victorian-preview-see-readme.zip)
- [Original Tiled map](source/victorian-preview.tmx)
- [All original authors and credits](CREDITS.txt)
- [CC BY-SA 4.0 artwork license](CC-BY-SA-4.0.txt)
- [Original licensing statement](source/README.txt): Tiled XML data is CC0;
  images are available under CC BY-SA 4.0.

`atlas.png` is an adaptation under CC BY-SA 4.0. Three original terrain layers
and four original building layers were composited per 32 px cell and identical
cells deduplicated. The full dimensions and placement of all source cells are
retained. The source's animated objects use their initial frame in this runtime.
No generative image or layout model was used for the conversion.

The application's collision rules, spawn, resident figures, dialogue, exploration
goals and building roles are additions for gameplay; those roles are not claims
about the original map's intended building uses. Original source artwork remains
independently licensed, and no upstream author endorses this application.

`source/` includes the unmodified original TMX, TSX, README and every `CREDITS-*.txt`.
To reopen them in Tiled, obtain their referenced PNG files from the original
archive and place them alongside these files.

Reproduce the conversion with the existing Python environment and Pillow:

```text
python scripts/import-victorian-town.py --source <extracted-lpc-victorian-preview> --archive <original-zip>
```

The generated tileset manifest in `src/components/town/data/` records SHA-256
hashes of the source map and downloaded archive. The source layout is 128 × 128;
the converted atlas has 4,369 unique cells and is approximately 1.3 MB.
