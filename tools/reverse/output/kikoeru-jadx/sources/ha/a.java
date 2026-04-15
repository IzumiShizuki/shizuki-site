package ha;

import i2.h;
import i2.i;
import i2.j;
import ic.k;
import ic.n;
import j1.q;
import j2.h0;
import jc.l;
import m0.b0;
import q9.w;
import ub.a0;
import x0.j1;
import x0.o;
import x0.w0;
import y.u;
import y.v;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8248a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w0 f8249b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f8250c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k f8251d;

    public /* synthetic */ a(k kVar, w0 w0Var, String str) {
        this.f8248a = 0;
        this.f8251d = kVar;
        this.f8249b = w0Var;
        this.f8250c = str;
    }

    @Override // ic.n
    public final Object q(Object obj, Object obj2) {
        switch (this.f8248a) {
            case 0:
                o oVar = (o) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (oVar.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    v vVarA = u.a(y.k.f25158c, j1.c.f9674m, oVar, 0);
                    int iQ = x0.v.q(oVar);
                    j1 j1VarL = oVar.l();
                    q qVarC = j1.a.c(j1.n.f9689a, oVar);
                    i2.k.f8771g0.getClass();
                    i iVar = j.f8733b;
                    oVar.a0();
                    if (oVar.S) {
                        oVar.k(iVar);
                    } else {
                        oVar.k0();
                    }
                    x0.v.A(j.f8738g, vVarA, oVar);
                    x0.v.A(j.f8737f, j1VarL, oVar);
                    h hVar = j.f8741j;
                    if (oVar.S || !l.a(oVar.K(), Integer.valueOf(iQ))) {
                        h0.s(iQ, oVar, iQ, hVar);
                    }
                    x0.v.A(j.f8735d, qVarC, oVar);
                    oVar.W(-1940138311);
                    String[] strArr = b.f8252a;
                    for (int i10 = 0; i10 < 4; i10++) {
                        String str = strArr[i10];
                        k kVar = this.f8251d;
                        boolean zF = oVar.f(kVar) | oVar.f(str);
                        w0 w0Var = this.f8249b;
                        boolean zF2 = zF | oVar.f(w0Var);
                        Object objK = oVar.K();
                        if (zF2 || objK == x0.k.f24334a) {
                            objK = new ba.c((Object) kVar, (Object) str, w0Var, 4);
                            oVar.h0(objK);
                        }
                        b0.b((ic.a) objK, null, false, null, f1.g.f(1538546888, new ba.k(str, this.f8250c), oVar), oVar, 196608, 30);
                    }
                    oVar.p(false);
                    oVar.p(true);
                } else {
                    oVar.Q();
                }
                return a0.f21526a;
            case 1:
                ((Integer) obj2).getClass();
                b.a(this.f8249b, this.f8250c, this.f8251d, (o) obj, x0.v.D(7));
                break;
            default:
                ((Integer) obj2).getClass();
                w.a(this.f8249b, this.f8250c, this.f8251d, (o) obj, x0.v.D(1));
                break;
        }
        return a0.f21526a;
    }

    public /* synthetic */ a(w0 w0Var, String str, k kVar, int i10, int i11) {
        this.f8248a = i11;
        this.f8249b = w0Var;
        this.f8250c = str;
        this.f8251d = kVar;
    }
}
