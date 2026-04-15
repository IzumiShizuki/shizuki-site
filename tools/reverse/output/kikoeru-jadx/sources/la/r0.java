package la;

import com.cnl.kikoeru.R;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class r0 extends ac.i implements ic.n {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Integer f12092e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f12093f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ic.a f12094g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(Integer num, long j10, ic.a aVar, yb.c cVar) {
        super(2, cVar);
        this.f12092e = num;
        this.f12093f = j10;
        this.f12094g = aVar;
    }

    @Override // ac.a
    public final yb.c o(Object obj, yb.c cVar) {
        return new r0(this.f12092e, this.f12093f, this.f12094g, cVar);
    }

    @Override // ic.n
    public final Object q(Object obj, Object obj2) {
        r0 r0Var = (r0) o((hf.y) obj, (yb.c) obj2);
        ub.a0 a0Var = ub.a0.f21526a;
        r0Var.u(a0Var);
        return a0Var;
    }

    @Override // ac.a
    public final Object u(Object obj) {
        String strB;
        Object objB;
        ug.d0 d0VarF;
        String strN;
        ub.a.f(obj);
        ub.a0 a0Var = ub.a0.f21526a;
        Integer num = this.f12092e;
        if (num == null) {
            ka.j.d(na.q.g(R.string.id_not_found), null, null, null, null, 511);
            return a0Var;
        }
        String str = ag.z.f369a;
        String strF = a9.i.f();
        List listW = ud.b.w(num);
        jc.l.e(strF, "token");
        String strConcat = ag.z.f369a.concat("/api/vote/attach-tags-to-work");
        ag.f fVar = new ag.f(this.f12093f, listW);
        if (fVar.equals(a0Var)) {
            strB = "";
        } else {
            xf.b bVar = xf.c.f24987d;
            strB = bVar.b(n7.e.A(bVar.f24989b, jc.z.a(ag.f.class)), fVar);
        }
        ch.l lVarD = a0.c.D(strConcat);
        lVarD.w("authorization", "Bearer ".concat(strF));
        ug.z zVar = ug.b0.f21724a;
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
        xf.r rVar = ag.z.f371c;
        objB = rVar.a(strN, n7.e.A(rVar.f24989b, jc.z.a(ag.i.class)));
        d0VarF.close();
        if (!(objB instanceof ub.m)) {
            this.f12094g.b();
        }
        Throwable thA = ub.n.a(objB);
        if (thA != null) {
            thA.printStackTrace();
            ka.n.c(thA, 0L, null, null, 511);
        }
        return a0Var;
    }
}
