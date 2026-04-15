package sc;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class a1 implements pc.n {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ pc.u[] f19754e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u f19755a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f19756b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final pc.m f19757c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final z1 f19758d;

    static {
        jc.s sVar = new jc.s(a1.class, "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/ParameterDescriptor;", 0);
        jc.a0 a0Var = jc.z.f10839a;
        f19754e = new pc.u[]{a0Var.g(sVar), q.t0.H(a1.class, "annotations", "getAnnotations()Ljava/util/List;", 0, a0Var)};
    }

    public a1(u uVar, int i10, pc.m mVar, ic.a aVar) {
        this.f19755a = uVar;
        this.f19756b = i10;
        this.f19757c = mVar;
        this.f19758d = nd.h.r(null, aVar);
        nd.h.r(null, new y0(this, 0));
    }

    public final yc.i0 a() {
        pc.u uVar = f19754e[0];
        Object objB = this.f19758d.b();
        jc.l.d(objB, "getValue(...)");
        return (yc.i0) objB;
    }

    public final String b() {
        yc.i0 i0VarA = a();
        bd.y0 y0Var = i0VarA instanceof bd.y0 ? (bd.y0) i0VarA : null;
        if (y0Var != null && !y0Var.y().Z()) {
            be.e name = y0Var.getName();
            jc.l.d(name, "getName(...)");
            if (!name.f2752b) {
                return name.b();
            }
        }
        return null;
    }

    public final v1 c() {
        se.w wVarB = a().b();
        jc.l.d(wVarB, "getType(...)");
        return new v1(wVarB, new y0(this, 1));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a1)) {
            return false;
        }
        a1 a1Var = (a1) obj;
        return jc.l.a(this.f19755a, a1Var.f19755a) && this.f19756b == a1Var.f19756b;
    }

    public final int hashCode() {
        return (this.f19755a.hashCode() * 31) + this.f19756b;
    }

    public final String toString() throws IOException {
        String string;
        StringBuilder sb = new StringBuilder();
        int iOrdinal = this.f19757c.ordinal();
        if (iOrdinal == 0) {
            sb.append("instance parameter");
        } else if (iOrdinal == 1) {
            sb.append("context parameter " + b());
        } else if (iOrdinal == 2) {
            sb.append("extension receiver parameter");
        } else {
            if (iOrdinal != 3) {
                throw new ce.j0();
            }
            sb.append("parameter #" + this.f19756b + ' ' + b());
        }
        sb.append(" of ");
        Object obj = this.f19755a;
        if (obj instanceof pc.u) {
            pc.u uVar = (pc.u) obj;
            StringBuilder sb2 = new StringBuilder();
            nh.a.f(sb2, uVar);
            sb2.append(uVar instanceof pc.l ? "var " : "val ");
            nh.a.g(sb2, uVar);
            sb2.append(lc.b.M(be.e.e(uVar.getName())));
            sb2.append(": ");
            sb2.append(nh.a.A(uVar.n()));
            string = sb2.toString();
        } else {
            if (!(obj instanceof pc.f)) {
                throw new IllegalStateException(("Illegal callable: " + obj).toString());
            }
            pc.f fVar = (pc.f) obj;
            StringBuilder sb3 = new StringBuilder();
            nh.a.f(sb3, fVar);
            sb3.append("fun ");
            nh.a.g(sb3, fVar);
            sb3.append(lc.b.M(be.e.e(fVar.getName())));
            vb.m.e0(nh.b.y(fVar), sb3, ", ", "(", ")", c.f19773l, 48);
            sb3.append(": ");
            sb3.append(nh.a.A(fVar.n()));
            string = sb3.toString();
        }
        sb.append(string);
        return sb.toString();
    }
}
