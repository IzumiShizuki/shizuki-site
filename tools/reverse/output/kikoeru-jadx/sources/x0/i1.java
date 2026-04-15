package x0;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class i1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f24320a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f24321b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f24322c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f24323d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final o.y f24324e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ub.p f24325f;

    public i1(int i10, ArrayList arrayList) {
        this.f24320a = arrayList;
        this.f24321b = i10;
        if (i10 < 0) {
            k1.a("Invalid start index");
        }
        this.f24323d = new ArrayList();
        o.y yVar = new o.y();
        int size = arrayList.size();
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            o0 o0Var = (o0) this.f24320a.get(i12);
            int i13 = o0Var.f24403c;
            int i14 = o0Var.f24404d;
            yVar.h(i13, new i0(i12, i11, i14));
            i11 += i14;
        }
        this.f24324e = yVar;
        this.f24325f = ub.a.d(new h1(0, this));
    }

    public final boolean a(int i10, int i11) {
        int i12;
        o.y yVar = this.f24324e;
        i0 i0Var = (i0) yVar.b(i10);
        if (i0Var == null) {
            return false;
        }
        int i13 = i0Var.f24318b;
        int i14 = i11 - i0Var.f24319c;
        i0Var.f24319c = i11;
        if (i14 == 0) {
            return true;
        }
        Object[] objArr = yVar.f16009c;
        long[] jArr = yVar.f16007a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i15 = 0;
        while (true) {
            long j10 = jArr[i15];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i16 = 8 - ((~(i15 - length)) >>> 31);
                for (int i17 = 0; i17 < i16; i17++) {
                    if ((255 & j10) < 128) {
                        i0 i0Var2 = (i0) objArr[(i15 << 3) + i17];
                        if (i0Var2.f24318b >= i13 && !i0Var2.equals(i0Var) && (i12 = i0Var2.f24318b + i14) >= 0) {
                            i0Var2.f24318b = i12;
                        }
                    }
                    j10 >>= 8;
                }
                if (i16 != 8) {
                    return true;
                }
            }
            if (i15 == length) {
                return true;
            }
            i15++;
        }
    }
}
