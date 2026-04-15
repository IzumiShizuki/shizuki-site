package n5;

import android.os.Looper;
import android.os.SystemClock;
import b7.q0;
import java.io.IOException;
import java.util.concurrent.Executors;
import m4.d1;
import p4.c0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class o implements p {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final q0 f15369d = new q0(0, false, -9223372036854775807L);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final q0 f15370e = new q0(2, false, -9223372036854775807L);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final q0 f15371f = new q0(3, false, -9223372036854775807L);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o5.a f15372a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public k f15373b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public IOException f15374c;

    /* JADX WARN: Illegal instructions before constructor call */
    public o(String str) {
        String strConcat = "ExoPlayer:Loader:".concat(str);
        int i10 = c0.f16548a;
        this(new o5.a(Executors.newSingleThreadExecutor(new c4.a(1, strConcat)), new d1(5)));
    }

    public final void a() {
        k kVar = this.f15373b;
        p4.c.j(kVar);
        kVar.a(false);
    }

    @Override // n5.p
    public final void b() throws IOException {
        IOException iOException = this.f15374c;
        if (iOException != null) {
            throw iOException;
        }
        k kVar = this.f15373b;
        if (kVar != null) {
            int i10 = kVar.f15359a;
            IOException iOException2 = kVar.f15363e;
            if (iOException2 != null && kVar.f15364f > i10) {
                throw iOException2;
            }
        }
    }

    public final boolean c() {
        return this.f15374c != null;
    }

    public final boolean d() {
        return this.f15373b != null;
    }

    public final void e(m mVar) {
        k kVar = this.f15373b;
        if (kVar != null) {
            kVar.a(true);
        }
        o5.a aVar = this.f15372a;
        if (mVar != null) {
            aVar.execute(new c7.r(8, mVar));
        }
        aVar.f16237b.accept(aVar.f16236a);
    }

    public final void f(l lVar, j jVar, int i10) {
        Looper looperMyLooper = Looper.myLooper();
        p4.c.j(looperMyLooper);
        this.f15374c = null;
        k kVar = new k(this, looperMyLooper, lVar, jVar, i10, SystemClock.elapsedRealtime());
        p4.c.i(this.f15373b == null);
        this.f15373b = kVar;
        kVar.b();
    }

    public o(o5.a aVar) {
        this.f15372a = aVar;
    }
}
