package ug;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final n f21833e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final n f21834f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final n f21835g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f21836a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f21837b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String[] f21838c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String[] f21839d;

    static {
        l lVar = l.f21825r;
        l lVar2 = l.f21826s;
        l lVar3 = l.f21827t;
        l lVar4 = l.f21819l;
        l lVar5 = l.f21821n;
        l lVar6 = l.f21820m;
        l lVar7 = l.f21822o;
        l lVar8 = l.f21824q;
        l lVar9 = l.f21823p;
        List listX = ud.b.x(lVar, lVar2, lVar3, lVar4, lVar5, lVar6, lVar7, lVar8, lVar9);
        List listX2 = ud.b.x(lVar, lVar2, lVar3, lVar4, lVar5, lVar6, lVar7, lVar8, lVar9, l.f21817j, l.f21818k, l.f21815h, l.f21816i, l.f21813f, l.f21814g, l.f21812e);
        m mVar = new m();
        l[] lVarArr = (l[]) listX.toArray(new l[0]);
        mVar.c((l[]) Arrays.copyOf(lVarArr, lVarArr.length));
        h0 h0Var = h0.f21798c;
        h0 h0Var2 = h0.f21799d;
        mVar.e(h0Var, h0Var2);
        mVar.f21832d = true;
        f21833e = mVar.a();
        m mVar2 = new m();
        List list = listX2;
        l[] lVarArr2 = (l[]) list.toArray(new l[0]);
        mVar2.c((l[]) Arrays.copyOf(lVarArr2, lVarArr2.length));
        mVar2.e(h0Var, h0Var2);
        mVar2.f21832d = true;
        f21834f = mVar2.a();
        m mVar3 = new m();
        l[] lVarArr3 = (l[]) list.toArray(new l[0]);
        mVar3.c((l[]) Arrays.copyOf(lVarArr3, lVarArr3.length));
        mVar3.e(h0Var, h0Var2, h0.f21800e, h0.f21801f);
        mVar3.f21832d = true;
        mVar3.a();
        f21835g = new n(false, false, null, null);
    }

    public n(boolean z10, boolean z11, String[] strArr, String[] strArr2) {
        this.f21836a = z10;
        this.f21837b = z11;
        this.f21838c = strArr;
        this.f21839d = strArr2;
    }

    public final void a(SSLSocket sSLSocket, boolean z10) {
        String[] enabledProtocols;
        String[] enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
        jc.l.b(enabledCipherSuites);
        String[] strArr = this.f21838c;
        if (strArr != null) {
            enabledCipherSuites = wg.e.k(strArr, enabledCipherSuites, l.f21810c);
        }
        String[] strArr2 = this.f21839d;
        if (strArr2 != null) {
            String[] enabledProtocols2 = sSLSocket.getEnabledProtocols();
            jc.l.d(enabledProtocols2, "getEnabledProtocols(...)");
            enabledProtocols = wg.e.k(enabledProtocols2, strArr2, xb.a.f24897b);
        } else {
            enabledProtocols = sSLSocket.getEnabledProtocols();
        }
        String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
        jc.l.b(supportedCipherSuites);
        k kVar = l.f21810c;
        byte[] bArr = wg.e.f24227a;
        int length = supportedCipherSuites.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                i10 = -1;
                break;
            } else if (kVar.compare(supportedCipherSuites[i10], "TLS_FALLBACK_SCSV") == 0) {
                break;
            } else {
                i10++;
            }
        }
        if (z10 && i10 != -1) {
            String str = supportedCipherSuites[i10];
            jc.l.d(str, "get(...)");
            jc.l.e(enabledCipherSuites, "<this>");
            Object[] objArrCopyOf = Arrays.copyOf(enabledCipherSuites, enabledCipherSuites.length + 1);
            jc.l.d(objArrCopyOf, "copyOf(...)");
            enabledCipherSuites = (String[]) objArrCopyOf;
            enabledCipherSuites[enabledCipherSuites.length - 1] = str;
        }
        m mVar = new m();
        mVar.f21829a = this.f21836a;
        mVar.f21830b = strArr;
        mVar.f21831c = strArr2;
        mVar.f21832d = this.f21837b;
        mVar.b((String[]) Arrays.copyOf(enabledCipherSuites, enabledCipherSuites.length));
        mVar.d((String[]) Arrays.copyOf(enabledProtocols, enabledProtocols.length));
        n nVarA = mVar.a();
        if (nVarA.c() != null) {
            sSLSocket.setEnabledProtocols(nVarA.f21839d);
        }
        if (nVarA.b() != null) {
            sSLSocket.setEnabledCipherSuites(nVarA.f21838c);
        }
    }

    public final ArrayList b() {
        String[] strArr = this.f21838c;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(l.f21809b.d(str));
        }
        return arrayList;
    }

    public final ArrayList c() {
        String[] strArr = this.f21839d;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            h0.f21797b.getClass();
            arrayList.add(b.e(str));
        }
        return arrayList;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof n)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        n nVar = (n) obj;
        boolean z10 = nVar.f21836a;
        boolean z11 = this.f21836a;
        if (z11 != z10) {
            return false;
        }
        if (z11) {
            return Arrays.equals(this.f21838c, nVar.f21838c) && Arrays.equals(this.f21839d, nVar.f21839d) && this.f21837b == nVar.f21837b;
        }
        return true;
    }

    public final int hashCode() {
        if (!this.f21836a) {
            return 17;
        }
        String[] strArr = this.f21838c;
        int iHashCode = (527 + (strArr != null ? Arrays.hashCode(strArr) : 0)) * 31;
        String[] strArr2 = this.f21839d;
        return ((iHashCode + (strArr2 != null ? Arrays.hashCode(strArr2) : 0)) * 31) + (!this.f21837b ? 1 : 0);
    }

    public final String toString() {
        if (!this.f21836a) {
            return "ConnectionSpec()";
        }
        return "ConnectionSpec(cipherSuites=" + Objects.toString(b(), "[all enabled]") + ", tlsVersions=" + Objects.toString(c(), "[all enabled]") + ", supportsTlsExtensions=" + this.f21837b + ')';
    }
}
