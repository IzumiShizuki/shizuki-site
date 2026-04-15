package e9;

import jc.l;
import ud.n;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class b extends r7.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f6418c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i10, int i11, int i12) {
        super(i10, i11);
        this.f6418c = i12;
    }

    @Override // r7.a
    public final void a(z7.a aVar) {
        switch (this.f6418c) {
            case 0:
                l.e(aVar, "connection");
                n.g(aVar, "CREATE TABLE IF NOT EXISTS `_new_LyricBean` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `rj` INTEGER NOT NULL, `sourceId` TEXT NOT NULL DEFAULT '', `nameBin` BLOB NOT NULL, `nameEnc` TEXT, `lyricBin` BLOB NOT NULL, `lyricEnc` TEXT, `duration` INTEGER NOT NULL, `documentUri` TEXT NOT NULL, `zipInnerPath` TEXT NOT NULL DEFAULT '')");
                n.g(aVar, "INSERT INTO `_new_LyricBean` (`id`,`rj`,`sourceId`,`nameBin`,`nameEnc`,`lyricBin`,`lyricEnc`,`duration`,`documentUri`,`zipInnerPath`) SELECT `id`,`rj`,`sourceId`,`nameBin`,`nameEnc`,`lyricBin`,`lyricEnc`,`duration`,`documentUri`,`zipInnerPath` FROM `LyricBean`");
                n.g(aVar, "DROP TABLE `LyricBean`");
                n.g(aVar, "ALTER TABLE `_new_LyricBean` RENAME TO `LyricBean`");
                n.g(aVar, "CREATE INDEX IF NOT EXISTS `index_LyricBean_rj` ON `LyricBean` (`rj`)");
                break;
            case 1:
                l.e(aVar, "connection");
                n.g(aVar, "CREATE TABLE IF NOT EXISTS `BlacklistBean` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `type` TEXT NOT NULL, `value` TEXT NOT NULL)");
                break;
            case 2:
                l.e(aVar, "connection");
                n.g(aVar, "CREATE TABLE IF NOT EXISTS `ManualLRCBean` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `rj` INTEGER NOT NULL, `name` TEXT NOT NULL, `docName` TEXT NOT NULL, `documentUri` TEXT NOT NULL)");
                break;
            default:
                l.e(aVar, "connection");
                n.g(aVar, "ALTER TABLE `ManualLRCBean` ADD COLUMN `zipInnerPath` TEXT NOT NULL DEFAULT ''");
                break;
        }
    }
}
