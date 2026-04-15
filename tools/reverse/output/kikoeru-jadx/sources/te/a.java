package te;

import se.a0;
import se.j0;
import se.r0;
import se.x0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class a extends se.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b f20722a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r0 f20723b;

    public a(b bVar, r0 r0Var) {
        this.f20722a = bVar;
        this.f20723b = r0Var;
    }

    @Override // se.c
    public final ve.e F(j0 j0Var, ve.d dVar) {
        jc.l.e(j0Var, "state");
        jc.l.e(dVar, "type");
        b bVar = this.f20722a;
        a0 a0VarI0 = bVar.I0(this.f20723b.g(bVar.v0(dVar), x0.INVARIANT));
        jc.l.b(a0VarI0);
        return a0VarI0;
    }
}
