package n1;

import b0.s1;
import i2.k1;
import i2.l0;
import i7.p2;
import ic.k;
import j1.p;
import j2.h0;
import jc.l;
import jc.m;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class b extends p implements k1, a, i2.p {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final c f15235o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f15236p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public k f15237q;

    public b(c cVar, k kVar) {
        this.f15235o = cVar;
        this.f15237q = kVar;
        cVar.f15238a = this;
    }

    public final void B0() {
        this.f15236p = false;
        this.f15235o.f15239b = null;
        i2.f.m(this);
    }

    @Override // i2.p
    public final void G() {
        B0();
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [ic.k, jc.m] */
    @Override // i2.p
    public final void R(l0 l0Var) {
        boolean z10 = this.f15236p;
        c cVar = this.f15235o;
        if (!z10) {
            cVar.f15239b = null;
            i2.f.t(this, new s1(11, this, cVar));
            if (cVar.f15239b == null) {
                throw h0.g("DrawResult not defined, did you forget to call onDraw?");
            }
            this.f15236p = true;
        }
        p2 p2Var = cVar.f15239b;
        l.b(p2Var);
        ((m) p2Var.f9258a).a(l0Var);
    }

    @Override // i2.k1
    public final void W() {
        B0();
    }

    @Override // n1.a
    public final f3.c a() {
        return i2.f.y(this).f8766y;
    }

    @Override // n1.a
    public final long e() {
        return gh.g.R(i2.f.v(this, 128).f7182c);
    }

    @Override // n1.a
    public final f3.m getLayoutDirection() {
        return i2.f.y(this).f8767z;
    }

    @Override // j1.p
    public final void s0() {
        B0();
    }

    @Override // j1.p
    public final void u0() {
        B0();
    }

    @Override // j1.p
    public final void v0() {
        B0();
    }

    @Override // j1.p
    public final void t0() {
    }
}
