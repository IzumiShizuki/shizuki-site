package r;

import com.tencent.bugly.beta.tinker.TinkerReport;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class u1 implements u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f18588a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f18589b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v f18590c;

    public u1(int i10, v vVar, int i11) {
        this((i11 & 1) != 0 ? TinkerReport.KEY_LOADED_MISMATCH_DEX : i10, 0, (i11 & 4) != 0 ? w.f18598a : vVar);
    }

    @Override // r.j
    public final x1 a(v1 v1Var) {
        return new ch.z(this.f18588a, this.f18589b, this.f18590c);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof u1) {
            u1 u1Var = (u1) obj;
            if (u1Var.f18588a == this.f18588a && u1Var.f18589b == this.f18589b && jc.l.a(u1Var.f18590c, this.f18590c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f18590c.hashCode() + (this.f18588a * 31)) * 31) + this.f18589b;
    }

    @Override // r.u, r.j
    public final a2 a(v1 v1Var) {
        return new ch.z(this.f18588a, this.f18589b, this.f18590c);
    }

    public u1(int i10, int i11, v vVar) {
        this.f18588a = i10;
        this.f18589b = i11;
        this.f18590c = vVar;
    }
}
