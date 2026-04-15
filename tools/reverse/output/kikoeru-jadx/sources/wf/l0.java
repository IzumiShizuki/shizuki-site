package wf;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class l0 implements pc.v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pc.v f24142a;

    public l0(pc.v vVar) {
        jc.l.e(vVar, "origin");
        this.f24142a = vVar;
    }

    @Override // pc.v
    public final boolean a() {
        return this.f24142a.a();
    }

    @Override // pc.v
    public final List b() {
        return this.f24142a.b();
    }

    @Override // pc.v
    public final pc.d c() {
        return this.f24142a.c();
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        l0 l0Var = obj instanceof l0 ? (l0) obj : null;
        pc.v vVar = l0Var != null ? l0Var.f24142a : null;
        pc.v vVar2 = this.f24142a;
        if (!jc.l.a(vVar2, vVar)) {
            return false;
        }
        pc.d dVarC = vVar2.c();
        if (dVarC instanceof pc.c) {
            pc.v vVar3 = obj instanceof pc.v ? (pc.v) obj : null;
            pc.d dVarC2 = vVar3 != null ? vVar3.c() : null;
            if (dVarC2 != null && (dVarC2 instanceof pc.c)) {
                return g8.a.D((pc.c) dVarC).equals(g8.a.D((pc.c) dVarC2));
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f24142a.hashCode();
    }

    public final String toString() {
        return "KTypeWrapper: " + this.f24142a;
    }
}
