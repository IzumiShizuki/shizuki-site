package y2;

import j2.h0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class e implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f25403a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f25404b;

    public e(int i10, int i11) {
        this.f25403a = i10;
        this.f25404b = i11;
        if (i10 >= 0 && i11 >= 0) {
            return;
        }
        z2.a.a("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were " + i10 + " and " + i11 + " respectively.");
    }

    @Override // y2.g
    public final void a(l6.d dVar) {
        int i10 = dVar.f11737c;
        ce.g gVar = (ce.g) dVar.f11740f;
        int i11 = this.f25404b;
        int iN = i10 + i11;
        if (((i10 ^ iN) & (i11 ^ iN)) < 0) {
            iN = gVar.n();
        }
        dVar.a(dVar.f11737c, Math.min(iN, gVar.n()));
        int i12 = dVar.f11736b;
        int i13 = this.f25403a;
        int i14 = i12 - i13;
        if (((i12 ^ i14) & (i13 ^ i12)) < 0) {
            i14 = 0;
        }
        dVar.a(Math.max(0, i14), dVar.f11736b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f25403a == eVar.f25403a && this.f25404b == eVar.f25404b;
    }

    public final int hashCode() {
        return (this.f25403a * 31) + this.f25404b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DeleteSurroundingTextCommand(lengthBeforeCursor=");
        sb.append(this.f25403a);
        sb.append(", lengthAfterCursor=");
        return h0.m(sb, this.f25404b, ')');
    }
}
