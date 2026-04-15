package s;

import android.view.KeyEvent;
import i2.b2;
import i2.d2;
import i2.u1;
import i2.y1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class d extends i2.n implements u1, a2.d, y1, d2 {
    public static final z0 G = new z0();
    public w.h A;
    public final o.c0 B;
    public long C;
    public w.k D;
    public boolean E;
    public final z0 F;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public w.k f19119q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public r0 f19120r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public String f19121s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public q2.h f19122t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f19123u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public ic.a f19124v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final b0 f19125w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public c2.j0 f19126x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public i2.m f19127y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public w.m f19128z;

    public d(w.k kVar, r0 r0Var, boolean z10, String str, q2.h hVar, ic.a aVar) {
        this.f19119q = kVar;
        this.f19120r = r0Var;
        this.f19121s = str;
        this.f19122t = hVar;
        this.f19123u = z10;
        this.f19124v = aVar;
        boolean z11 = false;
        this.f19125w = new b0(kVar, 0, new de.h(1, this, d.class, "onFocusChange", "onFocusChange(Z)V", 0, 0, 7));
        o.c0 c0Var = o.q.f16031a;
        this.B = new o.c0();
        this.C = 0L;
        w.k kVar2 = this.f19119q;
        this.D = kVar2;
        if (kVar2 == null && this.f19120r != null) {
            z11 = true;
        }
        this.E = z11;
        this.F = G;
    }

    @Override // i2.y1
    public final /* synthetic */ boolean A() {
        return false;
    }

    public abstract Object F0(c2.x xVar, yb.c cVar);

    /* JADX WARN: Removed duplicated region for block: B:22:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void G0() {
        /*
            r18 = this;
            r0 = r18
            w.k r1 = r0.f19119q
            o.c0 r2 = r0.B
            if (r1 == 0) goto L6a
            w.m r3 = r0.f19128z
            if (r3 == 0) goto L14
            w.l r4 = new w.l
            r4.<init>(r3)
            r1.b(r4)
        L14:
            w.h r3 = r0.A
            if (r3 == 0) goto L20
            w.i r4 = new w.i
            r4.<init>(r3)
            r1.b(r4)
        L20:
            java.lang.Object[] r3 = r2.f15931c
            long[] r4 = r2.f15929a
            int r5 = r4.length
            int r5 = r5 + (-2)
            if (r5 < 0) goto L6a
            r6 = 0
            r7 = 0
        L2b:
            r8 = r4[r7]
            long r10 = ~r8
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r14 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r14 == 0) goto L65
            int r10 = r7 - r5
            int r10 = ~r10
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = 0
        L45:
            if (r12 >= r10) goto L63
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.3E-322)
            int r17 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r17 >= 0) goto L5f
            int r13 = r7 << 3
            int r13 = r13 + r12
            r13 = r3[r13]
            w.m r13 = (w.m) r13
            w.l r14 = new w.l
            r14.<init>(r13)
            r1.b(r14)
        L5f:
            long r8 = r8 >> r11
            int r12 = r12 + 1
            goto L45
        L63:
            if (r10 != r11) goto L6a
        L65:
            if (r7 == r5) goto L6a
            int r7 = r7 + 1
            goto L2b
        L6a:
            r1 = 0
            r0.f19128z = r1
            r0.A = r1
            r2.a()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: s.d.G0():void");
    }

    public final void H0() {
        r0 r0Var;
        if (this.f19127y == null && (r0Var = this.f19120r) != null) {
            if (this.f19119q == null) {
                this.f19119q = new w.k();
            }
            this.f19125w.G0(this.f19119q);
            w.k kVar = this.f19119q;
            jc.l.b(kVar);
            i2.m mVarB = r0Var.b(kVar);
            B0(mVarB);
            this.f19127y = mVarB;
        }
    }

    public abstract boolean J0(KeyEvent keyEvent);

    public abstract void K0(KeyEvent keyEvent);

    @Override // i2.y1
    public final void L(q2.k kVar) {
        q2.h hVar = this.f19122t;
        if (hVar != null) {
            q2.v.e(kVar, hVar.f17601a);
        }
        String str = this.f19121s;
        r2.a aVar = new r2.a(1, this);
        pc.u[] uVarArr = q2.v.f17698a;
        kVar.l(q2.j.f17605b, new q2.a(str, aVar));
        if (this.f19123u) {
            this.f19125w.L(kVar);
        } else {
            q2.v.a(kVar);
        }
        E0(kVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0071  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void L0(w.k r4, s.r0 r5, boolean r6, java.lang.String r7, q2.h r8, ic.a r9) {
        /*
            r3 = this;
            w.k r0 = r3.D
            boolean r0 = jc.l.a(r0, r4)
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L13
            r3.G0()
            r3.D = r4
            r3.f19119q = r4
            r4 = 1
            goto L14
        L13:
            r4 = 0
        L14:
            s.r0 r0 = r3.f19120r
            boolean r0 = jc.l.a(r0, r5)
            if (r0 != 0) goto L1f
            r3.f19120r = r5
            r4 = 1
        L1f:
            boolean r5 = r3.f19123u
            s.b0 r0 = r3.f19125w
            if (r5 == r6) goto L36
            if (r6 == 0) goto L2b
            r3.B0(r0)
            goto L31
        L2b:
            r3.C0(r0)
            r3.G0()
        L31:
            i2.f.o(r3)
            r3.f19123u = r6
        L36:
            java.lang.String r5 = r3.f19121s
            boolean r5 = jc.l.a(r5, r7)
            if (r5 != 0) goto L43
            r3.f19121s = r7
            i2.f.o(r3)
        L43:
            q2.h r5 = r3.f19122t
            boolean r5 = jc.l.a(r5, r8)
            if (r5 != 0) goto L50
            r3.f19122t = r8
            i2.f.o(r3)
        L50:
            r3.f19124v = r9
            boolean r5 = r3.E
            w.k r6 = r3.D
            if (r6 != 0) goto L5e
            s.r0 r7 = r3.f19120r
            if (r7 == 0) goto L5e
            r7 = 1
            goto L5f
        L5e:
            r7 = 0
        L5f:
            if (r5 == r7) goto L71
            if (r6 != 0) goto L68
            s.r0 r5 = r3.f19120r
            if (r5 == 0) goto L68
            r2 = 1
        L68:
            r3.E = r2
            if (r2 != 0) goto L71
            i2.m r5 = r3.f19127y
            if (r5 != 0) goto L71
            goto L72
        L71:
            r1 = r4
        L72:
            if (r1 == 0) goto L87
            i2.m r4 = r3.f19127y
            if (r4 != 0) goto L7c
            boolean r5 = r3.E
            if (r5 != 0) goto L87
        L7c:
            if (r4 == 0) goto L81
            r3.C0(r4)
        L81:
            r4 = 0
            r3.f19127y = r4
            r3.H0()
        L87:
            w.k r4 = r3.f19119q
            r0.G0(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: s.d.L0(w.k, s.r0, boolean, java.lang.String, q2.h, ic.a):void");
    }

    @Override // i2.u1
    public final /* synthetic */ boolean d0() {
        return false;
    }

    @Override // i2.y1
    public final /* synthetic */ boolean h() {
        return true;
    }

    @Override // i2.u1
    public final void h0() {
        z();
    }

    @Override // a2.d
    public final boolean i(KeyEvent keyEvent) {
        return false;
    }

    @Override // i2.u1
    public final void j(c2.l lVar, c2.m mVar, long j10) {
        long j11 = ((j10 >> 33) << 32) | (((j10 << 32) >> 33) & 4294967295L);
        this.C = (((long) Float.floatToRawIntBits((int) (j11 & 4294967295L))) & 4294967295L) | (Float.floatToRawIntBits((int) (j11 >> 32)) << 32);
        H0();
        int i10 = 3;
        yb.c cVar = null;
        if (this.f19123u && mVar == c2.m.f3315b) {
            int i11 = lVar.f3313e;
            if (i11 == 4) {
                hf.a0.y(n0(), null, null, new c(this, cVar, 0), 3);
            } else if (i11 == 5) {
                hf.a0.y(n0(), null, null, new c(this, cVar, 1), 3);
            }
        }
        if (this.f19126x == null) {
            d0.h hVar = new d0.h(i10, this);
            c2.l lVar2 = c2.e0.f3261a;
            c2.j0 j0Var = new c2.j0(null, null, null, hVar);
            B0(j0Var);
            this.f19126x = j0Var;
        }
        c2.j0 j0Var2 = this.f19126x;
        if (j0Var2 != null) {
            j0Var2.j(lVar, mVar, j10);
        }
    }

    @Override // i2.d2
    public final Object k() {
        return this.F;
    }

    @Override // i2.y1
    public final boolean k0() {
        return true;
    }

    @Override // i2.u1
    public final long l() {
        return b2.f8652a;
    }

    @Override // j1.p
    public final boolean o0() {
        return false;
    }

    @Override // j1.p
    public final void r0() {
        if (!this.E) {
            H0();
        }
        if (this.f19123u) {
            B0(this.f19125w);
        }
    }

    @Override // j1.p
    public final void s0() {
        z();
    }

    @Override // j1.p
    public final void t0() {
        G0();
        if (this.D == null) {
            this.f19119q = null;
        }
        i2.m mVar = this.f19127y;
        if (mVar != null) {
            C0(mVar);
        }
        this.f19127y = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0079 A[RETURN] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // a2.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean v(android.view.KeyEvent r11) {
        /*
            r10 = this;
            r10.H0()
            long r0 = a2.c.L(r11)
            boolean r2 = r10.f19123u
            r3 = 3
            r4 = 0
            o.c0 r5 = r10.B
            r6 = 1
            r7 = 0
            if (r2 == 0) goto L4b
            int r2 = a2.c.O(r11)
            r8 = 2
            if (r2 != r8) goto L4b
            boolean r2 = androidx.compose.foundation.a.i(r11)
            if (r2 == 0) goto L4b
            boolean r2 = r5.b(r0)
            if (r2 != 0) goto L41
            w.m r2 = new w.m
            long r8 = r10.C
            r2.<init>(r8)
            r5.h(r0, r2)
            w.k r0 = r10.f19119q
            if (r0 == 0) goto L3f
            hf.y r0 = r10.n0()
            s.b r1 = new s.b
            r5 = 1
            r1.<init>(r10, r2, r4, r5)
            hf.a0.y(r0, r4, r4, r1, r3)
        L3f:
            r0 = 1
            goto L42
        L41:
            r0 = 0
        L42:
            boolean r11 = r10.J0(r11)
            if (r11 != 0) goto L79
            if (r0 == 0) goto L7a
            goto L79
        L4b:
            boolean r2 = r10.f19123u
            if (r2 == 0) goto L7a
            int r2 = a2.c.O(r11)
            if (r2 != r6) goto L7a
            boolean r2 = androidx.compose.foundation.a.i(r11)
            if (r2 == 0) goto L7a
            java.lang.Object r0 = r5.g(r0)
            w.m r0 = (w.m) r0
            if (r0 == 0) goto L77
            w.k r1 = r10.f19119q
            if (r1 == 0) goto L74
            hf.y r1 = r10.n0()
            s.b r2 = new s.b
            r5 = 2
            r2.<init>(r10, r0, r4, r5)
            hf.a0.y(r1, r4, r4, r2, r3)
        L74:
            r10.K0(r11)
        L77:
            if (r0 == 0) goto L7a
        L79:
            return r6
        L7a:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: s.d.v(android.view.KeyEvent):boolean");
    }

    @Override // i2.u1
    public final void z() {
        w.h hVar;
        w.k kVar = this.f19119q;
        if (kVar != null && (hVar = this.A) != null) {
            kVar.b(new w.i(hVar));
        }
        this.A = null;
        c2.j0 j0Var = this.f19126x;
        if (j0Var != null) {
            j0Var.z();
        }
    }

    @Override // i2.u1
    public final /* synthetic */ void H() {
    }

    public void I0() {
    }

    public void E0(q2.k kVar) {
    }
}
