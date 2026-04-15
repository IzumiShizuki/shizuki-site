package fh;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import javax.net.ssl.X509TrustManager;
import jc.l;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class b implements jh.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final X509TrustManager f7097a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Method f7098b;

    public b(X509TrustManager x509TrustManager, Method method) {
        this.f7097a = x509TrustManager;
        this.f7098b = method;
    }

    @Override // jh.d
    public final X509Certificate a(X509Certificate x509Certificate) {
        try {
            Object objInvoke = this.f7098b.invoke(this.f7097a, x509Certificate);
            l.c(objInvoke, "null cannot be cast to non-null type java.security.cert.TrustAnchor");
            return ((TrustAnchor) objInvoke).getTrustedCert();
        } catch (IllegalAccessException e10) {
            throw new AssertionError("unable to get issues and signature", e10);
        } catch (InvocationTargetException unused) {
            return null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return l.a(this.f7097a, bVar.f7097a) && l.a(this.f7098b, bVar.f7098b);
    }

    public final int hashCode() {
        return this.f7098b.hashCode() + (this.f7097a.hashCode() * 31);
    }

    public final String toString() {
        return "CustomTrustRootIndex(trustManager=" + this.f7097a + ", findByIssuerAndSignatureMethod=" + this.f7098b + ')';
    }
}
