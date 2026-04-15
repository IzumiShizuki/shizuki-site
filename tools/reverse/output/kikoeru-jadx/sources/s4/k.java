package s4;

import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class k extends InputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f19428a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f19429b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f19431d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f19432e = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f19430c = new byte[1];

    public k(h hVar, m mVar) {
        this.f19428a = hVar;
        this.f19429b = mVar;
    }

    public final void b() {
        if (this.f19431d) {
            return;
        }
        this.f19428a.f(this.f19429b);
        this.f19431d = true;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f19432e) {
            return;
        }
        this.f19428a.close();
        this.f19432e = true;
    }

    @Override // java.io.InputStream
    public final int read() {
        byte[] bArr = this.f19430c;
        if (read(bArr, 0, bArr.length) == -1) {
            return -1;
        }
        return bArr[0] & 255;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i10, int i11) {
        p4.c.i(!this.f19432e);
        b();
        int i12 = this.f19428a.read(bArr, i10, i11);
        if (i12 == -1) {
            return -1;
        }
        return i12;
    }
}
