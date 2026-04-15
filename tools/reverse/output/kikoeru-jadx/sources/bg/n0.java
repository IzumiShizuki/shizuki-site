package bg;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
@sf.g
public final class n0 extends o0 {
    public static final m0 Companion = new m0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f2931b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f2932c;

    public n0(int i10, String str, List list) {
        if (3 != (i10 & 3)) {
            wf.z0.i(i10, 3, l0.f2921b);
            throw null;
        }
        this.f2931b = str;
        this.f2932c = list;
    }

    @Override // bg.o0
    public final String a() {
        return this.f2931b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n0)) {
            return false;
        }
        n0 n0Var = (n0) obj;
        return jc.l.a(this.f2931b, n0Var.f2931b) && jc.l.a(this.f2932c, n0Var.f2932c);
    }

    public final int hashCode() {
        return this.f2932c.hashCode() + (this.f2931b.hashCode() * 31);
    }

    public final String toString() {
        return "Folder(title=" + this.f2931b + ", children=" + this.f2932c + ')';
    }
}
