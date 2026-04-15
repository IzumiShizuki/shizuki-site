package ch;

import java.util.TimeZone;
import lh.h0;
import lh.j0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class v implements h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f4258a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f4259b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final lh.f f4260c = new lh.f();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final lh.f f4261d = new lh.f();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f4262e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ x f4263f;

    public v(x xVar, long j10, boolean z10) {
        this.f4263f = xVar;
        this.f4258a = j10;
        this.f4259b = z10;
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00bf A[Catch: all -> 0x0031, DONT_GENERATE, TRY_ENTER, TRY_LEAVE, TryCatch #0 {, blocks: (B:6:0x0014, B:8:0x0021, B:14:0x002b, B:47:0x00bf, B:61:0x00e7, B:62:0x00ec, B:18:0x0034, B:20:0x003a, B:22:0x003e, B:24:0x0042, B:28:0x0053, B:30:0x0057, B:32:0x0061, B:34:0x007c, B:36:0x008b, B:38:0x00a1, B:41:0x00a7, B:43:0x00ad, B:44:0x00b9, B:58:0x00dd, B:59:0x00e4), top: B:67:0x0014, inners: #2 }] */
    @Override // lh.h0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long W(lh.f r26, long r27) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 255
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ch.v.W(lh.f, long):long");
    }

    @Override // lh.h0
    public final j0 a() {
        return this.f4263f.f4274j;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        long j10;
        x xVar = this.f4263f;
        synchronized (xVar) {
            this.f4262e = true;
            lh.f fVar = this.f4261d;
            j10 = fVar.f12571b;
            fVar.skip(j10);
            xVar.notifyAll();
        }
        if (j10 > 0) {
            x xVar2 = this.f4263f;
            TimeZone timeZone = wg.g.f24231a;
            xVar2.f4266b.o(j10);
        }
        this.f4263f.a();
    }
}
