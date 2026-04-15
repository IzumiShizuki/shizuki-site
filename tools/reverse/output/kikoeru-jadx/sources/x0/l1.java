package x0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class l1 implements w0, hf.y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ w0 f24346a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final yb.h f24347b;

    public l1(w0 w0Var, yb.h hVar) {
        this.f24346a = w0Var;
        this.f24347b = hVar;
    }

    @Override // hf.y
    public final yb.h O() {
        return this.f24347b;
    }

    @Override // x0.n2
    public final Object getValue() {
        return this.f24346a.getValue();
    }

    @Override // x0.w0
    public final void setValue(Object obj) {
        this.f24346a.setValue(obj);
    }
}
