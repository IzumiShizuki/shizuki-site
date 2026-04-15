package n7;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import androidx.room.MultiInstanceInvalidationService;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class l extends Binder implements h {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ MultiInstanceInvalidationService f15529e;

    public l(MultiInstanceInvalidationService multiInstanceInvalidationService) {
        this.f15529e = multiInstanceInvalidationService;
        attachInterface(this, h.f15489d);
    }

    public final int A0(g gVar, String str) {
        jc.l.e(gVar, "callback");
        int i10 = 0;
        if (str == null) {
            return 0;
        }
        MultiInstanceInvalidationService multiInstanceInvalidationService = this.f15529e;
        synchronized (multiInstanceInvalidationService.f1069c) {
            try {
                int i11 = multiInstanceInvalidationService.f1067a + 1;
                multiInstanceInvalidationService.f1067a = i11;
                if (multiInstanceInvalidationService.f1069c.register(gVar, Integer.valueOf(i11))) {
                    multiInstanceInvalidationService.f1068b.put(Integer.valueOf(i11), str);
                    i10 = i11;
                } else {
                    multiInstanceInvalidationService.f1067a--;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return i10;
    }

    public final void B0(g gVar, int i10) {
        jc.l.e(gVar, "callback");
        MultiInstanceInvalidationService multiInstanceInvalidationService = this.f15529e;
        synchronized (multiInstanceInvalidationService.f1069c) {
            multiInstanceInvalidationService.f1069c.unregister(gVar);
        }
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
        String str = h.f15489d;
        if (i10 >= 1 && i10 <= 16777215) {
            parcel.enforceInterface(str);
        }
        if (i10 == 1598968902) {
            parcel2.writeString(str);
            return true;
        }
        g gVar = null;
        g gVar2 = null;
        if (i10 == 1) {
            IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder != null) {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface(g.f15484c);
                if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof g)) {
                    f fVar = new f();
                    fVar.f15478e = strongBinder;
                    gVar = fVar;
                } else {
                    gVar = (g) iInterfaceQueryLocalInterface;
                }
            }
            int iA0 = A0(gVar, parcel.readString());
            parcel2.writeNoException();
            parcel2.writeInt(iA0);
            return true;
        }
        if (i10 == 2) {
            IBinder strongBinder2 = parcel.readStrongBinder();
            if (strongBinder2 != null) {
                IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface(g.f15484c);
                if (iInterfaceQueryLocalInterface2 == null || !(iInterfaceQueryLocalInterface2 instanceof g)) {
                    f fVar2 = new f();
                    fVar2.f15478e = strongBinder2;
                    gVar2 = fVar2;
                } else {
                    gVar2 = (g) iInterfaceQueryLocalInterface2;
                }
            }
            B0(gVar2, parcel.readInt());
            parcel2.writeNoException();
            return true;
        }
        if (i10 != 3) {
            return super.onTransact(i10, parcel, parcel2, i11);
        }
        int i12 = parcel.readInt();
        String[] strArrCreateStringArray = parcel.createStringArray();
        jc.l.e(strArrCreateStringArray, "tables");
        MultiInstanceInvalidationService multiInstanceInvalidationService = this.f15529e;
        synchronized (multiInstanceInvalidationService.f1069c) {
            String str2 = (String) multiInstanceInvalidationService.f1068b.get(Integer.valueOf(i12));
            if (str2 == null) {
                Log.w("ROOM", "Remote invalidation client ID not registered");
            } else {
                int iBeginBroadcast = multiInstanceInvalidationService.f1069c.beginBroadcast();
                for (int i13 = 0; i13 < iBeginBroadcast; i13++) {
                    try {
                        Object broadcastCookie = multiInstanceInvalidationService.f1069c.getBroadcastCookie(i13);
                        jc.l.c(broadcastCookie, "null cannot be cast to non-null type kotlin.Int");
                        Integer num = (Integer) broadcastCookie;
                        int iIntValue = num.intValue();
                        String str3 = (String) multiInstanceInvalidationService.f1068b.get(num);
                        if (i12 != iIntValue && str2.equals(str3)) {
                            try {
                                ((g) multiInstanceInvalidationService.f1069c.getBroadcastItem(i13)).t(strArrCreateStringArray);
                            } catch (RemoteException e10) {
                                Log.w("ROOM", "Error invoking a remote callback", e10);
                            }
                        }
                    } finally {
                        multiInstanceInvalidationService.f1069c.finishBroadcast();
                    }
                }
            }
        }
        return true;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
