package lh;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class a0 implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f0 f12541a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f12542b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f12543c;

    public a0(f0 f0Var) {
        jc.l.e(f0Var, "sink");
        this.f12541a = f0Var;
        this.f12542b = new f();
    }

    @Override // lh.g
    public final g E(String str) {
        jc.l.e(str, "string");
        if (this.f12543c) {
            throw new IllegalStateException("closed");
        }
        this.f12542b.k0(str);
        b();
        return this;
    }

    @Override // lh.f0
    public final void H(f fVar, long j10) {
        jc.l.e(fVar, "source");
        if (this.f12543c) {
            throw new IllegalStateException("closed");
        }
        this.f12542b.H(fVar, j10);
        b();
    }

    @Override // lh.g
    public final g J(i iVar) {
        jc.l.e(iVar, "byteString");
        if (this.f12543c) {
            throw new IllegalStateException("closed");
        }
        this.f12542b.X(iVar);
        b();
        return this;
    }

    @Override // lh.f0
    public final j0 a() {
        return this.f12541a.a();
    }

    public final g b() {
        if (this.f12543c) {
            throw new IllegalStateException("closed");
        }
        f fVar = this.f12542b;
        long jB = fVar.b();
        if (jB > 0) {
            this.f12541a.H(fVar, jB);
        }
        return this;
    }

    @Override // lh.g
    public final g b0(long j10) {
        if (this.f12543c) {
            throw new IllegalStateException("closed");
        }
        this.f12542b.f0(j10);
        b();
        return this;
    }

    @Override // lh.f0, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws Throwable {
        f0 f0Var = this.f12541a;
        if (this.f12543c) {
            return;
        }
        try {
            f fVar = this.f12542b;
            long j10 = fVar.f12571b;
            if (j10 > 0) {
                f0Var.H(fVar, j10);
            }
            th = null;
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            f0Var.close();
        } catch (Throwable th3) {
            if (th == null) {
                th = th3;
            }
        }
        this.f12543c = true;
        if (th != null) {
            throw th;
        }
    }

    @Override // lh.g, lh.f0, java.io.Flushable
    public final void flush() {
        if (this.f12543c) {
            throw new IllegalStateException("closed");
        }
        f fVar = this.f12542b;
        long j10 = fVar.f12571b;
        f0 f0Var = this.f12541a;
        if (j10 > 0) {
            f0Var.H(fVar, j10);
        }
        f0Var.flush();
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.f12543c;
    }

    public final String toString() {
        return "buffer(" + this.f12541a + ')';
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        jc.l.e(byteBuffer, "source");
        if (this.f12543c) {
            throw new IllegalStateException("closed");
        }
        int iWrite = this.f12542b.write(byteBuffer);
        b();
        return iWrite;
    }

    @Override // lh.g
    public final g writeByte(int i10) {
        if (this.f12543c) {
            throw new IllegalStateException("closed");
        }
        this.f12542b.e0(i10);
        b();
        return this;
    }

    @Override // lh.g
    public final g writeInt(int i10) {
        if (this.f12543c) {
            throw new IllegalStateException("closed");
        }
        this.f12542b.h0(i10);
        b();
        return this;
    }

    @Override // lh.g
    public final g writeShort(int i10) {
        if (this.f12543c) {
            throw new IllegalStateException("closed");
        }
        this.f12542b.i0(i10);
        b();
        return this;
    }

    @Override // lh.g
    public final g write(byte[] bArr) {
        if (!this.f12543c) {
            this.f12542b.Y(bArr, bArr.length);
            b();
            return this;
        }
        throw new IllegalStateException("closed");
    }
}
