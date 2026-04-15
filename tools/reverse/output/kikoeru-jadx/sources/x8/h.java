package x8;

import android.os.SystemClock;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class h implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h f24851a = new h();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static k8.f f24852b;

    @Override // x8.f
    public boolean a(t8.h hVar) {
        nh.a aVar = hVar.f20563a;
        if ((aVar instanceof t8.a ? ((t8.a) aVar).f20552q : Integer.MAX_VALUE) <= 100) {
            return false;
        }
        nh.a aVar2 = hVar.f20564b;
        return (aVar2 instanceof t8.a ? ((t8.a) aVar2).f20552q : Integer.MAX_VALUE) > 100;
    }

    @Override // x8.f
    public boolean b() {
        boolean z10;
        synchronized (e.f24841a) {
            try {
                int i10 = e.f24843c;
                e.f24843c = i10 + 1;
                if (i10 >= 30 || SystemClock.uptimeMillis() > e.f24844d + ((long) 30000)) {
                    e.f24843c = 0;
                    e.f24844d = SystemClock.uptimeMillis();
                    String[] list = e.f24842b.list();
                    if (list == null) {
                        list = new String[0];
                    }
                    e.f24845e = list.length < 800;
                }
                z10 = e.f24845e;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z10;
    }
}
