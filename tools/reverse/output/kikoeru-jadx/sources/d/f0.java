package d;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class f0 implements OnBackAnimationCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c0 f5198a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c0 f5199b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d0 f5200c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d0 f5201d;

    public f0(c0 c0Var, c0 c0Var2, d0 d0Var, d0 d0Var2) {
        this.f5198a = c0Var;
        this.f5199b = c0Var2;
        this.f5200c = d0Var;
        this.f5201d = d0Var2;
    }

    @Override // android.window.OnBackAnimationCallback
    public final void onBackCancelled() {
        this.f5201d.b();
    }

    @Override // android.window.OnBackInvokedCallback
    public final void onBackInvoked() {
        this.f5200c.b();
    }

    @Override // android.window.OnBackAnimationCallback
    public final void onBackProgressed(BackEvent backEvent) {
        jc.l.e(backEvent, "backEvent");
        this.f5199b.a(new c(backEvent));
    }

    @Override // android.window.OnBackAnimationCallback
    public final void onBackStarted(BackEvent backEvent) {
        jc.l.e(backEvent, "backEvent");
        this.f5198a.a(new c(backEvent));
    }
}
