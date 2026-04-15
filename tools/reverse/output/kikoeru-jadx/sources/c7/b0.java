package c7;

import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class b0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3584a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n f3585b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f3586c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Bundle f3587d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ b0.c1 f3588e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f3589f;

    public b0(b0.c1 c1Var, n nVar, String str, IBinder iBinder, Bundle bundle) {
        this.f3588e = c1Var;
        this.f3585b = nVar;
        this.f3586c = str;
        this.f3589f = iBinder;
        this.f3587d = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3584a) {
            case 0:
                IBinder binder = this.f3585b.f3672a.getBinder();
                b0.c1 c1Var = this.f3588e;
                s sVar = (s) ((f0) c1Var.f1208b).f3626e.get(binder);
                if (sVar == null) {
                    Log.w("MBServiceCompat", "addSubscription for callback that isn't registered id=" + this.f3586c);
                    return;
                }
                HashMap map = sVar.f3724f;
                f0 f0Var = (f0) c1Var.f1208b;
                IBinder iBinder = (IBinder) this.f3589f;
                String str = this.f3586c;
                List arrayList = (List) map.get(str);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                Iterator it = arrayList.iterator();
                while (true) {
                    boolean zHasNext = it.hasNext();
                    Bundle bundle = this.f3587d;
                    if (!zHasNext) {
                        arrayList.add(new t3.b(iBinder, bundle));
                        map.put(str, arrayList);
                        p pVar = new p(f0Var, str, sVar, str, bundle);
                        f0Var.f3627f = sVar;
                        if (bundle == null) {
                            pVar.d();
                        } else {
                            pVar.f3680a = 1;
                            pVar.d();
                        }
                        f0Var.f3627f = null;
                        if (pVar.f3681b) {
                            f0Var.f3627f = null;
                            return;
                        }
                        throw new IllegalStateException("onLoadChildren must call detach() or sendResult() before returning for package=" + sVar.f3719a + " id=" + str);
                    }
                    t3.b bVar = (t3.b) it.next();
                    if (iBinder == bVar.f20406a) {
                        Bundle bundle2 = (Bundle) bVar.f20407b;
                        if (bundle == bundle2) {
                            return;
                        }
                        if (bundle == null) {
                            p4.c.j(bundle2);
                            if (bundle2.getInt("android.media.browse.extra.PAGE", -1) == -1 && bundle2.getInt("android.media.browse.extra.PAGE_SIZE", -1) == -1) {
                                return;
                            }
                        } else if (bundle2 == null) {
                            if (bundle.getInt("android.media.browse.extra.PAGE", -1) == -1 && bundle.getInt("android.media.browse.extra.PAGE_SIZE", -1) == -1) {
                                return;
                            }
                        } else if (bundle.getInt("android.media.browse.extra.PAGE", -1) == bundle2.getInt("android.media.browse.extra.PAGE", -1) && bundle.getInt("android.media.browse.extra.PAGE_SIZE", -1) == bundle2.getInt("android.media.browse.extra.PAGE_SIZE", -1)) {
                            return;
                        }
                    }
                }
                break;
            default:
                IBinder binder2 = this.f3585b.f3672a.getBinder();
                b0.c1 c1Var2 = this.f3588e;
                s sVar2 = (s) ((f0) c1Var2.f1208b).f3626e.get(binder2);
                Bundle bundle3 = this.f3587d;
                if (sVar2 == null) {
                    Log.w("MBServiceCompat", "sendCustomAction for callback that isn't registered action=" + this.f3586c + ", extras=" + bundle3);
                    return;
                }
                f0 f0Var2 = (f0) c1Var2.f1208b;
                c.d dVar = (c.d) this.f3589f;
                f0Var2.f3627f = sVar2;
                if (bundle3 == null) {
                    Bundle bundle4 = Bundle.EMPTY;
                }
                dVar.b(-1, null);
                f0Var2.f3627f = null;
                return;
        }
    }

    public b0(b0.c1 c1Var, n nVar, String str, Bundle bundle, c.d dVar) {
        this.f3588e = c1Var;
        this.f3585b = nVar;
        this.f3586c = str;
        this.f3587d = bundle;
        this.f3589f = dVar;
    }
}
