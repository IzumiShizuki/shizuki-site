package r1;

import java.util.Arrays;
import m4.d1;
import q1.h0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class q extends c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final d1 f18704r = new d1(14);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final s f18705d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f18706e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f18707f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final r f18708g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float[] f18709h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final float[] f18710i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final float[] f18711j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final i f18712k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final p f18713l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final m f18714m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final i f18715n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final p f18716o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final m f18717p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final boolean f18718q;

    public q(String str, float[] fArr, s sVar, final r rVar, int i10) {
        i iVar;
        i iVar2;
        double d10 = rVar.f18719a;
        boolean z10 = d10 == -3.0d;
        double d11 = rVar.f18725g;
        double d12 = rVar.f18724f;
        if (z10) {
            final int i11 = 4;
            iVar = new i() { // from class: r1.o
                @Override // r1.i
                public final double c(double d13) {
                    int i12 = i11;
                    r rVar2 = rVar;
                    switch (i12) {
                        case 0:
                            float[] fArr2 = d.f18653a;
                            return d.a(rVar2, d13);
                        case 1:
                            float[] fArr3 = d.f18653a;
                            return d.c(rVar2, d13);
                        case 2:
                            double d14 = rVar2.f18720b;
                            return d13 >= rVar2.f18723e ? Math.pow((d14 * d13) + rVar2.f18721c, rVar2.f18719a) : d13 * rVar2.f18722d;
                        case 3:
                            double d15 = rVar2.f18720b;
                            double d16 = rVar2.f18721c;
                            double d17 = rVar2.f18722d;
                            return d13 >= rVar2.f18723e ? Math.pow((d15 * d13) + d16, rVar2.f18719a) + rVar2.f18724f : (d17 * d13) + rVar2.f18725g;
                        case 4:
                            float[] fArr4 = d.f18653a;
                            return d.b(rVar2, d13);
                        case 5:
                            float[] fArr5 = d.f18653a;
                            return d.d(rVar2, d13);
                        case 6:
                            double d18 = rVar2.f18720b;
                            double d19 = rVar2.f18721c;
                            double d20 = rVar2.f18722d;
                            return d13 >= rVar2.f18723e * d20 ? (Math.pow(d13, 1.0d / rVar2.f18719a) - d19) / d18 : d13 / d20;
                        default:
                            double d21 = rVar2.f18720b;
                            double d22 = rVar2.f18721c;
                            double d23 = rVar2.f18722d;
                            return d13 >= rVar2.f18723e * d23 ? (Math.pow(d13 - rVar2.f18724f, 1.0d / rVar2.f18719a) - d22) / d21 : (d13 - rVar2.f18725g) / d23;
                    }
                }
            };
        } else if (d10 == -2.0d) {
            final int i12 = 5;
            iVar = new i() { // from class: r1.o
                @Override // r1.i
                public final double c(double d13) {
                    int i122 = i12;
                    r rVar2 = rVar;
                    switch (i122) {
                        case 0:
                            float[] fArr2 = d.f18653a;
                            return d.a(rVar2, d13);
                        case 1:
                            float[] fArr3 = d.f18653a;
                            return d.c(rVar2, d13);
                        case 2:
                            double d14 = rVar2.f18720b;
                            return d13 >= rVar2.f18723e ? Math.pow((d14 * d13) + rVar2.f18721c, rVar2.f18719a) : d13 * rVar2.f18722d;
                        case 3:
                            double d15 = rVar2.f18720b;
                            double d16 = rVar2.f18721c;
                            double d17 = rVar2.f18722d;
                            return d13 >= rVar2.f18723e ? Math.pow((d15 * d13) + d16, rVar2.f18719a) + rVar2.f18724f : (d17 * d13) + rVar2.f18725g;
                        case 4:
                            float[] fArr4 = d.f18653a;
                            return d.b(rVar2, d13);
                        case 5:
                            float[] fArr5 = d.f18653a;
                            return d.d(rVar2, d13);
                        case 6:
                            double d18 = rVar2.f18720b;
                            double d19 = rVar2.f18721c;
                            double d20 = rVar2.f18722d;
                            return d13 >= rVar2.f18723e * d20 ? (Math.pow(d13, 1.0d / rVar2.f18719a) - d19) / d18 : d13 / d20;
                        default:
                            double d21 = rVar2.f18720b;
                            double d22 = rVar2.f18721c;
                            double d23 = rVar2.f18722d;
                            return d13 >= rVar2.f18723e * d23 ? (Math.pow(d13 - rVar2.f18724f, 1.0d / rVar2.f18719a) - d22) / d21 : (d13 - rVar2.f18725g) / d23;
                    }
                }
            };
        } else if (d12 == 0.0d && d11 == 0.0d) {
            final int i13 = 6;
            iVar = new i() { // from class: r1.o
                @Override // r1.i
                public final double c(double d13) {
                    int i122 = i13;
                    r rVar2 = rVar;
                    switch (i122) {
                        case 0:
                            float[] fArr2 = d.f18653a;
                            return d.a(rVar2, d13);
                        case 1:
                            float[] fArr3 = d.f18653a;
                            return d.c(rVar2, d13);
                        case 2:
                            double d14 = rVar2.f18720b;
                            return d13 >= rVar2.f18723e ? Math.pow((d14 * d13) + rVar2.f18721c, rVar2.f18719a) : d13 * rVar2.f18722d;
                        case 3:
                            double d15 = rVar2.f18720b;
                            double d16 = rVar2.f18721c;
                            double d17 = rVar2.f18722d;
                            return d13 >= rVar2.f18723e ? Math.pow((d15 * d13) + d16, rVar2.f18719a) + rVar2.f18724f : (d17 * d13) + rVar2.f18725g;
                        case 4:
                            float[] fArr4 = d.f18653a;
                            return d.b(rVar2, d13);
                        case 5:
                            float[] fArr5 = d.f18653a;
                            return d.d(rVar2, d13);
                        case 6:
                            double d18 = rVar2.f18720b;
                            double d19 = rVar2.f18721c;
                            double d20 = rVar2.f18722d;
                            return d13 >= rVar2.f18723e * d20 ? (Math.pow(d13, 1.0d / rVar2.f18719a) - d19) / d18 : d13 / d20;
                        default:
                            double d21 = rVar2.f18720b;
                            double d22 = rVar2.f18721c;
                            double d23 = rVar2.f18722d;
                            return d13 >= rVar2.f18723e * d23 ? (Math.pow(d13 - rVar2.f18724f, 1.0d / rVar2.f18719a) - d22) / d21 : (d13 - rVar2.f18725g) / d23;
                    }
                }
            };
        } else {
            final int i14 = 7;
            iVar = new i() { // from class: r1.o
                @Override // r1.i
                public final double c(double d13) {
                    int i122 = i14;
                    r rVar2 = rVar;
                    switch (i122) {
                        case 0:
                            float[] fArr2 = d.f18653a;
                            return d.a(rVar2, d13);
                        case 1:
                            float[] fArr3 = d.f18653a;
                            return d.c(rVar2, d13);
                        case 2:
                            double d14 = rVar2.f18720b;
                            return d13 >= rVar2.f18723e ? Math.pow((d14 * d13) + rVar2.f18721c, rVar2.f18719a) : d13 * rVar2.f18722d;
                        case 3:
                            double d15 = rVar2.f18720b;
                            double d16 = rVar2.f18721c;
                            double d17 = rVar2.f18722d;
                            return d13 >= rVar2.f18723e ? Math.pow((d15 * d13) + d16, rVar2.f18719a) + rVar2.f18724f : (d17 * d13) + rVar2.f18725g;
                        case 4:
                            float[] fArr4 = d.f18653a;
                            return d.b(rVar2, d13);
                        case 5:
                            float[] fArr5 = d.f18653a;
                            return d.d(rVar2, d13);
                        case 6:
                            double d18 = rVar2.f18720b;
                            double d19 = rVar2.f18721c;
                            double d20 = rVar2.f18722d;
                            return d13 >= rVar2.f18723e * d20 ? (Math.pow(d13, 1.0d / rVar2.f18719a) - d19) / d18 : d13 / d20;
                        default:
                            double d21 = rVar2.f18720b;
                            double d22 = rVar2.f18721c;
                            double d23 = rVar2.f18722d;
                            return d13 >= rVar2.f18723e * d23 ? (Math.pow(d13 - rVar2.f18724f, 1.0d / rVar2.f18719a) - d22) / d21 : (d13 - rVar2.f18725g) / d23;
                    }
                }
            };
        }
        if (d10 == -3.0d) {
            final int i15 = 0;
            iVar2 = new i() { // from class: r1.o
                @Override // r1.i
                public final double c(double d13) {
                    int i122 = i15;
                    r rVar2 = rVar;
                    switch (i122) {
                        case 0:
                            float[] fArr2 = d.f18653a;
                            return d.a(rVar2, d13);
                        case 1:
                            float[] fArr3 = d.f18653a;
                            return d.c(rVar2, d13);
                        case 2:
                            double d14 = rVar2.f18720b;
                            return d13 >= rVar2.f18723e ? Math.pow((d14 * d13) + rVar2.f18721c, rVar2.f18719a) : d13 * rVar2.f18722d;
                        case 3:
                            double d15 = rVar2.f18720b;
                            double d16 = rVar2.f18721c;
                            double d17 = rVar2.f18722d;
                            return d13 >= rVar2.f18723e ? Math.pow((d15 * d13) + d16, rVar2.f18719a) + rVar2.f18724f : (d17 * d13) + rVar2.f18725g;
                        case 4:
                            float[] fArr4 = d.f18653a;
                            return d.b(rVar2, d13);
                        case 5:
                            float[] fArr5 = d.f18653a;
                            return d.d(rVar2, d13);
                        case 6:
                            double d18 = rVar2.f18720b;
                            double d19 = rVar2.f18721c;
                            double d20 = rVar2.f18722d;
                            return d13 >= rVar2.f18723e * d20 ? (Math.pow(d13, 1.0d / rVar2.f18719a) - d19) / d18 : d13 / d20;
                        default:
                            double d21 = rVar2.f18720b;
                            double d22 = rVar2.f18721c;
                            double d23 = rVar2.f18722d;
                            return d13 >= rVar2.f18723e * d23 ? (Math.pow(d13 - rVar2.f18724f, 1.0d / rVar2.f18719a) - d22) / d21 : (d13 - rVar2.f18725g) / d23;
                    }
                }
            };
        } else if (d10 == -2.0d) {
            final int i16 = 1;
            iVar2 = new i() { // from class: r1.o
                @Override // r1.i
                public final double c(double d13) {
                    int i122 = i16;
                    r rVar2 = rVar;
                    switch (i122) {
                        case 0:
                            float[] fArr2 = d.f18653a;
                            return d.a(rVar2, d13);
                        case 1:
                            float[] fArr3 = d.f18653a;
                            return d.c(rVar2, d13);
                        case 2:
                            double d14 = rVar2.f18720b;
                            return d13 >= rVar2.f18723e ? Math.pow((d14 * d13) + rVar2.f18721c, rVar2.f18719a) : d13 * rVar2.f18722d;
                        case 3:
                            double d15 = rVar2.f18720b;
                            double d16 = rVar2.f18721c;
                            double d17 = rVar2.f18722d;
                            return d13 >= rVar2.f18723e ? Math.pow((d15 * d13) + d16, rVar2.f18719a) + rVar2.f18724f : (d17 * d13) + rVar2.f18725g;
                        case 4:
                            float[] fArr4 = d.f18653a;
                            return d.b(rVar2, d13);
                        case 5:
                            float[] fArr5 = d.f18653a;
                            return d.d(rVar2, d13);
                        case 6:
                            double d18 = rVar2.f18720b;
                            double d19 = rVar2.f18721c;
                            double d20 = rVar2.f18722d;
                            return d13 >= rVar2.f18723e * d20 ? (Math.pow(d13, 1.0d / rVar2.f18719a) - d19) / d18 : d13 / d20;
                        default:
                            double d21 = rVar2.f18720b;
                            double d22 = rVar2.f18721c;
                            double d23 = rVar2.f18722d;
                            return d13 >= rVar2.f18723e * d23 ? (Math.pow(d13 - rVar2.f18724f, 1.0d / rVar2.f18719a) - d22) / d21 : (d13 - rVar2.f18725g) / d23;
                    }
                }
            };
        } else if (d12 == 0.0d && d11 == 0.0d) {
            final int i17 = 2;
            iVar2 = new i() { // from class: r1.o
                @Override // r1.i
                public final double c(double d13) {
                    int i122 = i17;
                    r rVar2 = rVar;
                    switch (i122) {
                        case 0:
                            float[] fArr2 = d.f18653a;
                            return d.a(rVar2, d13);
                        case 1:
                            float[] fArr3 = d.f18653a;
                            return d.c(rVar2, d13);
                        case 2:
                            double d14 = rVar2.f18720b;
                            return d13 >= rVar2.f18723e ? Math.pow((d14 * d13) + rVar2.f18721c, rVar2.f18719a) : d13 * rVar2.f18722d;
                        case 3:
                            double d15 = rVar2.f18720b;
                            double d16 = rVar2.f18721c;
                            double d17 = rVar2.f18722d;
                            return d13 >= rVar2.f18723e ? Math.pow((d15 * d13) + d16, rVar2.f18719a) + rVar2.f18724f : (d17 * d13) + rVar2.f18725g;
                        case 4:
                            float[] fArr4 = d.f18653a;
                            return d.b(rVar2, d13);
                        case 5:
                            float[] fArr5 = d.f18653a;
                            return d.d(rVar2, d13);
                        case 6:
                            double d18 = rVar2.f18720b;
                            double d19 = rVar2.f18721c;
                            double d20 = rVar2.f18722d;
                            return d13 >= rVar2.f18723e * d20 ? (Math.pow(d13, 1.0d / rVar2.f18719a) - d19) / d18 : d13 / d20;
                        default:
                            double d21 = rVar2.f18720b;
                            double d22 = rVar2.f18721c;
                            double d23 = rVar2.f18722d;
                            return d13 >= rVar2.f18723e * d23 ? (Math.pow(d13 - rVar2.f18724f, 1.0d / rVar2.f18719a) - d22) / d21 : (d13 - rVar2.f18725g) / d23;
                    }
                }
            };
        } else {
            final int i18 = 3;
            iVar2 = new i() { // from class: r1.o
                @Override // r1.i
                public final double c(double d13) {
                    int i122 = i18;
                    r rVar2 = rVar;
                    switch (i122) {
                        case 0:
                            float[] fArr2 = d.f18653a;
                            return d.a(rVar2, d13);
                        case 1:
                            float[] fArr3 = d.f18653a;
                            return d.c(rVar2, d13);
                        case 2:
                            double d14 = rVar2.f18720b;
                            return d13 >= rVar2.f18723e ? Math.pow((d14 * d13) + rVar2.f18721c, rVar2.f18719a) : d13 * rVar2.f18722d;
                        case 3:
                            double d15 = rVar2.f18720b;
                            double d16 = rVar2.f18721c;
                            double d17 = rVar2.f18722d;
                            return d13 >= rVar2.f18723e ? Math.pow((d15 * d13) + d16, rVar2.f18719a) + rVar2.f18724f : (d17 * d13) + rVar2.f18725g;
                        case 4:
                            float[] fArr4 = d.f18653a;
                            return d.b(rVar2, d13);
                        case 5:
                            float[] fArr5 = d.f18653a;
                            return d.d(rVar2, d13);
                        case 6:
                            double d18 = rVar2.f18720b;
                            double d19 = rVar2.f18721c;
                            double d20 = rVar2.f18722d;
                            return d13 >= rVar2.f18723e * d20 ? (Math.pow(d13, 1.0d / rVar2.f18719a) - d19) / d18 : d13 / d20;
                        default:
                            double d21 = rVar2.f18720b;
                            double d22 = rVar2.f18721c;
                            double d23 = rVar2.f18722d;
                            return d13 >= rVar2.f18723e * d23 ? (Math.pow(d13 - rVar2.f18724f, 1.0d / rVar2.f18719a) - d22) / d21 : (d13 - rVar2.f18725g) / d23;
                    }
                }
            };
        }
        this(str, fArr, sVar, null, iVar, iVar2, 0.0f, 1.0f, rVar, i10);
    }

    @Override // r1.c
    public final float a(int i10) {
        return this.f18707f;
    }

    @Override // r1.c
    public final float b(int i10) {
        return this.f18706e;
    }

    @Override // r1.c
    public final boolean c() {
        return this.f18718q;
    }

    @Override // r1.c
    public final long d(float f10, float f11, float f12) {
        double d10 = f10;
        m mVar = this.f18717p;
        float fC = (float) mVar.c(d10);
        float fC2 = (float) mVar.c(f11);
        float fC3 = (float) mVar.c(f12);
        float[] fArr = this.f18710i;
        if (fArr.length < 9) {
            return 0L;
        }
        float f13 = (fArr[6] * fC3) + (fArr[3] * fC2) + (fArr[0] * fC);
        return (((long) Float.floatToRawIntBits((fArr[7] * fC3) + (fArr[4] * fC2) + (fArr[1] * fC))) & 4294967295L) | (Float.floatToRawIntBits(f13) << 32);
    }

    @Override // r1.c
    public final float e(float f10, float f11, float f12) {
        double d10 = f10;
        m mVar = this.f18717p;
        float fC = (float) mVar.c(d10);
        float fC2 = (float) mVar.c(f11);
        float fC3 = (float) mVar.c(f12);
        float[] fArr = this.f18710i;
        return (fArr[8] * fC3) + (fArr[5] * fC2) + (fArr[2] * fC);
    }

    @Override // r1.c
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || q.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        q qVar = (q) obj;
        r rVar = qVar.f18708g;
        if (Float.compare(qVar.f18706e, this.f18706e) != 0 || Float.compare(qVar.f18707f, this.f18707f) != 0 || !jc.l.a(this.f18705d, qVar.f18705d) || !Arrays.equals(this.f18709h, qVar.f18709h)) {
            return false;
        }
        r rVar2 = this.f18708g;
        if (rVar2 != null) {
            return jc.l.a(rVar2, rVar);
        }
        if (rVar == null) {
            return true;
        }
        if (jc.l.a(this.f18712k, qVar.f18712k)) {
            return jc.l.a(this.f18715n, qVar.f18715n);
        }
        return false;
    }

    @Override // r1.c
    public final long f(float f10, float f11, float f12, float f13, c cVar) {
        float[] fArr = this.f18711j;
        float f14 = (fArr[6] * f12) + (fArr[3] * f11) + (fArr[0] * f10);
        float f15 = (fArr[7] * f12) + (fArr[4] * f11) + (fArr[1] * f10);
        float f16 = (fArr[8] * f12) + (fArr[5] * f11) + (fArr[2] * f10);
        m mVar = this.f18714m;
        return h0.b((float) mVar.c(f14), (float) mVar.c(f15), (float) mVar.c(f16), f13, cVar);
    }

    @Override // r1.c
    public final int hashCode() {
        int iHashCode = (Arrays.hashCode(this.f18709h) + ((this.f18705d.hashCode() + (super.hashCode() * 31)) * 31)) * 31;
        float f10 = this.f18706e;
        int iFloatToIntBits = (iHashCode + (f10 == 0.0f ? 0 : Float.floatToIntBits(f10))) * 31;
        float f11 = this.f18707f;
        int iFloatToIntBits2 = (iFloatToIntBits + (f11 == 0.0f ? 0 : Float.floatToIntBits(f11))) * 31;
        r rVar = this.f18708g;
        int iHashCode2 = iFloatToIntBits2 + (rVar != null ? rVar.hashCode() : 0);
        if (rVar == null) {
            return this.f18715n.hashCode() + ((this.f18712k.hashCode() + (iHashCode2 * 31)) * 31);
        }
        return iHashCode2;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0265  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public q(java.lang.String r33, float[] r34, r1.s r35, float[] r36, r1.i r37, r1.i r38, float r39, float r40, r1.r r41, int r42) {
        /*
            Method dump skipped, instruction units count: 673
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: r1.q.<init>(java.lang.String, float[], r1.s, float[], r1.i, r1.i, float, float, r1.r, int):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public q(String str, float[] fArr, s sVar, final double d10, float f10, float f11, int i10) {
        i iVar;
        i iVar2 = f18704r;
        if (d10 == 1.0d) {
            iVar = iVar2;
        } else {
            final int i11 = 0;
            iVar = new i() { // from class: r1.n
                @Override // r1.i
                public final double c(double d11) {
                    switch (i11) {
                        case 0:
                            if (d11 < 0.0d) {
                                d11 = 0.0d;
                            }
                            return Math.pow(d11, 1.0d / d10);
                        default:
                            if (d11 < 0.0d) {
                                d11 = 0.0d;
                            }
                            return Math.pow(d11, d10);
                    }
                }
            };
        }
        if (d10 != 1.0d) {
            final int i12 = 1;
            iVar2 = new i() { // from class: r1.n
                @Override // r1.i
                public final double c(double d11) {
                    switch (i12) {
                        case 0:
                            if (d11 < 0.0d) {
                                d11 = 0.0d;
                            }
                            return Math.pow(d11, 1.0d / d10);
                        default:
                            if (d11 < 0.0d) {
                                d11 = 0.0d;
                            }
                            return Math.pow(d11, d10);
                    }
                }
            };
        }
        this(str, fArr, sVar, null, iVar, iVar2, f10, f11, new r(d10, 1.0d, 0.0d, 0.0d, 0.0d), i10);
    }
}
