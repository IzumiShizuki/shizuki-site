package j5;

import android.net.Uri;
import android.os.Handler;
import b0.w1;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class t0 implements b0, r5.q, n5.j, n5.m, a1 {
    public static final Map Q;
    public static final m4.q R;
    public w1 A;
    public r5.b0 B;
    public long C;
    public boolean D;
    public int E;
    public boolean F;
    public boolean G;
    public boolean H;
    public int I;
    public boolean J;
    public long K;
    public long L;
    public boolean M;
    public int N;
    public boolean O;
    public boolean P;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Uri f10418a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s4.h f10419b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b5.t f10420c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final m3.l f10421d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ah.j f10422e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final b5.q f10423f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final w0 f10424g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final n5.f f10425h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f10426i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f10427j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final m4.q f10428k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final long f10429l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final n5.o f10430m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final c7.e1 f10431n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final p4.f f10432o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final o0 f10433p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final o0 f10434q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Handler f10435r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public a0 f10436s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public e6.b f10437t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public b1[] f10438u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public s0[] f10439v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f10440w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f10441x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f10442y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f10443z;

    static {
        HashMap map = new HashMap();
        map.put("Icy-MetaData", "1");
        Q = Collections.unmodifiableMap(map);
        m4.p pVar = new m4.p();
        pVar.f14476a = "icy";
        pVar.f14488m = m4.o0.p("application/x-icy");
        R = new m4.q(pVar);
    }

    public t0(Uri uri, s4.h hVar, c7.e1 e1Var, b5.t tVar, b5.q qVar, m3.l lVar, ah.j jVar, w0 w0Var, n5.f fVar, String str, int i10, m4.q qVar2, long j10, o5.a aVar) {
        this.f10418a = uri;
        this.f10419b = hVar;
        this.f10420c = tVar;
        this.f10423f = qVar;
        this.f10421d = lVar;
        this.f10422e = jVar;
        this.f10424g = w0Var;
        this.f10425h = fVar;
        this.f10426i = str;
        this.f10427j = i10;
        this.f10428k = qVar2;
        this.f10430m = aVar != null ? new n5.o(aVar) : new n5.o("ProgressiveMediaPeriod");
        this.f10431n = e1Var;
        this.f10429l = j10;
        this.f10432o = new p4.f();
        this.f10433p = new o0(this, 1);
        this.f10434q = new o0(this, 2);
        this.f10435r = p4.c0.n(null);
        this.f10439v = new s0[0];
        this.f10438u = new b1[0];
        this.L = -9223372036854775807L;
        this.E = 1;
    }

    public final void A() {
        long j10 = this.f10429l;
        if (this.P || this.f10441x || !this.f10440w || this.B == null) {
            return;
        }
        for (b1 b1Var : this.f10438u) {
            if (b1Var.w() == null) {
                return;
            }
        }
        p4.f fVar = this.f10432o;
        synchronized (fVar) {
            fVar.f16572a = false;
        }
        int length = this.f10438u.length;
        m4.j1[] j1VarArr = new m4.j1[length];
        boolean[] zArr = new boolean[length];
        for (int i10 = 0; i10 < length; i10++) {
            m4.q qVarW = this.f10438u[i10].w();
            qVarW.getClass();
            String str = qVarW.f14544n;
            boolean zK = m4.o0.k(str);
            boolean z10 = zK || m4.o0.o(str);
            zArr[i10] = z10;
            this.f10442y = z10 | this.f10442y;
            this.f10443z = j10 != -9223372036854775807L && length == 1 && m4.o0.m(str);
            e6.b bVar = this.f10437t;
            if (bVar != null) {
                int i11 = bVar.f6289a;
                if (zK || this.f10439v[i10].f10412b) {
                    m4.n0 n0Var = qVarW.f14542l;
                    m4.n0 n0Var2 = n0Var == null ? new m4.n0(bVar) : n0Var.a(bVar);
                    m4.p pVarA = qVarW.a();
                    pVarA.f14486k = n0Var2;
                    qVarW = new m4.q(pVarA);
                }
                if (zK && qVarW.f14538h == -1 && qVarW.f14539i == -1 && i11 != -1) {
                    m4.p pVarA2 = qVarW.a();
                    pVarA2.f14483h = i11;
                    qVarW = new m4.q(pVarA2);
                }
            }
            int iK = this.f10420c.k(qVarW);
            m4.p pVarA3 = qVarW.a();
            pVarA3.L = iK;
            m4.q qVar = new m4.q(pVarA3);
            j1VarArr[i10] = new m4.j1(Integer.toString(i10), qVar);
            this.H = qVar.f14550t | this.H;
        }
        this.A = new w1(new o1(j1VarArr), zArr);
        if (this.f10443z && this.C == -9223372036854775807L) {
            this.C = j10;
            this.B = new p0(this, this.B);
        }
        this.f10424g.v(this.C, this.B.e(), this.D);
        this.f10441x = true;
        a0 a0Var = this.f10436s;
        a0Var.getClass();
        a0Var.a(this);
    }

    public final void B(int i10) {
        j();
        w1 w1Var = this.A;
        boolean[] zArr = (boolean[]) w1Var.f1394b;
        if (zArr[i10]) {
            return;
        }
        m4.q qVar = ((o1) w1Var.f1395c).a(i10).f14307d[0];
        this.f10422e.j(m4.o0.i(qVar.f14544n), qVar, 0, null, this.K);
        zArr[i10] = true;
    }

    public final void C(int i10) {
        j();
        if (this.M) {
            if ((!this.f10442y || ((boolean[]) this.A.f1396d)[i10]) && !this.f10438u[i10].x(false)) {
                this.L = 0L;
                this.M = false;
                this.G = true;
                this.K = 0L;
                this.N = 0;
                for (b1 b1Var : this.f10438u) {
                    b1Var.D(false);
                }
                a0 a0Var = this.f10436s;
                a0Var.getClass();
                a0Var.c(this);
            }
        }
    }

    public final r5.h0 D(s0 s0Var) {
        int length = this.f10438u.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (s0Var.equals(this.f10439v[i10])) {
                return this.f10438u[i10];
            }
        }
        if (this.f10440w) {
            p4.c.B("ProgressiveMediaPeriod", "Extractor added new track (id=" + s0Var.f10411a + ") after finishing tracks.");
            return new r5.m();
        }
        b5.t tVar = this.f10420c;
        tVar.getClass();
        b1 b1Var = new b1(this.f10425h, tVar, this.f10423f);
        b1Var.f10214f = this;
        int i11 = length + 1;
        s0[] s0VarArr = (s0[]) Arrays.copyOf(this.f10439v, i11);
        s0VarArr[length] = s0Var;
        int i12 = p4.c0.f16548a;
        this.f10439v = s0VarArr;
        b1[] b1VarArr = (b1[]) Arrays.copyOf(this.f10438u, i11);
        b1VarArr[length] = b1Var;
        this.f10438u = b1VarArr;
        return b1Var;
    }

    public final void E(r5.b0 b0Var) {
        this.B = this.f10437t == null ? b0Var : new r5.s(-9223372036854775807L);
        this.C = b0Var.m();
        boolean z10 = !this.J && b0Var.m() == -9223372036854775807L;
        this.D = z10;
        this.E = z10 ? 7 : 1;
        if (this.f10441x) {
            this.f10424g.v(this.C, b0Var.e(), this.D);
        } else {
            A();
        }
    }

    public final void F() {
        q0 q0Var = new q0(this, this.f10418a, this.f10419b, this.f10431n, this, this.f10432o);
        if (this.f10441x) {
            p4.c.i(z());
            long j10 = this.C;
            if (j10 != -9223372036854775807L && this.L > j10) {
                this.O = true;
                this.L = -9223372036854775807L;
                return;
            }
            r5.b0 b0Var = this.B;
            b0Var.getClass();
            long j11 = b0Var.k(this.L).f18750a.f18785b;
            long j12 = this.L;
            q0Var.f10399f.f1169a = j11;
            q0Var.f10402i = j12;
            q0Var.f10401h = true;
            q0Var.f10405l = false;
            for (b1 b1Var : this.f10438u) {
                b1Var.f10228t = this.L;
            }
            this.L = -9223372036854775807L;
        }
        this.N = x();
        this.f10430m.f(q0Var, this, this.f10421d.u(this.E));
    }

    public final boolean G() {
        return this.G || z();
    }

    @Override // r5.q
    public final void a(r5.b0 b0Var) {
        this.f10435r.post(new b5.h(15, this, b0Var));
    }

    @Override // j5.a1
    public final void b() {
        this.f10435r.post(this.f10433p);
    }

    @Override // n5.m
    public final void c() {
        for (b1 b1Var : this.f10438u) {
            b1Var.D(true);
            b5.l lVar = b1Var.f10216h;
            if (lVar != null) {
                lVar.c(b1Var.f10213e);
                b1Var.f10216h = null;
                b1Var.f10215g = null;
            }
        }
        c7.e1 e1Var = this.f10431n;
        r5.n nVar = (r5.n) e1Var.f3619c;
        if (nVar != null) {
            nVar.a();
            e1Var.f3619c = null;
        }
        e1Var.f3620d = null;
    }

    @Override // j5.e1
    public final long d() {
        return t();
    }

    @Override // j5.e1
    public final boolean e(v4.f0 f0Var) {
        if (this.O) {
            return false;
        }
        n5.o oVar = this.f10430m;
        if (oVar.c() || this.M) {
            return false;
        }
        if ((this.f10441x || this.f10428k != null) && this.I == 0) {
            return false;
        }
        boolean zF = this.f10432o.f();
        if (oVar.d()) {
            return zF;
        }
        F();
        return true;
    }

    @Override // j5.b0
    public final void f() throws IOException {
        int iU = this.f10421d.u(this.E);
        n5.o oVar = this.f10430m;
        IOException iOException = oVar.f15374c;
        if (iOException != null) {
            throw iOException;
        }
        n5.k kVar = oVar.f15373b;
        if (kVar != null) {
            if (iU == Integer.MIN_VALUE) {
                iU = kVar.f15359a;
            }
            IOException iOException2 = kVar.f15363e;
            if (iOException2 != null && kVar.f15364f > iU) {
                throw iOException2;
            }
        }
        if (this.O && !this.f10441x) {
            throw m4.p0.a(null, "Loading finished before preparation is complete.");
        }
    }

    @Override // j5.b0
    public final void g(a0 a0Var, long j10) {
        this.f10436s = a0Var;
        m4.q qVar = this.f10428k;
        if (qVar == null) {
            this.f10432o.f();
            F();
        } else {
            u(0, 3).b(qVar);
            E(new r5.y(-9223372036854775807L, new long[]{0}, new long[]{0}));
            n();
            this.L = j10;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0071  */
    @Override // j5.b0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long h(long r10) {
        /*
            r9 = this;
            r9.j()
            b0.w1 r0 = r9.A
            java.lang.Object r0 = r0.f1396d
            boolean[] r0 = (boolean[]) r0
            r5.b0 r1 = r9.B
            boolean r1 = r1.e()
            if (r1 == 0) goto L12
            goto L14
        L12:
            r10 = 0
        L14:
            r1 = 0
            r9.G = r1
            long r2 = r9.K
            r4 = 1
            int r5 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r5 != 0) goto L20
            r2 = 1
            goto L21
        L20:
            r2 = 0
        L21:
            r9.K = r10
            boolean r3 = r9.z()
            if (r3 == 0) goto L2c
            r9.L = r10
            return r10
        L2c:
            int r3 = r9.E
            r5 = 7
            n5.o r6 = r9.f10430m
            if (r3 == r5) goto L71
            boolean r3 = r9.O
            if (r3 != 0) goto L3d
            boolean r3 = r6.d()
            if (r3 == 0) goto L71
        L3d:
            j5.b1[] r3 = r9.f10438u
            int r3 = r3.length
            r5 = 0
        L41:
            if (r5 >= r3) goto L6e
            j5.b1[] r7 = r9.f10438u
            r7 = r7[r5]
            int r8 = r7.t()
            if (r8 != 0) goto L50
            if (r2 == 0) goto L50
            goto L6b
        L50:
            boolean r8 = r9.f10443z
            if (r8 == 0) goto L5b
            int r8 = r7.f10225q
            boolean r7 = r7.F(r8)
            goto L5f
        L5b:
            boolean r7 = r7.G(r10, r1)
        L5f:
            if (r7 != 0) goto L6b
            boolean r7 = r0[r5]
            if (r7 != 0) goto L69
            boolean r7 = r9.f10442y
            if (r7 != 0) goto L6b
        L69:
            r4 = 0
            goto L6e
        L6b:
            int r5 = r5 + 1
            goto L41
        L6e:
            if (r4 == 0) goto L71
            goto La1
        L71:
            r9.M = r1
            r9.L = r10
            r9.O = r1
            r9.H = r1
            boolean r0 = r6.d()
            if (r0 == 0) goto L90
            j5.b1[] r0 = r9.f10438u
            int r2 = r0.length
        L82:
            if (r1 >= r2) goto L8c
            r3 = r0[r1]
            r3.k()
            int r1 = r1 + 1
            goto L82
        L8c:
            r6.a()
            return r10
        L90:
            r0 = 0
            r6.f15374c = r0
            j5.b1[] r0 = r9.f10438u
            int r2 = r0.length
            r3 = 0
        L97:
            if (r3 >= r2) goto La1
            r4 = r0[r3]
            r4.D(r1)
            int r3 = r3 + 1
            goto L97
        La1:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: j5.t0.h(long):long");
    }

    @Override // j5.b0
    public final void i(long j10) throws Throwable {
        if (this.f10443z) {
            return;
        }
        j();
        if (z()) {
            return;
        }
        boolean[] zArr = (boolean[]) this.A.f1397e;
        int length = this.f10438u.length;
        for (int i10 = 0; i10 < length; i10++) {
            this.f10438u[i10].j(j10, zArr[i10]);
        }
    }

    public final void j() {
        p4.c.i(this.f10441x);
        this.A.getClass();
        this.B.getClass();
    }

    @Override // n5.j
    public final void k(n5.l lVar, long j10, long j11) {
        r5.b0 b0Var;
        q0 q0Var = (q0) lVar;
        if (this.C == -9223372036854775807L && (b0Var = this.B) != null) {
            boolean zE = b0Var.e();
            long jY = y(true);
            long j12 = jY == Long.MIN_VALUE ? 0L : jY + 10000;
            this.C = j12;
            this.f10424g.v(j12, zE, this.D);
        }
        Uri uri = q0Var.f10395b.f19399c;
        u uVar = new u(j11);
        this.f10421d.getClass();
        this.f10422e.B(uVar, 1, -1, null, 0, null, q0Var.f10402i, this.C);
        this.O = true;
        a0 a0Var = this.f10436s;
        a0Var.getClass();
        a0Var.c(this);
    }

    @Override // j5.b0
    public final long l(m5.r[] rVarArr, boolean[] zArr, c1[] c1VarArr, boolean[] zArr2, long j10) {
        m5.r rVar;
        j();
        w1 w1Var = this.A;
        o1 o1Var = (o1) w1Var.f1395c;
        boolean[] zArr3 = (boolean[]) w1Var.f1397e;
        int i10 = this.I;
        int i11 = 0;
        for (int i12 = 0; i12 < rVarArr.length; i12++) {
            c1 c1Var = c1VarArr[i12];
            if (c1Var != null && (rVarArr[i12] == null || !zArr[i12])) {
                int i13 = ((r0) c1Var).f10408a;
                p4.c.i(zArr3[i13]);
                this.I--;
                zArr3[i13] = false;
                c1VarArr[i12] = null;
            }
        }
        boolean z10 = !this.F ? j10 == 0 || this.f10443z : i10 != 0;
        for (int i14 = 0; i14 < rVarArr.length; i14++) {
            if (c1VarArr[i14] == null && (rVar = rVarArr[i14]) != null) {
                p4.c.i(rVar.length() == 1);
                p4.c.i(rVar.i(0) == 0);
                int iB = o1Var.b(rVar.b());
                p4.c.i(!zArr3[iB]);
                this.I++;
                zArr3[iB] = true;
                this.H = rVar.m().f14550t | this.H;
                c1VarArr[i14] = new r0(this, iB);
                zArr2[i14] = true;
                if (!z10) {
                    b1 b1Var = this.f10438u[iB];
                    z10 = (b1Var.t() == 0 || b1Var.G(j10, true)) ? false : true;
                }
            }
        }
        if (this.I == 0) {
            this.M = false;
            this.G = false;
            this.H = false;
            n5.o oVar = this.f10430m;
            if (oVar.d()) {
                b1[] b1VarArr = this.f10438u;
                int length = b1VarArr.length;
                while (i11 < length) {
                    b1VarArr[i11].k();
                    i11++;
                }
                oVar.a();
            } else {
                this.O = false;
                for (b1 b1Var2 : this.f10438u) {
                    b1Var2.D(false);
                }
            }
        } else if (z10) {
            j10 = h(j10);
            while (i11 < c1VarArr.length) {
                if (c1VarArr[i11] != null) {
                    zArr2[i11] = true;
                }
                i11++;
            }
        }
        this.F = true;
        return j10;
    }

    @Override // j5.e1
    public final boolean m() {
        return this.f10430m.d() && this.f10432o.e();
    }

    @Override // r5.q
    public final void n() {
        this.f10440w = true;
        this.f10435r.post(this.f10433p);
    }

    @Override // j5.b0
    public final long o(long j10, v4.b1 b1Var) {
        j();
        if (!this.B.e()) {
            return 0L;
        }
        r5.a0 a0VarK = this.B.k(j10);
        return b1Var.a(j10, a0VarK.f18750a.f18784a, a0VarK.f18751b.f18784a);
    }

    @Override // j5.b0
    public final long p() {
        if (this.H) {
            this.H = false;
            return this.K;
        }
        if (!this.G) {
            return -9223372036854775807L;
        }
        if (!this.O && x() <= this.N) {
            return -9223372036854775807L;
        }
        this.G = false;
        return this.K;
    }

    @Override // j5.b0
    public final o1 q() {
        j();
        return (o1) this.A.f1395c;
    }

    @Override // n5.j
    public final void r(n5.l lVar, long j10, long j11, int i10) {
        u uVar;
        q0 q0Var = (q0) lVar;
        s4.d0 d0Var = q0Var.f10395b;
        if (i10 == 0) {
            uVar = new u(q0Var.f10403j);
        } else {
            Uri uri = d0Var.f19399c;
            uVar = new u(j11);
        }
        this.f10422e.E(uVar, 1, -1, null, 0, null, q0Var.f10402i, this.C, i10);
    }

    @Override // n5.j
    public final void s(n5.l lVar, long j10, long j11, boolean z10) {
        q0 q0Var = (q0) lVar;
        Uri uri = q0Var.f10395b.f19399c;
        u uVar = new u(j11);
        this.f10421d.getClass();
        this.f10422e.A(uVar, 1, -1, null, 0, null, q0Var.f10402i, this.C);
        if (z10) {
            return;
        }
        for (b1 b1Var : this.f10438u) {
            b1Var.D(false);
        }
        if (this.I > 0) {
            a0 a0Var = this.f10436s;
            a0Var.getClass();
            a0Var.c(this);
        }
    }

    @Override // j5.e1
    public final long t() {
        long jY;
        boolean z10;
        j();
        if (this.O || this.I == 0) {
            return Long.MIN_VALUE;
        }
        if (z()) {
            return this.L;
        }
        if (this.f10442y) {
            int length = this.f10438u.length;
            jY = Long.MAX_VALUE;
            for (int i10 = 0; i10 < length; i10++) {
                w1 w1Var = this.A;
                if (((boolean[]) w1Var.f1396d)[i10] && ((boolean[]) w1Var.f1397e)[i10]) {
                    b1 b1Var = this.f10438u[i10];
                    synchronized (b1Var) {
                        z10 = b1Var.f10231w;
                    }
                    if (!z10) {
                        jY = Math.min(jY, this.f10438u[i10].q());
                    }
                }
            }
        } else {
            jY = Long.MAX_VALUE;
        }
        if (jY == Long.MAX_VALUE) {
            jY = y(false);
        }
        return jY == Long.MIN_VALUE ? this.K : jY;
    }

    @Override // r5.q
    public final r5.h0 u(int i10, int i11) {
        return D(new s0(i10, false));
    }

    @Override // n5.j
    public final b7.q0 v(n5.l lVar, long j10, long j11, IOException iOException, int i10) {
        long jMin;
        b7.q0 q0Var;
        r5.b0 b0Var;
        q0 q0Var2 = (q0) lVar;
        Uri uri = q0Var2.f10395b.f19399c;
        u uVar = new u(j11);
        int i11 = p4.c0.f16548a;
        this.f10421d.getClass();
        if ((iOException instanceof m4.p0) || (iOException instanceof FileNotFoundException) || (iOException instanceof s4.v) || (iOException instanceof n5.n)) {
            jMin = -9223372036854775807L;
            break;
        }
        int i12 = s4.j.f19426b;
        for (Throwable cause = iOException; cause != null; cause = cause.getCause()) {
            if ((cause instanceof s4.j) && ((s4.j) cause).f19427a == 2008) {
                jMin = -9223372036854775807L;
                break;
            }
        }
        jMin = Math.min((i10 - 1) * 1000, 5000);
        if (jMin == -9223372036854775807L) {
            q0Var = n5.o.f15371f;
        } else {
            int iX = x();
            int i13 = iX > this.N ? 1 : 0;
            if (this.J || !((b0Var = this.B) == null || b0Var.m() == -9223372036854775807L)) {
                this.N = iX;
            } else if (!this.f10441x || G()) {
                this.G = this.f10441x;
                this.K = 0L;
                this.N = 0;
                for (b1 b1Var : this.f10438u) {
                    b1Var.D(false);
                }
                q0Var2.f10399f.f1169a = 0L;
                q0Var2.f10402i = 0L;
                q0Var2.f10401h = true;
                q0Var2.f10405l = false;
            } else {
                this.M = true;
                q0Var = n5.o.f15370e;
            }
            q0Var = new b7.q0(i13, false, jMin);
        }
        b7.q0 q0Var3 = q0Var;
        this.f10422e.C(uVar, 1, -1, null, 0, null, q0Var2.f10402i, this.C, iOException, !q0Var3.a());
        return q0Var3;
    }

    public final int x() {
        int i10 = 0;
        for (b1 b1Var : this.f10438u) {
            i10 += b1Var.f10225q + b1Var.f10224p;
        }
        return i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long y(boolean r6) {
        /*
            r5 = this;
            r0 = -9223372036854775808
            r2 = 0
        L3:
            j5.b1[] r3 = r5.f10438u
            int r3 = r3.length
            if (r2 >= r3) goto L26
            if (r6 != 0) goto L17
            b0.w1 r3 = r5.A
            r3.getClass()
            java.lang.Object r3 = r3.f1397e
            boolean[] r3 = (boolean[]) r3
            boolean r3 = r3[r2]
            if (r3 == 0) goto L23
        L17:
            j5.b1[] r3 = r5.f10438u
            r3 = r3[r2]
            long r3 = r3.q()
            long r0 = java.lang.Math.max(r0, r3)
        L23:
            int r2 = r2 + 1
            goto L3
        L26:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: j5.t0.y(boolean):long");
    }

    public final boolean z() {
        return this.L != -9223372036854775807L;
    }

    @Override // j5.e1
    public final void w(long j10) {
    }
}
