package j5;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class n1 extends s {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f10371f = 1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f10372g;

    public n1(m4.i1 i1Var, m4.i0 i0Var) {
        super(i1Var);
        this.f10372g = i0Var;
    }

    @Override // j5.s, m4.i1
    public m4.f1 f(int i10, m4.f1 f1Var, boolean z10) {
        switch (this.f10371f) {
            case 1:
                m4.i1 i1Var = this.f10410e;
                m4.f1 f1VarF = i1Var.f(i10, f1Var, z10);
                if (i1Var.m(f1VarF.f14203c, (m4.h1) this.f10372g, 0L).a()) {
                    f1VarF.i(f1Var.f14201a, f1Var.f14202b, f1Var.f14203c, f1Var.f14204d, f1Var.f14205e, m4.b.f14121f, true);
                } else {
                    f1VarF.f14206f = true;
                }
                return f1VarF;
            default:
                return super.f(i10, f1Var, z10);
        }
    }

    @Override // j5.s, m4.i1
    public m4.h1 m(int i10, m4.h1 h1Var, long j10) {
        switch (this.f10371f) {
            case 0:
                super.m(i10, h1Var, j10);
                m4.i0 i0Var = (m4.i0) this.f10372g;
                h1Var.f14264c = i0Var;
                m4.d0 d0Var = i0Var.f14286b;
                h1Var.getClass();
                return h1Var;
            default:
                return super.m(i10, h1Var, j10);
        }
    }

    public n1(m4.i1 i1Var) {
        super(i1Var);
        this.f10372g = new m4.h1();
    }
}
