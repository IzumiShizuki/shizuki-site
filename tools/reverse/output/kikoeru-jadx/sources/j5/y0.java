package j5;

import android.media.MediaCodec;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n5.f f10486a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f10487b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p4.s f10488c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public x0 f10489d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public x0 f10490e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public x0 f10491f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f10492g;

    public y0(n5.f fVar) {
        this.f10486a = fVar;
        int i10 = fVar.f15328b;
        this.f10487b = i10;
        this.f10488c = new p4.s(32);
        x0 x0Var = new x0(0L, i10);
        this.f10489d = x0Var;
        this.f10490e = x0Var;
        this.f10491f = x0Var;
    }

    public static x0 d(x0 x0Var, long j10, ByteBuffer byteBuffer, int i10) {
        while (j10 >= x0Var.f10475b) {
            x0Var = (x0) x0Var.f10477d;
        }
        while (i10 > 0) {
            int iMin = Math.min(i10, (int) (x0Var.f10475b - j10));
            n5.a aVar = (n5.a) x0Var.f10476c;
            byteBuffer.put(aVar.f15317a, ((int) (j10 - x0Var.f10474a)) + aVar.f15318b, iMin);
            i10 -= iMin;
            j10 += (long) iMin;
            if (j10 == x0Var.f10475b) {
                x0Var = (x0) x0Var.f10477d;
            }
        }
        return x0Var;
    }

    public static x0 e(x0 x0Var, long j10, byte[] bArr, int i10) {
        while (j10 >= x0Var.f10475b) {
            x0Var = (x0) x0Var.f10477d;
        }
        int i11 = i10;
        while (i11 > 0) {
            int iMin = Math.min(i11, (int) (x0Var.f10475b - j10));
            n5.a aVar = (n5.a) x0Var.f10476c;
            System.arraycopy(aVar.f15317a, ((int) (j10 - x0Var.f10474a)) + aVar.f15318b, bArr, i10 - i11, iMin);
            i11 -= iMin;
            j10 += (long) iMin;
            if (j10 == x0Var.f10475b) {
                x0Var = (x0) x0Var.f10477d;
            }
        }
        return x0Var;
    }

    public static x0 f(x0 x0Var, u4.f fVar, f5.g gVar, p4.s sVar) {
        if (fVar.d(1073741824)) {
            long j10 = gVar.f6701b;
            int iA = 1;
            sVar.D(1);
            x0 x0VarE = e(x0Var, j10, sVar.f16611a, 1);
            long j11 = j10 + 1;
            byte b10 = sVar.f16611a[0];
            boolean z10 = (b10 & 128) != 0;
            int i10 = b10 & 127;
            u4.b bVar = fVar.f21381d;
            byte[] bArr = bVar.f21370a;
            if (bArr == null) {
                bVar.f21370a = new byte[16];
            } else {
                Arrays.fill(bArr, (byte) 0);
            }
            x0Var = e(x0VarE, j11, bVar.f21370a, i10);
            long j12 = j11 + ((long) i10);
            if (z10) {
                sVar.D(2);
                x0Var = e(x0Var, j12, sVar.f16611a, 2);
                j12 += 2;
                iA = sVar.A();
            }
            int[] iArr = bVar.f21373d;
            if (iArr == null || iArr.length < iA) {
                iArr = new int[iA];
            }
            int[] iArr2 = bVar.f21374e;
            if (iArr2 == null || iArr2.length < iA) {
                iArr2 = new int[iA];
            }
            if (z10) {
                int i11 = iA * 6;
                sVar.D(i11);
                x0Var = e(x0Var, j12, sVar.f16611a, i11);
                j12 += (long) i11;
                sVar.G(0);
                for (int i12 = 0; i12 < iA; i12++) {
                    iArr[i12] = sVar.A();
                    iArr2[i12] = sVar.y();
                }
            } else {
                iArr[0] = 0;
                iArr2[0] = gVar.f6700a - ((int) (j12 - gVar.f6701b));
            }
            r5.g0 g0Var = (r5.g0) gVar.f6702c;
            int i13 = p4.c0.f16548a;
            byte[] bArr2 = g0Var.f18820b;
            byte[] bArr3 = bVar.f21370a;
            int i14 = g0Var.f18819a;
            int i15 = g0Var.f18821c;
            int i16 = g0Var.f18822d;
            bVar.f21375f = iA;
            bVar.f21373d = iArr;
            bVar.f21374e = iArr2;
            bVar.f21371b = bArr2;
            bVar.f21370a = bArr3;
            bVar.f21372c = i14;
            bVar.f21376g = i15;
            bVar.f21377h = i16;
            MediaCodec.CryptoInfo cryptoInfo = bVar.f21378i;
            cryptoInfo.numSubSamples = iA;
            cryptoInfo.numBytesOfClearData = iArr;
            cryptoInfo.numBytesOfEncryptedData = iArr2;
            cryptoInfo.key = bArr2;
            cryptoInfo.iv = bArr3;
            cryptoInfo.mode = i14;
            if (p4.c0.f16548a >= 24) {
                m0.w wVar = bVar.f21379j;
                wVar.getClass();
                ((MediaCodec.CryptoInfo.Pattern) wVar.f13783c).set(i15, i16);
                ((MediaCodec.CryptoInfo) wVar.f13782b).setPattern((MediaCodec.CryptoInfo.Pattern) wVar.f13783c);
            }
            long j13 = gVar.f6701b;
            int i17 = (int) (j12 - j13);
            gVar.f6701b = j13 + ((long) i17);
            gVar.f6700a -= i17;
        }
        if (!fVar.d(268435456)) {
            fVar.j(gVar.f6700a);
            return d(x0Var, gVar.f6701b, fVar.f21382e, gVar.f6700a);
        }
        sVar.D(4);
        x0 x0VarE2 = e(x0Var, gVar.f6701b, sVar.f16611a, 4);
        int iY = sVar.y();
        gVar.f6701b += 4;
        gVar.f6700a -= 4;
        fVar.j(iY);
        x0 x0VarD = d(x0VarE2, gVar.f6701b, fVar.f21382e, iY);
        gVar.f6701b += (long) iY;
        int i18 = gVar.f6700a - iY;
        gVar.f6700a = i18;
        ByteBuffer byteBuffer = fVar.f21385h;
        if (byteBuffer == null || byteBuffer.capacity() < i18) {
            fVar.f21385h = ByteBuffer.allocate(i18);
        } else {
            fVar.f21385h.clear();
        }
        return d(x0VarD, gVar.f6701b, fVar.f21385h, gVar.f6700a);
    }

    public final void a(x0 x0Var) {
        if (((n5.a) x0Var.f10476c) == null) {
            return;
        }
        n5.f fVar = this.f10486a;
        synchronized (fVar) {
            x0 x0Var2 = x0Var;
            while (x0Var2 != null) {
                try {
                    n5.a[] aVarArr = fVar.f15332f;
                    int i10 = fVar.f15331e;
                    fVar.f15331e = i10 + 1;
                    n5.a aVar = (n5.a) x0Var2.f10476c;
                    aVar.getClass();
                    aVarArr[i10] = aVar;
                    fVar.f15330d--;
                    x0Var2 = (x0) x0Var2.f10477d;
                    if (x0Var2 == null || ((n5.a) x0Var2.f10476c) == null) {
                        x0Var2 = null;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            fVar.notifyAll();
        }
        x0Var.f10476c = null;
        x0Var.f10477d = null;
    }

    public final void b(long j10) {
        x0 x0Var;
        if (j10 == -1) {
            return;
        }
        while (true) {
            x0Var = this.f10489d;
            if (j10 < x0Var.f10475b) {
                break;
            }
            n5.f fVar = this.f10486a;
            n5.a aVar = (n5.a) x0Var.f10476c;
            synchronized (fVar) {
                n5.a[] aVarArr = fVar.f15332f;
                int i10 = fVar.f15331e;
                fVar.f15331e = i10 + 1;
                aVarArr[i10] = aVar;
                fVar.f15330d--;
                fVar.notifyAll();
            }
            x0 x0Var2 = this.f10489d;
            x0Var2.f10476c = null;
            x0 x0Var3 = (x0) x0Var2.f10477d;
            x0Var2.f10477d = null;
            this.f10489d = x0Var3;
        }
        if (this.f10490e.f10474a < x0Var.f10474a) {
            this.f10490e = x0Var;
        }
    }

    public final int c(int i10) {
        n5.a aVar;
        x0 x0Var = this.f10491f;
        if (((n5.a) x0Var.f10476c) == null) {
            n5.f fVar = this.f10486a;
            synchronized (fVar) {
                try {
                    int i11 = fVar.f15330d + 1;
                    fVar.f15330d = i11;
                    int i12 = fVar.f15331e;
                    if (i12 > 0) {
                        n5.a[] aVarArr = fVar.f15332f;
                        int i13 = i12 - 1;
                        fVar.f15331e = i13;
                        aVar = aVarArr[i13];
                        aVar.getClass();
                        fVar.f15332f[fVar.f15331e] = null;
                    } else {
                        n5.a aVar2 = new n5.a(new byte[fVar.f15328b], 0);
                        n5.a[] aVarArr2 = fVar.f15332f;
                        if (i11 > aVarArr2.length) {
                            fVar.f15332f = (n5.a[]) Arrays.copyOf(aVarArr2, aVarArr2.length * 2);
                        }
                        aVar = aVar2;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            x0 x0Var2 = new x0(this.f10491f.f10475b, this.f10487b);
            x0Var.f10476c = aVar;
            x0Var.f10477d = x0Var2;
        }
        return Math.min(i10, (int) (this.f10491f.f10475b - this.f10492g));
    }
}
