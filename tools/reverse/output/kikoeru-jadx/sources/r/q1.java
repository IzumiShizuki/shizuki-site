package r;

import x0.g2;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class q1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final androidx.lifecycle.q f18539a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q1 f18540b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f18541c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final x0.e1 f18542d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final x0.e1 f18543e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final x0.c1 f18544f = new x0.c1(0);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final x0.c1 f18545g = new x0.c1(Long.MIN_VALUE);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final x0.e1 f18546h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final h1.s f18547i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final h1.s f18548j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final x0.e1 f18549k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final x0.c0 f18550l;

    public q1(androidx.lifecycle.q qVar, q1 q1Var, String str) {
        this.f18539a = qVar;
        this.f18540b = q1Var;
        this.f18541c = str;
        this.f18542d = x0.v.v(qVar.b1());
        this.f18543e = x0.v.v(new l1(qVar.b1(), qVar.b1()));
        Boolean bool = Boolean.FALSE;
        this.f18546h = x0.v.v(bool);
        this.f18547i = new h1.s();
        this.f18548j = new h1.s();
        this.f18549k = x0.v.v(bool);
        this.f18550l = x0.v.o(new q.p(this, 1));
        qVar.z1(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x008f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(int r11, java.lang.Object r12, x0.o r13) {
        /*
            Method dump skipped, instruction units count: 235
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: r.q1.a(int, java.lang.Object, x0.o):void");
    }

    public final long b() {
        h1.s sVar = this.f18547i;
        int size = sVar.size();
        long jMax = 0;
        for (int i10 = 0; i10 < size; i10++) {
            x0.c1 c1Var = ((m1) sVar.get(i10)).f18493l;
            jMax = Math.max(jMax, ((g2) h1.n.u(c1Var.f24260b, c1Var)).f24312c);
        }
        h1.s sVar2 = this.f18548j;
        int size2 = sVar2.size();
        for (int i11 = 0; i11 < size2; i11++) {
            jMax = Math.max(jMax, ((q1) sVar2.get(i11)).b());
        }
        return jMax;
    }

    public final void c() {
        h1.s sVar = this.f18547i;
        int size = sVar.size();
        for (int i10 = 0; i10 < size; i10++) {
            m1 m1Var = (m1) sVar.get(i10);
            m1Var.f18487f = null;
            m1Var.f18486e = null;
            m1Var.f18490i = false;
        }
        h1.s sVar2 = this.f18548j;
        int size2 = sVar2.size();
        for (int i11 = 0; i11 < size2; i11++) {
            ((q1) sVar2.get(i11)).c();
        }
    }

    public final boolean d() {
        h1.s sVar = this.f18547i;
        int size = sVar.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (((m1) sVar.get(i10)).f18486e != null) {
                return true;
            }
        }
        h1.s sVar2 = this.f18548j;
        int size2 = sVar2.size();
        for (int i11 = 0; i11 < size2; i11++) {
            if (((q1) sVar2.get(i11)).d()) {
                return true;
            }
        }
        return false;
    }

    public final long e() {
        q1 q1Var = this.f18540b;
        if (q1Var != null) {
            return q1Var.e();
        }
        x0.c1 c1Var = this.f18544f;
        return ((g2) h1.n.u(c1Var.f24260b, c1Var)).f24312c;
    }

    public final k1 f() {
        return (k1) this.f18543e.getValue();
    }

    public final boolean g() {
        return ((Boolean) this.f18549k.getValue()).booleanValue();
    }

    public final void h(long j10, boolean z10) {
        x0.c1 c1Var = this.f18545g;
        long j11 = ((g2) h1.n.u(c1Var.f24260b, c1Var)).f24312c;
        androidx.lifecycle.q qVar = this.f18539a;
        if (j11 == Long.MIN_VALUE) {
            c1Var.e(j10);
            ((x0.e1) qVar.f801a).setValue(Boolean.TRUE);
        } else if (!((Boolean) ((x0.e1) qVar.f801a).getValue()).booleanValue()) {
            ((x0.e1) qVar.f801a).setValue(Boolean.TRUE);
        }
        this.f18546h.setValue(Boolean.FALSE);
        h1.s sVar = this.f18547i;
        int size = sVar.size();
        boolean z11 = true;
        for (int i10 = 0; i10 < size; i10++) {
            m1 m1Var = (m1) sVar.get(i10);
            x0.e1 e1Var = m1Var.f18488g;
            x0.e1 e1Var2 = m1Var.f18488g;
            if (!((Boolean) e1Var.getValue()).booleanValue()) {
                long jB = z10 ? m1Var.a().b() : j10;
                m1Var.e(m1Var.a().f(jB));
                m1Var.f18492k = m1Var.a().d(jB);
                h1 h1VarA = m1Var.a();
                h1VarA.getClass();
                if (q.t0.a(h1VarA, jB)) {
                    e1Var2.setValue(Boolean.TRUE);
                }
            }
            if (!((Boolean) e1Var2.getValue()).booleanValue()) {
                z11 = false;
            }
        }
        h1.s sVar2 = this.f18548j;
        int size2 = sVar2.size();
        for (int i11 = 0; i11 < size2; i11++) {
            q1 q1Var = (q1) sVar2.get(i11);
            x0.e1 e1Var3 = q1Var.f18542d;
            androidx.lifecycle.q qVar2 = q1Var.f18539a;
            if (!jc.l.a(e1Var3.getValue(), qVar2.b1())) {
                q1Var.h(j10, z10);
            }
            if (!jc.l.a(q1Var.f18542d.getValue(), qVar2.b1())) {
                z11 = false;
            }
        }
        if (z11) {
            i();
        }
    }

    public final void i() {
        this.f18545g.e(Long.MIN_VALUE);
        androidx.lifecycle.q qVar = this.f18539a;
        if (qVar instanceof i0) {
            qVar.x1(this.f18542d.getValue());
        }
        n(0L);
        ((x0.e1) qVar.f801a).setValue(Boolean.FALSE);
        h1.s sVar = this.f18548j;
        int size = sVar.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((q1) sVar.get(i10)).i();
        }
    }

    public final void j(float f10) {
        h1.s sVar = this.f18547i;
        int size = sVar.size();
        for (int i10 = 0; i10 < size; i10++) {
            m1 m1Var = (m1) sVar.get(i10);
            m1Var.getClass();
            if (f10 == -4.0f || f10 == -5.0f) {
                h1 h1Var = m1Var.f18487f;
                if (h1Var != null) {
                    m1Var.a().h(h1Var.f18440c);
                    m1Var.f18486e = null;
                    m1Var.f18487f = null;
                }
                Object obj = f10 == -4.0f ? m1Var.a().f18441d : m1Var.a().f18440c;
                m1Var.a().h(obj);
                m1Var.a().i(obj);
                m1Var.e(obj);
                m1Var.f18493l.e(m1Var.a().b());
            } else {
                m1Var.f18489h.f(f10);
            }
        }
        h1.s sVar2 = this.f18548j;
        int size2 = sVar2.size();
        for (int i11 = 0; i11 < size2; i11++) {
            ((q1) sVar2.get(i11)).j(f10);
        }
    }

    public final void k(Object obj, Object obj2) {
        this.f18545g.e(Long.MIN_VALUE);
        androidx.lifecycle.q qVar = this.f18539a;
        ((x0.e1) qVar.f801a).setValue(Boolean.FALSE);
        boolean zG = g();
        x0.e1 e1Var = this.f18542d;
        if (!zG || !jc.l.a(qVar.b1(), obj) || !jc.l.a(e1Var.getValue(), obj2)) {
            if (!jc.l.a(qVar.b1(), obj) && (qVar instanceof i0)) {
                qVar.x1(obj);
            }
            e1Var.setValue(obj2);
            this.f18549k.setValue(Boolean.TRUE);
            this.f18543e.setValue(new l1(obj, obj2));
        }
        h1.s sVar = this.f18548j;
        int size = sVar.size();
        for (int i10 = 0; i10 < size; i10++) {
            q1 q1Var = (q1) sVar.get(i10);
            jc.l.c(q1Var, "null cannot be cast to non-null type androidx.compose.animation.core.Transition<kotlin.Any>");
            if (q1Var.g()) {
                q1Var.k(q1Var.f18539a.b1(), q1Var.f18542d.getValue());
            }
        }
        h1.s sVar2 = this.f18547i;
        int size2 = sVar2.size();
        for (int i11 = 0; i11 < size2; i11++) {
            ((m1) sVar2.get(i11)).d(0L);
        }
    }

    public final void l(long j10) {
        x0.c1 c1Var = this.f18545g;
        if (((g2) h1.n.u(c1Var.f24260b, c1Var)).f24312c == Long.MIN_VALUE) {
            c1Var.e(j10);
        }
        n(j10);
        this.f18546h.setValue(Boolean.FALSE);
        h1.s sVar = this.f18547i;
        int size = sVar.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((m1) sVar.get(i10)).d(j10);
        }
        h1.s sVar2 = this.f18548j;
        int size2 = sVar2.size();
        for (int i11 = 0; i11 < size2; i11++) {
            q1 q1Var = (q1) sVar2.get(i11);
            if (!jc.l.a(q1Var.f18542d.getValue(), q1Var.f18539a.b1())) {
                q1Var.l(j10);
            }
        }
    }

    public final void m(p0 p0Var) {
        h1.s sVar = this.f18547i;
        int size = sVar.size();
        for (int i10 = 0; i10 < size; i10++) {
            m1 m1Var = (m1) sVar.get(i10);
            x0.e1 e1Var = m1Var.f18491j;
            if (!jc.l.a(m1Var.a().f18440c, m1Var.a().f18441d)) {
                m1Var.f18487f = m1Var.a();
                m1Var.f18486e = p0Var;
            }
            m1Var.f18485d.setValue(new h1(m1Var.f18495n, m1Var.f18482a, e1Var.getValue(), e1Var.getValue(), m1Var.f18492k.c()));
            m1Var.f18493l.e(m1Var.a().b());
            m1Var.f18490i = true;
        }
        h1.s sVar2 = this.f18548j;
        int size2 = sVar2.size();
        for (int i11 = 0; i11 < size2; i11++) {
            ((q1) sVar2.get(i11)).m(p0Var);
        }
    }

    public final void n(long j10) {
        if (this.f18540b == null) {
            this.f18544f.e(j10);
        }
    }

    public final void o() {
        h1 h1Var;
        h1.s sVar = this.f18547i;
        int size = sVar.size();
        for (int i10 = 0; i10 < size; i10++) {
            m1 m1Var = (m1) sVar.get(i10);
            p0 p0Var = m1Var.f18486e;
            if (p0Var != null && (h1Var = m1Var.f18487f) != null) {
                long jS = lc.b.S(p0Var.f18514g * ((double) p0Var.f18511d));
                Object objF = h1Var.f(jS);
                if (m1Var.f18490i) {
                    m1Var.a().i(objF);
                }
                m1Var.a().h(objF);
                m1Var.f18493l.e(m1Var.a().b());
                if (m1Var.f18489h.e() == -2.0f || m1Var.f18490i) {
                    m1Var.e(objF);
                } else {
                    m1Var.d(m1Var.f18496o.e());
                }
                if (jS >= p0Var.f18514g) {
                    m1Var.f18486e = null;
                    m1Var.f18487f = null;
                } else {
                    p0Var.f18510c = false;
                }
            }
        }
        h1.s sVar2 = this.f18548j;
        int size2 = sVar2.size();
        for (int i11 = 0; i11 < size2; i11++) {
            ((q1) sVar2.get(i11)).o();
        }
    }

    public final void p(Object obj) {
        x0.e1 e1Var = this.f18542d;
        if (jc.l.a(e1Var.getValue(), obj)) {
            return;
        }
        this.f18543e.setValue(new l1(e1Var.getValue(), obj));
        androidx.lifecycle.q qVar = this.f18539a;
        if (!jc.l.a(qVar.b1(), e1Var.getValue())) {
            qVar.x1(e1Var.getValue());
        }
        e1Var.setValue(obj);
        x0.c1 c1Var = this.f18545g;
        if (((g2) h1.n.u(c1Var.f24260b, c1Var)).f24312c == Long.MIN_VALUE) {
            this.f18546h.setValue(Boolean.TRUE);
        }
        h1.s sVar = this.f18547i;
        int size = sVar.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((m1) sVar.get(i10)).f18489h.f(-2.0f);
        }
    }

    public final String toString() {
        h1.s sVar = this.f18547i;
        int size = sVar.size();
        String str = "Transition animation values: ";
        for (int i10 = 0; i10 < size; i10++) {
            str = str + ((m1) sVar.get(i10)) + ", ";
        }
        return str;
    }
}
