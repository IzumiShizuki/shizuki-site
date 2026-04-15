package m7;

import android.util.SparseArray;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import i7.j1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;
import q.t0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f14936a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f14937b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f14938c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f14939d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public x f14940e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ RecyclerView f14941f;

    public y(RecyclerView recyclerView) {
        this.f14941f = recyclerView;
        ArrayList arrayList = new ArrayList();
        this.f14936a = arrayList;
        this.f14937b = new ArrayList();
        Collections.unmodifiableList(arrayList);
        this.f14938c = 2;
        this.f14939d = 2;
    }

    public final x a() {
        if (this.f14940e == null) {
            x xVar = new x();
            xVar.f14933a = new SparseArray();
            xVar.f14934b = 0;
            xVar.f14935c = Collections.newSetFromMap(new IdentityHashMap());
            this.f14940e = xVar;
        }
        return this.f14940e;
    }

    public final void b(boolean z10) {
        x xVar = this.f14940e;
        if (xVar != null) {
            SparseArray sparseArray = xVar.f14933a;
            Set set = xVar.f14935c;
            set.remove(null);
            if (set.size() != 0 || z10 || sparseArray.size() <= 0) {
                return;
            }
            ((w) sparseArray.get(sparseArray.keyAt(0))).getClass();
            throw null;
        }
    }

    public final void c() {
        ArrayList arrayList = this.f14937b;
        int size = arrayList.size() - 1;
        if (size >= 0) {
            if (arrayList.get(size) != null) {
                throw new ClassCastException();
            }
            int[] iArr = RecyclerView.f1022y0;
            throw null;
        }
        arrayList.clear();
        if (RecyclerView.A0) {
            j1 j1Var = this.f14941f.U;
            j1Var.getClass();
            j1Var.f9178c = 0;
        }
    }

    public final void d(int i10) {
        RecyclerView recyclerView = this.f14941f;
        b0 b0Var = recyclerView.V;
        if (i10 < 0 || i10 >= b0Var.a()) {
            throw new IndexOutOfBoundsException("Invalid item position " + i10 + "(" + i10 + "). Item count:" + b0Var.a() + recyclerView.m());
        }
        boolean z10 = b0Var.f14831c;
        ArrayList arrayList = this.f14936a;
        if (arrayList.size() > 0) {
            throw t0.A(0, arrayList);
        }
        ArrayList arrayList2 = (ArrayList) recyclerView.f1028e.f3620d;
        if (arrayList2.size() > 0) {
            RecyclerView.p((View) arrayList2.get(0));
            throw null;
        }
        ArrayList arrayList3 = this.f14937b;
        if (arrayList3.size() > 0) {
            throw t0.A(0, arrayList3);
        }
        int iU = recyclerView.f1027d.u(i10, 0);
        if (iU >= 0) {
            throw null;
        }
        throw new IndexOutOfBoundsException("Inconsistency detected. Invalid item position " + i10 + "(offset:" + iU + ").state:" + b0Var.a() + recyclerView.m());
    }

    public final void e() {
        this.f14939d = this.f14938c;
        ArrayList arrayList = this.f14937b;
        int size = arrayList.size() - 1;
        if (size < 0 || arrayList.size() <= this.f14939d) {
            return;
        }
        if (arrayList.get(size) != null) {
            throw new ClassCastException();
        }
        int[] iArr = RecyclerView.f1022y0;
        throw null;
    }
}
