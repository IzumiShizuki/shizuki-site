package c2;

import android.view.MotionEvent;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f3320a = new a(1000);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final StackTraceElement[] f3321b;

    static {
        new a(1007);
        new a(1008);
        new a(1002);
        f3321b = new StackTraceElement[0];
    }

    public static final boolean a(t tVar) {
        return !tVar.f3329h && tVar.f3325d;
    }

    public static final boolean b(t tVar) {
        return (tVar.b() || !tVar.f3329h || tVar.f3325d) ? false : true;
    }

    public static final boolean c(t tVar) {
        return tVar.f3329h && !tVar.f3325d;
    }

    public static final boolean d(long j10, long j11) {
        return j10 == j11;
    }

    public static final boolean e(t tVar, long j10, long j11) {
        int i10 = tVar.f3330i == 1 ? 1 : 0;
        long j12 = tVar.f3324c;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j12 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j12 & 4294967295L));
        float f10 = i10;
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (j11 >> 32)) * f10;
        float f11 = ((int) (j10 >> 32)) + fIntBitsToFloat3;
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (j11 & 4294967295L)) * f10;
        return (fIntBitsToFloat > f11) | (fIntBitsToFloat < (-fIntBitsToFloat3)) | (fIntBitsToFloat2 < (-fIntBitsToFloat4)) | (fIntBitsToFloat2 > ((int) (j10 & 4294967295L)) + fIntBitsToFloat4);
    }

    public static final long f(t tVar, boolean z10) {
        long jH = p1.b.h(tVar.f3324c, tVar.f3328g);
        if (z10 || !tVar.b()) {
            return jH;
        }
        return 0L;
    }

    public static final void g(l lVar, long j10, ic.k kVar, boolean z10) {
        b7.n nVar = lVar.f3310b;
        MotionEvent motionEvent = nVar != null ? (MotionEvent) ((androidx.media3.exoplayer.offline.u) nVar.f1986d).f968b : null;
        if (motionEvent == null) {
            throw new IllegalArgumentException("The PointerEvent receiver cannot have a null MotionEvent.");
        }
        int action = motionEvent.getAction();
        if (z10) {
            motionEvent.setAction(3);
        }
        int i10 = (int) (j10 >> 32);
        int i11 = (int) (j10 & 4294967295L);
        motionEvent.offsetLocation(-Float.intBitsToFloat(i10), -Float.intBitsToFloat(i11));
        kVar.a(motionEvent);
        motionEvent.offsetLocation(Float.intBitsToFloat(i10), Float.intBitsToFloat(i11));
        motionEvent.setAction(action);
    }
}
