package l0;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f11555a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f11556b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g2.c0 f11557c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f11558d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final r f11559e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final j9.l f11560f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final o.a0 f11561g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ArrayList f11562h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f11563i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f11564j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f11565k;

    public m0(long j10, long j11, g2.c0 c0Var, boolean z10, r rVar, j9.l lVar) {
        this.f11555a = j10;
        this.f11556b = j11;
        this.f11557c = c0Var;
        this.f11558d = z10;
        this.f11559e = rVar;
        this.f11560f = lVar;
        int i10 = o.p.f16029a;
        this.f11561g = new o.a0(6);
        this.f11562h = new ArrayList();
        this.f11563i = -1;
        this.f11564j = -1;
        this.f11565k = -1;
    }

    public final int a(int i10, j jVar, j jVar2) {
        if (i10 == -1) {
            int iOrdinal = u0.x(jVar, jVar2).ordinal();
            if (iOrdinal == 0) {
                return this.f11565k - 1;
            }
            if (iOrdinal == 1) {
                return this.f11565k;
            }
            if (iOrdinal != 2) {
                throw new ce.j0();
            }
        }
        return i10;
    }
}
