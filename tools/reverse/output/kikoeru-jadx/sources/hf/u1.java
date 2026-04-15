package hf;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ThreadLocal f8597a = new ThreadLocal();

    public static v0 a() {
        ThreadLocal threadLocal = f8597a;
        v0 v0Var = (v0) threadLocal.get();
        if (v0Var != null) {
            return v0Var;
        }
        g gVar = new g(Thread.currentThread());
        threadLocal.set(gVar);
        return gVar;
    }
}
