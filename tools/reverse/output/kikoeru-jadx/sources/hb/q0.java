package hb;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class q0 implements eb.a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8341a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Class f8342b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ eb.z f8343c;

    public /* synthetic */ q0(Class cls, eb.z zVar, int i10) {
        this.f8341a = i10;
        this.f8342b = cls;
        this.f8343c = zVar;
    }

    @Override // eb.a0
    public final eb.z a(eb.m mVar, lb.a aVar) {
        switch (this.f8341a) {
            case 0:
                if (aVar.f12165a == this.f8342b) {
                    return this.f8343c;
                }
                return null;
            default:
                Class<?> cls = aVar.f12165a;
                if (this.f8342b.isAssignableFrom(cls)) {
                    return new c(this, cls);
                }
                return null;
        }
    }

    public final String toString() {
        switch (this.f8341a) {
            case 0:
                return "Factory[type=" + this.f8342b.getName() + ",adapter=" + this.f8343c + "]";
            default:
                return "Factory[typeHierarchy=" + this.f8342b.getName() + ",adapter=" + this.f8343c + "]";
        }
    }
}
