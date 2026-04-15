package b7;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.media.MediaMetadata;
import android.media.session.MediaSession;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.util.Log;
import android.util.SparseBooleanArray;
import com.cnl.kikoeru.MainService;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class o2 extends c7.u0 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int f2006r;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final b0.w1 f2007f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final c2 f2008g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final c7.l1 f2009h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final l2 f2010i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final b5.d f2011j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final c7.e1 f2012k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final m2 f2013l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ComponentName f2014m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public x3 f2015n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public volatile long f2016o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public l2 f2017p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f2018q;

    static {
        f2006r = p4.c0.f16548a >= 31 ? 33554432 : 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0135  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public o2(b7.c2 r10, android.net.Uri r11, android.os.Handler r12, android.os.Bundle r13) {
        /*
            Method dump skipped, instruction units count: 354
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b7.o2.<init>(b7.c2, android.net.Uri, android.os.Handler, android.os.Bundle):void");
    }

    public static void D(c7.e1 e1Var, c7.r0 r0Var) {
        c7.w0 w0Var = (c7.w0) e1Var.f3618b;
        w0Var.f3747i = r0Var;
        MediaSession mediaSession = w0Var.f3739a;
        MediaMetadata mediaMetadata = r0Var.f3717b;
        if (mediaMetadata == null) {
            Parcel parcelObtain = Parcel.obtain();
            try {
                r0Var.writeToParcel(parcelObtain, 0);
                parcelObtain.setDataPosition(0);
                MediaMetadata mediaMetadata2 = (MediaMetadata) MediaMetadata.CREATOR.createFromParcel(parcelObtain);
                r0Var.f3717b = mediaMetadata2;
                parcelObtain.recycle();
                mediaMetadata = mediaMetadata2;
            } catch (Throwable th2) {
                parcelObtain.recycle();
                throw th2;
            }
        }
        mediaSession.setMetadata(mediaMetadata);
    }

    public static void E(o2 o2Var, z3 z3Var) {
        int i10 = z3Var.B0(20) ? 4 : 0;
        if (o2Var.f2018q != i10) {
            o2Var.f2018q = i10;
            ((c7.w0) o2Var.f2012k.f3618b).f3739a.setFlags(i10 | 3);
        }
    }

    public static void F(c7.e1 e1Var, ArrayList arrayList) {
        if (arrayList != null) {
            e1Var.getClass();
            HashSet hashSet = new HashSet();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                c7.b1 b1Var = (c7.b1) it.next();
                if (b1Var == null) {
                    throw new IllegalArgumentException("queue shouldn't have null items");
                }
                long j10 = b1Var.f3591b;
                if (hashSet.contains(Long.valueOf(j10))) {
                    Log.e("MediaSessionCompat", j2.h0.i(j10, "Found duplicate queue id: "), new IllegalArgumentException("id of each queue item should be unique"));
                }
                hashSet.add(Long.valueOf(j10));
            }
        }
        c7.w0 w0Var = (c7.w0) e1Var.f3618b;
        MediaSession mediaSession = w0Var.f3739a;
        w0Var.f3746h = arrayList;
        if (arrayList == null) {
            mediaSession.setQueue(null);
            return;
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            c7.b1 b1Var2 = (c7.b1) it2.next();
            MediaSession.QueueItem queueItem = b1Var2.f3592c;
            if (queueItem == null) {
                MediaSession.QueueItem queueItem2 = new MediaSession.QueueItem(b1Var2.f3590a.b(), b1Var2.f3591b);
                b1Var2.f3592c = queueItem2;
                queueItem = queueItem2;
            }
            arrayList2.add(queueItem);
        }
        mediaSession.setQueue(arrayList2);
    }

    public static m4.i0 G(String str, Uri uri, String str2, Bundle bundle) {
        m4.w wVar = new m4.w();
        ya.g0 g0Var = ya.i0.f25998b;
        ya.a1 a1Var = ya.a1.f25946e;
        List list = Collections.EMPTY_LIST;
        ya.a1 a1Var2 = ya.a1.f25946e;
        m4.b0 b0Var = new m4.b0();
        m4.e0 e0Var = m4.e0.f14187d;
        if (str == null) {
            str = "";
        }
        String str3 = str;
        c7.e1 e1Var = new c7.e1(23);
        e1Var.f3618b = uri;
        e1Var.f3619c = str2;
        e1Var.f3620d = bundle;
        return new m4.i0(str3, new m4.y(wVar), null, new m4.c0(b0Var), m4.l0.K, new m4.e0(e1Var));
    }

    public static ComponentName J(MainService mainService, String str) {
        PackageManager packageManager = mainService.getPackageManager();
        Intent intent = new Intent(str);
        intent.setPackage(mainService.getPackageName());
        List<ResolveInfo> listQueryIntentServices = packageManager.queryIntentServices(intent, 0);
        if (listQueryIntentServices == null || listQueryIntentServices.isEmpty()) {
            return null;
        }
        ServiceInfo serviceInfo = listQueryIntentServices.get(0).serviceInfo;
        return new ComponentName(serviceInfo.packageName, serviceInfo.name);
    }

    @Override // c7.u0
    public final void A(long j10) {
        if (j10 < 0) {
            return;
        }
        H(10, new g2(this, j10, 0), ((c7.w0) this.f2012k.f3618b).c(), true);
    }

    @Override // c7.u0
    public final void B() {
        H(3, new e2(this, 7), ((c7.w0) this.f2012k.f3618b).c(), true);
    }

    public final void H(final int i10, final n2 n2Var, final c7.k1 k1Var, final boolean z10) {
        c2 c2Var = this.f2008g;
        if (c2Var.h()) {
            return;
        }
        if (k1Var != null) {
            p4.c0.R(c2Var.f1685l, new Runnable() { // from class: b7.d2
                @Override // java.lang.Runnable
                public final void run() {
                    n2 n2Var2 = n2Var;
                    o2 o2Var = this.f1728a;
                    c2 c2Var2 = o2Var.f2008g;
                    if (c2Var2.h()) {
                        return;
                    }
                    boolean zIsActive = ((c7.w0) o2Var.f2012k.f3618b).f3739a.isActive();
                    int i11 = i10;
                    c7.k1 k1Var2 = k1Var;
                    if (!zIsActive) {
                        StringBuilder sbO = j2.h0.o(i11, "Ignore incoming player command before initialization. command=", ", pid=");
                        sbO.append(k1Var2.f3655a.f3653b);
                        p4.c.B("MediaSessionLegacyStub", sbO.toString());
                        return;
                    }
                    t1 t1VarL = o2Var.L(k1Var2);
                    if (!o2Var.f2007f.T(t1VarL, i11)) {
                        if (i11 != 1 || c2Var2.f1693t.r()) {
                            return;
                        }
                        p4.c.B("MediaSessionLegacyStub", "Calling play() omitted due to COMMAND_PLAY_PAUSE not being available. If this play command has started the service for instance for playback resumption, this may prevent the service from being started into the foreground.");
                        return;
                    }
                    pe.d dVar = c2Var2.f1678e;
                    c2Var2.r(t1VarL);
                    dVar.getClass();
                    try {
                        n2Var2.b(t1VarL);
                    } catch (RemoteException e10) {
                        p4.c.C("MediaSessionLegacyStub", "Exception in " + t1VarL, e10);
                    }
                    if (z10) {
                        new SparseBooleanArray().append(i11, true);
                        c2Var2.o(t1VarL);
                    }
                }
            });
            return;
        }
        p4.c.l("MediaSessionLegacyStub", "RemoteUserInfo is null, ignoring command=" + i10);
    }

    public final void I(e4 e4Var, int i10, n2 n2Var, c7.k1 k1Var) {
        if (k1Var != null) {
            p4.c0.R(this.f2008g.f1685l, new y0(this, e4Var, i10, k1Var, n2Var));
            return;
        }
        StringBuilder sb = new StringBuilder("RemoteUserInfo is null, ignoring command=");
        Object objValueOf = e4Var;
        if (e4Var == null) {
            objValueOf = Integer.valueOf(i10);
        }
        sb.append(objValueOf);
        p4.c.l("MediaSessionLegacyStub", sb.toString());
    }

    public final void K(final m4.i0 i0Var, final boolean z10) {
        H(31, new n2() { // from class: b7.j2
            @Override // b7.n2
            public final void b(t1 t1Var) {
                o2 o2Var = this.f1881a;
                cb.e0 e0VarP = o2Var.f2008g.p(t1Var, ya.i0.u(i0Var), -1, -9223372036854775807L);
                e0VarP.a(new cb.t(0, e0VarP, new n(o2Var, t1Var, z10)), cb.r.f3875a);
            }
        }, ((c7.w0) this.f2012k.f3618b).c(), false);
    }

    public final t1 L(c7.k1 k1Var) {
        t1 t1VarM = this.f2007f.M(k1Var);
        if (t1VarM == null) {
            t1 t1Var = new t1(k1Var, 0, 0, this.f2009h.b(k1Var), new k2(k1Var), Bundle.EMPTY);
            r1 r1VarK = this.f2008g.k(t1Var);
            this.f2007f.x(k1Var, t1Var, r1VarK.f2053a, r1VarK.f2054b);
            t1VarM = t1Var;
        }
        b5.d dVar = this.f2011j;
        long j10 = this.f2016o;
        dVar.removeMessages(1001, t1VarM);
        dVar.sendMessageDelayed(dVar.obtainMessage(1001, t1VarM), j10);
        return t1VarM;
    }

    public final void M(z3 z3Var) {
        p4.c0.R(this.f2008g.f1685l, new h2(this, z3Var, 0));
    }

    @Override // c7.u0
    public final void b(c7.q0 q0Var) {
        if (q0Var != null) {
            H(20, new g1(this, q0Var, -1), ((c7.w0) this.f2012k.f3618b).c(), false);
        }
    }

    @Override // c7.u0
    public final void c(c7.q0 q0Var, int i10) {
        if (q0Var != null) {
            if (i10 == -1 || i10 >= 0) {
                H(20, new g1(this, q0Var, i10), ((c7.w0) this.f2012k.f3618b).c(), false);
            }
        }
    }

    @Override // c7.u0
    public final void d(String str, Bundle bundle, ResultReceiver resultReceiver) {
        p4.c.j(str);
        if (str.equals("androidx.media3.session.SESSION_COMMAND_MEDIA3_PLAY_REQUEST")) {
            return;
        }
        if (str.equals("androidx.media3.session.SESSION_COMMAND_REQUEST_SESSION3_TOKEN") && resultReceiver != null) {
            resultReceiver.send(0, this.f2008g.f1683j.b());
        } else {
            e4 e4Var = new e4(str, Bundle.EMPTY);
            I(e4Var, 0, new w0(this, e4Var, bundle, resultReceiver), ((c7.w0) this.f2012k.f3618b).c());
        }
    }

    @Override // c7.u0
    public final void e(String str, Bundle bundle) {
        if (str.equals("androidx.media3.session.SESSION_COMMAND_MEDIA3_PLAY_REQUEST")) {
            return;
        }
        e4 e4Var = new e4(str, Bundle.EMPTY);
        I(e4Var, 0, new i0(this, e4Var, bundle), ((c7.w0) this.f2012k.f3618b).c());
    }

    @Override // c7.u0
    public final void f() {
        H(12, new e2(this, 10), ((c7.w0) this.f2012k.f3618b).c(), true);
    }

    @Override // c7.u0
    public final boolean g(Intent intent) {
        c7.k1 k1VarC = ((c7.w0) this.f2012k.f3618b).c();
        k1VarC.getClass();
        return this.f2008g.m(new t1(k1VarC, 0, 0, false, null, Bundle.EMPTY), intent);
    }

    @Override // c7.u0
    public final void h() {
        H(1, new e2(this, 0), ((c7.w0) this.f2012k.f3618b).c(), true);
    }

    @Override // c7.u0
    public final void i() {
        H(1, new e2(this, 11), ((c7.w0) this.f2012k.f3618b).c(), false);
    }

    @Override // c7.u0
    public final void j(String str, Bundle bundle) {
        K(G(str, null, null, bundle), true);
    }

    @Override // c7.u0
    public final void k(String str, Bundle bundle) {
        K(G(null, null, str, bundle), true);
    }

    @Override // c7.u0
    public final void l(Uri uri, Bundle bundle) {
        K(G(null, uri, null, bundle), true);
    }

    @Override // c7.u0
    public final void m() {
        H(2, new e2(this, 6), ((c7.w0) this.f2012k.f3618b).c(), true);
    }

    @Override // c7.u0
    public final void n(String str, Bundle bundle) {
        K(G(str, null, null, bundle), false);
    }

    @Override // c7.u0
    public final void o(String str, Bundle bundle) {
        K(G(null, null, str, bundle), false);
    }

    @Override // c7.u0
    public final void p(Uri uri, Bundle bundle) {
        K(G(null, uri, null, bundle), false);
    }

    @Override // c7.u0
    public final void q(c7.q0 q0Var) {
        if (q0Var == null) {
            return;
        }
        H(20, new i0(8, this, q0Var), ((c7.w0) this.f2012k.f3618b).c(), true);
    }

    @Override // c7.u0
    public final void r() {
        H(11, new e2(this, 5), ((c7.w0) this.f2012k.f3618b).c(), true);
    }

    @Override // c7.u0
    public final void s(long j10) {
        H(5, new g2(this, j10, 1), ((c7.w0) this.f2012k.f3618b).c(), true);
    }

    @Override // c7.u0
    public final void t(final float f10) {
        if (f10 <= 0.0f) {
            return;
        }
        H(13, new n2() { // from class: b7.f2
            @Override // b7.n2
            public final void b(t1 t1Var) {
                this.f1773a.f2008g.f1693t.m0(f10);
            }
        }, ((c7.w0) this.f2012k.f3618b).c(), true);
    }

    @Override // c7.u0
    public final void u(c7.q1 q1Var) {
        v(q1Var);
    }

    @Override // c7.u0
    public final void v(c7.q1 q1Var) {
        m4.z0 z0VarO = x.o(q1Var);
        if (z0VarO != null) {
            I(null, 40010, new e2(this, z0VarO), ((c7.w0) this.f2012k.f3618b).c());
            return;
        }
        p4.c.B("MediaSessionLegacyStub", "Ignoring invalid RatingCompat " + q1Var);
    }

    @Override // c7.u0
    public final void w(int i10) {
        H(15, new i2(this, i10, 0), ((c7.w0) this.f2012k.f3618b).c(), true);
    }

    @Override // c7.u0
    public final void x(int i10) {
        H(14, new i2(this, i10, 1), ((c7.w0) this.f2012k.f3618b).c(), true);
    }

    @Override // c7.u0
    public final void y() {
        boolean zB0 = this.f2008g.f1693t.B0(9);
        c7.e1 e1Var = this.f2012k;
        if (zB0) {
            H(9, new e2(this, 8), ((c7.w0) e1Var.f3618b).c(), true);
        } else {
            H(8, new e2(this, 9), ((c7.w0) e1Var.f3618b).c(), true);
        }
    }

    @Override // c7.u0
    public final void z() {
        boolean zB0 = this.f2008g.f1693t.B0(7);
        c7.e1 e1Var = this.f2012k;
        if (zB0) {
            H(7, new e2(this, 3), ((c7.w0) e1Var.f3618b).c(), true);
        } else {
            H(6, new e2(this, 4), ((c7.w0) e1Var.f3618b).c(), true);
        }
    }
}
