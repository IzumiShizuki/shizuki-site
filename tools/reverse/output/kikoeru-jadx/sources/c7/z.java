package c7;

import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class z implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ n f3755a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f3756b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f3757c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f3758d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Bundle f3759e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ b0.c1 f3760f;

    public z(int i10, int i11, Bundle bundle, b0.c1 c1Var, n nVar, String str) {
        this.f3760f = c1Var;
        this.f3755a = nVar;
        this.f3756b = str;
        this.f3757c = i10;
        this.f3758d = i11;
        this.f3759e = bundle;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // java.lang.Runnable
    public final void run() {
        n nVar = this.f3755a;
        IBinder binder = nVar.f3672a.getBinder();
        b0.c1 c1Var = this.f3760f;
        ((f0) c1Var.f1208b).f3626e.remove(binder);
        f0 f0Var = (f0) c1Var.f1208b;
        int i10 = this.f3757c;
        int i11 = this.f3758d;
        String str = this.f3756b;
        s sVar = new s(f0Var, str, i10, i11, nVar);
        f0Var.f3627f = sVar;
        q qVarA = f0Var.a(this.f3759e);
        f0Var.f3627f = null;
        if (qVarA == null) {
            StringBuilder sbK = a0.c.K("No root for client ", str, " from service ");
            sbK.append(z.class.getName());
            Log.i("MBServiceCompat", sbK.toString());
            try {
                nVar.b(2, null);
                return;
            } catch (RemoteException unused) {
                Log.w("MBServiceCompat", "Calling onConnectFailed() failed. Ignoring. pkg=".concat(str));
                return;
            }
        }
        try {
            f0Var.f3626e.put(binder, sVar);
            binder.linkToDeath(sVar, 0);
            d1 d1Var = f0Var.f3629h;
            if (d1Var != null) {
                nVar.a(d1Var, qVarA.f3699a);
            }
        } catch (RemoteException unused2) {
            Log.w("MBServiceCompat", "Calling onConnect() failed. Dropping client. pkg=".concat(str));
            f0Var.f3626e.remove(binder);
        }
    }
}
