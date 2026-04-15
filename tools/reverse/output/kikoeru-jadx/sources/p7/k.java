package p7;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class k implements z7.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z7.c f16894a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f16895b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r f16896c;

    public k(r rVar, z7.c cVar) {
        jc.l.e(cVar, "delegate");
        this.f16896c = rVar;
        this.f16894a = cVar;
        this.f16895b = nd.h.e();
    }

    @Override // z7.c
    public final String M(int i10) {
        if (this.f16896c.f16928d.get()) {
            ud.n.D(21, "Statement is recycled");
            throw null;
        }
        if (this.f16895b == nd.h.e()) {
            return this.f16894a.M(i10);
        }
        ud.n.D(21, "Attempted to use statement on a different thread");
        throw null;
    }

    @Override // z7.c
    public final int V() {
        return (int) getLong(0);
    }

    @Override // z7.c
    public final boolean Z() {
        if (this.f16896c.f16928d.get()) {
            ud.n.D(21, "Statement is recycled");
            throw null;
        }
        if (this.f16895b == nd.h.e()) {
            return this.f16894a.Z();
        }
        ud.n.D(21, "Attempted to use statement on a different thread");
        throw null;
    }

    @Override // z7.c
    public final void c(int i10, long j10) {
        if (this.f16896c.f16928d.get()) {
            ud.n.D(21, "Statement is recycled");
            throw null;
        }
        if (this.f16895b == nd.h.e()) {
            this.f16894a.c(i10, j10);
        } else {
            ud.n.D(21, "Attempted to use statement on a different thread");
            throw null;
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws Exception {
        if (this.f16896c.f16928d.get()) {
            ud.n.D(21, "Statement is recycled");
            throw null;
        }
        if (this.f16895b == nd.h.e()) {
            this.f16894a.close();
        } else {
            ud.n.D(21, "Attempted to use statement on a different thread");
            throw null;
        }
    }

    @Override // z7.c
    public final void d(byte[] bArr, int i10) {
        jc.l.e(bArr, "value");
        if (this.f16896c.f16928d.get()) {
            ud.n.D(21, "Statement is recycled");
            throw null;
        }
        if (this.f16895b == nd.h.e()) {
            this.f16894a.d(bArr, i10);
        } else {
            ud.n.D(21, "Attempted to use statement on a different thread");
            throw null;
        }
    }

    @Override // z7.c
    public final void e(int i10) {
        if (this.f16896c.f16928d.get()) {
            ud.n.D(21, "Statement is recycled");
            throw null;
        }
        if (this.f16895b == nd.h.e()) {
            this.f16894a.e(i10);
        } else {
            ud.n.D(21, "Attempted to use statement on a different thread");
            throw null;
        }
    }

    @Override // z7.c
    public final byte[] getBlob(int i10) {
        if (this.f16896c.f16928d.get()) {
            ud.n.D(21, "Statement is recycled");
            throw null;
        }
        if (this.f16895b == nd.h.e()) {
            return this.f16894a.getBlob(i10);
        }
        ud.n.D(21, "Attempted to use statement on a different thread");
        throw null;
    }

    @Override // z7.c
    public final int getColumnCount() {
        if (this.f16896c.f16928d.get()) {
            ud.n.D(21, "Statement is recycled");
            throw null;
        }
        if (this.f16895b == nd.h.e()) {
            return this.f16894a.getColumnCount();
        }
        ud.n.D(21, "Attempted to use statement on a different thread");
        throw null;
    }

    @Override // z7.c
    public final String getColumnName(int i10) {
        if (this.f16896c.f16928d.get()) {
            ud.n.D(21, "Statement is recycled");
            throw null;
        }
        if (this.f16895b == nd.h.e()) {
            return this.f16894a.getColumnName(i10);
        }
        ud.n.D(21, "Attempted to use statement on a different thread");
        throw null;
    }

    @Override // z7.c
    public final long getLong(int i10) {
        if (this.f16896c.f16928d.get()) {
            ud.n.D(21, "Statement is recycled");
            throw null;
        }
        if (this.f16895b == nd.h.e()) {
            return this.f16894a.getLong(i10);
        }
        ud.n.D(21, "Attempted to use statement on a different thread");
        throw null;
    }

    @Override // z7.c
    public final boolean isNull(int i10) {
        if (this.f16896c.f16928d.get()) {
            ud.n.D(21, "Statement is recycled");
            throw null;
        }
        if (this.f16895b == nd.h.e()) {
            return this.f16894a.isNull(i10);
        }
        ud.n.D(21, "Attempted to use statement on a different thread");
        throw null;
    }

    @Override // z7.c
    public final void reset() {
        if (this.f16896c.f16928d.get()) {
            ud.n.D(21, "Statement is recycled");
            throw null;
        }
        if (this.f16895b == nd.h.e()) {
            this.f16894a.reset();
        } else {
            ud.n.D(21, "Attempted to use statement on a different thread");
            throw null;
        }
    }

    @Override // z7.c
    public final void v(int i10, String str) {
        jc.l.e(str, "value");
        if (this.f16896c.f16928d.get()) {
            ud.n.D(21, "Statement is recycled");
            throw null;
        }
        if (this.f16895b == nd.h.e()) {
            this.f16894a.v(i10, str);
        } else {
            ud.n.D(21, "Attempted to use statement on a different thread");
            throw null;
        }
    }

    @Override // z7.c
    public final boolean z() {
        return getLong(0) != 0;
    }
}
