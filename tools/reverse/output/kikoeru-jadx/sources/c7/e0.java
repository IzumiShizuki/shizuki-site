package c7;

import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class e0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ n f3611a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f3612b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f3613c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f3614d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ b0.c1 f3615e;

    public e0(int i10, int i11, Bundle bundle, b0.c1 c1Var, n nVar, String str) {
        this.f3615e = c1Var;
        this.f3611a = nVar;
        this.f3612b = i10;
        this.f3613c = str;
        this.f3614d = i11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        s sVar;
        n nVar = this.f3611a;
        IBinder binder = nVar.f3672a.getBinder();
        b0.c1 c1Var = this.f3615e;
        ((f0) c1Var.f1208b).f3626e.remove(binder);
        f0 f0Var = (f0) c1Var.f1208b;
        Iterator it = f0Var.f3625d.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            s sVar2 = (s) it.next();
            if (sVar2.f3721c == this.f3612b) {
                sVar = (TextUtils.isEmpty(this.f3613c) || this.f3614d <= 0) ? new s(f0Var, sVar2.f3719a, sVar2.f3720b, sVar2.f3721c, nVar) : null;
                it.remove();
            }
        }
        if (sVar == null) {
            sVar = new s(f0Var, this.f3613c, this.f3614d, this.f3612b, nVar);
        }
        f0Var.f3626e.put(binder, sVar);
        try {
            binder.linkToDeath(sVar, 0);
        } catch (RemoteException unused) {
            Log.w("MBServiceCompat", "IBinder is already dead.");
        }
    }
}
