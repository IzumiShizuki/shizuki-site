package lh;

import java.io.Closeable;
import java.io.RandomAccessFile;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class t implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f12611a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f12612b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ReentrantLock f12613c = new ReentrantLock();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final RandomAccessFile f12614d;

    public t(RandomAccessFile randomAccessFile) {
        this.f12614d = randomAccessFile;
    }

    public final j b(long j10) {
        ReentrantLock reentrantLock = this.f12613c;
        reentrantLock.lock();
        try {
            if (this.f12611a) {
                throw new IllegalStateException("closed");
            }
            this.f12612b++;
            reentrantLock.unlock();
            return new j(this, j10);
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ReentrantLock reentrantLock = this.f12613c;
        reentrantLock.lock();
        try {
            if (this.f12611a) {
                return;
            }
            this.f12611a = true;
            if (this.f12612b != 0) {
                return;
            }
            synchronized (this) {
                this.f12614d.close();
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public final long size() {
        long length;
        ReentrantLock reentrantLock = this.f12613c;
        reentrantLock.lock();
        try {
            if (this.f12611a) {
                throw new IllegalStateException("closed");
            }
            synchronized (this) {
                length = this.f12614d.length();
            }
            return length;
        } finally {
            reentrantLock.unlock();
        }
    }
}
