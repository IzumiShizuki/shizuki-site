package ud;

import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Set f21578b = e.X(vd.a.f22933e);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Set f21579c = vb.l.N0(new vd.a[]{vd.a.f22934f, vd.a.f22937i});

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final yd.e f21580d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final yd.e f21581e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public oe.i f21582a;

    static {
        new yd.e(new int[]{1, 1, 2}, false);
        f21580d = new yd.e(new int[]{1, 1, 11}, false);
        f21581e = new yd.e(new int[]{1, 1, 13}, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final qe.p a(yc.d0 r17, dd.c r18) {
        /*
            r16 = this;
            r1 = r16
            r3 = r18
            java.lang.String r2 = "Could not read data from "
            java.lang.String r0 = "kotlinClass"
            jc.l.e(r3, r0)
            i5.f r0 = r3.f5867b
            java.lang.Object r4 = r0.f9021e
            java.lang.String[] r4 = (java.lang.String[]) r4
            if (r4 != 0) goto L17
            java.lang.Object r4 = r0.f9022f
            java.lang.String[] r4 = (java.lang.String[]) r4
        L17:
            r5 = 0
            if (r4 == 0) goto L27
            java.lang.Object r6 = r0.f9019c
            vd.a r6 = (vd.a) r6
            java.util.Set r7 = ud.g.f21579c
            boolean r6 = r7.contains(r6)
            if (r6 == 0) goto L27
            goto L28
        L27:
            r4 = r5
        L28:
            if (r4 != 0) goto L2b
            goto L6b
        L2b:
            java.lang.Object r6 = r0.f9020d
            r11 = r6
            yd.e r11 = (yd.e) r11
            java.lang.Object r0 = r0.f9023g
            java.lang.String[] r0 = (java.lang.String[]) r0
            if (r0 != 0) goto L37
            goto L6b
        L37:
            ub.k r0 = ae.g.h(r4, r0)     // Catch: java.lang.Throwable -> L3c ce.s -> L3e
            goto L69
        L3c:
            r0 = move-exception
            goto L55
        L3e:
            r0 = move-exception
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L3c
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3c
            r6.<init>(r2)     // Catch: java.lang.Throwable -> L3c
            java.lang.String r2 = r3.a()     // Catch: java.lang.Throwable -> L3c
            r6.append(r2)     // Catch: java.lang.Throwable -> L3c
            java.lang.String r2 = r6.toString()     // Catch: java.lang.Throwable -> L3c
            r4.<init>(r2, r0)     // Catch: java.lang.Throwable -> L3c
            throw r4     // Catch: java.lang.Throwable -> L3c
        L55:
            oe.i r2 = r1.c()
            oe.j r2 = r2.f16366c
            r2.getClass()
            yd.e r2 = r1.e()
            boolean r2 = r11.b(r2)
            if (r2 != 0) goto Lad
            r0 = r5
        L69:
            if (r0 != 0) goto L6c
        L6b:
            return r5
        L6c:
            java.lang.Object r2 = r0.f21543a
            r5 = r2
            ae.f r5 = (ae.f) r5
            java.lang.Object r0 = r0.f21544b
            r4 = r0
            wd.f0 r4 = (wd.f0) r4
            ud.i r2 = new ud.i
            r1.d(r3)
            boolean r6 = r1.f(r3)
            qe.i r7 = r1.b(r3)
            r2.<init>(r3, r4, r5, r6, r7)
            qe.p r7 = new qe.p
            oe.i r13 = r1.c()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r3 = "scope for "
            r0.<init>(r3)
            r0.append(r2)
            java.lang.String r3 = " in "
            r0.append(r3)
            r8 = r17
            r0.append(r8)
            java.lang.String r14 = r0.toString()
            ud.f r15 = ud.f.f21577a
            r12 = r2
            r9 = r4
            r10 = r5
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15)
            return r7
        Lad:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ud.g.a(yc.d0, dd.c):qe.p");
    }

    public final qe.i b(dd.c cVar) {
        c().f16366c.getClass();
        int i10 = cVar.f5867b.f9018b;
        return ((i10 & 16) == 0 || (i10 & 32) != 0) ? qe.i.f18188a : qe.i.f18189b;
    }

    public final oe.i c() {
        oe.i iVar = this.f21582a;
        if (iVar != null) {
            return iVar;
        }
        jc.l.k("components");
        throw null;
    }

    public final oe.o d(dd.c cVar) {
        c().f16366c.getClass();
        if (((yd.e) cVar.f5867b.f9020d).b(e())) {
            return null;
        }
        yd.e eVar = (yd.e) cVar.f5867b.f9020d;
        yd.e eVar2 = yd.e.f26197g;
        yd.e eVarE = e();
        yd.e eVarE2 = e();
        boolean z10 = eVar.f26199f;
        eVarE2.getClass();
        yd.e eVar3 = z10 ? eVar2 : yd.e.f26198h;
        int i10 = eVar3.f26166b;
        int i11 = eVarE2.f26166b;
        if (i10 > i11 || (i10 >= i11 && eVar3.f26167c > eVarE2.f26167c)) {
            eVarE2 = eVar3;
        }
        return new oe.o(eVar, eVar2, eVarE, eVarE2, cVar.a());
    }

    public final yd.e e() {
        c().f16366c.getClass();
        return yd.e.f26197g;
    }

    public final boolean f(dd.c cVar) {
        c().f16366c.getClass();
        c().f16366c.getClass();
        i5.f fVar = cVar.f5867b;
        return (fVar.f9018b & 2) != 0 && ((yd.e) fVar.f9020d).equals(f21580d);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final oe.d g(dd.c r7) {
        /*
            r6 = this;
            java.lang.String r0 = "Could not read data from "
            i5.f r1 = r7.f5867b
            java.lang.Object r2 = r1.f9021e
            java.lang.String[] r2 = (java.lang.String[]) r2
            if (r2 != 0) goto Le
            java.lang.Object r2 = r1.f9022f
            java.lang.String[] r2 = (java.lang.String[]) r2
        Le:
            r3 = 0
            if (r2 == 0) goto L1e
            java.lang.Object r4 = r1.f9019c
            vd.a r4 = (vd.a) r4
            java.util.Set r5 = ud.g.f21578b
            boolean r4 = r5.contains(r4)
            if (r4 == 0) goto L1e
            goto L1f
        L1e:
            r2 = r3
        L1f:
            if (r2 != 0) goto L22
            goto L61
        L22:
            java.lang.Object r4 = r1.f9020d
            yd.e r4 = (yd.e) r4
            java.lang.Object r1 = r1.f9023g
            java.lang.String[] r1 = (java.lang.String[]) r1
            if (r1 != 0) goto L2d
            goto L61
        L2d:
            ub.k r0 = ae.g.f(r2, r1)     // Catch: java.lang.Throwable -> L32 ce.s -> L34
            goto L5f
        L32:
            r0 = move-exception
            goto L4b
        L34:
            r1 = move-exception
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L32
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L32
            r5.<init>(r0)     // Catch: java.lang.Throwable -> L32
            java.lang.String r0 = r7.a()     // Catch: java.lang.Throwable -> L32
            r5.append(r0)     // Catch: java.lang.Throwable -> L32
            java.lang.String r0 = r5.toString()     // Catch: java.lang.Throwable -> L32
            r2.<init>(r0, r1)     // Catch: java.lang.Throwable -> L32
            throw r2     // Catch: java.lang.Throwable -> L32
        L4b:
            oe.i r1 = r6.c()
            oe.j r1 = r1.f16366c
            r1.getClass()
            yd.e r1 = r6.e()
            boolean r1 = r4.b(r1)
            if (r1 != 0) goto L85
            r0 = r3
        L5f:
            if (r0 != 0) goto L62
        L61:
            return r3
        L62:
            java.lang.Object r1 = r0.f21543a
            ae.f r1 = (ae.f) r1
            java.lang.Object r0 = r0.f21544b
            wd.k r0 = (wd.k) r0
            ud.r r2 = new ud.r
            r6.d(r7)
            qe.v r3 = new qe.v
            boolean r5 = r6.f(r7)
            r3.<init>(r5)
            qe.i r5 = r6.b(r7)
            r2.<init>(r7, r3, r5)
            oe.d r7 = new oe.d
            r7.<init>(r1, r0, r4, r2)
            return r7
        L85:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ud.g.g(dd.c):oe.d");
    }
}
