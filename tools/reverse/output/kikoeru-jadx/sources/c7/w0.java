package c7;

import android.content.Context;
import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.Handler;
import android.os.RemoteCallbackList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public class w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MediaSession f3739a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v0 f3740b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d1 f3741c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Bundle f3743e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public p1 f3745g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public List f3746h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public r0 f3747i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f3748j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f3749k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f3750l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public u0 f3751m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public k1 f3752n;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f3742d = new Object();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final RemoteCallbackList f3744f = new RemoteCallbackList();

    public w0(Context context, String str, Bundle bundle) {
        MediaSession mediaSessionA = a(context, str, bundle);
        this.f3739a = mediaSessionA;
        v0 v0Var = new v0(this);
        this.f3740b = v0Var;
        this.f3741c = new d1(mediaSessionA.getSessionToken(), v0Var);
        this.f3743e = bundle;
        mediaSessionA.setFlags(3);
    }

    public MediaSession a(Context context, String str, Bundle bundle) {
        return new MediaSession(context, str);
    }

    public final u0 b() {
        u0 u0Var;
        synchronized (this.f3742d) {
            u0Var = this.f3751m;
        }
        return u0Var;
    }

    public k1 c() {
        k1 k1Var;
        synchronized (this.f3742d) {
            k1Var = this.f3752n;
        }
        return k1Var;
    }

    public final p1 d() {
        return this.f3745g;
    }

    public final void e(u0 u0Var, Handler handler) {
        synchronized (this.f3742d) {
            try {
                this.f3751m = u0Var;
                this.f3739a.setCallback(u0Var == null ? null : u0Var.f3731b, handler);
                if (u0Var != null) {
                    u0Var.C(this, handler);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void f(k1 k1Var) {
        synchronized (this.f3742d) {
            this.f3752n = k1Var;
        }
    }

    public void g(int i10) {
        this.f3748j = i10;
    }
}
