package cb;

import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f3884a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f3885b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile Logger f3886c;

    public x(Class cls) {
        this.f3885b = cls.getName();
    }

    public final Logger a() {
        Logger logger = this.f3886c;
        if (logger != null) {
            return logger;
        }
        synchronized (this.f3884a) {
            try {
                Logger logger2 = this.f3886c;
                if (logger2 != null) {
                    return logger2;
                }
                Logger logger3 = Logger.getLogger(this.f3885b);
                this.f3886c = logger3;
                return logger3;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
