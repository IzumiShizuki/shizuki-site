package g5;

import android.media.MediaCodec;
import android.os.Bundle;
import android.os.HandlerThread;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import p4.c0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class e implements l {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final ArrayDeque f7355g = new ArrayDeque();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Object f7356h = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MediaCodec f7357a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HandlerThread f7358b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public b5.d f7359c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicReference f7360d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p4.f f7361e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f7362f;

    public e(MediaCodec mediaCodec, HandlerThread handlerThread) {
        p4.f fVar = new p4.f();
        this.f7357a = mediaCodec;
        this.f7358b = handlerThread;
        this.f7361e = fVar;
        this.f7360d = new AtomicReference();
    }

    public static d b() {
        ArrayDeque arrayDeque = f7355g;
        synchronized (arrayDeque) {
            try {
                if (arrayDeque.isEmpty()) {
                    return new d();
                }
                return (d) arrayDeque.removeFirst();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static void f(d dVar) {
        ArrayDeque arrayDeque = f7355g;
        synchronized (arrayDeque) {
            arrayDeque.add(dVar);
        }
    }

    @Override // g5.l
    public final void a() {
        RuntimeException runtimeException = (RuntimeException) this.f7360d.getAndSet(null);
        if (runtimeException != null) {
            throw runtimeException;
        }
    }

    @Override // g5.l
    public final void c(Bundle bundle) {
        a();
        b5.d dVar = this.f7359c;
        int i10 = c0.f16548a;
        dVar.obtainMessage(4, bundle).sendToTarget();
    }

    @Override // g5.l
    public final void d(int i10, int i11, int i12, long j10) {
        a();
        d dVarB = b();
        dVarB.f7350a = i10;
        dVarB.f7351b = i11;
        dVarB.f7353d = j10;
        dVarB.f7354e = i12;
        b5.d dVar = this.f7359c;
        int i13 = c0.f16548a;
        dVar.obtainMessage(1, dVarB).sendToTarget();
    }

    @Override // g5.l
    public final void e(int i10, u4.b bVar, long j10, int i11) {
        a();
        d dVarB = b();
        dVarB.f7350a = i10;
        dVarB.f7351b = 0;
        dVarB.f7353d = j10;
        dVarB.f7354e = i11;
        MediaCodec.CryptoInfo cryptoInfo = dVarB.f7352c;
        cryptoInfo.numSubSamples = bVar.f21375f;
        int[] iArr = bVar.f21373d;
        int[] iArrCopyOf = cryptoInfo.numBytesOfClearData;
        if (iArr != null) {
            if (iArrCopyOf == null || iArrCopyOf.length < iArr.length) {
                iArrCopyOf = Arrays.copyOf(iArr, iArr.length);
            } else {
                System.arraycopy(iArr, 0, iArrCopyOf, 0, iArr.length);
            }
        }
        cryptoInfo.numBytesOfClearData = iArrCopyOf;
        int[] iArr2 = bVar.f21374e;
        int[] iArrCopyOf2 = cryptoInfo.numBytesOfEncryptedData;
        if (iArr2 != null) {
            if (iArrCopyOf2 == null || iArrCopyOf2.length < iArr2.length) {
                iArrCopyOf2 = Arrays.copyOf(iArr2, iArr2.length);
            } else {
                System.arraycopy(iArr2, 0, iArrCopyOf2, 0, iArr2.length);
            }
        }
        cryptoInfo.numBytesOfEncryptedData = iArrCopyOf2;
        byte[] bArr = bVar.f21371b;
        byte[] bArrCopyOf = cryptoInfo.key;
        if (bArr != null) {
            if (bArrCopyOf == null || bArrCopyOf.length < bArr.length) {
                bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
            } else {
                System.arraycopy(bArr, 0, bArrCopyOf, 0, bArr.length);
            }
        }
        bArrCopyOf.getClass();
        cryptoInfo.key = bArrCopyOf;
        byte[] bArr2 = bVar.f21370a;
        byte[] bArrCopyOf2 = cryptoInfo.iv;
        if (bArr2 != null) {
            if (bArrCopyOf2 == null || bArrCopyOf2.length < bArr2.length) {
                bArrCopyOf2 = Arrays.copyOf(bArr2, bArr2.length);
            } else {
                System.arraycopy(bArr2, 0, bArrCopyOf2, 0, bArr2.length);
            }
        }
        bArrCopyOf2.getClass();
        cryptoInfo.iv = bArrCopyOf2;
        cryptoInfo.mode = bVar.f21372c;
        if (c0.f16548a >= 24) {
            a3.a.m();
            cryptoInfo.setPattern(a3.a.c(bVar.f21376g, bVar.f21377h));
        }
        this.f7359c.obtainMessage(2, dVarB).sendToTarget();
    }

    @Override // g5.l
    public final void flush() {
        if (this.f7362f) {
            try {
                b5.d dVar = this.f7359c;
                dVar.getClass();
                dVar.removeCallbacksAndMessages(null);
                p4.f fVar = this.f7361e;
                synchronized (fVar) {
                    fVar.f16572a = false;
                }
                b5.d dVar2 = this.f7359c;
                dVar2.getClass();
                dVar2.obtainMessage(3).sendToTarget();
                fVar.c();
            } catch (InterruptedException e10) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e10);
            }
        }
    }

    @Override // g5.l
    public final void shutdown() {
        if (this.f7362f) {
            flush();
            this.f7358b.quit();
        }
        this.f7362f = false;
    }

    @Override // g5.l
    public final void start() {
        if (this.f7362f) {
            return;
        }
        HandlerThread handlerThread = this.f7358b;
        handlerThread.start();
        this.f7359c = new b5.d(this, handlerThread.getLooper(), 5);
        this.f7362f = true;
    }
}
