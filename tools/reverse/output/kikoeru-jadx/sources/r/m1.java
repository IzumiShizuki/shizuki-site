package r;

import x0.g2;
import x0.n2;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class m1 implements n2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v1 f18482a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x0.e1 f18483b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x0.e1 f18484c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final x0.e1 f18485d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public p0 f18486e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public h1 f18487f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final x0.e1 f18488g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final x0.a1 f18489h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f18490i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final x0.e1 f18491j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public p f18492k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final x0.c1 f18493l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f18494m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final z0 f18495n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ q1 f18496o;

    /* JADX WARN: Type inference failed for: r9v9, types: [java.lang.Object, java.util.Map] */
    public m1(q1 q1Var, Object obj, p pVar, v1 v1Var) {
        this.f18496o = q1Var;
        this.f18482a = v1Var;
        x0.e1 e1VarV = x0.v.v(obj);
        this.f18483b = e1VarV;
        Object objA = null;
        this.f18484c = x0.v.v(d.q(7, null));
        this.f18485d = x0.v.v(new h1(c(), v1Var, obj, e1VarV.getValue(), pVar));
        this.f18488g = x0.v.v(Boolean.TRUE);
        this.f18489h = new x0.a1(-1.0f);
        this.f18491j = x0.v.v(obj);
        this.f18492k = pVar;
        this.f18493l = new x0.c1(a().b());
        Float f10 = (Float) f2.f18407b.get(v1Var);
        if (f10 != null) {
            float fFloatValue = f10.floatValue();
            p pVar2 = (p) v1Var.f18596a.a(obj);
            int iB = pVar2.b();
            for (int i10 = 0; i10 < iB; i10++) {
                pVar2.e(fFloatValue, i10);
            }
            objA = this.f18482a.f18597b.a(pVar2);
        }
        this.f18495n = d.q(3, objA);
    }

    public final h1 a() {
        return (h1) this.f18485d.getValue();
    }

    public final x c() {
        return (x) this.f18484c.getValue();
    }

    public final void d(long j10) {
        if (this.f18489h.e() == -1.0f) {
            this.f18494m = true;
            if (jc.l.a(a().f18440c, a().f18441d)) {
                e(a().f18440c);
            } else {
                e(a().f(j10));
                this.f18492k = a().d(j10);
            }
        }
    }

    public final void e(Object obj) {
        this.f18491j.setValue(obj);
    }

    public final void f(Object obj, boolean z10) {
        h1 h1Var = this.f18487f;
        Object obj2 = h1Var != null ? h1Var.f18440c : null;
        x0.e1 e1Var = this.f18483b;
        boolean zA = jc.l.a(obj2, e1Var.getValue());
        x0.c1 c1Var = this.f18493l;
        x0.e1 e1Var2 = this.f18485d;
        if (zA) {
            e1Var2.setValue(new h1(this.f18495n, this.f18482a, obj, obj, this.f18492k.c()));
            this.f18490i = true;
            c1Var.e(a().b());
            return;
        }
        x xVarC = (!z10 || this.f18494m || (c() instanceof z0)) ? c() : this.f18495n;
        q1 q1Var = this.f18496o;
        long jE = q1Var.e();
        x0.e1 e1Var3 = q1Var.f18546h;
        e1Var2.setValue(new h1(jE <= 0 ? xVarC : new a1(xVarC, q1Var.e()), this.f18482a, obj, e1Var.getValue(), this.f18492k));
        c1Var.e(a().b());
        this.f18490i = false;
        e1Var3.setValue(Boolean.TRUE);
        if (q1Var.g()) {
            h1.s sVar = q1Var.f18547i;
            int size = sVar.size();
            long jMax = 0;
            for (int i10 = 0; i10 < size; i10++) {
                m1 m1Var = (m1) sVar.get(i10);
                x0.c1 c1Var2 = m1Var.f18493l;
                jMax = Math.max(jMax, ((g2) h1.n.u(c1Var2.f24260b, c1Var2)).f24312c);
                m1Var.d(0L);
            }
            e1Var3.setValue(Boolean.FALSE);
        }
    }

    public final void g(Object obj, Object obj2, x xVar) {
        this.f18483b.setValue(obj2);
        this.f18484c.setValue(xVar);
        if (jc.l.a(a().f18441d, obj) && jc.l.a(a().f18440c, obj2)) {
            return;
        }
        f(obj, false);
    }

    @Override // x0.n2
    public final Object getValue() {
        return this.f18491j.getValue();
    }

    public final void h(Object obj, x xVar) {
        if (this.f18490i) {
            h1 h1Var = this.f18487f;
            if (jc.l.a(obj, h1Var != null ? h1Var.f18440c : null)) {
                return;
            }
        }
        x0.e1 e1Var = this.f18483b;
        boolean zA = jc.l.a(e1Var.getValue(), obj);
        x0.a1 a1Var = this.f18489h;
        if (zA && a1Var.e() == -1.0f) {
            return;
        }
        e1Var.setValue(obj);
        this.f18484c.setValue(xVar);
        Object value = a1Var.e() == -3.0f ? obj : this.f18491j.getValue();
        x0.e1 e1Var2 = this.f18488g;
        f(value, !((Boolean) e1Var2.getValue()).booleanValue());
        e1Var2.setValue(Boolean.valueOf(a1Var.e() == -3.0f));
        if (a1Var.e() >= 0.0f) {
            e(a().f((long) (a1Var.e() * a().b())));
        } else if (a1Var.e() == -3.0f) {
            e(obj);
        }
        this.f18490i = false;
        a1Var.f(-1.0f);
    }

    public final String toString() {
        return "current value: " + this.f18491j.getValue() + ", target: " + this.f18483b.getValue() + ", spec: " + c();
    }
}
