package ch;

import androidx.lifecycle.n0;
import j2.h0;
import java.io.IOException;
import java.net.SocketTimeoutException;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class w extends lh.c {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ x f4264n;

    public w(x xVar) {
        this.f4264n = xVar;
    }

    @Override // lh.c
    public final IOException j(IOException iOException) {
        return new SocketTimeoutException("timeout");
    }

    @Override // lh.c
    public final void k() {
        this.f4264n.e(b.f4152h);
        p pVar = this.f4264n.f4266b;
        synchronized (pVar) {
            long j10 = pVar.f4224n;
            long j11 = pVar.f4223m;
            if (j10 < j11) {
                return;
            }
            pVar.f4223m = j11 + 1;
            pVar.f4225o = System.nanoTime() + ((long) 1000000000);
            yg.b.c(pVar.f4218h, h0.n(new StringBuilder(), pVar.f4213c, " ping"), new n0(4, pVar));
        }
    }

    public final void l() {
        if (i()) {
            throw j(null);
        }
    }
}
