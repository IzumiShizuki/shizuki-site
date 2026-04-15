package m6;

import java.io.EOFException;
import p4.s;
import r5.o;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f14784a = new f();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s f14785b = new s(new byte[65025], 0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f14786c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f14787d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f14788e;

    public final int a(int i10) {
        int i11;
        int i12 = 0;
        this.f14787d = 0;
        do {
            int i13 = this.f14787d;
            int i14 = i10 + i13;
            f fVar = this.f14784a;
            if (i14 >= fVar.f14791c) {
                break;
            }
            int[] iArr = fVar.f14794f;
            this.f14787d = i13 + 1;
            i11 = iArr[i14];
            i12 += i11;
        } while (i11 == 255);
        return i12;
    }

    public final boolean b(o oVar) {
        int i10;
        p4.c.i(oVar != null);
        boolean z10 = this.f14788e;
        s sVar = this.f14785b;
        if (z10) {
            this.f14788e = false;
            sVar.D(0);
        }
        while (!this.f14788e) {
            int i11 = this.f14786c;
            f fVar = this.f14784a;
            if (i11 < 0) {
                if (fVar.b(oVar, -1L) && fVar.a(oVar, true)) {
                    int iA = fVar.f14792d;
                    if ((fVar.f14789a & 1) == 1 && sVar.f16613c == 0) {
                        iA += a(0);
                        i10 = this.f14787d;
                    } else {
                        i10 = 0;
                    }
                    try {
                        oVar.r(iA);
                        this.f14786c = i10;
                    } catch (EOFException unused) {
                    }
                }
                return false;
            }
            int iA2 = a(this.f14786c);
            int i12 = this.f14786c + this.f14787d;
            if (iA2 > 0) {
                sVar.b(sVar.f16613c + iA2);
                try {
                    oVar.readFully(sVar.f16611a, sVar.f16613c, iA2);
                    sVar.F(sVar.f16613c + iA2);
                    this.f14788e = fVar.f14794f[i12 + (-1)] != 255;
                } catch (EOFException unused2) {
                    return false;
                }
            }
            if (i12 == fVar.f14791c) {
                i12 = -1;
            }
            this.f14786c = i12;
        }
        return true;
    }
}
