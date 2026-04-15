package a0;

import b0.n0;
import x0.w0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class n extends jc.m implements ic.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f79b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ w0 f80c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(w0 w0Var, int i10) {
        super(0);
        this.f79b = i10;
        this.f80c = w0Var;
    }

    @Override // ic.a
    public final Object b() {
        switch (this.f79b) {
            case 0:
                return new j((ic.k) this.f80c.getValue());
            case 1:
                return (n0) ((ic.a) this.f80c.getValue()).b();
            case 2:
                return new c0.f((ic.k) this.f80c.getValue());
            case 3:
                Boolean bool = (Boolean) this.f80c.getValue();
                bool.booleanValue();
                return bool;
            case 4:
                return (u0.e) this.f80c.getValue();
            default:
                return new p1.b(((p1.b) this.f80c.getValue()).f16481a);
        }
    }
}
