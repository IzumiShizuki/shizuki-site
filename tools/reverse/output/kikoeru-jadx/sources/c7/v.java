package c7;

import b0.w1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public class v extends w1 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ f0 f3735f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(f0 f0Var) {
        super(f0Var);
        this.f3735f = f0Var;
    }

    @Override // b0.w1
    public void Y() {
        u uVar = new u(this, this.f3735f);
        this.f1396d = uVar;
        uVar.onCreate();
    }
}
