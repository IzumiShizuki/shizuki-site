package yf;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f26280a;

    static {
        Object objB;
        try {
            String property = System.getProperty("kotlinx.serialization.json.pool.size");
            objB = property != null ? ef.u.l0(property) : null;
        } catch (Throwable th2) {
            objB = ub.a.b(th2);
        }
        Integer num = (Integer) (objB instanceof ub.m ? null : objB);
        f26280a = num != null ? num.intValue() : 2097152;
    }
}
