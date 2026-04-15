package c2;

import b0.w1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class z implements j1.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a0 f3355a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public bd.a f3356b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f3357c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final w1 f3358d = new w1(this);

    @Override // j1.q
    public final Object a(ic.n nVar, Object obj) {
        return nVar.q(obj, this);
    }

    @Override // j1.q
    public final /* synthetic */ j1.q e(j1.q qVar) {
        return a0.c.r(this, qVar);
    }

    public final ic.k h() {
        a0 a0Var = this.f3355a;
        if (a0Var != null) {
            return a0Var;
        }
        jc.l.k("onTouchEvent");
        throw null;
    }

    @Override // j1.q
    public final boolean k(ic.k kVar) {
        return ((Boolean) kVar.a(this)).booleanValue();
    }
}
