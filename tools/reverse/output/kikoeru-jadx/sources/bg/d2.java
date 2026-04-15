package bg;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
@sf.g
public final class d2 {
    public static final c2 Companion = new c2();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f2861a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f2862b;

    public d2(int i10, m mVar, List list) {
        if (3 != (i10 & 3)) {
            wf.z0.i(i10, 3, b2.f2849b);
            throw null;
        }
        this.f2861a = mVar;
        this.f2862b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d2)) {
            return false;
        }
        d2 d2Var = (d2) obj;
        return jc.l.a(this.f2861a, d2Var.f2861a) && jc.l.a(this.f2862b, d2Var.f2862b);
    }

    public final int hashCode() {
        return this.f2862b.hashCode() + (this.f2861a.hashCode() * 31);
    }

    public final String toString() {
        return "Works(pagination=" + this.f2861a + ", works=" + this.f2862b + ')';
    }
}
