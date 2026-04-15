package sc;

import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Member;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class q1 extends u implements pc.u {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Object f19857k = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final i0 f19858e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f19859f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f19860g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Object f19861h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Object f19862i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final z1 f19863j;

    public q1(i0 i0Var, String str, String str2, yc.k0 k0Var, Object obj) {
        this.f19858e = i0Var;
        this.f19859f = str;
        this.f19860g = str2;
        this.f19861h = obj;
        this.f19862i = ub.a.c(ub.i.f21540a, new k1(this, 0));
        this.f19863j = nd.h.r(k0Var, new k1(this, 1));
    }

    @Override // pc.b
    public final boolean I() {
        return false;
    }

    public final boolean equals(Object obj) {
        q1 q1VarC = f2.c(obj);
        return q1VarC != null && jc.l.a(this.f19858e, q1VarC.f19858e) && jc.l.a(this.f19859f, q1VarC.f19859f) && jc.l.a(this.f19860g, q1VarC.f19860g) && jc.l.a(this.f19861h, q1VarC.f19861h);
    }

    @Override // pc.b
    public final String getName() {
        return this.f19859f;
    }

    public final int hashCode() {
        return this.f19860g.hashCode() + j2.h0.e(this.f19858e.hashCode() * 31, 31, this.f19859f);
    }

    @Override // sc.u
    public final tc.g i() {
        return w().i();
    }

    @Override // sc.u
    public final i0 j() {
        return this.f19858e;
    }

    @Override // sc.u
    public final tc.g m() {
        w().getClass();
        return null;
    }

    @Override // sc.u
    public final boolean t() {
        return this.f19861h != jc.c.f10817a;
    }

    public final String toString() throws IOException {
        StringBuilder sb = new StringBuilder();
        nh.a.f(sb, this);
        sb.append(this instanceof pc.l ? "var " : "val ");
        nh.a.g(sb, this);
        sb.append(lc.b.M(be.e.e(this.f19859f)));
        sb.append(": ");
        sb.append(nh.a.A(n()));
        return sb.toString();
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, ub.h] */
    public final Member u() {
        if (!r().g0()) {
            return null;
        }
        be.b bVar = d2.f19789a;
        n7.e eVarB = d2.b(r());
        if (eVarB instanceof p) {
            p pVar = (p) eVarB;
            yd.f fVar = pVar.f19847r;
            zd.d dVar = pVar.f19846q;
            if ((dVar.f26758b & 16) == 16) {
                zd.c cVar = dVar.f26763g;
                int i10 = cVar.f26750b;
                if ((i10 & 1) != 1 || (i10 & 2) != 2) {
                    return null;
                }
                return this.f19858e.e(fVar.getString(cVar.f26751c), fVar.getString(cVar.f26752d));
            }
        }
        return (Field) this.f19862i.getValue();
    }

    @Override // sc.u
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public final yc.k0 r() {
        Object objB = this.f19863j.b();
        jc.l.d(objB, "invoke(...)");
        return (yc.k0) objB;
    }

    public abstract n1 w();

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public q1(i0 i0Var, String str, String str2, Object obj) {
        this(i0Var, str, str2, null, obj);
        jc.l.e(str, "name");
        jc.l.e(str2, "signature");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public q1(i0 i0Var, yc.k0 k0Var) {
        jc.l.e(k0Var, "descriptor");
        String strB = k0Var.getName().b();
        jc.l.d(strB, "asString(...)");
        this(i0Var, strB, d2.b(k0Var).d(), k0Var, jc.c.f10817a);
    }
}
