package cg;

import android.app.Activity;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class s extends ac.i implements ic.n {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ v f4104e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f4105f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f4106g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Activity f4107h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(v vVar, boolean z10, boolean z11, Activity activity, yb.c cVar) {
        super(2, cVar);
        this.f4104e = vVar;
        this.f4105f = z10;
        this.f4106g = z11;
        this.f4107h = activity;
    }

    @Override // ac.a
    public final yb.c o(Object obj, yb.c cVar) {
        return new s(this.f4104e, this.f4105f, this.f4106g, this.f4107h, cVar);
    }

    @Override // ic.n
    public final Object q(Object obj, Object obj2) {
        s sVar = (s) o((hf.y) obj, (yb.c) obj2);
        ub.a0 a0Var = ub.a0.f21526a;
        sVar.u(a0Var);
        return a0Var;
    }

    @Override // ac.a
    public final Object u(Object obj) {
        ub.a.f(obj);
        v vVar = this.f4104e;
        int i10 = 0;
        vVar.V(false);
        vVar.T(false);
        boolean z10 = vVar.z();
        boolean zBooleanValue = ((Boolean) ((ub.k) vVar.f4118g.getValue()).f21544b).booleanValue();
        boolean z11 = this.f4106g;
        boolean z12 = this.f4105f;
        if (z10 != z12 || zBooleanValue != z11) {
            Activity activity = this.f4107h;
            if (z12) {
                if (vVar.f4132u) {
                    i10 = z11 ? 9 : 1;
                } else if (z11) {
                    i10 = 8;
                }
                activity.setRequestedOrientation(i10);
            } else {
                activity.setRequestedOrientation(1);
            }
            hf.a0.y(androidx.lifecycle.m0.h(vVar), null, null, new r(vVar, z12, z11, null), 3);
        }
        if (z10 != z12) {
            vVar.f4115d.setValue(o.f4085a);
            vVar.X();
        }
        return ub.a0.f21526a;
    }
}
