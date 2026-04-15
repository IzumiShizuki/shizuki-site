package ph;

import ch.z;
import h1.d0;
import r.y1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class f extends b {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final th.f f17180f = new th.f(new y1(th.f.f20771f), 6, new y1(th.f.f20772g), th.f.f20773h, oh.a.B);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final th.g f17181g = new th.g(new y1(th.g.f20774f), 9, new y1(th.g.f20775g), th.g.f20776h, oh.a.f16440b);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final th.h f17182h = new th.h(new y1(th.h.f20777f), 10, new y1(th.h.f20778g), th.h.f20779h, oh.a.f16439a);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final th.i f17183i = new th.i(new y1(th.i.f20780f), 6, new y1(th.i.f20781g), th.i.f20782h, oh.a.f16441c);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public z[] f17184b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f17185c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f17186d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f17187e;

    @Override // ph.b
    public final String a() {
        return this.f17187e;
    }

    @Override // ph.b
    public final float b() {
        return 0.99f;
    }

    @Override // ph.b
    public final int c(byte[] bArr, int i10) {
        z[] zVarArr = this.f17184b;
        for (int i11 = 0; i11 < i10 && this.f17186d == 1; i11++) {
            for (int i12 = this.f17185c - 1; i12 >= 0; i12--) {
                int iR = zVarArr[i12].r(bArr[i11]);
                if (iR == 1) {
                    int i13 = this.f17185c - 1;
                    this.f17185c = i13;
                    if (i13 <= 0) {
                        this.f17186d = 3;
                        return 3;
                    }
                    if (i12 != i13) {
                        z zVar = zVarArr[i13];
                        zVarArr[i13] = zVarArr[i12];
                        zVarArr[i12] = zVar;
                    }
                } else if (iR == 2) {
                    this.f17186d = 2;
                    this.f17187e = (String) ((d0) zVarArr[i12].f4286c).f8002e;
                    return 2;
                }
            }
        }
        return this.f17186d;
    }

    @Override // ph.b
    public final void d() {
        this.f17186d = 1;
        int i10 = 0;
        while (true) {
            z[] zVarArr = this.f17184b;
            if (i10 >= zVarArr.length) {
                this.f17185c = zVarArr.length;
                this.f17187e = null;
                return;
            } else {
                zVarArr[i10].f4284a = 0;
                i10++;
            }
        }
    }
}
