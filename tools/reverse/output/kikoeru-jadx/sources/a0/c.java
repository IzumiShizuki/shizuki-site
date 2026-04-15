package a0;

import android.content.ContentProviderClient;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.drm.DrmManagerClient;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import androidx.compose.foundation.lazy.layout.LazyLayoutAnimateItemElement;
import androidx.lifecycle.n0;
import com.tencent.bugly.proguard.C0008k;
import g2.u0;
import g2.v0;
import g2.y0;
import g2.z0;
import i2.d1;
import i2.i1;
import i2.q0;
import i7.j1;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import q.e1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class c {
    public static void B(c0.f fVar, String str, f1.f fVar2) {
        fVar.getClass();
        fVar.f3060c.a(1, new c0.d(null, new c0.e(0, str), new f0(4, c0.c0.f3053a), new f1.f(new h(fVar2, 1), 657818596, true)));
    }

    public static /* synthetic */ void C(j jVar, int i10, ic.k kVar, f1.f fVar, int i11) {
        if ((i11 & 2) != 0) {
            kVar = null;
        }
        jVar.m(i10, kVar, r.f106d, fVar);
    }

    public static ch.l D(String str) {
        ch.l lVar = new ch.l(10);
        lVar.B(str);
        return lVar;
    }

    public static C0008k.a E(C0008k c0008k) {
        C0008k.a aVar = new C0008k.a();
        c0008k.a(aVar);
        return aVar;
    }

    public static Object F(Class cls, hg.a aVar, String str, Boolean bool) {
        return pc.f0.P(aVar, str, bool, jc.z.a(cls)).a();
    }

    public static String G(char c3, String str, String str2) {
        return str + str2 + c3;
    }

    public static String H(long j10, String str, StringBuilder sb) {
        sb.append(j10);
        sb.append(str);
        return sb.toString();
    }

    public static String I(String str, int i10, int i11, String str2) {
        return str + i10 + str2 + i11;
    }

    public static String J(String str, j1 j1Var, String str2) {
        return str + j1Var + str2;
    }

    public static StringBuilder K(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(str2);
        sb.append(str3);
        return sb;
    }

    public static void L(int i10, int i11, int i12, int i13, int i14) {
        g8.a.e(i10);
        g8.a.e(i11);
        g8.a.e(i12);
        g8.a.e(i13);
        g8.a.e(i14);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void M(Cursor cursor) throws Exception {
        if (cursor instanceof AutoCloseable) {
            cursor.close();
            return;
        }
        if (cursor instanceof ExecutorService) {
            p4.z.q((ExecutorService) cursor);
            return;
        }
        if (cursor instanceof TypedArray) {
            ((TypedArray) cursor).recycle();
            return;
        }
        if (cursor instanceof MediaMetadataRetriever) {
            ((MediaMetadataRetriever) cursor).release();
            return;
        }
        if (cursor instanceof MediaDrm) {
            ((MediaDrm) cursor).release();
        } else if (cursor instanceof DrmManagerClient) {
            ((DrmManagerClient) cursor).release();
        } else {
            if (!(cursor instanceof ContentProviderClient)) {
                throw new IllegalArgumentException();
            }
            ((ContentProviderClient) cursor).release();
        }
    }

    public static /* synthetic */ void N(Object obj) {
        if (obj != null) {
            throw new ClassCastException();
        }
    }

    public static void O(m4.p pVar, r5.h0 h0Var) {
        h0Var.b(new m4.q(pVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void P(z7.c cVar) throws Exception {
        if (cVar instanceof AutoCloseable) {
            cVar.close();
            return;
        }
        if (cVar instanceof ExecutorService) {
            p4.z.q((ExecutorService) cVar);
            return;
        }
        if (cVar instanceof TypedArray) {
            ((TypedArray) cVar).recycle();
            return;
        }
        if (cVar instanceof MediaMetadataRetriever) {
            ((MediaMetadataRetriever) cVar).release();
            return;
        }
        if (cVar instanceof MediaDrm) {
            ((MediaDrm) cVar).release();
        } else if (cVar instanceof DrmManagerClient) {
            ((DrmManagerClient) cVar).release();
        } else {
            if (!(cVar instanceof ContentProviderClient)) {
                throw new IllegalArgumentException();
            }
            ((ContentProviderClient) cVar).release();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11, types: [j1.p] */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14, types: [j1.p] */
    /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [z0.e] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6, types: [z0.e] */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r8v0, types: [h2.e, i2.m] */
    public static Object a(h2.e eVar, h2.g gVar) {
        d1 d1Var;
        j1.p pVar = (j1.p) eVar;
        if (!pVar.f9690a.f9703n) {
            f2.a.a("ModifierLocal accessed from an unattached node");
        }
        if (!pVar.f9690a.f9703n) {
            f2.a.b("visitAncestors called on an unattached node");
        }
        j1.p pVar2 = pVar.f9690a.f9694e;
        i2.j0 j0VarY = i2.f.y(eVar);
        while (j0VarY != null) {
            if ((j0VarY.F.f8667f.f9693d & 32) != 0) {
                while (pVar2 != null) {
                    if ((pVar2.f9692c & 32) != 0) {
                        ?? F = pVar2;
                        ?? eVar2 = 0;
                        while (F != 0) {
                            if (F instanceof h2.e) {
                                h2.e eVar3 = (h2.e) F;
                                if (eVar3.K().C(gVar)) {
                                    return eVar3.K().I(gVar);
                                }
                            } else if ((F.f9692c & 32) != 0 && (F instanceof i2.n)) {
                                j1.p pVar3 = ((i2.n) F).f8789p;
                                int i10 = 0;
                                F = F;
                                eVar2 = eVar2;
                                while (pVar3 != null) {
                                    if ((pVar3.f9692c & 32) != 0) {
                                        i10++;
                                        eVar2 = eVar2;
                                        if (i10 == 1) {
                                            F = pVar3;
                                        } else {
                                            if (eVar2 == 0) {
                                                eVar2 = new z0.e(new j1.p[16]);
                                            }
                                            if (F != 0) {
                                                eVar2.b(F);
                                                F = 0;
                                            }
                                            eVar2.b(pVar3);
                                        }
                                    }
                                    pVar3 = pVar3.f9695f;
                                    F = F;
                                    eVar2 = eVar2;
                                }
                                if (i10 == 1) {
                                }
                            }
                            F = i2.f.f(eVar2);
                        }
                    }
                    pVar2 = pVar2.f9694e;
                }
            }
            j0VarY = j0VarY.v();
            pVar2 = (j0VarY == null || (d1Var = j0VarY.F) == null) ? null : d1Var.f8666e;
        }
        return gVar.f8112a.b();
    }

    public static int b(g2.f0 f0Var, q0 q0Var, u0 u0Var, int i10) {
        return f0Var.g(new g2.b0(q0Var, q0Var.getLayoutDirection()), new g2.q(u0Var, y0.f7321b, z0.f7338b, 1), f3.b.b(i10, 0, 13)).b();
    }

    public static int c(v0 v0Var, g2.y yVar, List list, int i10) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            arrayList.add(new g2.q((u0) list.get(i11), g2.z.f7335b, g2.a0.f7154b, 0));
        }
        return v0Var.h(new g2.b0(yVar, yVar.getLayoutDirection()), arrayList, f3.b.b(i10, 0, 13)).b();
    }

    public static int d(i2.z zVar, g2.y yVar, u0 u0Var, int i10) {
        return zVar.g(new g2.b0(yVar, yVar.getLayoutDirection()), new g2.q(u0Var, i1.f8730b, i2.j1.f8769b, 2), f3.b.b(i10, 0, 13)).b();
    }

    public static int e(g2.f0 f0Var, q0 q0Var, u0 u0Var, int i10) {
        return f0Var.g(new g2.b0(q0Var, q0Var.getLayoutDirection()), new g2.q(u0Var, y0.f7321b, z0.f7337a, 1), f3.b.b(0, i10, 7)).h();
    }

    public static int f(v0 v0Var, g2.y yVar, List list, int i10) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            arrayList.add(new g2.q((u0) list.get(i11), g2.z.f7335b, g2.a0.f7153a, 0));
        }
        return v0Var.h(new g2.b0(yVar, yVar.getLayoutDirection()), arrayList, f3.b.b(0, i10, 7)).h();
    }

    public static int g(i2.z zVar, g2.y yVar, u0 u0Var, int i10) {
        return zVar.g(new g2.b0(yVar, yVar.getLayoutDirection()), new g2.q(u0Var, i1.f8730b, i2.j1.f8768a, 2), f3.b.b(0, i10, 7)).h();
    }

    public static e3.o h(e3.o oVar, e3.o oVar2) {
        boolean z10 = oVar2 instanceof e3.b;
        if (!z10 || !(oVar instanceof e3.b)) {
            return (!z10 || (oVar instanceof e3.b)) ? (z10 || !(oVar instanceof e3.b)) ? oVar2.c(new n0(8, oVar)) : oVar : oVar2;
        }
        e3.b bVar = (e3.b) oVar2;
        q1.j0 j0Var = bVar.f6064a;
        float f10 = bVar.f6065b;
        if (Float.isNaN(f10)) {
            f10 = ((e3.b) oVar).f6065b;
        }
        return new e3.b(j0Var, f10);
    }

    public static int i(g2.f0 f0Var, q0 q0Var, u0 u0Var, int i10) {
        return f0Var.g(new g2.b0(q0Var, q0Var.getLayoutDirection()), new g2.q(u0Var, y0.f7320a, z0.f7338b, 1), f3.b.b(i10, 0, 13)).b();
    }

    public static int j(v0 v0Var, g2.y yVar, List list, int i10) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            arrayList.add(new g2.q((u0) list.get(i11), g2.z.f7334a, g2.a0.f7154b, 0));
        }
        return v0Var.h(new g2.b0(yVar, yVar.getLayoutDirection()), arrayList, f3.b.b(i10, 0, 13)).b();
    }

    public static int k(i2.z zVar, g2.y yVar, u0 u0Var, int i10) {
        return zVar.g(new g2.b0(yVar, yVar.getLayoutDirection()), new g2.q(u0Var, i1.f8729a, i2.j1.f8769b, 2), f3.b.b(i10, 0, 13)).b();
    }

    public static int l(g2.f0 f0Var, q0 q0Var, u0 u0Var, int i10) {
        return f0Var.g(new g2.b0(q0Var, q0Var.getLayoutDirection()), new g2.q(u0Var, y0.f7320a, z0.f7337a, 1), f3.b.b(0, i10, 7)).h();
    }

    public static int m(v0 v0Var, g2.y yVar, List list, int i10) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            arrayList.add(new g2.q((u0) list.get(i11), g2.z.f7334a, g2.a0.f7153a, 0));
        }
        return v0Var.h(new g2.b0(yVar, yVar.getLayoutDirection()), arrayList, f3.b.b(0, i10, 7)).h();
    }

    public static int n(i2.z zVar, g2.y yVar, u0 u0Var, int i10) {
        return zVar.g(new g2.b0(yVar, yVar.getLayoutDirection()), new g2.q(u0Var, i1.f8729a, i2.j1.f8768a, 2), f3.b.b(0, i10, 7)).h();
    }

    public static void o(androidx.lifecycle.x xVar) {
        jc.l.e(xVar, "owner");
    }

    public static void p(e1 e1Var, h2.g gVar, Object obj) {
        h2.h hVar = e1Var.f17285q;
        h2.h hVar2 = e1Var.f17285q;
        if (hVar == h2.b.f8105d) {
            f2.a.a("In order to provide locals you must override providedValues: ModifierLocalMap");
        }
        if (!hVar2.C(gVar)) {
            f2.a.a("Any provided key must be initially provided in the overridden providedValues: ModifierLocalMap property. Key " + gVar + " was not found.");
        }
        hVar2.h0(gVar, obj);
    }

    public static int q(float f10, f3.c cVar) {
        float fQ = cVar.Q(f10);
        if (Float.isInfinite(fQ)) {
            return Integer.MAX_VALUE;
        }
        return Math.round(fQ);
    }

    public static j1.q r(j1.q qVar, j1.q qVar2) {
        return qVar2 == j1.n.f9689a ? qVar : new j1.j(qVar, qVar2);
    }

    public static float s(long j10, f3.c cVar) {
        float fC;
        float fM;
        if (!f3.p.a(f3.o.b(j10), 4294967296L)) {
            f3.i.b("Only Sp can convert to Px");
        }
        float[] fArr = g3.b.f7340a;
        if (cVar.M() >= 1.03f) {
            g3.a aVarA = g3.b.a(cVar.M());
            fC = f3.o.c(j10);
            if (aVarA != null) {
                return aVarA.b(fC);
            }
            fM = cVar.M();
        } else {
            fC = f3.o.c(j10);
            fM = cVar.M();
        }
        return fM * fC;
    }

    public static long t(long j10, f3.c cVar) {
        if (j10 != 9205357640488583168L) {
            return a2.c.e(cVar.J(Float.intBitsToFloat((int) (j10 >> 32))), cVar.J(Float.intBitsToFloat((int) (j10 & 4294967295L))));
        }
        return 9205357640488583168L;
    }

    public static float u(long j10, f3.c cVar) {
        if (!f3.p.a(f3.o.b(j10), 4294967296L)) {
            f3.i.b("Only Sp can convert to Px");
        }
        return cVar.Q(cVar.r(j10));
    }

    public static long v(long j10, f3.c cVar) {
        if (j10 == 9205357640488583168L) {
            return 9205357640488583168L;
        }
        float fQ = cVar.Q(f3.h.b(j10));
        float fQ2 = cVar.Q(f3.h.a(j10));
        return (((long) Float.floatToRawIntBits(fQ)) << 32) | (((long) Float.floatToRawIntBits(fQ2)) & 4294967295L);
    }

    public static long w(float f10, f3.c cVar) {
        float[] fArr = g3.b.f7340a;
        if (cVar.M() < 1.03f) {
            return lc.b.H(f10 / cVar.M(), 4294967296L);
        }
        g3.a aVarA = g3.b.a(cVar.M());
        return lc.b.H(aVarA != null ? aVarA.a(f10) : f10 / cVar.M(), 4294967296L);
    }

    public static j1.q x(d dVar) {
        r.z0 z0VarQ = r.d.q(5, null);
        long j10 = 1;
        r.z0 z0VarQ2 = r.d.q(1, new f3.j((j10 & 4294967295L) | (j10 << 32)));
        r.z0 z0VarQ3 = r.d.q(5, null);
        dVar.getClass();
        return new LazyLayoutAnimateItemElement(z0VarQ, z0VarQ2, z0VarQ3);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object z(d9.s r6, long r7, ac.c r9) {
        /*
            boolean r0 = r9 instanceof d9.p
            if (r0 == 0) goto L13
            r0 = r9
            d9.p r0 = (d9.p) r0
            int r1 = r0.f5592h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f5592h = r1
            goto L18
        L13:
            d9.p r0 = new d9.p
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.f5590f
            int r1 = r0.f5592h
            r2 = 0
            r3 = 2
            r4 = 1
            zb.a r5 = zb.a.f26667a
            if (r1 == 0) goto L3d
            if (r1 == r4) goto L37
            if (r1 != r3) goto L2f
            java.util.List r6 = r0.f5588d
            java.util.List r6 = (java.util.List) r6
            ub.a.f(r9)
            return r6
        L2f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L37:
            long r7 = r0.f5589e
            ub.a.f(r9)
            goto L53
        L3d:
            ub.a.f(r9)
            r0.f5589e = r7
            r0.f5592h = r4
            n7.v r6 = r6.f5598a
            d9.l r9 = new d9.l
            r1 = 4
            r9.<init>(r7, r1)
            java.lang.Object r9 = ua.l.X(r6, r4, r2, r9, r0)
            if (r9 != r5) goto L53
            goto L6e
        L53:
            java.util.List r9 = (java.util.List) r9
            pf.e r6 = hf.l0.f8566a
            pf.d r6 = pf.d.f17138c
            d9.q r1 = new d9.q
            r4 = 0
            r1.<init>(r9, r4, r2)
            r2 = r9
            java.util.List r2 = (java.util.List) r2
            r0.f5588d = r2
            r0.f5589e = r7
            r0.f5592h = r3
            java.lang.Object r6 = hf.a0.H(r6, r1, r0)
            if (r6 != r5) goto L6f
        L6e:
            return r5
        L6f:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: a0.c.z(d9.s, long, ac.c):java.lang.Object");
    }
}
