package r;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class h0 implements u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g0 f18437a;

    public h0(g0 g0Var) {
        this.f18437a = g0Var;
    }

    @Override // r.j
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public final e2 a(v1 v1Var) {
        int[] iArr;
        Object[] objArr;
        int[] iArr2;
        Object[] objArr2;
        char c3;
        g0 g0Var = this.f18437a;
        o.y yVar = g0Var.f18412b;
        o.x xVar = new o.x(yVar.f16011e + 2);
        o.y yVar2 = new o.y(yVar.f16011e);
        int[] iArr3 = yVar.f16008b;
        Object[] objArr3 = yVar.f16009c;
        long[] jArr = yVar.f16007a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i10 = 0;
            while (true) {
                long j10 = jArr[i10];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    int i12 = 0;
                    while (i12 < i11) {
                        if ((j10 & 255) < 128) {
                            int i13 = (i10 << 3) + i12;
                            int i14 = iArr3[i13];
                            c3 = '\b';
                            f0 f0Var = (f0) objArr3[i13];
                            xVar.a(i14);
                            iArr2 = iArr3;
                            objArr2 = objArr3;
                            yVar2.h(i14, new d2((p) v1Var.f18596a.a(f0Var.f18399a), f0Var.f18400b));
                        } else {
                            iArr2 = iArr3;
                            objArr2 = objArr3;
                            c3 = '\b';
                        }
                        j10 >>= c3;
                        i12++;
                        iArr3 = iArr2;
                        objArr3 = objArr2;
                    }
                    iArr = iArr3;
                    objArr = objArr3;
                    if (i11 != 8) {
                        break;
                    }
                } else {
                    iArr = iArr3;
                    objArr = objArr3;
                }
                if (i10 == length) {
                    break;
                }
                i10++;
                iArr3 = iArr;
                objArr3 = objArr;
            }
        }
        if (!yVar.a(0)) {
            int i15 = xVar.f16071b;
            if (i15 < 0) {
                p.a.d("Index must be between 0 and size");
                throw null;
            }
            xVar.b(i15 + 1);
            int[] iArr4 = xVar.f16070a;
            int i16 = xVar.f16071b;
            if (i16 != 0) {
                vb.l.h0(1, 0, i16, iArr4, iArr4);
            }
            iArr4[0] = 0;
            xVar.f16071b++;
        }
        if (!yVar.a(g0Var.f18411a)) {
            xVar.a(g0Var.f18411a);
        }
        int i17 = xVar.f16071b;
        if (i17 != 0) {
            int[] iArr5 = xVar.f16070a;
            jc.l.e(iArr5, "<this>");
            Arrays.sort(iArr5, 0, i17);
        }
        return new e2(xVar, yVar2, g0Var.f18411a, w.f18601d);
    }
}
