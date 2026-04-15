package c5;

import android.net.Uri;
import android.os.Handler;
import android.util.SparseIntArray;
import b0.c1;
import b7.q0;
import j5.a1;
import j5.e1;
import j5.o1;
import j5.u;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import m4.j1;
import m4.n0;
import m4.o0;
import p4.c0;
import r5.b0;
import r5.h0;
import s4.y;
import v4.e0;
import v4.f0;
import ya.i0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class q implements n5.j, n5.m, e1, r5.q, a1 {
    public static final Set Y = Collections.unmodifiableSet(new HashSet(Arrays.asList(1, 2, 5)));
    public int A;
    public int B;
    public boolean C;
    public boolean D;
    public int E;
    public m4.q F;
    public m4.q G;
    public boolean H;
    public o1 I;
    public Set J;
    public int[] K;
    public int L;
    public boolean M;
    public boolean[] N;
    public boolean[] O;
    public long P;
    public long Q;
    public boolean R;
    public boolean S;
    public boolean T;
    public boolean U;
    public long V;
    public m4.n W;
    public j X;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3526a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f3527b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c1 f3528c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i f3529d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final n5.f f3530e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final m4.q f3531f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final b5.t f3532g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final b5.q f3533h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final m3.l f3534i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final n5.o f3535j = new n5.o("Loader:HlsSampleStreamWrapper");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ah.j f3536k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f3537l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final b7.n f3538m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ArrayList f3539n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final List f3540o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final n f3541p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final n f3542q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Handler f3543r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final ArrayList f3544s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Map f3545t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public k5.f f3546u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public p[] f3547v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int[] f3548w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final HashSet f3549x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final SparseIntArray f3550y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public o f3551z;

    /* JADX WARN: Type inference failed for: r1v12, types: [c5.n] */
    /* JADX WARN: Type inference failed for: r1v13, types: [c5.n] */
    public q(String str, int i10, c1 c1Var, i iVar, Map map, n5.f fVar, long j10, m4.q qVar, b5.t tVar, b5.q qVar2, m3.l lVar, ah.j jVar, int i11) {
        this.f3526a = str;
        this.f3527b = i10;
        this.f3528c = c1Var;
        this.f3529d = iVar;
        this.f3545t = map;
        this.f3530e = fVar;
        this.f3531f = qVar;
        this.f3532g = tVar;
        this.f3533h = qVar2;
        this.f3534i = lVar;
        this.f3536k = jVar;
        this.f3537l = i11;
        b7.n nVar = new b7.n(4);
        nVar.f1985c = null;
        final int i12 = 0;
        nVar.f1984b = false;
        nVar.f1986d = null;
        this.f3538m = nVar;
        this.f3548w = new int[0];
        Set set = Y;
        this.f3549x = new HashSet(set.size());
        this.f3550y = new SparseIntArray(set.size());
        this.f3547v = new p[0];
        this.O = new boolean[0];
        this.N = new boolean[0];
        ArrayList arrayList = new ArrayList();
        this.f3539n = arrayList;
        this.f3540o = Collections.unmodifiableList(arrayList);
        this.f3544s = new ArrayList();
        this.f3541p = new Runnable(this) { // from class: c5.n

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ q f3518b;

            {
                this.f3518b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i12) {
                    case 0:
                        this.f3518b.E();
                        break;
                    default:
                        q qVar3 = this.f3518b;
                        qVar3.C = true;
                        qVar3.E();
                        break;
                }
            }
        };
        final int i13 = 1;
        this.f3542q = new Runnable(this) { // from class: c5.n

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ q f3518b;

            {
                this.f3518b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i13) {
                    case 0:
                        this.f3518b.E();
                        break;
                    default:
                        q qVar3 = this.f3518b;
                        qVar3.C = true;
                        qVar3.E();
                        break;
                }
            }
        };
        this.f3543r = c0.n(null);
        this.P = j10;
        this.Q = j10;
    }

    public static int C(int i10) {
        if (i10 == 1) {
            return 2;
        }
        if (i10 != 2) {
            return i10 != 3 ? 0 : 1;
        }
        return 3;
    }

    public static r5.m x(int i10, int i11) {
        p4.c.B("HlsSampleStreamWrapper", "Unmapped track with id " + i10 + " of type " + i11);
        return new r5.m();
    }

    public static m4.q z(m4.q qVar, m4.q qVar2, boolean z10) {
        String strC;
        if (qVar == null) {
            return qVar2;
        }
        String str = qVar.f14541k;
        String strE = qVar2.f14544n;
        int i10 = o0.i(strE);
        if (c0.t(i10, str) == 1) {
            strC = c0.u(i10, str);
            strE = o0.e(strC);
        } else {
            strC = o0.c(str, strE);
        }
        m4.p pVarA = qVar2.a();
        pVarA.f14476a = qVar.f14531a;
        pVarA.f14477b = qVar.f14532b;
        pVarA.f14478c = i0.q(qVar.f14533c);
        pVarA.f14479d = qVar.f14534d;
        pVarA.f14480e = qVar.f14535e;
        pVarA.f14481f = qVar.f14536f;
        pVarA.f14483h = z10 ? qVar.f14538h : -1;
        pVarA.f14484i = z10 ? qVar.f14539i : -1;
        pVarA.f14485j = strC;
        if (i10 == 2) {
            pVarA.f14495t = qVar.f14551u;
            pVarA.f14496u = qVar.f14552v;
            pVarA.f14497v = qVar.f14553w;
        }
        if (strE != null) {
            pVarA.f14488m = o0.p(strE);
        }
        int i11 = qVar.D;
        if (i11 != -1 && i10 == 1) {
            pVarA.C = i11;
        }
        n0 n0VarB = qVar.f14542l;
        if (n0VarB != null) {
            n0 n0Var = qVar2.f14542l;
            if (n0Var != null) {
                n0VarB = n0Var.b(n0VarB);
            }
            pVarA.f14486k = n0VarB;
        }
        return new m4.q(pVarA);
    }

    public final void A(int i10) {
        ArrayList arrayList;
        p4.c.i(!this.f3535j.d());
        loop0: while (true) {
            arrayList = this.f3539n;
            if (i10 >= arrayList.size()) {
                i10 = -1;
                break;
            }
            int i11 = i10;
            while (true) {
                if (i11 >= arrayList.size()) {
                    j jVar = (j) arrayList.get(i10);
                    for (int i12 = 0; i12 < this.f3547v.length; i12++) {
                        if (this.f3547v[i12].t() > jVar.e(i12)) {
                            break;
                        }
                    }
                    break loop0;
                }
                if (((j) arrayList.get(i11)).f3466n) {
                    break;
                } else {
                    i11++;
                }
            }
            i10++;
        }
        if (i10 == -1) {
            return;
        }
        long j10 = B().f11062h;
        j jVar2 = (j) arrayList.get(i10);
        c0.S(i10, arrayList.size(), arrayList);
        for (int i13 = 0; i13 < this.f3547v.length; i13++) {
            this.f3547v[i13].n(jVar2.e(i13));
        }
        if (arrayList.isEmpty()) {
            this.Q = this.P;
        } else {
            ((j) ya.q.k(arrayList)).J = true;
        }
        this.T = false;
        this.f3536k.M(this.A, jVar2.f11061g, j10);
    }

    public final j B() {
        return (j) this.f3539n.get(r0.size() - 1);
    }

    public final boolean D() {
        return this.Q != -9223372036854775807L;
    }

    public final void E() {
        if (!this.H && this.K == null && this.C) {
            for (p pVar : this.f3547v) {
                if (pVar.w() == null) {
                    return;
                }
            }
            o1 o1Var = this.I;
            if (o1Var != null) {
                int i10 = o1Var.f10379a;
                int[] iArr = new int[i10];
                this.K = iArr;
                Arrays.fill(iArr, -1);
                for (int i11 = 0; i11 < i10; i11++) {
                    int i12 = 0;
                    while (true) {
                        p[] pVarArr = this.f3547v;
                        if (i12 < pVarArr.length) {
                            m4.q qVarW = pVarArr[i12].w();
                            p4.c.j(qVarW);
                            m4.q qVar = this.I.a(i11).f14307d[0];
                            String str = qVarW.f14544n;
                            String str2 = qVar.f14544n;
                            int i13 = o0.i(str);
                            if (i13 == 3) {
                                int i14 = c0.f16548a;
                                if (Objects.equals(str, str2) && (!("application/cea-608".equals(str) || "application/cea-708".equals(str)) || qVarW.I == qVar.I)) {
                                    break;
                                } else {
                                    i12++;
                                }
                            } else if (i13 == o0.i(str2)) {
                                break;
                            } else {
                                i12++;
                            }
                        }
                    }
                    this.K[i11] = i12;
                }
                Iterator it = this.f3544s.iterator();
                while (it.hasNext()) {
                    ((m) it.next()).c();
                }
                return;
            }
            int length = this.f3547v.length;
            int i15 = 0;
            int i16 = -2;
            int i17 = -1;
            while (true) {
                int i18 = 1;
                if (i15 >= length) {
                    break;
                }
                m4.q qVarW2 = this.f3547v[i15].w();
                p4.c.j(qVarW2);
                String str3 = qVarW2.f14544n;
                if (o0.o(str3)) {
                    i18 = 2;
                } else if (!o0.k(str3)) {
                    i18 = o0.n(str3) ? 3 : -2;
                }
                if (C(i18) > C(i16)) {
                    i17 = i15;
                    i16 = i18;
                } else if (i18 == i16 && i17 != -1) {
                    i17 = -1;
                }
                i15++;
            }
            j1 j1Var = this.f3529d.f3451h;
            int i19 = j1Var.f14304a;
            this.L = -1;
            this.K = new int[length];
            for (int i20 = 0; i20 < length; i20++) {
                this.K[i20] = i20;
            }
            j1[] j1VarArr = new j1[length];
            int i21 = 0;
            while (i21 < length) {
                m4.q qVarW3 = this.f3547v[i21].w();
                p4.c.j(qVarW3);
                String str4 = this.f3526a;
                m4.q qVar2 = this.f3531f;
                if (i21 == i17) {
                    m4.q[] qVarArr = new m4.q[i19];
                    for (int i22 = 0; i22 < i19; i22++) {
                        m4.q qVarD = j1Var.f14307d[i22];
                        if (i16 == 1 && qVar2 != null) {
                            qVarD = qVarD.d(qVar2);
                        }
                        qVarArr[i22] = i19 == 1 ? qVarW3.d(qVarD) : z(qVarD, qVarW3, true);
                    }
                    j1VarArr[i21] = new j1(str4, qVarArr);
                    this.L = i21;
                } else {
                    if (i16 != 2 || !o0.k(qVarW3.f14544n)) {
                        qVar2 = null;
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append(str4);
                    sb.append(":muxed:");
                    sb.append(i21 < i17 ? i21 : i21 - 1);
                    j1VarArr[i21] = new j1(sb.toString(), z(qVar2, qVarW3, false));
                }
                i21++;
            }
            this.I = y(j1VarArr);
            p4.c.i(this.J == null);
            this.J = Collections.EMPTY_SET;
            this.D = true;
            this.f3528c.r();
        }
    }

    public final void F() throws IOException {
        this.f3535j.b();
        i iVar = this.f3529d;
        j5.b bVar = iVar.f3457n;
        if (bVar != null) {
            throw bVar;
        }
        Uri uri = iVar.f3458o;
        if (uri == null || !iVar.f3462s) {
            return;
        }
        e5.b bVar2 = (e5.b) iVar.f3450g.f6159d.get(uri);
        bVar2.f6144b.b();
        IOException iOException = bVar2.f6152j;
        if (iOException != null) {
            throw iOException;
        }
    }

    public final void G(j1[] j1VarArr, int... iArr) {
        this.I = y(j1VarArr);
        this.J = new HashSet();
        for (int i10 : iArr) {
            this.J.add(this.I.a(i10));
        }
        this.L = 0;
        this.f3543r.post(new a9.m(10, this.f3528c));
        this.D = true;
    }

    public final void H() {
        for (p pVar : this.f3547v) {
            pVar.D(this.R);
        }
        this.R = false;
    }

    public final boolean I(long j10, boolean z10) {
        j jVar;
        boolean z11;
        this.P = j10;
        if (D()) {
            this.Q = j10;
            return true;
        }
        boolean z12 = this.f3529d.f3459p;
        ArrayList arrayList = this.f3539n;
        if (z12) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                jVar = (j) arrayList.get(i10);
                if (jVar.f11061g == j10) {
                    break;
                }
            }
            jVar = null;
        } else {
            jVar = null;
        }
        if (this.C && !z10) {
            int length = this.f3547v.length;
            for (int i11 = 0; i11 < length; i11++) {
                p pVar = this.f3547v[i11];
                if (!(jVar != null ? pVar.F(jVar.e(i11)) : pVar.G(j10, false)) && (this.O[i11] || !this.M)) {
                    z11 = false;
                    break;
                }
            }
            z11 = true;
            if (z11) {
                return false;
            }
        }
        this.Q = j10;
        this.T = false;
        arrayList.clear();
        n5.o oVar = this.f3535j;
        if (!oVar.d()) {
            oVar.f15374c = null;
            H();
            return true;
        }
        if (this.C) {
            for (p pVar2 : this.f3547v) {
                pVar2.k();
            }
        }
        oVar.a();
        return true;
    }

    @Override // j5.a1
    public final void b() {
        this.f3543r.post(this.f3541p);
    }

    @Override // n5.m
    public final void c() {
        for (p pVar : this.f3547v) {
            pVar.D(true);
            b5.l lVar = pVar.f10216h;
            if (lVar != null) {
                lVar.c(pVar.f10213e);
                pVar.f10216h = null;
                pVar.f10215g = null;
            }
        }
    }

    @Override // j5.e1
    public final long d() {
        if (D()) {
            return this.Q;
        }
        if (this.T) {
            return Long.MIN_VALUE;
        }
        return B().f11062h;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x028c A[PHI: r5
      0x028c: PHI (r5v16 c5.h) = (r5v15 c5.h), (r5v31 c5.h) binds: [B:100:0x0251, B:108:0x0272] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0336  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0348  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x034a  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x036d  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0374  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0393  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0396  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x039a  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x03a4  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x03a7  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x03b2  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x03b8  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0408  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x041d  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0467  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x048f  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x04c3  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x04d0  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0250  */
    @Override // j5.e1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean e(v4.f0 r71) {
        /*
            Method dump skipped, instruction units count: 1364
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c5.q.e(v4.f0):boolean");
    }

    public final void j() {
        p4.c.i(this.D);
        this.I.getClass();
        this.J.getClass();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // n5.j
    public final void k(n5.l lVar, long j10, long j11) {
        k5.f fVar = (k5.f) lVar;
        this.f3546u = null;
        if (fVar instanceof e) {
            e eVar = (e) fVar;
            byte[] bArr = eVar.f3434j;
            i iVar = this.f3529d;
            iVar.f3456m = bArr;
            c1 c1Var = iVar.f3453j;
            Uri uri = eVar.f11056b.f19443a;
            byte[] bArr2 = eVar.f3436l;
            bArr2.getClass();
            d dVar = (d) c1Var.f1208b;
            uri.getClass();
        }
        long j12 = fVar.f11055a;
        Uri uri2 = fVar.f11063i.f19399c;
        u uVar = new u(j11);
        this.f3534i.getClass();
        this.f3536k.B(uVar, fVar.f11057c, this.f3527b, fVar.f11058d, fVar.f11059e, fVar.f11060f, fVar.f11061g, fVar.f11062h);
        if (this.D) {
            this.f3528c.c(this);
            return;
        }
        e0 e0Var = new e0();
        e0Var.f22467a = this.P;
        e(new f0(e0Var));
    }

    @Override // j5.e1
    public final boolean m() {
        return this.f3535j.d();
    }

    @Override // r5.q
    public final void n() {
        this.U = true;
        this.f3543r.post(this.f3542q);
    }

    @Override // n5.j
    public final void r(n5.l lVar, long j10, long j11, int i10) {
        u uVar;
        k5.f fVar = (k5.f) lVar;
        if (i10 == 0) {
            long j12 = fVar.f11055a;
            uVar = new u(fVar.f11056b);
        } else {
            long j13 = fVar.f11055a;
            Uri uri = fVar.f11063i.f19399c;
            uVar = new u(j11);
        }
        u uVar2 = uVar;
        this.f3536k.E(uVar2, fVar.f11057c, this.f3527b, fVar.f11058d, fVar.f11059e, fVar.f11060f, fVar.f11061g, fVar.f11062h, i10);
    }

    @Override // n5.j
    public final void s(n5.l lVar, long j10, long j11, boolean z10) {
        k5.f fVar = (k5.f) lVar;
        this.f3546u = null;
        long j12 = fVar.f11055a;
        Uri uri = fVar.f11063i.f19399c;
        u uVar = new u(j11);
        this.f3534i.getClass();
        this.f3536k.A(uVar, fVar.f11057c, this.f3527b, fVar.f11058d, fVar.f11059e, fVar.f11060f, fVar.f11061g, fVar.f11062h);
        if (z10) {
            return;
        }
        if (D() || this.E == 0) {
            H();
        }
        if (this.E > 0) {
            this.f3528c.c(this);
        }
    }

    @Override // j5.e1
    public final long t() {
        if (this.T) {
            return Long.MIN_VALUE;
        }
        if (D()) {
            return this.Q;
        }
        long jMax = this.P;
        j jVarB = B();
        if (!jVarB.H) {
            ArrayList arrayList = this.f3539n;
            jVarB = arrayList.size() > 1 ? (j) arrayList.get(arrayList.size() - 2) : null;
        }
        if (jVarB != null) {
            jMax = Math.max(jMax, jVarB.f11062h);
        }
        if (this.C) {
            for (p pVar : this.f3547v) {
                jMax = Math.max(jMax, pVar.q());
            }
        }
        return jMax;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [c5.p[]] */
    /* JADX WARN: Type inference failed for: r1v1, types: [c5.p[]] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [r5.h0] */
    /* JADX WARN: Type inference failed for: r5v4, types: [c5.p, j5.b1] */
    /* JADX WARN: Type inference failed for: r5v6, types: [r5.m] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    @Override // r5.q
    public final h0 u(int i10, int i11) {
        Integer numValueOf = Integer.valueOf(i11);
        Set set = Y;
        boolean zContains = set.contains(numValueOf);
        HashSet hashSet = this.f3549x;
        SparseIntArray sparseIntArray = this.f3550y;
        ?? pVar = 0;
        pVar = 0;
        if (zContains) {
            p4.c.c(set.contains(Integer.valueOf(i11)));
            int i12 = sparseIntArray.get(i11, -1);
            if (i12 != -1) {
                if (hashSet.add(Integer.valueOf(i11))) {
                    this.f3548w[i12] = i10;
                }
                pVar = this.f3548w[i12] == i10 ? this.f3547v[i12] : x(i10, i11);
            }
        } else {
            int i13 = 0;
            while (true) {
                ?? r12 = this.f3547v;
                if (i13 >= r12.length) {
                    break;
                }
                if (this.f3548w[i13] == i10) {
                    pVar = r12[i13];
                    break;
                }
                i13++;
            }
        }
        if (pVar == 0) {
            if (this.U) {
                return x(i10, i11);
            }
            int length = this.f3547v.length;
            boolean z10 = i11 == 1 || i11 == 2;
            pVar = new p(this.f3530e, this.f3532g, this.f3533h, this.f3545t);
            pVar.f10228t = this.P;
            if (z10) {
                pVar.I = this.W;
                pVar.f10234z = true;
            }
            long j10 = this.V;
            if (pVar.F != j10) {
                pVar.F = j10;
                pVar.f10234z = true;
            }
            if (this.X != null) {
                pVar.C = r6.f3463k;
            }
            pVar.f10214f = this;
            int i14 = length + 1;
            int[] iArrCopyOf = Arrays.copyOf(this.f3548w, i14);
            this.f3548w = iArrCopyOf;
            iArrCopyOf[length] = i10;
            p[] pVarArr = this.f3547v;
            int i15 = c0.f16548a;
            ?? CopyOf = Arrays.copyOf(pVarArr, pVarArr.length + 1);
            CopyOf[pVarArr.length] = pVar;
            this.f3547v = (p[]) CopyOf;
            boolean[] zArrCopyOf = Arrays.copyOf(this.O, i14);
            this.O = zArrCopyOf;
            zArrCopyOf[length] = z10;
            this.M |= z10;
            hashSet.add(Integer.valueOf(i11));
            sparseIntArray.append(i11, length);
            if (C(i11) > C(this.A)) {
                this.B = length;
                this.A = i11;
            }
            this.N = Arrays.copyOf(this.N, i14);
        }
        if (i11 != 5) {
            return pVar;
        }
        if (this.f3551z == null) {
            this.f3551z = new o(pVar, this.f3537l);
        }
        return this.f3551z;
    }

    @Override // n5.j
    public final q0 v(n5.l lVar, long j10, long j11, IOException iOException, int i10) {
        boolean zO;
        q0 q0Var;
        int i11;
        k5.f fVar = (k5.f) lVar;
        boolean z10 = fVar instanceof j;
        if (z10 && !((j) fVar).K && (iOException instanceof y) && ((i11 = ((y) iOException).f19484d) == 410 || i11 == 404)) {
            return n5.o.f15369d;
        }
        long j12 = fVar.f11063i.f19398b;
        Uri uri = fVar.f11063i.f19399c;
        u uVar = new u(j11);
        c0.c0(fVar.f11061g);
        c0.c0(fVar.f11062h);
        b7.m mVar = new b7.m(i10, 6, iOException);
        i iVar = this.f3529d;
        eg.g gVarQ = lc.b.q(iVar.f3460q);
        this.f3534i.getClass();
        q0 q0VarT = m3.l.t(gVarQ, mVar);
        if (q0VarT == null || q0VarT.f2038b != 2) {
            zO = false;
        } else {
            long j13 = q0VarT.f2037a;
            m5.r rVar = iVar.f3460q;
            zO = rVar.o(rVar.u(iVar.f3451h.b(fVar.f11058d)), j13);
        }
        if (zO) {
            if (z10 && j12 == 0) {
                ArrayList arrayList = this.f3539n;
                p4.c.i(((j) arrayList.remove(arrayList.size() - 1)) == fVar);
                if (arrayList.isEmpty()) {
                    this.Q = this.P;
                } else {
                    ((j) ya.q.k(arrayList)).J = true;
                }
            }
            q0Var = n5.o.f15370e;
        } else {
            long jV = m3.l.v(mVar);
            q0Var = jV != -9223372036854775807L ? new q0(0, false, jV) : n5.o.f15371f;
        }
        q0 q0Var2 = q0Var;
        boolean zA = q0Var2.a();
        this.f3536k.C(uVar, fVar.f11057c, this.f3527b, fVar.f11058d, fVar.f11059e, fVar.f11060f, fVar.f11061g, fVar.f11062h, iOException, !zA);
        if (!zA) {
            this.f3546u = null;
        }
        if (zO) {
            if (!this.D) {
                e0 e0Var = new e0();
                e0Var.f22467a = this.P;
                e(new f0(e0Var));
                return q0Var2;
            }
            this.f3528c.c(this);
        }
        return q0Var2;
    }

    @Override // j5.e1
    public final void w(long j10) {
        n5.o oVar = this.f3535j;
        if (oVar.c() || D()) {
            return;
        }
        boolean zD = oVar.d();
        i iVar = this.f3529d;
        List list = this.f3540o;
        if (zD) {
            this.f3546u.getClass();
            if (iVar.f3457n != null ? false : iVar.f3460q.d(j10, this.f3546u, list)) {
                oVar.a();
                return;
            }
            return;
        }
        int size = list.size();
        while (size > 0 && iVar.b((j) list.get(size - 1)) == 2) {
            size--;
        }
        if (size < list.size()) {
            A(size);
        }
        int size2 = (iVar.f3457n != null || iVar.f3460q.length() < 2) ? list.size() : iVar.f3460q.j(j10, list);
        if (size2 < this.f3539n.size()) {
            A(size2);
        }
    }

    public final o1 y(j1[] j1VarArr) {
        for (int i10 = 0; i10 < j1VarArr.length; i10++) {
            j1 j1Var = j1VarArr[i10];
            m4.q[] qVarArr = new m4.q[j1Var.f14304a];
            for (int i11 = 0; i11 < j1Var.f14304a; i11++) {
                m4.q qVar = j1Var.f14307d[i11];
                int iK = this.f3532g.k(qVar);
                m4.p pVarA = qVar.a();
                pVarA.L = iK;
                qVarArr[i11] = new m4.q(pVarA);
            }
            j1VarArr[i10] = new j1(j1Var.f14305b, qVarArr);
        }
        return new o1(j1VarArr);
    }

    @Override // r5.q
    public final void a(b0 b0Var) {
    }
}
