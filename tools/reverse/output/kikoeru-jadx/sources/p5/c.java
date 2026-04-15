package p5;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f16635a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p4.v f16636b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v f16637c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayDeque f16638d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final m4.q f16639e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f16640f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final z f16641g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Executor f16642h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public q f16643i;

    public c(r rVar, p4.v vVar) {
        this.f16635a = rVar;
        rVar.f16727k = vVar;
        this.f16636b = vVar;
        this.f16637c = new v(new m0.w(this), rVar);
        this.f16638d = new ArrayDeque();
        this.f16639e = new m4.q(new m4.p());
        this.f16640f = -9223372036854775807L;
        this.f16641g = z.f16769a;
        this.f16642h = new k7.b(2);
        this.f16643i = new a();
    }

    public final void a(long j10, long j11, long j12) {
        if (j10 != this.f16640f) {
            v vVar = this.f16637c;
            ce.g gVar = vVar.f16756e;
            long j13 = vVar.f16758g;
            gVar.a(j13 == -9223372036854775807L ? 0L : j13 + 1, Long.valueOf(j10));
            this.f16640f = j10;
        }
    }
}
