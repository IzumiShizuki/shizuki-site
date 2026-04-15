package m0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class h8 implements ic.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ float f13072a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f13073b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ic.n f13074c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f13075d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f13076e;

    public h8(float f10, long j10, ic.n nVar, boolean z10, long j11) {
        this.f13072a = f10;
        this.f13073b = j10;
        this.f13074c = nVar;
        this.f13075d = z10;
        this.f13076e = j11;
    }

    @Override // ic.n
    public final Object q(Object obj, Object obj2) {
        t2.v vVar;
        t2.u uVar;
        x0.o oVar = (x0.o) obj;
        int iIntValue = ((Number) obj2).intValue();
        if (oVar.N(iIntValue & 1, (iIntValue & 3) != 2)) {
            x0.o2 o2Var = e9.f12960b;
            t2.l0 l0Var = ((d9) oVar.j(o2Var)).f12884g;
            t2.l0 l0Var2 = ((d9) oVar.j(o2Var)).f12889l;
            t2.d0 d0Var = l0Var.f20362a;
            t2.d0 d0Var2 = l0Var2.f20362a;
            e3.o oVar2 = t2.e0.f20316d;
            e3.o oVar3 = d0Var.f20293a;
            e3.o oVar4 = d0Var2.f20293a;
            boolean z10 = oVar3 instanceof e3.b;
            float f10 = this.f13072a;
            e3.o bVar = e3.n.f6087a;
            if (!z10 && !(oVar4 instanceof e3.b)) {
                long jQ = q1.h0.q(oVar3.b(), oVar4.b(), f10);
                if (jQ != 16) {
                    bVar = new e3.c(jQ);
                }
            } else if (z10 && (oVar4 instanceof e3.b)) {
                e3.b bVar2 = (e3.b) oVar3;
                e3.b bVar3 = (e3.b) oVar4;
                q1.m mVar = (q1.m) t2.e0.b(f10, bVar2.f6064a, bVar3.f6064a);
                float fL = android.support.v4.media.session.b.L(bVar2.f6065b, bVar3.f6065b, f10);
                if (mVar != null) {
                    if (mVar instanceof q1.n0) {
                        long jI = gh.g.I(fL, ((q1.n0) mVar).f17562a);
                        if (jI != 16) {
                            bVar = new e3.c(jI);
                        }
                    } else {
                        if (!(mVar instanceof q1.j0)) {
                            throw new ce.j0();
                        }
                        bVar = new e3.b((q1.j0) mVar, fL);
                    }
                }
            } else {
                bVar = (e3.o) t2.e0.b(f10, oVar3, oVar4);
            }
            e3.o oVar5 = bVar;
            x2.n nVar = (x2.n) t2.e0.b(f10, d0Var.f20298f, d0Var2.f20298f);
            long jC = t2.e0.c(d0Var.f20294b, d0Var2.f20294b, f10);
            x2.k kVar = d0Var.f20295c;
            if (kVar == null) {
                kVar = x2.k.f24562d;
            }
            x2.k kVar2 = d0Var2.f20295c;
            if (kVar2 == null) {
                kVar2 = x2.k.f24562d;
            }
            x2.k kVar3 = new x2.k(nh.b.k(android.support.v4.media.session.b.M(f10, kVar.f24566a, kVar2.f24566a), 1, 1000));
            x2.i iVar = (x2.i) t2.e0.b(f10, d0Var.f20296d, d0Var2.f20296d);
            x2.j jVar = (x2.j) t2.e0.b(f10, d0Var.f20297e, d0Var2.f20297e);
            String str = (String) t2.e0.b(f10, d0Var.f20299g, d0Var2.f20299g);
            long jC2 = t2.e0.c(d0Var.f20300h, d0Var2.f20300h, f10);
            e3.a aVar = d0Var.f20301i;
            float f11 = aVar != null ? aVar.f6063a : 0.0f;
            e3.a aVar2 = d0Var2.f20301i;
            float fL2 = android.support.v4.media.session.b.L(f11, aVar2 != null ? aVar2.f6063a : 0.0f, f10);
            e3.p pVar = d0Var.f20302j;
            e3.p pVar2 = e3.p.f6088c;
            if (pVar == null) {
                pVar = pVar2;
            }
            e3.p pVar3 = d0Var2.f20302j;
            if (pVar3 != null) {
                pVar2 = pVar3;
            }
            e3.p pVar4 = new e3.p(android.support.v4.media.session.b.L(pVar.f6089a, pVar2.f6089a, f10), android.support.v4.media.session.b.L(pVar.f6090b, pVar2.f6090b, f10));
            a3.c cVar = (a3.c) t2.e0.b(f10, d0Var.f20303k, d0Var2.f20303k);
            long jQ2 = q1.h0.q(d0Var.f20304l, d0Var2.f20304l, f10);
            e3.l lVar = (e3.l) t2.e0.b(f10, d0Var.f20305m, d0Var2.f20305m);
            q1.k0 k0Var = d0Var.f20306n;
            if (k0Var == null) {
                k0Var = new q1.k0();
            }
            q1.k0 k0Var2 = d0Var2.f20306n;
            if (k0Var2 == null) {
                k0Var2 = new q1.k0();
            }
            q1.k0 k0Var3 = new q1.k0(q1.h0.q(k0Var.f17545a, k0Var2.f17545a, f10), u3.x0.w(k0Var.f17546b, k0Var2.f17546b, f10), android.support.v4.media.session.b.L(k0Var.f17547c, k0Var2.f17547c, f10));
            t2.v vVar2 = d0Var.f20307o;
            t2.v vVar3 = d0Var2.f20307o;
            if (vVar2 == null && vVar3 == null) {
                vVar = null;
            } else {
                if (vVar2 == null) {
                    vVar2 = t2.v.f20400a;
                }
                vVar = vVar2;
            }
            t2.d0 d0Var3 = new t2.d0(oVar5, jC, kVar3, iVar, jVar, nVar, str, jC2, new e3.a(fL2), pVar4, cVar, jQ2, lVar, k0Var3, vVar, (s1.e) t2.e0.b(f10, d0Var.f20308p, d0Var2.f20308p));
            t2.s sVar = l0Var.f20363b;
            t2.s sVar2 = l0Var2.f20363b;
            int i10 = t2.t.f20397b;
            int i11 = ((e3.k) t2.e0.b(f10, new e3.k(sVar.f20387a), new e3.k(sVar2.f20387a))).f6081a;
            int i12 = ((e3.m) t2.e0.b(f10, new e3.m(sVar.f20388b), new e3.m(sVar2.f20388b))).f6086a;
            long jC3 = t2.e0.c(sVar.f20389c, sVar2.f20389c, f10);
            e3.q qVar = sVar.f20390d;
            if (qVar == null) {
                qVar = e3.q.f6091c;
            }
            e3.q qVar2 = sVar2.f20390d;
            if (qVar2 == null) {
                qVar2 = e3.q.f6091c;
            }
            e3.q qVar3 = new e3.q(t2.e0.c(qVar.f6092a, qVar2.f6092a, f10), t2.e0.c(qVar.f6093b, qVar2.f6093b, f10));
            t2.u uVar2 = sVar.f20391e;
            t2.u uVar3 = sVar2.f20391e;
            if (uVar2 == null && uVar3 == null) {
                uVar = null;
            } else {
                t2.u uVar4 = t2.u.f20398b;
                t2.u uVar5 = uVar2 == null ? uVar4 : uVar2;
                boolean z11 = uVar5.f20399a;
                if (uVar3 == null) {
                    uVar3 = uVar4;
                }
                boolean z12 = uVar3.f20399a;
                if (z11 != z12) {
                    ((t2.j) t2.e0.b(f10, new t2.j(), new t2.j())).getClass();
                    uVar5 = new t2.u(((Boolean) t2.e0.b(f10, Boolean.valueOf(z11), Boolean.valueOf(z12))).booleanValue());
                }
                uVar = uVar5;
            }
            t2.l0 l0Var3 = new t2.l0(d0Var3, new t2.s(i11, i12, jC3, qVar3, uVar, (e3.i) t2.e0.b(f10, sVar.f20392f, sVar2.f20392f), ((e3.e) t2.e0.b(f10, new e3.e(sVar.f20393g), new e3.e(sVar2.f20393g))).f6069a, ((e3.d) t2.e0.b(f10, new e3.d(sVar.f20394h), new e3.d(sVar2.f20394h))).f6067a, (e3.s) t2.e0.b(f10, sVar.f20395i, sVar2.f20395i)));
            if (this.f13075d) {
                l0Var3 = t2.l0.a(l0Var3, this.f13076e, 0L, null, null, null, 0L, null, null, 0L, null, null, 16777214);
            }
            m8.b(this.f13073b, l0Var3, this.f13074c, oVar, 384, 0);
        } else {
            oVar.Q();
        }
        return ub.a0.f21526a;
    }
}
