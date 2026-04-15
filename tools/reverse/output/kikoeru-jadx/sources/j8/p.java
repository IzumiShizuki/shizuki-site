package j8;

import lh.u;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class p extends n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lc.b f10636a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f10637b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final lh.h f10638c;

    public p(lh.h hVar, lc.b bVar) {
        this.f10636a = bVar;
        this.f10638c = hVar;
    }

    @Override // j8.n
    public final lc.b b() {
        return this.f10636a;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.f10637b = true;
        lh.h hVar = this.f10638c;
        if (hVar != null) {
            x8.d.a(hVar);
        }
    }

    @Override // j8.n
    public final synchronized lh.h g() {
        lh.h hVar;
        try {
            if (this.f10637b) {
                throw new IllegalStateException("closed");
            }
            hVar = this.f10638c;
            if (hVar == null) {
                u uVar = lh.l.f12595a;
                jc.l.b(null);
                uVar.L(null);
                throw null;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return hVar;
    }
}
