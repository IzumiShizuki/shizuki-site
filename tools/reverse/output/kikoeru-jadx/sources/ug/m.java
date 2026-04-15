package ug;

import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f21829a = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String[] f21830b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String[] f21831c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f21832d;

    public final n a() {
        return new n(this.f21829a, this.f21832d, this.f21830b, this.f21831c);
    }

    public final void b(String... strArr) {
        jc.l.e(strArr, "cipherSuites");
        if (!this.f21829a) {
            throw new IllegalArgumentException("no cipher suites for cleartext connections");
        }
        if (strArr.length == 0) {
            throw new IllegalArgumentException("At least one cipher suite is required");
        }
        Object[] objArrCopyOf = Arrays.copyOf(strArr, strArr.length);
        jc.l.d(objArrCopyOf, "copyOf(...)");
        this.f21830b = (String[]) objArrCopyOf;
    }

    public final void c(l... lVarArr) {
        jc.l.e(lVarArr, "cipherSuites");
        if (!this.f21829a) {
            throw new IllegalArgumentException("no cipher suites for cleartext connections");
        }
        ArrayList arrayList = new ArrayList(lVarArr.length);
        for (l lVar : lVarArr) {
            arrayList.add(lVar.f21828a);
        }
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        b((String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public final void d(String... strArr) {
        jc.l.e(strArr, "tlsVersions");
        if (!this.f21829a) {
            throw new IllegalArgumentException("no TLS versions for cleartext connections");
        }
        if (strArr.length == 0) {
            throw new IllegalArgumentException("At least one TLS version is required");
        }
        Object[] objArrCopyOf = Arrays.copyOf(strArr, strArr.length);
        jc.l.d(objArrCopyOf, "copyOf(...)");
        this.f21831c = (String[]) objArrCopyOf;
    }

    public final void e(h0... h0VarArr) {
        if (!this.f21829a) {
            throw new IllegalArgumentException("no TLS versions for cleartext connections");
        }
        ArrayList arrayList = new ArrayList(h0VarArr.length);
        for (h0 h0Var : h0VarArr) {
            arrayList.add(h0Var.f21804a);
        }
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        d((String[]) Arrays.copyOf(strArr, strArr.length));
    }
}
