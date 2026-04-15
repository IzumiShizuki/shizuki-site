package z9;

import hf.y;
import j9.b0;
import ub.a0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g implements ic.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26624a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f26625b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ y f26626c;

    public /* synthetic */ g(y yVar, r rVar) {
        this.f26624a = 0;
        b0 b0Var = b0.f10659a;
        this.f26626c = yVar;
        this.f26625b = rVar;
    }

    @Override // ic.a
    public final Object b() {
        int i10 = this.f26624a;
        a0 a0Var = a0.f21526a;
        y yVar = this.f26626c;
        r rVar = this.f26625b;
        switch (i10) {
            case 0:
                b0 b0Var = b0.f10659a;
                hf.a0.y(yVar, null, null, new i(rVar, null), 3);
                break;
            case 1:
                rVar.G(false);
                hf.a0.y(yVar, null, null, new i(rVar, null, 0), 3);
                break;
            default:
                rVar.f26663k.setValue(Boolean.FALSE);
                hf.a0.y(yVar, null, null, new i(rVar, null, 1), 3);
                break;
        }
        return a0Var;
    }

    public /* synthetic */ g(r rVar, y yVar, int i10) {
        this.f26624a = i10;
        this.f26625b = rVar;
        this.f26626c = yVar;
    }
}
