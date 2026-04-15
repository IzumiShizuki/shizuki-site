package ya;

import java.util.Collection;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class b0 extends k0 {
    @Override // ya.k0
    public final d0 d() {
        throw new AssertionError("should never be called");
    }

    @Override // ya.k0
    /* JADX INFO: renamed from: e */
    public final d0 values() {
        z0 z0Var = ((z0) this).f26083h;
        m0 m0Var = z0Var.f26009b;
        if (m0Var != null) {
            return m0Var;
        }
        d1 d1VarC = z0Var.c();
        z0Var.f26009b = d1VarC;
        return d1VarC;
    }

    @Override // ya.k0, java.util.Map
    public final Collection values() {
        z0 z0Var = ((z0) this).f26083h;
        m0 m0Var = z0Var.f26009b;
        if (m0Var != null) {
            return m0Var;
        }
        d1 d1VarC = z0Var.c();
        z0Var.f26009b = d1VarC;
        return d1VarC;
    }
}
