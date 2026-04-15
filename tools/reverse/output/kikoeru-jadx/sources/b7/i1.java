package b7;

import android.app.PendingIntent;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class i1 extends Binder implements r {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final WeakReference f1856e;

    public i1(t0 t0Var) {
        attachInterface(this, "androidx.media3.session.IMediaController");
        this.f1856e = new WeakReference(t0Var);
    }

    public static r A0(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("androidx.media3.session.IMediaController");
        if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof r)) {
            return (r) iInterfaceQueryLocalInterface;
        }
        q qVar = new q();
        qVar.f2036e = iBinder;
        return qVar;
    }

    @Override // b7.r
    public final void B(int i10, Bundle bundle) {
        if (bundle == null) {
            return;
        }
        try {
            B0(new androidx.media3.exoplayer.offline.g(5, k.a(bundle)));
        } catch (RuntimeException e10) {
            p4.c.C("MediaControllerStub", "Malformed Bundle for ConnectionResult. Disconnected from the session.", e10);
            a();
        }
    }

    public final void B0(h1 h1Var) {
        long jClearCallingIdentity = Binder.clearCallingIdentity();
        try {
            t0 t0Var = (t0) this.f1856e.get();
            if (t0Var == null) {
                return;
            }
            p4.c0.R(t0Var.f2069a.f1707d, new b5.h(2, t0Var, h1Var));
        } finally {
            Binder.restoreCallingIdentity(jClearCallingIdentity);
        }
    }

    public final int C0() {
        k4 k4Var;
        t0 t0Var = (t0) this.f1856e.get();
        if (t0Var == null || (k4Var = t0Var.f2079k) == null) {
            return -1;
        }
        return k4Var.f1919a.j();
    }

    public final void D0(int i10, Object obj) {
        long jClearCallingIdentity = Binder.clearCallingIdentity();
        try {
            t0 t0Var = (t0) this.f1856e.get();
            if (t0Var == null) {
                return;
            }
            t0Var.f2070b.l(i10, obj);
            t0Var.f2069a.e(new p0(i10, 0, t0Var));
        } finally {
            Binder.restoreCallingIdentity(jClearCallingIdentity);
        }
    }

    @Override // b7.r
    public final void N(int i10, Bundle bundle) {
        if (bundle == null) {
            return;
        }
        try {
            B0(new f1(m4.u0.b(bundle)));
        } catch (RuntimeException e10) {
            p4.c.C("MediaControllerStub", "Ignoring malformed Bundle for Commands", e10);
        }
    }

    @Override // b7.r
    public final void P(int i10, Bundle bundle) {
        if (bundle == null) {
            return;
        }
        try {
            B0(new androidx.media3.exoplayer.offline.g(3, h4.b(bundle)));
        } catch (RuntimeException e10) {
            p4.c.C("MediaControllerStub", "Ignoring malformed Bundle for SessionPositionInfo", e10);
        }
    }

    @Override // b7.r
    public final void S(int i10, Bundle bundle, Bundle bundle2) {
        if (bundle == null || bundle2 == null) {
            return;
        }
        try {
            int iC0 = C0();
            if (iC0 == -1) {
                return;
            }
            try {
                B0(new i0(5, v3.j(iC0, bundle), new t3(bundle2.getBoolean(t3.f2103d, false), bundle2.getBoolean(t3.f2104e, false))));
            } catch (RuntimeException e10) {
                p4.c.C("MediaControllerStub", "Ignoring malformed Bundle for BundlingExclusions", e10);
            }
        } catch (RuntimeException e11) {
            p4.c.C("MediaControllerStub", "Ignoring malformed Bundle for PlayerInfo", e11);
        }
    }

    @Override // b7.r
    public final void Y(int i10, Bundle bundle) {
        if (bundle == null) {
            return;
        }
        try {
            D0(i10, y.a(bundle));
        } catch (RuntimeException e10) {
            p4.c.C("MediaControllerStub", "Ignoring malformed Bundle for LibraryResult", e10);
        }
    }

    @Override // b7.r
    public final void a() {
        B0(new b5.a(8));
    }

    @Override // b7.r
    public final void b(int i10) {
        B0(new b5.a(7));
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
        int i12;
        String str;
        if (i10 >= 1 && i10 <= 16777215) {
            parcel.enforceInterface("androidx.media3.session.IMediaController");
        }
        if (i10 == 1598968902) {
            parcel2.writeString("androidx.media3.session.IMediaController");
            return true;
        }
        if (i10 == 4001) {
            parcel.readInt();
            String string = parcel.readString();
            i12 = parcel.readInt();
            Bundle bundle = (Bundle) s3.a(parcel, Bundle.CREATOR);
            if (TextUtils.isEmpty(string)) {
                p4.c.B("MediaControllerStub", "onChildrenChanged(): Ignoring empty parentId");
            } else if (i12 < 0) {
                str = "onChildrenChanged(): Ignoring negative itemCount: ";
                q.t0.J(i12, str, "MediaControllerStub");
            } else if (bundle == null) {
                B0(new b5.a(9));
            } else {
                try {
                    j1.a(bundle);
                    B0(new b5.a(9));
                } catch (RuntimeException e10) {
                    p4.c.C("MediaControllerStub", "Ignoring malformed Bundle for LibraryParams", e10);
                }
            }
        } else if (i10 != 4002) {
            switch (i10) {
                case 3001:
                    B(parcel.readInt(), (Bundle) s3.a(parcel, Bundle.CREATOR));
                    return true;
                case 3002:
                    y0(parcel.readInt(), (Bundle) s3.a(parcel, Bundle.CREATOR));
                    return true;
                case 3003:
                    Y(parcel.readInt(), (Bundle) s3.a(parcel, Bundle.CREATOR));
                    return true;
                case 3004:
                    int i13 = parcel.readInt();
                    ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(Bundle.CREATOR);
                    if (arrayListCreateTypedArrayList != null) {
                        try {
                            int iC0 = C0();
                            if (iC0 != -1) {
                                ya.f0 f0VarP = ya.i0.p();
                                for (int i14 = 0; i14 < arrayListCreateTypedArrayList.size(); i14++) {
                                    Bundle bundle2 = (Bundle) arrayListCreateTypedArrayList.get(i14);
                                    bundle2.getClass();
                                    f0VarP.a(b.d(iC0, bundle2));
                                }
                                B0(new e1(i13, f0VarP.f(), 1));
                            }
                        } catch (RuntimeException e11) {
                            p4.c.C("MediaControllerStub", "Ignoring malformed Bundle for CommandButton", e11);
                        }
                    }
                    break;
                case 3005:
                    int i15 = parcel.readInt();
                    Parcelable.Creator creator = Bundle.CREATOR;
                    Bundle bundle3 = (Bundle) s3.a(parcel, creator);
                    Bundle bundle4 = (Bundle) s3.a(parcel, creator);
                    if (bundle3 == null || bundle4 == null) {
                        p4.c.B("MediaControllerStub", "Ignoring custom command with null args.");
                    } else {
                        try {
                            B0(new g1(i15, e4.a(bundle3), bundle4));
                        } catch (RuntimeException e12) {
                            p4.c.C("MediaControllerStub", "Ignoring malformed Bundle for SessionCommand", e12);
                        }
                    }
                    break;
                case 3006:
                    parcel.readInt();
                    a();
                    return true;
                case 3007:
                    v0(parcel.readInt(), (Bundle) s3.a(parcel, Bundle.CREATOR), parcel.readInt() != 0);
                    return true;
                case 3008:
                    P(parcel.readInt(), (Bundle) s3.a(parcel, Bundle.CREATOR));
                    return true;
                case 3009:
                    N(parcel.readInt(), (Bundle) s3.a(parcel, Bundle.CREATOR));
                    return true;
                case 3010:
                    parcel.readInt();
                    Parcelable.Creator creator2 = Bundle.CREATOR;
                    Bundle bundle5 = (Bundle) s3.a(parcel, creator2);
                    Bundle bundle6 = (Bundle) s3.a(parcel, creator2);
                    if (bundle5 != null && bundle6 != null) {
                        try {
                            try {
                                B0(new i0(6, f4.a(bundle5), m4.u0.b(bundle6)));
                            } catch (RuntimeException e13) {
                                p4.c.C("MediaControllerStub", "Ignoring malformed Bundle for Commands", e13);
                            }
                        } catch (RuntimeException e14) {
                            p4.c.C("MediaControllerStub", "Ignoring malformed Bundle for SessionCommands", e14);
                        }
                    }
                    break;
                case 3011:
                    b(parcel.readInt());
                    return true;
                case 3012:
                    parcel.readInt();
                    Bundle bundle7 = (Bundle) s3.a(parcel, Bundle.CREATOR);
                    if (bundle7 == null) {
                        p4.c.B("MediaControllerStub", "Ignoring null Bundle for extras");
                        return true;
                    }
                    B0(new androidx.media3.exoplayer.offline.g(4, bundle7));
                    return true;
                case 3013:
                    int i16 = parcel.readInt();
                    Parcelable.Creator creator3 = Bundle.CREATOR;
                    S(i16, (Bundle) s3.a(parcel, creator3), (Bundle) s3.a(parcel, creator3));
                    return true;
                case 3014:
                    int i17 = parcel.readInt();
                    PendingIntent pendingIntent = (PendingIntent) s3.a(parcel, PendingIntent.CREATOR);
                    if (pendingIntent == null) {
                        p4.c.B("MediaControllerStub", "Ignoring null session activity intent");
                        return true;
                    }
                    B0(new b5.a(i17, 10, pendingIntent));
                    return true;
                case 3015:
                    try {
                        B0(new b5.a(parcel.readInt(), 6, g4.a((Bundle) s3.a(parcel, Bundle.CREATOR))));
                    } catch (RuntimeException e15) {
                        p4.c.C("MediaControllerStub", "Ignoring malformed Bundle for SessionError", e15);
                    }
                    break;
                case 3016:
                    int i18 = parcel.readInt();
                    ArrayList arrayListCreateTypedArrayList2 = parcel.createTypedArrayList(Bundle.CREATOR);
                    if (arrayListCreateTypedArrayList2 != null) {
                        try {
                            int iC02 = C0();
                            if (iC02 != -1) {
                                ya.f0 f0VarP2 = ya.i0.p();
                                for (int i19 = 0; i19 < arrayListCreateTypedArrayList2.size(); i19++) {
                                    Bundle bundle8 = (Bundle) arrayListCreateTypedArrayList2.get(i19);
                                    bundle8.getClass();
                                    f0VarP2.a(b.d(iC02, bundle8));
                                }
                                B0(new e1(i18, f0VarP2.f(), 0));
                            }
                        } catch (RuntimeException e16) {
                            p4.c.C("MediaControllerStub", "Ignoring malformed Bundle for CommandButton", e16);
                        }
                    }
                    break;
                default:
                    return super.onTransact(i10, parcel, parcel2, i11);
            }
        } else {
            parcel.readInt();
            String string2 = parcel.readString();
            i12 = parcel.readInt();
            Bundle bundle9 = (Bundle) s3.a(parcel, Bundle.CREATOR);
            if (TextUtils.isEmpty(string2)) {
                p4.c.B("MediaControllerStub", "onSearchResultChanged(): Ignoring empty query");
            } else if (i12 < 0) {
                str = "onSearchResultChanged(): Ignoring negative itemCount: ";
                q.t0.J(i12, str, "MediaControllerStub");
            } else if (bundle9 == null) {
                B0(new b5.a(9));
            } else {
                try {
                    j1.a(bundle9);
                    B0(new b5.a(9));
                } catch (RuntimeException e17) {
                    p4.c.C("MediaControllerStub", "Ignoring malformed Bundle for LibraryParams", e17);
                }
            }
        }
        return true;
    }

    @Override // b7.r
    public final void v0(int i10, Bundle bundle, boolean z10) {
        Bundle bundle2 = new Bundle();
        bundle2.putBoolean(t3.f2103d, z10);
        bundle2.putBoolean(t3.f2104e, true);
        S(i10, bundle, bundle2);
    }

    @Override // b7.r
    public final void y0(int i10, Bundle bundle) {
        if (bundle == null) {
            return;
        }
        try {
            D0(i10, i4.a(bundle));
        } catch (RuntimeException e10) {
            p4.c.C("MediaControllerStub", "Ignoring malformed Bundle for SessionResult", e10);
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
