package bd;

import java.util.Collection;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class h0 extends p implements yc.y {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final re.l f2575c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final vc.i f2576d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Map f2577e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final m0 f2578f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public f0 f2579g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public yc.g0 f2580h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f2581i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final re.e f2582j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ub.p f2583k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(be.e eVar, re.l lVar, vc.i iVar, int i10) {
        super(zc.g.f26696a, eVar);
        jc.l.e(eVar, "moduleName");
        this.f2575c = lVar;
        this.f2576d = iVar;
        if (!eVar.f2752b) {
            throw new IllegalArgumentException("Module name must be special: " + eVar);
        }
        this.f2577e = vb.s.f22820a;
        m0.f2609a.getClass();
        m0 m0Var = (m0) P0(k0.f2605b);
        this.f2578f = m0Var == null ? l0.f2606b : m0Var;
        this.f2581i = true;
        this.f2582j = lVar.b(new a(2, this));
        this.f2583k = ub.a.d(new g0(this, 0));
    }

    public final void C1() {
        if (this.f2581i) {
            return;
        }
        if (P0(yc.v.f26151a) != null) {
            throw new ClassCastException();
        }
        String str = "Accessing invalid module descriptor " + this;
        jc.l.e(str, "message");
        throw new m4.t(str);
    }

    @Override // yc.y
    public final List D0() {
        if (this.f2579g != null) {
            return vb.r.f22819a;
        }
        StringBuilder sb = new StringBuilder("Dependencies of module ");
        String str = getName().f2751a;
        jc.l.d(str, "toString(...)");
        sb.append(str);
        sb.append(" were not set");
        throw new AssertionError(sb.toString());
    }

    @Override // yc.y
    public final yc.h0 K0(be.c cVar) {
        jc.l.e(cVar, "fqName");
        C1();
        return (yc.h0) this.f2582j.a(cVar);
    }

    @Override // yc.y
    public final Object P0(app.nekogram.translator.r rVar) {
        jc.l.e(rVar, "capability");
        Object obj = this.f2577e.get(rVar);
        if (obj == null) {
            return null;
        }
        return obj;
    }

    @Override // yc.k
    public final Object a0(yc.m mVar, Object obj) {
        return mVar.b(this, obj);
    }

    @Override // yc.y
    public final boolean b0(yc.y yVar) {
        jc.l.e(yVar, "targetModule");
        if (equals(yVar)) {
            return true;
        }
        jc.l.b(this.f2579g);
        if (vb.m.S(vb.t.f22821a, yVar)) {
            return true;
        }
        D0();
        return yVar.D0().contains(this);
    }

    @Override // yc.y
    public final vc.i g() {
        return this.f2576d;
    }

    @Override // yc.y
    public final Collection p(be.c cVar, ic.k kVar) {
        jc.l.e(cVar, "fqName");
        C1();
        C1();
        return ((o) this.f2583k.getValue()).p(cVar, kVar);
    }

    @Override // bd.p
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(p.B1(this));
        if (!this.f2581i) {
            sb.append(" !isValid");
        }
        sb.append(" packageFragmentProvider: ");
        yc.g0 g0Var = this.f2580h;
        sb.append(g0Var != null ? g0Var.getClass().getSimpleName() : null);
        return sb.toString();
    }

    @Override // yc.k
    public final /* bridge */ yc.k y() {
        return null;
    }
}
