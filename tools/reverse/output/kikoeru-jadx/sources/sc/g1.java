package sc;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public class g1 extends q1 implements pc.t {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Object f19803l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(i0 i0Var, String str, String str2, Object obj) {
        super(i0Var, str, str2, obj);
        jc.l.e(str, "name");
        jc.l.e(str2, "signature");
        e1 e1Var = new e1(this, 0);
        ub.i iVar = ub.i.f21540a;
        this.f19803l = ub.a.c(iVar, e1Var);
        ub.a.c(iVar, new e1(this, 1));
    }

    @Override // ic.k
    public final Object a(Object obj) {
        return get(obj);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, ub.h] */
    @Override // pc.u
    public final pc.p d() {
        return (f1) this.f19803l.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, ub.h] */
    @Override // pc.t
    public final Object get(Object obj) {
        return ((f1) this.f19803l.getValue()).h(obj);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, ub.h] */
    @Override // sc.q1
    public final n1 w() {
        return (f1) this.f19803l.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, ub.h] */
    @Override // pc.u
    public final pc.s d() {
        return (f1) this.f19803l.getValue();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(i0 i0Var, yc.k0 k0Var) {
        super(i0Var, k0Var);
        jc.l.e(k0Var, "descriptor");
        e1 e1Var = new e1(this, 0);
        ub.i iVar = ub.i.f21540a;
        this.f19803l = ub.a.c(iVar, e1Var);
        ub.a.c(iVar, new e1(this, 1));
    }
}
