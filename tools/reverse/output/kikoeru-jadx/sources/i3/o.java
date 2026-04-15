package i3;

import android.view.View;
import android.view.ViewTreeObserver;
import i2.p1;
import o1.v;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class o extends j1.p implements o1.p, ViewTreeObserver.OnGlobalFocusChangeListener {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public View f8996o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ViewTreeObserver f8997p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final n f8998q = new n(this, 0);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final n f8999r = new n(this, 1);

    public final v B0() {
        if (!this.f9690a.f9703n) {
            f2.a.b("visitLocalDescendants called on an unattached node");
        }
        j1.p pVar = this.f9690a;
        if ((pVar.f9693d & 1024) != 0) {
            boolean z10 = false;
            for (j1.p pVar2 = pVar.f9695f; pVar2 != null; pVar2 = pVar2.f9695f) {
                if ((pVar2.f9692c & 1024) != 0) {
                    j1.p pVarF = pVar2;
                    z0.e eVar = null;
                    while (pVarF != null) {
                        if (pVarF instanceof v) {
                            v vVar = (v) pVarF;
                            if (z10) {
                                return vVar;
                            }
                            z10 = true;
                        } else if ((pVarF.f9692c & 1024) != 0 && (pVarF instanceof i2.n)) {
                            int i10 = 0;
                            for (j1.p pVar3 = ((i2.n) pVarF).f8789p; pVar3 != null; pVar3 = pVar3.f9695f) {
                                if ((pVar3.f9692c & 1024) != 0) {
                                    i10++;
                                    if (i10 == 1) {
                                        pVarF = pVar3;
                                    } else {
                                        if (eVar == null) {
                                            eVar = new z0.e(new j1.p[16]);
                                        }
                                        if (pVarF != null) {
                                            eVar.b(pVarF);
                                            pVarF = null;
                                        }
                                        eVar.b(pVar3);
                                    }
                                }
                            }
                            if (i10 == 1) {
                            }
                        }
                        pVarF = i2.f.f(eVar);
                    }
                }
            }
        }
        throw new IllegalStateException("Could not find focus target of embedded view wrapper");
    }

    @Override // o1.p
    public final void Y(o1.l lVar) {
        lVar.c(false);
        lVar.b(this.f8998q);
        lVar.d(this.f8999r);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalFocusChangeListener
    public final void onGlobalFocusChanged(View view, View view2) {
        if (i2.f.y(this).f8755n == null) {
            return;
        }
        View viewC = j.c(this);
        o1.i focusOwner = ((j2.v) i2.f.z(this)).getFocusOwner();
        p1 p1VarZ = i2.f.z(this);
        boolean z10 = (view == null || view.equals(p1VarZ) || !j.a(viewC, view)) ? false : true;
        boolean z11 = (view2 == null || view2.equals(p1VarZ) || !j.a(viewC, view2)) ? false : true;
        if (z10 && z11) {
            this.f8996o = view2;
            return;
        }
        if (z11) {
            this.f8996o = view2;
            v vVarB0 = B0();
            if (vVarB0.D0().a()) {
                return;
            }
            o1.f.v(vVarB0);
            return;
        }
        if (!z10) {
            this.f8996o = null;
            return;
        }
        this.f8996o = null;
        if (B0().D0().b()) {
            ((o1.k) focusOwner).b(false, 8, false);
        }
    }

    @Override // j1.p
    public final void r0() {
        ViewTreeObserver viewTreeObserver = i2.f.A(this).getViewTreeObserver();
        this.f8997p = viewTreeObserver;
        viewTreeObserver.addOnGlobalFocusChangeListener(this);
    }

    @Override // j1.p
    public final void t0() {
        ViewTreeObserver viewTreeObserver = this.f8997p;
        if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnGlobalFocusChangeListener(this);
        }
        this.f8997p = null;
        i2.f.A(this).getViewTreeObserver().removeOnGlobalFocusChangeListener(this);
        this.f8996o = null;
    }
}
