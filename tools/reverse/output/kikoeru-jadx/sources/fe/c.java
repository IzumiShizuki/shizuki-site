package fe;

import java.util.Collection;
import java.util.List;
import jc.l;
import se.n0;
import se.w;
import se.x0;
import te.i;
import vb.r;
import yc.h;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class c implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n0 f7051a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public i f7052b;

    public c(n0 n0Var) {
        l.e(n0Var, "projection");
        this.f7051a = n0Var;
        n0Var.a();
    }

    @Override // fe.b
    public final n0 a() {
        return this.f7051a;
    }

    @Override // se.k0
    public final vc.i g() {
        vc.i iVarG = this.f7051a.b().t().g();
        l.d(iVarG, "getBuiltIns(...)");
        return iVarG;
    }

    @Override // se.k0
    public final /* bridge */ /* synthetic */ h h() {
        return null;
    }

    @Override // se.k0
    public final Collection i() {
        n0 n0Var = this.f7051a;
        w wVarB = n0Var.a() == x0.OUT_VARIANCE ? n0Var.b() : g().o();
        l.b(wVarB);
        return ud.b.w(wVarB);
    }

    @Override // se.k0
    public final boolean j() {
        return false;
    }

    @Override // se.k0
    public final List o() {
        return r.f22819a;
    }

    public final String toString() {
        return "CapturedTypeConstructor(" + this.f7051a + ')';
    }
}
