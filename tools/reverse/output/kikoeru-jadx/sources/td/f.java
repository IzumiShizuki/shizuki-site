package td;

import ce.j0;
import se.a0;
import se.h0;
import se.u0;
import se.w;
import se.w0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class f extends se.m implements se.j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a0 f20679b;

    public f(a0 a0Var) {
        jc.l.e(a0Var, "delegate");
        this.f20679b = a0Var;
    }

    @Override // se.a0, se.w0
    public final w0 C(h0 h0Var) {
        jc.l.e(h0Var, "newAttributes");
        return new f(this.f20679b.C(h0Var));
    }

    @Override // se.a0
    /* JADX INFO: renamed from: D */
    public final a0 z(boolean z10) {
        return z10 ? this.f20679b.z(true) : this;
    }

    @Override // se.a0
    /* JADX INFO: renamed from: F */
    public final a0 C(h0 h0Var) {
        jc.l.e(h0Var, "newAttributes");
        return new f(this.f20679b.C(h0Var));
    }

    @Override // se.m
    public final a0 G() {
        return this.f20679b;
    }

    @Override // se.m
    public final se.m J(a0 a0Var) {
        return new f(a0Var);
    }

    @Override // se.j
    public final w0 i(w wVar) {
        jc.l.e(wVar, "replacement");
        w0 w0VarX = wVar.x();
        if (!u0.f(w0VarX) && !u0.e(w0VarX)) {
            return w0VarX;
        }
        if (w0VarX instanceof a0) {
            a0 a0Var = (a0) w0VarX;
            a0 a0VarZ = a0Var.z(false);
            return !u0.f(a0Var) ? a0VarZ : new f(a0VarZ);
        }
        if (!(w0VarX instanceof se.q)) {
            throw new j0();
        }
        se.q qVar = (se.q) w0VarX;
        a0 a0Var2 = qVar.f19978b;
        a0 a0VarZ2 = a0Var2.z(false);
        if (u0.f(a0Var2)) {
            a0VarZ2 = new f(a0VarZ2);
        }
        a0 a0Var3 = qVar.f19979c;
        a0 a0VarZ3 = a0Var3.z(false);
        if (u0.f(a0Var3)) {
            a0VarZ3 = new f(a0VarZ3);
        }
        return se.c.I(se.c.g(a0VarZ2, a0VarZ3), se.c.h(w0VarX));
    }

    @Override // se.j
    public final boolean k() {
        return true;
    }

    @Override // se.m, se.w
    public final boolean u() {
        return false;
    }
}
