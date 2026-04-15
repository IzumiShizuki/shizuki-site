package ya;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class z0 extends b0 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final z0 f26078i = new z0();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient Object f26079d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final transient Object[] f26080e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final transient int f26081f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final transient int f26082g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final transient z0 f26083h;

    public z0() {
        this.f26079d = null;
        this.f26080e = new Object[0];
        this.f26081f = 0;
        this.f26082g = 0;
        this.f26083h = this;
    }

    @Override // ya.k0
    public final c1 b() {
        return new c1(this, this.f26080e, this.f26081f, this.f26082g);
    }

    @Override // ya.k0
    public final d1 c() {
        return new d1(this, new e1(this.f26081f, this.f26082g, this.f26080e));
    }

    @Override // ya.k0, java.util.Map
    public final Object get(Object obj) {
        Object objG = f1.g(this.f26079d, this.f26080e, this.f26082g, this.f26081f, obj);
        if (objG == null) {
            return null;
        }
        return objG;
    }

    @Override // java.util.Map
    public final int size() {
        return this.f26082g;
    }

    public z0(int i10, Object[] objArr) {
        this.f26080e = objArr;
        this.f26082g = i10;
        this.f26081f = 0;
        int iO = i10 >= 2 ? m0.o(i10) : 0;
        Object objF = f1.f(objArr, i10, iO, 0);
        if (!(objF instanceof Object[])) {
            this.f26079d = objF;
            Object objF2 = f1.f(objArr, i10, iO, 1);
            if (!(objF2 instanceof Object[])) {
                this.f26083h = new z0(objF2, objArr, i10, this);
                return;
            }
            throw ((j0) ((Object[]) objF2)[2]).a();
        }
        throw ((j0) ((Object[]) objF)[2]).a();
    }

    public z0(Object obj, Object[] objArr, int i10, z0 z0Var) {
        this.f26079d = obj;
        this.f26080e = objArr;
        this.f26081f = 1;
        this.f26082g = i10;
        this.f26083h = z0Var;
    }
}
