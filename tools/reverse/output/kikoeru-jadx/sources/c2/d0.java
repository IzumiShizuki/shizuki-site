package c2;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d0 implements PointerInputEventHandler, jc.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ic.n f3258a;

    public d0(ic.n nVar) {
        this.f3258a = nVar;
    }

    @Override // jc.h
    public final ub.e a() {
        return this.f3258a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof PointerInputEventHandler) || !(obj instanceof jc.h)) {
            return false;
        }
        return jc.l.a(this.f3258a, ((jc.h) obj).a());
    }

    public final int hashCode() {
        return this.f3258a.hashCode();
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final /* synthetic */ Object invoke(x xVar, yb.c cVar) {
        return this.f3258a.q(xVar, cVar);
    }
}
