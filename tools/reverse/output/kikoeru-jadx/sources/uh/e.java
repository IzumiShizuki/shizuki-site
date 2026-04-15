package uh;

import x0.w0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class e extends jc.m implements ic.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f21972b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ic.a f21973c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ w0 f21974d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ hf.y f21975e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ w0 f21976f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(ic.a aVar, w0 w0Var, hf.y yVar, w0 w0Var2, int i10) {
        super(0);
        this.f21972b = i10;
        this.f21973c = aVar;
        this.f21974d = w0Var;
        this.f21975e = yVar;
        this.f21976f = w0Var2;
    }

    @Override // ic.a
    public final Object b() {
        switch (this.f21972b) {
            case 0:
                w.b bVar = (w.b) this.f21974d.getValue();
                if (bVar != null) {
                    hf.a0.y(this.f21975e, null, null, new c(bVar, null, 2), 3);
                }
                w0 w0Var = this.f21976f;
                if (((Boolean) w0Var.getValue()).booleanValue()) {
                    this.f21973c.b();
                }
                w0Var.setValue(Boolean.FALSE);
                break;
            default:
                w.b bVar2 = (w.b) this.f21974d.getValue();
                if (bVar2 != null) {
                    hf.a0.y(this.f21975e, null, null, new c(bVar2, null, 3), 3);
                }
                w0 w0Var2 = this.f21976f;
                if (((Boolean) w0Var2.getValue()).booleanValue()) {
                    this.f21973c.b();
                }
                w0Var2.setValue(Boolean.FALSE);
                break;
        }
        return ub.a0.f21526a;
    }
}
