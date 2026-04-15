package qg;

import java.io.IOException;
import java.io.InputStream;
import java.io.PushbackInputStream;
import java.util.zip.Inflater;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class d extends c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Inflater f18274c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public byte[] f18275d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public byte[] f18276e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f18277f;

    @Override // qg.c
    public final void b(InputStream inputStream, int i10) {
        Inflater inflater = this.f18274c;
        if (inflater != null) {
            inflater.end();
            this.f18274c = null;
        }
        super.b(inputStream, i10);
    }

    @Override // qg.c, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        Inflater inflater = this.f18274c;
        if (inflater != null) {
            inflater.end();
        }
        super.close();
    }

    @Override // qg.c
    public final int g(PushbackInputStream pushbackInputStream) throws IOException {
        int remaining = this.f18274c.getRemaining();
        if (remaining > 0) {
            pushbackInputStream.unread(this.f18272a.f18270c, this.f18277f - remaining, remaining);
        }
        return remaining;
    }

    @Override // qg.c, java.io.InputStream
    public final int read() {
        byte[] bArr = this.f18276e;
        if (read(bArr, 0, bArr.length) == -1) {
            return -1;
        }
        return bArr[0];
    }

    @Override // qg.c, java.io.InputStream
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0040, code lost:
    
        return -1;
     */
    @Override // qg.c, java.io.InputStream
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int read(byte[] r6, int r7, int r8) throws java.io.IOException {
        /*
            r5 = this;
        L0:
            java.util.zip.Inflater r0 = r5.f18274c     // Catch: java.util.zip.DataFormatException -> L3e
            int r0 = r0.inflate(r6, r7, r8)     // Catch: java.util.zip.DataFormatException -> L3e
            if (r0 != 0) goto L41
            java.util.zip.Inflater r0 = r5.f18274c     // Catch: java.util.zip.DataFormatException -> L3e
            boolean r0 = r0.finished()     // Catch: java.util.zip.DataFormatException -> L3e
            r1 = -1
            if (r0 != 0) goto L40
            java.util.zip.Inflater r0 = r5.f18274c     // Catch: java.util.zip.DataFormatException -> L3e
            boolean r0 = r0.needsDictionary()     // Catch: java.util.zip.DataFormatException -> L3e
            if (r0 == 0) goto L1a
            goto L40
        L1a:
            java.util.zip.Inflater r0 = r5.f18274c     // Catch: java.util.zip.DataFormatException -> L3e
            boolean r0 = r0.needsInput()     // Catch: java.util.zip.DataFormatException -> L3e
            if (r0 == 0) goto L0
            byte[] r0 = r5.f18275d     // Catch: java.util.zip.DataFormatException -> L3e
            int r2 = r0.length     // Catch: java.util.zip.DataFormatException -> L3e
            qg.b r3 = r5.f18272a     // Catch: java.util.zip.DataFormatException -> L3e
            r4 = 0
            int r2 = r3.read(r0, r4, r2)     // Catch: java.util.zip.DataFormatException -> L3e
            r5.f18277f = r2     // Catch: java.util.zip.DataFormatException -> L3e
            if (r2 == r1) goto L36
            java.util.zip.Inflater r1 = r5.f18274c     // Catch: java.util.zip.DataFormatException -> L3e
            r1.setInput(r0, r4, r2)     // Catch: java.util.zip.DataFormatException -> L3e
            goto L0
        L36:
            java.io.EOFException r6 = new java.io.EOFException     // Catch: java.util.zip.DataFormatException -> L3e
            java.lang.String r7 = "Unexpected end of input stream"
            r6.<init>(r7)     // Catch: java.util.zip.DataFormatException -> L3e
            throw r6     // Catch: java.util.zip.DataFormatException -> L3e
        L3e:
            r6 = move-exception
            goto L42
        L40:
            return r1
        L41:
            return r0
        L42:
            java.io.IOException r7 = new java.io.IOException
            r7.<init>(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: qg.d.read(byte[], int, int):int");
    }
}
