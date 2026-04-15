package s9;

import a9.u;
import androidx.compose.foundation.layout.FillElement;
import androidx.lifecycle.k;
import androidx.lifecycle.x0;
import e7.a0;
import f1.f;
import g2.v0;
import i2.h;
import i2.i;
import i2.j;
import j1.n;
import j1.q;
import j2.h0;
import jc.l;
import jc.z;
import m0.b1;
import m0.c1;
import m0.n3;
import x0.j1;
import x0.o;
import x0.p1;
import x0.r0;
import x0.v;
import y.e1;
import y.g;
import y.p;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f19672a = new f(new r9.a(24), 590785256, false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final f f19673b = new f(new q9.b(15), -797576066, false);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final f f19674c = new f(new q9.b(16), -1649156066, false);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final f f19675d = new f(new r9.a(28), 1100452053, false);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final f f19676e = new f(new r9.a(29), -998291949, false);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final f f19677f = new f(new q9.b(8), 595596303, false);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final f f19678g = new f(new q9.b(9), -453775698, false);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final f f19679h = new f(new r9.a(25), 644196896, false);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final f f19680i = new f(new q9.b(10), -1150130689, false);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final f f19681j = new f(new q9.b(11), -1227138566, false);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final f f19682k = new f(new q9.b(12), 1629840963, false);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final f f19683l = new f(new r9.a(26), 1331177181, false);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final f f19684m = new f(new r9.a(27), -122209509, false);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final f f19685n = new f(new q9.b(13), -1794603241, false);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final f f19686o = new f(new q9.b(14), 212179477, false);

    public static final void a(int i10, o oVar) {
        a0 a0Var;
        o oVar2 = oVar;
        oVar2.Y(1577109005);
        if (oVar2.N(i10 & 1, i10 != 0)) {
            x0 x0VarA = j4.a.a(oVar2);
            if (x0VarA == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
            }
            a aVar = (a) g8.a.w(x0VarA, z.f10839a.b(a.class), null, x0VarA instanceof k ? ((k) x0VarA).c() : i4.a.f9001b);
            j7.b bVarA = j7.d.a(aVar.f19667b, oVar2);
            a0 a0Var2 = (a0) oVar2.j(u.f265c);
            Object objK = oVar2.K();
            r0 r0Var = x0.k.f24334a;
            if (objK == r0Var) {
                objK = g9.a.a();
                oVar2.h0(objK);
            }
            fg.f fVar = (fg.f) objK;
            Object objK2 = oVar2.K();
            if (objK2 == r0Var) {
                objK2 = lc.b.G("username", "", gg.c.a(), false, z.a(String.class));
                oVar2.h0(objK2);
            }
            fg.f fVar2 = (fg.f) objK2;
            FillElement fillElement = androidx.compose.foundation.layout.c.f557c;
            v0 v0VarD = p.d(j1.c.f9662a, false);
            int iQ = v.q(oVar2);
            j1 j1VarL = oVar2.l();
            q qVarC = j1.a.c(fillElement, oVar2);
            i2.k.f8771g0.getClass();
            i iVar = j.f8733b;
            oVar2.a0();
            if (oVar2.S) {
                oVar2.k(iVar);
            } else {
                oVar2.k0();
            }
            v.A(j.f8738g, v0VarD, oVar2);
            v.A(j.f8737f, j1VarL, oVar2);
            h hVar = j.f8741j;
            if (oVar2.S || !l.a(oVar2.K(), Integer.valueOf(iQ))) {
                h0.s(iQ, oVar2, iQ, hVar);
            }
            v.A(j.f8735d, qVarC, oVar2);
            e1 e1VarA = androidx.compose.foundation.layout.a.a(0.0f, 10, 1);
            g gVarG = y.k.g(5);
            boolean zH = oVar2.h(a0Var2) | oVar2.h(bVarA) | oVar2.h(aVar);
            Object objK3 = oVar2.K();
            if (zH || objK3 == r0Var) {
                e.b bVar = new e.b(bVarA, fVar, fVar2, a0Var2, aVar, 3);
                a0Var = a0Var2;
                oVar2.h0(bVar);
                objK3 = bVar;
            } else {
                a0Var = a0Var2;
            }
            a.a.g(24966, 490, null, (ic.k) objK3, null, fillElement, null, null, oVar2, gVarG, e1VarA, false);
            q qVarJ = androidx.compose.foundation.layout.a.j(androidx.compose.foundation.layout.b.f554a.a(n.f9689a, j1.c.f9670i), 25);
            long jA = ((b1) oVar2.j(c1.f12773a)).a();
            boolean zH2 = oVar2.h(a0Var);
            Object objK4 = oVar2.K();
            if (zH2 || objK4 == r0Var) {
                objK4 = new ca.b(a0Var, 6);
                oVar2.h0(objK4);
            }
            n3.a((ic.a) objK4, qVarJ, null, 0L, jA, null, f19686o, oVar, 12582912, 92);
            oVar2 = oVar;
            oVar2.p(true);
        } else {
            oVar2.Q();
        }
        p1 p1VarR = oVar2.r();
        if (p1VarR != null) {
            p1VarR.f24421d = new q9.b(i10, 7);
        }
    }
}
