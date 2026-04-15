package j9;

import lf.b1;
import lf.p0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b0 f10659a = new b0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b1 f10660b = p0.c(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b1 f10661c = p0.c(0);

    public static void a(a8.a aVar) {
        jc.l.e(aVar, "mdb");
        aVar.h();
        try {
            aVar.l("DELETE FROM LyricBean\nWHERE rowid NOT IN (\n    SELECT MIN(rowid)\n    FROM LyricBean\n    GROUP BY sourceId, nameBin\n)");
            aVar.A();
        } catch (Exception e10) {
            e10.printStackTrace();
            ka.n.c("sqlite removeDuplicate failed! " + e10, 0L, null, null, 511);
        } finally {
            aVar.I();
        }
    }
}
