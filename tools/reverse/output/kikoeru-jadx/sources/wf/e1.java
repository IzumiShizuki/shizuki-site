package wf;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class e1 extends r {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d1 f24113b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(sf.a aVar) {
        super(aVar);
        jc.l.e(aVar, "primitiveSerializer");
        this.f24113b = new d1(aVar.a());
    }

    @Override // sf.a
    public final uf.g a() {
        return this.f24113b;
    }

    @Override // wf.a, sf.a
    public final Object b(vf.b bVar) {
        return i(bVar);
    }

    @Override // wf.r, sf.a
    public final void d(yf.t tVar, Object obj) {
        int iH = h(obj);
        d1 d1Var = this.f24113b;
        jc.l.e(d1Var, "descriptor");
        yf.t tVarA = tVar.a(d1Var);
        o(tVarA, obj, iH);
        tVarA.w(d1Var);
    }

    @Override // wf.a
    public final Object e() {
        return (c1) k(n());
    }

    @Override // wf.a
    public final int f(Object obj) {
        c1 c1Var = (c1) obj;
        jc.l.e(c1Var, "<this>");
        return c1Var.d();
    }

    @Override // wf.a
    public final Iterator g(Object obj) {
        throw new IllegalStateException("This method lead to boxing and must not be used, use writeContents instead");
    }

    @Override // wf.a
    public final Object l(Object obj) {
        c1 c1Var = (c1) obj;
        jc.l.e(c1Var, "<this>");
        return c1Var.a();
    }

    @Override // wf.r
    public final void m(int i10, Object obj, Object obj2) {
        jc.l.e((c1) obj, "<this>");
        throw new IllegalStateException("This method lead to boxing and must not be used, use Builder.append instead");
    }

    public abstract Object n();

    public abstract void o(yf.t tVar, Object obj, int i10);
}
