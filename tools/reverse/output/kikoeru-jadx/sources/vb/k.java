package vb;

import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class k extends d implements RandomAccess {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int[] f22817a;

    public k(int[] iArr) {
        this.f22817a = iArr;
    }

    @Override // vb.a
    public final int a() {
        return this.f22817a.length;
    }

    @Override // vb.a, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (!(obj instanceof Integer)) {
            return false;
        }
        return l.f0(this.f22817a, ((Number) obj).intValue());
    }

    @Override // java.util.List
    public final Object get(int i10) {
        return Integer.valueOf(this.f22817a[i10]);
    }

    @Override // vb.d, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        return l.B0(this.f22817a, ((Number) obj).intValue());
    }

    @Override // vb.a, java.util.Collection
    public final boolean isEmpty() {
        return this.f22817a.length == 0;
    }

    @Override // vb.d, java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Number) obj).intValue();
        int[] iArr = this.f22817a;
        jc.l.e(iArr, "<this>");
        int length = iArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i10 = length - 1;
                if (iIntValue == iArr[length]) {
                    return length;
                }
                if (i10 < 0) {
                    break;
                }
                length = i10;
            }
        }
        return -1;
    }
}
