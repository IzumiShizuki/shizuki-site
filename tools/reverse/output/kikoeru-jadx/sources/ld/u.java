package ld;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a0 f12251a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a0 f12252b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f12253c = vb.s.f22820a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f12254d;

    public u(a0 a0Var, a0 a0Var2) {
        this.f12251a = a0Var;
        this.f12252b = a0Var2;
        ub.a.d(new bd.e(6, this));
        a0 a0Var3 = a0.f12177b;
        this.f12254d = a0Var == a0Var3 && a0Var2 == a0Var3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return this.f12251a == uVar.f12251a && this.f12252b == uVar.f12252b && jc.l.a(this.f12253c, uVar.f12253c);
    }

    public final int hashCode() {
        int iHashCode = this.f12251a.hashCode() * 31;
        a0 a0Var = this.f12252b;
        return this.f12253c.hashCode() + ((iHashCode + (a0Var == null ? 0 : a0Var.hashCode())) * 31);
    }

    public final String toString() {
        return "Jsr305Settings(globalLevel=" + this.f12251a + ", migrationLevel=" + this.f12252b + ", userDefinedLevelForSpecificAnnotation=" + this.f12253c + ')';
    }
}
