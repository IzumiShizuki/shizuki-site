package m4;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class f extends Binder {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f14194f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ya.i0 f14195e;

    static {
        f14194f = p4.c0.f16548a >= 30 ? IBinder.getSuggestedMaxIpcSizeBytes() : 65536;
    }

    public f(List list) {
        this.f14195e = ya.i0.q(list);
    }

    public static ya.i0 a(IBinder iBinder) {
        int i10;
        if (iBinder instanceof f) {
            return ((f) iBinder).f14195e;
        }
        ya.f0 f0VarP = ya.i0.p();
        int i11 = 1;
        int i12 = 0;
        while (i11 != 0) {
            Parcel parcelObtain = Parcel.obtain();
            Parcel parcelObtain2 = Parcel.obtain();
            try {
                parcelObtain.writeInt(i12);
                try {
                    iBinder.transact(1, parcelObtain, parcelObtain2, 0);
                    while (true) {
                        i10 = parcelObtain2.readInt();
                        if (i10 == 1) {
                            Bundle bundle = parcelObtain2.readBundle();
                            bundle.getClass();
                            f0VarP.a(bundle);
                            i12++;
                        }
                    }
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                    i11 = i10;
                } catch (RemoteException e10) {
                    throw new RuntimeException(e10);
                }
            } catch (Throwable th2) {
                parcelObtain2.recycle();
                parcelObtain.recycle();
                throw th2;
            }
        }
        return f0VarP.f();
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 != 1) {
            return super.onTransact(i10, parcel, parcel2, i11);
        }
        if (parcel2 == null) {
            return false;
        }
        ya.i0 i0Var = this.f14195e;
        int size = i0Var.size();
        int i12 = parcel.readInt();
        while (i12 < size && parcel2.dataSize() < f14194f) {
            parcel2.writeInt(1);
            parcel2.writeBundle((Bundle) i0Var.get(i12));
            i12++;
        }
        parcel2.writeInt(i12 < size ? 2 : 0);
        return true;
    }
}
