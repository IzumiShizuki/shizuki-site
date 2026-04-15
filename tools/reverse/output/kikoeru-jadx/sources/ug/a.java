package ug;

import java.net.ProxySelector;
import java.util.List;
import java.util.Objects;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import q.t0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f21709a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SocketFactory f21710b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SSLSocketFactory f21711c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HostnameVerifier f21712d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final j f21713e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final b f21714f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ProxySelector f21715g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final t f21716h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final List f21717i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final List f21718j;

    public a(String str, int i10, p pVar, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, j jVar, b bVar, List list, List list2, ProxySelector proxySelector) {
        jc.l.e(str, "uriHost");
        jc.l.e(pVar, "dns");
        jc.l.e(socketFactory, "socketFactory");
        jc.l.e(bVar, "proxyAuthenticator");
        jc.l.e(list, "protocols");
        jc.l.e(list2, "connectionSpecs");
        jc.l.e(proxySelector, "proxySelector");
        this.f21709a = pVar;
        this.f21710b = socketFactory;
        this.f21711c = sSLSocketFactory;
        this.f21712d = hostnameVerifier;
        this.f21713e = jVar;
        this.f21714f = bVar;
        this.f21715g = proxySelector;
        s sVar = new s();
        String str2 = sSLSocketFactory != null ? "https" : "http";
        if (str2.equalsIgnoreCase("http")) {
            sVar.f21861a = "http";
        } else {
            if (!str2.equalsIgnoreCase("https")) {
                throw new IllegalArgumentException("unexpected scheme: ".concat(str2));
            }
            sVar.f21861a = "https";
        }
        String strB = wg.d.b(kh.a.c(0, 0, 7, str));
        if (strB == null) {
            throw new IllegalArgumentException("unexpected host: ".concat(str));
        }
        sVar.f21864d = strB;
        if (1 > i10 || i10 >= 65536) {
            throw new IllegalArgumentException(t0.B(i10, "unexpected port: ").toString());
        }
        sVar.f21865e = i10;
        this.f21716h = sVar.b();
        this.f21717i = wg.g.i(list);
        this.f21718j = wg.g.i(list2);
    }

    public final boolean a(a aVar) {
        jc.l.e(aVar, "that");
        return jc.l.a(this.f21709a, aVar.f21709a) && jc.l.a(this.f21714f, aVar.f21714f) && jc.l.a(this.f21717i, aVar.f21717i) && jc.l.a(this.f21718j, aVar.f21718j) && jc.l.a(this.f21715g, aVar.f21715g) && jc.l.a(this.f21711c, aVar.f21711c) && jc.l.a(this.f21712d, aVar.f21712d) && jc.l.a(this.f21713e, aVar.f21713e) && this.f21716h.f21873e == aVar.f21716h.f21873e;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return jc.l.a(this.f21716h, aVar.f21716h) && a(aVar);
    }

    public final int hashCode() {
        return Objects.hashCode(this.f21713e) + ((Objects.hashCode(this.f21712d) + ((Objects.hashCode(this.f21711c) + ((this.f21715g.hashCode() + t0.z(t0.z((this.f21714f.hashCode() + ((this.f21709a.hashCode() + j2.h0.e(527, 31, this.f21716h.f21876h)) * 31)) * 31, 31, this.f21717i), 31, this.f21718j)) * 961)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Address{");
        t tVar = this.f21716h;
        sb.append(tVar.f21872d);
        sb.append(':');
        sb.append(tVar.f21873e);
        sb.append(", ");
        sb.append("proxySelector=" + this.f21715g);
        sb.append('}');
        return sb.toString();
    }
}
