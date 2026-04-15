package cg;

import android.app.Activity;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class f0 extends jc.m implements ic.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f4028b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ v f4029c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Activity f4030d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f0(v vVar, Activity activity, int i10) {
        super(0);
        this.f4028b = i10;
        this.f4029c = vVar;
        this.f4030d = activity;
    }

    @Override // ic.a
    public final Object b() {
        switch (this.f4028b) {
            case 0:
                this.f4029c.G(false, false, this.f4030d);
                break;
            default:
                this.f4029c.G(false, false, this.f4030d);
                break;
        }
        return ub.a0.f21526a;
    }
}
