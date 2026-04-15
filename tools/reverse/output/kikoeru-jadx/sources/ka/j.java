package ka;

import com.cnl.kikoeru.R;
import h1.s;
import h1.z;
import hf.a0;
import java.util.ListIterator;
import x0.p1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final nf.d f11268a = a0.d();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final s f11269b = new s();

    public static final void a(int i10, x0.o oVar) {
        f1.f fVarF;
        oVar.Y(-62703331);
        boolean z10 = false;
        if (oVar.N(i10 & 1, i10 != 0)) {
            ListIterator listIterator = f11269b.listIterator();
            while (true) {
                z zVar = (z) listIterator;
                if (!zVar.hasNext()) {
                    break;
                }
                g gVar = (g) zVar.next();
                ic.o oVar2 = gVar.f11264i;
                j3.q qVar = gVar.f11262g;
                Object obj = x0.k.f24334a;
                if (oVar2 == null) {
                    oVar.W(-196748458);
                    j1.q qVar2 = gVar.f11258c;
                    String str = gVar.f11257b;
                    if (str == null) {
                        oVar.W(-196596590);
                        oVar.p(z10);
                        fVarF = null;
                    } else {
                        oVar.W(-196596589);
                        fVarF = f1.g.f(-181899888, new ba.p(9, str), oVar);
                        oVar.p(z10);
                    }
                    boolean zF = oVar.f(gVar);
                    Object objK = oVar.K();
                    if (zF || objK == obj) {
                        objK = new c(gVar, 3);
                        oVar.h0(objK);
                    }
                    a2.c.b((ic.a) objK, f1.g.f(-1432943282, new d(gVar, 3), oVar), qVar2, f1.g.f(-1697590772, new h(gVar), oVar), fVarF, f1.g.f(-1962238262, new d(gVar, 4), oVar), null, 0L, 0L, qVar, oVar, 199728, 448);
                    oVar.p(false);
                } else if (gVar.f11263h) {
                    oVar.W(-195742694);
                    gVar.f11264i.g(gVar, oVar, 0);
                    oVar.p(false);
                } else {
                    oVar.W(-195687483);
                    boolean zF2 = oVar.f(gVar);
                    Object objK2 = oVar.K();
                    if (zF2 || objK2 == obj) {
                        objK2 = new c(gVar, 4);
                        oVar.h0(objK2);
                    }
                    android.support.v4.media.session.b.c((ic.a) objK2, qVar, f1.g.f(520215414, new d(gVar, 5), oVar), oVar, 384);
                    oVar.p(false);
                }
                z10 = false;
            }
        } else {
            oVar.Q();
        }
        p1 p1VarR = oVar.r();
        if (p1VarR != null) {
            p1VarR.f24421d = new h(i10, 1);
        }
    }

    public static void b(String str, ic.k kVar) {
        String strG = na.q.g(R.string.btn_cancel);
        String strG2 = na.q.g(R.string.btn_delete);
        f1.f fVar = b.f11241c;
        a0.y(f11268a, null, null, new i(new g(str, null, j1.n.f9689a, kVar, strG, strG2, new j3.q(7), true, fVar), null, 1), 3);
    }

    public static final void c(g gVar) {
        jc.l.e(gVar, "<this>");
        a0.y(f11268a, null, null, new i(gVar, null, 0), 3);
    }

    public static void d(String str, String str2, ic.k kVar, j3.q qVar, f1.f fVar, int i10) {
        a0.y(f11268a, null, null, new i(new g(str, (i10 & 1) != 0 ? null : str2, j1.n.f9689a, (i10 & 2) != 0 ? null : kVar, na.q.g(R.string.btn_cancel), (i10 & 8) != 0 ? na.q.g(R.string.btn_confirm) : "不再提示", (i10 & 64) != 0 ? new j3.q(7) : qVar, false, (i10 & 256) != 0 ? null : fVar), null, 1), 3);
    }
}
