package sc;

import java.lang.ref.SoftReference;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class z1 implements ic.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a2 f19923c = new a2();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ic.a f19924a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile SoftReference f19925b;

    public z1(Object obj, ic.a aVar) {
        if (aVar == null) {
            throw new IllegalArgumentException("Argument for @NotNull parameter 'initializer' of kotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal.<init> must not be null");
        }
        this.f19925b = null;
        this.f19924a = aVar;
        if (obj != null) {
            this.f19925b = new SoftReference(obj);
        }
    }

    @Override // ic.a
    public final Object b() {
        Object obj;
        Object obj2 = f19923c;
        SoftReference softReference = this.f19925b;
        if (softReference != null && (obj = softReference.get()) != null) {
            if (obj == obj2) {
                return null;
            }
            return obj;
        }
        Object objB = this.f19924a.b();
        if (objB != null) {
            obj2 = objB;
        }
        this.f19925b = new SoftReference(obj2);
        return objB;
    }
}
