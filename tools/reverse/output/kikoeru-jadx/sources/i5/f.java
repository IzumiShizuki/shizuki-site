package i5;

import android.content.Context;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.os.Handler;
import androidx.media3.exoplayer.offline.m;
import b7.m2;
import jc.l;
import p4.c0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9017a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f9018b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f9019c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f9020d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f9021e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f9022f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Object f9023g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Object f9024h;

    public f(vd.a aVar, yd.e eVar, String[] strArr, String[] strArr2, String[] strArr3, String str, int i10) {
        this.f9017a = 1;
        l.e(aVar, "kind");
        this.f9019c = aVar;
        this.f9020d = eVar;
        this.f9021e = strArr;
        this.f9022f = strArr2;
        this.f9023g = strArr3;
        this.f9024h = str;
        this.f9018b = i10;
    }

    public void a() {
        int iA = ((c) this.f9021e).a((Context) this.f9019c);
        if (this.f9018b != iA) {
            this.f9018b = iA;
            ((m) ((androidx.media3.exoplayer.offline.g) this.f9020d).f903b).d(this, iA);
        }
    }

    public int b() {
        c cVar = (c) this.f9021e;
        Context context = (Context) this.f9019c;
        this.f9018b = cVar.a(context);
        IntentFilter intentFilter = new IntentFilter();
        int i10 = cVar.f9011a;
        if ((i10 & 1) != 0) {
            if (c0.f16548a >= 24) {
                ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
                connectivityManager.getClass();
                e eVar = new e(this);
                this.f9024h = eVar;
                connectivityManager.registerDefaultNetworkCallback(eVar);
            } else {
                intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            }
        }
        if ((i10 & 8) != 0) {
            intentFilter.addAction("android.intent.action.ACTION_POWER_CONNECTED");
            intentFilter.addAction("android.intent.action.ACTION_POWER_DISCONNECTED");
        }
        if ((i10 & 4) != 0) {
            if (c0.f16548a >= 23) {
                intentFilter.addAction("android.os.action.DEVICE_IDLE_MODE_CHANGED");
            } else {
                intentFilter.addAction("android.intent.action.SCREEN_ON");
                intentFilter.addAction("android.intent.action.SCREEN_OFF");
            }
        }
        if ((i10 & 16) != 0) {
            intentFilter.addAction("android.intent.action.DEVICE_STORAGE_LOW");
            intentFilter.addAction("android.intent.action.DEVICE_STORAGE_OK");
        }
        m2 m2Var = new m2(1, this);
        this.f9023g = m2Var;
        context.registerReceiver(m2Var, intentFilter, null, (Handler) this.f9022f);
        return this.f9018b;
    }

    public String toString() {
        switch (this.f9017a) {
            case 1:
                return ((vd.a) this.f9019c) + " version=" + ((yd.e) this.f9020d);
            default:
                return super.toString();
        }
    }

    public f(Context context, androidx.media3.exoplayer.offline.g gVar, c cVar) {
        this.f9017a = 0;
        this.f9019c = context.getApplicationContext();
        this.f9020d = gVar;
        this.f9021e = cVar;
        this.f9022f = c0.o(null);
    }
}
