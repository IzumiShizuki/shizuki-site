package qg;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import q.t0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class g extends RandomAccessFile {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f18280a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final File[] f18281b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public RandomAccessFile f18282c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f18283d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f18284e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f18285f;

    public g(File file, File[] fileArr) throws IOException {
        super(file, "r");
        this.f18283d = new byte[1];
        this.f18284e = 0;
        super.close();
        int i10 = 1;
        for (File file2 : fileArr) {
            String name = file2.getName();
            String strSubstring = !name.contains(".") ? "" : name.substring(name.lastIndexOf(".") + 1);
            try {
                if (i10 != Integer.parseInt(strSubstring)) {
                    throw new IOException("Split file number " + i10 + " does not exist");
                }
                i10++;
            } catch (NumberFormatException unused) {
                throw new IOException(t0.D("Split file extension not in expected format. Found: ", strSubstring, " expected of format: .001, .002, etc"));
            }
        }
        this.f18282c = new RandomAccessFile(file, "r");
        this.f18281b = fileArr;
        this.f18280a = file.length();
        this.f18285f = "r";
    }

    public final void b(int i10) throws IOException {
        if (this.f18284e == i10) {
            return;
        }
        File[] fileArr = this.f18281b;
        if (i10 > fileArr.length - 1) {
            throw new IOException("split counter greater than number of split files");
        }
        RandomAccessFile randomAccessFile = this.f18282c;
        if (randomAccessFile != null) {
            randomAccessFile.close();
        }
        this.f18282c = new RandomAccessFile(fileArr[i10], this.f18285f);
        this.f18284e = i10;
    }

    @Override // java.io.RandomAccessFile, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        RandomAccessFile randomAccessFile = this.f18282c;
        if (randomAccessFile != null) {
            randomAccessFile.close();
        }
        super.close();
    }

    @Override // java.io.RandomAccessFile
    public final long getFilePointer() {
        return this.f18282c.getFilePointer();
    }

    @Override // java.io.RandomAccessFile
    public final long length() {
        return this.f18282c.length();
    }

    @Override // java.io.RandomAccessFile
    public final int read() {
        byte[] bArr = this.f18283d;
        if (read(bArr, 0, bArr.length) == -1) {
            return -1;
        }
        return bArr[0] & 255;
    }

    @Override // java.io.RandomAccessFile
    public final void seek(long j10) throws IOException {
        long j11 = this.f18280a;
        int i10 = (int) (j10 / j11);
        if (i10 != this.f18284e) {
            b(i10);
        }
        this.f18282c.seek(j10 - (((long) i10) * j11));
    }

    @Override // java.io.RandomAccessFile, java.io.DataOutput
    public final void write(int i10) {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.RandomAccessFile, java.io.DataOutput
    public final void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
        throw null;
    }

    @Override // java.io.RandomAccessFile
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.RandomAccessFile, java.io.DataOutput
    public final void write(byte[] bArr, int i10, int i11) {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.RandomAccessFile
    public final int read(byte[] bArr, int i10, int i11) throws IOException {
        int i12 = this.f18282c.read(bArr, i10, i11);
        if (i12 != -1) {
            return i12;
        }
        int i13 = this.f18284e;
        if (i13 == this.f18281b.length - 1) {
            return -1;
        }
        b(i13 + 1);
        return read(bArr, i10, i11);
    }
}
