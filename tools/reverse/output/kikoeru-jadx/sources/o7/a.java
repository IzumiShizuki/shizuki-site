package o7;

import java.util.LinkedHashMap;
import java.util.concurrent.locks.ReentrantLock;
import m0.w;
import m3.l;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final l f16279c = new l(19);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final LinkedHashMap f16280d = new LinkedHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ReentrantLock f16281a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w f16282b;

    public a(String str, boolean z10) {
        ReentrantLock reentrantLock;
        synchronized (f16279c) {
            try {
                LinkedHashMap linkedHashMap = f16280d;
                Object reentrantLock2 = linkedHashMap.get(str);
                if (reentrantLock2 == null) {
                    reentrantLock2 = new ReentrantLock();
                    linkedHashMap.put(str, reentrantLock2);
                }
                reentrantLock = (ReentrantLock) reentrantLock2;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f16281a = reentrantLock;
        this.f16282b = z10 ? new w(str) : null;
    }
}
