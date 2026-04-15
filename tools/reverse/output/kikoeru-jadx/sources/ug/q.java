package ug;

import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h0 f21855a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f21856b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f21857c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ub.p f21858d;

    public q(h0 h0Var, l lVar, List list, ic.a aVar) {
        this.f21855a = h0Var;
        this.f21856b = lVar;
        this.f21857c = list;
        this.f21858d = ub.a.d(new ba.j(11, aVar));
    }

    public final List a() {
        return (List) this.f21858d.getValue();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return qVar.f21855a == this.f21855a && jc.l.a(qVar.f21856b, this.f21856b) && jc.l.a(qVar.a(), a()) && jc.l.a(qVar.f21857c, this.f21857c);
    }

    public final int hashCode() {
        return this.f21857c.hashCode() + ((a().hashCode() + ((this.f21856b.hashCode() + ((this.f21855a.hashCode() + 527) * 31)) * 31)) * 31);
    }

    public final String toString() {
        String type;
        String type2;
        List<Certificate> listA = a();
        ArrayList arrayList = new ArrayList(vb.n.K(listA, 10));
        for (Certificate certificate : listA) {
            if (certificate instanceof X509Certificate) {
                type2 = ((X509Certificate) certificate).getSubjectDN().toString();
            } else {
                type2 = certificate.getType();
                jc.l.d(type2, "getType(...)");
            }
            arrayList.add(type2);
        }
        String string = arrayList.toString();
        StringBuilder sb = new StringBuilder("Handshake{tlsVersion=");
        sb.append(this.f21855a);
        sb.append(" cipherSuite=");
        sb.append(this.f21856b);
        sb.append(" peerCertificates=");
        sb.append(string);
        sb.append(" localCertificates=");
        List<Certificate> list = this.f21857c;
        ArrayList arrayList2 = new ArrayList(vb.n.K(list, 10));
        for (Certificate certificate2 : list) {
            if (certificate2 instanceof X509Certificate) {
                type = ((X509Certificate) certificate2).getSubjectDN().toString();
            } else {
                type = certificate2.getType();
                jc.l.d(type, "getType(...)");
            }
            arrayList2.add(type);
        }
        sb.append(arrayList2);
        sb.append('}');
        return sb.toString();
    }
}
