package e9;

import f9.f;
import jc.l;
import q.t0;
import ud.n;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class c extends r7.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f6419c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final f f6420d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(int i10) {
        super(11, 12);
        this.f6419c = i10;
        switch (i10) {
            case 1:
                super(3, 4);
                this.f6420d = new f(2);
                break;
            case 2:
                super(5, 6);
                this.f6420d = new f(3);
                break;
            case 3:
                super(7, 8);
                this.f6420d = new f(4);
                break;
            case 4:
                super(8, 9);
                this.f6420d = new f(5);
                break;
            case 5:
                super(9, 10);
                this.f6420d = new f(6);
                break;
            default:
                this.f6420d = new f(1);
                break;
        }
    }

    @Override // r7.a
    public final void a(z7.a aVar) {
        switch (this.f6419c) {
            case 0:
                l.e(aVar, "connection");
                t0.b(this.f6420d, aVar);
                break;
            case 1:
                l.e(aVar, "connection");
                n.g(aVar, "ALTER TABLE `HistoryBean` ADD COLUMN `nsfw` INTEGER NOT NULL DEFAULT 1");
                n.g(aVar, "ALTER TABLE `HistoryBean` ADD COLUMN `has_subtitle` INTEGER NOT NULL DEFAULT 0");
                n.g(aVar, "ALTER TABLE `DownloadBean` ADD COLUMN `nsfw` INTEGER NOT NULL DEFAULT 1");
                n.g(aVar, "ALTER TABLE `DownloadBean` ADD COLUMN `has_subtitle` INTEGER NOT NULL DEFAULT 0");
                t0.b(this.f6420d, aVar);
                break;
            case 2:
                l.e(aVar, "connection");
                n.g(aVar, "CREATE TABLE IF NOT EXISTS `AccountBean` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `server` TEXT NOT NULL, `username` TEXT NOT NULL, `password` TEXT NOT NULL, `token` TEXT NOT NULL, `timestamp` INTEGER NOT NULL)");
                t0.b(this.f6420d, aVar);
                break;
            case 3:
                l.e(aVar, "connection");
                n.g(aVar, "CREATE TABLE IF NOT EXISTS `LyricBean` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `rj` INTEGER NOT NULL, `nameBin` BLOB NOT NULL, `lyricBin` BLOB NOT NULL, `duration` INTEGER NOT NULL, `documentUri` TEXT NOT NULL, `zipInnerPath` TEXT NOT NULL DEFAULT '')");
                t0.b(this.f6420d, aVar);
                break;
            case 4:
                l.e(aVar, "connection");
                n.g(aVar, "ALTER TABLE `LyricBean` ADD COLUMN `nameEnc` TEXT DEFAULT NULL");
                n.g(aVar, "ALTER TABLE `LyricBean` ADD COLUMN `lyricEnc` TEXT DEFAULT NULL");
                t0.b(this.f6420d, aVar);
                break;
            default:
                l.e(aVar, "connection");
                n.g(aVar, "ALTER TABLE `HistoryBean` ADD COLUMN `sourceId` TEXT NOT NULL DEFAULT ''");
                n.g(aVar, "ALTER TABLE `HistoryBean` ADD COLUMN `workJson` TEXT NOT NULL DEFAULT ''");
                n.g(aVar, "ALTER TABLE `DownloadBean` ADD COLUMN `sourceId` TEXT NOT NULL DEFAULT ''");
                n.g(aVar, "ALTER TABLE `DownloadBean` ADD COLUMN `workJson` TEXT NOT NULL DEFAULT ''");
                n.g(aVar, "ALTER TABLE `ManualLRCBean` ADD COLUMN `sourceId` TEXT NOT NULL DEFAULT ''");
                n.g(aVar, "ALTER TABLE `LyricBean` ADD COLUMN `sourceId` TEXT NOT NULL DEFAULT ''");
                t0.b(this.f6420d, aVar);
                break;
        }
    }
}
