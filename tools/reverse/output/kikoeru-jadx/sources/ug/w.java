package ug;

import b0.w1;
import java.net.ProxySelector;
import java.util.ArrayList;
import java.util.List;
import java.util.TimeZone;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import r.y1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class w {
    public int A;
    public long B;
    public xa.h C;
    public yg.c D;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public y1 f21882b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public w4.c f21885e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f21886f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f21887g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public b f21888h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f21889i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f21890j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public b f21891k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public f f21892l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public p f21893m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public ProxySelector f21894n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public b f21895o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public SocketFactory f21896p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public SSLSocketFactory f21897q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public X509TrustManager f21898r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public List f21899s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public List f21900t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public HostnameVerifier f21901u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public j f21902v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public android.support.v4.media.session.b f21903w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f21904x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f21905y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f21906z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public w1 f21881a = new w1(22);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f21883c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f21884d = new ArrayList();

    public w() {
        TimeZone timeZone = wg.g.f24231a;
        this.f21885e = new w4.c(21);
        this.f21886f = true;
        this.f21887g = true;
        b bVar = b.f21722c;
        this.f21888h = bVar;
        this.f21889i = true;
        this.f21890j = true;
        this.f21891k = b.f21723d;
        this.f21893m = p.f21854a;
        this.f21895o = bVar;
        SocketFactory socketFactory = SocketFactory.getDefault();
        jc.l.d(socketFactory, "getDefault(...)");
        this.f21896p = socketFactory;
        this.f21899s = x.F;
        this.f21900t = x.E;
        this.f21901u = jh.c.f10877a;
        this.f21902v = j.f21806c;
        this.f21904x = 10000;
        this.f21905y = 10000;
        this.f21906z = 10000;
        this.A = 60000;
        this.B = 1024L;
    }
}
