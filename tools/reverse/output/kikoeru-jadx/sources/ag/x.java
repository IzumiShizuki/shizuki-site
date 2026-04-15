package ag;

import bg.e2;
import java.util.List;
import q.t0;
import wf.z0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
@sf.g
public final class x {
    public static final w Companion = new w();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f361a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e2 f362b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final bg.u f363c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f364d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f365e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List f366f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f367g;

    public x(int i10, int i11, e2 e2Var, bg.u uVar, int i12, int i13, List list, boolean z10) {
        if (63 != (i10 & 63)) {
            z0.i(i10, 63, v.f360b);
            throw null;
        }
        this.f361a = i11;
        this.f362b = e2Var;
        this.f363c = uVar;
        this.f364d = i12;
        this.f365e = i13;
        this.f366f = list;
        if ((i10 & 64) == 0) {
            this.f367g = false;
        } else {
            this.f367g = z10;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return this.f361a == xVar.f361a && this.f362b == xVar.f362b && this.f363c == xVar.f363c && this.f364d == xVar.f364d && this.f365e == xVar.f365e && jc.l.a(this.f366f, xVar.f366f) && this.f367g == xVar.f367g;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [int] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    public final int hashCode() {
        int iZ = t0.z((((((this.f363c.hashCode() + ((this.f362b.hashCode() + (this.f361a * 31)) * 31)) * 31) + this.f364d) * 31) + this.f365e) * 31, 31, this.f366f);
        boolean z10 = this.f367g;
        ?? r12 = z10;
        if (z10) {
            r12 = 1;
        }
        return iZ + r12;
    }

    public final String toString() {
        return "WorksV2Params(page=" + this.f361a + ", order=" + this.f362b + ", sort=" + this.f363c + ", seed=" + this.f364d + ", subtitle=" + this.f365e + ", localSubtitledWorks=" + this.f366f + ", includeTranslationWorks=" + this.f367g + ')';
    }

    public x(int i10, e2 e2Var, bg.u uVar, int i11, int i12, List list, boolean z10) {
        jc.l.e(e2Var, "order");
        jc.l.e(uVar, "sort");
        jc.l.e(list, "localSubtitledWorks");
        this.f361a = i10;
        this.f362b = e2Var;
        this.f363c = uVar;
        this.f364d = i11;
        this.f365e = i12;
        this.f366f = list;
        this.f367g = z10;
    }
}
