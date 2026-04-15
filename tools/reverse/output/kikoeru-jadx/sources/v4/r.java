package v4;

import m4.u1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class r implements p4.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22621a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u1 f22622b;

    public /* synthetic */ r(u1 u1Var) {
        this.f22622b = u1Var;
    }

    @Override // p4.k
    public final void a(Object obj) {
        switch (this.f22621a) {
            case 0:
                ((m4.w0) obj).F(this.f22622b);
                break;
            default:
                w4.i iVar = (w4.i) obj;
                ah.j jVar = iVar.f23387o;
                u1 u1Var = this.f22622b;
                if (jVar != null) {
                    m4.q qVar = (m4.q) jVar.f391c;
                    if (qVar.f14552v == -1) {
                        m4.p pVarA = qVar.a();
                        pVarA.f14495t = u1Var.f14598a;
                        pVarA.f14496u = u1Var.f14599b;
                        iVar.f23387o = new ah.j(new m4.q(pVarA), jVar.f390b, (String) jVar.f392d, 14);
                    }
                }
                int i10 = u1Var.f14598a;
                break;
        }
    }

    public /* synthetic */ r(w4.a aVar, u1 u1Var) {
        this.f22622b = u1Var;
    }
}
