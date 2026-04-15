package fg;

import h1.g0;
import h1.n;
import jc.l;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class e extends g0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f7091c;

    public e(Object obj) {
        super(n.k().g());
        this.f7091c = obj;
    }

    @Override // h1.g0
    public final void a(g0 g0Var) {
        l.e(g0Var, "value");
        this.f7091c = ((e) g0Var).f7091c;
    }

    @Override // h1.g0
    public final g0 b() {
        return new e(this.f7091c);
    }
}
