package h0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class u extends jc.m implements ic.n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l0.l1 f7848b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ u0 f7849c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f7850d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f7851e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ic.k f7852f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ y2.y f7853g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ y2.r f7854h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ f3.c f7855i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f7856j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(l0.l1 l1Var, u0 u0Var, boolean z10, boolean z11, ic.k kVar, y2.y yVar, y2.r rVar, f3.c cVar, int i10) {
        super(2);
        this.f7848b = l1Var;
        this.f7849c = u0Var;
        this.f7850d = z10;
        this.f7851e = z11;
        this.f7852f = kVar;
        this.f7853g = yVar;
        this.f7854h = rVar;
        this.f7855i = cVar;
        this.f7856j = i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b7  */
    @Override // ic.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object q(java.lang.Object r12, java.lang.Object r13) {
        /*
            r11 = this;
            x0.o r12 = (x0.o) r12
            java.lang.Number r13 = (java.lang.Number) r13
            int r13 = r13.intValue()
            r0 = r13 & 3
            r1 = 2
            r2 = 1
            r3 = 0
            if (r0 == r1) goto L11
            r0 = 1
            goto L12
        L11:
            r0 = 0
        L12:
            r13 = r13 & r2
            boolean r13 = r12.N(r13, r0)
            if (r13 == 0) goto Lc1
            h0.t r4 = new h0.t
            f3.c r9 = r11.f7855i
            int r10 = r11.f7856j
            h0.u0 r5 = r11.f7849c
            ic.k r6 = r11.f7852f
            y2.y r7 = r11.f7853g
            y2.r r8 = r11.f7854h
            r4.<init>(r5, r6, r7, r8, r9, r10)
            int r13 = x0.v.q(r12)
            x0.j1 r0 = r12.l()
            j1.n r1 = j1.n.f9689a
            j1.q r1 = j1.a.c(r1, r12)
            i2.j r6 = i2.k.f8771g0
            r6.getClass()
            i2.i r6 = i2.j.f8733b
            r12.a0()
            boolean r7 = r12.S
            if (r7 == 0) goto L4a
            r12.k(r6)
            goto L4d
        L4a:
            r12.k0()
        L4d:
            i2.h r6 = i2.j.f8738g
            x0.v.A(r6, r4, r12)
            i2.h r4 = i2.j.f8737f
            x0.v.A(r4, r0, r12)
            i2.h r0 = i2.j.f8741j
            boolean r4 = r12.S
            if (r4 != 0) goto L6b
            java.lang.Object r4 = r12.K()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r13)
            boolean r4 = jc.l.a(r4, r6)
            if (r4 != 0) goto L6e
        L6b:
            j2.h0.s(r13, r12, r13, r0)
        L6e:
            i2.h r13 = i2.j.f8735d
            x0.v.A(r13, r1, r12)
            r12.p(r2)
            h0.i0 r13 = r5.a()
            h0.i0 r0 = h0.i0.f7679a
            boolean r1 = r11.f7850d
            if (r13 == r0) goto L96
            g2.c0 r13 = r5.c()
            if (r13 == 0) goto L96
            g2.c0 r13 = r5.c()
            jc.l.b(r13)
            boolean r13 = r13.h()
            if (r13 == 0) goto L96
            if (r1 == 0) goto L96
            goto L97
        L96:
            r2 = 0
        L97:
            l0.l1 r13 = r11.f7848b
            h0.q0.h(r13, r2, r12, r3)
            h0.i0 r0 = r5.a()
            h0.i0 r2 = h0.i0.f7681c
            if (r0 != r2) goto Lb7
            boolean r0 = r11.f7851e
            if (r0 != 0) goto Lb7
            if (r1 == 0) goto Lb7
            r0 = -7167858(0xffffffffff92a08e, float:NaN)
            r12.W(r0)
            h0.q0.g(r13, r12, r3)
            r12.p(r3)
            goto Lc4
        Lb7:
            r13 = -7090978(0xffffffffff93ccde, float:NaN)
            r12.W(r13)
            r12.p(r3)
            goto Lc4
        Lc1:
            r12.Q()
        Lc4:
            ub.a0 r12 = ub.a0.f21526a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: h0.u.q(java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
