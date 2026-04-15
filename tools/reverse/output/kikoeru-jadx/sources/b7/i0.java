package b7;

import android.net.Uri;
import android.os.Bundle;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Pair;
import com.tencent.bugly.beta.tinker.TinkerReport;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i0 implements p4.k, r0, h1, n2, p4.g, p3, r5.r, m5.m, p4.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1853a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1854b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1855c;

    public /* synthetic */ i0(int i10, Object obj, Object obj2) {
        this.f1853a = i10;
        this.f1854b = obj;
        this.f1855c = obj2;
    }

    @Override // p4.k
    public void a(Object obj) {
        switch (this.f1853a) {
            case 0:
                ((m4.w0) obj).D((m4.i0) this.f1854b, ((Integer) this.f1855c).intValue());
                break;
            case 4:
                ((m4.w0) obj).D(((v3) ((b1) this.f1854b).f1650b).k(), ((Integer) this.f1855c).intValue());
                break;
            default:
                w4.a aVar = (w4.a) this.f1854b;
                j5.z zVar = (j5.z) this.f1855c;
                w4.i iVar = (w4.i) obj;
                iVar.getClass();
                j5.d0 d0Var = aVar.f23340d;
                if (d0Var != null) {
                    m4.q qVar = zVar.f10495c;
                    qVar.getClass();
                    int i10 = zVar.f10496d;
                    w4.f fVar = iVar.f23374b;
                    m4.i1 i1Var = aVar.f23338b;
                    d0Var.getClass();
                    ah.j jVar = new ah.j(qVar, i10, fVar.d(i1Var, d0Var), 14);
                    int i11 = zVar.f10494b;
                    if (i11 != 0) {
                        if (i11 == 1) {
                            iVar.f23388p = jVar;
                            break;
                        } else if (i11 != 2) {
                            if (i11 == 3) {
                                iVar.f23389q = jVar;
                                break;
                            }
                        }
                    }
                    iVar.f23387o = jVar;
                    break;
                }
                break;
        }
    }

    @Override // p4.g
    public void accept(Object obj) {
        switch (this.f1853a) {
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_ART /* 9 */:
                q3 q3Var = (q3) this.f1854b;
                m4.o1 o1VarB = (m4.o1) this.f1855c;
                z3 z3Var = (z3) obj;
                ya.k0 k0Var = o1VarB.B;
                if (!k0Var.isEmpty()) {
                    m4.n1 n1VarC = o1VarB.a().c();
                    ya.o1 it = k0Var.values().iterator();
                    while (it.hasNext()) {
                        m4.k1 k1Var = (m4.k1) it.next();
                        m4.j1 j1Var = (m4.j1) q3Var.f2049i.f26083h.get(k1Var.f14346a.f14305b);
                        if (j1Var == null || k1Var.f14346a.f14304a != j1Var.f14304a) {
                            n1VarC.a(k1Var);
                        } else {
                            n1VarC.a(new m4.k1(j1Var, k1Var.f14347b));
                        }
                    }
                    o1VarB = n1VarC.b();
                }
                z3Var.r0();
                v4.v vVar = (v4.v) z3Var.f2227a;
                vVar.m2();
                j2.b bVar = vVar.f22679i;
                bVar.getClass();
                m5.p pVar = (m5.p) bVar;
                if (!o1VarB.equals(pVar.h())) {
                    if (o1VarB instanceof m5.j) {
                        pVar.n((m5.j) o1VarB);
                    }
                    m5.i iVar = new m5.i(pVar.h());
                    iVar.d(o1VarB);
                    pVar.n(new m5.j(iVar));
                    vVar.f22683m.e(19, new androidx.media3.exoplayer.offline.g(20, o1VarB));
                    break;
                }
                break;
            case TinkerReport.KEY_APPLY_WITH_RETRY /* 10 */:
                q3 q3Var2 = (q3) this.f1854b;
                t1 t1Var = (t1) this.f1855c;
                c2 c2Var = (c2) q3Var2.f2045e.get();
                if (c2Var != null && !c2Var.h()) {
                    c2Var.f(t1Var, false);
                    break;
                }
                break;
            default:
                ah.j jVar = (ah.j) this.f1854b;
                ((j5.j0) obj).z(jVar.f390b, (j5.d0) jVar.f391c, (j5.z) this.f1855c);
                break;
        }
    }

    @Override // b7.n2
    public void b(t1 t1Var) {
        switch (this.f1853a) {
            case 7:
                o2 o2Var = (o2) this.f1854b;
                Bundle bundle = (Bundle) this.f1855c;
                c2 c2Var = o2Var.f2008g;
                if (bundle == null) {
                    Bundle bundle2 = Bundle.EMPTY;
                }
                c2Var.l(t1Var);
                break;
            default:
                o2 o2Var2 = (o2) this.f1854b;
                c7.q0 q0Var = (c7.q0) this.f1855c;
                o2Var2.getClass();
                String str = q0Var.f3700a;
                if (TextUtils.isEmpty(str)) {
                    p4.c.B("MediaSessionLegacyStub", "onRemoveQueueItem(): Media ID shouldn't be null");
                } else {
                    z3 z3Var = o2Var2.f2008g.f1693t;
                    if (z3Var.B0(17)) {
                        m4.i1 i1VarJ = z3Var.J();
                        m4.h1 h1Var = new m4.h1();
                        for (int i10 = 0; i10 < i1VarJ.o(); i10++) {
                            if (TextUtils.equals(i1VarJ.m(i10, h1Var, 0L).f14264c.f14285a, str)) {
                                z3Var.Y(i10);
                            }
                        }
                    } else {
                        p4.c.B("MediaSessionLegacyStub", "Can't remove item by ID without COMMAND_GET_TIMELINE being available");
                    }
                }
                break;
        }
    }

    @Override // b7.h1
    public void c(t0 t0Var) {
        t3 t3Var;
        boolean z10;
        boolean z11;
        boolean z12;
        int i10 = this.f1853a;
        Object obj = this.f1855c;
        Object obj2 = this.f1854b;
        switch (i10) {
            case 5:
                v3 v3Var = (v3) obj2;
                t3 t3Var2 = (t3) obj;
                if (t0Var.T()) {
                    v3 v3Var2 = t0Var.A;
                    if (v3Var2 != null && (t3Var = t0Var.B) != null) {
                        Pair pairH = s3.h(v3Var2, t3Var, v3Var, t3Var2, t0Var.f2090v);
                        v3Var = (v3) pairH.first;
                        t3Var2 = (t3) pairH.second;
                    }
                    t0Var.A = null;
                    t0Var.B = null;
                    if (!t0Var.f2078j.isEmpty()) {
                        t0Var.A = v3Var;
                        t0Var.B = t3Var2;
                    } else {
                        v3 v3Var3 = t0Var.f2082n;
                        v3 v3Var4 = (v3) s3.h(v3Var3, t3.f2102c, v3Var, t3Var2, t0Var.f2090v).first;
                        t0Var.f2082n = v3Var4;
                        Integer numValueOf = (v3Var3.f2137d.equals(v3Var.f2137d) && v3Var3.f2138e.equals(v3Var.f2138e)) ? null : Integer.valueOf(v3Var4.f2139f);
                        m4.i0 i0VarK = v3Var3.k();
                        m4.i0 i0VarK2 = v3Var4.k();
                        int i11 = p4.c0.f16548a;
                        Integer numValueOf2 = !Objects.equals(i0VarK, i0VarK2) ? Integer.valueOf(v3Var4.f2135b) : null;
                        Integer numValueOf3 = !v3Var3.f2143j.equals(v3Var4.f2143j) ? Integer.valueOf(v3Var4.f2144k) : null;
                        int i12 = v3Var3.f2154u;
                        int i13 = v3Var4.f2154u;
                        t0Var.l(v3Var3, v3Var4, numValueOf3, (i12 == i13 && v3Var3.f2153t == v3Var4.f2153t) ? null : Integer.valueOf(i13), numValueOf, numValueOf2);
                    }
                    break;
                }
                break;
            default:
                f4 f4Var = (f4) obj2;
                m4.u0 u0Var = (m4.u0) obj;
                d0 d0Var = t0Var.f2069a;
                if (t0Var.T()) {
                    m4.u0 u0Var2 = t0Var.f2088t;
                    int i14 = p4.c0.f16548a;
                    boolean zEquals = Objects.equals(u0Var2, u0Var);
                    boolean zEquals2 = Objects.equals(t0Var.f2087s, f4Var);
                    if (!zEquals || !zEquals2) {
                        t0Var.f2087s = f4Var;
                        char c3 = 1;
                        if (zEquals) {
                            z10 = false;
                        } else {
                            t0Var.f2088t = u0Var;
                            m4.u0 u0Var3 = t0Var.f2090v;
                            m4.u0 u0VarB = t0.b(u0Var, t0Var.f2089u);
                            t0Var.f2090v = u0VarB;
                            z10 = !u0VarB.equals(u0Var3);
                        }
                        if (!zEquals2 || z10) {
                            ya.a1 a1Var = t0Var.f2085q;
                            ya.a1 a1Var2 = t0Var.f2086r;
                            ya.a1 a1VarN = t0.n(t0Var.f2084p, t0Var.f2083o, f4Var, t0Var.f2090v, t0Var.C);
                            t0Var.f2085q = a1VarN;
                            t0Var.f2086r = t0.m(a1VarN, t0Var.f2083o, t0Var.C, f4Var, t0Var.f2090v);
                            z11 = !t0Var.f2085q.equals(a1Var);
                            z12 = !t0Var.f2086r.equals(a1Var2);
                        } else {
                            z11 = false;
                            z12 = false;
                        }
                        if (z10) {
                            t0Var.f2076h.e(13, new l0(t0Var, c3 == true ? 1 : 0));
                        }
                        if (!zEquals2) {
                            d0Var.getClass();
                            p4.c.i(Looper.myLooper() == d0Var.f1707d.getLooper());
                            d0Var.f1706c.k();
                        }
                        if (z12) {
                            d0Var.getClass();
                            p4.c.i(Looper.myLooper() == d0Var.f1707d.getLooper());
                            d0Var.f1706c.getClass();
                        }
                        if (z11) {
                            d0Var.getClass();
                            p4.c.i(Looper.myLooper() == d0Var.f1707d.getLooper());
                            d0Var.f1706c.w();
                        }
                    }
                    break;
                }
                break;
        }
    }

    @Override // b7.r0
    public void d(t tVar, int i10) {
        switch (this.f1853a) {
            case 1:
                t0 t0Var = (t0) this.f1854b;
                List list = (List) this.f1855c;
                i1 i1Var = t0Var.f2071c;
                ya.f0 f0VarP = ya.i0.p();
                for (int i11 = 0; i11 < list.size(); i11++) {
                    f0VarP.a(((m4.i0) list.get(i11)).c(true));
                }
                tVar.R(i1Var, i10, new m4.f(f0VarP.f()), true);
                break;
            case 2:
                t0 t0Var2 = (t0) this.f1854b;
                e4 e4Var = (e4) this.f1855c;
                tVar.x0(t0Var2.f2071c, i10, e4Var.b(), Bundle.EMPTY);
                break;
            default:
                tVar.n(((t0) this.f1855c).f2071c, i10, ((m4.i0) this.f1854b).c(true), true);
                break;
        }
    }

    @Override // m5.m
    public ya.a1 e(int i10, m4.j1 j1Var, int[] iArr) {
        m5.j jVar = (m5.j) this.f1854b;
        String str = (String) this.f1855c;
        ya.f0 f0VarP = ya.i0.p();
        for (int i11 = 0; i11 < j1Var.f14304a; i11++) {
            f0VarP.a(new m5.l(i10, j1Var, i11, jVar, iArr[i11], str));
        }
        return f0VarP.f();
    }

    @Override // r5.r
    public r5.n[] f(Uri uri, Map map) {
        j5.q qVar = (j5.q) this.f1854b;
        m4.q qVar2 = (m4.q) this.f1855c;
        return new r5.n[]{qVar.f10387c.k(qVar2) ? new o6.h(qVar.f10387c.h(qVar2), null) : new j5.p(qVar2)};
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0444  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0472  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x048c  */
    /* JADX WARN: Removed duplicated region for block: B:364:0x05ee  */
    /* JADX WARN: Removed duplicated region for block: B:367:0x0616  */
    /* JADX WARN: Removed duplicated region for block: B:393:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19, types: [ah.j] */
    /* JADX WARN: Type inference failed for: r2v43 */
    @Override // p4.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void g(java.lang.Object r25, m4.o r26) {
        /*
            Method dump skipped, instruction units count: 1624
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b7.i0.g(java.lang.Object, m4.o):void");
    }

    @Override // b7.p3
    public Object h(c2 c2Var, t1 t1Var, int i10) {
        switch (this.f1853a) {
            case 11:
                return c2Var.h() ? g8.a.Q(new i4(-100)) : p4.c0.b0((cb.y) ((p3) this.f1854b).h(c2Var, t1Var, i10), new w0(c2Var, t1Var, (c3) this.f1855c, 2));
            default:
                return c2Var.h() ? g8.a.Q(new i4(-100)) : p4.c0.b0((cb.y) ((p3) this.f1854b).h(c2Var, t1Var, i10), new w0(c2Var, t1Var, (o3) this.f1855c, 3));
        }
    }

    public /* synthetic */ i0(t0 t0Var, e4 e4Var) {
        this.f1853a = 2;
        Bundle bundle = Bundle.EMPTY;
        this.f1854b = t0Var;
        this.f1855c = e4Var;
    }

    public /* synthetic */ i0(t0 t0Var, m4.i0 i0Var) {
        this.f1853a = 3;
        this.f1855c = t0Var;
        this.f1854b = i0Var;
    }

    public /* synthetic */ i0(o2 o2Var, e4 e4Var, Bundle bundle) {
        this.f1853a = 7;
        this.f1854b = o2Var;
        this.f1855c = bundle;
    }
}
