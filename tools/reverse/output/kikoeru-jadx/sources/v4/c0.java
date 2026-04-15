package v4;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Pair;
import j5.o1;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Random;
import java.util.concurrent.atomic.AtomicBoolean;
import m4.e1;
import m4.f1;
import m4.h1;
import m4.i1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class c0 implements Handler.Callback, j5.a0, v0 {
    public static final long X = p4.c0.c0(10000);
    public z A;
    public boolean B;
    public boolean C;
    public boolean D;
    public boolean E;
    public long F;
    public boolean G;
    public int H;
    public boolean I;
    public boolean J;
    public boolean K;
    public boolean L;
    public int M;
    public b0 N;
    public long O;
    public long P;
    public int Q;
    public boolean R;
    public m S;
    public long T;
    public o U;
    public long V;
    public boolean W;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a1[] f22408a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e[] f22409b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean[] f22410c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final j2.b f22411d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final m5.u f22412e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final j f22413f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final n5.e f22414g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final p4.x f22415h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final k9.c f22416i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Looper f22417j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final h1 f22418k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final f1 f22419l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final long f22420m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final k f22421n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final ArrayList f22422o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final p4.v f22423p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final q f22424q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final j0 f22425r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final t0 f22426s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final h f22427t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final w4.k f22428u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final w4.d f22429v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final p4.x f22430w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final boolean f22431x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public b1 f22432y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public u0 f22433z;

    public c0(e[] eVarArr, e[] eVarArr2, j2.b bVar, m5.u uVar, j jVar, n5.e eVar, int i10, boolean z10, w4.d dVar, b1 b1Var, h hVar, Looper looper, p4.v vVar, q qVar, w4.k kVar) {
        o oVar = o.f22603a;
        this.V = -9223372036854775807L;
        this.f22424q = qVar;
        this.f22411d = bVar;
        this.f22412e = uVar;
        this.f22413f = jVar;
        this.f22414g = eVar;
        this.H = i10;
        this.I = z10;
        this.f22432y = b1Var;
        this.f22427t = hVar;
        this.C = false;
        this.f22423p = vVar;
        this.f22428u = kVar;
        this.U = oVar;
        this.f22429v = dVar;
        this.T = -9223372036854775807L;
        this.F = -9223372036854775807L;
        this.f22420m = jVar.f22539h;
        e1 e1Var = i1.f14291a;
        u0 u0VarH = u0.h(uVar);
        this.f22433z = u0VarH;
        this.A = new z(u0VarH);
        this.f22409b = new e[eVarArr.length];
        this.f22410c = new boolean[eVarArr.length];
        m5.p pVar = (m5.p) bVar;
        pVar.getClass();
        this.f22408a = new a1[eVarArr.length];
        boolean z11 = false;
        for (int i11 = 0; i11 < eVarArr.length; i11++) {
            e eVar2 = eVarArr[i11];
            eVar2.f22454e = i11;
            eVar2.f22455f = kVar;
            eVar2.f22456g = vVar;
            this.f22409b[i11] = eVar2;
            e eVar3 = this.f22409b[i11];
            synchronized (eVar3.f22450a) {
                eVar3.f22466q = pVar;
            }
            e eVar4 = eVarArr2[i11];
            if (eVar4 != null) {
                eVar4.f22454e = eVarArr.length + i11;
                eVar4.f22455f = kVar;
                eVar4.f22456g = vVar;
                z11 = true;
            }
            this.f22408a[i11] = new a1(eVarArr[i11], eVar4, i11);
        }
        this.f22431x = z11;
        this.f22421n = new k(this, vVar);
        this.f22422o = new ArrayList();
        this.f22418k = new h1();
        this.f22419l = new f1();
        bVar.f9723a = this;
        bVar.f9724b = eVar;
        this.R = true;
        p4.x xVarA = vVar.a(looper, null);
        this.f22430w = xVarA;
        this.f22425r = new j0(dVar, xVarA, new androidx.media3.exoplayer.offline.g(24, this));
        this.f22426s = new t0(this, dVar, xVarA, kVar);
        k9.c cVar = new k9.c();
        this.f22416i = cVar;
        Looper looperA = cVar.a();
        this.f22417j = looperA;
        this.f22415h = vVar.a(looperA, this);
    }

    public static Pair M(i1 i1Var, b0 b0Var, boolean z10, int i10, boolean z11, h1 h1Var, f1 f1Var) {
        int iN;
        i1 i1Var2 = b0Var.f22401a;
        if (i1Var.p()) {
            return null;
        }
        i1 i1Var3 = i1Var2.p() ? i1Var : i1Var2;
        try {
            Pair pairI = i1Var3.i(h1Var, f1Var, b0Var.f22402b, b0Var.f22403c);
            if (!i1Var.equals(i1Var3)) {
                if (i1Var.b(pairI.first) == -1) {
                    if (!z10 || (iN = N(h1Var, f1Var, i10, z11, pairI.first, i1Var3, i1Var)) == -1) {
                        return null;
                    }
                    return i1Var.i(h1Var, f1Var, iN, -9223372036854775807L);
                }
                if (i1Var3.g(pairI.first, f1Var).f14206f && i1Var3.m(f1Var.f14203c, h1Var, 0L).f14275n == i1Var3.b(pairI.first)) {
                    return i1Var.i(h1Var, f1Var, i1Var.g(pairI.first, f1Var).f14203c, b0Var.f22403c);
                }
            }
            return pairI;
        } catch (IndexOutOfBoundsException unused) {
            return null;
        }
    }

    public static int N(h1 h1Var, f1 f1Var, int i10, boolean z10, Object obj, i1 i1Var, i1 i1Var2) {
        h1 h1Var2 = h1Var;
        i1 i1Var3 = i1Var;
        Object obj2 = i1Var3.m(i1Var3.g(obj, f1Var).f14203c, h1Var, 0L).f14262a;
        for (int i11 = 0; i11 < i1Var2.o(); i11++) {
            if (i1Var2.m(i11, h1Var, 0L).f14262a.equals(obj2)) {
                return i11;
            }
        }
        int iB = i1Var3.b(obj);
        int iH = i1Var3.h();
        int i12 = 0;
        int iB2 = -1;
        while (i12 < iH && iB2 == -1) {
            i1 i1Var4 = i1Var3;
            int iD = i1Var4.d(iB, f1Var, h1Var2, i10, z10);
            if (iD == -1) {
                break;
            }
            iB2 = i1Var2.b(i1Var4.l(iD));
            i12++;
            i1Var3 = i1Var4;
            iB = iD;
            h1Var2 = h1Var;
        }
        if (iB2 == -1) {
            return -1;
        }
        return i1Var2.f(iB2, f1Var, false).f14203c;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [j5.b0, j5.e1, java.lang.Object] */
    public static boolean u(h0 h0Var) {
        if (h0Var != null) {
            try {
                ?? r12 = h0Var.f22504a;
                if (h0Var.f22508e) {
                    for (j5.c1 c1Var : h0Var.f22506c) {
                        if (c1Var != null) {
                            c1Var.b();
                        }
                    }
                } else {
                    r12.f();
                }
                if ((!h0Var.f22508e ? 0L : r12.d()) != Long.MIN_VALUE) {
                    return true;
                }
            } catch (IOException unused) {
            }
        }
        return false;
    }

    public final void A(int i10, boolean z10) {
        boolean[] zArr = this.f22410c;
        if (zArr[i10] != z10) {
            zArr[i10] = z10;
            this.f22430w.c(new b7.p0(this, i10, z10));
        }
    }

    public final void B() throws Throwable {
        q(this.f22426s.b(), true);
    }

    public final void C(y yVar) throws Throwable {
        i1 i1VarB;
        this.A.c(1);
        int i10 = yVar.f22712a;
        int i11 = yVar.f22713b;
        int i12 = yVar.f22714c;
        j5.f1 f1Var = yVar.f22715d;
        t0 t0Var = this.f22426s;
        ArrayList arrayList = t0Var.f22637b;
        p4.c.c(i10 >= 0 && i10 <= i11 && i11 <= arrayList.size() && i12 >= 0);
        t0Var.f22645j = f1Var;
        if (i10 == i11 || i10 == i12) {
            i1VarB = t0Var.b();
        } else {
            int iMin = Math.min(i10, i12);
            int iMax = Math.max(((i11 - i10) + i12) - 1, i11 - 1);
            int iO = ((s0) arrayList.get(iMin)).f22630d;
            p4.c0.M(i10, i11, i12, arrayList);
            while (iMin <= iMax) {
                s0 s0Var = (s0) arrayList.get(iMin);
                s0Var.f22630d = iO;
                iO += s0Var.f22627a.f10481o.f10410e.o();
                iMin++;
            }
            i1VarB = t0Var.b();
        }
        q(i1VarB, false);
    }

    public final void D() {
        this.A.c(1);
        I(false, false, false, true);
        j jVar = this.f22413f;
        HashMap map = jVar.f22540i;
        long id2 = Thread.currentThread().getId();
        long j10 = jVar.f22541j;
        p4.c.h("Players that share the same LoadControl must share the same playback thread. See ExoPlayer.Builder.setPlaybackLooper(Looper).", j10 == -1 || j10 == id2);
        jVar.f22541j = id2;
        w4.k kVar = this.f22428u;
        if (!map.containsKey(kVar)) {
            map.put(kVar, new i());
        }
        i iVar = (i) map.get(kVar);
        iVar.getClass();
        int i10 = jVar.f22537f;
        if (i10 == -1) {
            i10 = 13107200;
        }
        iVar.f22521b = i10;
        iVar.f22520a = false;
        d0(this.f22433z.f22652a.p() ? 4 : 2);
        n5.i iVar2 = (n5.i) this.f22414g;
        iVar2.getClass();
        t0 t0Var = this.f22426s;
        ArrayList arrayList = t0Var.f22637b;
        p4.c.i(!t0Var.f22646k);
        t0Var.f22647l = iVar2;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            s0 s0Var = (s0) arrayList.get(i11);
            t0Var.e(s0Var);
            t0Var.f22642g.add(s0Var);
        }
        t0Var.f22646k = true;
        this.f22415h.e(2);
    }

    public final void E() {
        try {
            I(true, false, true, false);
            F();
            j jVar = this.f22413f;
            if (jVar.f22540i.remove(this.f22428u) != null) {
                jVar.d();
            }
            if (jVar.f22540i.isEmpty()) {
                jVar.f22541j = -1L;
            }
            d0(1);
            this.f22416i.b();
            synchronized (this) {
                this.B = true;
                notifyAll();
            }
        } catch (Throwable th2) {
            this.f22416i.b();
            synchronized (this) {
                this.B = true;
                notifyAll();
                throw th2;
            }
        }
    }

    public final void F() {
        for (int i10 = 0; i10 < this.f22408a.length; i10++) {
            e eVar = this.f22409b[i10];
            synchronized (eVar.f22450a) {
                eVar.f22466q = null;
            }
            a1 a1Var = this.f22408a[i10];
            e eVar2 = a1Var.f22393a;
            p4.c.i(eVar2.f22457h == 0);
            eVar2.p();
            a1Var.f22397e = false;
            e eVar3 = a1Var.f22395c;
            if (eVar3 != null) {
                p4.c.i(eVar3.f22457h == 0);
                eVar3.p();
                a1Var.f22398f = false;
            }
        }
    }

    public final void G(int i10, int i11, j5.f1 f1Var) throws Throwable {
        this.A.c(1);
        t0 t0Var = this.f22426s;
        t0Var.getClass();
        p4.c.c(i10 >= 0 && i10 <= i11 && i11 <= t0Var.f22637b.size());
        t0Var.f22645j = f1Var;
        t0Var.g(i10, i11);
        q(t0Var.b(), false);
    }

    /* JADX WARN: Removed duplicated region for block: B:78:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:91:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void H() {
        /*
            Method dump skipped, instruction units count: 378
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: v4.c0.H():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:107:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0171  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void I(boolean r36, boolean r37, boolean r38, boolean r39) {
        /*
            Method dump skipped, instruction units count: 479
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: v4.c0.I(boolean, boolean, boolean, boolean):void");
    }

    public final void J() {
        h0 h0Var = this.f22425r.f22550i;
        this.D = h0Var != null && h0Var.f22510g.f22530i && this.C;
    }

    public final void K(long j10) {
        h0 h0Var = this.f22425r.f22550i;
        long j11 = j10 + (h0Var == null ? 1000000000000L : h0Var.f22519p);
        this.O = j11;
        this.f22421n.f22559a.d(j11);
        for (a1 a1Var : this.f22408a) {
            long j12 = this.O;
            e eVarD = a1Var.d(h0Var);
            if (eVarD != null) {
                eVarD.f22463n = false;
                eVarD.f22461l = j12;
                eVarD.f22462m = j12;
                eVarD.o(j12, false);
            }
        }
        for (h0 h0Var2 = r0.f22550i; h0Var2 != null; h0Var2 = h0Var2.f22516m) {
            for (m5.r rVar : h0Var2.f22518o.f14763c) {
                if (rVar != null) {
                    rVar.r();
                }
            }
        }
    }

    public final void L(i1 i1Var, i1 i1Var2) {
        if (i1Var.p() && i1Var2.p()) {
            return;
        }
        ArrayList arrayList = this.f22422o;
        int size = arrayList.size() - 1;
        if (size < 0) {
            Collections.sort(arrayList);
        } else {
            a0.c.N(arrayList.get(size));
            throw null;
        }
    }

    public final void O(long j10) {
        this.f22415h.f16627a.sendEmptyMessageAtTime(2, j10 + ((this.f22433z.f22656e != 3 || f0()) ? X : 1000L));
    }

    public final void P(boolean z10) {
        j5.d0 d0Var = this.f22425r.f22550i.f22510g.f22522a;
        long jR = R(d0Var, this.f22433z.f22670s, true, false);
        if (jR != this.f22433z.f22670s) {
            u0 u0Var = this.f22433z;
            this.f22433z = t(d0Var, jR, u0Var.f22654c, u0Var.f22655d, z10, 5);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(18:36|(7:(9:103|38|(1:46)(1:44)|47|(1:54)|55|56|57|58)(1:61)|105|81|82|83|57|58)|101|62|(1:64)(1:65)|66|(1:68)(1:70)|69|71|72|(1:74)(1:75)|76|99|77|78|96|79|80) */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0153, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0154, code lost:
    
        r2 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0155, code lost:
    
        r5 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0157, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0159, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x015a, code lost:
    
        r5 = r15;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a1 A[Catch: all -> 0x00a4, TryCatch #1 {all -> 0x00a4, blocks: (B:22:0x0097, B:24:0x00a1, B:31:0x00ad, B:33:0x00b3, B:34:0x00b6, B:36:0x00be, B:40:0x00ce, B:44:0x00d6), top: B:98:0x0097 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00aa  */
    /* JADX WARN: Type inference failed for: r0v16, types: [j5.b0, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Q(v4.b0 r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 358
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: v4.c0.Q(v4.b0):void");
    }

    /* JADX WARN: Type inference failed for: r10v8, types: [j5.b0, java.lang.Object] */
    public final long R(j5.d0 d0Var, long j10, boolean z10, boolean z11) {
        a1[] a1VarArr;
        j0();
        p0(false, true);
        if (z11 || this.f22433z.f22656e == 3) {
            d0(2);
        }
        j0 j0Var = this.f22425r;
        h0 h0Var = j0Var.f22550i;
        h0 h0Var2 = h0Var;
        while (h0Var2 != null && !d0Var.equals(h0Var2.f22510g.f22522a)) {
            h0Var2 = h0Var2.f22516m;
        }
        if (z10 || h0Var != h0Var2 || (h0Var2 != null && h0Var2.f22519p + j10 < 0)) {
            int i10 = 0;
            while (true) {
                a1VarArr = this.f22408a;
                if (i10 >= a1VarArr.length) {
                    break;
                }
                f(i10);
                i10++;
            }
            this.V = -9223372036854775807L;
            if (h0Var2 != null) {
                while (j0Var.f22550i != h0Var2) {
                    j0Var.a();
                }
                j0Var.n(h0Var2);
                h0Var2.f22519p = 1000000000000L;
                i(new boolean[a1VarArr.length], j0Var.f22551j.e());
                h0Var2.f22511h = true;
            }
        }
        if (h0Var2 != null) {
            ?? r10 = h0Var2.f22504a;
            j0Var.n(h0Var2);
            if (!h0Var2.f22508e) {
                h0Var2.f22510g = h0Var2.f22510g.b(j10);
            } else if (h0Var2.f22509f) {
                j10 = r10.h(j10);
                r10.i(j10 - this.f22420m);
            }
            K(j10);
            w();
        } else {
            j0Var.b();
            K(j10);
        }
        p(false);
        this.f22415h.e(2);
        return j10;
    }

    public final void S(x0 x0Var) {
        p4.x xVar = this.f22415h;
        if (x0Var.f22710e != this.f22417j) {
            xVar.a(15, x0Var).b();
            return;
        }
        synchronized (x0Var) {
        }
        try {
            x0Var.f22706a.d(x0Var.f22708c, x0Var.f22709d);
            x0Var.a(true);
            int i10 = this.f22433z.f22656e;
            if (i10 == 3 || i10 == 2) {
                xVar.e(2);
            }
        } catch (Throwable th2) {
            x0Var.a(true);
            throw th2;
        }
    }

    public final void T(x0 x0Var) {
        Looper looper = x0Var.f22710e;
        if (looper.getThread().isAlive()) {
            this.f22423p.a(looper, null).c(new a9.m(this, x0Var));
        } else {
            p4.c.B("TAG", "Trying to send message on a dead thread.");
            x0Var.a(false);
        }
    }

    public final void U(boolean z10, AtomicBoolean atomicBoolean) {
        if (this.J != z10) {
            this.J = z10;
            if (!z10) {
                for (a1 a1Var : this.f22408a) {
                    a1Var.l();
                }
            }
        }
        if (atomicBoolean != null) {
            synchronized (this) {
                atomicBoolean.set(true);
                notifyAll();
            }
        }
    }

    public final void V(x xVar) throws Throwable {
        this.A.c(1);
        int i10 = xVar.f22704c;
        j5.f1 f1Var = xVar.f22703b;
        ArrayList arrayList = xVar.f22702a;
        if (i10 != -1) {
            this.N = new b0(new y0(arrayList, f1Var), xVar.f22704c, xVar.f22705d);
        }
        t0 t0Var = this.f22426s;
        ArrayList arrayList2 = t0Var.f22637b;
        t0Var.g(0, arrayList2.size());
        q(t0Var.a(arrayList2.size(), arrayList, f1Var), false);
    }

    public final void W(boolean z10) {
        this.C = z10;
        J();
        if (this.D) {
            j0 j0Var = this.f22425r;
            if (j0Var.f22551j != j0Var.f22550i) {
                P(true);
                p(false);
            }
        }
    }

    public final void X(boolean z10, int i10, boolean z11, int i11) {
        this.A.c(z11 ? 1 : 0);
        this.f22433z = this.f22433z.c(i11, i10, z10);
        p0(false, false);
        j0 j0Var = this.f22425r;
        for (h0 h0Var = j0Var.f22550i; h0Var != null; h0Var = h0Var.f22516m) {
            for (m5.r rVar : h0Var.f22518o.f14763c) {
                if (rVar != null) {
                    rVar.e(z10);
                }
            }
        }
        if (!f0()) {
            j0();
            n0();
            j0Var.m(this.O);
            return;
        }
        int i12 = this.f22433z.f22656e;
        p4.x xVar = this.f22415h;
        if (i12 != 3) {
            if (i12 == 2) {
                xVar.e(2);
            }
        } else {
            k kVar = this.f22421n;
            kVar.f22564f = true;
            kVar.f22559a.f();
            h0();
            xVar.e(2);
        }
    }

    public final void Y(m4.s0 s0Var) {
        this.f22415h.d(16);
        k kVar = this.f22421n;
        kVar.a(s0Var);
        m4.s0 s0VarE = kVar.e();
        s(s0VarE, s0VarE.f14581a, true, true);
    }

    public final void Z(o oVar) {
        this.U = oVar;
        i1 i1Var = this.f22433z.f22652a;
        j0 j0Var = this.f22425r;
        j0Var.getClass();
        oVar.getClass();
        if (j0Var.f22558q.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < j0Var.f22558q.size(); i10++) {
            ((h0) j0Var.f22558q.get(i10)).i();
        }
        j0Var.f22558q = arrayList;
        j0Var.f22554m = null;
        j0Var.k();
    }

    @Override // j5.a0
    public final void a(j5.b0 b0Var) {
        this.f22415h.a(8, b0Var).b();
    }

    public final void a0(int i10) {
        this.H = i10;
        i1 i1Var = this.f22433z.f22652a;
        j0 j0Var = this.f22425r;
        j0Var.f22548g = i10;
        int iR = j0Var.r(i1Var);
        if ((iR & 1) != 0) {
            P(true);
        } else if ((iR & 2) != 0) {
            e();
        }
        p(false);
    }

    public final void b(x xVar, int i10) throws Throwable {
        this.A.c(1);
        t0 t0Var = this.f22426s;
        if (i10 == -1) {
            i10 = t0Var.f22637b.size();
        }
        q(t0Var.a(i10, xVar.f22702a, xVar.f22703b), false);
    }

    public final void b0(boolean z10) {
        this.I = z10;
        i1 i1Var = this.f22433z.f22652a;
        j0 j0Var = this.f22425r;
        j0Var.f22549h = z10;
        int iR = j0Var.r(i1Var);
        if ((iR & 1) != 0) {
            P(true);
        } else if ((iR & 2) != 0) {
            e();
        }
        p(false);
    }

    @Override // j5.d1
    public final void c(j5.e1 e1Var) {
        this.f22415h.a(9, (j5.b0) e1Var).b();
    }

    public final void c0(j5.f1 f1Var) throws Throwable {
        this.A.c(1);
        t0 t0Var = this.f22426s;
        int size = t0Var.f22637b.size();
        if (f1Var.f10259b.length != size) {
            f1Var = new j5.f1(new Random(f1Var.f10258a.nextLong())).a(0, size);
        }
        t0Var.f22645j = f1Var;
        q(t0Var.b(), false);
    }

    public final boolean d() {
        if (!this.f22431x) {
            return false;
        }
        for (a1 a1Var : this.f22408a) {
            if (a1Var.f()) {
                return true;
            }
        }
        return false;
    }

    public final void d0(int i10) {
        u0 u0Var = this.f22433z;
        if (u0Var.f22656e != i10) {
            if (i10 != 2) {
                this.T = -9223372036854775807L;
            }
            this.f22433z = u0Var.f(i10);
        }
    }

    public final void e() {
        e eVar;
        if (this.f22431x && d()) {
            for (a1 a1Var : this.f22408a) {
                int iC = a1Var.c();
                if (a1Var.f()) {
                    int i10 = a1Var.f22396d;
                    boolean z10 = i10 == 4 || i10 == 2;
                    int i11 = i10 != 4 ? 0 : 1;
                    if (z10) {
                        eVar = a1Var.f22393a;
                    } else {
                        eVar = a1Var.f22395c;
                        eVar.getClass();
                    }
                    a1Var.a(eVar, this.f22421n);
                    a1Var.j(z10);
                    a1Var.f22396d = i11;
                }
                this.M -= iC - a1Var.c();
            }
            this.V = -9223372036854775807L;
        }
    }

    public final void e0(Object obj, AtomicBoolean atomicBoolean) {
        for (a1 a1Var : this.f22408a) {
            e eVar = a1Var.f22393a;
            if (eVar.f22451b == 2) {
                int i10 = a1Var.f22396d;
                if (i10 == 4 || i10 == 1) {
                    e eVar2 = a1Var.f22395c;
                    eVar2.getClass();
                    eVar2.d(1, obj);
                } else {
                    eVar.d(1, obj);
                }
            }
        }
        int i11 = this.f22433z.f22656e;
        if (i11 == 3 || i11 == 2) {
            this.f22415h.e(2);
        }
        if (atomicBoolean != null) {
            synchronized (this) {
                atomicBoolean.set(true);
                notifyAll();
            }
        }
    }

    public final void f(int i10) {
        a1[] a1VarArr = this.f22408a;
        int iC = a1VarArr[i10].c();
        a1 a1Var = a1VarArr[i10];
        e eVar = a1Var.f22393a;
        k kVar = this.f22421n;
        a1Var.a(eVar, kVar);
        e eVar2 = a1Var.f22395c;
        if (eVar2 != null) {
            boolean z10 = (eVar2.f22457h == 0 || a1Var.f22396d == 3) ? false : true;
            a1Var.a(eVar2, kVar);
            a1Var.j(false);
            if (z10) {
                e eVar3 = a1Var.f22393a;
                eVar2.getClass();
                eVar2.d(17, eVar3);
            }
        }
        a1Var.f22396d = 0;
        A(i10, false);
        this.M -= iC;
    }

    public final boolean f0() {
        u0 u0Var = this.f22433z;
        return u0Var.f22663l && u0Var.f22665n == 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0228 A[EDGE_INSN: B:640:0x0228->B:116:0x0228 BREAK  A[LOOP:10: B:126:0x023d->B:132:0x0252], EDGE_INSN: B:641:0x0228->B:116:0x0228 BREAK  A[LOOP:10: B:126:0x023d->B:132:0x0252]] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0368  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x03e6  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0425  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0438  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x0485  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x04a9  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x04bc  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x04da  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x04f9  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x0512  */
    /* JADX WARN: Removed duplicated region for block: B:326:0x0545  */
    /* JADX WARN: Removed duplicated region for block: B:348:0x0583  */
    /* JADX WARN: Removed duplicated region for block: B:352:0x058e  */
    /* JADX WARN: Removed duplicated region for block: B:409:0x065c  */
    /* JADX WARN: Removed duplicated region for block: B:450:0x06d9  */
    /* JADX WARN: Removed duplicated region for block: B:452:0x06e0  */
    /* JADX WARN: Removed duplicated region for block: B:507:0x07ac  */
    /* JADX WARN: Removed duplicated region for block: B:538:0x0811  */
    /* JADX WARN: Removed duplicated region for block: B:557:0x084b  */
    /* JADX WARN: Removed duplicated region for block: B:559:0x084e  */
    /* JADX WARN: Removed duplicated region for block: B:560:0x0851  */
    /* JADX WARN: Removed duplicated region for block: B:567:0x087b  */
    /* JADX WARN: Removed duplicated region for block: B:570:0x0883  */
    /* JADX WARN: Removed duplicated region for block: B:573:0x0888  */
    /* JADX WARN: Removed duplicated region for block: B:577:0x088f  */
    /* JADX WARN: Removed duplicated region for block: B:580:0x0896  */
    /* JADX WARN: Removed duplicated region for block: B:582:0x08ef  */
    /* JADX WARN: Removed duplicated region for block: B:585:0x08f6  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x018d  */
    /* JADX WARN: Type inference failed for: r2v3, types: [j5.b0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v68, types: [j5.b0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v83, types: [j5.b0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v28, types: [j5.b0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v88, types: [j5.b0, java.lang.Object] */
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
    public final void g() {
        /*
            Method dump skipped, instruction units count: 2330
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: v4.c0.g():void");
    }

    public final boolean g0(i1 i1Var, j5.d0 d0Var) {
        if (d0Var.b() || i1Var.p()) {
            return false;
        }
        int i10 = i1Var.g(d0Var.f10245a, this.f22419l).f14203c;
        h1 h1Var = this.f22418k;
        i1Var.n(i10, h1Var);
        return h1Var.a() && h1Var.f14270i && h1Var.f14267f != -9223372036854775807L;
    }

    public final void h(h0 h0Var, int i10, boolean z10, long j10) {
        a1 a1Var = this.f22408a[i10];
        boolean zG = a1Var.g();
        e eVar = a1Var.f22393a;
        if (zG) {
            return;
        }
        boolean z11 = h0Var == this.f22425r.f22550i;
        m5.u uVar = h0Var.f22518o;
        z0 z0Var = uVar.f14762b[i10];
        m5.r rVar = uVar.f14763c[i10];
        boolean z12 = f0() && this.f22433z.f22656e == 3;
        boolean z13 = !z10 && z12;
        this.M++;
        j5.c1 c1Var = h0Var.f22506c[i10];
        long j11 = h0Var.f22519p;
        j5.d0 d0Var = h0Var.f22510g.f22522a;
        e eVar2 = a1Var.f22395c;
        int length = rVar != null ? rVar.length() : 0;
        m4.q[] qVarArr = new m4.q[length];
        for (int i11 = 0; i11 < length; i11++) {
            rVar.getClass();
            qVarArr[i11] = rVar.g(i11);
        }
        int i12 = a1Var.f22396d;
        k kVar = this.f22421n;
        if (i12 == 0 || i12 == 2 || i12 == 4) {
            a1Var.f22397e = true;
            p4.c.i(eVar.f22457h == 0);
            eVar.f22453d = z0Var;
            eVar.f22457h = 1;
            eVar.n(z13, z11);
            eVar.w(qVarArr, c1Var, j10, j11, d0Var);
            eVar.f22463n = false;
            eVar.f22461l = j10;
            eVar.f22462m = j10;
            eVar.o(j10, z13);
            kVar.d(eVar);
        } else {
            a1Var.f22398f = true;
            eVar2.getClass();
            p4.c.i(eVar2.f22457h == 0);
            eVar2.f22453d = z0Var;
            eVar2.f22457h = 1;
            eVar2.n(z13, z11);
            eVar2.w(qVarArr, c1Var, j10, j11, d0Var);
            eVar2.f22463n = false;
            eVar2.f22461l = j10;
            eVar2.f22462m = j10;
            eVar2.o(j10, z13);
            kVar.d(eVar2);
        }
        w wVar = new w(this);
        e eVarD = a1Var.d(h0Var);
        eVarD.getClass();
        eVarD.d(11, wVar);
        if (z12 && z11) {
            a1Var.n();
        }
    }

    public final void h0() {
        h0 h0Var = this.f22425r.f22550i;
        if (h0Var == null) {
            return;
        }
        m5.u uVar = h0Var.f22518o;
        int i10 = 0;
        while (true) {
            a1[] a1VarArr = this.f22408a;
            if (i10 >= a1VarArr.length) {
                return;
            }
            if (uVar.b(i10)) {
                a1VarArr[i10].n();
            }
            i10++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:124:0x022e  */
    @Override // android.os.Handler.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean handleMessage(android.os.Message r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 696
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: v4.c0.handleMessage(android.os.Message):boolean");
    }

    public final void i(boolean[] zArr, long j10) {
        a1[] a1VarArr;
        long j11;
        h0 h0Var = this.f22425r.f22551j;
        m5.u uVar = h0Var.f22518o;
        int i10 = 0;
        while (true) {
            a1VarArr = this.f22408a;
            if (i10 >= a1VarArr.length) {
                break;
            }
            if (!uVar.b(i10)) {
                a1VarArr[i10].l();
            }
            i10++;
        }
        int i11 = 0;
        while (i11 < a1VarArr.length) {
            if (uVar.b(i11) && a1VarArr[i11].d(h0Var) == null) {
                j11 = j10;
                h(h0Var, i11, zArr[i11], j11);
            } else {
                j11 = j10;
            }
            i11++;
            j10 = j11;
        }
    }

    public final void i0(boolean z10, boolean z11) {
        I(z10 || !this.J, false, true, false);
        this.A.c(z11 ? 1 : 0);
        j jVar = this.f22413f;
        if (jVar.f22540i.remove(this.f22428u) != null) {
            jVar.d();
        }
        d0(1);
    }

    public final long j(i1 i1Var, Object obj, long j10) {
        f1 f1Var = this.f22419l;
        int i10 = i1Var.g(obj, f1Var).f14203c;
        h1 h1Var = this.f22418k;
        i1Var.n(i10, h1Var);
        if (h1Var.f14267f != -9223372036854775807L && h1Var.a() && h1Var.f14270i) {
            return p4.c0.N(p4.c0.z(h1Var.f14268g) - h1Var.f14267f) - (j10 + f1Var.f14205e);
        }
        return -9223372036854775807L;
    }

    public final void j0() {
        k kVar = this.f22421n;
        kVar.f22564f = false;
        c1 c1Var = kVar.f22559a;
        if (c1Var.f22435b) {
            c1Var.d(c1Var.b());
            c1Var.f22435b = false;
        }
        for (a1 a1Var : this.f22408a) {
            e eVar = a1Var.f22395c;
            e eVar2 = a1Var.f22393a;
            if (a1.h(eVar2)) {
                a1.b(eVar2);
            }
            if (eVar != null && eVar.f22457h != 0) {
                a1.b(eVar);
            }
        }
    }

    public final long k(h0 h0Var) {
        if (h0Var == null) {
            return 0L;
        }
        long jMax = h0Var.f22519p;
        if (!h0Var.f22508e) {
            return jMax;
        }
        int i10 = 0;
        while (true) {
            a1[] a1VarArr = this.f22408a;
            if (i10 >= a1VarArr.length) {
                return jMax;
            }
            if (a1VarArr[i10].d(h0Var) != null) {
                e eVarD = a1VarArr[i10].d(h0Var);
                Objects.requireNonNull(eVarD);
                long j10 = eVarD.f22462m;
                if (j10 == Long.MIN_VALUE) {
                    return Long.MIN_VALUE;
                }
                jMax = Math.max(j10, jMax);
            }
            i10++;
        }
    }

    /* JADX WARN: Type inference failed for: r1v6, types: [j5.e1, java.lang.Object] */
    public final void k0() {
        h0 h0Var = this.f22425r.f22553l;
        boolean z10 = this.G || (h0Var != null && h0Var.f22504a.m());
        u0 u0Var = this.f22433z;
        if (z10 != u0Var.f22658g) {
            this.f22433z = new u0(u0Var.f22652a, u0Var.f22653b, u0Var.f22654c, u0Var.f22655d, u0Var.f22656e, u0Var.f22657f, z10, u0Var.f22659h, u0Var.f22660i, u0Var.f22661j, u0Var.f22662k, u0Var.f22663l, u0Var.f22664m, u0Var.f22665n, u0Var.f22666o, u0Var.f22668q, u0Var.f22669r, u0Var.f22670s, u0Var.f22671t, u0Var.f22667p);
        }
    }

    public final Pair l(i1 i1Var) {
        if (i1Var.p()) {
            return Pair.create(u0.f22651u, 0L);
        }
        Pair pairI = i1Var.i(this.f22418k, this.f22419l, i1Var.a(this.I), -9223372036854775807L);
        j5.d0 d0VarP = this.f22425r.p(i1Var, pairI.first, 0L);
        long jLongValue = ((Long) pairI.second).longValue();
        if (d0VarP.b()) {
            Object obj = d0VarP.f10245a;
            f1 f1Var = this.f22419l;
            i1Var.g(obj, f1Var);
            jLongValue = d0VarP.f10247c == f1Var.f(d0VarP.f10246b) ? f1Var.f14207g.f14128b : 0L;
        }
        return Pair.create(d0VarP, Long.valueOf(jLongValue));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void l0(m5.u uVar) {
        h0 h0Var = this.f22425r.f22553l;
        h0Var.getClass();
        m(h0Var.d());
        if (g0(this.f22433z.f22652a, h0Var.f22510g.f22522a)) {
            long j10 = this.f22427t.f22497h;
        }
        i1 i1Var = this.f22433z.f22652a;
        float f10 = this.f22421n.e().f14581a;
        boolean z10 = this.f22433z.f22663l;
        m5.r[] rVarArr = uVar.f14763c;
        j jVar = this.f22413f;
        i iVar = (i) jVar.f22540i.get(this.f22428u);
        iVar.getClass();
        int iMax = jVar.f22537f;
        if (iMax == -1) {
            int length = rVarArr.length;
            int i10 = 0;
            int i11 = 0;
            while (true) {
                int i12 = 13107200;
                if (i10 < length) {
                    m5.r rVar = rVarArr[i10];
                    if (rVar != null) {
                        switch (rVar.b().f14306c) {
                            case -2:
                                i12 = 0;
                                i11 += i12;
                                break;
                            case -1:
                            case 1:
                                i11 += i12;
                                break;
                            case 0:
                                i12 = 144310272;
                                i11 += i12;
                                break;
                            case 2:
                                i12 = 131072000;
                                i11 += i12;
                                break;
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                                i12 = 131072;
                                i11 += i12;
                                break;
                            default:
                                throw new IllegalArgumentException();
                        }
                    }
                    i10++;
                } else {
                    iMax = Math.max(13107200, i11);
                }
            }
        }
        iVar.f22521b = iMax;
        jVar.d();
    }

    public final long m(long j10) {
        h0 h0Var = this.f22425r.f22553l;
        if (h0Var == null) {
            return 0L;
        }
        return Math.max(0L, j10 - (this.O - h0Var.f22519p));
    }

    public final void m0(int i10, int i11, List list) throws Throwable {
        this.A.c(1);
        t0 t0Var = this.f22426s;
        t0Var.getClass();
        ArrayList arrayList = t0Var.f22637b;
        p4.c.c(i10 >= 0 && i10 <= i11 && i11 <= arrayList.size());
        p4.c.c(list.size() == i11 - i10);
        for (int i12 = i10; i12 < i11; i12++) {
            ((s0) arrayList.get(i12)).f22627a.t((m4.i0) list.get(i12 - i10));
        }
        q(t0Var.b(), false);
    }

    public final void n(j5.b0 b0Var) {
        j0 j0Var = this.f22425r;
        h0 h0Var = j0Var.f22553l;
        if (h0Var != null && h0Var.f22504a == b0Var) {
            j0Var.m(this.O);
            w();
            return;
        }
        h0 h0Var2 = j0Var.f22554m;
        if (h0Var2 == null || h0Var2.f22504a != b0Var) {
            return;
        }
        x();
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00c0  */
    /* JADX WARN: Type inference failed for: r2v21, types: [j5.b0, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void n0() {
        /*
            Method dump skipped, instruction units count: 718
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: v4.c0.n0():void");
    }

    public final void o(IOException iOException, int i10) {
        m mVar = new m(0, iOException, i10);
        h0 h0Var = this.f22425r.f22550i;
        if (h0Var != null) {
            mVar = mVar.c(h0Var.f22510g.f22522a);
        }
        p4.c.o("ExoPlayerImplInternal", "Playback error", mVar);
        i0(false, false);
        this.f22433z = this.f22433z.d(mVar);
    }

    public final void o0(i1 i1Var, j5.d0 d0Var, i1 i1Var2, j5.d0 d0Var2, long j10, boolean z10) {
        boolean zG0 = g0(i1Var, d0Var);
        Object obj = d0Var.f10245a;
        if (!zG0) {
            m4.s0 s0Var = d0Var.b() ? m4.s0.f14578d : this.f22433z.f22666o;
            k kVar = this.f22421n;
            if (kVar.e().equals(s0Var)) {
                return;
            }
            this.f22415h.d(16);
            kVar.a(s0Var);
            s(this.f22433z.f22666o, s0Var.f14581a, false, false);
            return;
        }
        f1 f1Var = this.f22419l;
        int i10 = i1Var.g(obj, f1Var).f14203c;
        h1 h1Var = this.f22418k;
        i1Var.n(i10, h1Var);
        m4.c0 c0Var = h1Var.f14271j;
        h hVar = this.f22427t;
        hVar.getClass();
        hVar.f22492c = p4.c0.N(c0Var.f14149a);
        hVar.f22495f = p4.c0.N(c0Var.f14150b);
        hVar.f22496g = p4.c0.N(c0Var.f14151c);
        float f10 = c0Var.f14152d;
        if (f10 == -3.4028235E38f) {
            f10 = 0.97f;
        }
        hVar.f22499j = f10;
        float f11 = c0Var.f14153e;
        if (f11 == -3.4028235E38f) {
            f11 = 1.03f;
        }
        hVar.f22498i = f11;
        if (f10 == 1.0f && f11 == 1.0f) {
            hVar.f22492c = -9223372036854775807L;
        }
        hVar.a();
        if (j10 != -9223372036854775807L) {
            hVar.f22493d = j(i1Var, obj, j10);
            hVar.a();
            return;
        }
        if (!Objects.equals(!i1Var2.p() ? i1Var2.m(i1Var2.g(d0Var2.f10245a, f1Var).f14203c, h1Var, 0L).f14262a : null, h1Var.f14262a) || z10) {
            hVar.f22493d = -9223372036854775807L;
            hVar.a();
        }
    }

    public final void p(boolean z10) {
        h0 h0Var = this.f22425r.f22553l;
        j5.d0 d0Var = h0Var == null ? this.f22433z.f22653b : h0Var.f22510g.f22522a;
        boolean zEquals = this.f22433z.f22662k.equals(d0Var);
        if (!zEquals) {
            this.f22433z = this.f22433z.a(d0Var);
        }
        u0 u0Var = this.f22433z;
        u0Var.f22668q = h0Var == null ? u0Var.f22670s : h0Var.d();
        u0 u0Var2 = this.f22433z;
        u0Var2.f22669r = m(u0Var2.f22668q);
        if ((!zEquals || z10) && h0Var != null && h0Var.f22508e) {
            l0(h0Var.f22518o);
        }
    }

    public final void p0(boolean z10, boolean z11) {
        long jElapsedRealtime;
        this.E = z10;
        if (!z10 || z11) {
            jElapsedRealtime = -9223372036854775807L;
        } else {
            this.f22423p.getClass();
            jElapsedRealtime = SystemClock.elapsedRealtime();
        }
        this.F = jElapsedRealtime;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0377  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x037a  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x038f  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x03ad  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x03b9  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x03be  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x03de  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x03f5  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x03f8  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0403  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x040b  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0429  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0435  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x043a  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x045a  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01ff  */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5, types: [m4.i1] */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r14v13 */
    /* JADX WARN: Type inference failed for: r14v14, types: [v4.b0] */
    /* JADX WARN: Type inference failed for: r14v38 */
    /* JADX WARN: Type inference failed for: r2v14, types: [m4.i1] */
    /* JADX WARN: Type inference failed for: r2v19, types: [v4.u0] */
    /* JADX WARN: Type inference failed for: r2v36, types: [v4.j0] */
    /* JADX WARN: Type inference failed for: r37v0, types: [v4.c0] */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v20 */
    /* JADX WARN: Type inference failed for: r8v21 */
    /* JADX WARN: Type inference failed for: r8v25, types: [m4.i1] */
    /* JADX WARN: Type inference failed for: r8v27 */
    /* JADX WARN: Type inference failed for: r8v32 */
    /* JADX WARN: Type inference failed for: r8v33 */
    /* JADX WARN: Type inference failed for: r8v34 */
    /* JADX WARN: Type inference failed for: r8v35 */
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
    public final void q(m4.i1 r38, boolean r39) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1127
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: v4.c0.q(m4.i1, boolean):void");
    }

    public final synchronized void q0(j5.o oVar, long j10) {
        this.f22423p.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime() + j10;
        boolean z10 = false;
        while (!((Boolean) oVar.get()).booleanValue() && j10 > 0) {
            try {
                this.f22423p.getClass();
                wait(j10);
            } catch (InterruptedException unused) {
                z10 = true;
            }
            this.f22423p.getClass();
            j10 = jElapsedRealtime - SystemClock.elapsedRealtime();
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
    }

    public final void r(j5.b0 b0Var) {
        h0 h0Var;
        j0 j0Var = this.f22425r;
        h0 h0Var2 = j0Var.f22553l;
        k kVar = this.f22421n;
        if (h0Var2 != null && h0Var2.f22504a == b0Var) {
            h0Var2.getClass();
            if (!h0Var2.f22508e) {
                float f10 = kVar.e().f14581a;
                u0 u0Var = this.f22433z;
                h0Var2.f(f10, u0Var.f22652a, u0Var.f22663l);
            }
            l0(h0Var2.f22518o);
            if (h0Var2 == j0Var.f22550i) {
                K(h0Var2.f22510g.f22523b);
                i(new boolean[this.f22408a.length], j0Var.f22551j.e());
                h0Var2.f22511h = true;
                u0 u0Var2 = this.f22433z;
                j5.d0 d0Var = u0Var2.f22653b;
                long j10 = h0Var2.f22510g.f22523b;
                this.f22433z = t(d0Var, j10, u0Var2.f22654c, j10, false, 5);
            }
            w();
            return;
        }
        int i10 = 0;
        while (true) {
            if (i10 >= j0Var.f22558q.size()) {
                h0Var = null;
                break;
            }
            h0Var = (h0) j0Var.f22558q.get(i10);
            if (h0Var.f22504a == b0Var) {
                break;
            } else {
                i10++;
            }
        }
        if (h0Var != null) {
            p4.c.i(true ^ h0Var.f22508e);
            float f11 = kVar.e().f14581a;
            u0 u0Var3 = this.f22433z;
            h0Var.f(f11, u0Var3.f22652a, u0Var3.f22663l);
            h0 h0Var3 = j0Var.f22554m;
            if (h0Var3 == null || h0Var3.f22504a != b0Var) {
                return;
            }
            x();
        }
    }

    public final void s(m4.s0 s0Var, float f10, boolean z10, boolean z11) {
        int i10;
        if (z10) {
            if (z11) {
                this.A.c(1);
            }
            this.f22433z = this.f22433z.e(s0Var);
        }
        float f11 = s0Var.f14581a;
        h0 h0Var = this.f22425r.f22550i;
        while (true) {
            i10 = 0;
            if (h0Var == null) {
                break;
            }
            m5.r[] rVarArr = h0Var.f22518o.f14763c;
            int length = rVarArr.length;
            while (i10 < length) {
                m5.r rVar = rVarArr[i10];
                if (rVar != null) {
                    rVar.p(f11);
                }
                i10++;
            }
            h0Var = h0Var.f22516m;
        }
        a1[] a1VarArr = this.f22408a;
        int length2 = a1VarArr.length;
        while (i10 < length2) {
            a1 a1Var = a1VarArr[i10];
            float f12 = s0Var.f14581a;
            a1Var.f22393a.x(f10, f12);
            e eVar = a1Var.f22395c;
            if (eVar != null) {
                eVar.x(f10, f12);
            }
            i10++;
        }
    }

    public final u0 t(j5.d0 d0Var, long j10, long j11, long j12, boolean z10, int i10) {
        ya.a1 a1VarF;
        boolean z11;
        this.R = (!this.R && j10 == this.f22433z.f22670s && d0Var.equals(this.f22433z.f22653b)) ? false : true;
        J();
        u0 u0Var = this.f22433z;
        o1 o1Var = u0Var.f22659h;
        m5.u uVar = u0Var.f22660i;
        List list = u0Var.f22661j;
        if (this.f22426s.f22646k) {
            h0 h0Var = this.f22425r.f22550i;
            o1Var = h0Var == null ? o1.f10377d : h0Var.f22517n;
            uVar = h0Var == null ? this.f22412e : h0Var.f22518o;
            m5.r[] rVarArr = uVar.f14763c;
            ya.f0 f0Var = new ya.f0(4);
            boolean z12 = false;
            for (m5.r rVar : rVarArr) {
                if (rVar != null) {
                    m4.n0 n0Var = rVar.g(0).f14542l;
                    if (n0Var == null) {
                        f0Var.a(new m4.n0(new m4.m0[0]));
                    } else {
                        f0Var.a(n0Var);
                        z12 = true;
                    }
                }
            }
            if (z12) {
                a1VarF = f0Var.f();
            } else {
                ya.g0 g0Var = ya.i0.f25998b;
                a1VarF = ya.a1.f25946e;
            }
            list = a1VarF;
            if (h0Var != null) {
                i0 i0Var = h0Var.f22510g;
                if (i0Var.f22524c != j11) {
                    h0Var.f22510g = i0Var.a(j11);
                }
            }
            a1[] a1VarArr = this.f22408a;
            h0 h0Var2 = this.f22425r.f22550i;
            if (h0Var2 != null) {
                m5.u uVar2 = h0Var2.f22518o;
                int i11 = 0;
                boolean z13 = false;
                while (true) {
                    if (i11 >= a1VarArr.length) {
                        z11 = true;
                        break;
                    }
                    if (uVar2.b(i11)) {
                        if (a1VarArr[i11].f22393a.f22451b != 1) {
                            z11 = false;
                            break;
                        }
                        if (uVar2.f14762b[i11].f22732a != 0) {
                            z13 = true;
                        }
                    }
                    i11++;
                }
                boolean z14 = z13 && z11;
                if (z14 != this.L) {
                    this.L = z14;
                    if (!z14 && this.f22433z.f22667p) {
                        this.f22415h.e(2);
                    }
                }
            }
        } else if (!d0Var.equals(u0Var.f22653b)) {
            o1Var = o1.f10377d;
            uVar = this.f22412e;
            list = ya.a1.f25946e;
        }
        o1 o1Var2 = o1Var;
        m5.u uVar3 = uVar;
        List list2 = list;
        if (z10) {
            z zVar = this.A;
            if (!zVar.f22728c || zVar.f22729d == 5) {
                zVar.f22727b = true;
                zVar.f22728c = true;
                zVar.f22729d = i10;
            } else {
                p4.c.c(i10 == 5);
            }
        }
        u0 u0Var2 = this.f22433z;
        return u0Var2.b(d0Var, j10, j11, j12, m(u0Var2.f22668q), o1Var2, uVar3, list2);
    }

    public final boolean v() {
        h0 h0Var = this.f22425r.f22550i;
        long j10 = h0Var.f22510g.f22526e;
        if (h0Var.f22508e) {
            return j10 == -9223372036854775807L || this.f22433z.f22670s < j10 || !f0();
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r1v16, types: [j5.b0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v23, types: [j5.e1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v1, types: [j5.e1, java.lang.Object] */
    public final void w() {
        boolean zC;
        if (u(this.f22425r.f22553l)) {
            h0 h0Var = this.f22425r.f22553l;
            long jM = m(!h0Var.f22508e ? 0L : h0Var.f22504a.d());
            h0 h0Var2 = this.f22425r.f22550i;
            long j10 = g0(this.f22433z.f22652a, h0Var.f22510g.f22522a) ? this.f22427t.f22497h : -9223372036854775807L;
            w4.k kVar = this.f22428u;
            i1 i1Var = this.f22433z.f22652a;
            float f10 = this.f22421n.e().f14581a;
            boolean z10 = this.f22433z.f22663l;
            d0 d0Var = new d0(kVar, jM, f10, this.E, j10);
            zC = this.f22413f.c(d0Var);
            h0 h0Var3 = this.f22425r.f22550i;
            if (!zC && h0Var3.f22508e && jM < 500000 && this.f22420m > 0) {
                h0Var3.f22504a.i(this.f22433z.f22670s);
                zC = this.f22413f.c(d0Var);
            }
        } else {
            zC = false;
        }
        this.G = zC;
        if (zC) {
            h0 h0Var4 = this.f22425r.f22553l;
            h0Var4.getClass();
            e0 e0Var = new e0();
            e0Var.f22467a = this.O - h0Var4.f22519p;
            float f11 = this.f22421n.e().f14581a;
            p4.c.c(f11 > 0.0f || f11 == -3.4028235E38f);
            e0Var.f22468b = f11;
            long j11 = this.F;
            p4.c.c(j11 >= 0 || j11 == -9223372036854775807L);
            e0Var.f22469c = j11;
            f0 f0Var = new f0(e0Var);
            p4.c.i(h0Var4.f22516m == null);
            h0Var4.f22504a.e(f0Var);
        }
        k0();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [j5.b0, j5.e1, java.lang.Object] */
    public final void x() {
        j0 j0Var = this.f22425r;
        j0Var.k();
        h0 h0Var = j0Var.f22554m;
        if (h0Var != null) {
            ?? r12 = h0Var.f22504a;
            if ((!h0Var.f22507d || h0Var.f22508e) && !r12.m()) {
                i1 i1Var = this.f22433z.f22652a;
                if (h0Var.f22508e) {
                    r12.t();
                }
                Iterator it = this.f22413f.f22540i.values().iterator();
                while (it.hasNext()) {
                    if (((i) it.next()).f22520a) {
                        return;
                    }
                }
                if (!h0Var.f22507d) {
                    long j10 = h0Var.f22510g.f22523b;
                    h0Var.f22507d = true;
                    r12.g(this, j10);
                    return;
                }
                e0 e0Var = new e0();
                e0Var.f22467a = this.O - h0Var.f22519p;
                float f10 = this.f22421n.e().f14581a;
                p4.c.c(f10 > 0.0f || f10 == -3.4028235E38f);
                e0Var.f22468b = f10;
                long j11 = this.F;
                p4.c.c(j11 >= 0 || j11 == -9223372036854775807L);
                e0Var.f22469c = j11;
                f0 f0Var = new f0(e0Var);
                p4.c.i(h0Var.f22516m == null);
                r12.e(f0Var);
            }
        }
    }

    public final void y() {
        z zVar = this.A;
        u0 u0Var = this.f22433z;
        boolean z10 = zVar.f22727b | (((u0) zVar.f22730e) != u0Var);
        zVar.f22727b = z10;
        zVar.f22730e = u0Var;
        if (z10) {
            v vVar = this.f22424q.f22618b;
            vVar.f22680j.c(new b5.h(26, vVar, zVar));
            this.A = new z(this.f22433z);
        }
    }

    public final void z(int i10) {
        a1 a1Var = this.f22408a[i10];
        try {
            h0 h0Var = this.f22425r.f22550i;
            h0Var.getClass();
            e eVarD = a1Var.d(h0Var);
            eVarD.getClass();
            j5.c1 c1Var = eVarD.f22458i;
            c1Var.getClass();
            c1Var.b();
        } catch (IOException | RuntimeException e10) {
            int i11 = a1Var.f22393a.f22451b;
            if (i11 != 3 && i11 != 5) {
                throw e10;
            }
            m5.u uVar = this.f22425r.f22550i.f22518o;
            p4.c.o("ExoPlayerImplInternal", "Disabling track due to error: " + m4.q.c(uVar.f14763c[i10].m()), e10);
            m5.u uVar2 = new m5.u((z0[]) uVar.f14762b.clone(), (m5.r[]) uVar.f14763c.clone(), uVar.f14764d, uVar.f14765e);
            uVar2.f14762b[i10] = null;
            uVar2.f14763c[i10] = null;
            f(i10);
            h0 h0Var2 = this.f22425r.f22550i;
            h0Var2.a(uVar2, this.f22433z.f22670s, false, new boolean[h0Var2.f22513j.length]);
        }
    }
}
