package e4;

import android.util.Log;
import java.io.ByteArrayInputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteOrder;
import q.t0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public class b extends InputStream implements DataInput {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DataInputStream f6101a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f6102b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ByteOrder f6103c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public byte[] f6104d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f6105e;

    public b(byte[] bArr) {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
        this(byteArrayInputStream, 0);
        this.f6105e = bArr.length;
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.f6101a.available();
    }

    public final void b(int i10) throws IOException {
        int i11 = 0;
        while (i11 < i10) {
            int i12 = i10 - i11;
            DataInputStream dataInputStream = this.f6101a;
            int iSkip = (int) dataInputStream.skip(i12);
            if (iSkip <= 0) {
                if (this.f6104d == null) {
                    this.f6104d = new byte[8192];
                }
                iSkip = dataInputStream.read(this.f6104d, 0, Math.min(8192, i12));
                if (iSkip == -1) {
                    throw new EOFException(t0.C(i10, "Reached EOF while skipping ", " bytes."));
                }
            }
            i11 += iSkip;
        }
        this.f6102b += i11;
    }

    @Override // java.io.InputStream
    public final void mark(int i10) {
        throw new UnsupportedOperationException("Mark is currently unsupported");
    }

    @Override // java.io.InputStream
    public final int read() {
        this.f6102b++;
        return this.f6101a.read();
    }

    @Override // java.io.DataInput
    public final boolean readBoolean() {
        this.f6102b++;
        return this.f6101a.readBoolean();
    }

    @Override // java.io.DataInput
    public final byte readByte() throws IOException {
        this.f6102b++;
        int i10 = this.f6101a.read();
        if (i10 >= 0) {
            return (byte) i10;
        }
        throw new EOFException();
    }

    @Override // java.io.DataInput
    public final char readChar() {
        this.f6102b += 2;
        return this.f6101a.readChar();
    }

    @Override // java.io.DataInput
    public final double readDouble() {
        return Double.longBitsToDouble(readLong());
    }

    @Override // java.io.DataInput
    public final float readFloat() {
        return Float.intBitsToFloat(readInt());
    }

    @Override // java.io.DataInput
    public final void readFully(byte[] bArr, int i10, int i11) throws IOException {
        this.f6102b += i11;
        this.f6101a.readFully(bArr, i10, i11);
    }

    @Override // java.io.DataInput
    public final int readInt() throws IOException {
        this.f6102b += 4;
        DataInputStream dataInputStream = this.f6101a;
        int i10 = dataInputStream.read();
        int i11 = dataInputStream.read();
        int i12 = dataInputStream.read();
        int i13 = dataInputStream.read();
        if ((i10 | i11 | i12 | i13) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder = this.f6103c;
        if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
            return (i13 << 24) + (i12 << 16) + (i11 << 8) + i10;
        }
        if (byteOrder == ByteOrder.BIG_ENDIAN) {
            return (i10 << 24) + (i11 << 16) + (i12 << 8) + i13;
        }
        throw new IOException("Invalid byte order: " + this.f6103c);
    }

    @Override // java.io.DataInput
    public final String readLine() {
        Log.d("ExifInterface", "Currently unsupported");
        return null;
    }

    @Override // java.io.DataInput
    public final long readLong() throws IOException {
        long j10;
        long j11;
        this.f6102b += 8;
        DataInputStream dataInputStream = this.f6101a;
        int i10 = dataInputStream.read();
        int i11 = dataInputStream.read();
        int i12 = dataInputStream.read();
        int i13 = dataInputStream.read();
        int i14 = dataInputStream.read();
        int i15 = dataInputStream.read();
        int i16 = dataInputStream.read();
        int i17 = dataInputStream.read();
        if ((i10 | i11 | i12 | i13 | i14 | i15 | i16 | i17) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder = this.f6103c;
        if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
            j10 = (((long) i17) << 56) + (((long) i16) << 48) + (((long) i15) << 40) + (((long) i14) << 32) + (((long) i13) << 24) + (((long) i12) << 16) + (((long) i11) << 8);
            j11 = i10;
        } else {
            if (byteOrder != ByteOrder.BIG_ENDIAN) {
                throw new IOException("Invalid byte order: " + this.f6103c);
            }
            j10 = (((long) i10) << 56) + (((long) i11) << 48) + (((long) i12) << 40) + (((long) i13) << 32) + (((long) i14) << 24) + (((long) i15) << 16) + (((long) i16) << 8);
            j11 = i17;
        }
        return j10 + j11;
    }

    @Override // java.io.DataInput
    public final short readShort() throws IOException {
        this.f6102b += 2;
        DataInputStream dataInputStream = this.f6101a;
        int i10 = dataInputStream.read();
        int i11 = dataInputStream.read();
        if ((i10 | i11) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder = this.f6103c;
        if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
            return (short) ((i11 << 8) + i10);
        }
        if (byteOrder == ByteOrder.BIG_ENDIAN) {
            return (short) ((i10 << 8) + i11);
        }
        throw new IOException("Invalid byte order: " + this.f6103c);
    }

    @Override // java.io.DataInput
    public final String readUTF() {
        this.f6102b += 2;
        return this.f6101a.readUTF();
    }

    @Override // java.io.DataInput
    public final int readUnsignedByte() {
        this.f6102b++;
        return this.f6101a.readUnsignedByte();
    }

    @Override // java.io.DataInput
    public final int readUnsignedShort() throws IOException {
        this.f6102b += 2;
        DataInputStream dataInputStream = this.f6101a;
        int i10 = dataInputStream.read();
        int i11 = dataInputStream.read();
        if ((i10 | i11) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder = this.f6103c;
        if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
            return (i11 << 8) + i10;
        }
        if (byteOrder == ByteOrder.BIG_ENDIAN) {
            return (i10 << 8) + i11;
        }
        throw new IOException("Invalid byte order: " + this.f6103c);
    }

    @Override // java.io.InputStream
    public final void reset() {
        throw new UnsupportedOperationException("Reset is currently unsupported");
    }

    @Override // java.io.DataInput
    public final int skipBytes(int i10) {
        throw new UnsupportedOperationException("skipBytes is currently unsupported");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(InputStream inputStream) {
        this(inputStream, 0);
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i10, int i11) throws IOException {
        int i12 = this.f6101a.read(bArr, i10, i11);
        this.f6102b += i12;
        return i12;
    }

    @Override // java.io.DataInput
    public final void readFully(byte[] bArr) throws IOException {
        this.f6102b += bArr.length;
        this.f6101a.readFully(bArr);
    }

    public b(InputStream inputStream, int i10) {
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        this.f6101a = dataInputStream;
        dataInputStream.mark(0);
        this.f6102b = 0;
        this.f6103c = byteOrder;
        this.f6105e = inputStream instanceof b ? ((b) inputStream).f6105e : -1;
    }
}
