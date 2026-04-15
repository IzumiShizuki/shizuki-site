package q;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class o0 extends jc.m implements ic.k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f17382b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p0 f17383c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o0(p0 p0Var, int i10) {
        super(1);
        this.f17382b = i10;
        this.f17383c = p0Var;
    }

    @Override // ic.k
    public final Object a(Object obj) {
        switch (this.f17382b) {
            case 0:
                r.k1 k1Var = (r.k1) obj;
                f0 f0Var = f0.f17290a;
                f0 f0Var2 = f0.f17291b;
                boolean zB = k1Var.b(f0Var, f0Var2);
                Object obj2 = null;
                p0 p0Var = this.f17383c;
                if (zB) {
                    z zVar = p0Var.f17395s.f17411a.f17481c;
                    if (zVar != null) {
                        obj2 = zVar.f17486c;
                    }
                } else if (k1Var.b(f0Var2, f0.f17292c)) {
                    z zVar2 = p0Var.f17396t.f17436a.f17481c;
                    if (zVar2 != null) {
                        obj2 = zVar2.f17486c;
                    }
                } else {
                    obj2 = l0.f17357d;
                }
                return obj2 == null ? l0.f17357d : obj2;
            default:
                r.k1 k1Var2 = (r.k1) obj;
                f0 f0Var3 = f0.f17290a;
                f0 f0Var4 = f0.f17291b;
                boolean zB2 = k1Var2.b(f0Var3, f0Var4);
                p0 p0Var2 = this.f17383c;
                if (zB2) {
                    w1 w1Var = p0Var2.f17395s.f17411a.f17480b;
                    return w1Var != null ? w1Var.f17470b : l0.f17356c;
                }
                if (!k1Var2.b(f0Var4, f0.f17292c)) {
                    return l0.f17356c;
                }
                w1 w1Var2 = p0Var2.f17396t.f17436a.f17480b;
                return w1Var2 != null ? w1Var2.f17470b : l0.f17356c;
        }
    }
}
