package g0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f7122a;

    static {
        d dVar = new d(50);
        f7122a = new f(dVar, dVar, dVar, dVar);
    }

    public static final f a(float f10) {
        c cVar = new c(f10);
        return new f(cVar, cVar, cVar, cVar);
    }

    public static f b(float f10, float f11) {
        return new f(new c(f10), new c(0), new c(f11), new c(0));
    }
}
