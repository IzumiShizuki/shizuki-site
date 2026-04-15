package d9;

import java.util.ArrayList;
import ub.a0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class l implements ic.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5577a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f5578b;

    public /* synthetic */ l(long j10, int i10) {
        this.f5577a = i10;
        this.f5578b = j10;
    }

    @Override // ic.k
    public final Object a(Object obj) throws Exception {
        z7.c cVarD0;
        c9.c cVar;
        c9.d dVar;
        int i10 = this.f5577a;
        long j10 = this.f5578b;
        switch (i10) {
            case 0:
                z7.a aVar = (z7.a) obj;
                jc.l.e(aVar, "_connection");
                cVarD0 = aVar.d0("DELETE FROM DownloadBean WHERE rj=(?)");
                try {
                    cVarD0.c(1, j10);
                    cVarD0.Z();
                    cVarD0.close();
                    return a0.f21526a;
                } finally {
                }
            case 1:
                z7.a aVar2 = (z7.a) obj;
                jc.l.e(aVar2, "_connection");
                cVarD0 = aVar2.d0("SELECT * FROM DownloadBean WHERE rj=(?)");
                try {
                    cVarD0.c(1, j10);
                    int iJ = vb.w.j(cVarD0, "id");
                    int iJ2 = vb.w.j(cVarD0, "timestamp");
                    int iJ3 = vb.w.j(cVarD0, "rj");
                    int iJ4 = vb.w.j(cVarD0, "sourceId");
                    int iJ5 = vb.w.j(cVarD0, "releaseTime");
                    int iJ6 = vb.w.j(cVarD0, "tags");
                    int iJ7 = vb.w.j(cVarD0, "vas");
                    int iJ8 = vb.w.j(cVarD0, "circle");
                    int iJ9 = vb.w.j(cVarD0, "nsfw");
                    int iJ10 = vb.w.j(cVarD0, "has_subtitle");
                    int iJ11 = vb.w.j(cVarD0, "icon");
                    int iJ12 = vb.w.j(cVarD0, "name");
                    int iJ13 = vb.w.j(cVarD0, "workJson");
                    if (cVarD0.Z()) {
                        cVar = new c9.c((int) cVarD0.getLong(iJ), cVarD0.getLong(iJ2), cVarD0.getLong(iJ3), cVarD0.M(iJ4), cVarD0.M(iJ5), cVarD0.M(iJ6), cVarD0.M(iJ7), cVarD0.M(iJ8), ((int) cVarD0.getLong(iJ9)) != 0, ((int) cVarD0.getLong(iJ10)) != 0, cVarD0.M(iJ11), cVarD0.M(iJ12), cVarD0.M(iJ13));
                        break;
                    } else {
                        cVar = null;
                    }
                    return cVar;
                } finally {
                }
            case 2:
                z7.a aVar3 = (z7.a) obj;
                jc.l.e(aVar3, "_connection");
                cVarD0 = aVar3.d0("SELECT * FROM HistoryBean WHERE rj=(?)");
                try {
                    cVarD0.c(1, j10);
                    int iJ14 = vb.w.j(cVarD0, "id");
                    int iJ15 = vb.w.j(cVarD0, "timestamp");
                    int iJ16 = vb.w.j(cVarD0, "rj");
                    int iJ17 = vb.w.j(cVarD0, "sourceId");
                    int iJ18 = vb.w.j(cVarD0, "releaseTime");
                    int iJ19 = vb.w.j(cVarD0, "tags");
                    int iJ20 = vb.w.j(cVarD0, "vas");
                    int iJ21 = vb.w.j(cVarD0, "circle");
                    int iJ22 = vb.w.j(cVarD0, "nsfw");
                    int iJ23 = vb.w.j(cVarD0, "has_subtitle");
                    int iJ24 = vb.w.j(cVarD0, "icon");
                    int iJ25 = vb.w.j(cVarD0, "name");
                    int iJ26 = vb.w.j(cVarD0, "workJson");
                    if (cVarD0.Z()) {
                        dVar = new c9.d((int) cVarD0.getLong(iJ14), cVarD0.getLong(iJ15), cVarD0.getLong(iJ16), cVarD0.M(iJ17), cVarD0.M(iJ18), cVarD0.M(iJ19), cVarD0.M(iJ20), cVarD0.M(iJ21), ((int) cVarD0.getLong(iJ22)) != 0, ((int) cVarD0.getLong(iJ23)) != 0, cVarD0.M(iJ24), cVarD0.M(iJ25), cVarD0.M(iJ26));
                        break;
                    } else {
                        dVar = null;
                    }
                    return dVar;
                } finally {
                }
            case 3:
                z7.a aVar4 = (z7.a) obj;
                jc.l.e(aVar4, "_connection");
                cVarD0 = aVar4.d0("DELETE FROM HistoryBean WHERE rj=(?)");
                try {
                    cVarD0.c(1, j10);
                    cVarD0.Z();
                    cVarD0.close();
                    return a0.f21526a;
                } finally {
                }
            case 4:
                z7.a aVar5 = (z7.a) obj;
                jc.l.e(aVar5, "_connection");
                cVarD0 = aVar5.d0("SELECT * FROM LyricBean WHERE rj=(?)");
                try {
                    cVarD0.c(1, j10);
                    int iJ27 = vb.w.j(cVarD0, "id");
                    int iJ28 = vb.w.j(cVarD0, "rj");
                    int iJ29 = vb.w.j(cVarD0, "sourceId");
                    int iJ30 = vb.w.j(cVarD0, "nameBin");
                    int iJ31 = vb.w.j(cVarD0, "nameEnc");
                    int iJ32 = vb.w.j(cVarD0, "lyricBin");
                    int iJ33 = vb.w.j(cVarD0, "lyricEnc");
                    int iJ34 = vb.w.j(cVarD0, "duration");
                    int iJ35 = vb.w.j(cVarD0, "documentUri");
                    int iJ36 = vb.w.j(cVarD0, "zipInnerPath");
                    ArrayList arrayList = new ArrayList();
                    while (cVarD0.Z()) {
                        arrayList.add(new c9.f((int) cVarD0.getLong(iJ27), cVarD0.getLong(iJ28), cVarD0.M(iJ29), cVarD0.getBlob(iJ30), cVarD0.isNull(iJ31) ? null : cVarD0.M(iJ31), cVarD0.getBlob(iJ32), cVarD0.isNull(iJ33) ? null : cVarD0.M(iJ33), cVarD0.getLong(iJ34), cVarD0.M(iJ35), cVarD0.M(iJ36)));
                        break;
                    }
                    return arrayList;
                } finally {
                }
            default:
                z7.a aVar6 = (z7.a) obj;
                jc.l.e(aVar6, "_connection");
                cVarD0 = aVar6.d0("SELECT 1 FROM LyricBean WHERE rj=(?) LIMIT 1");
                try {
                    cVarD0.c(1, j10);
                    boolean z10 = false;
                    if (cVarD0.Z()) {
                        z10 = ((int) cVarD0.getLong(0)) != 0;
                    }
                    cVarD0.close();
                    return Boolean.valueOf(z10);
                } finally {
                }
        }
    }
}
