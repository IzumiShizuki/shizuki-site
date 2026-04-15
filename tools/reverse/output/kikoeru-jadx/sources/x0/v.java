package x0;

import b7.c3;
import com.tencent.bugly.beta.tinker.TinkerReport;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f24511a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final f0 f24512b = new f0();

    public static final void A(ic.n nVar, Object obj, o oVar) {
        if (oVar.S || !jc.l.a(oVar.K(), obj)) {
            oVar.h0(obj);
            oVar.b(nVar, obj);
        }
    }

    public static final i7.n B(ic.a aVar) {
        return new i7.n(new ea.f(aVar, null));
    }

    public static final int C(o.x xVar) {
        int iC;
        int i10 = xVar.f16071b;
        int iC2 = xVar.c(0);
        while (xVar.f16071b != 0 && xVar.c(0) == iC2) {
            xVar.f(0, xVar.d());
            xVar.e(xVar.f16071b - 1);
            int i11 = xVar.f16071b;
            int i12 = i11 >>> 1;
            int i13 = 0;
            while (i13 < i12) {
                int iC3 = xVar.c(i13);
                int i14 = (i13 + 1) * 2;
                int i15 = i14 - 1;
                int iC4 = xVar.c(i15);
                if (i14 >= i11 || (iC = xVar.c(i14)) <= iC4) {
                    if (iC4 > iC3) {
                        xVar.f(i13, iC4);
                        xVar.f(i15, iC3);
                        i13 = i15;
                    }
                } else if (iC > iC3) {
                    xVar.f(i13, iC);
                    xVar.f(i14, iC3);
                    i13 = i14;
                }
            }
        }
        return iC2;
    }

    public static final int D(int i10) {
        int i11 = 306783378 & i10;
        int i12 = 613566756 & i10;
        return (i10 & (-920350135)) | (i12 >> 1) | i11 | ((i11 << 1) & i12);
    }

    public static final f1.k E(n1[] n1VarArr, j1 j1Var, j1 j1Var2) {
        f1.k kVar = f1.k.f6633d;
        f1.j jVar = new f1.j(kVar);
        jVar.f6632g = kVar;
        for (n1 n1Var : n1VarArr) {
            m1 m1Var = n1Var.f24369a;
            if (n1Var.f24374f || !((f1.k) j1Var).containsKey(m1Var)) {
                jVar.put(m1Var, m1Var.c(n1Var, (r2) ((f1.k) j1Var2).get(m1Var)));
            }
        }
        return jVar.build();
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(x0.n1 r11, ic.n r12, x0.o r13, int r14) {
        /*
            Method dump skipped, instruction units count: 220
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: x0.v.a(x0.n1, ic.n, x0.o, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(x0.n1[] r8, ic.n r9, x0.o r10, int r11) {
        /*
            r0 = 415205898(0x18bf8a0a, float:4.9511727E-24)
            r10.Y(r0)
            i2.v r0 = r10.f24398x
            x0.j1 r1 = r10.l()
            r2 = 201(0xc9, float:2.82E-43)
            x0.y0 r3 = x0.p.f24409b
            r10.T(r2, r3)
            boolean r2 = r10.S
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L27
            f1.k r2 = f1.k.f6633d
            f1.k r2 = E(r8, r1, r2)
            f1.k r1 = r10.g0(r1, r2)
            r10.J = r3
        L25:
            r2 = 0
            goto L74
        L27:
            x0.z1 r2 = r10.G
            int r5 = r2.f24535g
            java.lang.Object r2 = r2.h(r5, r4)
            java.lang.String r5 = "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap"
            jc.l.c(r2, r5)
            x0.j1 r2 = (x0.j1) r2
            x0.z1 r6 = r10.G
            int r7 = r6.f24535g
            java.lang.Object r6 = r6.h(r7, r3)
            jc.l.c(r6, r5)
            x0.j1 r6 = (x0.j1) r6
            f1.k r5 = E(r8, r1, r6)
            boolean r7 = r10.z()
            if (r7 == 0) goto L65
            boolean r7 = r10.f24399y
            if (r7 != 0) goto L65
            boolean r6 = r6.equals(r5)
            if (r6 != 0) goto L58
            goto L65
        L58:
            int r1 = r10.f24386l
            x0.z1 r5 = r10.G
            int r5 = r5.s()
            int r5 = r5 + r1
            r10.f24386l = r5
            r1 = r2
            goto L25
        L65:
            f1.k r1 = r10.g0(r1, r5)
            boolean r5 = r10.f24399y
            if (r5 != 0) goto L73
            boolean r2 = jc.l.a(r1, r2)
            if (r2 != 0) goto L25
        L73:
            r2 = 1
        L74:
            if (r2 == 0) goto L7d
            boolean r5 = r10.S
            if (r5 != 0) goto L7d
            r10.I(r1)
        L7d:
            boolean r5 = r10.f24397w
            r0.c(r5)
            r10.f24397w = r2
            r10.K = r1
            r2 = 202(0xca, float:2.83E-43)
            x0.y0 r5 = x0.p.f24410c
            r10.R(r5, r2, r1, r4)
            int r1 = r11 >> 3
            r1 = r1 & 14
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r9.q(r10, r1)
            r10.p(r4)
            r10.p(r4)
            int r0 = r0.b()
            if (r0 == 0) goto La5
            goto La6
        La5:
            r3 = 0
        La6:
            r10.f24397w = r3
            r0 = 0
            r10.K = r0
            x0.p1 r10 = r10.r()
            if (r10 == 0) goto Lb9
            f1.b r0 = new f1.b
            r1 = 6
            r0.<init>(r8, r9, r11, r1)
            r10.f24421d = r0
        Lb9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: x0.v.b(x0.n1[], ic.n, x0.o, int):void");
    }

    public static final void c(Object obj, ic.k kVar, o oVar) {
        boolean zF = oVar.f(obj);
        Object objK = oVar.K();
        if (zF || objK == k.f24334a) {
            objK = new d0(kVar);
            oVar.h0(objK);
        }
    }

    public static final void d(Object obj, Object obj2, ic.k kVar, o oVar) {
        boolean zF = oVar.f(obj) | oVar.f(obj2);
        Object objK = oVar.K();
        if (zF || objK == k.f24334a) {
            objK = new d0(kVar);
            oVar.h0(objK);
        }
    }

    public static final void e(ic.n nVar, Object obj, o oVar) {
        yb.h hVar = oVar.R;
        boolean zF = oVar.f(obj);
        Object objK = oVar.K();
        if (zF || objK == k.f24334a) {
            objK = new p0(hVar, nVar);
            oVar.h0(objK);
        }
    }

    public static final void f(Object obj, Object obj2, ic.n nVar, o oVar) {
        yb.h hVar = oVar.R;
        boolean zF = oVar.f(obj) | oVar.f(obj2);
        Object objK = oVar.K();
        if (zF || objK == k.f24334a) {
            objK = new p0(hVar, nVar);
            oVar.h0(objK);
        }
    }

    public static final void g(ta.c cVar, f3.l lVar, Boolean bool, ic.n nVar, o oVar) {
        yb.h hVar = oVar.R;
        boolean zF = oVar.f(cVar) | oVar.f(lVar) | oVar.f(bool);
        Object objK = oVar.K();
        if (zF || objK == k.f24334a) {
            objK = new p0(hVar, nVar);
            oVar.h0(objK);
        }
    }

    public static final void h(ic.a aVar, o oVar) {
        y0.k0 k0Var = oVar.M.f25297b.f25294a;
        k0Var.J(y0.a0.f25295d);
        ud.n.B(k0Var, 0, aVar);
    }

    public static final void i(o.x xVar, int i10) {
        if (xVar.f16071b == 0 || !(xVar.c(0) == i10 || xVar.c(xVar.f16071b - 1) == i10)) {
            int i11 = xVar.f16071b;
            xVar.a(i10);
            while (i11 > 0) {
                int i12 = ((i11 + 1) >>> 1) - 1;
                int iC = xVar.c(i12);
                if (i10 <= iC) {
                    break;
                }
                xVar.f(i11, iC);
                i11 = i12;
            }
            xVar.f(i11, i10);
        }
    }

    public static void j(d2 d2Var, List list, u uVar) {
        List list2 = list;
        if (list2.isEmpty()) {
            return;
        }
        int size = list2.size();
        for (int i10 = 0; i10 < size; i10++) {
            int iC = d2Var.c((a) list.get(i10));
            int iM = d2Var.M(d2Var.f24266b, d2Var.r(iC));
            Object obj = iM < d2Var.g(d2Var.f24266b, d2Var.r(iC + 1)) ? d2Var.f24267c[d2Var.h(iM)] : k.f24334a;
            p1 p1Var = obj instanceof p1 ? (p1) obj : null;
            if (p1Var != null) {
                p1Var.f24418a = uVar;
            }
        }
    }

    public static final w0 l(lf.z0 z0Var, o oVar) {
        Object value = z0Var.getValue();
        Object obj = yb.i.f26088a;
        boolean zH = oVar.h(obj) | oVar.h(z0Var);
        Object objK = oVar.K();
        yb.c cVar = null;
        Object obj2 = k.f24334a;
        if (zH || objK == obj2) {
            objK = new q.q(obj, z0Var, cVar, 20);
            oVar.h0(objK);
        }
        ic.n nVar = (ic.n) objK;
        Object objK2 = oVar.K();
        if (objK2 == obj2) {
            objK2 = v(value);
            oVar.h0(objK2);
        }
        w0 w0Var = (w0) objK2;
        boolean zH2 = oVar.h(nVar);
        Object objK3 = oVar.K();
        if (zH2 || objK3 == obj2) {
            objK3 = new k2(nVar, w0Var, cVar, 1);
            oVar.h0(objK3);
        }
        f(z0Var, obj, (ic.n) objK3, oVar);
        return w0Var;
    }

    public static final hf.y m(o oVar) {
        return new x1(oVar.R);
    }

    public static final z0.e n() {
        c7.e1 e1Var = j2.f24333b;
        z0.e eVar = (z0.e) e1Var.y();
        if (eVar != null) {
            return eVar;
        }
        z0.e eVar2 = new z0.e(new h1.w[0]);
        e1Var.Z(eVar2);
        return eVar2;
    }

    public static final c0 o(ic.a aVar) {
        c7.e1 e1Var = j2.f24332a;
        return new c0(aVar, null);
    }

    public static final c0 p(ic.a aVar, i2 i2Var) {
        c7.e1 e1Var = j2.f24332a;
        return new c0(aVar, i2Var);
    }

    public static final int q(o oVar) {
        long j10 = oVar.T;
        return (int) (j10 ^ (j10 >>> 32));
    }

    public static final p1 r(o oVar) {
        p1 p1VarW = oVar.w();
        if (p1VarW == null) {
            throw new IllegalStateException("no recompose scope found");
        }
        oVar.getClass();
        p1VarW.f24419b |= 1;
        return p1VarW;
    }

    public static final s0 s(yb.h hVar) {
        s0 s0Var = (s0) hVar.R(r0.f24435b);
        if (s0Var != null) {
            return s0Var;
        }
        throw new IllegalStateException("A MonotonicFrameClock is not available in this CoroutineContext. Callers should supply an appropriate MonotonicFrameClock using withContext.");
    }

    public static List u(d2 d2Var, int i10, d2 d2Var2, boolean z10, boolean z11, boolean z12) {
        List list;
        boolean z13;
        int i11;
        int i12;
        int iT = d2Var.t(i10);
        int i13 = i10 + iT;
        int iF = d2Var.f(i10);
        int iF2 = d2Var.f(i13);
        int i14 = iF2 - iF;
        boolean z14 = i10 >= 0 && (d2Var.f24266b[(d2Var.r(i10) * 5) + 1] & 201326592) != 0;
        d2Var2.v(iT);
        d2Var2.w(i14, d2Var2.f24284t);
        if (d2Var.f24271g < i13) {
            d2Var.A(i13);
        }
        if (d2Var.f24275k < iF2) {
            d2Var.B(iF2, i13);
        }
        int[] iArr = d2Var2.f24266b;
        int i15 = d2Var2.f24284t;
        int i16 = i15 * 5;
        vb.l.h0(i16, i10 * 5, i13 * 5, d2Var.f24266b, iArr);
        Object[] objArr = d2Var2.f24267c;
        int i17 = d2Var2.f24273i;
        System.arraycopy(d2Var.f24267c, iF, objArr, i17, i14);
        int i18 = d2Var2.f24286v;
        iArr[i16 + 2] = i18;
        int i19 = i15 - i10;
        int i20 = i15 + iT;
        int iG = i17 - d2Var2.g(iArr, i15);
        int i21 = d2Var2.f24277m;
        int i22 = d2Var2.f24276l;
        int length = objArr.length;
        boolean z15 = z14;
        int i23 = i21;
        int i24 = i15;
        while (i24 < i20) {
            if (i24 != i15) {
                int i25 = (i24 * 5) + 2;
                iArr[i25] = iArr[i25] + i19;
            }
            int[] iArr2 = iArr;
            int iG2 = d2Var2.g(iArr, i24) + iG;
            if (i23 < i24) {
                i11 = i15;
                i12 = 0;
            } else {
                i11 = i15;
                i12 = d2Var2.f24275k;
            }
            iArr2[(i24 * 5) + 4] = d2.i(iG2, i12, i22, length);
            if (i24 == i23) {
                i23++;
            }
            i24++;
            i15 = i11;
            iArr = iArr2;
        }
        int[] iArr3 = iArr;
        d2Var2.f24277m = i23;
        int iB = c2.b(d2Var.f24268d, i10, d2Var.p());
        int iB2 = c2.b(d2Var.f24268d, i13, d2Var.p());
        if (iB < iB2) {
            ArrayList arrayList = d2Var.f24268d;
            ArrayList arrayList2 = new ArrayList(iB2 - iB);
            for (int i26 = iB; i26 < iB2; i26++) {
                a aVar = (a) arrayList.get(i26);
                aVar.f24233a += i19;
                arrayList2.add(aVar);
            }
            d2Var2.f24268d.addAll(c2.b(d2Var2.f24268d, d2Var2.f24284t, d2Var2.p()), arrayList2);
            arrayList.subList(iB, iB2).clear();
            list = arrayList2;
        } else {
            list = vb.r.f22819a;
        }
        List list2 = list;
        if (!list2.isEmpty()) {
            HashMap map = d2Var.f24269e;
            HashMap map2 = d2Var2.f24269e;
            if (map != null && map2 != null) {
                int size = list2.size();
                for (int i27 = 0; i27 < size; i27++) {
                }
            }
        }
        int i28 = d2Var2.f24286v;
        d2Var2.N(i18);
        int iD = d2Var.D(d2Var.f24266b, i10);
        if (!z12) {
            z13 = false;
        } else if (z10) {
            boolean z16 = iD >= 0;
            if (z16) {
                d2Var.O();
                d2Var.a(iD - d2Var.f24284t);
                d2Var.O();
            }
            d2Var.a(i10 - d2Var.f24284t);
            boolean zG = d2Var.G();
            if (z16) {
                d2Var.L();
                d2Var.j();
                d2Var.L();
                d2Var.j();
            }
            z13 = zG;
        } else {
            boolean zH = d2Var.H(i10, iT);
            d2Var.I(iF, i14, i10 - 1);
            z13 = zH;
        }
        if (z13) {
            p.c("Unexpectedly removed anchors");
        }
        int i29 = d2Var2.f24279o;
        int i30 = iArr3[i16 + 1];
        d2Var2.f24279o = i29 + ((1073741824 & i30) != 0 ? 1 : i30 & 67108863);
        if (z11) {
            d2Var2.f24284t = i20;
            d2Var2.f24273i = i17 + i14;
        }
        if (z15) {
            d2Var2.S(i18);
        }
        return list;
    }

    public static e1 v(Object obj) {
        return new e1(obj, r0.f24439f);
    }

    public static final Object w(j1 j1Var, m1 m1Var) {
        jc.l.c(m1Var, "null cannot be cast to non-null type androidx.compose.runtime.CompositionLocal<kotlin.Any?>");
        f1.k kVar = (f1.k) j1Var;
        Object objB = kVar.get(m1Var);
        if (objB == null) {
            objB = m1Var.b();
        }
        return ((r2) objB).a(kVar);
    }

    public static final n x(o oVar) {
        o oVar2;
        oVar.T(TinkerReport.KEY_APPLIED_FAIL_COST_10S_LESS, p.f24412e);
        if (oVar.S) {
            d2.y(oVar.I);
        }
        Object objC = oVar.C();
        m mVar = objC instanceof m ? (m) objC : null;
        if (mVar == null) {
            oVar2 = oVar;
            mVar = new m(new n(oVar2, oVar.T, oVar.f24391q, oVar.C, oVar.f24382h.f24507r));
            oVar2.i0(mVar);
        } else {
            oVar2 = oVar;
        }
        n nVar = mVar.f24350a;
        nVar.f24365f.setValue(oVar2.l());
        oVar2.p(false);
        return nVar;
    }

    public static final w0 y(Object obj, o oVar) {
        Object objK = oVar.K();
        if (objK == k.f24334a) {
            objK = v(obj);
            oVar.h0(objK);
        }
        w0 w0Var = (w0) objK;
        w0Var.setValue(obj);
        return w0Var;
    }

    public abstract void k();

    public abstract void t();

    public abstract boolean z(c3 c3Var);
}
