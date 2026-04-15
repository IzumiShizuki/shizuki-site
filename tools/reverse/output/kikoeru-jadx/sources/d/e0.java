package d;

import android.window.OnBackInvokedCallback;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e0 implements OnBackInvokedCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5194a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ic.a f5195b;

    public /* synthetic */ e0(int i10, ic.a aVar) {
        this.f5194a = i10;
        this.f5195b = aVar;
    }

    @Override // android.window.OnBackInvokedCallback
    public final void onBackInvoked() {
        switch (this.f5194a) {
            case 0:
                ((d0) this.f5195b).b();
                break;
            default:
                ic.a aVar = this.f5195b;
                if (aVar != null) {
                    aVar.b();
                }
                break;
        }
    }
}
