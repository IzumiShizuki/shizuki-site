package j2;

import android.os.SystemClock;
import android.view.MotionEvent;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class t extends jc.m implements ic.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f9990b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ v f9991c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t(v vVar, int i10) {
        super(0);
        this.f9990b = i10;
        this.f9991c = vVar;
    }

    @Override // ic.a
    public final Object b() {
        int actionMasked;
        switch (this.f9990b) {
            case 0:
                v vVar = this.f9991c;
                MotionEvent motionEvent = vVar.K0;
                if (motionEvent != null && ((actionMasked = motionEvent.getActionMasked()) == 7 || actionMasked == 9)) {
                    vVar.L0 = SystemClock.uptimeMillis();
                    vVar.post(vVar.Q0);
                }
                return ub.a0.f21526a;
            default:
                return this.f9991c.get_viewTreeOwners();
        }
    }
}
