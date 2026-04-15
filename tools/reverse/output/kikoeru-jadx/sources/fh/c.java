package fh;

import android.content.Context;
import android.net.http.X509TrustManagerExtensions;
import android.os.Build;
import android.os.StrictMode;
import android.security.NetworkSecurityPolicy;
import android.util.Log;
import gh.h;
import gh.k;
import gh.m;
import gh.n;
import gh.o;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import ug.x;
import vb.l;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class c extends e implements d {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final boolean f7099e;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Context f7100c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f7101d;

    static {
        f7099e = Build.VERSION.SDK_INT < 29;
    }

    public c() {
        o oVar;
        try {
            Class<?> cls = Class.forName("com.android.org.conscrypt".concat(".OpenSSLSocketImpl"));
            Class.forName("com.android.org.conscrypt".concat(".OpenSSLSocketFactoryImpl"));
            Class.forName("com.android.org.conscrypt".concat(".SSLParametersImpl"));
            oVar = new o(cls);
        } catch (Exception e10) {
            CopyOnWriteArraySet copyOnWriteArraySet = gh.c.f7551a;
            gh.c.a(x.class.getName(), 5, "unable to load android socket classes", e10);
            oVar = null;
        }
        ArrayList arrayListT0 = l.t0(new n[]{oVar, new m(gh.e.f7554f), new m(k.f7563a), new m(h.f7561a)});
        ArrayList arrayList = new ArrayList();
        for (Object obj : arrayListT0) {
            if (((n) obj).b()) {
                arrayList.add(obj);
            }
        }
        this.f7101d = arrayList;
    }

    @Override // fh.d
    public final void a(Context context) {
        this.f7100c = context;
    }

    @Override // fh.d
    public final Context b() {
        return this.f7100c;
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
        try {
            StrictMode.noteSlowCall("buildTrustRootIndex");
            Method declaredMethod = x509TrustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", X509Certificate.class);
            declaredMethod.setAccessible(true);
            return new b(x509TrustManager, declaredMethod);
        } catch (NoSuchMethodException unused) {
            return super.d(x509TrustManager);
        }
    }

    @Override // fh.e
    public final void e(SSLSocket sSLSocket, String str, List list) {
        Object next;
        jc.l.e(list, "protocols");
        Iterator it = this.f7101d.iterator();
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
    public final void f(Socket socket, InetSocketAddress inetSocketAddress, int i10) throws IOException {
        jc.l.e(inetSocketAddress, "address");
        try {
            socket.connect(inetSocketAddress, i10);
        } catch (ClassCastException e10) {
            if (Build.VERSION.SDK_INT != 26) {
                throw e10;
            }
            throw new IOException("Exception in connect", e10);
        }
    }

    @Override // fh.e
    public final String g(SSLSocket sSLSocket) {
        Object next;
        Iterator it = this.f7101d.iterator();
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
    public final boolean i(String str) {
        jc.l.e(str, "hostname");
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 24) {
            return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
        }
        if (i10 >= 23) {
            return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted();
        }
        return true;
    }

    @Override // fh.e
    public final void j(String str, int i10, Throwable th2) {
        jc.l.e(str, "message");
        if (i10 == 5) {
            Log.w("OkHttp", str, th2);
        } else {
            Log.i("OkHttp", str, th2);
        }
    }

    @Override // fh.e
    public final SSLContext l() {
        StrictMode.noteSlowCall("newSSLContext");
        return super.l();
    }
}
