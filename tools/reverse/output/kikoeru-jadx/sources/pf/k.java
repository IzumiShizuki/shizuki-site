package pf;

import java.util.concurrent.TimeUnit;
import nf.t;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f17146a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f17147b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f17148c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f17149d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final long f17150e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final g f17151f;

    static {
        String property;
        int i10 = t.f15856a;
        try {
            property = System.getProperty("kotlinx.coroutines.scheduler.default.name");
        } catch (SecurityException unused) {
            property = null;
        }
        if (property == null) {
            property = "DefaultDispatcher";
        }
        f17146a = property;
        f17147b = nf.b.k("kotlinx.coroutines.scheduler.resolution.ns", 100000L, 1L, Long.MAX_VALUE);
        int i11 = t.f15856a;
        if (i11 < 2) {
            i11 = 2;
        }
        f17148c = nf.b.l(i11, 8, "kotlinx.coroutines.scheduler.core.pool.size");
        f17149d = nf.b.l(2097150, 4, "kotlinx.coroutines.scheduler.max.pool.size");
        f17150e = TimeUnit.SECONDS.toNanos(nf.b.k("kotlinx.coroutines.scheduler.keep.alive.sec", 60L, 1L, Long.MAX_VALUE));
        f17151f = g.f17141a;
    }
}
