package x0;

import android.os.Trace;
import b7.c3;
import com.tencent.bugly.beta.tinker.TinkerReport;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import m0.b4;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class o {
    public int A;
    public int B;
    public boolean C;
    public final h1.w D;
    public final ArrayList E;
    public boolean F;
    public z1 G;
    public a2 H;
    public d2 I;
    public boolean J;
    public j1 K;
    public y0.a L;
    public final y0.b M;
    public a N;
    public y0.c O;
    public c3 P;
    public final i1.c Q;
    public final yb.h R;
    public boolean S;
    public long T;
    public t U;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c7.e1 f24375a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r f24376b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a2 f24377c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final o.n0 f24378d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final y0.a f24379e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final y0.a f24380f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final r.y1 f24381g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final u f24382h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public i1 f24384j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f24385k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f24386l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f24387m;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int[] f24389o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public o.w f24390p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f24391q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f24392r;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public o.y f24396v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f24397w;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f24399y;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ArrayList f24383i = new ArrayList();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final i2.v f24388n = new i2.v();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final ArrayList f24393s = new ArrayList();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final i2.v f24394t = new i2.v();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public j1 f24395u = f1.k.f6633d;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final i2.v f24398x = new i2.v();

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f24400z = -1;

    public o(c7.e1 e1Var, r rVar, a2 a2Var, o.n0 n0Var, y0.a aVar, y0.a aVar2, r.y1 y1Var, u uVar) {
        this.f24375a = e1Var;
        this.f24376b = rVar;
        this.f24377c = a2Var;
        this.f24378d = n0Var;
        this.f24379e = aVar;
        this.f24380f = aVar2;
        this.f24381g = y1Var;
        this.f24382h = uVar;
        this.C = rVar.e() || rVar.c();
        this.D = new h1.w(1, this);
        this.E = new ArrayList();
        z1 z1VarJ = a2Var.j();
        z1VarJ.c();
        this.G = z1VarJ;
        a2 a2Var2 = new a2();
        if (rVar.e()) {
            a2Var2.i();
        }
        if (rVar.c()) {
            a2Var2.f24246k = new o.y();
        }
        this.H = a2Var2;
        d2 d2VarK = a2Var2.k();
        d2VarK.e(true);
        this.I = d2VarK;
        this.M = new y0.b(this, aVar);
        z1 z1VarJ2 = this.H.j();
        try {
            a aVarA = z1VarJ2.a(0);
            z1VarJ2.c();
            this.N = aVarA;
            this.O = new y0.c();
            this.Q = new i1.c(this);
            yb.h hVarI = rVar.i();
            yb.h hVarY = y();
            this.R = hVarI.G(hVarY == null ? yb.i.f26088a : hVarY);
        } catch (Throwable th2) {
            z1VarJ2.c();
            throw th2;
        }
    }

    public static final int M(o oVar, int i10, boolean z10, int i11) {
        z1 z1Var = oVar.G;
        y0.b bVar = oVar.M;
        boolean zJ = z1Var.j(i10);
        int[] iArr = z1Var.f24530b;
        if (zJ) {
            int i12 = z1Var.i(i10);
            Object objP = z1Var.p(iArr, i10);
            if (i12 == 206 && jc.l.a(objP, p.f24412e)) {
                Object objH = z1Var.h(i10, 0);
                m mVar = objH instanceof m ? (m) objH : null;
                if (mVar != null) {
                    for (o oVar2 : mVar.f24350a.f24364e) {
                        a2 a2Var = oVar2.f24377c;
                        if (a2Var.f24237b > 0 && (a2Var.f24236a[1] & 67108864) != 0) {
                            u uVar = oVar2.f24382h;
                            synchronized (uVar.f24493d) {
                                uVar.o();
                                o.k0 k0Var = uVar.f24503n;
                                uVar.f24503n = ud.b.k();
                                try {
                                    uVar.f24509t.d0(k0Var);
                                } finally {
                                }
                            }
                            y0.a aVar = new y0.a();
                            oVar2.L = aVar;
                            z1 z1VarJ = oVar2.f24377c.j();
                            try {
                                oVar2.G = z1VarJ;
                                y0.b bVar2 = oVar2.M;
                                y0.a aVar2 = bVar2.f25297b;
                                try {
                                    bVar2.f25297b = aVar;
                                    oVar2.L(0);
                                    y0.b bVar3 = oVar2.M;
                                    bVar3.b();
                                    if (bVar3.f25298c) {
                                        bVar3.f25297b.f25294a.J(y0.b0.f25308d);
                                        if (bVar3.f25298c) {
                                            bVar3.d(false);
                                            bVar3.d(false);
                                            bVar3.f25297b.f25294a.J(y0.m.f25335d);
                                            bVar3.f25298c = false;
                                        }
                                    }
                                } finally {
                                }
                            } finally {
                                z1VarJ.c();
                            }
                        }
                        oVar.f24376b.n(oVar2.f24382h);
                    }
                }
                return z1Var.o(i10);
            }
            if (!z1Var.l(i10)) {
                return z1Var.o(i10);
            }
        } else if (z1Var.d(i10)) {
            int i13 = iArr[(i10 * 5) + 3] + i10;
            int iM = 0;
            for (int i14 = i10 + 1; i14 < i13; i14 += iArr[(i14 * 5) + 3]) {
                boolean zL = z1Var.l(i14);
                if (zL) {
                    bVar.c();
                    Object objN = z1Var.n(i14);
                    bVar.c();
                    bVar.f25303h.add(objN);
                }
                iM += M(oVar, i14, zL || z10, zL ? 0 : i11 + iM);
                if (zL) {
                    bVar.c();
                    bVar.a();
                }
            }
            if (!z1Var.l(i10)) {
                return iM;
            }
        } else if (!z1Var.l(i10)) {
            return z1Var.o(i10);
        }
        return 1;
    }

    public final void A(ArrayList arrayList) {
        y0.a aVar = this.f24380f;
        y0.b bVar = this.M;
        y0.a aVar2 = bVar.f25297b;
        try {
            bVar.f25297b = aVar;
            aVar.f25294a.J(y0.z.f25352d);
            if (arrayList.size() <= 0) {
                bVar.f25297b.f25294a.J(y0.n.f25336d);
                bVar.f25301f = 0;
            } else {
                ub.k kVar = (ub.k) arrayList.get(0);
                v0 v0Var = (v0) kVar.f21543a;
                v0Var.getClass();
                throw null;
            }
        } finally {
            bVar.f25297b = aVar2;
        }
    }

    public final void B(j1 j1Var, Object obj) {
        U(126665345, null);
        C();
        i0(obj);
        long j10 = this.T;
        try {
            this.T = 126665345;
            if (this.S) {
                d2.y(this.I);
            }
            boolean z10 = (this.S || jc.l.a(this.G.f(), j1Var)) ? false : true;
            if (z10) {
                I(j1Var);
            }
            R(p.f24410c, TinkerReport.KEY_APPLIED_SUCC_COST_30S_LESS, j1Var, 0);
            this.K = null;
            boolean z11 = this.f24397w;
            this.f24397w = z10;
            f1.g.d(this, new f1.f(new b4(2, obj), 316014703, true));
            this.f24397w = z11;
        } finally {
        }
    }

    public final Object C() {
        boolean z10 = this.S;
        r0 r0Var = k.f24334a;
        if (!z10) {
            Object objM = this.G.m();
            if (!this.f24399y || (objM instanceof m)) {
                return objM;
            }
        } else if (this.f24392r) {
            p.c("A call to createNode(), emitNode() or useNode() expected");
            return r0Var;
        }
        return r0Var;
    }

    public final List D() {
        r rVar = this.f24376b;
        q qVarG = rVar.g();
        u uVar = q.t0.M(qVarG) ? (u) qVarG : null;
        if (uVar != null) {
            a2 a2Var = uVar.f24495f;
            z1 z1VarJ = a2Var.j();
            try {
                Integer numT = lc.b.t(z1VarJ, rVar, 0, z1VarJ.f24531c);
                if (numT != null) {
                    try {
                        return lc.b.Y(a2Var.j(), numT.intValue(), 0);
                    } finally {
                    }
                }
            } finally {
            }
        }
        return vb.r.f22819a;
    }

    public final int E(int i10) {
        int iQ = this.G.q(i10) + 1;
        int i11 = 0;
        while (iQ < i10) {
            if (!this.G.k(iQ)) {
                i11++;
            }
            iQ += c2.a(this.G.f24530b, iQ);
        }
        return i11;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x005c A[Catch: all -> 0x0027, TRY_LEAVE, TryCatch #1 {all -> 0x0027, blocks: (B:3:0x0005, B:6:0x0015, B:8:0x0023, B:12:0x002c, B:11:0x0029, B:15:0x0033, B:18:0x003b, B:21:0x0043, B:23:0x004b, B:25:0x0051, B:26:0x0055, B:27:0x0056, B:29:0x005c, B:22:0x0047), top: B:36:0x0005, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object F(x0.u r9, x0.u r10, java.lang.Integer r11, java.util.List r12, ic.a r13) {
        /*
            r8 = this;
            boolean r0 = r8.F
            int r1 = r8.f24385k
            r2 = 1
            r8.F = r2     // Catch: java.lang.Throwable -> L27
            r2 = 0
            r8.f24385k = r2     // Catch: java.lang.Throwable -> L27
            r3 = r12
            java.util.Collection r3 = (java.util.Collection) r3     // Catch: java.lang.Throwable -> L27
            int r3 = r3.size()     // Catch: java.lang.Throwable -> L27
            r4 = 0
        L12:
            r5 = 0
            if (r4 >= r3) goto L2f
            java.lang.Object r6 = r12.get(r4)     // Catch: java.lang.Throwable -> L27
            ub.k r6 = (ub.k) r6     // Catch: java.lang.Throwable -> L27
            java.lang.Object r7 = r6.f21543a     // Catch: java.lang.Throwable -> L27
            x0.p1 r7 = (x0.p1) r7     // Catch: java.lang.Throwable -> L27
            java.lang.Object r6 = r6.f21544b     // Catch: java.lang.Throwable -> L27
            if (r6 == 0) goto L29
            r8.c0(r7, r6)     // Catch: java.lang.Throwable -> L27
            goto L2c
        L27:
            r9 = move-exception
            goto L65
        L29:
            r8.c0(r7, r5)     // Catch: java.lang.Throwable -> L27
        L2c:
            int r4 = r4 + 1
            goto L12
        L2f:
            if (r9 == 0) goto L5c
            if (r11 == 0) goto L38
            int r11 = r11.intValue()     // Catch: java.lang.Throwable -> L27
            goto L39
        L38:
            r11 = -1
        L39:
            if (r10 == 0) goto L56
            boolean r12 = r10.equals(r9)     // Catch: java.lang.Throwable -> L27
            if (r12 != 0) goto L56
            if (r11 < 0) goto L56
            r9.f24505p = r10     // Catch: java.lang.Throwable -> L27
            r9.f24506q = r11     // Catch: java.lang.Throwable -> L27
            java.lang.Object r10 = r13.b()     // Catch: java.lang.Throwable -> L50
            r9.f24505p = r5     // Catch: java.lang.Throwable -> L27
            r9.f24506q = r2     // Catch: java.lang.Throwable -> L27
            goto L5a
        L50:
            r10 = move-exception
            r9.f24505p = r5     // Catch: java.lang.Throwable -> L27
            r9.f24506q = r2     // Catch: java.lang.Throwable -> L27
            throw r10     // Catch: java.lang.Throwable -> L27
        L56:
            java.lang.Object r10 = r13.b()     // Catch: java.lang.Throwable -> L27
        L5a:
            if (r10 != 0) goto L60
        L5c:
            java.lang.Object r10 = r13.b()     // Catch: java.lang.Throwable -> L27
        L60:
            r8.F = r0
            r8.f24385k = r1
            return r10
        L65:
            r8.F = r0
            r8.f24385k = r1
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: x0.o.F(x0.u, x0.u, java.lang.Integer, java.util.List, ic.a):java.lang.Object");
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x031a  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0327  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0105  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void G() {
        /*
            Method dump skipped, instruction units count: 876
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: x0.o.G():void");
    }

    public final void H() {
        int i10;
        L(this.G.f24535g);
        y0.b bVar = this.M;
        bVar.d(false);
        i2.v vVar = bVar.f25299d;
        o oVar = bVar.f25296a;
        z1 z1Var = oVar.G;
        if (z1Var.f24531c > 0 && vVar.a(-2) != (i10 = z1Var.f24537i)) {
            if (!bVar.f25298c && bVar.f25300e) {
                bVar.d(false);
                bVar.f25297b.f25294a.J(y0.q.f25339d);
                bVar.f25298c = true;
            }
            if (i10 > 0) {
                a aVarA = z1Var.a(i10);
                vVar.c(i10);
                bVar.d(false);
                y0.k0 k0Var = bVar.f25297b.f25294a;
                k0Var.J(y0.p.f25338d);
                ud.n.B(k0Var, 0, aVarA);
                bVar.f25298c = true;
            }
        }
        bVar.f25297b.f25294a.J(y0.x.f25350d);
        int i11 = bVar.f25301f;
        z1 z1Var2 = oVar.G;
        bVar.f25301f = z1Var2.f24530b[(z1Var2.f24535g * 5) + 3] + i11;
    }

    public final void I(j1 j1Var) {
        o.y yVar = this.f24396v;
        if (yVar == null) {
            yVar = new o.y();
            this.f24396v = yVar;
        }
        yVar.h(this.G.f24535g, j1Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void J(int r7, int r8, int r9) {
        /*
            r6 = this;
            x0.z1 r0 = r6.G
            if (r7 != r8) goto L5
            goto L19
        L5:
            if (r7 == r9) goto L6a
            if (r8 != r9) goto Lb
            goto L6a
        Lb:
            int r1 = r0.q(r7)
            if (r1 != r8) goto L13
            r9 = r8
            goto L6a
        L13:
            int r1 = r0.q(r8)
            if (r1 != r7) goto L1b
        L19:
            r9 = r7
            goto L6a
        L1b:
            int r1 = r0.q(r7)
            int r2 = r0.q(r8)
            if (r1 != r2) goto L2a
            int r9 = r0.q(r7)
            goto L6a
        L2a:
            r1 = 0
            r2 = r7
            r3 = 0
        L2d:
            if (r2 <= 0) goto L38
            if (r2 == r9) goto L38
            int r2 = r0.q(r2)
            int r3 = r3 + 1
            goto L2d
        L38:
            r2 = r8
            r4 = 0
        L3a:
            if (r2 <= 0) goto L45
            if (r2 == r9) goto L45
            int r2 = r0.q(r2)
            int r4 = r4 + 1
            goto L3a
        L45:
            int r9 = r3 - r4
            r5 = r7
            r2 = 0
        L49:
            if (r2 >= r9) goto L52
            int r5 = r0.q(r5)
            int r2 = r2 + 1
            goto L49
        L52:
            int r4 = r4 - r3
            r9 = r8
        L54:
            if (r1 >= r4) goto L5d
            int r9 = r0.q(r9)
            int r1 = r1 + 1
            goto L54
        L5d:
            r1 = r9
            r9 = r5
        L5f:
            if (r9 == r1) goto L6a
            int r9 = r0.q(r9)
            int r1 = r0.q(r1)
            goto L5f
        L6a:
            if (r7 <= 0) goto L7e
            if (r7 == r9) goto L7e
            boolean r1 = r0.l(r7)
            if (r1 == 0) goto L79
            y0.b r1 = r6.M
            r1.a()
        L79:
            int r7 = r0.q(r7)
            goto L6a
        L7e:
            r6.o(r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: x0.o.J(int, int, int):void");
    }

    public final Object K() {
        boolean z10 = this.S;
        r0 r0Var = k.f24334a;
        if (!z10) {
            Object objM = this.G.m();
            if (!this.f24399y || (objM instanceof m)) {
                return objM instanceof v1 ? ((v1) objM).f24513a : objM;
            }
        } else if (this.f24392r) {
            p.c("A call to createNode(), emitNode() or useNode() expected");
            return r0Var;
        }
        return r0Var;
    }

    public final void L(int i10) {
        boolean zL = this.G.l(i10);
        y0.b bVar = this.M;
        if (zL) {
            bVar.c();
            Object objN = this.G.n(i10);
            bVar.c();
            bVar.f25303h.add(objN);
        }
        M(this, i10, zL, 0);
        bVar.c();
        if (zL) {
            bVar.a();
        }
    }

    public final boolean N(int i10, boolean z10) {
        if ((i10 & 1) == 0 && (this.S || this.f24399y)) {
            if (this.P != null) {
                w();
                return true;
            }
        } else if (!z10 && z()) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void O() {
        /*
            Method dump skipped, instruction units count: 275
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: x0.o.O():void");
    }

    public final void P() {
        z1 z1Var = this.G;
        int i10 = z1Var.f24537i;
        this.f24386l = i10 >= 0 ? z1Var.f24530b[(i10 * 5) + 1] & 67108863 : 0;
        z1Var.t();
    }

    public final void Q() {
        if (this.f24386l != 0) {
            p.c("No nodes can be emitted before calling skipAndEndGroup");
        }
        if (this.S) {
            return;
        }
        p1 p1VarW = w();
        if (p1VarW != null) {
            int i10 = p1VarW.f24419b;
            if ((i10 & 128) == 0) {
                p1VarW.f24419b = i10 | 16;
            }
        }
        if (this.f24393s.isEmpty()) {
            P();
        } else {
            G();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void R(java.lang.Object r29, int r30, java.lang.Object r31, int r32) {
        /*
            Method dump skipped, instruction units count: 939
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: x0.o.R(java.lang.Object, int, java.lang.Object, int):void");
    }

    public final void S() {
        R(null, -127, null, 0);
    }

    public final void T(int i10, y0 y0Var) {
        R(y0Var, i10, null, 0);
    }

    public final void U(int i10, Object obj) {
        R(obj, i10, null, 0);
    }

    public final void V(Object obj, boolean z10) {
        if (z10) {
            z1 z1Var = this.G;
            if (z1Var.f24539k <= 0) {
                if ((z1Var.f24530b[(z1Var.f24535g * 5) + 1] & 1073741824) == 0) {
                    k1.a("Expected a node group");
                }
                z1Var.u();
                return;
            }
            return;
        }
        if (obj != null && this.G.f() != obj) {
            y0.b bVar = this.M;
            bVar.getClass();
            bVar.d(false);
            y0.k0 k0Var = bVar.f25297b.f25294a;
            k0Var.J(y0.e0.f25315d);
            ud.n.B(k0Var, 0, obj);
        }
        this.G.u();
    }

    public final void W(int i10) {
        int i11;
        int i12;
        if (this.f24384j != null) {
            R(null, i10, null, 0);
            return;
        }
        if (this.f24392r) {
            p.c("A call to createNode(), emitNode() or useNode() expected");
        }
        this.T = Long.rotateLeft(Long.rotateLeft(this.T, 3) ^ ((long) i10), 3) ^ ((long) this.f24387m);
        this.f24387m++;
        z1 z1Var = this.G;
        boolean z10 = this.S;
        r0 r0Var = k.f24334a;
        if (z10) {
            z1Var.f24539k++;
            this.I.P(i10, r0Var, r0Var, false);
            u(false, null);
            return;
        }
        if (z1Var.g() == i10 && ((i12 = z1Var.f24535g) >= z1Var.f24536h || (z1Var.f24530b[(i12 * 5) + 1] & 536870912) == 0)) {
            z1Var.u();
            u(false, null);
            return;
        }
        if (z1Var.f24539k <= 0 && (i11 = z1Var.f24535g) != z1Var.f24536h) {
            int i13 = this.f24385k;
            H();
            this.M.e(i13, z1Var.s());
            p.a(i11, z1Var.f24535g, this.f24393s);
        }
        z1Var.f24539k++;
        this.S = true;
        this.K = null;
        if (this.I.f24287w) {
            d2 d2VarK = this.H.k();
            this.I = d2VarK;
            d2VarK.L();
            this.J = false;
            this.K = null;
        }
        d2 d2Var = this.I;
        d2Var.d();
        int i14 = d2Var.f24284t;
        d2Var.P(i10, r0Var, r0Var, false);
        this.N = d2Var.b(i14);
        u(false, null);
    }

    public final void X(int i10) {
        R(null, i10, null, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0070  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final x0.o Y(int r7) {
        /*
            r6 = this;
            r6.W(r7)
            boolean r7 = r6.S
            r.y1 r0 = r6.f24381g
            java.util.ArrayList r1 = r6.E
            x0.u r2 = r6.f24382h
            if (r7 == 0) goto L26
            x0.p1 r7 = new x0.p1
            r7.<init>(r2)
            r1.add(r7)
            r6.i0(r7)
            int r1 = r6.B
            r7.f24422e = r1
            int r1 = r7.f24419b
            r1 = r1 & (-17)
            r7.f24419b = r1
            r0.Q()
            return r6
        L26:
            x0.z1 r7 = r6.G
            int r7 = r7.f24537i
            java.util.ArrayList r3 = r6.f24393s
            int r7 = x0.p.e(r7, r3)
            if (r7 < 0) goto L39
            java.lang.Object r7 = r3.remove(r7)
            x0.l0 r7 = (x0.l0) r7
            goto L3a
        L39:
            r7 = 0
        L3a:
            x0.z1 r3 = r6.G
            java.lang.Object r3 = r3.m()
            x0.r0 r4 = x0.k.f24334a
            boolean r4 = jc.l.a(r3, r4)
            if (r4 == 0) goto L51
            x0.p1 r3 = new x0.p1
            r3.<init>(r2)
            r6.i0(r3)
            goto L58
        L51:
            java.lang.String r2 = "null cannot be cast to non-null type androidx.compose.runtime.RecomposeScopeImpl"
            jc.l.c(r3, r2)
            x0.p1 r3 = (x0.p1) r3
        L58:
            r2 = 0
            r4 = 1
            if (r7 != 0) goto L70
            int r7 = r3.f24419b
            r5 = r7 & 64
            if (r5 == 0) goto L64
            r5 = 1
            goto L65
        L64:
            r5 = 0
        L65:
            if (r5 == 0) goto L6b
            r7 = r7 & (-65)
            r3.f24419b = r7
        L6b:
            if (r5 == 0) goto L6e
            goto L70
        L6e:
            r7 = 0
            goto L71
        L70:
            r7 = 1
        L71:
            int r5 = r3.f24419b
            if (r7 == 0) goto L78
            r7 = r5 | 8
            goto L7a
        L78:
            r7 = r5 & (-9)
        L7a:
            r3.f24419b = r7
            r1.add(r3)
            int r7 = r6.B
            r3.f24422e = r7
            int r7 = r3.f24419b
            r7 = r7 & (-17)
            r3.f24419b = r7
            r0.Q()
            int r7 = r3.f24419b
            r0 = r7 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto Lb6
            r7 = r7 & (-257(0xfffffffffffffeff, float:NaN))
            r7 = r7 | 512(0x200, float:7.17E-43)
            r3.f24419b = r7
            y0.b r7 = r6.M
            y0.a r7 = r7.f25297b
            y0.k0 r7 = r7.f25294a
            y0.c0 r0 = y0.c0.f25311d
            r7.J(r0)
            ud.n.B(r7, r2, r3)
            boolean r7 = r6.f24399y
            if (r7 != 0) goto Lb6
            int r7 = r3.f24419b
            r0 = r7 & 128(0x80, float:1.8E-43)
            if (r0 == 0) goto Lb6
            r6.f24399y = r4
            r7 = r7 | 1024(0x400, float:1.435E-42)
            r3.f24419b = r7
        Lb6:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: x0.o.Y(int):x0.o");
    }

    public final void Z(Object obj) {
        if (!this.S && this.G.g() == 207 && !jc.l.a(this.G.f(), obj) && this.f24400z < 0) {
            this.f24400z = this.G.f24535g;
            this.f24399y = true;
        }
        R(null, TinkerReport.KEY_APPLIED_FAIL_COST_30S_LESS, obj, 0);
    }

    public final void a() {
        i();
        this.f24383i.clear();
        this.f24388n.f8860b = 0;
        this.f24394t.f8860b = 0;
        this.f24398x.f8860b = 0;
        this.f24396v = null;
        y0.c cVar = this.O;
        cVar.f25310b.F();
        cVar.f25309a.F();
        this.T = 0;
        this.A = 0;
        this.f24392r = false;
        this.S = false;
        this.f24399y = false;
        this.F = false;
        this.f24400z = -1;
        z1 z1Var = this.G;
        if (!z1Var.f24534f) {
            z1Var.c();
        }
        if (this.I.f24287w) {
            return;
        }
        v();
    }

    public final void a0() {
        R(null, 125, null, 2);
        this.f24392r = true;
    }

    public final void b(ic.n nVar, Object obj) {
        if (this.S) {
            y0.k0 k0Var = this.O.f25309a;
            k0Var.J(y0.f0.f25317d);
            ud.n.B(k0Var, 0, obj);
            jc.l.c(nVar, "null cannot be cast to non-null type @[ExtensionFunctionType] kotlin.Function2<kotlin.Any?, kotlin.Any?, kotlin.Unit>");
            jc.c0.c(2, nVar);
            ud.n.B(k0Var, 1, nVar);
            return;
        }
        y0.b bVar = this.M;
        bVar.b();
        y0.k0 k0Var2 = bVar.f25297b.f25294a;
        k0Var2.J(y0.f0.f25317d);
        jc.l.c(nVar, "null cannot be cast to non-null type @[ExtensionFunctionType] kotlin.Function2<kotlin.Any?, kotlin.Any?, kotlin.Unit>");
        jc.c0.c(2, nVar);
        ud.n.C(k0Var2, 0, obj, 1, nVar);
    }

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
    public final void b0() {
        this.f24387m = 0;
        this.G = this.f24377c.j();
        R(null, 100, null, 0);
        r rVar = this.f24376b;
        rVar.o();
        j1 j1VarH = rVar.h();
        this.f24398x.c(this.f24397w ? 1 : 0);
        this.f24397w = f(j1VarH);
        this.K = null;
        if (!this.f24391q) {
            this.f24391q = rVar.d();
        }
        if (!this.C) {
            this.C = rVar.e();
        }
        if (this.C) {
            o2 o2Var = i1.d.f8640a;
            jc.l.c(o2Var, "null cannot be cast to non-null type androidx.compose.runtime.CompositionLocal<kotlin.Any?>");
            j1VarH = ((f1.k) j1VarH).c(o2Var, new p2(y()));
        }
        this.f24395u = j1VarH;
        Set set = (Set) v.w(j1VarH, i1.f.f8642a);
        if (set != null) {
            t tVar = this.U;
            if (tVar == null) {
                tVar = new t(this.f24382h);
                this.U = tVar;
            }
            set.add(tVar);
            rVar.l(set);
        }
        long jF = rVar.f();
        R(null, (int) (jF ^ (jF >>> 32)), null, 0);
    }

    public final boolean c(float f10) {
        Object objC = C();
        if ((objC instanceof Float) && f10 == ((Number) objC).floatValue()) {
            return false;
        }
        i0(Float.valueOf(f10));
        return true;
    }

    public final boolean c0(p1 p1Var, Object obj) {
        a aVar = p1Var.f24420c;
        if (aVar == null) {
            return false;
        }
        int iA = this.G.f24529a.a(aVar);
        if (!this.F || iA < this.G.f24535g) {
            return false;
        }
        ArrayList arrayList = this.f24393s;
        int iE = p.e(iA, arrayList);
        if (iE < 0) {
            int i10 = -(iE + 1);
            if (!(obj instanceof c0)) {
                obj = null;
            }
            arrayList.add(i10, new l0(p1Var, iA, obj));
            return true;
        }
        l0 l0Var = (l0) arrayList.get(iE);
        if (!(obj instanceof c0)) {
            l0Var.f24345c = null;
            return true;
        }
        Object obj2 = l0Var.f24345c;
        if (obj2 == null) {
            l0Var.f24345c = obj;
            return true;
        }
        if (obj2 instanceof o.l0) {
            ((o.l0) obj2).a(obj);
            return true;
        }
        int i11 = o.t0.f16044a;
        o.l0 l0Var2 = new o.l0(2);
        l0Var2.j(obj2);
        l0Var2.j(obj);
        l0Var.f24345c = l0Var2;
        return true;
    }

    public final boolean d(int i10) {
        Object objC = C();
        if ((objC instanceof Integer) && i10 == ((Number) objC).intValue()) {
            return false;
        }
        i0(Integer.valueOf(i10));
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0086  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d0(o.k0 r19) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            java.util.ArrayList r2 = r0.f24393s
            int r3 = ud.b.r(r2)
        La:
            r4 = -1
            if (r4 >= r3) goto L2e
            java.lang.Object r4 = r2.get(r3)
            x0.l0 r4 = (x0.l0) r4
            x0.p1 r5 = r4.f24343a
            x0.a r5 = r5.f24420c
            if (r5 == 0) goto L28
            boolean r6 = r5.a()
            if (r6 == 0) goto L28
            int r6 = r4.f24344b
            int r5 = r5.f24233a
            if (r6 == r5) goto L2b
            r4.f24344b = r5
            goto L2b
        L28:
            r2.remove(r3)
        L2b:
            int r3 = r3 + (-1)
            goto La
        L2e:
            java.lang.Object[] r3 = r1.f15996b
            java.lang.Object[] r4 = r1.f15997c
            long[] r1 = r1.f15995a
            int r5 = r1.length
            int r5 = r5 + (-2)
            if (r5 < 0) goto L8b
            r7 = 0
        L3a:
            r8 = r1[r7]
            long r10 = ~r8
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r14 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r14 == 0) goto L86
            int r10 = r7 - r5
            int r10 = ~r10
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = 0
        L54:
            if (r12 >= r10) goto L84
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.3E-322)
            int r17 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r17 >= 0) goto L80
            int r13 = r7 << 3
            int r13 = r13 + r12
            r14 = r3[r13]
            r13 = r4[r13]
            java.lang.String r15 = "null cannot be cast to non-null type androidx.compose.runtime.RecomposeScopeImpl"
            jc.l.c(r14, r15)
            x0.p1 r14 = (x0.p1) r14
            x0.a r15 = r14.f24420c
            if (r15 == 0) goto L80
            int r15 = r15.f24233a
            x0.r0 r6 = x0.r0.f24438e
            if (r13 != r6) goto L78
            r13 = 0
        L78:
            x0.l0 r6 = new x0.l0
            r6.<init>(r14, r15, r13)
            r2.add(r6)
        L80:
            long r8 = r8 >> r11
            int r12 = r12 + 1
            goto L54
        L84:
            if (r10 != r11) goto L8b
        L86:
            if (r7 == r5) goto L8b
            int r7 = r7 + 1
            goto L3a
        L8b:
            androidx.media3.exoplayer.offline.i r1 = x0.p.f24413f
            vb.p.M(r2, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: x0.o.d0(o.k0):void");
    }

    public final boolean e(long j10) {
        Object objC = C();
        if ((objC instanceof Long) && j10 == ((Number) objC).longValue()) {
            return false;
        }
        i0(Long.valueOf(j10));
        return true;
    }

    public final void e0(int i10, int i11) {
        if (j0(i10) != i11) {
            if (i10 < 0) {
                o.w wVar = this.f24390p;
                if (wVar == null) {
                    wVar = new o.w();
                    this.f24390p = wVar;
                }
                wVar.f(i10, i11);
                return;
            }
            int[] iArr = this.f24389o;
            if (iArr == null) {
                iArr = new int[this.G.f24531c];
                vb.l.q0(iArr, -1, 0, 6);
                this.f24389o = iArr;
            }
            iArr[i10] = i11;
        }
    }

    public final boolean f(Object obj) {
        if (jc.l.a(C(), obj)) {
            return false;
        }
        i0(obj);
        return true;
    }

    public final void f0(int i10, int i11) {
        int iJ0 = j0(i10);
        if (iJ0 != i11) {
            int i12 = i11 - iJ0;
            ArrayList arrayList = this.f24383i;
            int size = arrayList.size() - 1;
            while (i10 != -1) {
                int iJ02 = j0(i10) + i12;
                e0(i10, iJ02);
                int i13 = size;
                while (true) {
                    if (-1 < i13) {
                        i1 i1Var = (i1) arrayList.get(i13);
                        if (i1Var != null && i1Var.a(i10, iJ02)) {
                            size = i13 - 1;
                            break;
                        }
                        i13--;
                    } else {
                        break;
                    }
                }
                if (i10 < 0) {
                    i10 = this.G.f24537i;
                } else if (this.G.l(i10)) {
                    return;
                } else {
                    i10 = this.G.q(i10);
                }
            }
        }
    }

    public final boolean g(boolean z10) {
        Object objC = C();
        if ((objC instanceof Boolean) && z10 == ((Boolean) objC).booleanValue()) {
            return false;
        }
        i0(Boolean.valueOf(z10));
        return true;
    }

    public final f1.k g0(j1 j1Var, f1.k kVar) {
        f1.k kVar2 = (f1.k) j1Var;
        kVar2.getClass();
        f1.j jVar = new f1.j(kVar2);
        jVar.f6632g = kVar2;
        jVar.putAll(kVar);
        f1.k kVarBuild = jVar.build();
        T(TinkerReport.KEY_APPLIED_SUCC_COST_OTHER, p.f24411d);
        C();
        i0(kVarBuild);
        C();
        i0(kVar);
        p(false);
        return kVarBuild;
    }

    public final boolean h(Object obj) {
        if (C() == obj) {
            return false;
        }
        i0(obj);
        return true;
    }

    public final void h0(Object obj) {
        int i10;
        z1 z1Var;
        int i11;
        d2 d2Var;
        if (obj instanceof u1) {
            u1 u1Var = (u1) obj;
            a aVarA = null;
            if (this.S) {
                d2 d2Var2 = this.I;
                int i12 = d2Var2.f24284t;
                if (i12 > d2Var2.f24286v + 1) {
                    int i13 = i12 - 1;
                    int iD = d2Var2.D(d2Var2.f24266b, i13);
                    while (true) {
                        i11 = i13;
                        i13 = iD;
                        d2Var = this.I;
                        if (i13 == d2Var.f24286v || i13 < 0) {
                            break;
                        } else {
                            iD = d2Var.D(d2Var.f24266b, i13);
                        }
                    }
                    aVarA = d2Var.b(i11);
                }
            } else {
                z1 z1Var2 = this.G;
                int i14 = z1Var2.f24535g;
                if (i14 > z1Var2.f24537i + 1) {
                    int i15 = i14 - 1;
                    int iQ = z1Var2.q(i15);
                    while (true) {
                        i10 = i15;
                        i15 = iQ;
                        z1Var = this.G;
                        if (i15 == z1Var.f24537i || i15 < 0) {
                            break;
                        } else {
                            iQ = z1Var.q(i15);
                        }
                    }
                    aVarA = z1Var.a(i10);
                }
            }
            v1 v1Var = new v1(u1Var, aVarA);
            if (this.S) {
                y0.k0 k0Var = this.M.f25297b.f25294a;
                k0Var.J(y0.w.f25349d);
                ud.n.B(k0Var, 0, v1Var);
            }
            this.f24378d.add(obj);
            obj = v1Var;
        }
        i0(obj);
    }

    public final void i() {
        this.f24384j = null;
        this.f24385k = 0;
        this.f24386l = 0;
        this.T = 0L;
        this.f24392r = false;
        y0.b bVar = this.M;
        bVar.f25298c = false;
        bVar.f25299d.f8860b = 0;
        bVar.f25301f = 0;
        bVar.f25300e = true;
        bVar.f25302g = 0;
        bVar.f25303h.clear();
        bVar.f25304i = -1;
        bVar.f25305j = -1;
        bVar.f25306k = -1;
        bVar.f25307l = 0;
        this.E.clear();
        this.f24389o = null;
        this.f24390p = null;
    }

    public final void i0(Object obj) {
        if (this.S) {
            d2 d2Var = this.I;
            if (d2Var.f24278n <= 0 || d2Var.f24273i == d2Var.f24275k) {
                d2Var.E(obj);
                return;
            }
            o.y yVar = d2Var.f24283s;
            if (yVar == null) {
                yVar = new o.y();
            }
            d2Var.f24283s = yVar;
            int i10 = d2Var.f24286v;
            Object objB = yVar.b(i10);
            if (objB == null) {
                objB = new o.g0();
                yVar.h(i10, objB);
            }
            ((o.g0) objB).a(obj);
            return;
        }
        z1 z1Var = this.G;
        boolean z10 = z1Var.f24542n;
        y0.b bVar = this.M;
        if (!z10) {
            a aVarA = z1Var.a(z1Var.f24537i);
            y0.k0 k0Var = bVar.f25297b.f25294a;
            k0Var.J(y0.e.f25314d);
            ud.n.C(k0Var, 0, aVarA, 1, obj);
            return;
        }
        int iC = (z1Var.f24540l - c2.c(z1Var.f24530b, z1Var.f24537i)) - 1;
        if (bVar.f25296a.G.f24537i - bVar.f25301f >= 0) {
            bVar.d(true);
            y0.k0 k0Var2 = bVar.f25297b.f25294a;
            k0Var2.J(y0.r.f25343h);
            ud.n.B(k0Var2, 0, obj);
            k0Var2.f25330c[k0Var2.f25331d - k0Var2.f25328a[k0Var2.f25329b - 1].f25324b] = iC;
            return;
        }
        z1 z1Var2 = this.G;
        a aVarA2 = z1Var2.a(z1Var2.f24537i);
        y0.k0 k0Var3 = bVar.f25297b.f25294a;
        k0Var3.J(y0.r.f25342g);
        ud.n.C(k0Var3, 0, obj, 1, aVarA2);
        k0Var3.f25330c[k0Var3.f25331d - k0Var3.f25328a[k0Var3.f25329b - 1].f25324b] = iC;
    }

    public final Object j(m1 m1Var) {
        return v.w(l(), m1Var);
    }

    public final int j0(int i10) {
        int i11;
        if (i10 >= 0) {
            int[] iArr = this.f24389o;
            return (iArr == null || (i11 = iArr[i10]) < 0) ? this.G.o(i10) : i11;
        }
        o.w wVar = this.f24390p;
        if (wVar == null || wVar.c(i10) < 0) {
            return 0;
        }
        int iC = wVar.c(i10);
        if (iC >= 0) {
            return wVar.f16064c[iC];
        }
        p.a.e("Cannot find value for key " + i10);
        throw null;
    }

    public final void k(ic.a aVar) {
        if (!this.f24392r) {
            p.c("A call to createNode(), emitNode() or useNode() expected was not expected");
        }
        this.f24392r = false;
        if (!this.S) {
            p.c("createNode() can only be called when inserting");
        }
        i2.v vVar = this.f24388n;
        int i10 = vVar.f8859a[vVar.f8860b - 1];
        d2 d2Var = this.I;
        a aVarB = d2Var.b(d2Var.f24286v);
        this.f24386l++;
        y0.c cVar = this.O;
        y0.k0 k0Var = cVar.f25309a;
        k0Var.J(y0.r.f25340e);
        ud.n.B(k0Var, 0, aVar);
        k0Var.f25330c[k0Var.f25331d - k0Var.f25328a[k0Var.f25329b - 1].f25324b] = i10;
        ud.n.B(k0Var, 1, aVarB);
        y0.k0 k0Var2 = cVar.f25310b;
        k0Var2.J(y0.r.f25341f);
        k0Var2.f25330c[k0Var2.f25331d - k0Var2.f25328a[k0Var2.f25329b - 1].f25324b] = i10;
        ud.n.B(k0Var2, 0, aVarB);
    }

    public final void k0() {
        if (!this.f24392r) {
            p.c("A call to createNode(), emitNode() or useNode() expected was not expected");
        }
        this.f24392r = false;
        if (this.S) {
            p.c("useNode() called while inserting");
        }
        z1 z1Var = this.G;
        Object objN = z1Var.n(z1Var.f24537i);
        y0.b bVar = this.M;
        bVar.c();
        bVar.f25303h.add(objN);
        if (this.f24399y && (objN instanceof i)) {
            bVar.b();
            bVar.f25297b.f25294a.J(y0.h0.f25321d);
        }
    }

    public final j1 l() {
        j1 j1Var;
        j1 j1Var2 = this.K;
        if (j1Var2 != null) {
            return j1Var2;
        }
        int iQ = this.G.f24537i;
        boolean z10 = this.S;
        y0 y0Var = p.f24410c;
        if (z10 && this.J) {
            int iD = this.I.f24286v;
            while (iD > 0) {
                d2 d2Var = this.I;
                if (d2Var.f24266b[d2Var.r(iD) * 5] == 202 && jc.l.a(this.I.s(iD), y0Var)) {
                    Object objQ = this.I.q(iD);
                    jc.l.c(objQ, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
                    j1 j1Var3 = (j1) objQ;
                    this.K = j1Var3;
                    return j1Var3;
                }
                d2 d2Var2 = this.I;
                iD = d2Var2.D(d2Var2.f24266b, iD);
            }
        }
        if (this.G.f24531c > 0) {
            while (iQ > 0) {
                if (this.G.i(iQ) == 202) {
                    z1 z1Var = this.G;
                    if (jc.l.a(z1Var.p(z1Var.f24530b, iQ), y0Var)) {
                        o.y yVar = this.f24396v;
                        if (yVar == null || (j1Var = (j1) yVar.b(iQ)) == null) {
                            z1 z1Var2 = this.G;
                            Object objB = z1Var2.b(z1Var2.f24530b, iQ);
                            jc.l.c(objB, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
                            j1Var = (j1) objB;
                        }
                        this.K = j1Var;
                        return j1Var;
                    }
                }
                iQ = this.G.q(iQ);
            }
        }
        j1 j1Var4 = this.f24395u;
        this.K = j1Var4;
        return j1Var4;
    }

    public final List m() {
        boolean z10 = this.C;
        List list = vb.r.f22819a;
        if (!z10) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        d2 d2Var = this.I;
        arrayList.addAll(lc.b.l(d2Var, null, d2Var.f24284t, null));
        z1 z1Var = this.G;
        if (!z1Var.f24534f && z1Var.f24531c != 0) {
            i1.i iVar = new i1.i(z1Var);
            int iQ = z1Var.f24537i;
            Object objValueOf = Integer.valueOf(z1Var.f24540l - c2.c(z1Var.f24530b, iQ));
            while (iQ >= 0) {
                iVar.d(z1Var.f24529a.m(iQ), objValueOf);
                objValueOf = z1Var.a(iQ);
                iQ = z1Var.q(iQ);
            }
            list = iVar.f8636a;
        }
        arrayList.addAll(list);
        arrayList.addAll(D());
        return arrayList;
    }

    public final void n(o.k0 k0Var, ic.n nVar) {
        ArrayList arrayList = this.f24393s;
        if (this.F) {
            p.c("Reentrant composition is not supported");
        }
        this.f24381g.Q();
        Trace.beginSection("Compose:recompose");
        try {
            long jG = h1.n.k().g();
            this.B = (int) (jG ^ (jG >>> 32));
            this.f24396v = null;
            d0(k0Var);
            this.f24385k = 0;
            this.F = true;
            try {
                b0();
                Object objC = C();
                if (objC != nVar && nVar != null) {
                    i0(nVar);
                }
                h1.w wVar = this.D;
                z0.e eVarN = v.n();
                try {
                    eVarN.b(wVar);
                    y0 y0Var = p.f24408a;
                    if (nVar != null) {
                        T(TinkerReport.KEY_APPLIED_SUCC_COST_5S_LESS, y0Var);
                        f1.g.d(this, nVar);
                        p(false);
                    } else if (!this.f24397w || objC == null || objC.equals(k.f24334a)) {
                        O();
                    } else {
                        T(TinkerReport.KEY_APPLIED_SUCC_COST_5S_LESS, y0Var);
                        jc.c0.c(2, objC);
                        f1.g.d(this, (ic.n) objC);
                        p(false);
                    }
                    eVarN.k(eVarN.f26374c - 1);
                    t();
                    this.F = false;
                    arrayList.clear();
                    if (!this.I.f24287w) {
                        p.c("Check failed");
                    }
                    v();
                } catch (Throwable th2) {
                    eVarN.k(eVarN.f26374c - 1);
                    throw th2;
                }
            } finally {
            }
        } finally {
            Trace.endSection();
        }
    }

    public final void o(int i10, int i11) {
        if (i10 <= 0 || i10 == i11) {
            return;
        }
        o(this.G.q(i10), i11);
        if (this.G.l(i10)) {
            Object objN = this.G.n(i10);
            y0.b bVar = this.M;
            bVar.c();
            bVar.f25303h.add(objN);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:150:0x03ac  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x051f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void p(boolean r43) {
        /*
            Method dump skipped, instruction units count: 1626
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: x0.o.p(boolean):void");
    }

    public final void q() {
        p(false);
        p1 p1VarW = w();
        if (p1VarW != null) {
            int i10 = p1VarW.f24419b;
            if ((i10 & 1) != 0) {
                p1VarW.f24419b = i10 | 2;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0082 A[EDGE_INSN: B:59:0x0082->B:28:0x0082 BREAK  A[LOOP:0: B:15:0x003e->B:27:0x007f], EDGE_INSN: B:60:0x0082->B:28:0x0082 BREAK  A[LOOP:0: B:15:0x003e->B:27:0x007f]] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final x0.p1 r() {
        /*
            Method dump skipped, instruction units count: 248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: x0.o.r():x0.p1");
    }

    public final void s() {
        if (this.F || this.f24400z != 100) {
            k1.a("Cannot disable reuse from root if it was caused by other groups");
        }
        this.f24400z = -1;
        this.f24399y = false;
    }

    public final void t() {
        p(false);
        this.f24376b.b();
        p(false);
        y0.b bVar = this.M;
        if (bVar.f25298c) {
            bVar.d(false);
            bVar.d(false);
            bVar.f25297b.f25294a.J(y0.m.f25335d);
            bVar.f25298c = false;
        }
        bVar.b();
        if (bVar.f25299d.f8860b != 0) {
            p.c("Missed recording an endGroup()");
        }
        if (!this.f24383i.isEmpty()) {
            p.c("Start/end imbalance");
        }
        i();
        this.G.c();
        this.f24397w = this.f24398x.b() != 0;
    }

    public final void u(boolean z10, i1 i1Var) {
        this.f24383i.add(this.f24384j);
        this.f24384j = i1Var;
        int i10 = this.f24386l;
        i2.v vVar = this.f24388n;
        vVar.c(i10);
        vVar.c(this.f24387m);
        vVar.c(this.f24385k);
        if (z10) {
            this.f24385k = 0;
        }
        this.f24386l = 0;
        this.f24387m = 0;
    }

    public final void v() {
        a2 a2Var = new a2();
        if (this.C) {
            a2Var.i();
        }
        if (this.f24376b.c()) {
            a2Var.f24246k = new o.y();
        }
        this.H = a2Var;
        d2 d2VarK = a2Var.k();
        d2VarK.e(true);
        this.I = d2VarK;
    }

    public final p1 w() {
        if (this.A != 0) {
            return null;
        }
        ArrayList arrayList = this.E;
        if (arrayList.isEmpty()) {
            return null;
        }
        return (p1) arrayList.get(arrayList.size() - 1);
    }

    public final boolean x() {
        if (!z() || this.f24397w) {
            return true;
        }
        p1 p1VarW = w();
        return (p1VarW == null || (p1VarW.f24419b & 4) == 0) ? false : true;
    }

    public final i1.c y() {
        if (this.C) {
            return this.Q;
        }
        return null;
    }

    public final boolean z() {
        p1 p1VarW;
        return (this.S || this.f24399y || this.f24397w || (p1VarW = w()) == null || (p1VarW.f24419b & 8) != 0) ? false : true;
    }
}
