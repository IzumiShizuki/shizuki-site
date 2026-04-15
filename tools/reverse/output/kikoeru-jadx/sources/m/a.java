package m;

import pc.f0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class a extends f0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile a f12627c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final k7.b f12628d = new k7.b(1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f12629b = new c();

    public static a W() {
        if (f12627c != null) {
            return f12627c;
        }
        synchronized (a.class) {
            try {
                if (f12627c == null) {
                    f12627c = new a();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f12627c;
    }
}
