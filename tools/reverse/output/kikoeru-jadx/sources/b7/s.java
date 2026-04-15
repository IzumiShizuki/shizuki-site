package b7;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class s implements t {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public IBinder f2062e;

    @Override // b7.t
    public final void H(r rVar, int i10, Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(rVar);
            parcelObtain.writeInt(i10);
            s3.c(parcelObtain, bundle);
            this.f2062e.transact(3015, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // b7.t
    public final void Q(r rVar, int i10) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(rVar);
            parcelObtain.writeInt(i10);
            this.f2062e.transact(3035, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // b7.t
    public final void R(r rVar, int i10, IBinder iBinder, boolean z10) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(rVar);
            parcelObtain.writeInt(i10);
            parcelObtain.writeStrongBinder(iBinder);
            parcelObtain.writeInt(1);
            this.f2062e.transact(3011, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // b7.t
    public final void V(r rVar, int i10, Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(rVar);
            parcelObtain.writeInt(i10);
            s3.c(parcelObtain, bundle);
            this.f2062e.transact(3014, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // b7.t
    public final void W(r rVar, int i10) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(rVar);
            parcelObtain.writeInt(i10);
            this.f2062e.transact(3024, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f2062e;
    }

    @Override // b7.t
    public final void c0(r rVar, int i10, IBinder iBinder, int i11, long j10) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(rVar);
            parcelObtain.writeInt(i10);
            parcelObtain.writeStrongBinder(iBinder);
            parcelObtain.writeInt(i11);
            parcelObtain.writeLong(j10);
            this.f2062e.transact(3012, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // b7.t
    public final void f(r rVar, int i10) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(rVar);
            parcelObtain.writeInt(i10);
            this.f2062e.transact(3036, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // b7.t
    public final void l0(r rVar, int i10, Bundle bundle, long j10) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(rVar);
            parcelObtain.writeInt(i10);
            s3.c(parcelObtain, bundle);
            parcelObtain.writeLong(j10);
            this.f2062e.transact(3008, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // b7.t
    public final void n(r rVar, int i10, Bundle bundle, boolean z10) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(rVar);
            parcelObtain.writeInt(i10);
            s3.c(parcelObtain, bundle);
            parcelObtain.writeInt(1);
            this.f2062e.transact(3009, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // b7.t
    public final void v(r rVar, int i10) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(rVar);
            parcelObtain.writeInt(i10);
            this.f2062e.transact(3026, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // b7.t
    public final void w0(r rVar) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(rVar);
            this.f2062e.transact(3045, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // b7.t
    public final void x0(r rVar, int i10, Bundle bundle, Bundle bundle2) {
        Bundle bundle3 = Bundle.EMPTY;
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(rVar);
            parcelObtain.writeInt(i10);
            s3.c(parcelObtain, bundle);
            s3.c(parcelObtain, bundle3);
            this.f2062e.transact(3016, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }
}
