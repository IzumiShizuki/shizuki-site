package i2;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class q0 extends g2.g1 implements b1, g2.x0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public o0 f8819f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ic.k f8820g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public t1 f8821h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f8822i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f8823j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f8824k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final g2.q0 f8825l = new g2.q0(0, this);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public h7.i f8826m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public o.k0 f8827n;

    public static void y0(g1 g1Var) {
        k0 k0Var;
        g1 g1Var2 = g1Var.f8703r;
        j0 j0Var = g1Var.f8700o;
        if (!jc.l.a(g1Var2 != null ? g1Var2.f8700o : null, j0Var)) {
            j0Var.G.f8805p.f8927y.f();
            return;
        }
        a aVarG = j0Var.G.f8805p.g();
        if (aVarG == null || (k0Var = ((z0) aVarG).f8927y) == null) {
            return;
        }
        k0Var.f();
    }

    public abstract void A0();

    @Override // i2.b1
    public final void C(boolean z10) {
        q0 q0VarV0 = v0();
        j0 j0VarT0 = q0VarV0 != null ? q0VarV0.t0() : null;
        if (jc.l.a(j0VarT0, t0())) {
            this.f8822i = z10;
            return;
        }
        if ((j0VarT0 != null ? j0VarT0.G.f8793d : null) != f0.f8691c) {
            if ((j0VarT0 != null ? j0VarT0.G.f8793d : null) != f0.f8692d) {
                return;
            }
        }
        this.f8822i = z10;
    }

    @Override // f3.c
    public final long E(float f10) {
        return a0.c.w(J(f10), this);
    }

    @Override // f3.c
    public final float I(int i10) {
        return i10 / a();
    }

    @Override // f3.c
    public final float J(float f10) {
        return f10 / a();
    }

    @Override // g2.y
    public boolean O() {
        return false;
    }

    @Override // f3.c
    public final float Q(float f10) {
        return a() * f10;
    }

    @Override // g2.g1
    public final int R(g2.t tVar) {
        int iN0;
        if (s0() && (iN0 = n0(tVar)) != Integer.MIN_VALUE) {
            return iN0 + ((int) (this.f7184e & 4294967295L));
        }
        return Integer.MIN_VALUE;
    }

    @Override // f3.c
    public final int U(long j10) {
        return Math.round(i0(j10));
    }

    @Override // f3.c
    public final /* synthetic */ int a0(float f10) {
        return a0.c.q(f10, this);
    }

    @Override // g2.x0
    public final g2.w0 b0(int i10, int i11, Map map, ic.k kVar) {
        return y(i10, i11, map, null, kVar);
    }

    @Override // f3.c
    public final /* synthetic */ long f0(long j10) {
        return a0.c.v(j10, this);
    }

    @Override // f3.c
    public final /* synthetic */ float i0(long j10) {
        return a0.c.u(j10, this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0106  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void l0(i2.j0 r32, g2.v r33) {
        /*
            Method dump skipped, instruction units count: 392
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: i2.q0.l0(i2.j0, g2.v):void");
    }

    @Override // f3.c
    public final /* synthetic */ long n(long j10) {
        return a0.c.t(j10, this);
    }

    public abstract int n0(g2.t tVar);

    /* JADX WARN: Multi-variable type inference failed */
    public final void o0(t1 t1Var, long j10, long j11) {
        boolean z10;
        long j12;
        long j13;
        char c3;
        long j14;
        j0 j0Var;
        boolean z11;
        long j15;
        char c10;
        r1 snapshotObserver;
        o.k0 k0Var = this.f8827n;
        h7.i iVar = this.f8826m;
        if (iVar == null) {
            iVar = new h7.i();
            this.f8826m = iVar;
        }
        h7.i iVar2 = iVar;
        p1 p1Var = t0().f8755n;
        if (p1Var != null && (snapshotObserver = ((j2.v) p1Var).getSnapshotObserver()) != null) {
            snapshotObserver.a(t1Var, e.f8673d, new p0(this, j10, j11, t1Var));
        }
        boolean zO = O();
        o.l0 l0Var = (o.l0) iVar2.f8191e;
        o.l0 l0Var2 = (o.l0) iVar2.f8192f;
        int i10 = iVar2.f8187a;
        for (int i11 = 0; i11 < i10; i11++) {
            byte b10 = ((byte[]) iVar2.f8190d)[i11];
            if (b10 == 3) {
                g2.v vVar = ((g2.v[]) iVar2.f8188b)[i11];
                jc.l.b(vVar);
                l0Var2.j(vVar);
            } else if (b10 != 0 && k0Var != null) {
                g2.v vVar2 = ((g2.v[]) iVar2.f8188b)[i11];
                jc.l.b(vVar2);
                o.l0 l0Var3 = (o.l0) k0Var.k(vVar2);
                if (l0Var3 != null) {
                    l0Var.k(l0Var3);
                }
            }
        }
        int i12 = iVar2.f8187a;
        int i13 = 0;
        for (int i14 = 0; i14 < i12; i14++) {
            byte[] bArr = (byte[]) iVar2.f8190d;
            if (bArr[i14] == 2) {
                i13++;
            } else if (i13 > 0) {
                g2.v[] vVarArr = (g2.v[]) iVar2.f8188b;
                vVarArr[i14 - i13] = vVarArr[i14];
            }
            bArr[i14] = 2;
        }
        int i15 = iVar2.f8187a;
        for (int i16 = i15 - i13; i16 < i15; i16++) {
            ((g2.v[]) iVar2.f8188b)[i16] = null;
        }
        iVar2.f8187a -= i13;
        q0 q0VarV0 = v0();
        Object[] objArr = l0Var2.f16003b;
        long[] jArr = l0Var2.f16002a;
        int length = jArr.length - 2;
        char c11 = 7;
        long j16 = -9187201950435737472L;
        if (length >= 0) {
            j13 = 128;
            int i17 = 0;
            while (true) {
                long j17 = jArr[i17];
                j14 = 255;
                if ((((~j17) << c11) & j17 & j16) != j16) {
                    int i18 = 8 - ((~(i17 - length)) >>> 31);
                    int i19 = 0;
                    while (i19 < i18) {
                        if ((j17 & 255) < 128) {
                            g2.v vVar3 = (g2.v) objArr[(i17 << 3) + i19];
                            j15 = j16;
                            q0 q0Var = q0VarV0 == null ? this : q0VarV0;
                            q0 q0Var2 = q0Var;
                            c10 = '\b';
                            while (true) {
                                h7.i iVar3 = q0Var2.f8826m;
                                if (iVar3 != null) {
                                    z11 = zO;
                                    if (!vb.l.e0(vVar3, (g2.v[]) iVar3.f8188b)) {
                                        break;
                                        break;
                                    }
                                    break;
                                }
                                z11 = zO;
                                q0 q0VarV02 = q0Var2.v0();
                                if (q0VarV02 == null) {
                                    break;
                                }
                                q0Var2 = q0VarV02;
                                zO = z11;
                            }
                            o.k0 k0Var2 = q0Var2.f8827n;
                            o.l0 l0Var4 = k0Var2 != null ? (o.l0) k0Var2.k(vVar3) : null;
                            if (l0Var4 != null) {
                                q0Var.z0(l0Var4);
                            }
                        } else {
                            z11 = zO;
                            j15 = j16;
                            c10 = '\b';
                        }
                        j17 >>= c10;
                        i19++;
                        j16 = j15;
                        zO = z11;
                    }
                    z10 = zO;
                    j12 = j16;
                    c3 = 7;
                    if (i18 != 8) {
                        break;
                    }
                } else {
                    z10 = zO;
                    j12 = j16;
                    c3 = 7;
                }
                if (i17 == length) {
                    break;
                }
                i17++;
                j16 = j12;
                zO = z10;
                c11 = 7;
            }
        } else {
            z10 = zO;
            j12 = -9187201950435737472L;
            j13 = 128;
            c3 = 7;
            j14 = 255;
        }
        l0Var2.b();
        Object[] objArr2 = l0Var.f16003b;
        long[] jArr2 = l0Var.f16002a;
        int length2 = jArr2.length - 2;
        if (length2 >= 0) {
            int i20 = 0;
            while (true) {
                long j18 = jArr2[i20];
                if ((((~j18) << c3) & j18 & j12) != j12) {
                    int i21 = 8 - ((~(i20 - length2)) >>> 31);
                    for (int i22 = 0; i22 < i21; i22++) {
                        if ((j18 & j14) < j13 && (j0Var = (j0) ((e2) objArr2[(i20 << 3) + i22]).get()) != null) {
                            if (z10) {
                                j0Var.V(false);
                            } else {
                                j0Var.X(false);
                            }
                        }
                        j18 >>= 8;
                    }
                    if (i21 != 8) {
                        break;
                    }
                }
                if (i20 == length2) {
                    break;
                } else {
                    i20++;
                }
            }
        }
        l0Var.b();
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void p0(g2.w0 r18) {
        /*
            r17 = this;
            r0 = r17
            r6 = r18
            o.k0 r1 = r0.f8827n
            boolean r2 = r0.f8824k
            if (r2 == 0) goto Lc
            goto Lbd
        Lc:
            ic.k r2 = r6.k()
            r3 = 0
            if (r2 != 0) goto L5d
            if (r1 == 0) goto Lbd
            java.lang.Object[] r2 = r1.f15997c
            long[] r4 = r1.f15995a
            int r5 = r4.length
            int r5 = r5 + (-2)
            if (r5 < 0) goto L59
            r6 = 0
        L1f:
            r7 = r4[r6]
            long r9 = ~r7
            r11 = 7
            long r9 = r9 << r11
            long r9 = r9 & r7
            r11 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r9 = r9 & r11
            int r13 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r13 == 0) goto L54
            int r9 = r6 - r5
            int r9 = ~r9
            int r9 = r9 >>> 31
            r10 = 8
            int r9 = 8 - r9
            r11 = 0
        L39:
            if (r11 >= r9) goto L52
            r12 = 255(0xff, double:1.26E-321)
            long r12 = r12 & r7
            r14 = 128(0x80, double:6.3E-322)
            int r16 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r16 >= 0) goto L4e
            int r12 = r6 << 3
            int r12 = r12 + r11
            r12 = r2[r12]
            o.l0 r12 = (o.l0) r12
            r0.z0(r12)
        L4e:
            long r7 = r7 >> r10
            int r11 = r11 + 1
            goto L39
        L52:
            if (r9 != r10) goto L59
        L54:
            if (r6 == r5) goto L59
            int r6 = r6 + 1
            goto L1f
        L59:
            r1.a()
            return
        L5d:
            ic.k r1 = r0.f8820g
            r4 = 1
            if (r1 == r2) goto L64
            r1 = 1
            goto L65
        L64:
            r1 = 0
        L65:
            r7 = 0
            if (r1 != 0) goto L9e
            i2.o0 r2 = r0.x0()
            boolean r2 = r2.f8811a
            if (r2 == 0) goto L9e
            g2.c0 r1 = r0.r0()
            long r7 = r1.u(r7)
            long r7 = android.support.v4.media.session.b.X(r7)
            long r1 = r1.k()
            i2.o0 r5 = r0.x0()
            long r9 = r5.f8812b
            boolean r5 = f3.j.b(r7, r9)
            if (r5 == 0) goto L99
            i2.o0 r5 = r0.x0()
            long r9 = r5.f8813c
            boolean r5 = f3.l.b(r1, r9)
            if (r5 != 0) goto L9a
        L99:
            r3 = 1
        L9a:
            r4 = r1
            r1 = r3
            r2 = r7
            goto La4
        L9e:
            r2 = 9223372034707292159(0x7fffffff7fffffff, double:NaN)
            r4 = r7
        La4:
            if (r1 == 0) goto Lbd
            i2.t1 r1 = r0.f8821h
            if (r1 == 0) goto Lad
            r1.f8854a = r6
            goto Lb4
        Lad:
            i2.t1 r1 = new i2.t1
            r1.<init>(r6, r0)
            r0.f8821h = r1
        Lb4:
            r0.o0(r1, r2, r4)
            ic.k r1 = r6.k()
            r0.f8820g = r1
        Lbd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i2.q0.p0(g2.w0):void");
    }

    public abstract q0 q0();

    @Override // f3.c
    public final /* synthetic */ float r(long j10) {
        return a0.c.s(j10, this);
    }

    public abstract g2.c0 r0();

    public abstract boolean s0();

    public abstract j0 t0();

    public abstract g2.w0 u0();

    public abstract q0 v0();

    public abstract long w0();

    public final o0 x0() {
        o0 o0Var = this.f8819f;
        if (o0Var != null) {
            return o0Var;
        }
        o0 o0Var2 = new o0(this);
        this.f8819f = o0Var2;
        return o0Var2;
    }

    @Override // g2.x0
    public final g2.w0 y(int i10, int i11, Map map, ic.k kVar, ic.k kVar2) {
        if ((i10 & (-16777216)) != 0 || ((-16777216) & i11) != 0) {
            f2.a.b("Size(" + i10 + " x " + i11 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new g2.h(i10, i11, map, kVar, kVar2, this, 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void z0(o.l0 l0Var) {
        j0 j0Var;
        Object[] objArr = l0Var.f16003b;
        long[] jArr = l0Var.f16002a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i10 = 0;
        while (true) {
            long j10 = jArr[i10];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i10 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j10) < 128 && (j0Var = (j0) ((e2) objArr[(i10 << 3) + i12]).get()) != null) {
                        if (O()) {
                            j0Var.V(false);
                        } else {
                            j0Var.X(false);
                        }
                    }
                    j10 >>= 8;
                }
                if (i11 != 8) {
                    return;
                }
            }
            if (i10 == length) {
                return;
            } else {
                i10++;
            }
        }
    }
}
