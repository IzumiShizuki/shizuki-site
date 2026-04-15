package yf;

import java.util.List;
import xf.y;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class p extends n {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final y f26300j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final List f26301k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f26302l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f26303m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(xf.c cVar, y yVar) {
        super(cVar, yVar, (String) null, 12);
        jc.l.e(cVar, "json");
        this.f26300j = yVar;
        List listG0 = vb.m.G0(yVar.f25022a.keySet());
        this.f26301k = listG0;
        this.f26302l = listG0.size() * 2;
        this.f26303m = -1;
    }

    @Override // yf.n, yf.a
    public final xf.m E(String str) {
        jc.l.e(str, "tag");
        return this.f26303m % 2 == 0 ? xf.n.a(str) : (xf.m) vb.w.r(str, this.f26300j);
    }

    @Override // yf.n, yf.a
    public final String Q(uf.g gVar, int i10) {
        jc.l.e(gVar, "descriptor");
        return (String) this.f26301k.get(i10 / 2);
    }

    @Override // yf.n, yf.a
    public final xf.m S() {
        return this.f26300j;
    }

    @Override // yf.n
    /* JADX INFO: renamed from: X */
    public final y S() {
        return this.f26300j;
    }

    @Override // yf.n, vf.a
    public final int b(uf.g gVar) {
        jc.l.e(gVar, "descriptor");
        int i10 = this.f26303m;
        if (i10 >= this.f26302l - 1) {
            return -1;
        }
        int i11 = i10 + 1;
        this.f26303m = i11;
        return i11;
    }

    @Override // yf.n, yf.a, vf.a
    public final void j(uf.g gVar) {
        jc.l.e(gVar, "descriptor");
    }
}
