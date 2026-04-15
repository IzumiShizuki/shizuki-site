package c4;

import android.util.SparseArray;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SparseArray f3408a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public w f3409b;

    public v(int i10) {
        this.f3408a = new SparseArray(i10);
    }

    public final void a(w wVar, int i10, int i11) {
        int iA = wVar.a(i10);
        SparseArray sparseArray = this.f3408a;
        v vVar = sparseArray == null ? null : (v) sparseArray.get(iA);
        if (vVar == null) {
            vVar = new v(1);
            sparseArray.put(wVar.a(i10), vVar);
        }
        if (i11 > i10) {
            vVar.a(wVar, i10 + 1, i11);
        } else {
            vVar.f3409b = wVar;
        }
    }
}
