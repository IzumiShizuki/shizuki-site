package ag;

import q.t0;
import wf.z0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
@sf.g
public final class c {
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f327a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f328b;

    public c(int i10, String str, String str2) {
        if (3 != (i10 & 3)) {
            z0.i(i10, 3, a.f326b);
            throw null;
        }
        this.f327a = str;
        this.f328b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return jc.l.a(this.f327a, cVar.f327a) && jc.l.a(this.f328b, cVar.f328b);
    }

    public final int hashCode() {
        return this.f328b.hashCode() + (this.f327a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LoginRequest(name=");
        sb.append(this.f327a);
        sb.append(", password=");
        return t0.E(sb, this.f328b, ')');
    }

    public c(String str, String str2) {
        jc.l.e(str, "name");
        jc.l.e(str2, "password");
        this.f327a = str;
        this.f328b = str2;
    }
}
