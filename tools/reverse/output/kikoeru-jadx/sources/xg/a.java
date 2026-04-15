package xg;

import a0.v;
import java.io.IOException;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import jc.l;
import lh.a0;
import lh.h;
import lh.h0;
import lh.j0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class a implements h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f25026a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f25027b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ v f25028c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a0 f25029d;

    public a(h hVar, v vVar, a0 a0Var) {
        this.f25027b = hVar;
        this.f25028c = vVar;
        this.f25029d = a0Var;
    }

    @Override // lh.h0
    public final long W(lh.f fVar, long j10) throws Throwable {
        l.e(fVar, "sink");
        try {
            long jW = this.f25027b.W(fVar, j10);
            a0 a0Var = this.f25029d;
            if (jW != -1) {
                fVar.g(a0Var.f12542b, fVar.f12571b - jW, jW);
                a0Var.b();
                return jW;
            }
            if (!this.f25026a) {
                this.f25026a = true;
                a0Var.close();
            }
            return -1L;
        } catch (IOException e10) {
            if (this.f25026a) {
                throw e10;
            }
            this.f25026a = true;
            this.f25028c.j();
            throw e10;
        }
    }

    @Override // lh.h0
    public final j0 a() {
        return this.f25027b.a();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        boolean zF;
        if (!this.f25026a) {
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            TimeZone timeZone = wg.g.f24231a;
            l.e(timeUnit, "timeUnit");
            try {
                zF = wg.g.f(this, 100);
            } catch (IOException unused) {
                zF = false;
            }
            if (!zF) {
                this.f25026a = true;
                this.f25028c.j();
            }
        }
        this.f25027b.close();
    }
}
