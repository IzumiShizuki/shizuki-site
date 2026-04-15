package d9;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class d extends n7.d {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f5555p;

    public /* synthetic */ d(int i10) {
        this.f5555p = i10;
    }

    @Override // n7.d
    public final void b(z7.c cVar, Object obj) {
        switch (this.f5555p) {
            case 0:
                jc.l.e(cVar, "statement");
                jc.l.e((c9.a) obj, "entity");
                cVar.c(1, r8.f3766a);
                break;
            case 1:
                c9.a aVar = (c9.a) obj;
                jc.l.e(cVar, "statement");
                jc.l.e(aVar, "entity");
                long j10 = aVar.f3766a;
                cVar.c(1, j10);
                cVar.v(2, aVar.f3767b);
                cVar.v(3, aVar.f3768c);
                cVar.v(4, aVar.f3769d);
                cVar.v(5, aVar.f3770e);
                cVar.c(6, aVar.f3771f);
                cVar.c(7, j10);
                break;
            case 2:
                jc.l.e(cVar, "statement");
                jc.l.e((c9.b) obj, "entity");
                cVar.c(1, r8.f3772a);
                break;
            case 3:
                c9.c cVar2 = (c9.c) obj;
                jc.l.e(cVar, "statement");
                jc.l.e(cVar2, "entity");
                long j11 = cVar2.f3775a;
                cVar.c(1, j11);
                cVar.c(2, cVar2.f3776b);
                cVar.c(3, cVar2.f3777c);
                cVar.v(4, cVar2.f3778d);
                cVar.v(5, cVar2.f3779e);
                cVar.v(6, cVar2.f3780f);
                cVar.v(7, cVar2.f3781g);
                cVar.v(8, cVar2.f3782h);
                cVar.c(9, cVar2.f3783i ? 1L : 0L);
                cVar.c(10, cVar2.f3784j ? 1L : 0L);
                cVar.v(11, cVar2.f3785k);
                cVar.v(12, cVar2.f3786l);
                cVar.v(13, cVar2.f3787m);
                cVar.c(14, j11);
                break;
            case 4:
                c9.d dVar = (c9.d) obj;
                jc.l.e(cVar, "statement");
                jc.l.e(dVar, "entity");
                long j12 = dVar.f3788a;
                cVar.c(1, j12);
                cVar.c(2, dVar.f3789b);
                cVar.c(3, dVar.f3790c);
                cVar.v(4, dVar.f3791d);
                cVar.v(5, dVar.f3792e);
                cVar.v(6, dVar.f3793f);
                cVar.v(7, dVar.f3794g);
                cVar.v(8, dVar.f3795h);
                cVar.c(9, dVar.f3796i ? 1L : 0L);
                cVar.c(10, dVar.f3797j ? 1L : 0L);
                cVar.v(11, dVar.f3798k);
                cVar.v(12, dVar.f3799l);
                cVar.v(13, dVar.f3800m);
                cVar.c(14, j12);
                break;
            case 5:
                jc.l.e(cVar, "statement");
                jc.l.e((c9.f) obj, "entity");
                cVar.c(1, r8.f3803a);
                break;
            case 6:
                c9.f fVar = (c9.f) obj;
                jc.l.e(cVar, "statement");
                jc.l.e(fVar, "entity");
                long j13 = fVar.f3803a;
                cVar.c(1, j13);
                cVar.c(2, fVar.f3804b);
                cVar.v(3, fVar.f3805c);
                cVar.d(fVar.f3806d, 4);
                String str = fVar.f3807e;
                if (str == null) {
                    cVar.e(5);
                } else {
                    cVar.v(5, str);
                }
                cVar.d(fVar.f3808f, 6);
                String str2 = fVar.f3809g;
                if (str2 == null) {
                    cVar.e(7);
                } else {
                    cVar.v(7, str2);
                }
                cVar.c(8, fVar.f3810h);
                cVar.v(9, fVar.f3811i);
                cVar.v(10, fVar.f3812j);
                cVar.c(11, j13);
                break;
            case 7:
                c9.g gVar = (c9.g) obj;
                jc.l.e(cVar, "statement");
                jc.l.e(gVar, "entity");
                long j14 = gVar.f3815a;
                cVar.c(1, j14);
                cVar.c(2, gVar.f3816b);
                cVar.v(3, gVar.f3817c);
                cVar.v(4, gVar.f3818d);
                cVar.v(5, gVar.f3819e);
                cVar.v(6, gVar.f3820f);
                cVar.v(7, gVar.f3821g);
                cVar.c(8, j14);
                break;
            default:
                c9.h hVar = (c9.h) obj;
                jc.l.e(cVar, "statement");
                jc.l.e(hVar, "entity");
                long j15 = hVar.f3822a;
                cVar.c(1, j15);
                cVar.c(2, hVar.f3823b);
                cVar.v(3, hVar.f3824c);
                cVar.c(4, j15);
                break;
        }
    }

    @Override // n7.d
    public final String k() {
        switch (this.f5555p) {
            case 0:
                return "DELETE FROM `AccountBean` WHERE `id` = ?";
            case 1:
                return "UPDATE OR ABORT `AccountBean` SET `id` = ?,`server` = ?,`username` = ?,`password` = ?,`token` = ?,`timestamp` = ? WHERE `id` = ?";
            case 2:
                return "DELETE FROM `BlacklistBean` WHERE `id` = ?";
            case 3:
                return "UPDATE OR ABORT `DownloadBean` SET `id` = ?,`timestamp` = ?,`rj` = ?,`sourceId` = ?,`releaseTime` = ?,`tags` = ?,`vas` = ?,`circle` = ?,`nsfw` = ?,`has_subtitle` = ?,`icon` = ?,`name` = ?,`workJson` = ? WHERE `id` = ?";
            case 4:
                return "UPDATE OR ABORT `HistoryBean` SET `id` = ?,`timestamp` = ?,`rj` = ?,`sourceId` = ?,`releaseTime` = ?,`tags` = ?,`vas` = ?,`circle` = ?,`nsfw` = ?,`has_subtitle` = ?,`icon` = ?,`name` = ?,`workJson` = ? WHERE `id` = ?";
            case 5:
                return "DELETE FROM `LyricBean` WHERE `id` = ?";
            case 6:
                return "UPDATE OR ABORT `LyricBean` SET `id` = ?,`rj` = ?,`sourceId` = ?,`nameBin` = ?,`nameEnc` = ?,`lyricBin` = ?,`lyricEnc` = ?,`duration` = ?,`documentUri` = ?,`zipInnerPath` = ? WHERE `id` = ?";
            case 7:
                return "UPDATE OR ABORT `ManualLRCBean` SET `id` = ?,`rj` = ?,`sourceId` = ?,`name` = ?,`docName` = ?,`documentUri` = ?,`zipInnerPath` = ? WHERE `id` = ?";
            default:
                return "UPDATE OR ABORT `SearchHistoryBean` SET `id` = ?,`timestamp` = ?,`content` = ? WHERE `id` = ?";
        }
    }
}
