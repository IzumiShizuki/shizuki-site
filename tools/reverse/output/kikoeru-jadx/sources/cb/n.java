package cb;

import java.security.AccessController;
import java.security.PrivilegedActionException;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class n extends android.support.v4.media.session.b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Unsafe f3859e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final long f3860f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final long f3861g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final long f3862h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final long f3863i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final long f3864j;

    static {
        Unsafe unsafe;
        try {
            try {
                unsafe = Unsafe.getUnsafe();
            } catch (PrivilegedActionException e10) {
                throw new RuntimeException("Could not initialize intrinsics", e10.getCause());
            }
        } catch (SecurityException unused) {
            unsafe = (Unsafe) AccessController.doPrivileged(new m());
        }
        try {
            f3861g = unsafe.objectFieldOffset(p.class.getDeclaredField("c"));
            f3860f = unsafe.objectFieldOffset(p.class.getDeclaredField("b"));
            f3862h = unsafe.objectFieldOffset(p.class.getDeclaredField("a"));
            f3863i = unsafe.objectFieldOffset(o.class.getDeclaredField("a"));
            f3864j = unsafe.objectFieldOffset(o.class.getDeclaredField("b"));
            f3859e = unsafe;
        } catch (NoSuchFieldException e11) {
            throw new RuntimeException(e11);
        }
    }

    @Override // android.support.v4.media.session.b
    public final d E(p pVar) {
        d dVar;
        d dVar2 = d.f3842d;
        do {
            dVar = pVar.f3873b;
            if (dVar2 == dVar) {
                break;
            }
        } while (!v(pVar, dVar, dVar2));
        return dVar;
    }

    @Override // android.support.v4.media.session.b
    public final o F(p pVar) {
        o oVar;
        o oVar2 = o.f3865c;
        do {
            oVar = pVar.f3874c;
            if (oVar2 == oVar) {
                break;
            }
        } while (!x(pVar, oVar, oVar2));
        return oVar;
    }

    @Override // android.support.v4.media.session.b
    public final void R(o oVar, o oVar2) {
        f3859e.putObject(oVar, f3864j, oVar2);
    }

    @Override // android.support.v4.media.session.b
    public final void S(o oVar, Thread thread) {
        f3859e.putObject(oVar, f3863i, thread);
    }

    @Override // android.support.v4.media.session.b
    public final boolean v(p pVar, d dVar, d dVar2) {
        return k.a(f3859e, pVar, f3860f, dVar, dVar2);
    }

    @Override // android.support.v4.media.session.b
    public final boolean w(p pVar, Object obj, Object obj2) {
        return l.a(f3859e, pVar, f3862h, obj, obj2);
    }

    @Override // android.support.v4.media.session.b
    public final boolean x(p pVar, o oVar, o oVar2) {
        return j.a(f3859e, pVar, f3861g, oVar, oVar2);
    }
}
