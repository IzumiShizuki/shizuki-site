package z9;

import androidx.lifecycle.m0;
import androidx.lifecycle.s0;
import hf.a0;
import hf.z;
import i7.y1;
import java.util.Arrays;
import lf.b1;
import lf.k0;
import lf.p0;
import lf.y0;
import x0.e1;
import x0.v;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class r extends s0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e1 f26654b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e1 f26655c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e1 f26656d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final e1 f26657e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final e1 f26658f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e1 f26659g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e1 f26660h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final e1 f26661i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f26662j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final e1 f26663k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final k0 f26664l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e1 f26665m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e1 f26666n;

    public r() {
        Boolean bool = Boolean.FALSE;
        this.f26654b = v.v(bool);
        this.f26655c = v.v(bool);
        this.f26656d = v.v(bool);
        this.f26657e = v.v(new p1.b(0L));
        this.f26658f = v.v(null);
        this.f26659g = v.v(bool);
        this.f26660h = v.v(ef.a.f6541a.name());
        this.f26661i = v.v(new byte[0]);
        this.f26663k = v.v(bool);
        n7.v vVar = a9.i.c().u().f5598a;
        y1 y1Var = new y1(p0.g(vVar.f().a((String[]) Arrays.copyOf(new String[]{"LyricBean"}, 1), true), -1), vVar, new d9.i(6), 2);
        k4.a aVarH = m0.h(this);
        y0 y0Var = new y0(1000L);
        k9.c cVarI = p0.i(y1Var);
        vb.r rVar = vb.r.f22819a;
        b1 b1VarC = p0.c(rVar);
        a0.x(aVarH, (yb.h) cVarI.f11236e, y0Var.equals(lf.s0.f12491a) ? z.f8616a : z.f8619d, new e.j(y0Var, (lf.f) cVarI.f11235d, b1VarC, rVar, (yb.c) null));
        this.f26664l = new k0(b1VarC);
        this.f26665m = v.v(rVar);
        this.f26666n = v.v(0L);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A(ac.c r12) {
        /*
            r11 = this;
            boolean r0 = r12 instanceof z9.q
            if (r0 == 0) goto L13
            r0 = r12
            z9.q r0 = (z9.q) r0
            int r1 = r0.f26653f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f26653f = r1
            goto L18
        L13:
            z9.q r0 = new z9.q
            r0.<init>(r11, r12)
        L18:
            java.lang.Object r12 = r0.f26651d
            int r1 = r0.f26653f
            ub.a0 r2 = ub.a0.f21526a
            r3 = 3
            r4 = 2
            r5 = 1
            zb.a r6 = zb.a.f26667a
            if (r1 == 0) goto L3b
            if (r1 == r5) goto L37
            if (r1 == r4) goto L37
            if (r1 != r3) goto L2f
            ub.a.f(r12)
            return r2
        L2f:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L37:
            ub.a.f(r12)
            goto La3
        L3b:
            ub.a.f(r12)
            x0.e1 r12 = r11.f26658f
            java.lang.Object r12 = r12.getValue()
            c9.f r12 = (c9.f) r12
            if (r12 != 0) goto L49
            goto Lb0
        L49:
            boolean r1 = r11.f26662j
            r7 = 0
            r8 = 0
            x0.e1 r9 = r11.f26660h
            if (r1 == 0) goto L7a
            com.cnl.kikoeru.data.db.AppDatabase r1 = a9.i.c()
            d9.s r1 = r1.u()
            java.lang.Object r4 = r9.getValue()
            java.lang.String r4 = (java.lang.String) r4
            r9 = 1007(0x3ef, float:1.411E-42)
            c9.f r12 = c9.f.a(r12, r4, r8, r9)
            r0.f26653f = r5
            n7.v r4 = r1.f5598a
            d9.r r8 = new d9.r
            r9 = 1
            r8.<init>(r1, r12, r9)
            java.lang.Object r12 = ua.l.X(r4, r7, r5, r8, r0)
            if (r12 != r6) goto L76
            goto L77
        L76:
            r12 = r2
        L77:
            if (r12 != r6) goto La3
            goto Laf
        L7a:
            com.cnl.kikoeru.data.db.AppDatabase r1 = a9.i.c()
            d9.s r1 = r1.u()
            java.lang.Object r9 = r9.getValue()
            java.lang.String r9 = (java.lang.String) r9
            r10 = 959(0x3bf, float:1.344E-42)
            c9.f r12 = c9.f.a(r12, r8, r9, r10)
            r0.f26653f = r4
            n7.v r4 = r1.f5598a
            d9.r r8 = new d9.r
            r9 = 1
            r8.<init>(r1, r12, r9)
            java.lang.Object r12 = ua.l.X(r4, r7, r5, r8, r0)
            if (r12 != r6) goto L9f
            goto La0
        L9f:
            r12 = r2
        La0:
            if (r12 != r6) goto La3
            goto Laf
        La3:
            long r4 = r11.x()
            r0.f26653f = r3
            java.lang.Object r12 = r11.z(r4, r0)
            if (r12 != r6) goto Lb0
        Laf:
            return r6
        Lb0:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: z9.r.A(ac.c):java.lang.Object");
    }

    public final void G(boolean z10) {
        this.f26659g.setValue(Boolean.valueOf(z10));
    }

    public final void H(boolean z10) {
        this.f26656d.setValue(Boolean.valueOf(z10));
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x006e, code lost:
    
        if (z(r7, r0) == r6) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object w(ac.c r11) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof z9.n
            if (r0 == 0) goto L13
            r0 = r11
            z9.n r0 = (z9.n) r0
            int r1 = r0.f26646f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f26646f = r1
            goto L18
        L13:
            z9.n r0 = new z9.n
            r0.<init>(r10, r11)
        L18:
            java.lang.Object r11 = r0.f26644d
            int r1 = r0.f26646f
            x0.e1 r2 = r10.f26658f
            r3 = 2
            ub.a0 r4 = ub.a0.f21526a
            r5 = 1
            zb.a r6 = zb.a.f26667a
            if (r1 == 0) goto L3a
            if (r1 == r5) goto L36
            if (r1 != r3) goto L2e
            ub.a.f(r11)
            goto L71
        L2e:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L36:
            ub.a.f(r11)
            goto L64
        L3a:
            ub.a.f(r11)
            java.lang.Object r11 = r2.getValue()
            c9.f r11 = (c9.f) r11
            if (r11 != 0) goto L46
            return r4
        L46:
            com.cnl.kikoeru.data.db.AppDatabase r1 = a9.i.c()
            d9.s r1 = r1.u()
            r0.f26646f = r5
            n7.v r7 = r1.f5598a
            d9.r r8 = new d9.r
            r9 = 0
            r8.<init>(r1, r11, r9)
            r11 = 0
            java.lang.Object r11 = ua.l.X(r7, r11, r5, r8, r0)
            if (r11 != r6) goto L60
            goto L61
        L60:
            r11 = r4
        L61:
            if (r11 != r6) goto L64
            goto L70
        L64:
            long r7 = r10.x()
            r0.f26646f = r3
            java.lang.Object r11 = r10.z(r7, r0)
            if (r11 != r6) goto L71
        L70:
            return r6
        L71:
            r11 = 0
            r2.setValue(r11)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: z9.r.w(ac.c):java.lang.Object");
    }

    public final long x() {
        return ((Number) this.f26666n.getValue()).longValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object z(long r5, ac.c r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof z9.p
            if (r0 == 0) goto L13
            r0 = r7
            z9.p r0 = (z9.p) r0
            int r1 = r0.f26650g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f26650g = r1
            goto L18
        L13:
            z9.p r0 = new z9.p
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.f26648e
            int r1 = r0.f26650g
            r2 = 1
            if (r1 == 0) goto L2f
            if (r1 != r2) goto L27
            z9.r r5 = r0.f26647d
            ub.a.f(r7)
            goto L54
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            ub.a.f(r7)
            x0.e1 r7 = r4.f26666n
            java.lang.Long r1 = java.lang.Long.valueOf(r5)
            r7.setValue(r1)
            com.cnl.kikoeru.data.db.AppDatabase r7 = a9.i.c()
            d9.s r7 = r7.u()
            r0.f26647d = r4
            r0.f26650g = r2
            r7.getClass()
            java.lang.Object r7 = a0.c.z(r7, r5, r0)
            zb.a r5 = zb.a.f26667a
            if (r7 != r5) goto L53
            return r5
        L53:
            r5 = r4
        L54:
            java.util.List r7 = (java.util.List) r7
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            z9.o r6 = new z9.o
            r6.<init>()
            j9.l r0 = new j9.l
            r1 = 2
            r0.<init>(r1, r6)
            java.util.List r6 = vb.m.C0(r7, r0)
            r5.getClass()
            x0.e1 r5 = r5.f26665m
            r5.setValue(r6)
            ub.a0 r5 = ub.a0.f21526a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: z9.r.z(long, ac.c):java.lang.Object");
    }
}
