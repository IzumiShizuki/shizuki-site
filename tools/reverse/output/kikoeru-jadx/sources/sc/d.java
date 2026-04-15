package sc;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f19781a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final e f19782b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final e f19783c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final e f19784d;

    static {
        c cVar = c.f19763b;
        int i10 = b.f19759a;
        f19781a = new e(cVar, 0);
        f19782b = new e(c.f19764c, 0);
        f19783c = new e(c.f19765d, 0);
        new e(c.f19766e, 0);
        f19784d = new e(c.f19767f, 0);
    }

    public static final d0 a(Class cls) {
        jc.l.e(cls, "jClass");
        Object objB = f19781a.b(cls);
        jc.l.c(objB, "null cannot be cast to non-null type kotlin.reflect.jvm.internal.KClassImpl<T of kotlin.reflect.jvm.internal.CachesKt.getOrCreateKotlinClass>");
        return (d0) objB;
    }
}
