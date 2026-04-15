package c1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public class c extends vb.e implements a1.d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c f3208c = new c(m.f3232e, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f3209a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f3210b;

    public c(m mVar, int i10) {
        this.f3209a = mVar;
        this.f3210b = i10;
    }

    @Override // a1.d
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public e builder() {
        return new e(this);
    }

    public final c b(Object obj, d1.a aVar) {
        b7.m mVarU = this.f3209a.u(obj, obj != null ? obj.hashCode() : 0, aVar, 0);
        return mVarU == null ? this : new c((m) mVarU.f1959c, this.f3210b + mVarU.f1958b);
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return this.f3209a.d(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    @Override // java.util.Map
    public Object get(Object obj) {
        return this.f3209a.g(obj != null ? obj.hashCode() : 0, 0, obj);
    }
}
