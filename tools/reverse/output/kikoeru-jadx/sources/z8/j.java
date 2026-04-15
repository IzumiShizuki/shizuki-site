package z8;

import ub.a0;
import x0.w0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j implements ic.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26555a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w0 f26556b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ic.k f26557c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hg.b f26558d;

    public /* synthetic */ j(ic.k kVar, w0 w0Var, hg.b bVar) {
        this.f26557c = kVar;
        this.f26556b = w0Var;
        this.f26558d = bVar;
    }

    @Override // ic.a
    public final Object b() {
        switch (this.f26555a) {
            case 0:
                w0 w0Var = this.f26556b;
                float fFloatValue = ((Number) w0Var.getValue()).floatValue();
                this.f26558d.e(Float.valueOf(fFloatValue), l.f26571a[0]);
                ic.k kVar = this.f26557c;
                if (kVar != null) {
                    kVar.a(Float.valueOf(((Number) w0Var.getValue()).floatValue()));
                }
                break;
            default:
                w0 w0Var2 = this.f26556b;
                boolean z10 = !((Boolean) w0Var2.getValue()).booleanValue();
                w0Var2.setValue(Boolean.valueOf(z10));
                this.f26558d.e(Boolean.valueOf(z10), n.f26582a[0]);
                ic.k kVar2 = this.f26557c;
                if (kVar2 != null) {
                    kVar2.a(Boolean.valueOf(z10));
                }
                break;
        }
        return a0.f21526a;
    }

    public /* synthetic */ j(w0 w0Var, ic.k kVar, hg.b bVar) {
        this.f26556b = w0Var;
        this.f26557c = kVar;
        this.f26558d = bVar;
    }
}
