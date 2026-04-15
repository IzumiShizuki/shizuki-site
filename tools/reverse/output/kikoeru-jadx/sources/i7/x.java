package i7;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class x extends vb.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f9359a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f9360b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f9361c;

    public x(ArrayList arrayList, int i10, int i11) {
        this.f9359a = i10;
        this.f9360b = i11;
        this.f9361c = arrayList;
    }

    @Override // vb.a
    public final int a() {
        return this.f9361c.size() + this.f9359a + this.f9360b;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        int i11 = this.f9359a;
        if (i10 >= 0 && i10 < i11) {
            return null;
        }
        ArrayList arrayList = this.f9361c;
        if (i10 < arrayList.size() + i11 && i11 <= i10) {
            return arrayList.get(i10 - i11);
        }
        int size = arrayList.size() + i11;
        if (i10 < a() && size <= i10) {
            return null;
        }
        StringBuilder sbO = j2.h0.o(i10, "Illegal attempt to access index ", " in ItemSnapshotList of size ");
        sbO.append(a());
        throw new IndexOutOfBoundsException(sbO.toString());
    }
}
