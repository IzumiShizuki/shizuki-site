package a0;

import u.v1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class b0 implements j1.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v1 f21b;

    public /* synthetic */ b0(v1 v1Var, int i10) {
        this.f20a = i10;
        this.f21b = v1Var;
    }

    @Override // j1.q
    public final Object a(ic.n nVar, Object obj) {
        switch (this.f20a) {
        }
        return nVar.q(obj, this);
    }

    @Override // j1.q
    public final /* synthetic */ j1.q e(j1.q qVar) {
        int i10 = this.f20a;
        return c.r(this, qVar);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0002. Please report as an issue. */
    @Override // j1.q
    public final boolean k(ic.k kVar) {
        switch (this.f20a) {
        }
        return ((Boolean) kVar.a(this)).booleanValue();
    }
}
