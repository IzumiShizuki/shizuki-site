package fh;

import android.content.Context;
import android.net.http.X509TrustManagerExtensions;
import android.os.Build;
import android.os.StrictMode;
import android.security.NetworkSecurityPolicy;
import android.util.CloseGuard;
import android.util.Log;
import b7.u0;
import gh.h;
import gh.k;
import gh.m;
import gh.n;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import vb.l;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class a extends e implements d {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final boolean f7094e;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Context f7095c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f7096d;

    static {
        f7094e = Build.VERSION.SDK_INT >= 29;
    }

    public a() {
        ArrayList arrayListT0 = l.t0(new n[]{Build.VERSION.SDK_INT >= 29 ? new gh.a() : null, new m(gh.e.f7554f), new m(k.f7563a), new m(h.f7561a)});
        ArrayList arrayList = new ArrayList();
        for (Object obj : arrayListT0) {
            if (((n) obj).b()) {
                arrayList.add(obj);
            }
        }
        this.f7096d = arrayList;
    }

    @Override // fh.d
    public final void a(Context context) {
        this.f7095c = context;
    }

    @Override // fh.d
    public final Context b() {
        return this.f7095c;
    }

    @Override // fh.e
    public final android.support.v4.media.session.b c(X509TrustManager x509TrustManager) {
        X509TrustManagerExtensions x509TrustManagerExtensions;
        try {
            x509TrustManagerExtensions = new X509TrustManagerExtensions(x509TrustManager);
        } catch (IllegalArgumentException unused) {
            x509TrustManagerExtensions = null;
        }
        gh.b bVar = x509TrustManagerExtensions != null ? new gh.b(x509TrustManager, x509TrustManagerExtensions) : null;
        return bVar != null ? bVar : new jh.a(d(x509TrustManager));
    }

    @Override // fh.e
    public final jh.d d(X509TrustManager x509TrustManager) {
        StrictMode.noteSlowCall("buildTrustRootIndex");
        return super.d(x509TrustManager);
    }

    @Override // fh.e
    public final void e(SSLSocket sSLSocket, String str, List list) {
        Object next;
        jc.l.e(list, "protocols");
        Iterator it = this.f7096d.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((n) next).a(sSLSocket)) {
                    break;
                }
            }
        }
        n nVar = (n) next;
        if (nVar != null) {
            nVar.d(sSLSocket, str, list);
        }
    }

    @Override // fh.e
    public final String g(SSLSocket sSLSocket) {
        Object next;
        Iterator it = this.f7096d.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((n) next).a(sSLSocket)) {
                break;
            }
        }
        n nVar = (n) next;
        if (nVar != null) {
            return nVar.c(sSLSocket);
        }
        return null;
    }

    @Override // fh.e
    public final Object h() {
        if (Build.VERSION.SDK_INT < 30) {
            return super.h();
        }
        CloseGuard closeGuardG = u0.g();
        closeGuardG.open("response.body().close()");
        return closeGuardG;
    }

    @Override // fh.e
    public final boolean i(String str) {
        jc.l.e(str, "hostname");
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
    }

    @Override // fh.e
    public final void j(String str, int i10, Throwable th2) {
        jc.l.e(str, "message");
        if (i10 == 5) {
            boolean z10 = c.f7099e;
            Log.w("OkHttp", str, th2);
        } else {
            boolean z11 = c.f7099e;
            Log.i("OkHttp", str, th2);
        }
    }

    @Override // fh.e
    public final void k(Object obj, String str) {
        jc.l.e(str, "message");
        if (Build.VERSION.SDK_INT < 30) {
            super.k(obj, str);
        } else {
            jc.l.c(obj, "null cannot be cast to non-null type android.util.CloseGuard");
            u0.h(obj).warnIfOpen();
        }
    }

    @Override // fh.e
    public final SSLContext l() {
        StrictMode.noteSlowCall("newSSLContext");
        return super.l();
    }
}
