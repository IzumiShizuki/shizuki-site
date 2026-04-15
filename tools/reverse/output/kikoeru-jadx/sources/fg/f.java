package fg;

import h1.e0;
import h1.g;
import h1.g0;
import h1.n;
import h1.p;
import jc.l;
import pc.f0;
import pc.v;
import x0.i2;
import x0.r0;
import x0.w0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class f implements e0, p, w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hg.b f7092a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public e f7093b;

    public f(String str, Object obj, hg.a aVar, boolean z10, v vVar) {
        l.e(aVar, "okkv");
        l.e(vVar, "type");
        this.f7092a = f0.P(aVar, str, obj, vVar);
        if (z10) {
            b bVar = b.f7085b;
            b.c(aVar, new d(this, 0), this, str);
        }
        this.f7093b = new e(obj);
    }

    @Override // h1.e0
    public final g0 a() {
        return this.f7093b;
    }

    @Override // h1.p
    public final i2 b() {
        return r0.f24439f;
    }

    public final void c() {
        b bVar = b.f7085b;
        b.f7086c.remove(this);
    }

    @Override // x0.n2
    public final Object getValue() {
        Object obj = ((e) n.u(this.f7093b, this)).f7091c;
        Object objA = this.f7092a.a();
        if (l.a(obj, objA)) {
            return obj;
        }
        setValue(objA);
        return objA;
    }

    @Override // h1.e0
    public final void i(g0 g0Var) {
        l.e(g0Var, "value");
        this.f7093b = (e) g0Var;
    }

    @Override // h1.e0
    public final g0 j(g0 g0Var, g0 g0Var2, g0 g0Var3) {
        if (l.a(((e) g0Var2).f7091c, ((e) g0Var3).f7091c)) {
            return g0Var2;
        }
        return null;
    }

    @Override // x0.w0
    public final void setValue(Object obj) {
        g gVarK;
        l.e(obj, "value");
        e eVar = (e) n.i(this.f7093b);
        this.f7092a.d(obj);
        if (l.a(eVar.f7091c, obj)) {
            return;
        }
        e eVar2 = this.f7093b;
        synchronized (n.f8051c) {
            gVarK = n.k();
            ((e) n.x(eVar2, this, gVarK)).f7091c = obj;
        }
        n.o(gVarK, this);
    }

    public final String toString() {
        return "MutableState(value=" + ((e) n.i(this.f7093b)).f7091c + ")@" + hashCode();
    }
}
