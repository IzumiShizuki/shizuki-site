package c7;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.text.TextUtils;
import com.tencent.bugly.beta.tinker.TinkerReport;
import java.lang.ref.WeakReference;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class i0 extends Binder implements f {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f3637f = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final WeakReference f3638e;

    public i0(b7.a1 a1Var) {
        attachInterface(this, "android.support.v4.media.session.IMediaControllerCallback");
        this.f3638e = new WeakReference(a1Var);
    }

    @Override // c7.f
    public final void X(CharSequence charSequence) {
        throw new AssertionError();
    }

    @Override // c7.f
    public final void Z() {
        throw new AssertionError();
    }

    @Override // c7.f
    public final void d(int i10) {
        b7.a1 a1Var = (b7.a1) this.f3638e.get();
        if (a1Var != null) {
            a1Var.i(9, Integer.valueOf(i10), null);
        }
    }

    @Override // c7.f
    public final void h0(int i10) {
        b7.a1 a1Var = (b7.a1) this.f3638e.get();
        if (a1Var != null) {
            a1Var.i(12, Integer.valueOf(i10), null);
        }
    }

    @Override // c7.f
    public final void j(p1 p1Var) {
        b7.a1 a1Var = (b7.a1) this.f3638e.get();
        if (a1Var != null) {
            a1Var.i(2, p1Var, null);
        }
    }

    @Override // c7.f
    public final void l(r0 r0Var) {
        throw new AssertionError();
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 1598968902) {
            parcel2.getClass();
            parcel2.writeString("android.support.v4.media.session.IMediaControllerCallback");
            return true;
        }
        WeakReference weakReference = this.f3638e;
        switch (i10) {
            case 1:
                parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                String string = parcel.readString();
                Bundle bundle = parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null;
                b7.a1 a1Var = (b7.a1) weakReference.get();
                if (a1Var != null) {
                    a1Var.i(1, string, bundle);
                }
                return true;
            case 2:
                parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                Z();
                return true;
            case 3:
                parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                j(parcel.readInt() != 0 ? p1.CREATOR.createFromParcel(parcel) : null);
                return true;
            case 4:
                parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                l(parcel.readInt() != 0 ? r0.CREATOR.createFromParcel(parcel) : null);
                return true;
            case 5:
                parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                z(parcel.createTypedArrayList(b1.CREATOR));
                return true;
            case 6:
                parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                X(parcel.readInt() != 0 ? (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel) : null);
                return true;
            case 7:
                parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                x(parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                return true;
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_DALVIK /* 8 */:
                parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                r(parcel.readInt() != 0 ? m1.CREATOR.createFromParcel(parcel) : null);
                return true;
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_ART /* 9 */:
                parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                d(parcel.readInt());
                return true;
            case TinkerReport.KEY_APPLY_WITH_RETRY /* 10 */:
                parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                parcel.readInt();
                return true;
            case 11:
                parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                boolean z10 = parcel.readInt() != 0;
                b7.a1 a1Var2 = (b7.a1) weakReference.get();
                if (a1Var2 != null) {
                    a1Var2.i(11, Boolean.valueOf(z10), null);
                    return true;
                }
                return true;
            case 12:
                parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                h0(parcel.readInt());
                return true;
            case 13:
                parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                b7.a1 a1Var3 = (b7.a1) weakReference.get();
                if (a1Var3 != null) {
                    a1Var3.i(13, null, null);
                    return true;
                }
                return true;
            default:
                return super.onTransact(i10, parcel, parcel2, i11);
        }
    }

    @Override // c7.f
    public final void r(m1 m1Var) {
        throw new AssertionError();
    }

    @Override // c7.f
    public final void x(Bundle bundle) {
        throw new AssertionError();
    }

    @Override // c7.f
    public final void z(List list) {
        throw new AssertionError();
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
