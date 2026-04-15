package hb;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class r0 implements eb.a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Class f8348a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Class f8349b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ eb.z f8350c;

    public r0(Class cls, Class cls2, eb.z zVar) {
        this.f8348a = cls;
        this.f8349b = cls2;
        this.f8350c = zVar;
    }

    @Override // eb.a0
    public final eb.z a(eb.m mVar, lb.a aVar) {
        Class cls = aVar.f12165a;
        if (cls == this.f8348a || cls == this.f8349b) {
            return this.f8350c;
        }
        return null;
    }

    public final String toString() {
        return "Factory[type=" + this.f8349b.getName() + "+" + this.f8348a.getName() + ",adapter=" + this.f8350c + "]";
    }
}
