package androidx.lifecycle;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k4.d f814a = new k4.d();

    public final void a(String str, AutoCloseable autoCloseable) {
        AutoCloseable autoCloseable2;
        k4.d dVar = this.f814a;
        if (dVar != null) {
            if (dVar.f11028d) {
                k4.d.a(autoCloseable);
                return;
            }
            synchronized (dVar.f11025a) {
                autoCloseable2 = (AutoCloseable) dVar.f11026b.put(str, autoCloseable);
            }
            k4.d.a(autoCloseable2);
        }
    }

    public final void k() {
        k4.d dVar = this.f814a;
        if (dVar != null && !dVar.f11028d) {
            dVar.f11028d = true;
            synchronized (dVar.f11025a) {
                try {
                    Iterator it = dVar.f11026b.values().iterator();
                    while (it.hasNext()) {
                        k4.d.a((AutoCloseable) it.next());
                    }
                    Iterator it2 = dVar.f11027c.iterator();
                    while (it2.hasNext()) {
                        k4.d.a((AutoCloseable) it2.next());
                    }
                    dVar.f11027c.clear();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        v();
    }

    public final AutoCloseable q(String str) {
        AutoCloseable autoCloseable;
        k4.d dVar = this.f814a;
        if (dVar == null) {
            return null;
        }
        synchronized (dVar.f11025a) {
            autoCloseable = (AutoCloseable) dVar.f11026b.get(str);
        }
        return autoCloseable;
    }

    public void v() {
    }
}
