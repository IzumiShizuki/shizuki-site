package b7;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Process;
import android.os.RemoteException;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class s0 implements ServiceConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Bundle f2063a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t0 f2064b;

    public s0(t0 t0Var, Bundle bundle) {
        this.f2064b = t0Var;
        this.f2063a = bundle;
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        d0 d0Var = this.f2064b.f2069a;
        Objects.requireNonNull(d0Var);
        d0Var.e(new a9.m(5, d0Var));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        a9.m mVar;
        t0 t0Var = this.f2064b;
        k4 k4Var = t0Var.f2073e;
        d0 d0Var = t0Var.f2069a;
        try {
            try {
                if (k4Var.f1919a.e().equals(componentName.getPackageName())) {
                    v vVarA0 = p2.A0(iBinder);
                    if (vVarA0 != null) {
                        String packageName = t0Var.f2072d.getPackageName();
                        int iMyPid = Process.myPid();
                        Bundle bundle = this.f2063a;
                        d0Var.getClass();
                        vVarA0.o(t0Var.f2071c, new i(packageName, iMyPid, bundle).b());
                        return;
                    }
                    p4.c.n("MCImplBase", "Service interface is missing.");
                    Objects.requireNonNull(d0Var);
                    mVar = new a9.m(5, d0Var);
                } else {
                    p4.c.n("MCImplBase", "Expected connection to " + k4Var.f1919a.e() + " but is connected to " + componentName);
                    Objects.requireNonNull(d0Var);
                    mVar = new a9.m(5, d0Var);
                }
            } catch (RemoteException unused) {
                p4.c.B("MCImplBase", "Service " + componentName + " has died prematurely");
                Objects.requireNonNull(d0Var);
                mVar = new a9.m(5, d0Var);
            }
            d0Var.e(mVar);
        } catch (Throwable th2) {
            Objects.requireNonNull(d0Var);
            d0Var.e(new a9.m(5, d0Var));
            throw th2;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        d0 d0Var = this.f2064b.f2069a;
        Objects.requireNonNull(d0Var);
        d0Var.e(new a9.m(5, d0Var));
    }
}
