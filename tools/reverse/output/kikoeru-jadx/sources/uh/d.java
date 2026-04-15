package uh;

import x0.w0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class d implements x0.e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ic.a f21960a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w0 f21961b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ w0 f21962c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hf.y f21963d;

    public d(ic.a aVar, w0 w0Var, w0 w0Var2, hf.y yVar) {
        this.f21960a = aVar;
        this.f21961b = w0Var;
        this.f21962c = w0Var2;
        this.f21963d = yVar;
    }

    @Override // x0.e0
    public final void a() {
        w0 w0Var = this.f21961b;
        if (((Boolean) w0Var.getValue()).booleanValue()) {
            w.b bVar = (w.b) this.f21962c.getValue();
            if (bVar != null) {
                hf.a0.y(this.f21963d, null, null, new c(bVar, null, 0), 3);
            }
            if (((Boolean) w0Var.getValue()).booleanValue()) {
                this.f21960a.b();
            }
            w0Var.setValue(Boolean.FALSE);
        }
    }
}
