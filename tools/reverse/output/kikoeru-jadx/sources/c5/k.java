package c5;

import android.net.Uri;
import android.util.SparseArray;
import b0.c1;
import g5.w;
import j5.a0;
import j5.b0;
import j5.o1;
import java.io.IOException;
import java.util.ArrayList;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import m4.n0;
import m4.o0;
import m4.p0;
import p4.c0;
import s4.f0;
import v4.b1;
import v4.e0;
import ya.a1;
import ya.g0;
import ya.i0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class k implements b0, e5.s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f3479a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e5.c f3480b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c1 f3481c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final f0 f3482d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final b5.t f3483e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final b5.q f3484f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final m3.l f3485g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ah.j f3486h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final n5.f f3487i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final IdentityHashMap f3488j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final c1 f3489k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final w f3490l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f3491m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f3492n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final w4.k f3493o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final c1 f3494p = new c1(9, this);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public a0 f3495q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f3496r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public o1 f3497s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public q[] f3498t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public q[] f3499u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f3500v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public j5.m f3501w;

    public k(c cVar, e5.c cVar2, c1 c1Var, f0 f0Var, b5.t tVar, b5.q qVar, m3.l lVar, ah.j jVar, n5.f fVar, w wVar, boolean z10, int i10, w4.k kVar) {
        this.f3479a = cVar;
        this.f3480b = cVar2;
        this.f3481c = c1Var;
        this.f3482d = f0Var;
        this.f3483e = tVar;
        this.f3484f = qVar;
        this.f3485g = lVar;
        this.f3486h = jVar;
        this.f3487i = fVar;
        this.f3490l = wVar;
        this.f3491m = z10;
        this.f3492n = i10;
        this.f3493o = kVar;
        wVar.getClass();
        g0 g0Var = i0.f25998b;
        a1 a1Var = a1.f25946e;
        this.f3501w = new j5.m(a1Var, a1Var);
        this.f3488j = new IdentityHashMap();
        this.f3489k = new c1(10);
        this.f3498t = new q[0];
        this.f3499u = new q[0];
    }

    public static m4.q j(m4.q qVar, m4.q qVar2, boolean z10) {
        n0 n0Var;
        int i10;
        String str;
        String str2;
        i0 i0Var;
        String str3;
        int i11;
        int i12;
        g0 g0Var = i0.f25998b;
        a1 a1Var = a1.f25946e;
        if (qVar2 != null) {
            str2 = qVar2.f14541k;
            n0Var = qVar2.f14542l;
            i11 = qVar2.D;
            i10 = qVar2.f14535e;
            i12 = qVar2.f14536f;
            str = qVar2.f14534d;
            str3 = qVar2.f14532b;
            i0Var = qVar2.f14533c;
        } else {
            String strU = c0.u(1, qVar.f14541k);
            n0Var = qVar.f14542l;
            if (z10) {
                i11 = qVar.D;
                i10 = qVar.f14535e;
                i12 = qVar.f14536f;
                str = qVar.f14534d;
                str3 = qVar.f14532b;
                str2 = strU;
                i0Var = qVar.f14533c;
            } else {
                i10 = 0;
                str = null;
                str2 = strU;
                i0Var = a1Var;
                str3 = null;
                i11 = -1;
                i12 = 0;
            }
        }
        String strE = o0.e(str2);
        int i13 = z10 ? qVar.f14538h : -1;
        int i14 = z10 ? qVar.f14539i : -1;
        m4.p pVar = new m4.p();
        pVar.f14476a = qVar.f14531a;
        pVar.f14477b = str3;
        pVar.f14478c = i0.q(i0Var);
        pVar.f14487l = o0.p(qVar.f14543m);
        pVar.f14488m = o0.p(strE);
        pVar.f14485j = str2;
        pVar.f14486k = n0Var;
        pVar.f14483h = i13;
        pVar.f14484i = i14;
        pVar.C = i11;
        pVar.f14480e = i10;
        pVar.f14481f = i12;
        pVar.f14479d = str;
        return new m4.q(pVar);
    }

    @Override // e5.s
    public final void a() {
        for (q qVar : this.f3498t) {
            n5.o oVar = qVar.f3535j;
            ArrayList arrayList = qVar.f3539n;
            if (!arrayList.isEmpty()) {
                j jVar = (j) ya.q.k(arrayList);
                int iB = qVar.f3529d.b(jVar);
                if (iB == 1) {
                    jVar.K = true;
                } else if (iB == 0) {
                    qVar.f3543r.post(new b5.h(11, qVar, jVar));
                } else if (iB == 2 && !qVar.T && oVar.d()) {
                    oVar.a();
                }
            }
        }
        this.f3495q.c(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0056 A[SYNTHETIC] */
    @Override // e5.s
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean b(android.net.Uri r18, b7.m r19, boolean r20) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            c5.q[] r2 = r0.f3498t
            int r3 = r2.length
            r6 = 0
            r7 = 1
        L9:
            if (r6 >= r3) goto La1
            r8 = r2[r6]
            c5.i r9 = r8.f3529d
            android.net.Uri[] r10 = r9.f3448e
            boolean r11 = p4.c0.l(r1, r10)
            if (r11 != 0) goto L1e
            r8 = r19
            r4 = 1
            r16 = 1
            goto L9c
        L1e:
            r11 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r20 != 0) goto L40
            m3.l r8 = r8.f3534i
            m5.r r13 = r9.f3460q
            eg.g r13 = lc.b.q(r13)
            r8.getClass()
            r8 = r19
            b7.q0 r13 = m3.l.t(r13, r8)
            if (r13 == 0) goto L42
            int r14 = r13.f2038b
            r15 = 2
            if (r14 != r15) goto L42
            long r13 = r13.f2037a
            goto L43
        L40:
            r8 = r19
        L42:
            r13 = r11
        L43:
            r15 = 0
            r16 = 1
        L46:
            int r4 = r10.length
            r5 = -1
            if (r15 >= r4) goto L56
            r4 = r10[r15]
            boolean r4 = r4.equals(r1)
            if (r4 == 0) goto L53
            goto L57
        L53:
            int r15 = r15 + 1
            goto L46
        L56:
            r15 = -1
        L57:
            if (r15 != r5) goto L5b
        L59:
            r4 = 1
            goto L93
        L5b:
            m5.r r4 = r9.f3460q
            int r4 = r4.u(r15)
            if (r4 != r5) goto L64
            goto L59
        L64:
            boolean r5 = r9.f3462s
            android.net.Uri r10 = r9.f3458o
            boolean r10 = r1.equals(r10)
            r5 = r5 | r10
            r9.f3462s = r5
            int r5 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r5 == 0) goto L59
            m5.r r5 = r9.f3460q
            boolean r4 = r5.o(r4, r13)
            if (r4 == 0) goto L92
            e5.c r4 = r9.f3450g
            java.util.HashMap r4 = r4.f6159d
            java.lang.Object r4 = r4.get(r1)
            e5.b r4 = (e5.b) r4
            if (r4 == 0) goto L8e
            boolean r4 = e5.b.a(r4, r13)
            r4 = r4 ^ 1
            goto L8f
        L8e:
            r4 = 0
        L8f:
            if (r4 == 0) goto L92
            goto L59
        L92:
            r4 = 0
        L93:
            if (r4 == 0) goto L9b
            int r4 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r4 == 0) goto L9b
            r4 = 1
            goto L9c
        L9b:
            r4 = 0
        L9c:
            r7 = r7 & r4
            int r6 = r6 + 1
            goto L9
        La1:
            j5.a0 r1 = r0.f3495q
            r1.c(r0)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: c5.k.b(android.net.Uri, b7.m, boolean):boolean");
    }

    public final q c(String str, int i10, Uri[] uriArr, m4.q[] qVarArr, m4.q qVar, List list, Map map, long j10) {
        return new q(str, i10, this.f3494p, new i(this.f3479a, this.f3480b, uriArr, qVarArr, this.f3481c, this.f3482d, this.f3489k, list, this.f3493o), map, this.f3487i, j10, qVar, this.f3483e, this.f3484f, this.f3485g, this.f3486h, this.f3492n);
    }

    @Override // j5.e1
    public final long d() {
        return this.f3501w.d();
    }

    @Override // j5.e1
    public final boolean e(v4.f0 f0Var) {
        if (this.f3497s != null) {
            return this.f3501w.e(f0Var);
        }
        for (q qVar : this.f3498t) {
            if (!qVar.D) {
                e0 e0Var = new e0();
                e0Var.f22467a = qVar.P;
                qVar.e(new v4.f0(e0Var));
            }
        }
        return false;
    }

    @Override // j5.b0
    public final void f() throws IOException {
        for (q qVar : this.f3498t) {
            qVar.F();
            if (qVar.T && !qVar.D) {
                throw p0.a(null, "Loading finished before preparation is complete.");
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00f5 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x023f  */
    @Override // j5.b0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(j5.a0 r26, long r27) {
        /*
            Method dump skipped, instruction units count: 1004
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c5.k.g(j5.a0, long):void");
    }

    @Override // j5.b0
    public final long h(long j10) {
        q[] qVarArr = this.f3499u;
        if (qVarArr.length > 0) {
            boolean zI = qVarArr[0].I(j10, false);
            int i10 = 1;
            while (true) {
                q[] qVarArr2 = this.f3499u;
                if (i10 >= qVarArr2.length) {
                    break;
                }
                qVarArr2[i10].I(j10, zI);
                i10++;
            }
            if (zI) {
                ((SparseArray) this.f3489k.f1208b).clear();
            }
        }
        return j10;
    }

    @Override // j5.b0
    public final void i(long j10) throws Throwable {
        for (q qVar : this.f3499u) {
            if (qVar.C && !qVar.D()) {
                int length = qVar.f3547v.length;
                for (int i10 = 0; i10 < length; i10++) {
                    qVar.f3547v[i10].j(j10, qVar.N[i10]);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:117:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0191  */
    @Override // j5.b0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long l(m5.r[] r40, boolean[] r41, j5.c1[] r42, boolean[] r43, long r44) {
        /*
            Method dump skipped, instruction units count: 849
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c5.k.l(m5.r[], boolean[], j5.c1[], boolean[], long):long");
    }

    @Override // j5.e1
    public final boolean m() {
        return this.f3501w.m();
    }

    @Override // j5.b0
    public final long o(long j10, b1 b1Var) {
        q[] qVarArr = this.f3499u;
        int length = qVarArr.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                break;
            }
            q qVar = qVarArr[i10];
            if (qVar.A == 2) {
                i iVar = qVar.f3529d;
                e5.c cVar = iVar.f3450g;
                int iC = iVar.f3460q.c();
                Uri[] uriArr = iVar.f3448e;
                e5.k kVarA = (iC >= uriArr.length || iC == -1) ? null : cVar.a(true, uriArr[iVar.f3460q.l()]);
                if (kVarA != null) {
                    i0 i0Var = kVarA.f6225r;
                    if (!i0Var.isEmpty() && kVarA.f6251c) {
                        long j11 = kVarA.f6215h - cVar.f6169n;
                        long j12 = j10 - j11;
                        int iC2 = c0.c(i0Var, Long.valueOf(j12), true);
                        long j13 = ((e5.h) i0Var.get(iC2)).f6199e;
                        return b1Var.a(j12, j13, iC2 != i0Var.size() - 1 ? ((e5.h) i0Var.get(iC2 + 1)).f6199e : j13) + j11;
                    }
                }
            } else {
                i10++;
            }
        }
        return j10;
    }

    @Override // j5.b0
    public final long p() {
        return -9223372036854775807L;
    }

    @Override // j5.b0
    public final o1 q() {
        o1 o1Var = this.f3497s;
        o1Var.getClass();
        return o1Var;
    }

    @Override // j5.e1
    public final long t() {
        return this.f3501w.t();
    }

    @Override // j5.e1
    public final void w(long j10) {
        this.f3501w.w(j10);
    }
}
