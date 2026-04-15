package hf;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f0 f8528a;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [jf.d] */
    /* JADX WARN: Type inference failed for: r0v7, types: [hf.b0] */
    /* JADX WARN: Type inference failed for: r0v8, types: [hf.f0] */
    /* JADX WARN: Type inference failed for: r0v9, types: [hf.b0] */
    static {
        String property;
        ?? r0;
        int i10 = nf.t.f15856a;
        try {
            property = System.getProperty("kotlinx.coroutines.main.delay");
        } catch (SecurityException unused) {
            property = null;
        }
        if (property != null ? Boolean.parseBoolean(property) : false) {
            pf.e eVar = l0.f8566a;
            r0 = nf.n.f15850a;
            jf.d dVar = r0.f10872f;
            if (!(r0 != 0)) {
                r0 = b0.f8520j;
            }
        } else {
            r0 = b0.f8520j;
        }
        f8528a = r0;
    }
}
