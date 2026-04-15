package yc;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final be.b f26094a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f26095b;

    public b0(be.b bVar, List list) {
        jc.l.e(bVar, "classId");
        this.f26094a = bVar;
        this.f26095b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj;
        return jc.l.a(this.f26094a, b0Var.f26094a) && jc.l.a(this.f26095b, b0Var.f26095b);
    }

    public final int hashCode() {
        return this.f26095b.hashCode() + (this.f26094a.hashCode() * 31);
    }

    public final String toString() {
        return "ClassRequest(classId=" + this.f26094a + ", typeParametersCount=" + this.f26095b + ')';
    }
}
