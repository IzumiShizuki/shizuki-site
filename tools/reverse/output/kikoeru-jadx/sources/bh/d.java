package bh;

import java.io.IOException;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import jc.l;
import ug.t;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class d extends b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f3016e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f3017f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ h f3018g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(h hVar, t tVar) {
        super(hVar, tVar);
        l.e(tVar, "url");
        this.f3018g = hVar;
        this.f3016e = -1L;
        this.f3017f = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x00ff, code lost:
    
        if (r17.f3017f == false) goto L55;
     */
    @Override // bh.b, lh.h0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long W(lh.f r18, long r19) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 363
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bh.d.W(lh.f, long):long");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        boolean zF;
        if (this.f3011c) {
            return;
        }
        if (this.f3017f) {
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            TimeZone timeZone = wg.g.f24231a;
            l.e(timeUnit, "timeUnit");
            try {
                zF = wg.g.f(this, 100);
            } catch (IOException unused) {
                zF = false;
            }
            if (!zF) {
                this.f3018g.f3027b.f();
                b(h.f3025f);
            }
        }
        this.f3011c = true;
    }
}
