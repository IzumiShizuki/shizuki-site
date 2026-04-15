package y2;

import j2.h0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class f implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f25405a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f25406b;

    public f(int i10, int i11) {
        this.f25405a = i10;
        this.f25406b = i11;
        if (i10 >= 0 && i11 >= 0) {
            return;
        }
        z2.a.a("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were " + i10 + " and " + i11 + " respectively.");
    }

    @Override // y2.g
    public final void a(l6.d dVar) {
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            if (i11 < this.f25405a) {
                int i13 = i12 + 1;
                int i14 = dVar.f11736b;
                if (i14 <= i13) {
                    i12 = i14;
                    break;
                } else {
                    i12 = (Character.isHighSurrogate(dVar.b((i14 - i13) + (-1))) && Character.isLowSurrogate(dVar.b(dVar.f11736b - i13))) ? i12 + 2 : i13;
                    i11++;
                }
            } else {
                break;
            }
        }
        int iN = 0;
        while (true) {
            if (i10 >= this.f25406b) {
                break;
            }
            int i15 = iN + 1;
            int i16 = dVar.f11737c;
            ce.g gVar = (ce.g) dVar.f11740f;
            if (i16 + i15 >= gVar.n()) {
                iN = gVar.n() - dVar.f11737c;
                break;
            } else {
                iN = (Character.isHighSurrogate(dVar.b((dVar.f11737c + i15) + (-1))) && Character.isLowSurrogate(dVar.b(dVar.f11737c + i15))) ? iN + 2 : i15;
                i10++;
            }
        }
        int i17 = dVar.f11737c;
        dVar.a(i17, iN + i17);
        int i18 = dVar.f11736b;
        dVar.a(i18 - i12, i18);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f25405a == fVar.f25405a && this.f25406b == fVar.f25406b;
    }

    public final int hashCode() {
        return (this.f25405a * 31) + this.f25406b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DeleteSurroundingTextInCodePointsCommand(lengthBeforeCursor=");
        sb.append(this.f25405a);
        sb.append(", lengthAfterCursor=");
        return h0.m(sb, this.f25406b, ')');
    }
}
