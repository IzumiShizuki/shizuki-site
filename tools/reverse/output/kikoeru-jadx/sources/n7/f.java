package n7;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class f implements g {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public IBinder f15478e;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f15478e;
    }

    @Override // n7.g
    public final void t(String[] strArr) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(g.f15484c);
            parcelObtain.writeStringArray(strArr);
            this.f15478e.transact(1, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }
}
