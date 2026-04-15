package i3;

import android.content.Context;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.View;
import c7.e1;
import i2.p1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class q extends h {
    public final b2.d A;
    public g1.f B;
    public ic.k C;
    public ic.k D;
    public ic.k E;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final View f9000z;

    public q(Context context, ic.k kVar, x0.n nVar, g1.g gVar, int i10, p1 p1Var) {
        View view = (View) kVar.a(context);
        b2.d dVar = new b2.d();
        super(context, nVar, i10, dVar, view, p1Var);
        this.f9000z = view;
        this.A = dVar;
        setClipChildren(false);
        String strValueOf = String.valueOf(i10);
        Object objD = gVar != null ? gVar.d(strValueOf) : null;
        SparseArray<Parcelable> sparseArray = objD instanceof SparseArray ? (SparseArray) objD : null;
        if (sparseArray != null) {
            view.restoreHierarchyState(sparseArray);
        }
        if (gVar != null) {
            setSavableRegistryEntry(gVar.g(strValueOf, new g(this, 2)));
        }
        c cVar = c.f8936f;
        this.C = cVar;
        this.D = cVar;
        this.E = cVar;
    }

    public static final void h(q qVar) {
        qVar.setSavableRegistryEntry(null);
    }

    private final void setSavableRegistryEntry(g1.f fVar) {
        g1.f fVar2 = this.B;
        if (fVar2 != null) {
            ((e1) fVar2).i0();
        }
        this.B = fVar;
    }

    public final b2.d getDispatcher() {
        return this.A;
    }

    public final ic.k getReleaseBlock() {
        return this.E;
    }

    public final ic.k getResetBlock() {
        return this.D;
    }

    public /* bridge */ /* synthetic */ j2.a getSubCompositionView() {
        return null;
    }

    public final ic.k getUpdateBlock() {
        return this.C;
    }

    public final void setReleaseBlock(ic.k kVar) {
        this.E = kVar;
        setRelease(new g(this, 3));
    }

    public final void setResetBlock(ic.k kVar) {
        this.D = kVar;
        setReset(new g(this, 4));
    }

    public final void setUpdateBlock(ic.k kVar) {
        this.C = kVar;
        setUpdate(new g(this, 5));
    }

    public View getViewRoot() {
        return this;
    }
}
