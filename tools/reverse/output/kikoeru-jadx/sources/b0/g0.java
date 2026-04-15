package b0;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import x0.o2;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a0[] f1251a = new a0[0];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final androidx.media3.exoplayer.offline.i f1252b = new androidx.media3.exoplayer.offline.i(1);

    public static final void a(ic.a aVar, j1.q qVar, z0 z0Var, ic.n nVar, x0.o oVar, int i10) {
        oVar.Y(2002163445);
        int i11 = (oVar.h(aVar) ? 4 : 2) | i10 | (oVar.f(qVar) ? 32 : 16) | (oVar.f(z0Var) ? 256 : 128) | (oVar.h(nVar) ? 2048 : 1024);
        if (oVar.N(i11 & 1, (i11 & 1171) != 1170)) {
            c(f1.g.f(-1488997347, new androidx.compose.foundation.lazy.layout.c(z0Var, qVar, nVar, x0.v.y(aVar, oVar)), oVar), oVar, 6);
        } else {
            oVar.Q();
        }
        x0.p1 p1VarR = oVar.r();
        if (p1VarR != null) {
            p1VarR.f24421d = new p0(aVar, qVar, z0Var, nVar, i10);
        }
    }

    public static final void b(Object obj, int i10, w0 w0Var, f1.f fVar, x0.o oVar, int i11) {
        int i12;
        oVar.Y(-2079116560);
        if ((i11 & 6) == 0) {
            i12 = (oVar.h(obj) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= oVar.d(i10) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= oVar.h(w0Var) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i12 |= oVar.h(fVar) ? 2048 : 1024;
        }
        if (oVar.N(i12 & 1, (i12 & 1171) != 1170)) {
            boolean zF = oVar.f(obj) | oVar.f(w0Var);
            Object objK = oVar.K();
            Object obj2 = x0.k.f24334a;
            if (zF || objK == obj2) {
                objK = new v0(obj, w0Var);
                oVar.h0(objK);
            }
            v0 v0Var = (v0) objK;
            v0Var.f1368c = i10;
            x0.e1 e1Var = v0Var.f1372g;
            x0.m1 m1Var = g2.e1.f7175a;
            v0 v0Var2 = (v0) oVar.j(m1Var);
            h1.g gVarD = h1.t.d();
            ic.k kVarE = gVarD != null ? gVarD.e() : null;
            h1.g gVarG = h1.t.g(gVarD);
            try {
                if (v0Var2 != ((v0) e1Var.getValue())) {
                    e1Var.setValue(v0Var2);
                    if (v0Var.f1369d > 0) {
                        v0 v0Var3 = v0Var.f1370e;
                        if (v0Var3 != null) {
                            v0Var3.b();
                        }
                        if (v0Var2 != null) {
                            v0Var2.a();
                        } else {
                            v0Var2 = null;
                        }
                        v0Var.f1370e = v0Var2;
                    }
                }
                h1.t.k(gVarD, gVarG, kVarE);
                boolean zF2 = oVar.f(v0Var);
                Object objK2 = oVar.K();
                if (zF2 || objK2 == obj2) {
                    objK2 = new a0.f0(2, v0Var);
                    oVar.h0(objK2);
                }
                x0.v.c(v0Var, (ic.k) objK2, oVar);
                x0.v.a(m1Var.a(v0Var), fVar, oVar, ((i12 >> 6) & 112) | 8);
            } catch (Throwable th2) {
                h1.t.k(gVarD, gVarG, kVarE);
                throw th2;
            }
        } else {
            oVar.Q();
        }
        x0.p1 p1VarR = oVar.r();
        if (p1VarR != null) {
            p1VarR.f24421d = new m0(obj, i10, w0Var, fVar, i11);
        }
    }

    public static final void c(f1.f fVar, x0.o oVar, int i10) {
        x0.o oVar2;
        oVar.Y(674185128);
        int i11 = 0;
        int i12 = 2;
        if (oVar.N(i10 & 1, (i10 & 3) != 2)) {
            o2 o2Var = g1.i.f7146a;
            g1.g gVar = (g1.g) oVar.j(o2Var);
            g1.e eVarF = g1.l.f(oVar);
            Object[] objArr = {gVar};
            androidx.media3.exoplayer.offline.u uVar = new androidx.media3.exoplayer.offline.u(16, n1.f1310b, new o1(i11, gVar, eVarF));
            boolean zH = oVar.h(gVar) | oVar.h(eVarF);
            Object objK = oVar.K();
            if (zH || objK == x0.k.f24334a) {
                objK = new s1(i11, gVar, eVarF);
                oVar.h0(objK);
            }
            oVar2 = oVar;
            q1 q1Var = (q1) g1.l.d(objArr, uVar, (ic.a) objK, oVar2, 0, 4);
            x0.v.a(o2Var.a(q1Var), f1.g.f(1863926504, new i0(i12, fVar, q1Var), oVar2), oVar2, 56);
        } else {
            oVar2 = oVar;
            oVar2.Q();
        }
        x0.p1 p1VarR = oVar2.r();
        if (p1VarR != null) {
            p1VarR.f24421d = new r1(fVar, i10, i11);
        }
    }

    public static final void d(n0 n0Var, Object obj, int i10, Object obj2, x0.o oVar, int i11) {
        int i12;
        oVar.Y(1439843069);
        if ((i11 & 6) == 0) {
            i12 = (oVar.f(n0Var) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= oVar.f(obj) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= oVar.d(i10) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i12 |= oVar.f(obj2) ? 2048 : 1024;
        }
        if (oVar.N(i12 & 1, (i12 & 1171) != 1170)) {
            ((g1.c) obj).a(obj2, f1.g.f(980966366, new l0(i10, n0Var, obj2), oVar), oVar, 48);
        } else {
            oVar.Q();
        }
        x0.p1 p1VarR = oVar.r();
        if (p1VarR != null) {
            p1VarR.f24421d = new m0(n0Var, obj, i10, obj2, i11);
        }
    }

    public static final int e(int i10, z0.e eVar) {
        int i11 = eVar.f26374c - 1;
        int i12 = 0;
        while (i12 < i11) {
            int i13 = ((i11 - i12) / 2) + i12;
            Object[] objArr = eVar.f26372a;
            int i14 = ((i) objArr[i13]).f1263a;
            if (i14 != i10) {
                if (i14 < i10) {
                    i12 = i13 + 1;
                    if (i10 < ((i) objArr[i12]).f1263a) {
                    }
                } else {
                    i11 = i13 - 1;
                }
            }
            return i13;
        }
        return i12;
    }

    public static final List f(n0 n0Var, w0 w0Var, m mVar) {
        oc.d dVar;
        z0.e eVar = mVar.f1296a;
        if (!(eVar.f26374c != 0) && w0Var.f1392a.isEmpty()) {
            return vb.r.f22819a;
        }
        ArrayList arrayList = new ArrayList();
        if (mVar.f1296a.f26374c != 0) {
            int i10 = eVar.f26374c;
            if (i10 == 0) {
                throw new NoSuchElementException("MutableVector is empty.");
            }
            Object[] objArr = eVar.f26372a;
            int i11 = ((l) objArr[0]).f1286a;
            for (int i12 = 0; i12 < i10; i12++) {
                int i13 = ((l) objArr[i12]).f1286a;
                if (i13 < i11) {
                    i11 = i13;
                }
            }
            if (i11 < 0) {
                x.a.a("negative minIndex");
            }
            int i14 = eVar.f26374c;
            if (i14 == 0) {
                throw new NoSuchElementException("MutableVector is empty.");
            }
            Object[] objArr2 = eVar.f26372a;
            int i15 = ((l) objArr2[0]).f1287b;
            for (int i16 = 0; i16 < i14; i16++) {
                int i17 = ((l) objArr2[i16]).f1287b;
                if (i17 > i15) {
                    i15 = i17;
                }
            }
            dVar = new oc.d(i11, Math.min(i15, n0Var.a() - 1), 1);
        } else {
            dVar = oc.d.f16314d;
        }
        int size = w0Var.f1392a.size();
        for (int i18 = 0; i18 < size; i18++) {
            v0 v0Var = (v0) w0Var.get(i18);
            int iH = h(v0Var.f1368c, n0Var, v0Var.f1366a);
            int i19 = dVar.f16307a;
            if ((iH > dVar.f16308b || i19 > iH) && iH >= 0 && iH < n0Var.a()) {
                arrayList.add(Integer.valueOf(iH));
            }
        }
        int i20 = dVar.f16307a;
        int i21 = dVar.f16308b;
        if (i20 <= i21) {
            while (true) {
                arrayList.add(Integer.valueOf(i20));
                if (i20 == i21) {
                    break;
                }
                i20++;
            }
        }
        return arrayList;
    }

    public static x0.w0 g() {
        return new x0.e1(ub.a0.f21526a, x0.r0.f24436c);
    }

    public static final int h(int i10, n0 n0Var, Object obj) {
        int iD;
        return (obj == null || n0Var.a() == 0 || (i10 < n0Var.a() && obj.equals(n0Var.b(i10))) || (iD = n0Var.d(obj)) == -1) ? i10 : iD;
    }

    public Object i(int i10) {
        i iVarP = j().p(i10);
        return iVarP.f1265c.b().a(Integer.valueOf(i10 - iVarP.f1263a));
    }

    public abstract ah.j j();

    public Object k(int i10) {
        Object objA;
        i iVarP = j().p(i10);
        int i11 = i10 - iVarP.f1263a;
        ic.k key = iVarP.f1265c.getKey();
        return (key == null || (objA = key.a(Integer.valueOf(i11))) == null) ? new g(i10) : objA;
    }
}
