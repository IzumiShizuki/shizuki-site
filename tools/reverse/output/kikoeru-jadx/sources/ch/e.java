package ch;

import com.tencent.bugly.beta.tinker.TinkerReport;
import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final lh.b0 f4171c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f4174f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f4175g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f4169a = 4096;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f4170b = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public d[] f4172d = new d[8];

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f4173e = 7;

    public e(s sVar) {
        this.f4171c = g8.a.l(sVar);
    }

    public final int a(int i10) {
        int i11;
        int i12 = 0;
        if (i10 > 0) {
            int length = this.f4172d.length;
            while (true) {
                length--;
                i11 = this.f4173e;
                if (length < i11 || i10 <= 0) {
                    break;
                }
                d dVar = this.f4172d[length];
                jc.l.b(dVar);
                int i13 = dVar.f4167c;
                i10 -= i13;
                this.f4175g -= i13;
                this.f4174f--;
                i12++;
            }
            d[] dVarArr = this.f4172d;
            System.arraycopy(dVarArr, i11 + 1, dVarArr, i11 + 1 + i12, this.f4174f);
            this.f4173e += i12;
        }
        return i12;
    }

    public final lh.i b(int i10) throws IOException {
        if (i10 >= 0) {
            d[] dVarArr = g.f4184a;
            if (i10 <= dVarArr.length - 1) {
                return dVarArr[i10].f4165a;
            }
        }
        int length = this.f4173e + 1 + (i10 - g.f4184a.length);
        if (length >= 0) {
            d[] dVarArr2 = this.f4172d;
            if (length < dVarArr2.length) {
                d dVar = dVarArr2[length];
                jc.l.b(dVar);
                return dVar.f4165a;
            }
        }
        throw new IOException("Header index too large " + (i10 + 1));
    }

    public final void c(d dVar) {
        this.f4170b.add(dVar);
        int i10 = dVar.f4167c;
        int i11 = this.f4169a;
        if (i10 > i11) {
            d[] dVarArr = this.f4172d;
            vb.l.p0(0, dVarArr.length, dVarArr);
            this.f4173e = this.f4172d.length - 1;
            this.f4174f = 0;
            this.f4175g = 0;
            return;
        }
        a((this.f4175g + i10) - i11);
        int i12 = this.f4174f + 1;
        d[] dVarArr2 = this.f4172d;
        if (i12 > dVarArr2.length) {
            d[] dVarArr3 = new d[dVarArr2.length * 2];
            System.arraycopy(dVarArr2, 0, dVarArr3, dVarArr2.length, dVarArr2.length);
            this.f4173e = this.f4172d.length - 1;
            this.f4172d = dVarArr3;
        }
        int i13 = this.f4173e;
        this.f4173e = i13 - 1;
        this.f4172d[i13] = dVar;
        this.f4174f++;
        this.f4175g += i10;
    }

    public final lh.i d() {
        lh.b0 b0Var = this.f4171c;
        byte b10 = b0Var.readByte();
        byte[] bArr = wg.e.f24227a;
        int i10 = b10 & 255;
        int i11 = 0;
        boolean z10 = (b10 & 128) == 128;
        long jE = e(i10, 127);
        if (!z10) {
            return b0Var.j(jE);
        }
        lh.f fVar = new lh.f();
        int[] iArr = a0.f4143a;
        jc.l.e(b0Var, "source");
        z zVar = a0.f4145c;
        z zVar2 = zVar;
        int i12 = 0;
        for (long j10 = 0; j10 < jE; j10++) {
            byte b11 = b0Var.readByte();
            byte[] bArr2 = wg.e.f24227a;
            i11 = (i11 << 8) | (b11 & 255);
            i12 += 8;
            while (i12 >= 8) {
                int i13 = (i11 >>> (i12 - 8)) & TinkerReport.KEY_LOADED_EXCEPTION_RESOURCE_CHECK;
                z[] zVarArr = (z[]) zVar2.f4286c;
                jc.l.b(zVarArr);
                zVar2 = zVarArr[i13];
                jc.l.b(zVar2);
                if (((z[]) zVar2.f4286c) == null) {
                    fVar.e0(zVar2.f4284a);
                    i12 -= zVar2.f4285b;
                    zVar2 = zVar;
                } else {
                    i12 -= 8;
                }
            }
        }
        while (i12 > 0) {
            int i14 = (i11 << (8 - i12)) & TinkerReport.KEY_LOADED_EXCEPTION_RESOURCE_CHECK;
            z[] zVarArr2 = (z[]) zVar2.f4286c;
            jc.l.b(zVarArr2);
            z zVar3 = zVarArr2[i14];
            jc.l.b(zVar3);
            int i15 = zVar3.f4285b;
            if (((z[]) zVar3.f4286c) != null || i15 > i12) {
                break;
            }
            fVar.e0(zVar3.f4284a);
            i12 -= i15;
            zVar2 = zVar;
        }
        return fVar.j(fVar.f12571b);
    }

    public final int e(int i10, int i11) {
        int i12 = i10 & i11;
        if (i12 < i11) {
            return i12;
        }
        int i13 = 0;
        while (true) {
            byte b10 = this.f4171c.readByte();
            byte[] bArr = wg.e.f24227a;
            int i14 = b10 & 255;
            if ((b10 & 128) == 0) {
                return i11 + (i14 << i13);
            }
            i11 += (b10 & 127) << i13;
            i13 += 7;
        }
    }
}
