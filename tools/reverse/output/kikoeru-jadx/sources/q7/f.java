package q7;

import b8.i;
import java.io.IOException;
import jc.l;
import ud.n;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class f extends g {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i f17906d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(a8.a aVar, String str) {
        super(aVar, str);
        l.e(aVar, "db");
        l.e(str, "sql");
        this.f17906d = aVar.p(str);
    }

    @Override // z7.c
    public final String M(int i10) {
        b();
        n.D(21, "no row");
        throw null;
    }

    @Override // z7.c
    public final boolean Z() {
        b();
        this.f17906d.f2261b.execute();
        return false;
    }

    @Override // z7.c
    public final void c(int i10, long j10) {
        b();
        this.f17906d.c(i10, j10);
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f17906d.close();
        this.f17909c = true;
    }

    @Override // z7.c
    public final void d(byte[] bArr, int i10) {
        l.e(bArr, "value");
        b();
        this.f17906d.d(bArr, i10);
    }

    @Override // z7.c
    public final void e(int i10) {
        b();
        this.f17906d.e(i10);
    }

    @Override // z7.c
    public final byte[] getBlob(int i10) {
        b();
        n.D(21, "no row");
        throw null;
    }

    @Override // z7.c
    public final int getColumnCount() {
        b();
        return 0;
    }

    @Override // z7.c
    public final String getColumnName(int i10) {
        b();
        n.D(21, "no row");
        throw null;
    }

    @Override // z7.c
    public final long getLong(int i10) {
        b();
        n.D(21, "no row");
        throw null;
    }

    @Override // z7.c
    public final boolean isNull(int i10) {
        b();
        n.D(21, "no row");
        throw null;
    }

    @Override // z7.c
    public final void v(int i10, String str) {
        l.e(str, "value");
        b();
        this.f17906d.m(i10, str);
    }

    @Override // z7.c
    public final void reset() {
    }
}
