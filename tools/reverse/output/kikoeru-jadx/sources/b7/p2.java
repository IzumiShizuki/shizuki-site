package b7;

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.cnl.kikoeru.MainService;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class p2 extends Binder implements v {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final WeakReference f2032e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Handler f2033f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final c7.l1 f2034g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Set f2035h;

    public p2(MainService mainService) {
        attachInterface(this, "androidx.media3.session.IMediaSessionService");
        this.f2032e = new WeakReference(mainService);
        Context applicationContext = mainService.getApplicationContext();
        this.f2033f = new Handler(applicationContext.getMainLooper());
        this.f2034g = c7.l1.a(applicationContext);
        this.f2035h = Collections.synchronizedSet(new HashSet());
    }

    public static v A0(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("androidx.media3.session.IMediaSessionService");
        if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof v)) {
            return (v) iInterfaceQueryLocalInterface;
        }
        u uVar = new u();
        uVar.f2107e = iBinder;
        return uVar;
    }

    @Override // b7.v
    public final void o(r rVar, Bundle bundle) {
        if (rVar == null || bundle == null) {
            return;
        }
        try {
            i iVarA = i.a(bundle);
            if (this.f2032e.get() == null) {
                try {
                    rVar.a();
                    return;
                } catch (RemoteException unused) {
                    return;
                }
            }
            int callingPid = Binder.getCallingPid();
            int callingUid = Binder.getCallingUid();
            long jClearCallingIdentity = Binder.clearCallingIdentity();
            if (callingPid == 0) {
                callingPid = iVarA.f1850d;
            }
            c7.k1 k1Var = new c7.k1(callingPid, callingUid, iVarA.f1849c);
            boolean zB = this.f2034g.b(k1Var);
            this.f2035h.add(rVar);
            try {
                this.f2033f.post(new l1(this, rVar, k1Var, iVarA, zB, 1));
            } finally {
                Binder.restoreCallingIdentity(jClearCallingIdentity);
            }
        } catch (RuntimeException e10) {
            p4.c.C("MSessionService", "Ignoring malformed Bundle for ConnectionRequest", e10);
        }
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 >= 1 && i10 <= 16777215) {
            parcel.enforceInterface("androidx.media3.session.IMediaSessionService");
        }
        if (i10 == 1598968902) {
            parcel2.writeString("androidx.media3.session.IMediaSessionService");
            return true;
        }
        if (i10 != 3001) {
            return super.onTransact(i10, parcel, parcel2, i11);
        }
        o(i1.A0(parcel.readStrongBinder()), (Bundle) (parcel.readInt() != 0 ? Bundle.CREATOR.createFromParcel(parcel) : null));
        return true;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
