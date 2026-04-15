package lh;

import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class w extends vb.d implements RandomAccess {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i[] f12615a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f12616b;

    public w(i[] iVarArr, int[] iArr) {
        this.f12615a = iVarArr;
        this.f12616b = iArr;
    }

    @Override // vb.a
    public final int a() {
        return this.f12615a.length;
    }

    @Override // vb.a, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof i) {
            return super.contains((i) obj);
        }
        return false;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        return this.f12615a[i10];
    }

    @Override // vb.d, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof i) {
            return super.indexOf((i) obj);
        }
        return -1;
    }

    @Override // vb.d, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof i) {
            return super.lastIndexOf((i) obj);
        }
        return -1;
    }
}
