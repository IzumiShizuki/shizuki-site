package c7;

import android.app.PendingIntent;
import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import com.tencent.bugly.beta.tinker.TinkerReport;
import com.tencent.bugly.beta.tinker.TinkerUtils;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class v0 extends Binder implements h {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f3736f = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AtomicReference f3737e;

    public v0(w0 w0Var) {
        attachInterface(this, "android.support.v4.media.session.IMediaSession");
        this.f3737e = new AtomicReference(w0Var);
    }

    @Override // c7.h
    public final CharSequence A() {
        throw new AssertionError();
    }

    @Override // c7.h
    public final void C() {
        throw new AssertionError();
    }

    @Override // c7.h
    public final r0 D() {
        throw new AssertionError();
    }

    @Override // c7.h
    public final void E(String str, Bundle bundle) {
        throw new AssertionError();
    }

    @Override // c7.h
    public final Bundle F() {
        Bundle bundle;
        w0 w0Var = (w0) this.f3737e.get();
        if (w0Var == null || (bundle = w0Var.f3743e) == null) {
            return null;
        }
        return new Bundle(bundle);
    }

    @Override // c7.h
    public final void G(String str, Bundle bundle) {
        throw new AssertionError();
    }

    @Override // c7.h
    public final void I(String str, Bundle bundle) {
        throw new AssertionError();
    }

    @Override // c7.h
    public final void J(f fVar) {
        w0 w0Var = (w0) this.f3737e.get();
        if (w0Var == null || fVar == null) {
            return;
        }
        w0Var.f3744f.register(fVar, new k1(Binder.getCallingPid(), Binder.getCallingUid(), "android.media.session.MediaController"));
        synchronized (w0Var.f3742d) {
        }
    }

    @Override // c7.h
    public final void K(int i10, int i11) {
        throw new AssertionError();
    }

    @Override // c7.h
    public final void L() {
        throw new AssertionError();
    }

    @Override // c7.h
    public final void M(Uri uri, Bundle bundle) {
        throw new AssertionError();
    }

    @Override // c7.h
    public final void O(long j10) {
        throw new AssertionError();
    }

    @Override // c7.h
    public final void T(float f10) {
        throw new AssertionError();
    }

    @Override // c7.h
    public final boolean U(KeyEvent keyEvent) {
        throw new AssertionError();
    }

    @Override // c7.h
    public final String a0() {
        throw new AssertionError();
    }

    @Override // c7.h
    public final void b0(boolean z10) {
        throw new AssertionError();
    }

    @Override // c7.h
    public final void c() {
        throw new AssertionError();
    }

    @Override // c7.h
    public final int d0() {
        w0 w0Var = (w0) this.f3737e.get();
        if (w0Var != null) {
            return w0Var.f3750l;
        }
        return -1;
    }

    @Override // c7.h
    public final String e() {
        throw new AssertionError();
    }

    @Override // c7.h
    public final void e0(int i10) {
        throw new AssertionError();
    }

    @Override // c7.h
    public final boolean f0() {
        return false;
    }

    @Override // c7.h
    public final void g(f fVar) {
        w0 w0Var = (w0) this.f3737e.get();
        if (w0Var == null || fVar == null) {
            return;
        }
        w0Var.f3744f.unregister(fVar);
        Binder.getCallingPid();
        Binder.getCallingUid();
        synchronized (w0Var.f3742d) {
        }
    }

    @Override // c7.h
    public final void g0(q0 q0Var) {
        throw new AssertionError();
    }

    @Override // c7.h
    public final Bundle getExtras() {
        throw new AssertionError();
    }

    @Override // c7.h
    public final void h(String str, Bundle bundle) {
        throw new AssertionError();
    }

    @Override // c7.h
    public final p1 i() {
        w0 w0Var = (w0) this.f3737e.get();
        if (w0Var == null) {
            return null;
        }
        p1 p1Var = w0Var.f3745g;
        r0 r0Var = w0Var.f3747i;
        if (p1Var == null) {
            return p1Var;
        }
        float f10 = p1Var.f3690d;
        long j10 = p1Var.f3694h;
        int i10 = p1Var.f3687a;
        long j11 = p1Var.f3688b;
        long jA = -1;
        if (j11 == -1) {
            return p1Var;
        }
        if ((i10 != 3 && i10 != 4 && i10 != 5) || j10 <= 0) {
            return p1Var;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j12 = ((long) (f10 * (jElapsedRealtime - j10))) + j11;
        if (r0Var != null && r0Var.f3716a.containsKey("android.media.metadata.DURATION")) {
            jA = r0Var.a("android.media.metadata.DURATION");
        }
        long j13 = (jA < 0 || j12 <= jA) ? j12 < 0 ? 0L : j12 : jA;
        ArrayList arrayList = new ArrayList();
        long j14 = p1Var.f3689c;
        long j15 = p1Var.f3691e;
        int i11 = p1Var.f3692f;
        CharSequence charSequence = p1Var.f3693g;
        AbstractCollection abstractCollection = p1Var.f3695i;
        if (abstractCollection != null) {
            arrayList.addAll(abstractCollection);
        }
        return new p1(p1Var.f3687a, j13, j14, p1Var.f3690d, j15, i11, charSequence, jElapsedRealtime, arrayList, p1Var.f3696j, p1Var.f3697k);
    }

    @Override // c7.h
    public final void i0(String str, Bundle bundle, c1 c1Var) {
        throw new AssertionError();
    }

    @Override // c7.h
    public final List j0() {
        return null;
    }

    @Override // c7.h
    public final void k() {
        throw new AssertionError();
    }

    @Override // c7.h
    public final void k0(int i10) {
        throw new AssertionError();
    }

    @Override // c7.h
    public final void m(Uri uri, Bundle bundle) {
        throw new AssertionError();
    }

    @Override // c7.h
    public final void m0() {
        throw new AssertionError();
    }

    @Override // c7.h
    public final void n0(q0 q0Var, int i10) {
        throw new AssertionError();
    }

    @Override // c7.h
    public final void next() {
        throw new AssertionError();
    }

    @Override // c7.h
    public final long o0() {
        throw new AssertionError();
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 1598968902) {
            parcel2.getClass();
            parcel2.writeString("android.support.v4.media.session.IMediaSession");
            return true;
        }
        f fVar = null;
        f fVar2 = null;
        switch (i10) {
            case 1:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                i0(parcel.readString(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? c1.CREATOR.createFromParcel(parcel) : null);
                parcel2.getClass();
                parcel2.writeNoException();
                return true;
            case 2:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                boolean zU = U(parcel.readInt() != 0 ? (KeyEvent) KeyEvent.CREATOR.createFromParcel(parcel) : null);
                parcel2.getClass();
                parcel2.writeNoException();
                parcel2.writeInt(zU ? 1 : 0);
                return true;
            case 3:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("android.support.v4.media.session.IMediaControllerCallback");
                    if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof f)) {
                        e eVar = new e();
                        eVar.f3610e = strongBinder;
                        fVar2 = eVar;
                    } else {
                        fVar2 = (f) iInterfaceQueryLocalInterface;
                    }
                }
                J(fVar2);
                parcel2.getClass();
                parcel2.writeNoException();
                return true;
            case 4:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("android.support.v4.media.session.IMediaControllerCallback");
                    if (iInterfaceQueryLocalInterface2 == null || !(iInterfaceQueryLocalInterface2 instanceof f)) {
                        e eVar2 = new e();
                        eVar2.f3610e = strongBinder2;
                        fVar = eVar2;
                    } else {
                        fVar = (f) iInterfaceQueryLocalInterface2;
                    }
                }
                g(fVar);
                parcel2.getClass();
                parcel2.writeNoException();
                return true;
            case 5:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                boolean zP = p();
                parcel2.getClass();
                parcel2.writeNoException();
                parcel2.writeInt(zP ? 1 : 0);
                return true;
            case 6:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                String strE = e();
                parcel2.getClass();
                parcel2.writeNoException();
                parcel2.writeString(strE);
                return true;
            case 7:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                String strA0 = a0();
                parcel2.getClass();
                parcel2.writeNoException();
                parcel2.writeString(strA0);
                return true;
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_DALVIK /* 8 */:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                PendingIntent pendingIntentQ = q();
                parcel2.getClass();
                parcel2.writeNoException();
                if (pendingIntentQ == null) {
                    parcel2.writeInt(0);
                    return true;
                }
                parcel2.writeInt(1);
                pendingIntentQ.writeToParcel(parcel2, 1);
                return true;
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_ART /* 9 */:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                long jO0 = o0();
                parcel2.getClass();
                parcel2.writeNoException();
                parcel2.writeLong(jO0);
                return true;
            case TinkerReport.KEY_APPLY_WITH_RETRY /* 10 */:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                m1 m1VarR0 = r0();
                parcel2.getClass();
                parcel2.writeNoException();
                if (m1VarR0 == null) {
                    parcel2.writeInt(0);
                    return true;
                }
                parcel2.writeInt(1);
                m1VarR0.writeToParcel(parcel2, 1);
                return true;
            case 11:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                int i12 = parcel.readInt();
                int i13 = parcel.readInt();
                parcel.readString();
                y(i12, i13);
                parcel2.getClass();
                parcel2.writeNoException();
                return true;
            case 12:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                int i14 = parcel.readInt();
                int i15 = parcel.readInt();
                parcel.readString();
                K(i14, i15);
                parcel2.getClass();
                parcel2.writeNoException();
                return true;
            case 13:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                k();
                parcel2.getClass();
                parcel2.writeNoException();
                return true;
            case 14:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                G(parcel.readString(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                parcel2.getClass();
                parcel2.writeNoException();
                return true;
            case 15:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                I(parcel.readString(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                parcel2.getClass();
                parcel2.writeNoException();
                return true;
            case 16:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                M(parcel.readInt() != 0 ? (Uri) Uri.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                parcel2.getClass();
                parcel2.writeNoException();
                return true;
            case 17:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                q0(parcel.readLong());
                parcel2.getClass();
                parcel2.writeNoException();
                return true;
            case 18:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                C();
                parcel2.getClass();
                parcel2.writeNoException();
                return true;
            case 19:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                stop();
                parcel2.getClass();
                parcel2.writeNoException();
                return true;
            case 20:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                next();
                parcel2.getClass();
                parcel2.writeNoException();
                return true;
            case 21:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                previous();
                parcel2.getClass();
                parcel2.writeNoException();
                return true;
            case 22:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                L();
                parcel2.getClass();
                parcel2.writeNoException();
                return true;
            case 23:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                m0();
                parcel2.getClass();
                parcel2.writeNoException();
                return true;
            case 24:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                O(parcel.readLong());
                parcel2.getClass();
                parcel2.writeNoException();
                return true;
            case 25:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                w(parcel.readInt() != 0 ? q1.CREATOR.createFromParcel(parcel) : null);
                parcel2.getClass();
                parcel2.writeNoException();
                return true;
            case 26:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                h(parcel.readString(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                parcel2.getClass();
                parcel2.writeNoException();
                return true;
            case 27:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                r0 r0VarD = D();
                parcel2.getClass();
                parcel2.writeNoException();
                if (r0VarD == null) {
                    parcel2.writeInt(0);
                    return true;
                }
                parcel2.writeInt(1);
                parcel2.writeBundle(r0VarD.f3716a);
                return true;
            case 28:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                p1 p1VarI = i();
                parcel2.getClass();
                parcel2.writeNoException();
                if (p1VarI == null) {
                    parcel2.writeInt(0);
                    return true;
                }
                parcel2.writeInt(1);
                p1VarI.writeToParcel(parcel2, 1);
                return true;
            case 29:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                List listJ0 = j0();
                parcel2.getClass();
                parcel2.writeNoException();
                parcel2.writeTypedList(listJ0);
                return true;
            case 30:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                CharSequence charSequenceA = A();
                parcel2.getClass();
                parcel2.writeNoException();
                if (charSequenceA == null) {
                    parcel2.writeInt(0);
                    return true;
                }
                parcel2.writeInt(1);
                TextUtils.writeToParcel(charSequenceA, parcel2, 1);
                return true;
            case 31:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                Bundle extras = getExtras();
                parcel2.getClass();
                parcel2.writeNoException();
                if (extras == null) {
                    parcel2.writeInt(0);
                    return true;
                }
                parcel2.writeInt(1);
                extras.writeToParcel(parcel2, 1);
                return true;
            case 32:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                int iS = s();
                parcel2.getClass();
                parcel2.writeNoException();
                parcel2.writeInt(iS);
                return true;
            case 33:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                c();
                parcel2.getClass();
                parcel2.writeNoException();
                return true;
            case 34:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                E(parcel.readString(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                parcel2.getClass();
                parcel2.writeNoException();
                return true;
            case 35:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                u(parcel.readString(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                parcel2.getClass();
                parcel2.writeNoException();
                return true;
            case 36:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                m(parcel.readInt() != 0 ? (Uri) Uri.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                parcel2.getClass();
                parcel2.writeNoException();
                return true;
            case 37:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                int iP0 = p0();
                parcel2.getClass();
                parcel2.writeNoException();
                parcel2.writeInt(iP0);
                return true;
            case 38:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                parcel2.getClass();
                parcel2.writeNoException();
                parcel2.writeInt(0);
                return true;
            case 39:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                k0(parcel.readInt());
                parcel2.getClass();
                parcel2.writeNoException();
                return true;
            case 40:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                parcel.readInt();
                parcel2.getClass();
                parcel2.writeNoException();
                return true;
            case 41:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                s0(parcel.readInt() != 0 ? q0.CREATOR.createFromParcel(parcel) : null);
                parcel2.getClass();
                parcel2.writeNoException();
                return true;
            case 42:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                n0(parcel.readInt() != 0 ? q0.CREATOR.createFromParcel(parcel) : null, parcel.readInt());
                parcel2.getClass();
                parcel2.writeNoException();
                return true;
            case 43:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                g0(parcel.readInt() != 0 ? q0.CREATOR.createFromParcel(parcel) : null);
                parcel2.getClass();
                parcel2.writeNoException();
                return true;
            case 44:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                e0(parcel.readInt());
                parcel2.getClass();
                parcel2.writeNoException();
                return true;
            case TinkerUtils.MIN_MEMORY_HEAP_SIZE /* 45 */:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                boolean zF0 = f0();
                parcel2.getClass();
                parcel2.writeNoException();
                parcel2.writeInt(zF0 ? 1 : 0);
                return true;
            case 46:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                b0(parcel.readInt() != 0);
                parcel2.getClass();
                parcel2.writeNoException();
                return true;
            case 47:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                int iD0 = d0();
                parcel2.getClass();
                parcel2.writeNoException();
                parcel2.writeInt(iD0);
                return true;
            case 48:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                u0(parcel.readInt());
                parcel2.getClass();
                parcel2.writeNoException();
                return true;
            case 49:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                T(parcel.readFloat());
                parcel2.getClass();
                parcel2.writeNoException();
                return true;
            case 50:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                Bundle bundleF = F();
                parcel2.getClass();
                parcel2.writeNoException();
                if (bundleF == null) {
                    parcel2.writeInt(0);
                    return true;
                }
                parcel2.writeInt(1);
                bundleF.writeToParcel(parcel2, 1);
                return true;
            case 51:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                t0(parcel.readInt() != 0 ? q1.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                parcel2.getClass();
                parcel2.writeNoException();
                return true;
            default:
                return super.onTransact(i10, parcel, parcel2, i11);
        }
    }

    @Override // c7.h
    public final boolean p() {
        throw new AssertionError();
    }

    @Override // c7.h
    public final int p0() {
        w0 w0Var = (w0) this.f3737e.get();
        if (w0Var != null) {
            return w0Var.f3749k;
        }
        return -1;
    }

    @Override // c7.h
    public final void previous() {
        throw new AssertionError();
    }

    @Override // c7.h
    public final PendingIntent q() {
        throw new AssertionError();
    }

    @Override // c7.h
    public final void q0(long j10) {
        throw new AssertionError();
    }

    @Override // c7.h
    public final m1 r0() {
        throw new AssertionError();
    }

    @Override // c7.h
    public final int s() {
        w0 w0Var = (w0) this.f3737e.get();
        if (w0Var != null) {
            return w0Var.f3748j;
        }
        return 0;
    }

    @Override // c7.h
    public final void s0(q0 q0Var) {
        throw new AssertionError();
    }

    @Override // c7.h
    public final void stop() {
        throw new AssertionError();
    }

    @Override // c7.h
    public final void t0(q1 q1Var, Bundle bundle) {
        throw new AssertionError();
    }

    @Override // c7.h
    public final void u(String str, Bundle bundle) {
        throw new AssertionError();
    }

    @Override // c7.h
    public final void u0(int i10) {
        throw new AssertionError();
    }

    @Override // c7.h
    public final void w(q1 q1Var) {
        throw new AssertionError();
    }

    @Override // c7.h
    public final void y(int i10, int i11) {
        throw new AssertionError();
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
