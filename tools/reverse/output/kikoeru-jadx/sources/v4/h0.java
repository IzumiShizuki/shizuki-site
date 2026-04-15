package v4;

import android.media.Spatializer;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import b7.k1;
import j5.o1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;
import m4.i1;
import m4.j1;
import m4.m1;
import m4.p1;
import m4.q1;
import ya.a1;
import ya.f0;
import ya.i0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f22504a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f22505b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j5.c1[] f22506c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f22507d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f22508e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f22509f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public i0 f22510g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f22511h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean[] f22512i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e[] f22513j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final j2.b f22514k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final t0 f22515l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public h0 f22516m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public o1 f22517n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public m5.u f22518o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f22519p;

    public h0(e[] eVarArr, long j10, j2.b bVar, n5.f fVar, t0 t0Var, i0 i0Var, m5.u uVar) {
        this.f22513j = eVarArr;
        this.f22519p = j10;
        this.f22514k = bVar;
        this.f22515l = t0Var;
        j5.d0 d0Var = i0Var.f22522a;
        this.f22505b = d0Var.f10245a;
        this.f22510g = i0Var;
        this.f22517n = o1.f10377d;
        this.f22518o = uVar;
        this.f22506c = new j5.c1[eVarArr.length];
        this.f22512i = new boolean[eVarArr.length];
        long j11 = i0Var.f22523b;
        long j12 = i0Var.f22525d;
        boolean z10 = i0Var.f22527f;
        t0Var.getClass();
        Object obj = d0Var.f10245a;
        int i10 = y0.f22716n;
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        j5.d0 d0VarA = d0Var.a(pair.second);
        s0 s0Var = (s0) t0Var.f22639d.get(obj2);
        s0Var.getClass();
        t0Var.f22642g.add(s0Var);
        r0 r0Var = (r0) t0Var.f22641f.get(s0Var);
        if (r0Var != null) {
            r0Var.f22623a.f(r0Var.f22624b);
        }
        s0Var.f22629c.add(d0VarA);
        j5.b0 b0VarC = s0Var.f22627a.c(d0VarA, fVar, j11);
        t0Var.f22638c.put(b0VarC, s0Var);
        t0Var.c();
        this.f22504a = j12 != -9223372036854775807L ? new j5.d(b0VarC, !z10, 0L, j12) : b0VarC;
    }

    /* JADX WARN: Type inference failed for: r9v0, types: [j5.b0, java.lang.Object] */
    public final long a(m5.u uVar, long j10, boolean z10, boolean[] zArr) {
        e[] eVarArr;
        j5.c1[] c1VarArr;
        int i10 = 0;
        while (true) {
            boolean z11 = true;
            if (i10 >= uVar.f14761a) {
                break;
            }
            if (z10 || !uVar.a(this.f22518o, i10)) {
                z11 = false;
            }
            this.f22512i[i10] = z11;
            i10++;
        }
        int i11 = 0;
        while (true) {
            eVarArr = this.f22513j;
            int length = eVarArr.length;
            c1VarArr = this.f22506c;
            if (i11 >= length) {
                break;
            }
            if (eVarArr[i11].f22451b == -2) {
                c1VarArr[i11] = null;
            }
            i11++;
        }
        b();
        this.f22518o = uVar;
        c();
        long jL = this.f22504a.l(uVar.f14763c, this.f22512i, this.f22506c, zArr, j10);
        for (int i12 = 0; i12 < eVarArr.length; i12++) {
            if (eVarArr[i12].f22451b == -2 && this.f22518o.b(i12)) {
                c1VarArr[i12] = new j5.r();
            }
        }
        this.f22509f = false;
        for (int i13 = 0; i13 < c1VarArr.length; i13++) {
            if (c1VarArr[i13] != null) {
                p4.c.i(uVar.b(i13));
                if (eVarArr[i13].f22451b != -2) {
                    this.f22509f = true;
                }
            } else {
                p4.c.i(uVar.f14763c[i13] == null);
            }
        }
        return jL;
    }

    public final void b() {
        if (this.f22516m != null) {
            return;
        }
        int i10 = 0;
        while (true) {
            m5.u uVar = this.f22518o;
            if (i10 >= uVar.f14761a) {
                return;
            }
            boolean zB = uVar.b(i10);
            m5.r rVar = this.f22518o.f14763c[i10];
            if (zB && rVar != null) {
                rVar.k();
            }
            i10++;
        }
    }

    public final void c() {
        if (this.f22516m != null) {
            return;
        }
        int i10 = 0;
        while (true) {
            m5.u uVar = this.f22518o;
            if (i10 >= uVar.f14761a) {
                return;
            }
            boolean zB = uVar.b(i10);
            m5.r rVar = this.f22518o.f14763c[i10];
            if (zB && rVar != null) {
                rVar.h();
            }
            i10++;
        }
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [j5.e1, java.lang.Object] */
    public final long d() {
        if (!this.f22508e) {
            return this.f22510g.f22523b;
        }
        long jT = this.f22509f ? this.f22504a.t() : Long.MIN_VALUE;
        return jT == Long.MIN_VALUE ? this.f22510g.f22526e : jT;
    }

    public final long e() {
        return this.f22510g.f22523b + this.f22519p;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [j5.b0, java.lang.Object] */
    public final void f(float f10, i1 i1Var, boolean z10) {
        this.f22508e = true;
        this.f22517n = this.f22504a.q();
        m5.u uVarJ = j(f10, i1Var, z10);
        i0 i0Var = this.f22510g;
        long jMax = i0Var.f22523b;
        long j10 = i0Var.f22526e;
        if (j10 != -9223372036854775807L && jMax >= j10) {
            jMax = Math.max(0L, j10 - 1);
        }
        long jA = a(uVarJ, jMax, false, new boolean[this.f22513j.length]);
        long j11 = this.f22519p;
        i0 i0Var2 = this.f22510g;
        this.f22519p = (i0Var2.f22523b - jA) + j11;
        this.f22510g = i0Var2.b(jA);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [j5.e1, java.lang.Object] */
    public final boolean g() {
        if (this.f22508e) {
            return !this.f22509f || this.f22504a.t() == Long.MIN_VALUE;
        }
        return false;
    }

    public final boolean h() {
        if (this.f22508e) {
            return g() || d() - this.f22510g.f22523b >= -9223372036854775807L;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [j5.b0, java.lang.Object] */
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
    public final void i() {
        b();
        ?? r0 = this.f22504a;
        try {
            boolean z10 = r0 instanceof j5.d;
            t0 t0Var = this.f22515l;
            if (z10) {
                t0Var.f(((j5.d) r0).f10238a);
            } else {
                t0Var.f(r0);
            }
        } catch (RuntimeException e10) {
            p4.c.o("MediaPeriodHolder", "Period release failed.", e10);
        }
    }

    public final m5.u j(float f10, i1 i1Var, boolean z10) {
        int i10;
        final m5.j jVar;
        final boolean z11;
        String str;
        long j10;
        boolean z12;
        ya.a1 a1VarU;
        m5.r bVar;
        long j11;
        int i11;
        int[] iArr;
        long[][] jArr;
        Object obj;
        int i12;
        m1 m1Var;
        int[] iArr2;
        m5.q qVar;
        j1 j1Var;
        int[] iArr3;
        b5.d0 d0Var;
        int[] iArr4;
        j2.b bVar2 = this.f22514k;
        e[] eVarArr = this.f22513j;
        o1 o1Var = this.f22517n;
        bVar2.getClass();
        int[] iArr5 = new int[eVarArr.length + 1];
        int length = eVarArr.length + 1;
        j1[][] j1VarArr = new j1[length][];
        int[][][] iArr6 = new int[eVarArr.length + 1][][];
        for (int i13 = 0; i13 < length; i13++) {
            int i14 = o1Var.f10379a;
            j1VarArr[i13] = new j1[i14];
            iArr6[i13] = new int[i14][];
        }
        int length2 = eVarArr.length;
        final int[] iArr7 = new int[length2];
        for (int i15 = 0; i15 < length2; i15++) {
            iArr7[i15] = eVarArr[i15].z();
        }
        int i16 = 0;
        while (true) {
            i10 = 5;
            if (i16 >= o1Var.f10379a) {
                break;
            }
            j1 j1VarA = o1Var.a(i16);
            boolean z13 = j1VarA.f14306c == 5;
            int length3 = eVarArr.length;
            int i17 = 0;
            int i18 = 0;
            boolean z14 = true;
            while (i17 < eVarArr.length) {
                e eVar = eVarArr[i17];
                j2.b bVar3 = bVar2;
                o1 o1Var2 = o1Var;
                int iMax = 0;
                for (int i19 = 0; i19 < j1VarA.f14304a; i19++) {
                    iMax = Math.max(iMax, eVar.y(j1VarA.f14307d[i19]) & 7);
                }
                boolean z15 = iArr5[i17] == 0;
                if (iMax > i18 || (iMax == i18 && z13 && !z14 && z15)) {
                    i18 = iMax;
                    z14 = z15;
                    length3 = i17;
                }
                i17++;
                bVar2 = bVar3;
                o1Var = o1Var2;
            }
            j2.b bVar4 = bVar2;
            o1 o1Var3 = o1Var;
            if (length3 == eVarArr.length) {
                iArr4 = new int[j1VarA.f14304a];
            } else {
                e eVar2 = eVarArr[length3];
                int[] iArr8 = new int[j1VarA.f14304a];
                for (int i20 = 0; i20 < j1VarA.f14304a; i20++) {
                    iArr8[i20] = eVar2.y(j1VarA.f14307d[i20]);
                }
                iArr4 = iArr8;
            }
            int i21 = iArr5[length3];
            j1VarArr[length3][i21] = j1VarA;
            iArr6[length3][i21] = iArr4;
            iArr5[length3] = i21 + 1;
            i16++;
            bVar2 = bVar4;
            o1Var = o1Var3;
        }
        j2.b bVar5 = bVar2;
        o1[] o1VarArr = new o1[eVarArr.length];
        String[] strArr = new String[eVarArr.length];
        int[] iArr9 = new int[eVarArr.length];
        for (int i22 = 0; i22 < eVarArr.length; i22++) {
            int i23 = iArr5[i22];
            o1VarArr[i22] = new o1((j1[]) p4.c0.P(i23, j1VarArr[i22]));
            iArr6[i22] = (int[][]) p4.c0.P(i23, iArr6[i22]);
            strArr[i22] = eVarArr[i22].i();
            iArr9[i22] = eVarArr[i22].f22451b;
        }
        m5.t tVar = new m5.t(iArr9, o1VarArr, iArr7, iArr6, new o1((j1[]) p4.c0.P(iArr5[eVarArr.length], j1VarArr[eVarArr.length])));
        final m5.p pVar = (m5.p) bVar5;
        synchronized (pVar.f14746c) {
            try {
                jVar = pVar.f14750g;
                if (jVar.o0 && p4.c0.f16548a >= 32 && (d0Var = pVar.f14751h) != null) {
                    Looper looperMyLooper = Looper.myLooper();
                    p4.c.j(looperMyLooper);
                    if (((m5.k) d0Var.f1523d) == null && ((Handler) d0Var.f1522c) == null) {
                        d0Var.f1523d = new m5.k(pVar);
                        Handler handler = new Handler(looperMyLooper);
                        d0Var.f1522c = handler;
                        ((Spatializer) d0Var.f1521b).addOnSpatializerStateChangedListener(new k1(handler, 1), (m5.k) d0Var.f1523d);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        int i24 = tVar.f14755a;
        m5.q[] qVarArr = new m5.q[i24];
        int i25 = 0;
        while (true) {
            if (i25 >= tVar.f14755a) {
                z11 = false;
                break;
            }
            if (2 == iArr9[i25] && o1VarArr[i25].f10379a > 0) {
                z11 = true;
                break;
            }
            i25++;
        }
        Pair pairM = m5.p.m(1, tVar, iArr6, new m5.m() { // from class: m5.d
            @Override // m5.m
            public final a1 e(int i26, j1 j1Var2, int[] iArr10) {
                p pVar2 = pVar;
                pVar2.getClass();
                e eVar3 = new e(pVar2);
                int i27 = iArr7[i26];
                f0 f0VarP = i0.p();
                for (int i28 = 0; i28 < j1Var2.f14304a; i28++) {
                    f0VarP.a(new f(i26, j1Var2, i28, jVar, iArr10[i28], z11, eVar3, i27));
                }
                return f0VarP.f();
            }
        }, new androidx.media3.exoplayer.offline.i(11));
        if (pairM != null) {
            qVarArr[((Integer) pairM.second).intValue()] = (m5.q) pairM.first;
        }
        if (pairM == null) {
            str = null;
        } else {
            m5.q qVar2 = (m5.q) pairM.first;
            str = qVar2.f14753a.f14307d[qVar2.f14754b[0]].f14534d;
        }
        m1 m1Var2 = jVar.f14469t;
        Pair pairM2 = m1Var2.f14402a == 2 ? null : m5.p.m(2, tVar, iArr6, new b7.w0(jVar, str, iArr7, i10), new androidx.media3.exoplayer.offline.i(10));
        Object obj2 = null;
        int i26 = 4;
        Pair pairM3 = ((jVar.f14474y || pairM2 == null) && m1Var2.f14402a != 2) ? m5.p.m(4, tVar, iArr6, new androidx.media3.exoplayer.offline.g(15, jVar), new androidx.media3.exoplayer.offline.i(9)) : null;
        if (pairM3 != null) {
            qVarArr[((Integer) pairM3.second).intValue()] = (m5.q) pairM3.first;
        } else if (pairM2 != null) {
            qVarArr[((Integer) pairM2.second).intValue()] = (m5.q) pairM2.first;
        }
        int i27 = 3;
        Pair pairM4 = m1Var2.f14402a == 2 ? null : m5.p.m(3, tVar, iArr6, new b7.i0(15, jVar, str), new androidx.media3.exoplayer.offline.i(12));
        if (pairM4 != null) {
            qVarArr[((Integer) pairM4.second).intValue()] = (m5.q) pairM4.first;
        }
        int i28 = 0;
        while (i28 < i24) {
            int i29 = iArr9[i28];
            if (i29 == 2 || i29 == 1 || i29 == i27 || i29 == i26) {
                i12 = i28;
                m1Var = m1Var2;
                iArr2 = iArr9;
            } else {
                o1 o1Var4 = o1VarArr[i28];
                int[][] iArr10 = iArr6[i28];
                if (m1Var2.f14402a == 2) {
                    i12 = i28;
                    m1Var = m1Var2;
                    iArr2 = iArr9;
                } else {
                    i12 = i28;
                    j1 j1Var2 = null;
                    m5.h hVar = null;
                    int i30 = 0;
                    int i31 = 0;
                    while (i30 < o1Var4.f10379a) {
                        j1 j1VarA2 = o1Var4.a(i30);
                        int[] iArr11 = iArr10[i30];
                        m1 m1Var3 = m1Var2;
                        o1 o1Var5 = o1Var4;
                        m5.h hVar2 = hVar;
                        int i32 = i31;
                        j1 j1Var3 = j1Var2;
                        int i33 = 0;
                        while (i33 < j1VarA2.f14304a) {
                            int i34 = i33;
                            if (q.t0.v(iArr11[i33], jVar.p0)) {
                                j1Var = j1VarA2;
                                m5.h hVar3 = new m5.h(j1VarA2.f14307d[i34], iArr11[i34]);
                                if (hVar2 != null) {
                                    iArr3 = iArr9;
                                    if (ya.y.f26074a.c(hVar3.f14701b, hVar2.f14701b).c(hVar3.f14700a, hVar2.f14700a).e() > 0) {
                                    }
                                } else {
                                    iArr3 = iArr9;
                                }
                                hVar2 = hVar3;
                                i32 = i34;
                                j1Var3 = j1Var;
                            } else {
                                j1Var = j1VarA2;
                                iArr3 = iArr9;
                            }
                            i33 = i34 + 1;
                            j1VarA2 = j1Var;
                            iArr9 = iArr3;
                        }
                        i30++;
                        j1Var2 = j1Var3;
                        i31 = i32;
                        o1Var4 = o1Var5;
                        hVar = hVar2;
                        m1Var2 = m1Var3;
                    }
                    m1Var = m1Var2;
                    iArr2 = iArr9;
                    if (j1Var2 != null) {
                        qVar = new m5.q(0, j1Var2, new int[]{i31});
                    }
                    qVarArr[i12] = qVar;
                }
                qVar = null;
                qVarArr[i12] = qVar;
            }
            i28 = i12 + 1;
            m1Var2 = m1Var;
            iArr9 = iArr2;
            i26 = 4;
            i27 = 3;
        }
        int i35 = tVar.f14755a;
        o1[] o1VarArr2 = tVar.f14757c;
        HashMap map = new HashMap();
        for (int i36 = 0; i36 < i35; i36++) {
            m5.p.f(o1VarArr2[i36], jVar, map);
        }
        m5.p.f(tVar.f14760f, jVar, map);
        for (int i37 = 0; i37 < i35; i37++) {
            m4.k1 k1Var = (m4.k1) map.get(Integer.valueOf(tVar.f14756b[i37]));
            if (k1Var != null) {
                j1 j1Var4 = k1Var.f14346a;
                ya.i0 i0Var = k1Var.f14347b;
                qVarArr[i37] = (i0Var.isEmpty() || o1VarArr2[i37].b(j1Var4) == -1) ? null : new m5.q(0, j1Var4, g8.a.a0(i0Var));
            }
        }
        int i38 = tVar.f14755a;
        for (int i39 = 0; i39 < i38; i39++) {
            o1 o1Var6 = tVar.f14757c[i39];
            Map map2 = (Map) jVar.r0.get(i39);
            if (map2 != null && map2.containsKey(o1Var6)) {
                Map map3 = (Map) jVar.r0.get(i39);
                if (map3 != null && map3.get(o1Var6) != null) {
                    throw new ClassCastException();
                }
                qVarArr[i39] = null;
            }
        }
        for (int i40 = 0; i40 < i24; i40++) {
            int i41 = tVar.f14756b[i40];
            if (jVar.f14712s0.get(i40) || jVar.C.contains(Integer.valueOf(i41))) {
                qVarArr[i40] = null;
            }
        }
        m3.l lVar = pVar.f14748e;
        n5.e eVar3 = (n5.e) pVar.f9724b;
        p4.c.j(eVar3);
        lVar.getClass();
        ArrayList arrayList = new ArrayList();
        int i42 = 0;
        while (i42 < qVarArr.length) {
            m5.q qVar3 = qVarArr[i42];
            if (qVar3 == null || qVar3.f14754b.length <= 1) {
                obj = obj2;
                arrayList.add(obj);
            } else {
                ya.f0 f0VarP = ya.i0.p();
                f0VarP.a(new m5.a(0L, 0L));
                arrayList.add(f0VarP);
                obj = obj2;
            }
            i42++;
            obj2 = obj;
        }
        int length4 = qVarArr.length;
        long[][] jArr2 = new long[length4][];
        int i43 = 0;
        while (true) {
            j10 = -1;
            if (i43 >= qVarArr.length) {
                break;
            }
            m5.q qVar4 = qVarArr[i43];
            if (qVar4 == null) {
                jArr2[i43] = new long[0];
                jArr = jArr2;
            } else {
                int[] iArr12 = qVar4.f14754b;
                jArr2[i43] = new long[iArr12.length];
                int i44 = 0;
                while (i44 < iArr12.length) {
                    long[][] jArr3 = jArr2;
                    long j12 = qVar4.f14753a.f14307d[iArr12[i44]].f14540j;
                    long[] jArr4 = jArr3[i43];
                    if (j12 == -1) {
                        j12 = 0;
                    }
                    jArr4[i44] = j12;
                    i44++;
                    jArr2 = jArr3;
                }
                jArr = jArr2;
                Arrays.sort(jArr[i43]);
            }
            i43++;
            jArr2 = jArr;
        }
        long[][] jArr5 = jArr2;
        int[] iArr13 = new int[length4];
        long[] jArr6 = new long[length4];
        for (int i45 = 0; i45 < length4; i45++) {
            long[] jArr7 = jArr5[i45];
            jArr6[i45] = jArr7.length == 0 ? 0L : jArr7[0];
        }
        m5.b.v(arrayList, jArr6);
        ya.q.d(2, "expectedValuesPerKey");
        TreeMap treeMap = new TreeMap(ya.x0.f26071b);
        ya.u0 u0Var = new ya.u0();
        ya.v0 v0Var = new ya.v0(treeMap);
        v0Var.f26069f = u0Var;
        int i46 = 0;
        while (i46 < length4) {
            long[] jArr8 = jArr5[i46];
            if (jArr8.length <= 1) {
                iArr = iArr13;
                j11 = j10;
                i11 = length4;
            } else {
                int length5 = jArr8.length;
                double[] dArr = new double[length5];
                j11 = j10;
                int i47 = 0;
                while (true) {
                    long[] jArr9 = jArr5[i46];
                    i11 = length4;
                    double dLog = 0.0d;
                    if (i47 >= jArr9.length) {
                        break;
                    }
                    int[] iArr14 = iArr13;
                    long j13 = jArr9[i47];
                    if (j13 != j11) {
                        dLog = Math.log(j13);
                    }
                    dArr[i47] = dLog;
                    i47++;
                    length4 = i11;
                    iArr13 = iArr14;
                }
                iArr = iArr13;
                int i48 = length5 - 1;
                double d10 = dArr[i48] - dArr[0];
                int i49 = 0;
                while (i49 < i48) {
                    double d11 = dArr[i49];
                    i49++;
                    Double dValueOf = Double.valueOf(d10 == 0.0d ? 1.0d : (((d11 + dArr[i49]) * 0.5d) - dArr[0]) / d10);
                    double d12 = d10;
                    Integer numValueOf = Integer.valueOf(i46);
                    Map map4 = v0Var.f26067d;
                    int i50 = i46;
                    Collection collection = (Collection) map4.get(dValueOf);
                    if (collection == null) {
                        Collection collectionC = v0Var.c();
                        if (!collectionC.add(numValueOf)) {
                            throw new AssertionError("New Collection violated the Collection spec");
                        }
                        v0Var.f26068e++;
                        map4.put(dValueOf, collectionC);
                    } else if (collection.add(numValueOf)) {
                        v0Var.f26068e++;
                    }
                    d10 = d12;
                    i46 = i50;
                }
            }
            i46++;
            length4 = i11;
            j10 = j11;
            iArr13 = iArr;
        }
        int[] iArr15 = iArr13;
        ya.n nVar = v0Var.f26029b;
        if (nVar == null) {
            nVar = new ya.n(0, v0Var);
            v0Var.f26029b = nVar;
        }
        ya.i0 i0VarQ = ya.i0.q(nVar);
        for (int i51 = 0; i51 < i0VarQ.size(); i51++) {
            int iIntValue = ((Integer) i0VarQ.get(i51)).intValue();
            int i52 = iArr15[iIntValue] + 1;
            iArr15[iIntValue] = i52;
            jArr6[iIntValue] = jArr5[iIntValue][i52];
            m5.b.v(arrayList, jArr6);
        }
        for (int i53 = 0; i53 < qVarArr.length; i53++) {
            if (arrayList.get(i53) != null) {
                jArr6[i53] = jArr6[i53] * 2;
            }
        }
        m5.b.v(arrayList, jArr6);
        ya.f0 f0VarP2 = ya.i0.p();
        for (int i54 = 0; i54 < arrayList.size(); i54++) {
            ya.f0 f0Var = (ya.f0) arrayList.get(i54);
            f0VarP2.a(f0Var == null ? ya.a1.f25946e : f0Var.f());
        }
        ya.a1 a1VarF = f0VarP2.f();
        m5.r[] rVarArr = new m5.r[qVarArr.length];
        for (int i55 = 0; i55 < qVarArr.length; i55++) {
            m5.q qVar5 = qVarArr[i55];
            if (qVar5 != null) {
                int[] iArr16 = qVar5.f14754b;
                if (iArr16.length != 0) {
                    if (iArr16.length == 1) {
                        bVar = new m5.s(qVar5.f14753a, new int[]{iArr16[0]});
                    } else {
                        long j14 = 25000;
                        bVar = new m5.b(qVar5.f14753a, iArr16, eVar3, 10000, j14, j14, (ya.i0) a1VarF.get(i55));
                    }
                    rVarArr[i55] = bVar;
                }
            }
        }
        z0[] z0VarArr = new z0[i24];
        for (int i56 = 0; i56 < i24; i56++) {
            z0VarArr[i56] = (jVar.f14712s0.get(i56) || jVar.C.contains(Integer.valueOf(tVar.f14756b[i56])) || (tVar.f14756b[i56] != -2 && rVarArr[i56] == null)) ? null : z0.f22731c;
        }
        if (jVar.f14469t.f14402a != 0) {
            int i57 = 0;
            int i58 = -1;
            int i59 = 0;
            while (true) {
                if (i59 < tVar.f14755a) {
                    int i60 = tVar.f14756b[i59];
                    m5.r rVar = rVarArr[i59];
                    if (i60 != 1 && rVar != null) {
                        break;
                    }
                    if (i60 == 1 && rVar != null && rVar.length() == 1) {
                        if (m5.p.l(jVar, iArr6[i59][tVar.f14757c[i59].b(rVar.b())][rVar.i(0)], rVar.m())) {
                            i57++;
                            i58 = i59;
                        }
                    }
                    i59++;
                } else if (i57 == 1) {
                    int i61 = jVar.f14469t.f14403b ? 1 : 2;
                    z0 z0Var = z0VarArr[i58];
                    z0VarArr[i58] = new z0(i61, z0Var != null && z0Var.f22733b);
                }
            }
        }
        Pair pairCreate = Pair.create(z0VarArr, rVarArr);
        m5.r[] rVarArr2 = (m5.r[]) pairCreate.second;
        List[] listArr = new List[rVarArr2.length];
        for (int i62 = 0; i62 < rVarArr2.length; i62++) {
            m5.r rVar2 = rVarArr2[i62];
            if (rVar2 != null) {
                a1VarU = ya.i0.u(rVar2);
            } else {
                ya.g0 g0Var = ya.i0.f25998b;
                a1VarU = ya.a1.f25946e;
            }
            listArr[i62] = a1VarU;
        }
        ya.f0 f0Var2 = new ya.f0(4);
        int i63 = 0;
        while (true) {
            int i64 = tVar.f14755a;
            o1[] o1VarArr3 = tVar.f14757c;
            if (i63 >= i64) {
                break;
            }
            o1 o1Var7 = o1VarArr3[i63];
            List list = listArr[i63];
            int i65 = 0;
            while (i65 < o1Var7.f10379a) {
                j1 j1VarA3 = o1Var7.a(i65);
                int i66 = o1VarArr3[i63].a(i65).f14304a;
                int[] iArr17 = new int[i66];
                int i67 = 0;
                int i68 = 0;
                while (i67 < i66) {
                    List[] listArr2 = listArr;
                    if ((tVar.f14759e[i63][i65][i67] & 7) == 4) {
                        iArr17[i68] = i67;
                        i68++;
                    }
                    i67++;
                    listArr = listArr2;
                }
                List[] listArr3 = listArr;
                int[] iArrCopyOf = Arrays.copyOf(iArr17, i68);
                o1 o1Var8 = o1Var7;
                String str2 = null;
                int i69 = 0;
                boolean z16 = false;
                int i70 = 0;
                int iMin = 16;
                while (i69 < iArrCopyOf.length) {
                    String str3 = o1VarArr3[i63].a(i65).f14307d[iArrCopyOf[i69]].f14544n;
                    int i71 = i70 + 1;
                    if (i70 == 0) {
                        str2 = str3;
                    } else {
                        z16 = (!Objects.equals(str2, str3)) | z16;
                    }
                    iMin = Math.min(iMin, tVar.f14759e[i63][i65][i69] & 24);
                    i69++;
                    i70 = i71;
                }
                if (z16) {
                    iMin = Math.min(iMin, tVar.f14758d[i63]);
                }
                boolean z17 = iMin != 0;
                int i72 = j1VarA3.f14304a;
                int[] iArr18 = new int[i72];
                boolean[] zArr = new boolean[i72];
                for (int i73 = 0; i73 < j1VarA3.f14304a; i73++) {
                    iArr18[i73] = tVar.f14759e[i63][i65][i73] & 7;
                    int i74 = 0;
                    while (true) {
                        if (i74 >= list.size()) {
                            z12 = false;
                            break;
                        }
                        m5.r rVar3 = (m5.r) list.get(i74);
                        if (rVar3.b().equals(j1VarA3) && rVar3.u(i73) != -1) {
                            z12 = true;
                            break;
                        }
                        i74++;
                    }
                    zArr[i73] = z12;
                }
                f0Var2.a(new p1(j1VarA3, z17, iArr18, zArr));
                i65++;
                listArr = listArr3;
                o1Var7 = o1Var8;
            }
            i63++;
        }
        o1 o1Var9 = tVar.f14760f;
        for (int i75 = 0; i75 < o1Var9.f10379a; i75++) {
            j1 j1VarA4 = o1Var9.a(i75);
            int[] iArr19 = new int[j1VarA4.f14304a];
            Arrays.fill(iArr19, 0);
            f0Var2.a(new p1(j1VarA4, false, iArr19, new boolean[j1VarA4.f14304a]));
        }
        m5.u uVar = new m5.u((z0[]) pairCreate.first, (m5.r[]) pairCreate.second, new q1(f0Var2.f()), tVar);
        for (int i76 = 0; i76 < uVar.f14761a; i76++) {
            if (uVar.b(i76)) {
                p4.c.i(uVar.f14763c[i76] != null || this.f22513j[i76].f22451b == -2);
            } else {
                p4.c.i(uVar.f14763c[i76] == null);
            }
        }
        for (m5.r rVar4 : uVar.f14763c) {
            if (rVar4 != null) {
                rVar4.p(f10);
                rVar4.e(z10);
            }
        }
        return uVar;
    }

    public final void k() {
        Object obj = this.f22504a;
        if (obj instanceof j5.d) {
            long j10 = this.f22510g.f22525d;
            if (j10 == -9223372036854775807L) {
                j10 = Long.MIN_VALUE;
            }
            j5.d dVar = (j5.d) obj;
            dVar.f10242e = 0L;
            dVar.f10243f = j10;
        }
    }
}
