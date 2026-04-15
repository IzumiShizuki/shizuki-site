package sc;

import java.lang.reflect.Array;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class v1 extends a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ pc.u[] f19891f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final se.w f19892a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f19893b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z1 f19894c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final z1 f19895d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final z1 f19896e;

    static {
        jc.s sVar = new jc.s(v1.class, "classifier", "getClassifier()Lkotlin/reflect/KClassifier;", 0);
        jc.a0 a0Var = jc.z.f10839a;
        f19891f = new pc.u[]{a0Var.g(sVar), q.t0.H(v1.class, "arguments", "getArguments()Ljava/util/List;", 0, a0Var)};
    }

    public v1(se.w wVar, ic.a aVar, boolean z10) {
        jc.l.e(wVar, "type");
        this.f19892a = wVar;
        this.f19893b = z10;
        z1 z1Var = aVar instanceof z1 ? (z1) aVar : null;
        this.f19894c = z1Var == null ? aVar != null ? nd.h.r(null, aVar) : null : z1Var;
        this.f19895d = nd.h.r(null, new u1(this, 0));
        this.f19896e = nd.h.r(null, new bd.i(14, this, aVar, false));
    }

    @Override // pc.v
    public final boolean a() {
        return this.f19892a.u();
    }

    @Override // pc.v
    public final List b() {
        pc.u uVar = f19891f[1];
        Object objB = this.f19896e.b();
        jc.l.d(objB, "getValue(...)");
        return (List) objB;
    }

    @Override // pc.v
    public final pc.d c() {
        pc.u uVar = f19891f[0];
        return (pc.d) this.f19895d.b();
    }

    public final pc.d d(se.w wVar) {
        se.w wVarB;
        if (this.f19893b) {
            yc.h hVarH = wVar.t().h();
            yc.c0 c0Var = hVarH instanceof yc.c0 ? (yc.c0) hVarH : null;
            if (c0Var != null) {
                return new t1(ie.d.g(c0Var));
            }
        }
        yc.h hVarH2 = wVar.t().h();
        if (hVarH2 instanceof yc.e) {
            Class clsJ = f2.j((yc.e) hVarH2);
            if (clsJ != null) {
                if (!vc.i.y(wVar)) {
                    if (se.u0.e(wVar)) {
                        return new d0(clsJ);
                    }
                    Class cls = (Class) ed.d.f6488b.get(clsJ);
                    if (cls != null) {
                        clsJ = cls;
                    }
                    return new d0(clsJ);
                }
                se.n0 n0Var = (se.n0) vb.m.z0(wVar.q());
                if (n0Var == null || (wVarB = n0Var.b()) == null) {
                    return new d0(clsJ);
                }
                pc.d dVarD = d(ud.e.E(wVarB));
                if (dVarD != null) {
                    return new d0(Array.newInstance((Class<?>) g8.a.D(n7.e.p(dVarD)), 0).getClass());
                }
                throw new hc.a("Cannot determine classifier for array element type: " + this);
            }
        } else if (hVarH2 instanceof yc.q0) {
            return new w1(null, (yc.q0) hVarH2);
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof v1)) {
            return false;
        }
        v1 v1Var = (v1) obj;
        return jc.l.a(this.f19892a, v1Var.f19892a) && jc.l.a(c(), v1Var.c()) && b().equals(v1Var.b());
    }

    public final int hashCode() {
        int iHashCode = this.f19892a.hashCode() * 31;
        pc.d dVarC = c();
        return b().hashCode() + ((iHashCode + (dVarC != null ? dVarC.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return nh.a.A(this);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public v1(se.w wVar, ic.a aVar) {
        this(wVar, aVar, false);
        jc.l.e(wVar, "type");
    }
}
