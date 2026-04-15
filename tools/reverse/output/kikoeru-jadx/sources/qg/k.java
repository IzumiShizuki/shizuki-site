package qg;

import c7.e1;
import java.io.IOException;
import java.io.InputStream;
import java.io.PushbackInputStream;
import java.util.zip.CRC32;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class k extends InputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PushbackInputStream f18290a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public c f18291b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e1 f18292c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public rg.f f18293d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final CRC32 f18294e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f18295f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final rg.g f18296g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f18297h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f18298i;

    public k(h hVar) {
        rg.g gVar = new rg.g(4096, true);
        this.f18292c = new e1(26);
        this.f18294e = new CRC32();
        this.f18295f = false;
        this.f18297h = false;
        this.f18298i = false;
        this.f18290a = new PushbackInputStream(hVar, 4096);
        this.f18296g = gVar;
    }

    @Override // java.io.InputStream
    public final int available() throws IOException {
        if (this.f18297h) {
            throw new IOException("Stream closed");
        }
        return !this.f18298i ? 1 : 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0071  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b() throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 208
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: qg.k.b():void");
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f18297h) {
            return;
        }
        c cVar = this.f18291b;
        if (cVar != null) {
            cVar.close();
        }
        this.f18297h = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:85:0x01ea  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final rg.f g(rg.e r25) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 700
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: qg.k.g(rg.e):rg.f");
    }

    @Override // java.io.InputStream
    public final int read() {
        byte[] bArr = new byte[1];
        if (read(bArr, 0, 1) == -1) {
            return -1;
        }
        return bArr[0] & 255;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i10, int i11) throws IOException {
        if (this.f18297h) {
            throw new IOException("Stream closed");
        }
        if (i11 < 0) {
            throw new IllegalArgumentException("Negative read length");
        }
        if (i11 == 0) {
            return 0;
        }
        if (this.f18293d == null) {
            return -1;
        }
        try {
            int i12 = this.f18291b.read(bArr, i10, i11);
            if (i12 == -1) {
                b();
                return i12;
            }
            this.f18294e.update(bArr, i10, i12);
            return i12;
        } catch (IOException e10) {
            rg.f fVar = this.f18293d;
            if (fVar.f19046x && w0.c.a(2, fVar.f19047y)) {
                throw new og.a(e10.getMessage(), e10.getCause());
            }
            throw e10;
        }
    }
}
