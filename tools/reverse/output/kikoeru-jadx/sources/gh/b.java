package gh;

import android.net.http.X509TrustManagerExtensions;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class b extends android.support.v4.media.session.b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final X509TrustManager f7549e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final X509TrustManagerExtensions f7550f;

    public b(X509TrustManager x509TrustManager, X509TrustManagerExtensions x509TrustManagerExtensions) {
        super(20);
        this.f7549e = x509TrustManager;
        this.f7550f = x509TrustManagerExtensions;
    }

    @Override // android.support.v4.media.session.b
    public final List A(String str, List list) throws SSLPeerUnverifiedException {
        jc.l.e(list, "chain");
        jc.l.e(str, "hostname");
        try {
            List<X509Certificate> listCheckServerTrusted = this.f7550f.checkServerTrusted((X509Certificate[]) list.toArray(new X509Certificate[0]), "RSA", str);
            jc.l.d(listCheckServerTrusted, "checkServerTrusted(...)");
            return listCheckServerTrusted;
        } catch (CertificateException e10) {
            SSLPeerUnverifiedException sSLPeerUnverifiedException = new SSLPeerUnverifiedException(e10.getMessage());
            sSLPeerUnverifiedException.initCause(e10);
            throw sSLPeerUnverifiedException;
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof b) && ((b) obj).f7549e == this.f7549e;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f7549e);
    }
}
