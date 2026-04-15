package qg;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class f extends h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public g f18279a;

    @Override // qg.h
    public final void b(rg.e eVar) throws IOException {
        this.f18279a.seek(eVar.H);
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        g gVar = this.f18279a;
        if (gVar != null) {
            gVar.close();
        }
    }

    @Override // java.io.InputStream
    public final int read() {
        return this.f18279a.read();
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        return this.f18279a.read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i10, int i11) {
        return this.f18279a.read(bArr, i10, i11);
    }
}
