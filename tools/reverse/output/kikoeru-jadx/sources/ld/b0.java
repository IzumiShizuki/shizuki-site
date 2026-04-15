package ld;

import j2.h0;
import q.t0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f12185a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final be.e f12186b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f12187c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f12188d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f12189e;

    public b0(String str, be.e eVar, String str2, String str3) {
        jc.l.e(str, "classInternalName");
        this.f12185a = str;
        this.f12186b = eVar;
        this.f12187c = str2;
        this.f12188d = str3;
        String str4 = eVar + '(' + str2 + ')' + str3;
        jc.l.e(str4, "jvmDescriptor");
        this.f12189e = str + '.' + str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj;
        return jc.l.a(this.f12185a, b0Var.f12185a) && jc.l.a(this.f12186b, b0Var.f12186b) && jc.l.a(this.f12187c, b0Var.f12187c) && jc.l.a(this.f12188d, b0Var.f12188d);
    }

    public final int hashCode() {
        return this.f12188d.hashCode() + h0.e((this.f12186b.hashCode() + (this.f12185a.hashCode() * 31)) * 31, 31, this.f12187c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NameAndSignature(classInternalName=");
        sb.append(this.f12185a);
        sb.append(", name=");
        sb.append(this.f12186b);
        sb.append(", parameters=");
        sb.append(this.f12187c);
        sb.append(", returnType=");
        return t0.E(sb, this.f12188d, ')');
    }
}
