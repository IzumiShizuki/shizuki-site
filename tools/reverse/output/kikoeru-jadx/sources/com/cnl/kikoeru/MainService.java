package com.cnl.kikoeru;

import a9.i;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Parcelable;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.offline.u;
import b5.b0;
import b5.h;
import b5.z;
import b7.c2;
import b7.c3;
import b7.d0;
import b7.f0;
import b7.g1;
import b7.k4;
import b7.l1;
import b7.m;
import b7.n;
import b7.p1;
import b7.p2;
import b7.q2;
import b7.r;
import b7.v1;
import c7.d1;
import c7.e1;
import c7.w0;
import cb.y;
import e7.a0;
import e7.s;
import e7.w;
import g8.a;
import h9.d;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import jc.l;
import k1.g;
import k9.c;
import kotlin.Metadata;
import o.e;
import p4.c0;
import p4.q;
import v4.v;
import ya.a1;
import ya.g0;
import ya.i0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000B\u0007¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/cnl/kikoeru/MainService;", "<init>", "()V", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class MainService extends Service {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f4298i = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f4299a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Handler f4300b = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f4301c = new e(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public p2 f4302d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public p1 f4303e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public c f4304f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public m f4305g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public v1 f4306h;

    public final void a(v1 v1Var) {
        v1 v1Var2;
        p4.c.g(v1Var, "session must not be null");
        boolean z10 = true;
        p4.c.b("session is already released", !v1Var.f2118a.h());
        synchronized (this.f4299a) {
            v1Var2 = (v1) this.f4301c.get(v1Var.f2118a.f1682i);
            if (v1Var2 != null && v1Var2 != v1Var) {
                z10 = false;
            }
            p4.c.b("Session ID should be unique", z10);
            this.f4301c.put(v1Var.f2118a.f1682i, v1Var);
        }
        if (v1Var2 == null) {
            c0.R(this.f4300b, new b5.m(this, c(), v1Var, 4));
        }
    }

    public final m b() {
        m mVar;
        synchronized (this.f4299a) {
            try {
                if (this.f4305g == null) {
                    this.f4305g = new m(this);
                }
                mVar = this.f4305g;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return mVar;
    }

    public final p1 c() {
        p1 p1Var;
        synchronized (this.f4299a) {
            try {
                if (this.f4303e == null) {
                    if (this.f4304f == null) {
                        n nVar = new n(getApplicationContext());
                        p4.c.i(!nVar.f1984b);
                        c cVar = new c(nVar);
                        nVar.f1984b = true;
                        this.f4304f = cVar;
                    }
                    this.f4303e = new p1(this, this.f4304f, b());
                }
                p1Var = this.f4303e;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return p1Var;
    }

    public final p2 d() {
        p2 p2Var;
        synchronized (this.f4299a) {
            p2Var = this.f4302d;
            p4.c.j(p2Var);
        }
        return p2Var;
    }

    public final boolean e(v1 v1Var) {
        boolean zContainsKey;
        synchronized (this.f4299a) {
            zContainsKey = this.f4301c.containsKey(v1Var.f2118a.f1682i);
        }
        return zContainsKey;
    }

    public final void f() {
        super.onCreate();
        synchronized (this.f4299a) {
            this.f4302d = new p2(this);
        }
    }

    public final void g() {
        super.onDestroy();
        synchronized (this.f4299a) {
            try {
                p2 p2Var = this.f4302d;
                if (p2Var != null) {
                    p2Var.f2032e.clear();
                    p2Var.f2033f.removeCallbacksAndMessages(null);
                    Iterator it = p2Var.f2035h.iterator();
                    while (it.hasNext()) {
                        try {
                            ((r) it.next()).a();
                        } catch (RemoteException unused) {
                        }
                    }
                    this.f4302d = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void h(v1 v1Var, boolean z10) {
        d0 d0VarA;
        d0 d0Var;
        i0 i0VarP;
        p1 p1VarC = c();
        if (!p1VarC.f2022a.e(v1Var) || (d0VarA = p1VarC.a(v1Var)) == null || d0VarA.J().p() || d0VarA.i() == 1) {
            p1VarC.b(true);
            return;
        }
        int i10 = p1VarC.f2029h + 1;
        p1VarC.f2029h = i10;
        y yVar = (y) p1VarC.f2028g.get(v1Var);
        if (yVar == null || !yVar.isDone()) {
            d0Var = null;
        } else {
            try {
                d0Var = (d0) a.B(yVar);
            } catch (ExecutionException unused) {
                d0Var = null;
            }
        }
        if (d0Var != null) {
            d0Var.f();
            b7.c0 c0Var = d0Var.f1705b;
            if (c0Var.T()) {
                i0VarP = c0Var.P();
            } else {
                g0 g0Var = i0.f25998b;
                i0VarP = a1.f25946e;
            }
        } else {
            g0 g0Var2 = i0.f25998b;
            i0VarP = a1.f25946e;
        }
        c0.R(new Handler(((v) v1Var.a()).f22691t), new l1(p1VarC, v1Var, i0VarP, new g1(p1VarC, i10, v1Var), z10, 0));
    }

    public final boolean i(v1 v1Var, boolean z10) {
        try {
            h(v1Var, c().c(v1Var, z10));
            return true;
        } catch (IllegalStateException e10) {
            if (c0.f16548a < 31 || !b0.D(e10)) {
                throw e10;
            }
            p4.c.o("MSessionService", "Failed to start foreground", e10);
            this.f4300b.post(new a9.m(7, this));
            return false;
        }
    }

    public final void j(v1 v1Var) {
        p4.c.g(v1Var, "session must not be null");
        synchronized (this.f4299a) {
            p4.c.b("session not found", this.f4301c.containsKey(v1Var.f2118a.f1682i));
            this.f4301c.remove(v1Var.f2118a.f1682i);
        }
        c0.R(this.f4300b, new h(8, c(), v1Var));
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        String action;
        q2 q2Var;
        if (intent == null || (action = intent.getAction()) == null) {
            return null;
        }
        if (action.equals("androidx.media3.session.MediaSessionService")) {
            return d();
        }
        if (!action.equals("android.media.browse.MediaBrowserService")) {
            return null;
        }
        if (TextUtils.isEmpty("android.media.session.MediaController")) {
            throw new IllegalArgumentException("packageName should be nonempty");
        }
        if (Build.VERSION.SDK_INT >= 28) {
            z.n(-1, -1, "android.media.session.MediaController");
        }
        Bundle bundle = Bundle.EMPTY;
        v1 v1Var = this.f4306h;
        if (v1Var == null) {
            return null;
        }
        a(v1Var);
        c2 c2Var = v1Var.f2118a;
        synchronized (c2Var.f1674a) {
            try {
                if (c2Var.f1697x == null) {
                    d1 d1Var = ((w0) c2Var.f1684k.f2118a.f1681h.f2012k.f3618b).f3741c;
                    q2 q2Var2 = new q2(c2Var);
                    q2Var2.b(d1Var);
                    c2Var.f1697x = q2Var2;
                }
                q2Var = c2Var.f1697x;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return q2Var.onBind(new Intent("android.media.browse.MediaBrowserService"));
    }

    @Override // android.app.Service
    public final void onCreate() {
        ExoPlayer exoPlayer;
        a1 a1Var;
        u uVar;
        PendingIntent activity;
        f();
        c cVar = new c(this, new c3(21));
        Object systemService = getSystemService("notification");
        l.c(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        NotificationManager notificationManager = (NotificationManager) systemService;
        if (c0.f16548a >= 26 && notificationManager.getNotificationChannel("asmr") == null) {
            q.g();
            NotificationChannel notificationChannelC = g.c(getString(R.string.channel_name2));
            notificationChannelC.setDescription(getString(R.string.channel_desc));
            notificationChannelC.setSound(null, null);
            notificationChannelC.enableLights(false);
            notificationManager.createNotificationChannel(notificationChannelC);
        }
        synchronized (this.f4299a) {
            this.f4304f = cVar;
        }
        ExoPlayer exoPlayerC = d.c();
        pe.d dVar = new pe.d(12);
        exoPlayerC.getClass();
        Bundle bundle = new Bundle();
        Bundle bundle2 = new Bundle();
        g0 g0Var = i0.f25998b;
        a1 a1Var2 = a1.f25946e;
        WeakReference weakReference = a9.u.f266d;
        a0 a0Var = weakReference != null ? (a0) weakReference.get() : null;
        if (d.f8241a.getValue() == null || a0Var == null) {
            exoPlayer = exoPlayerC;
            a1Var = a1Var2;
            uVar = null;
            activity = PendingIntent.getActivity(i.a(), 0, new Intent(i.a(), (Class<?>) MainActivity.class), Build.VERSION.SDK_INT >= 23 ? 67108864 : 0);
            l.d(activity, "getActivity(...)");
        } else {
            ch.l lVar = new ch.l(a0Var);
            c4.n nVar = (c4.n) lVar.f4202c;
            ArrayList arrayList = (ArrayList) lVar.f4205f;
            int i10 = e7.u.f6398e;
            arrayList.add(new s("android-app://androidx.navigation/".concat("PlayingScreen").hashCode()));
            w wVar = (w) lVar.f4204e;
            if (wVar != null) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    int i11 = ((s) it.next()).f6391a;
                    if (lVar.r(i11) == null) {
                        int i12 = e7.u.f6398e;
                        throw new IllegalArgumentException("Navigation destination " + e7.g.a(nVar, i11) + " cannot be found in the navigation graph " + wVar);
                    }
                }
            }
            Iterator it2 = arrayList.iterator();
            int i13 = 0;
            while (it2.hasNext()) {
                i13 = (i13 * 31) + ((s) it2.next()).f6391a;
            }
            Intent intent = (Intent) lVar.f4203d;
            w wVar2 = (w) lVar.f4204e;
            if (wVar2 == null) {
                throw new IllegalStateException("You must call setGraph() before constructing the deep link");
            }
            if (arrayList.isEmpty()) {
                throw new IllegalStateException("You must call setDestination() or addDestination() before constructing the deep link");
            }
            ArrayList arrayList2 = new ArrayList();
            ArrayList<? extends Parcelable> arrayList3 = new ArrayList<>();
            Iterator it3 = arrayList.iterator();
            e7.u uVar2 = null;
            while (it3.hasNext()) {
                ExoPlayer exoPlayer2 = exoPlayerC;
                int i14 = ((s) it3.next()).f6391a;
                a1 a1Var3 = a1Var2;
                e7.u uVarR = lVar.r(i14);
                if (uVarR == null) {
                    int i15 = e7.u.f6398e;
                    throw new IllegalArgumentException("Navigation destination " + e7.g.a(nVar, i14) + " cannot be found in the navigation graph " + wVar2);
                }
                int[] iArrI = uVarR.i(uVar2);
                for (int i16 : iArrI) {
                    arrayList2.add(Integer.valueOf(i16));
                    arrayList3.add(null);
                }
                uVar2 = uVarR;
                a1Var2 = a1Var3;
                exoPlayerC = exoPlayer2;
            }
            exoPlayer = exoPlayerC;
            a1Var = a1Var2;
            intent.putExtra("android-support-nav:controller:deepLinkIds", vb.m.F0(arrayList2));
            intent.putParcelableArrayListExtra("android-support-nav:controller:deepLinkArgs", arrayList3);
            Context context = (Context) lVar.f4201b;
            ArrayList arrayList4 = new ArrayList();
            Intent intent2 = new Intent(intent);
            ComponentName component = intent2.getComponent();
            if (component == null) {
                component = intent2.resolveActivity(context.getPackageManager());
            }
            if (component != null) {
                int size = arrayList4.size();
                try {
                    for (Intent intentK = a.K(context, component); intentK != null; intentK = a.K(context, intentK.getComponent())) {
                        arrayList4.add(size, intentK);
                    }
                } catch (PackageManager.NameNotFoundException e10) {
                    Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
                    throw new IllegalArgumentException(e10);
                }
            }
            arrayList4.add(intent2);
            int size2 = arrayList4.size();
            for (int i17 = 0; i17 < size2; i17++) {
                Intent intent3 = (Intent) arrayList4.get(i17);
                if (intent3 != null) {
                    intent3.putExtra("android-support-nav:controller:deepLinkIntent", intent);
                }
            }
            if (arrayList4.isEmpty()) {
                throw new IllegalStateException("No intents added to TaskStackBuilder; cannot getPendingIntent");
            }
            Intent[] intentArr = (Intent[]) arrayList4.toArray(new Intent[0]);
            intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
            uVar = null;
            activity = PendingIntent.getActivities(context, i13, intentArr, 201326592, null);
            l.b(activity);
        }
        PendingIntent pendingIntent = activity;
        if (c0.f16548a >= 31) {
            p4.c.c(pendingIntent.isActivity());
        }
        this.f4306h = new v1(this, exoPlayer, pendingIntent, a1Var, a1Var, a1Var, dVar, bundle, bundle2, new e1(21));
        k4 k4Var = new k4(this, new ComponentName(this, (Class<?>) MainService.class));
        Bundle bundle3 = Bundle.EMPTY;
        b7.a0 a0Var2 = new b7.a0();
        Looper looperV = c0.v();
        f0 f0Var = new f0(looperV);
        if (k4Var.f1919a.i()) {
            uVar = new u(new s4.i(this));
        }
        d0 d0Var = new d0(this, k4Var, bundle3, a0Var2, looperV, f0Var, uVar);
        int i18 = 0;
        c0.R(new Handler(looperV), new b7.z(f0Var, d0Var, i18));
        f0Var.a(new a9.m(i18, f0Var), cb.r.f3875a);
    }

    @Override // android.app.Service
    public final void onDestroy() {
        v1 v1Var = this.f4306h;
        if (v1Var != null) {
            try {
                synchronized (v1.f2116b) {
                    v1.f2117c.remove(v1Var.f2118a.f1682i);
                }
                v1Var.f2118a.q();
            } catch (Exception unused) {
            }
            this.f4306h = null;
        }
        g();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i10, int i11) {
        v1 v1Var;
        v1 v1Var2;
        if (intent != null) {
            m mVarB = b();
            Uri data = intent.getData();
            if (data != null) {
                synchronized (v1.f2116b) {
                    try {
                        Iterator it = v1.f2117c.values().iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                v1Var2 = null;
                                break;
                            }
                            v1Var2 = (v1) it.next();
                            Uri uri = v1Var2.f2118a.f1675b;
                            int i12 = c0.f16548a;
                            if (Objects.equals(uri, data)) {
                            }
                        }
                    } finally {
                    }
                }
                v1Var = v1Var2;
            } else {
                v1Var = null;
            }
            mVarB.getClass();
            if ("android.intent.action.MEDIA_BUTTON".equals(intent.getAction())) {
                if (v1Var == null) {
                    if (TextUtils.isEmpty("android.media.session.MediaController")) {
                        throw new IllegalArgumentException("packageName should be nonempty");
                    }
                    if (Build.VERSION.SDK_INT >= 28) {
                        z.n(-1, -1, "android.media.session.MediaController");
                    }
                    Bundle bundle = Bundle.EMPTY;
                    v1Var = this.f4306h;
                    if (v1Var != null) {
                        a(v1Var);
                    }
                }
                c2 c2Var = v1Var.f2118a;
                c2Var.f1685l.post(new h(7, c2Var, intent));
                return 1;
            }
            if (v1Var != null && "androidx.media3.session.CUSTOM_NOTIFICATION_ACTION".equals(intent.getAction())) {
                Bundle extras = intent.getExtras();
                Object obj = extras != null ? extras.get("androidx.media3.session.EXTRAS_KEY_CUSTOM_NOTIFICATION_ACTION") : null;
                String str = obj instanceof String ? (String) obj : null;
                if (str != null) {
                    Bundle extras2 = intent.getExtras();
                    Object obj2 = extras2 != null ? extras2.get("androidx.media3.session.EXTRAS_KEY_CUSTOM_NOTIFICATION_ACTION_EXTRAS") : null;
                    Bundle bundle2 = obj2 instanceof Bundle ? (Bundle) obj2 : Bundle.EMPTY;
                    p1 p1VarC = c();
                    d0 d0VarA = p1VarC.a(v1Var);
                    if (d0VarA != null) {
                        c0.R(new Handler(((v) v1Var.a()).f22691t), new b7.e(p1VarC, v1Var, str, bundle2, d0VarA));
                    }
                }
            }
        }
        return 1;
    }

    @Override // android.app.Service
    public final void onTaskRemoved(Intent intent) {
        if (c().f2031j) {
            return;
        }
        stopSelf();
    }
}
