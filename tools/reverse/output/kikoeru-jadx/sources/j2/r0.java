package j2;

import android.os.Build;
import android.view.ActionMode;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class r0 implements v2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v f9972a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ActionMode f9973b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final id.h f9974c = new id.h(new b0.d0(20, this));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public w2 f9975d = w2.f10089b;

    public r0(v vVar) {
        this.f9972a = vVar;
    }

    public final void a(p1.c cVar, ic.a aVar, l0.j1 j1Var, ic.a aVar2, ic.a aVar3, l0.j1 j1Var2) {
        id.h hVar = this.f9974c;
        hVar.f9506c = cVar;
        hVar.f9507d = aVar;
        hVar.f9509f = aVar2;
        hVar.f9508e = j1Var;
        hVar.f9510g = aVar3;
        hVar.f9511h = j1Var2;
        ActionMode actionMode = this.f9973b;
        if (actionMode != null) {
            actionMode.invalidate();
            return;
        }
        this.f9975d = w2.f10088a;
        int i10 = Build.VERSION.SDK_INT;
        v vVar = this.f9972a;
        this.f9973b = i10 >= 23 ? vVar.startActionMode(new l2.a(hVar), 1) : vVar.startActionMode(new l2.c(hVar));
    }
}
