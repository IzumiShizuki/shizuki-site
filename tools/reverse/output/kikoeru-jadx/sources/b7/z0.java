package b7;

import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.ResultReceiver;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class z0 extends ResultReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2220a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f2221b;

    public /* synthetic */ z0(Handler handler) {
        super(handler);
    }

    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i10, Bundle bundle) {
        c7.h hVar;
        switch (this.f2220a) {
            case 0:
                cb.e0 e0Var = (cb.e0) this.f2221b;
                if (bundle == null) {
                    bundle = Bundle.EMPTY;
                }
                e0Var.k(new i4(i10, bundle));
                return;
            default:
                c7.j0 j0Var = (c7.j0) ((WeakReference) this.f2221b).get();
                if (j0Var == null || bundle == null) {
                    return;
                }
                synchronized (j0Var.f3648b) {
                    c7.d1 d1Var = j0Var.f3651e;
                    IBinder binder = bundle.getBinder("android.support.v4.media.session.EXTRA_BINDER");
                    int i11 = c7.v0.f3736f;
                    if (binder == null) {
                        hVar = null;
                    } else {
                        IInterface iInterfaceQueryLocalInterface = binder.queryLocalInterface("android.support.v4.media.session.IMediaSession");
                        if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof c7.h)) {
                            c7.g gVar = new c7.g();
                            gVar.f3630e = binder;
                            hVar = gVar;
                        } else {
                            hVar = (c7.h) iInterfaceQueryLocalInterface;
                        }
                    }
                    d1Var.b(hVar);
                    j0Var.f3651e.c(g8.a.N(bundle));
                    j0Var.a();
                    break;
                }
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(Handler handler, cb.e0 e0Var) {
        super(handler);
        this.f2221b = e0Var;
    }
}
