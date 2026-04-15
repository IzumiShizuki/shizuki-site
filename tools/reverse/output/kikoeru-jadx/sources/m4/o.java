package m4;

import android.util.SparseBooleanArray;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SparseBooleanArray f14437a;

    public o(SparseBooleanArray sparseBooleanArray) {
        this.f14437a = sparseBooleanArray;
    }

    public final boolean a(int... iArr) {
        for (int i10 : iArr) {
            if (this.f14437a.get(i10)) {
                return true;
            }
        }
        return false;
    }

    public final int b(int i10) {
        SparseBooleanArray sparseBooleanArray = this.f14437a;
        p4.c.f(i10, sparseBooleanArray.size());
        return sparseBooleanArray.keyAt(i10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        SparseBooleanArray sparseBooleanArray = oVar.f14437a;
        int i10 = p4.c0.f16548a;
        SparseBooleanArray sparseBooleanArray2 = this.f14437a;
        if (i10 >= 24) {
            return sparseBooleanArray2.equals(sparseBooleanArray);
        }
        if (sparseBooleanArray2.size() != sparseBooleanArray.size()) {
            return false;
        }
        for (int i11 = 0; i11 < sparseBooleanArray2.size(); i11++) {
            if (b(i11) != oVar.b(i11)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i10 = p4.c0.f16548a;
        SparseBooleanArray sparseBooleanArray = this.f14437a;
        if (i10 >= 24) {
            return sparseBooleanArray.hashCode();
        }
        int size = sparseBooleanArray.size();
        for (int i11 = 0; i11 < sparseBooleanArray.size(); i11++) {
            size = (size * 31) + b(i11);
        }
        return size;
    }
}
