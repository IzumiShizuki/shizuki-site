package fg;

import h1.g;
import h1.n;
import ic.k;
import jc.l;
import ka.j;
import ub.a0;
import ub.p;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7089a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f7090b;

    public /* synthetic */ d(f fVar, int i10) {
        this.f7089a = i10;
        this.f7090b = fVar;
    }

    @Override // ic.k
    public final Object a(Object obj) {
        g gVarK;
        switch (this.f7089a) {
            case 0:
                f fVar = this.f7090b;
                l.c(obj, "null cannot be cast to non-null type T of loli.ball.okkv.OkkvStateImpl");
                if (!l.a(((e) n.i(fVar.f7093b)).f7091c, obj)) {
                    e eVar = fVar.f7093b;
                    synchronized (n.f8051c) {
                        gVarK = n.k();
                        ((e) n.x(eVar, fVar, gVarK)).f7091c = obj;
                    }
                    n.o(gVarK, fVar);
                }
                return a0.f21526a;
            case 1:
                this.f7090b.setValue(Boolean.FALSE);
                break;
            default:
                f fVar2 = this.f7090b;
                p pVar = v9.b.f22799a;
                fVar2.setValue(Boolean.FALSE);
                j.c((ka.g) obj);
                break;
        }
        return a0.f21526a;
    }
}
