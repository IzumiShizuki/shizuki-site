package j2;

import android.view.accessibility.AccessibilityEvent;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class c0 extends jc.m implements ic.k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f9761b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d0 f9762c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c0(d0 d0Var, int i10) {
        super(1);
        this.f9761b = i10;
        this.f9762c = d0Var;
    }

    @Override // ic.k
    public final Object a(Object obj) {
        switch (this.f9761b) {
            case 0:
                d0 d0Var = this.f9762c;
                return Boolean.valueOf(d0Var.f9769d.getParent().requestSendAccessibilityEvent(d0Var.f9769d, (AccessibilityEvent) obj));
            default:
                s2 s2Var = (s2) obj;
                if (s2Var.f9985b.contains(s2Var)) {
                    d0 d0Var2 = this.f9762c;
                    d0Var2.f9769d.getSnapshotObserver().a(s2Var, d0Var2.P, new b0.s1(8, s2Var, d0Var2));
                }
                return ub.a0.f21526a;
        }
    }
}
