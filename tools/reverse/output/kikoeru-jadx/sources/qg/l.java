package qg;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class l extends h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public RandomAccessFile f18299a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public File f18300b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f18301c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f18302d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f18303e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public byte[] f18304f;

    @Override // qg.h
    public final void b(rg.e eVar) throws IOException {
        if (this.f18302d) {
            int i10 = this.f18303e;
            int i11 = eVar.F;
            if (i10 != i11) {
                g(i11);
                this.f18303e = eVar.F;
            }
        }
        this.f18299a.seek(eVar.H);
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        RandomAccessFile randomAccessFile = this.f18299a;
        if (randomAccessFile != null) {
            randomAccessFile.close();
        }
    }

    public final void g(int i10) throws IOException {
        File file = this.f18300b;
        if (i10 != this.f18301c) {
            String canonicalPath = file.getCanonicalPath();
            file = new File(canonicalPath.substring(0, canonicalPath.lastIndexOf(".")) + (i10 >= 9 ? ".z" : ".z0") + (i10 + 1));
        }
        if (file.exists()) {
            this.f18299a.close();
            this.f18299a = new RandomAccessFile(file, "r");
        } else {
            throw new FileNotFoundException("zip split file does not exist: " + file);
        }
    }

    @Override // java.io.InputStream
    public final int read() {
        byte[] bArr = this.f18304f;
        if (read(bArr, 0, bArr.length) == -1) {
            return -1;
        }
        return bArr[0];
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i10, int i11) throws IOException {
        int i12 = this.f18299a.read(bArr, i10, i11);
        if ((i12 == i11 && i12 != -1) || !this.f18302d) {
            return i12;
        }
        g(this.f18303e + 1);
        this.f18303e++;
        if (i12 < 0) {
            i12 = 0;
        }
        int i13 = this.f18299a.read(bArr, i12, i11 - i12);
        return i13 > 0 ? i12 + i13 : i12;
    }
}
