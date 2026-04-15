package y9;

import f1.f;
import x0.k;
import x0.o;
import x0.p1;
import x0.q2;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f25936a = new f(new a(0), 2046818793, false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final f f25937b = new f(new a(1), 2116362208, false);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final f f25938c = new f(new a(2), -1455314655, false);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final f f25939d = new f(new a(3), -732024222, false);

    public static final void a(int i10, o oVar) {
        o oVar2;
        oVar.Y(719525445);
        if (oVar.N(i10 & 1, i10 != 0)) {
            hg.a aVarA = gg.c.a();
            Object objK = oVar.K();
            if (objK == k.f24334a) {
                objK = new t9.c(25);
                oVar.h0(objK);
            }
            oVar2 = oVar;
            y8.c.c(aVarA, null, 0.0f, 0.0f, (ic.k) objK, oVar2, 24576);
        } else {
            oVar2 = oVar;
            oVar2.Q();
        }
        p1 p1VarR = oVar2.r();
        if (p1VarR != null) {
            p1VarR.f24421d = new q2(i10, 2);
        }
    }
}
