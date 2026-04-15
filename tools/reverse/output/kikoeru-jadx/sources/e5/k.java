package e5;

import java.util.List;
import java.util.Map;
import ya.i0;
import ya.k0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class k extends o {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f6211d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f6212e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f6213f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f6214g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f6215h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f6216i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f6217j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final long f6218k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f6219l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final long f6220m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final long f6221n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f6222o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f6223p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final m4.n f6224q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final i0 f6225r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final i0 f6226s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final k0 f6227t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final long f6228u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final j f6229v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final i0 f6230w;

    public k(int i10, String str, List list, long j10, boolean z10, long j11, boolean z11, int i11, long j12, int i12, long j13, long j14, boolean z12, boolean z13, boolean z14, m4.n nVar, List list2, List list3, j jVar, Map map, List list4) {
        super(str, list, z12);
        this.f6211d = i10;
        this.f6215h = j11;
        this.f6214g = z10;
        this.f6216i = z11;
        this.f6217j = i11;
        this.f6218k = j12;
        this.f6219l = i12;
        this.f6220m = j13;
        this.f6221n = j14;
        this.f6222o = z13;
        this.f6223p = z14;
        this.f6224q = nVar;
        this.f6225r = i0.q(list2);
        this.f6226s = i0.q(list3);
        this.f6227t = k0.a(map);
        this.f6230w = i0.q(list4);
        if (!list3.isEmpty()) {
            f fVar = (f) ya.q.k(list3);
            this.f6228u = fVar.f6199e + fVar.f6197c;
        } else if (list2.isEmpty()) {
            this.f6228u = 0L;
        } else {
            h hVar = (h) ya.q.k(list2);
            this.f6228u = hVar.f6199e + hVar.f6197c;
        }
        this.f6212e = j10 != -9223372036854775807L ? j10 >= 0 ? Math.min(this.f6228u, j10) : Math.max(0L, this.f6228u + j10) : -9223372036854775807L;
        this.f6213f = j10 >= 0;
        this.f6229v = jVar;
    }

    @Override // androidx.media3.exoplayer.offline.t
    public final Object a(List list) {
        return this;
    }
}
