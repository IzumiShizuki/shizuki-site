package k0;

import androidx.compose.ui.input.pointer.PointerHoverIconModifierElement;
import androidx.compose.ui.input.pointer.SuspendPointerInputElement;
import c2.e0;
import da.a0;
import j1.q;
import j5.x0;
import l0.a1;
import l0.y0;
import o.c0;
import x0.u1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class h implements u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f10931a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y0 f10932b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f10933c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public j f10934d = j.f10942c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public l0.n f10935e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final q f10936f;

    public h(long j10, y0 y0Var, long j11) {
        this.f10931a = j10;
        this.f10932b = y0Var;
        this.f10933c = j11;
        g gVar = new g(this, 0);
        i iVar = new i(gVar, y0Var, j10);
        x0 x0Var = new x0();
        x0Var.f10476c = gVar;
        x0Var.f10477d = y0Var;
        x0Var.f10475b = j10;
        x0Var.f10474a = 0L;
        a0 a0Var = new a0(2, x0Var, iVar);
        c2.l lVar = e0.f3261a;
        this.f10936f = new SuspendPointerInputElement(x0Var, iVar, null, a0Var, 4).e(new PointerHoverIconModifierElement());
    }

    @Override // x0.u1
    public final void a() {
        l0.n nVar = this.f10935e;
        if (nVar != null) {
            ((a1) this.f10932b).d(nVar);
            this.f10935e = null;
        }
    }

    @Override // x0.u1
    public final void c() {
        l0.n nVar = this.f10935e;
        if (nVar != null) {
            ((a1) this.f10932b).d(nVar);
            this.f10935e = null;
        }
    }

    @Override // x0.u1
    public final void d() {
        g gVar = new g(this, 1);
        g gVar2 = new g(this, 2);
        long j10 = this.f10931a;
        l0.n nVar = new l0.n(j10, gVar, gVar2);
        a1 a1Var = (a1) this.f10932b;
        c0 c0Var = a1Var.f11412c;
        if (j10 == 0) {
            x.a.a("The selectable contains an invalid id: " + j10);
        }
        if (c0Var.b(j10)) {
            x.a.a("Another selectable with the id: " + nVar + ".selectableId has already subscribed.");
        }
        c0Var.h(j10, nVar);
        a1Var.f11411b.add(nVar);
        a1Var.f11410a = false;
        this.f10935e = nVar;
    }
}
