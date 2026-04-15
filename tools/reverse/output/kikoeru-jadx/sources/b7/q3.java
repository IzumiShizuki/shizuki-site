package b7;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.Surface;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class q3 extends Binder implements t {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ int f2044k = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final WeakReference f2045e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final c7.l1 f2046f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final b0.w1 f2047g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Set f2048h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ya.z0 f2049i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f2050j;

    public q3(c2 c2Var) {
        attachInterface(this, "androidx.media3.session.IMediaSession");
        this.f2045e = new WeakReference(c2Var);
        this.f2046f = c7.l1.a(c2Var.f1679f);
        this.f2047g = new b0.w1(c2Var);
        this.f2048h = Collections.synchronizedSet(new HashSet());
        this.f2049i = ya.z0.f26078i;
    }

    public static cb.y D0(c2 c2Var, t1 t1Var, int i10, p3 p3Var, p4.g gVar) {
        if (c2Var.h()) {
            return cb.v.f3880b;
        }
        cb.y yVar = (cb.y) p3Var.h(c2Var, t1Var, i10);
        cb.e0 e0Var = new cb.e0();
        yVar.a(new f(c2Var, e0Var, gVar, yVar, 5), cb.r.f3875a);
        return e0Var;
    }

    public static void H0(t1 t1Var, int i10, i4 i4Var) {
        try {
            s1 s1Var = t1Var.f2098d;
            p4.c.j(s1Var);
            s1Var.h(i10, i4Var);
        } catch (RemoteException e10) {
            p4.c.C("MediaSessionStub", "Failed to send result to controller " + t1Var, e10);
        }
    }

    public static androidx.media3.exoplayer.offline.g I0(p4.g gVar) {
        return new androidx.media3.exoplayer.offline.g(9, new androidx.media3.exoplayer.offline.g(10, gVar));
    }

    public final void A0(r rVar, t1 t1Var) {
        if (rVar != null) {
            c2 c2Var = (c2) this.f2045e.get();
            if (c2Var == null || c2Var.h()) {
                try {
                    rVar.a();
                } catch (RemoteException unused) {
                }
            } else {
                this.f2048h.add(t1Var);
                p4.c0.R(c2Var.f1685l, new f(this, t1Var, c2Var, rVar, 4));
            }
        }
    }

    public final void B0(r rVar, final int i10, final e4 e4Var, final int i11, final p3 p3Var) {
        long jClearCallingIdentity = Binder.clearCallingIdentity();
        try {
            final c2 c2Var = (c2) this.f2045e.get();
            if (c2Var != null && !c2Var.h()) {
                final t1 t1VarM = this.f2047g.M(rVar.asBinder());
                if (t1VarM == null) {
                    Binder.restoreCallingIdentity(jClearCallingIdentity);
                } else {
                    p4.c0.R(c2Var.f1685l, new Runnable() { // from class: b7.g3
                        @Override // java.lang.Runnable
                        public final void run() {
                            b0.w1 w1Var = this.f1787a.f2047g;
                            t1 t1Var = t1VarM;
                            if (w1Var.S(t1Var)) {
                                e4 e4Var2 = e4Var;
                                int i12 = i10;
                                if (e4Var2 != null) {
                                    if (!w1Var.W(t1Var, e4Var2)) {
                                        q3.H0(t1Var, i12, new i4(-4));
                                        return;
                                    }
                                } else if (!w1Var.V(t1Var, i11)) {
                                    q3.H0(t1Var, i12, new i4(-4));
                                    return;
                                }
                                p3Var.h(c2Var, t1Var, i12);
                            }
                        }
                    });
                    Binder.restoreCallingIdentity(jClearCallingIdentity);
                }
            }
        } finally {
            Binder.restoreCallingIdentity(jClearCallingIdentity);
        }
    }

    public final v3 C0(v3 v3Var) {
        ya.i0 i0Var = v3Var.D.f14561a;
        ya.f0 f0VarP = ya.i0.p();
        ya.a0 a0Var = new ya.a0(4);
        for (int i10 = 0; i10 < i0Var.size(); i10++) {
            m4.p1 p1Var = (m4.p1) i0Var.get(i10);
            m4.j1 j1Var = p1Var.f14509b;
            String string = (String) this.f2049i.get(j1Var);
            if (string == null) {
                StringBuilder sb = new StringBuilder();
                int i11 = this.f2050j;
                this.f2050j = i11 + 1;
                int i12 = p4.c0.f16548a;
                sb.append(Integer.toString(i11, 36));
                sb.append("-");
                sb.append(j1Var.f14305b);
                string = sb.toString();
            }
            a0Var.P(j1Var, string);
            f0VarP.a(new m4.p1(new m4.j1(string, p1Var.f14509b.f14307d), p1Var.f14510c, p1Var.f14511d, p1Var.f14512e));
        }
        this.f2049i = a0Var.c();
        v3 v3VarA = v3Var.a(new m4.q1(f0VarP.f()));
        m4.o1 o1Var = v3VarA.E;
        if (o1Var.B.isEmpty()) {
            return v3VarA;
        }
        m4.n1 n1VarC = o1Var.a().c();
        ya.o1 it = o1Var.B.values().iterator();
        while (it.hasNext()) {
            m4.k1 k1Var = (m4.k1) it.next();
            m4.j1 j1Var2 = k1Var.f14346a;
            String str = (String) this.f2049i.get(j1Var2);
            if (str != null) {
                n1VarC.a(new m4.k1(new m4.j1(str, j1Var2.f14307d), k1Var.f14347b));
            } else {
                n1VarC.a(k1Var);
            }
        }
        return v3VarA.h(n1VarC.b());
    }

    public final int E0(t1 t1Var, z3 z3Var, int i10) {
        if (z3Var.B0(17)) {
            b0.w1 w1Var = this.f2047g;
            if (!w1Var.T(t1Var, 17) && w1Var.T(t1Var, 16)) {
                return z3Var.G() + i10;
            }
        }
        return i10;
    }

    public final void F0(r rVar, int i10, int i11, p3 p3Var) {
        t1 t1VarM = this.f2047g.M(rVar.asBinder());
        if (t1VarM != null) {
            G0(t1VarM, i10, i11, p3Var);
        }
    }

    public final void G0(final t1 t1Var, final int i10, final int i11, final p3 p3Var) {
        long jClearCallingIdentity = Binder.clearCallingIdentity();
        try {
            final c2 c2Var = (c2) this.f2045e.get();
            if (c2Var != null && !c2Var.h()) {
                p4.c0.R(c2Var.f1685l, new Runnable() { // from class: b7.h3
                    @Override // java.lang.Runnable
                    public final void run() {
                        b0.w1 w1Var = this.f1813a.f2047g;
                        final t1 t1Var2 = t1Var;
                        int i12 = i11;
                        boolean zT = w1Var.T(t1Var2, i12);
                        final int i13 = i10;
                        if (!zT) {
                            q3.H0(t1Var2, i13, new i4(-4));
                            return;
                        }
                        final c2 c2Var2 = c2Var;
                        pe.d dVar = c2Var2.f1678e;
                        c2Var2.r(t1Var2);
                        dVar.getClass();
                        final p3 p3Var2 = p3Var;
                        if (i12 != 27) {
                            w1Var.y(t1Var2, i12, new g() { // from class: b7.l3
                                @Override // b7.g
                                public final cb.y run() {
                                    return (cb.y) p3Var2.h(c2Var2, t1Var2, i13);
                                }
                            });
                        } else {
                            p3Var2.h(c2Var2, t1Var2, i13);
                            w1Var.y(t1Var2, i12, new k3());
                        }
                    }
                });
                Binder.restoreCallingIdentity(jClearCallingIdentity);
            }
        } finally {
            Binder.restoreCallingIdentity(jClearCallingIdentity);
        }
    }

    @Override // b7.t
    public final void H(r rVar, int i10, Bundle bundle) {
        if (rVar == null || bundle == null) {
            return;
        }
        try {
            i iVarA = i.a(bundle);
            int callingUid = Binder.getCallingUid();
            int callingPid = Binder.getCallingPid();
            long jClearCallingIdentity = Binder.clearCallingIdentity();
            if (callingPid == 0) {
                callingPid = iVarA.f1850d;
            }
            try {
                c7.k1 k1Var = new c7.k1(callingPid, callingUid, iVarA.f1849c);
                A0(rVar, new t1(k1Var, iVarA.f1847a, iVarA.f1848b, this.f2046f.b(k1Var), new m3(rVar, iVarA.f1848b), iVarA.f1851e));
            } finally {
                Binder.restoreCallingIdentity(jClearCallingIdentity);
            }
        } catch (RuntimeException e10) {
            p4.c.C("MediaSessionStub", "Ignoring malformed Bundle for ConnectionRequest", e10);
        }
    }

    @Override // b7.t
    public final void Q(r rVar, int i10) {
        if (rVar == null) {
            return;
        }
        long jClearCallingIdentity = Binder.clearCallingIdentity();
        try {
            c2 c2Var = (c2) this.f2045e.get();
            if (c2Var != null && !c2Var.h()) {
                p4.c0.R(c2Var.f1685l, new b5.h(9, this, rVar));
            }
        } finally {
            Binder.restoreCallingIdentity(jClearCallingIdentity);
        }
    }

    @Override // b7.t
    public final void R(r rVar, int i10, IBinder iBinder, boolean z10) {
        if (rVar == null || iBinder == null) {
            return;
        }
        try {
            ya.i0 i0VarA = m4.f.a(iBinder);
            ya.f0 f0VarP = ya.i0.p();
            for (int i11 = 0; i11 < i0VarA.size(); i11++) {
                Bundle bundle = (Bundle) i0VarA.get(i11);
                bundle.getClass();
                f0VarP.a(m4.i0.a(bundle));
            }
            F0(rVar, i10, 20, new i3(new i0(11, new y2(f0VarP.f(), z10, 2), new c3(8)), 1));
        } catch (RuntimeException e10) {
            p4.c.C("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e10);
        }
    }

    @Override // b7.t
    public final void V(r rVar, int i10, Bundle bundle) {
        h hVar;
        if (rVar == null || bundle == null) {
            return;
        }
        try {
            i4 i4VarA = i4.a(bundle);
            long jClearCallingIdentity = Binder.clearCallingIdentity();
            try {
                b0.w1 w1Var = this.f2047g;
                IBinder iBinderAsBinder = rVar.asBinder();
                synchronized (w1Var.f1394b) {
                    try {
                        t1 t1VarM = w1Var.M(iBinderAsBinder);
                        hVar = t1VarM != null ? (h) ((o.e) w1Var.f1396d).get(t1VarM) : null;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                d4 d4Var = hVar != null ? hVar.f1801b : null;
                if (d4Var == null) {
                    return;
                }
                d4Var.l(i10, i4VarA);
            } finally {
                Binder.restoreCallingIdentity(jClearCallingIdentity);
            }
        } catch (RuntimeException e10) {
            p4.c.C("MediaSessionStub", "Ignoring malformed Bundle for SessionResult", e10);
        }
    }

    @Override // b7.t
    public final void W(r rVar, int i10) {
        t1 t1VarM;
        if (rVar == null || (t1VarM = this.f2047g.M(rVar.asBinder())) == null) {
            return;
        }
        G0(t1VarM, i10, 1, I0(new i0(10, this, t1VarM)));
    }

    @Override // b7.t
    public final void c0(r rVar, int i10, IBinder iBinder, int i11, long j10) {
        if (rVar == null || iBinder == null) {
            return;
        }
        if (i11 == -1 || i11 >= 0) {
            try {
                ya.i0 i0VarA = m4.f.a(iBinder);
                ya.f0 f0VarP = ya.i0.p();
                for (int i12 = 0; i12 < i0VarA.size(); i12++) {
                    Bundle bundle = (Bundle) i0VarA.get(i12);
                    bundle.getClass();
                    f0VarP.a(m4.i0.a(bundle));
                }
                F0(rVar, i10, 20, new i3(new i0(11, new v2(j10, f0VarP.f(), i11), new c3(8)), 1));
            } catch (RuntimeException e10) {
                p4.c.C("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e10);
            }
        }
    }

    @Override // b7.t
    public final void f(r rVar, int i10) {
        if (rVar == null) {
            return;
        }
        F0(rVar, i10, 4, I0(new c3(4)));
    }

    @Override // b7.t
    public final void l0(r rVar, int i10, Bundle bundle, long j10) {
        if (rVar == null || bundle == null) {
            return;
        }
        try {
            F0(rVar, i10, 31, new i3(new i0(11, new g2(m4.i0.a(bundle), j10, 2), new c3(8)), 1));
        } catch (RuntimeException e10) {
            p4.c.C("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e10);
        }
    }

    @Override // b7.t
    public final void n(r rVar, int i10, Bundle bundle, boolean z10) {
        if (rVar == null || bundle == null) {
            return;
        }
        try {
            F0(rVar, i10, 31, new i3(new i0(11, new y2(m4.i0.a(bundle), z10, 0), new c3(8)), 1));
        } catch (RuntimeException e10) {
            p4.c.C("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e10);
        }
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
        final boolean z10;
        t1 t1VarM;
        t1 t1VarM2;
        t1 t1VarM3;
        t1 t1VarM4;
        t1 t1VarM5;
        t1 t1VarM6;
        if (i10 >= 1 && i10 <= 16777215) {
            parcel.enforceInterface("androidx.media3.session.IMediaSession");
        }
        if (i10 == 1598968902) {
            parcel2.writeString("androidx.media3.session.IMediaSession");
            return true;
        }
        switch (i10) {
            case 3002:
                r rVarA0 = i1.A0(parcel.readStrongBinder());
                int i12 = parcel.readInt();
                float f10 = parcel.readFloat();
                if (rVarA0 != null && f10 >= 0.0f && f10 <= 1.0f) {
                    F0(rVarA0, i12, 24, I0(new u2(f10, 1)));
                }
                return true;
            case 3003:
                r rVarA02 = i1.A0(parcel.readStrongBinder());
                int i13 = parcel.readInt();
                int i14 = parcel.readInt();
                if (rVarA02 != null && i14 >= 0) {
                    F0(rVarA02, i13, 25, I0(new x2(i14, 3)));
                }
                return true;
            case 3004:
                r rVarA03 = i1.A0(parcel.readStrongBinder());
                int i15 = parcel.readInt();
                if (rVarA03 != null) {
                    F0(rVarA03, i15, 26, I0(new b5.a(18)));
                }
                return true;
            case 3005:
                r rVarA04 = i1.A0(parcel.readStrongBinder());
                int i16 = parcel.readInt();
                if (rVarA04 != null) {
                    F0(rVarA04, i16, 26, I0(new b5.a(28)));
                }
                return true;
            case 3006:
                r rVarA05 = i1.A0(parcel.readStrongBinder());
                int i17 = parcel.readInt();
                z10 = parcel.readInt() != 0;
                if (rVarA05 != null) {
                    F0(rVarA05, i17, 26, I0(new t2(1, z10)));
                }
                return true;
            case 3007:
                n(i1.A0(parcel.readStrongBinder()), parcel.readInt(), (Bundle) s3.b(parcel, Bundle.CREATOR), true);
                return true;
            case 3008:
                l0(i1.A0(parcel.readStrongBinder()), parcel.readInt(), (Bundle) s3.b(parcel, Bundle.CREATOR), parcel.readLong());
                return true;
            case 3009:
                n(i1.A0(parcel.readStrongBinder()), parcel.readInt(), (Bundle) s3.b(parcel, Bundle.CREATOR), parcel.readInt() != 0);
                return true;
            case 3010:
                R(i1.A0(parcel.readStrongBinder()), parcel.readInt(), parcel.readStrongBinder(), true);
                return true;
            case 3011:
                R(i1.A0(parcel.readStrongBinder()), parcel.readInt(), parcel.readStrongBinder(), parcel.readInt() != 0);
                return true;
            case 3012:
                c0(i1.A0(parcel.readStrongBinder()), parcel.readInt(), parcel.readStrongBinder(), parcel.readInt(), parcel.readLong());
                return true;
            case 3013:
                r rVarA06 = i1.A0(parcel.readStrongBinder());
                int i18 = parcel.readInt();
                z10 = parcel.readInt() != 0;
                if (rVarA06 != null) {
                    F0(rVarA06, i18, 1, I0(new t2(0, z10)));
                }
                return true;
            case 3014:
                V(i1.A0(parcel.readStrongBinder()), parcel.readInt(), (Bundle) s3.b(parcel, Bundle.CREATOR));
                return true;
            case 3015:
                H(i1.A0(parcel.readStrongBinder()), parcel.readInt(), (Bundle) s3.b(parcel, Bundle.CREATOR));
                return true;
            case 3016:
                r rVarA07 = i1.A0(parcel.readStrongBinder());
                int i19 = parcel.readInt();
                Parcelable.Creator creator = Bundle.CREATOR;
                x0(rVarA07, i19, (Bundle) s3.b(parcel, creator), (Bundle) s3.b(parcel, creator));
                return true;
            case 3017:
                r rVarA08 = i1.A0(parcel.readStrongBinder());
                int i20 = parcel.readInt();
                int i21 = parcel.readInt();
                if (rVarA08 != null && (i21 == 2 || i21 == 0 || i21 == 1)) {
                    F0(rVarA08, i20, 15, I0(new x2(i21, 2)));
                }
                return true;
            case 3018:
                r rVarA09 = i1.A0(parcel.readStrongBinder());
                int i22 = parcel.readInt();
                z10 = parcel.readInt() != 0;
                if (rVarA09 != null) {
                    F0(rVarA09, i22, 14, I0(new t2(2, z10)));
                }
                return true;
            case 3019:
                r rVarA010 = i1.A0(parcel.readStrongBinder());
                int i23 = parcel.readInt();
                int i24 = parcel.readInt();
                if (rVarA010 != null && i24 >= 0) {
                    F0(rVarA010, i23, 20, new androidx.media3.exoplayer.offline.g(9, new s2(this, i24, 4)));
                }
                return true;
            case 3020:
                r rVarA011 = i1.A0(parcel.readStrongBinder());
                int i25 = parcel.readInt();
                int i26 = parcel.readInt();
                int i27 = parcel.readInt();
                if (rVarA011 != null && i26 >= 0 && i27 >= i26) {
                    F0(rVarA011, i25, 20, new androidx.media3.exoplayer.offline.g(9, new r2(this, i26, i27)));
                }
                return true;
            case 3021:
                r rVarA012 = i1.A0(parcel.readStrongBinder());
                int i28 = parcel.readInt();
                if (rVarA012 != null) {
                    F0(rVarA012, i28, 20, I0(new c3(6)));
                }
                return true;
            case 3022:
                r rVarA013 = i1.A0(parcel.readStrongBinder());
                int i29 = parcel.readInt();
                int i30 = parcel.readInt();
                int i31 = parcel.readInt();
                if (rVarA013 != null && i30 >= 0 && i31 >= 0) {
                    F0(rVarA013, i29, 20, I0(new b3(i30, i31, 1)));
                }
                return true;
            case 3023:
                r rVarA014 = i1.A0(parcel.readStrongBinder());
                int i32 = parcel.readInt();
                final int i33 = parcel.readInt();
                final int i34 = parcel.readInt();
                final int i35 = parcel.readInt();
                if (rVarA014 != null && i33 >= 0 && i34 >= i33 && i35 >= 0) {
                    F0(rVarA014, i32, 20, I0(new p4.g() { // from class: b7.a3
                        @Override // p4.g
                        public final void accept(Object obj) {
                            z3 z3Var = (z3) obj;
                            z3Var.r0();
                            ((v4.v) z3Var.f2227a).T1(i33, i34, i35);
                        }
                    }));
                }
                return true;
            case 3024:
                W(i1.A0(parcel.readStrongBinder()), parcel.readInt());
                return true;
            case 3025:
                r rVarA015 = i1.A0(parcel.readStrongBinder());
                int i36 = parcel.readInt();
                if (rVarA015 != null && (t1VarM = this.f2047g.M(rVarA015.asBinder())) != null) {
                    G0(t1VarM, i36, 1, I0(new b5.a(16)));
                }
                return true;
            case 3026:
                v(i1.A0(parcel.readStrongBinder()), parcel.readInt());
                return true;
            case 3027:
                r rVarA016 = i1.A0(parcel.readStrongBinder());
                int i37 = parcel.readInt();
                Bundle bundle = (Bundle) s3.b(parcel, Bundle.CREATOR);
                if (rVarA016 != null && bundle != null) {
                    try {
                        F0(rVarA016, i37, 13, I0(new androidx.media3.exoplayer.offline.g(7, new m4.s0(bundle.getFloat(m4.s0.f14579e, 1.0f), bundle.getFloat(m4.s0.f14580f, 1.0f)))));
                    } catch (RuntimeException e10) {
                        p4.c.C("MediaSessionStub", "Ignoring malformed Bundle for PlaybackParameters", e10);
                    }
                }
                return true;
            case 3028:
                r rVarA017 = i1.A0(parcel.readStrongBinder());
                int i38 = parcel.readInt();
                float f11 = parcel.readFloat();
                if (rVarA017 != null && f11 > 0.0f) {
                    F0(rVarA017, i38, 13, I0(new u2(f11, 0)));
                }
                return true;
            case 3029:
                r rVarA018 = i1.A0(parcel.readStrongBinder());
                int i39 = parcel.readInt();
                Bundle bundle2 = (Bundle) s3.b(parcel, Bundle.CREATOR);
                if (rVarA018 != null && bundle2 != null) {
                    try {
                        final m4.i0 i0VarA = m4.i0.a(bundle2);
                        final int i40 = 2;
                        F0(rVarA018, i39, 20, new i3(new i0(12, new p3() { // from class: b7.w2
                            @Override // b7.p3
                            public final Object h(c2 c2Var, t1 t1Var, int i41) {
                                switch (i40) {
                                }
                                return c2Var.j(t1Var, ya.i0.u(i0VarA));
                            }
                        }, new b5.a(29)), 1));
                    } catch (RuntimeException e11) {
                        p4.c.C("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e11);
                    }
                }
                return true;
            case 3030:
                r rVarA019 = i1.A0(parcel.readStrongBinder());
                int i41 = parcel.readInt();
                int i42 = parcel.readInt();
                Bundle bundle3 = (Bundle) s3.b(parcel, Bundle.CREATOR);
                if (rVarA019 != null && bundle3 != null && i42 >= 0) {
                    try {
                        final m4.i0 i0VarA2 = m4.i0.a(bundle3);
                        final int i43 = 0;
                        F0(rVarA019, i41, 20, new i3(new i0(12, new p3() { // from class: b7.w2
                            @Override // b7.p3
                            public final Object h(c2 c2Var, t1 t1Var, int i412) {
                                switch (i43) {
                                }
                                return c2Var.j(t1Var, ya.i0.u(i0VarA2));
                            }
                        }, new s2(this, i42, 1)), 1));
                    } catch (RuntimeException e12) {
                        p4.c.C("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e12);
                    }
                }
                return true;
            case 3031:
                r rVarA020 = i1.A0(parcel.readStrongBinder());
                int i44 = parcel.readInt();
                IBinder strongBinder = parcel.readStrongBinder();
                if (rVarA020 != null && strongBinder != null) {
                    try {
                        ya.i0 i0VarA3 = m4.f.a(strongBinder);
                        ya.f0 f0VarP = ya.i0.p();
                        for (int i45 = 0; i45 < i0VarA3.size(); i45++) {
                            Bundle bundle4 = (Bundle) i0VarA3.get(i45);
                            bundle4.getClass();
                            f0VarP.a(m4.i0.a(bundle4));
                        }
                        F0(rVarA020, i44, 20, new i3(new i0(12, new z2(1, f0VarP.f()), new b5.a(27)), 1));
                    } catch (RuntimeException e13) {
                        p4.c.C("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e13);
                    }
                }
                return true;
            case 3032:
                r rVarA021 = i1.A0(parcel.readStrongBinder());
                int i46 = parcel.readInt();
                int i47 = parcel.readInt();
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (rVarA021 != null && strongBinder2 != null && i47 >= 0) {
                    try {
                        ya.i0 i0VarA4 = m4.f.a(strongBinder2);
                        ya.f0 f0VarP2 = ya.i0.p();
                        for (int i48 = 0; i48 < i0VarA4.size(); i48++) {
                            Bundle bundle5 = (Bundle) i0VarA4.get(i48);
                            bundle5.getClass();
                            f0VarP2.a(m4.i0.a(bundle5));
                        }
                        F0(rVarA021, i46, 20, new i3(new i0(12, new z2(0, f0VarP2.f()), new s2(this, i47, 3)), 1));
                    } catch (RuntimeException e14) {
                        p4.c.C("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e14);
                    }
                }
                return true;
            case 3033:
                r rVarA022 = i1.A0(parcel.readStrongBinder());
                int i49 = parcel.readInt();
                Bundle bundle6 = (Bundle) s3.b(parcel, Bundle.CREATOR);
                if (rVarA022 != null && bundle6 != null) {
                    try {
                        F0(rVarA022, i49, 19, I0(new e3(m4.l0.b(bundle6))));
                    } catch (RuntimeException e15) {
                        p4.c.C("MediaSessionStub", "Ignoring malformed Bundle for MediaMetadata", e15);
                    }
                }
                return true;
            case 3034:
                r rVarA023 = i1.A0(parcel.readStrongBinder());
                int i50 = parcel.readInt();
                if (rVarA023 != null && (t1VarM2 = this.f2047g.M(rVarA023.asBinder())) != null) {
                    G0(t1VarM2, i50, 3, I0(new c3(1)));
                }
                return true;
            case 3035:
                Q(i1.A0(parcel.readStrongBinder()), parcel.readInt());
                return true;
            case 3036:
                f(i1.A0(parcel.readStrongBinder()), parcel.readInt());
                return true;
            case 3037:
                r rVarA024 = i1.A0(parcel.readStrongBinder());
                int i51 = parcel.readInt();
                int i52 = parcel.readInt();
                if (rVarA024 != null && i52 >= 0) {
                    F0(rVarA024, i51, 10, new androidx.media3.exoplayer.offline.g(9, new s2(this, i52, 0)));
                }
                return true;
            case 3038:
                r rVarA025 = i1.A0(parcel.readStrongBinder());
                int i53 = parcel.readInt();
                final long j10 = parcel.readLong();
                if (rVarA025 != null) {
                    F0(rVarA025, i53, 5, I0(new p4.g() { // from class: b7.f3
                        @Override // p4.g
                        public final void accept(Object obj) {
                            ((z3) obj).c0(j10);
                        }
                    }));
                }
                return true;
            case 3039:
                r rVarA026 = i1.A0(parcel.readStrongBinder());
                int i54 = parcel.readInt();
                int i55 = parcel.readInt();
                long j11 = parcel.readLong();
                if (rVarA026 != null && i55 >= 0) {
                    F0(rVarA026, i54, 10, new androidx.media3.exoplayer.offline.g(9, new v2(j11, this, i55)));
                }
                return true;
            case 3040:
                r rVarA027 = i1.A0(parcel.readStrongBinder());
                int i56 = parcel.readInt();
                if (rVarA027 != null && (t1VarM3 = this.f2047g.M(rVarA027.asBinder())) != null) {
                    G0(t1VarM3, i56, 11, I0(new b5.a(19)));
                }
                return true;
            case 3041:
                r rVarA028 = i1.A0(parcel.readStrongBinder());
                int i57 = parcel.readInt();
                if (rVarA028 != null && (t1VarM4 = this.f2047g.M(rVarA028.asBinder())) != null) {
                    G0(t1VarM4, i57, 12, I0(new b5.a(24)));
                }
                return true;
            case 3042:
                r rVarA029 = i1.A0(parcel.readStrongBinder());
                int i58 = parcel.readInt();
                if (rVarA029 != null) {
                    F0(rVarA029, i58, 6, I0(new b5.a(22)));
                }
                return true;
            case 3043:
                r rVarA030 = i1.A0(parcel.readStrongBinder());
                int i59 = parcel.readInt();
                if (rVarA030 != null) {
                    F0(rVarA030, i59, 8, I0(new b5.a(17)));
                }
                return true;
            case 3044:
                r rVarA031 = i1.A0(parcel.readStrongBinder());
                int i60 = parcel.readInt();
                Surface surface = (Surface) s3.b(parcel, Surface.CREATOR);
                if (rVarA031 != null) {
                    F0(rVarA031, i60, 27, I0(new androidx.media3.exoplayer.offline.g(8, surface)));
                }
                return true;
            case 3045:
                w0(i1.A0(parcel.readStrongBinder()));
                return true;
            case 3046:
                r rVarA032 = i1.A0(parcel.readStrongBinder());
                int i61 = parcel.readInt();
                if (rVarA032 != null && (t1VarM5 = this.f2047g.M(rVarA032.asBinder())) != null) {
                    G0(t1VarM5, i61, 7, I0(new b5.a(21)));
                }
                return true;
            case 3047:
                r rVarA033 = i1.A0(parcel.readStrongBinder());
                int i62 = parcel.readInt();
                if (rVarA033 != null && (t1VarM6 = this.f2047g.M(rVarA033.asBinder())) != null) {
                    G0(t1VarM6, i62, 9, I0(new b5.a(25)));
                }
                return true;
            case 3048:
                r rVarA034 = i1.A0(parcel.readStrongBinder());
                int i63 = parcel.readInt();
                Bundle bundle7 = (Bundle) s3.b(parcel, Bundle.CREATOR);
                if (rVarA034 != null && bundle7 != null) {
                    try {
                        F0(rVarA034, i63, 29, I0(new i0(9, this, m4.o1.b(bundle7))));
                    } catch (RuntimeException e16) {
                        p4.c.C("MediaSessionStub", "Ignoring malformed Bundle for TrackSelectionParameters", e16);
                    }
                }
                return true;
            case 3049:
                r rVarA035 = i1.A0(parcel.readStrongBinder());
                int i64 = parcel.readInt();
                String string = parcel.readString();
                Bundle bundle8 = (Bundle) s3.b(parcel, Bundle.CREATOR);
                if (rVarA035 != null && string != null && bundle8 != null) {
                    if (TextUtils.isEmpty(string)) {
                        p4.c.B("MediaSessionStub", "setRatingWithMediaId(): Ignoring empty mediaId");
                    } else {
                        try {
                            B0(rVarA035, i64, null, 40010, new i3(new b5.a(26, string, m4.z0.a(bundle8)), 1));
                        } catch (RuntimeException e17) {
                            p4.c.C("MediaSessionStub", "Ignoring malformed Bundle for Rating", e17);
                        }
                    }
                }
                return true;
            case 3050:
                r rVarA036 = i1.A0(parcel.readStrongBinder());
                int i65 = parcel.readInt();
                Bundle bundle9 = (Bundle) s3.b(parcel, Bundle.CREATOR);
                if (rVarA036 != null && bundle9 != null) {
                    try {
                        m4.z0.a(bundle9);
                        B0(rVarA036, i65, null, 40010, new i3(new c3(9), 1));
                    } catch (RuntimeException e18) {
                        p4.c.C("MediaSessionStub", "Ignoring malformed Bundle for Rating", e18);
                    }
                }
                return true;
            case 3051:
                r rVarA037 = i1.A0(parcel.readStrongBinder());
                int i66 = parcel.readInt();
                int i67 = parcel.readInt();
                int i68 = parcel.readInt();
                if (rVarA037 != null && i67 >= 0) {
                    F0(rVarA037, i66, 33, I0(new b3(i67, i68, 0)));
                }
                return true;
            case 3052:
                r rVarA038 = i1.A0(parcel.readStrongBinder());
                int i69 = parcel.readInt();
                int i70 = parcel.readInt();
                if (rVarA038 != null) {
                    F0(rVarA038, i69, 34, I0(new x2(i70, 1)));
                }
                return true;
            case 3053:
                r rVarA039 = i1.A0(parcel.readStrongBinder());
                int i71 = parcel.readInt();
                int i72 = parcel.readInt();
                if (rVarA039 != null) {
                    F0(rVarA039, i71, 34, I0(new x2(i72, 0)));
                }
                return true;
            case 3054:
                r rVarA040 = i1.A0(parcel.readStrongBinder());
                int i73 = parcel.readInt();
                z10 = parcel.readInt() != 0;
                final int i74 = parcel.readInt();
                if (rVarA040 != null) {
                    F0(rVarA040, i73, 34, I0(new p4.g() { // from class: b7.d3
                        @Override // p4.g
                        public final void accept(Object obj) {
                            ((z3) obj).i0(i74, z10);
                        }
                    }));
                }
                return true;
            case 3055:
                r rVarA041 = i1.A0(parcel.readStrongBinder());
                int i75 = parcel.readInt();
                int i76 = parcel.readInt();
                Bundle bundle10 = (Bundle) s3.b(parcel, Bundle.CREATOR);
                if (rVarA041 != null && bundle10 != null && i76 >= 0) {
                    try {
                        final m4.i0 i0VarA5 = m4.i0.a(bundle10);
                        final int i77 = 1;
                        F0(rVarA041, i75, 20, new i3(new i0(12, new p3() { // from class: b7.w2
                            @Override // b7.p3
                            public final Object h(c2 c2Var, t1 t1Var, int i412) {
                                switch (i77) {
                                }
                                return c2Var.j(t1Var, ya.i0.u(i0VarA5));
                            }
                        }, new s2(this, i76, 2)), 1));
                    } catch (RuntimeException e19) {
                        p4.c.C("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e19);
                    }
                }
                return true;
            case 3056:
                r rVarA042 = i1.A0(parcel.readStrongBinder());
                int i78 = parcel.readInt();
                int i79 = parcel.readInt();
                int i80 = parcel.readInt();
                IBinder strongBinder3 = parcel.readStrongBinder();
                if (rVarA042 != null && strongBinder3 != null && i79 >= 0 && i80 >= i79) {
                    try {
                        ya.i0 i0VarA6 = m4.f.a(strongBinder3);
                        ya.f0 f0VarP3 = ya.i0.p();
                        for (int i81 = 0; i81 < i0VarA6.size(); i81++) {
                            Bundle bundle11 = (Bundle) i0VarA6.get(i81);
                            bundle11.getClass();
                            f0VarP3.a(m4.i0.a(bundle11));
                        }
                        F0(rVarA042, i78, 20, new i3(new i0(12, new androidx.media3.exoplayer.offline.g(6, f0VarP3.f()), new r2(this, i79, i80)), 1));
                    } catch (RuntimeException e20) {
                        p4.c.C("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e20);
                    }
                }
                return true;
            case 3057:
                r rVarA043 = i1.A0(parcel.readStrongBinder());
                int i82 = parcel.readInt();
                Bundle bundle12 = (Bundle) s3.b(parcel, Bundle.CREATOR);
                z10 = parcel.readInt() != 0;
                if (rVarA043 != null && bundle12 != null) {
                    try {
                        F0(rVarA043, i82, 35, I0(new y2(m4.d.a(bundle12), z10, 1)));
                    } catch (RuntimeException e21) {
                        p4.c.C("MediaSessionStub", "Ignoring malformed Bundle for AudioAttributes", e21);
                    }
                }
                return true;
            default:
                switch (i10) {
                    case 4001:
                        r rVarA044 = i1.A0(parcel.readStrongBinder());
                        int i83 = parcel.readInt();
                        Bundle bundle13 = (Bundle) s3.b(parcel, Bundle.CREATOR);
                        if (rVarA044 != null) {
                            if (bundle13 == null) {
                                B0(rVarA044, i83, null, 50000, new i3(new c3(2), 0));
                            } else {
                                try {
                                    j1.a(bundle13);
                                    B0(rVarA044, i83, null, 50000, new i3(new c3(2), 0));
                                } catch (RuntimeException e22) {
                                    p4.c.C("MediaSessionStub", "Ignoring malformed Bundle for LibraryParams", e22);
                                }
                            }
                        }
                        return true;
                    case 4002:
                        r rVarA045 = i1.A0(parcel.readStrongBinder());
                        int i84 = parcel.readInt();
                        String string2 = parcel.readString();
                        if (rVarA045 != null) {
                            if (TextUtils.isEmpty(string2)) {
                                p4.c.B("MediaSessionStub", "getItem(): Ignoring empty mediaId");
                                return true;
                            }
                            B0(rVarA045, i84, null, 50004, new i3(new b5.a(23), 0));
                            return true;
                        }
                        return true;
                    case 4003:
                        r rVarA046 = i1.A0(parcel.readStrongBinder());
                        int i85 = parcel.readInt();
                        String string3 = parcel.readString();
                        int i86 = parcel.readInt();
                        int i87 = parcel.readInt();
                        Bundle bundle14 = (Bundle) s3.b(parcel, Bundle.CREATOR);
                        if (rVarA046 != null) {
                            if (TextUtils.isEmpty(string3)) {
                                p4.c.B("MediaSessionStub", "getChildren(): Ignoring empty parentId");
                            } else if (i86 < 0) {
                                p4.c.B("MediaSessionStub", "getChildren(): Ignoring negative page");
                            } else if (i87 < 1) {
                                p4.c.B("MediaSessionStub", "getChildren(): Ignoring pageSize less than 1");
                            } else if (bundle14 == null) {
                                B0(rVarA046, i85, null, 50003, new i3(new b5.a(15), 0));
                            } else {
                                try {
                                    j1.a(bundle14);
                                    B0(rVarA046, i85, null, 50003, new i3(new b5.a(15), 0));
                                } catch (RuntimeException e23) {
                                    p4.c.C("MediaSessionStub", "Ignoring malformed Bundle for LibraryParams", e23);
                                }
                            }
                        }
                        return true;
                    case 4004:
                        r rVarA047 = i1.A0(parcel.readStrongBinder());
                        int i88 = parcel.readInt();
                        String string4 = parcel.readString();
                        Bundle bundle15 = (Bundle) s3.b(parcel, Bundle.CREATOR);
                        if (rVarA047 != null) {
                            if (TextUtils.isEmpty(string4)) {
                                p4.c.B("MediaSessionStub", "search(): Ignoring empty query");
                            } else if (bundle15 == null) {
                                B0(rVarA047, i88, null, 50005, new i3(new c3(7), 0));
                            } else {
                                try {
                                    j1.a(bundle15);
                                    B0(rVarA047, i88, null, 50005, new i3(new c3(7), 0));
                                } catch (RuntimeException e24) {
                                    p4.c.C("MediaSessionStub", "Ignoring malformed Bundle for LibraryParams", e24);
                                }
                            }
                        }
                        return true;
                    case 4005:
                        r rVarA048 = i1.A0(parcel.readStrongBinder());
                        int i89 = parcel.readInt();
                        String string5 = parcel.readString();
                        int i90 = parcel.readInt();
                        int i91 = parcel.readInt();
                        Bundle bundle16 = (Bundle) s3.b(parcel, Bundle.CREATOR);
                        if (rVarA048 != null) {
                            if (TextUtils.isEmpty(string5)) {
                                p4.c.B("MediaSessionStub", "getSearchResult(): Ignoring empty query");
                            } else if (i90 < 0) {
                                p4.c.B("MediaSessionStub", "getSearchResult(): Ignoring negative page");
                            } else if (i91 < 1) {
                                p4.c.B("MediaSessionStub", "getSearchResult(): Ignoring pageSize less than 1");
                            } else if (bundle16 == null) {
                                int i92 = 0;
                                B0(rVarA048, i89, null, 50006, new i3(new c3(i92), i92));
                            } else {
                                try {
                                    j1.a(bundle16);
                                    int i922 = 0;
                                    B0(rVarA048, i89, null, 50006, new i3(new c3(i922), i922));
                                } catch (RuntimeException e25) {
                                    p4.c.C("MediaSessionStub", "Ignoring malformed Bundle for LibraryParams", e25);
                                }
                            }
                        }
                        return true;
                    case 4006:
                        r rVarA049 = i1.A0(parcel.readStrongBinder());
                        int i93 = parcel.readInt();
                        String string6 = parcel.readString();
                        Bundle bundle17 = (Bundle) s3.b(parcel, Bundle.CREATOR);
                        if (rVarA049 != null) {
                            if (TextUtils.isEmpty(string6)) {
                                p4.c.B("MediaSessionStub", "subscribe(): Ignoring empty parentId");
                            } else if (bundle17 == null) {
                                B0(rVarA049, i93, null, 50001, new i3(new c3(5), 0));
                            } else {
                                try {
                                    j1.a(bundle17);
                                    B0(rVarA049, i93, null, 50001, new i3(new c3(5), 0));
                                } catch (RuntimeException e26) {
                                    p4.c.C("MediaSessionStub", "Ignoring malformed Bundle for LibraryParams", e26);
                                }
                            }
                        }
                        return true;
                    case 4007:
                        r rVarA050 = i1.A0(parcel.readStrongBinder());
                        int i94 = parcel.readInt();
                        String string7 = parcel.readString();
                        if (rVarA050 != null) {
                            if (TextUtils.isEmpty(string7)) {
                                p4.c.B("MediaSessionStub", "unsubscribe(): Ignoring empty parentId");
                                return true;
                            }
                            B0(rVarA050, i94, null, 50002, new i3(new b5.a(14), 0));
                            return true;
                        }
                        return true;
                    default:
                        return super.onTransact(i10, parcel, parcel2, i11);
                }
        }
    }

    @Override // b7.t
    public final void v(r rVar, int i10) {
        if (rVar == null) {
            return;
        }
        F0(rVar, i10, 2, I0(new c3(3)));
    }

    @Override // b7.t
    public final void w0(r rVar) {
        if (rVar == null) {
            return;
        }
        long jClearCallingIdentity = Binder.clearCallingIdentity();
        try {
            c2 c2Var = (c2) this.f2045e.get();
            if (c2Var != null && !c2Var.h()) {
                t1 t1VarM = this.f2047g.M(rVar.asBinder());
                if (t1VarM != null) {
                    p4.c0.R(c2Var.f1685l, new b5.h(10, this, t1VarM));
                }
            }
        } finally {
            Binder.restoreCallingIdentity(jClearCallingIdentity);
        }
    }

    @Override // b7.t
    public final void x0(r rVar, int i10, Bundle bundle, Bundle bundle2) {
        if (rVar == null || bundle == null || bundle2 == null) {
            return;
        }
        try {
            e4 e4VarA = e4.a(bundle);
            B0(rVar, i10, e4VarA, 0, new i3(new b5.a(20, e4VarA, bundle2), 1));
        } catch (RuntimeException e10) {
            p4.c.C("MediaSessionStub", "Ignoring malformed Bundle for SessionCommand", e10);
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
