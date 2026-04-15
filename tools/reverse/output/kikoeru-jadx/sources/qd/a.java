package qd;

import java.util.Set;
import jc.l;
import se.a0;
import se.s0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s0 f18138a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f18139b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f18140c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f18141d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Set f18142e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final a0 f18143f;

    public a(s0 s0Var, b bVar, boolean z10, boolean z11, Set set, a0 a0Var) {
        this.f18138a = s0Var;
        this.f18139b = bVar;
        this.f18140c = z10;
        this.f18141d = z11;
        this.f18142e = set;
        this.f18143f = a0Var;
    }

    public static a a(a aVar, b bVar, boolean z10, Set set, a0 a0Var, int i10) {
        s0 s0Var = aVar.f18138a;
        if ((i10 & 2) != 0) {
            bVar = aVar.f18139b;
        }
        b bVar2 = bVar;
        if ((i10 & 4) != 0) {
            z10 = aVar.f18140c;
        }
        boolean z11 = z10;
        boolean z12 = aVar.f18141d;
        if ((i10 & 16) != 0) {
            set = aVar.f18142e;
        }
        Set set2 = set;
        if ((i10 & 32) != 0) {
            a0Var = aVar.f18143f;
        }
        aVar.getClass();
        l.e(s0Var, "howThisTypeIsUsed");
        l.e(bVar2, "flexibility");
        return new a(s0Var, bVar2, z11, z12, set2, a0Var);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return l.a(aVar.f18143f, this.f18143f) && aVar.f18138a == this.f18138a && aVar.f18139b == this.f18139b && aVar.f18140c == this.f18140c && aVar.f18141d == this.f18141d;
    }

    public final int hashCode() {
        a0 a0Var = this.f18143f;
        int iHashCode = a0Var != null ? a0Var.hashCode() : 0;
        int iHashCode2 = this.f18138a.hashCode() + (iHashCode * 31) + iHashCode;
        int iHashCode3 = this.f18139b.hashCode() + (iHashCode2 * 31) + iHashCode2;
        int i10 = (iHashCode3 * 31) + (this.f18140c ? 1 : 0) + iHashCode3;
        return (i10 * 31) + (this.f18141d ? 1 : 0) + i10;
    }

    public final String toString() {
        return "JavaTypeAttributes(howThisTypeIsUsed=" + this.f18138a + ", flexibility=" + this.f18139b + ", isRaw=" + this.f18140c + ", isForAnnotationParameter=" + this.f18141d + ", visitedTypeParameters=" + this.f18142e + ", defaultType=" + this.f18143f + ')';
    }

    public /* synthetic */ a(s0 s0Var, boolean z10, boolean z11, Set set, int i10) {
        this(s0Var, b.f18144a, (i10 & 4) != 0 ? false : z10, (i10 & 8) != 0 ? false : z11, (i10 & 16) != 0 ? null : set, null);
    }
}
