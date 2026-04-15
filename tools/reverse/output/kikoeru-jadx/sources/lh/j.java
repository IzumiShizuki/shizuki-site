package lh;

import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class j implements h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f12576a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f12577b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f12578c;

    public j(t tVar, long j10) {
        this.f12576a = tVar;
        this.f12577b = j10;
    }

    @Override // lh.h0
    public final long W(f fVar, long j10) {
        long j11;
        long j12;
        int i10;
        jc.l.e(fVar, "sink");
        if (this.f12578c) {
            throw new IllegalStateException("closed");
        }
        t tVar = this.f12576a;
        long j13 = this.f12577b;
        if (j10 < 0) {
            throw new IllegalArgumentException(j2.h0.i(j10, "byteCount < 0: ").toString());
        }
        long j14 = j10 + j13;
        long j15 = j13;
        while (true) {
            if (j15 >= j14) {
                j11 = -1;
                break;
            }
            c0 c0VarR = fVar.R(1);
            byte[] bArr = c0VarR.f12556a;
            int i11 = c0VarR.f12558c;
            j11 = -1;
            int iMin = (int) Math.min(j14 - j15, 8192 - i11);
            synchronized (tVar) {
                jc.l.e(bArr, "array");
                tVar.f12614d.seek(j15);
                i10 = 0;
                while (true) {
                    if (i10 >= iMin) {
                        break;
                    }
                    int i12 = tVar.f12614d.read(bArr, i11, iMin - i10);
                    if (i12 != -1) {
                        i10 += i12;
                    } else if (i10 == 0) {
                        i10 = -1;
                    }
                }
            }
            if (i10 == -1) {
                if (c0VarR.f12557b == c0VarR.f12558c) {
                    fVar.f12570a = c0VarR.a();
                    d0.a(c0VarR);
                }
                if (j13 == j15) {
                    j12 = -1;
                }
            } else {
                c0VarR.f12558c += i10;
                long j16 = i10;
                j15 += j16;
                fVar.f12571b += j16;
            }
        }
        j12 = j15 - j13;
        if (j12 != j11) {
            this.f12577b += j12;
        }
        return j12;
    }

    @Override // lh.h0
    public final j0 a() {
        return j0.f12579d;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        t tVar = this.f12576a;
        if (this.f12578c) {
            return;
        }
        this.f12578c = true;
        ReentrantLock reentrantLock = tVar.f12613c;
        reentrantLock.lock();
        try {
            int i10 = tVar.f12612b - 1;
            tVar.f12612b = i10;
            if (i10 == 0) {
                if (tVar.f12611a) {
                    synchronized (tVar) {
                        tVar.f12614d.close();
                    }
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }
}
