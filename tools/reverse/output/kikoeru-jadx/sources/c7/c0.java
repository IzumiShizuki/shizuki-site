package c7;

import android.animation.ValueAnimator;
import android.os.IBinder;
import android.util.Log;
import android.view.View;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class c0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3593a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3594b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f3595c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f3596d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f3597e;

    public /* synthetic */ c0(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f3593a = i10;
        this.f3594b = obj;
        this.f3595c = obj2;
        this.f3596d = obj3;
        this.f3597e = obj4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3593a) {
            case 0:
                String str = (String) this.f3595c;
                IBinder binder = ((n) this.f3594b).f3672a.getBinder();
                b0.c1 c1Var = (b0.c1) this.f3597e;
                s sVar = (s) ((f0) c1Var.f1208b).f3626e.get(binder);
                if (sVar == null) {
                    Log.w("MBServiceCompat", "removeSubscription for callback that isn't registered id=" + str);
                    return;
                }
                HashMap map = sVar.f3724f;
                f0 f0Var = (f0) c1Var.f1208b;
                IBinder iBinder = (IBinder) this.f3596d;
                f0Var.getClass();
                boolean z10 = false;
                try {
                    if (iBinder != null) {
                        List list = (List) map.get(str);
                        if (list != null) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                if (iBinder == ((t3.b) it.next()).f20406a) {
                                    it.remove();
                                    z10 = true;
                                }
                            }
                            if (list.size() == 0) {
                                map.remove(str);
                            }
                        }
                    } else if (map.remove(str) != null) {
                        z10 = true;
                    }
                    if (z10) {
                        return;
                    }
                    Log.w("MBServiceCompat", "removeSubscription called for " + str + " which is not subscribed");
                    return;
                } finally {
                    f0Var.f3627f = null;
                }
            case 1:
                hf.k kVar = (hf.k) this.f3595c;
                try {
                    hf.a0.C(((yb.h) this.f3594b).L(yb.d.f26087a), new e.j((n7.v) this.f3596d, kVar, (lf.w0) this.f3597e, (yb.c) null, 17));
                    return;
                } catch (Throwable th2) {
                    kVar.t(th2);
                    return;
                }
            default:
                u3.z.i((View) this.f3594b, (u3.e0) this.f3595c, (m0.w) this.f3596d);
                ((ValueAnimator) this.f3597e).start();
                return;
        }
    }

    public c0(b0.c1 c1Var, n nVar, String str, IBinder iBinder) {
        this.f3593a = 0;
        this.f3597e = c1Var;
        this.f3594b = nVar;
        this.f3595c = str;
        this.f3596d = iBinder;
    }
}
