package h0;

import bg.a2;
import i7.y1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class e0 extends ac.i implements ic.n {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f7616e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f7617f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f7618g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f7619h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f7620i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(c2.x xVar, c1 c1Var, l0.l1 l1Var, yb.c cVar) {
        super(2, cVar);
        this.f7616e = 0;
        this.f7618g = xVar;
        this.f7619h = c1Var;
        this.f7620i = l1Var;
    }

    @Override // ac.a
    public final yb.c o(Object obj, yb.c cVar) {
        switch (this.f7616e) {
            case 0:
                e0 e0Var = new e0((c2.x) this.f7618g, (c1) this.f7619h, (l0.l1) this.f7620i, cVar);
                e0Var.f7617f = obj;
                return e0Var;
            case 1:
                return new e0((bg.e1) this.f7617f, (bg.f1) this.f7618g, (x0.w0) this.f7619h, (ic.a) this.f7620i, cVar, 1);
            default:
                return new e0((x0.w0) this.f7617f, (lf.f) this.f7618g, (x0.w0) this.f7619h, (x0.w0) this.f7620i, cVar, 2);
        }
    }

    @Override // ic.n
    public final Object q(Object obj, Object obj2) {
        switch (this.f7616e) {
            case 0:
                e0 e0Var = (e0) o((hf.y) obj, (yb.c) obj2);
                ub.a0 a0Var = ub.a0.f21526a;
                e0Var.u(a0Var);
                return a0Var;
            case 1:
                e0 e0Var2 = (e0) o((hf.y) obj, (yb.c) obj2);
                ub.a0 a0Var2 = ub.a0.f21526a;
                e0Var2.u(a0Var2);
                return a0Var2;
            default:
                e0 e0Var3 = (e0) o((String) obj, (yb.c) obj2);
                ub.a0 a0Var3 = ub.a0.f21526a;
                e0Var3.u(a0Var3);
                return a0Var3;
        }
    }

    @Override // ac.a
    public final Object u(Object obj) {
        String strB;
        Object objB;
        ug.d0 d0VarF;
        String strN;
        int i10 = this.f7616e;
        int i11 = 1;
        ub.a0 a0Var = ub.a0.f21526a;
        Object obj2 = this.f7620i;
        Object obj3 = this.f7619h;
        Object obj4 = this.f7618g;
        switch (i10) {
            case 0:
                ub.a.f(obj);
                hf.y yVar = (hf.y) this.f7617f;
                c2.x xVar = (c2.x) obj4;
                yb.c cVar = null;
                d0 d0Var = new d0(xVar, (c1) obj3, cVar, 0);
                hf.z zVar = hf.z.f8619d;
                hf.a0.y(yVar, null, zVar, d0Var, 1);
                hf.a0.y(yVar, null, zVar, new ba.u0(xVar, (l0.l1) obj2, cVar, 6), 1);
                return a0Var;
            case 1:
                ub.a.f(obj);
                bg.e1 e1Var = (bg.e1) this.f7617f;
                Integer num = e1Var.f2868b;
                if (num != null) {
                    bg.f1 f1Var = (bg.f1) obj4;
                    x0.w0 w0Var = (x0.w0) obj3;
                    ic.a aVar = (ic.a) obj2;
                    int iIntValue = num.intValue();
                    if (e1Var.f2875i == f1Var.f2885a) {
                        f1Var = bg.f1.f2881b;
                    }
                    String str = ag.z.f369a;
                    String strF = a9.i.f();
                    long j10 = ((a2) w0Var.getValue()).f2823f;
                    jc.l.e(strF, "token");
                    String strConcat = ag.z.f369a.concat("/api/vote/vote-work-tag");
                    ag.r rVar = new ag.r(iIntValue, f1Var.f2885a, j10);
                    if (rVar.equals(a0Var)) {
                        strB = "";
                    } else {
                        xf.b bVar = xf.c.f24987d;
                        strB = bVar.b(n7.e.A(bVar.f24989b, jc.z.a(ag.r.class)), rVar);
                    }
                    ch.l lVarD = a0.c.D(strConcat);
                    lVarD.w("authorization", "Bearer ".concat(strF));
                    ug.z zVar2 = ug.b0.f21724a;
                    ef.l lVar = ug.v.f21877c;
                    lVarD.z(ud.e.q(strB, vb.w.h("application/json")));
                    try {
                        d0VarF = ag.z.f370b.a(new b7.b1(lVarD)).f();
                        try {
                            ug.f0 f0Var = d0VarF.f21762g;
                            jc.l.b(f0Var);
                            strN = f0Var.n();
                        } finally {
                        }
                    } catch (Throwable th2) {
                        objB = ub.a.b(th2);
                    }
                    if (d0VarF.f21759d != 200) {
                        throw new IllegalStateException(strN.toString());
                    }
                    xf.r rVar2 = ag.z.f371c;
                    objB = rVar2.a(strN, n7.e.A(rVar2.f24989b, jc.z.a(ag.u.class)));
                    d0VarF.close();
                    if (!(objB instanceof ub.m)) {
                        aVar.b();
                    }
                    Throwable thA = ub.n.a(objB);
                    if (thA != null) {
                        thA.printStackTrace();
                        ka.n.c(thA, 0L, null, null, 511);
                    }
                }
                return a0Var;
            default:
                ub.a.f(obj);
                ((x0.w0) this.f7617f).setValue(new y1((lf.f) obj4, (x0.w0) obj3, (x0.w0) obj2, i11));
                return a0Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e0(Object obj, Object obj2, x0.w0 w0Var, Object obj3, yb.c cVar, int i10) {
        super(2, cVar);
        this.f7616e = i10;
        this.f7617f = obj;
        this.f7618g = obj2;
        this.f7619h = w0Var;
        this.f7620i = obj3;
    }
}
