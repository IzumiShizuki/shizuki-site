package c7;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class e implements f {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public IBinder f3610e;

    @Override // c7.f
    public final void X(CharSequence charSequence) {
        throw null;
    }

    @Override // c7.f
    public final void Z() {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
            if (!this.f3610e.transact(2, parcelObtain, null, 1)) {
                int i10 = i0.f3637f;
            }
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f3610e;
    }

    @Override // c7.f
    public final void d(int i10) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
            parcelObtain.writeInt(i10);
            if (!this.f3610e.transact(9, parcelObtain, null, 1)) {
                int i11 = i0.f3637f;
            }
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // c7.f
    public final void h0(int i10) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
            parcelObtain.writeInt(i10);
            if (!this.f3610e.transact(12, parcelObtain, null, 1)) {
                int i11 = i0.f3637f;
            }
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // c7.f
    public final void j(p1 p1Var) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
            if (p1Var != null) {
                parcelObtain.writeInt(1);
                p1Var.writeToParcel(parcelObtain, 0);
            } else {
                parcelObtain.writeInt(0);
            }
            if (!this.f3610e.transact(3, parcelObtain, null, 1)) {
                int i10 = i0.f3637f;
            }
            parcelObtain.recycle();
        } catch (Throwable th2) {
            parcelObtain.recycle();
            throw th2;
        }
    }

    @Override // c7.f
    public final void l(r0 r0Var) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
            if (r0Var != null) {
                parcelObtain.writeInt(1);
                parcelObtain.writeBundle(r0Var.f3716a);
            } else {
                parcelObtain.writeInt(0);
            }
            if (!this.f3610e.transact(4, parcelObtain, null, 1)) {
                int i10 = i0.f3637f;
            }
            parcelObtain.recycle();
        } catch (Throwable th2) {
            parcelObtain.recycle();
            throw th2;
        }
    }

    @Override // c7.f
    public final void r(m1 m1Var) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
            parcelObtain.writeInt(1);
            m1Var.writeToParcel(parcelObtain, 0);
            if (!this.f3610e.transact(8, parcelObtain, null, 1)) {
                int i10 = i0.f3637f;
            }
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // c7.f
    public final void x(Bundle bundle) {
        throw null;
    }

    @Override // c7.f
    public final void z(List list) {
        throw null;
    }
}
