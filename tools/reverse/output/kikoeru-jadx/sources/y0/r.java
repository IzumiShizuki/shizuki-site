package y0;

import x0.d2;
import x0.p1;
import x0.v1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class r extends i0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final r f25340e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final r f25341f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final r f25342g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final r f25343h;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f25344d;

    static {
        int i10 = 1;
        f25340e = new r(i10, 2, 0);
        int i11 = 1;
        f25341f = new r(i11, i11, 1);
        f25342g = new r(i10, 2, 2);
        int i12 = 1;
        f25343h = new r(i12, i12, 3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(int i10, int i11, int i12) {
        super(i10, i11, 0, (byte) 0);
        this.f25344d = i12;
    }

    @Override // y0.i0
    public final void c(m4.j jVar, x0.c cVar, d2 d2Var, f1.m mVar, j0 j0Var) {
        switch (this.f25344d) {
            case 0:
                Object objB = ((ic.a) jVar.f(0)).b();
                x0.a aVar = (x0.a) jVar.f(1);
                int iE = jVar.e(0);
                aVar.getClass();
                d2Var.T(d2Var.c(aVar), objB);
                cVar.k(iE, objB);
                cVar.c(objB);
                break;
            case 1:
                x0.a aVar2 = (x0.a) jVar.f(0);
                int iE2 = jVar.e(0);
                cVar.j();
                aVar2.getClass();
                cVar.b(iE2, d2Var.C(d2Var.c(aVar2)));
                break;
            case 2:
                Object objF = jVar.f(0);
                x0.a aVar3 = (x0.a) jVar.f(1);
                int iE3 = jVar.e(0);
                if (objF instanceof v1) {
                    v1 v1Var = (v1) objF;
                    mVar.f6639e.b(v1Var);
                    mVar.f6638d.a(v1Var);
                }
                Object objJ = d2Var.J(d2Var.c(aVar3), iE3, objF);
                if (objJ instanceof v1) {
                    mVar.d((v1) objJ);
                } else if (objJ instanceof p1) {
                    ((p1) objJ).e();
                }
                break;
            default:
                Object objF2 = jVar.f(0);
                int iE4 = jVar.e(0);
                if (objF2 instanceof v1) {
                    v1 v1Var2 = (v1) objF2;
                    mVar.f6639e.b(v1Var2);
                    mVar.f6638d.a(v1Var2);
                }
                Object objJ2 = d2Var.J(d2Var.f24284t, iE4, objF2);
                if (objJ2 instanceof v1) {
                    mVar.d((v1) objJ2);
                } else if (objJ2 instanceof p1) {
                    ((p1) objJ2).e();
                }
                break;
        }
    }

    @Override // y0.i0
    public x0.a e(m4.j jVar) {
        switch (this.f25344d) {
            case 0:
                return (x0.a) jVar.f(1);
            case 1:
                return (x0.a) jVar.f(0);
            default:
                return super.e(jVar);
        }
    }
}
