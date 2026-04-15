package ug;

import b0.w1;
import b7.b1;
import java.net.ProxySelector;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import r.y1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class x implements h {
    public static final List E = wg.g.j(new y[]{y.f21937f, y.f21935d});
    public static final List F = wg.g.j(new n[]{n.f21834f, n.f21835g});
    public final long A;
    public final xa.h B;
    public final yg.c C;
    public final y1 D;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w1 f21907a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f21908b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f21909c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final w4.c f21910d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f21911e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f21912f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final b f21913g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f21914h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f21915i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final b f21916j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final f f21917k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final p f21918l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ProxySelector f21919m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final b f21920n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final SocketFactory f21921o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final SSLSocketFactory f21922p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final X509TrustManager f21923q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final List f21924r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final List f21925s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final HostnameVerifier f21926t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final j f21927u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final android.support.v4.media.session.b f21928v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f21929w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final int f21930x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final int f21931y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final int f21932z;

    public x(w wVar) throws NoSuchAlgorithmException, KeyStoreException {
        this.f21907a = wVar.f21881a;
        this.f21908b = wg.g.i(wVar.f21883c);
        this.f21909c = wg.g.i(wVar.f21884d);
        this.f21910d = wVar.f21885e;
        this.f21911e = wVar.f21886f;
        this.f21912f = wVar.f21887g;
        this.f21913g = wVar.f21888h;
        this.f21914h = wVar.f21889i;
        this.f21915i = wVar.f21890j;
        this.f21916j = wVar.f21891k;
        this.f21917k = wVar.f21892l;
        this.f21918l = wVar.f21893m;
        ProxySelector proxySelector = wVar.f21894n;
        if (proxySelector == null && (proxySelector = ProxySelector.getDefault()) == null) {
            proxySelector = hh.a.f8631a;
        }
        this.f21919m = proxySelector;
        this.f21920n = wVar.f21895o;
        this.f21921o = wVar.f21896p;
        List list = wVar.f21899s;
        this.f21924r = list;
        this.f21925s = wVar.f21900t;
        this.f21926t = wVar.f21901u;
        this.f21929w = wVar.f21904x;
        this.f21930x = wVar.f21905y;
        this.f21931y = wVar.f21906z;
        this.f21932z = wVar.A;
        this.A = wVar.B;
        xa.h hVar = wVar.C;
        this.B = hVar == null ? new xa.h(6) : hVar;
        yg.c cVar = wVar.D;
        this.C = cVar == null ? yg.c.f26354l : cVar;
        y1 y1Var = wVar.f21882b;
        if (y1Var == null) {
            y1Var = new y1(17);
            wVar.f21882b = y1Var;
        }
        this.D = y1Var;
        List list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            this.f21922p = null;
            this.f21928v = null;
            this.f21923q = null;
            this.f21927u = j.f21806c;
        } else {
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                if (((n) it.next()).f21836a) {
                    SSLSocketFactory sSLSocketFactory = wVar.f21897q;
                    if (sSLSocketFactory == null) {
                        fh.e eVar = fh.e.f7102a;
                        fh.e.f7102a.getClass();
                        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
                        trustManagerFactory.init((KeyStore) null);
                        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
                        jc.l.b(trustManagers);
                        if (trustManagers.length == 1) {
                            TrustManager trustManager = trustManagers[0];
                            if (trustManager instanceof X509TrustManager) {
                                X509TrustManager x509TrustManager = (X509TrustManager) trustManager;
                                this.f21923q = x509TrustManager;
                                fh.e eVar2 = fh.e.f7102a;
                                eVar2.getClass();
                                try {
                                    SSLContext sSLContextL = eVar2.l();
                                    sSLContextL.init(null, new TrustManager[]{x509TrustManager}, null);
                                    SSLSocketFactory socketFactory = sSLContextL.getSocketFactory();
                                    jc.l.d(socketFactory, "getSocketFactory(...)");
                                    this.f21922p = socketFactory;
                                    android.support.v4.media.session.b bVarC = fh.e.f7102a.c(x509TrustManager);
                                    this.f21928v = bVarC;
                                    j jVar = wVar.f21902v;
                                    jVar.getClass();
                                    this.f21927u = jc.l.a(jVar.f21808b, bVarC) ? jVar : new j(jVar.f21807a, bVarC);
                                } catch (GeneralSecurityException e10) {
                                    throw new AssertionError("No System TLS: " + e10, e10);
                                }
                            }
                        }
                        String string = Arrays.toString(trustManagers);
                        jc.l.d(string, "toString(...)");
                        throw new IllegalStateException("Unexpected default trust managers: ".concat(string).toString());
                    }
                    this.f21922p = sSLSocketFactory;
                    android.support.v4.media.session.b bVar = wVar.f21903w;
                    jc.l.b(bVar);
                    this.f21928v = bVar;
                    X509TrustManager x509TrustManager2 = wVar.f21898r;
                    jc.l.b(x509TrustManager2);
                    this.f21923q = x509TrustManager2;
                    j jVar2 = wVar.f21902v;
                    jVar2.getClass();
                    this.f21927u = jc.l.a(jVar2.f21808b, bVar) ? jVar2 : new j(jVar2.f21807a, bVar);
                }
            }
            this.f21922p = null;
            this.f21928v = null;
            this.f21923q = null;
            this.f21927u = j.f21806c;
        }
        X509TrustManager x509TrustManager3 = this.f21923q;
        android.support.v4.media.session.b bVar2 = this.f21928v;
        SSLSocketFactory sSLSocketFactory2 = this.f21922p;
        List list3 = this.f21909c;
        List list4 = this.f21908b;
        jc.l.c(list4, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
        if (list4.contains(null)) {
            throw new IllegalStateException(("Null interceptor: " + list4).toString());
        }
        jc.l.c(list3, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
        if (list3.contains(null)) {
            throw new IllegalStateException(("Null network interceptor: " + list3).toString());
        }
        List list5 = this.f21924r;
        if (!(list5 instanceof Collection) || !list5.isEmpty()) {
            Iterator it2 = list5.iterator();
            while (it2.hasNext()) {
                if (((n) it2.next()).f21836a) {
                    if (sSLSocketFactory2 == null) {
                        throw new IllegalStateException("sslSocketFactory == null");
                    }
                    if (bVar2 == null) {
                        throw new IllegalStateException("certificateChainCleaner == null");
                    }
                    if (x509TrustManager3 == null) {
                        throw new IllegalStateException("x509TrustManager == null");
                    }
                    return;
                }
            }
        }
        if (sSLSocketFactory2 != null) {
            throw new IllegalStateException("Check failed.");
        }
        if (bVar2 != null) {
            throw new IllegalStateException("Check failed.");
        }
        if (x509TrustManager3 != null) {
            throw new IllegalStateException("Check failed.");
        }
        if (!jc.l.a(this.f21927u, j.f21806c)) {
            throw new IllegalStateException("Check failed.");
        }
    }

    public final zg.n a(b1 b1Var) {
        jc.l.e(b1Var, "request");
        return new zg.n(this, b1Var);
    }

    public x() {
        this(new w());
    }
}
