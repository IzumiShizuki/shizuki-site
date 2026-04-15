package y;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class g implements f, h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f25125a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f25126b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ic.n f25127c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f25128d;

    public g(float f10, boolean z10, ic.n nVar) {
        this.f25125a = f10;
        this.f25126b = z10;
        this.f25127c = nVar;
        this.f25128d = f10;
    }

    @Override // y.f, y.h
    public final float a() {
        return this.f25128d;
    }

    @Override // y.f
    public final void b(f3.c cVar, int i10, int[] iArr, f3.m mVar, int[] iArr2) {
        int i11;
        int iMin;
        if (iArr.length == 0) {
            return;
        }
        int iA0 = cVar.a0(this.f25125a);
        boolean z10 = this.f25126b && mVar == f3.m.f6668b;
        o0 o0Var = k.f25156a;
        if (z10) {
            i11 = 0;
            iMin = 0;
            for (int length = iArr.length - 1; -1 < length; length--) {
                int i12 = iArr[length];
                int iMin2 = Math.min(i11, i10 - i12);
                iArr2[length] = iMin2;
                iMin = Math.min(iA0, (i10 - iMin2) - i12);
                i11 = iArr2[length] + i12 + iMin;
            }
        } else {
            int length2 = iArr.length;
            int i13 = 0;
            i11 = 0;
            iMin = 0;
            int i14 = 0;
            while (i13 < length2) {
                int i15 = iArr[i13];
                int iMin3 = Math.min(i11, i10 - i15);
                iArr2[i14] = iMin3;
                int iMin4 = Math.min(iA0, (i10 - iMin3) - i15);
                int i16 = iArr2[i14] + i15 + iMin4;
                i13++;
                iMin = iMin4;
                i11 = i16;
                i14++;
            }
        }
        int i17 = i11 - iMin;
        ic.n nVar = this.f25127c;
        if (nVar == null || i17 >= i10) {
            return;
        }
        int iIntValue = ((Number) nVar.q(Integer.valueOf(i10 - i17), mVar)).intValue();
        int length3 = iArr2.length;
        for (int i18 = 0; i18 < length3; i18++) {
            iArr2[i18] = iArr2[i18] + iIntValue;
        }
    }

    @Override // y.h
    public final void c(f3.c cVar, int i10, int[] iArr, int[] iArr2) {
        b(cVar, i10, iArr, f3.m.f6667a, iArr2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return f3.f.a(this.f25125a, gVar.f25125a) && this.f25126b == gVar.f25126b && jc.l.a(this.f25127c, gVar.f25127c);
    }

    public final int hashCode() {
        int iFloatToIntBits = ((Float.floatToIntBits(this.f25125a) * 31) + (this.f25126b ? 1231 : 1237)) * 31;
        ic.n nVar = this.f25127c;
        return iFloatToIntBits + (nVar == null ? 0 : nVar.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f25126b ? "" : "Absolute");
        sb.append("Arrangement#spacedAligned(");
        sb.append((Object) f3.f.b(this.f25125a));
        sb.append(", ");
        sb.append(this.f25127c);
        sb.append(')');
        return sb.toString();
    }
}
