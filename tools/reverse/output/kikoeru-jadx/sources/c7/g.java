package c7;

import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.view.KeyEvent;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class g implements h {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public IBinder f3630e;

    @Override // c7.h
    public final CharSequence A() {
        throw null;
    }

    @Override // c7.h
    public final void C() {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
            if (!this.f3630e.transact(18, parcelObtain, parcelObtain2, 0)) {
                int i10 = v0.f3736f;
            }
            parcelObtain2.readException();
            parcelObtain2.recycle();
            parcelObtain.recycle();
        } catch (Throwable th2) {
            parcelObtain2.recycle();
            parcelObtain.recycle();
            throw th2;
        }
    }

    @Override // c7.h
    public final r0 D() {
        throw null;
    }

    @Override // c7.h
    public final void E(String str, Bundle bundle) {
        throw null;
    }

    @Override // c7.h
    public final void G(String str, Bundle bundle) {
        throw null;
    }

    @Override // c7.h
    public final void I(String str, Bundle bundle) {
        throw null;
    }

    @Override // c7.h
    public final void J(f fVar) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
            parcelObtain.writeStrongBinder((i0) fVar);
            if (!this.f3630e.transact(3, parcelObtain, parcelObtain2, 0)) {
                int i10 = v0.f3736f;
            }
            parcelObtain2.readException();
            parcelObtain2.recycle();
            parcelObtain.recycle();
        } catch (Throwable th2) {
            parcelObtain2.recycle();
            parcelObtain.recycle();
            throw th2;
        }
    }

    @Override // c7.h
    public final void K(int i10, int i11) {
        throw null;
    }

    @Override // c7.h
    public final void L() {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
            if (!this.f3630e.transact(22, parcelObtain, parcelObtain2, 0)) {
                int i10 = v0.f3736f;
            }
            parcelObtain2.readException();
            parcelObtain2.recycle();
            parcelObtain.recycle();
        } catch (Throwable th2) {
            parcelObtain2.recycle();
            parcelObtain.recycle();
            throw th2;
        }
    }

    @Override // c7.h
    public final void M(Uri uri, Bundle bundle) {
        throw null;
    }

    @Override // c7.h
    public final void O(long j10) {
        throw null;
    }

    @Override // c7.h
    public final void T(float f10) {
        throw null;
    }

    @Override // c7.h
    public final boolean U(KeyEvent keyEvent) {
        throw null;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f3630e;
    }

    @Override // c7.h
    public final void c() {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
            if (!this.f3630e.transact(33, parcelObtain, parcelObtain2, 0)) {
                int i10 = v0.f3736f;
            }
            parcelObtain2.readException();
            parcelObtain2.recycle();
            parcelObtain.recycle();
        } catch (Throwable th2) {
            parcelObtain2.recycle();
            parcelObtain.recycle();
            throw th2;
        }
    }

    @Override // c7.h
    public final int d0() {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
            if (!this.f3630e.transact(47, parcelObtain, parcelObtain2, 0)) {
                int i10 = v0.f3736f;
            }
            parcelObtain2.readException();
            int i11 = parcelObtain2.readInt();
            parcelObtain2.recycle();
            parcelObtain.recycle();
            return i11;
        } catch (Throwable th2) {
            parcelObtain2.recycle();
            parcelObtain.recycle();
            throw th2;
        }
    }

    @Override // c7.h
    public final String e() {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
            if (!this.f3630e.transact(6, parcelObtain, parcelObtain2, 0)) {
                int i10 = v0.f3736f;
            }
            parcelObtain2.readException();
            String string = parcelObtain2.readString();
            parcelObtain2.recycle();
            parcelObtain.recycle();
            return string;
        } catch (Throwable th2) {
            parcelObtain2.recycle();
            parcelObtain.recycle();
            throw th2;
        }
    }

    @Override // c7.h
    public final boolean f0() {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
            if (!this.f3630e.transact(45, parcelObtain, parcelObtain2, 0)) {
                int i10 = v0.f3736f;
            }
            parcelObtain2.readException();
            boolean z10 = parcelObtain2.readInt() != 0;
            parcelObtain2.recycle();
            parcelObtain.recycle();
            return z10;
        } catch (Throwable th2) {
            parcelObtain2.recycle();
            parcelObtain.recycle();
            throw th2;
        }
    }

    @Override // c7.h
    public final void g(f fVar) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
            parcelObtain.writeStrongBinder((i0) fVar);
            if (!this.f3630e.transact(4, parcelObtain, parcelObtain2, 0)) {
                int i10 = v0.f3736f;
            }
            parcelObtain2.readException();
            parcelObtain2.recycle();
            parcelObtain.recycle();
        } catch (Throwable th2) {
            parcelObtain2.recycle();
            parcelObtain.recycle();
            throw th2;
        }
    }

    @Override // c7.h
    public final void g0(q0 q0Var) {
        throw null;
    }

    @Override // c7.h
    public final Bundle getExtras() {
        throw null;
    }

    @Override // c7.h
    public final void h(String str, Bundle bundle) {
        throw null;
    }

    @Override // c7.h
    public final p1 i() {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
            if (!this.f3630e.transact(28, parcelObtain, parcelObtain2, 0)) {
                int i10 = v0.f3736f;
            }
            parcelObtain2.readException();
            p1 p1VarCreateFromParcel = parcelObtain2.readInt() != 0 ? p1.CREATOR.createFromParcel(parcelObtain2) : null;
            parcelObtain2.recycle();
            parcelObtain.recycle();
            return p1VarCreateFromParcel;
        } catch (Throwable th2) {
            parcelObtain2.recycle();
            parcelObtain.recycle();
            throw th2;
        }
    }

    @Override // c7.h
    public final void i0(String str, Bundle bundle, c1 c1Var) {
        throw null;
    }

    @Override // c7.h
    public final List j0() {
        throw null;
    }

    @Override // c7.h
    public final void k() {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
            if (!this.f3630e.transact(13, parcelObtain, parcelObtain2, 0)) {
                int i10 = v0.f3736f;
            }
            parcelObtain2.readException();
            parcelObtain2.recycle();
            parcelObtain.recycle();
        } catch (Throwable th2) {
            parcelObtain2.recycle();
            parcelObtain.recycle();
            throw th2;
        }
    }

    @Override // c7.h
    public final void k0(int i10) {
        throw null;
    }

    @Override // c7.h
    public final void m(Uri uri, Bundle bundle) {
        throw null;
    }

    @Override // c7.h
    public final void m0() {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
            if (!this.f3630e.transact(23, parcelObtain, parcelObtain2, 0)) {
                int i10 = v0.f3736f;
            }
            parcelObtain2.readException();
            parcelObtain2.recycle();
            parcelObtain.recycle();
        } catch (Throwable th2) {
            parcelObtain2.recycle();
            parcelObtain.recycle();
            throw th2;
        }
    }

    @Override // c7.h
    public final void n0(q0 q0Var, int i10) {
        throw null;
    }

    @Override // c7.h
    public final void next() {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
            if (!this.f3630e.transact(20, parcelObtain, parcelObtain2, 0)) {
                int i10 = v0.f3736f;
            }
            parcelObtain2.readException();
            parcelObtain2.recycle();
            parcelObtain.recycle();
        } catch (Throwable th2) {
            parcelObtain2.recycle();
            parcelObtain.recycle();
            throw th2;
        }
    }

    @Override // c7.h
    public final long o0() {
        throw null;
    }

    @Override // c7.h
    public final int p0() {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
            if (!this.f3630e.transact(37, parcelObtain, parcelObtain2, 0)) {
                int i10 = v0.f3736f;
            }
            parcelObtain2.readException();
            int i11 = parcelObtain2.readInt();
            parcelObtain2.recycle();
            parcelObtain.recycle();
            return i11;
        } catch (Throwable th2) {
            parcelObtain2.recycle();
            parcelObtain.recycle();
            throw th2;
        }
    }

    @Override // c7.h
    public final void previous() {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
            if (!this.f3630e.transact(21, parcelObtain, parcelObtain2, 0)) {
                int i10 = v0.f3736f;
            }
            parcelObtain2.readException();
            parcelObtain2.recycle();
            parcelObtain.recycle();
        } catch (Throwable th2) {
            parcelObtain2.recycle();
            parcelObtain.recycle();
            throw th2;
        }
    }

    @Override // c7.h
    public final void q0(long j10) {
        throw null;
    }

    @Override // c7.h
    public final m1 r0() {
        throw null;
    }

    @Override // c7.h
    public final int s() {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
            if (!this.f3630e.transact(32, parcelObtain, parcelObtain2, 0)) {
                int i10 = v0.f3736f;
            }
            parcelObtain2.readException();
            int i11 = parcelObtain2.readInt();
            parcelObtain2.recycle();
            parcelObtain.recycle();
            return i11;
        } catch (Throwable th2) {
            parcelObtain2.recycle();
            parcelObtain.recycle();
            throw th2;
        }
    }

    @Override // c7.h
    public final void stop() {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
            if (!this.f3630e.transact(19, parcelObtain, parcelObtain2, 0)) {
                int i10 = v0.f3736f;
            }
            parcelObtain2.readException();
            parcelObtain2.recycle();
            parcelObtain.recycle();
        } catch (Throwable th2) {
            parcelObtain2.recycle();
            parcelObtain.recycle();
            throw th2;
        }
    }

    @Override // c7.h
    public final void u(String str, Bundle bundle) {
        throw null;
    }

    @Override // c7.h
    public final void u0(int i10) {
        throw null;
    }

    @Override // c7.h
    public final void y(int i10, int i11) {
        throw null;
    }
}
