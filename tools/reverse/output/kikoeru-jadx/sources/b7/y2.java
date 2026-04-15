package b7;

import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class y2 implements p3, p4.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2208a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f2209b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f2210c;

    public /* synthetic */ y2(Object obj, boolean z10, int i10) {
        this.f2208a = i10;
        this.f2210c = obj;
        this.f2209b = z10;
    }

    @Override // p4.g
    public void accept(Object obj) {
        m4.d dVar = (m4.d) this.f2210c;
        v4.v vVar = (v4.v) ((z3) obj).f2227a;
        v4.d dVar2 = vVar.f22700z;
        p4.n nVar = vVar.f22683m;
        vVar.m2();
        m4.d dVar3 = vVar.T;
        int i10 = p4.c0.f16548a;
        if (!Objects.equals(dVar3, dVar)) {
            vVar.T = dVar;
            vVar.a2(1, 3, dVar);
            nVar.c(20, new androidx.media3.exoplayer.offline.g(19, dVar));
        }
        dVar2.b(this.f2209b ? dVar : null);
        vVar.f22679i.e(dVar);
        boolean zR = vVar.r();
        int iD = dVar2.d(vVar.i(), zR);
        vVar.j2(iD, iD == -1 ? 2 : 1, zR);
        nVar.b();
    }

    @Override // b7.p3
    public Object h(c2 c2Var, t1 t1Var, int i10) {
        switch (this.f2208a) {
            case 0:
                ya.a1 a1VarU = ya.i0.u((m4.i0) this.f2210c);
                boolean z10 = this.f2209b;
                return c2Var.p(t1Var, a1VarU, z10 ? -1 : c2Var.f1693t.G(), z10 ? -9223372036854775807L : c2Var.f1693t.M());
            default:
                List list = (List) this.f2210c;
                boolean z11 = this.f2209b;
                return c2Var.p(t1Var, list, z11 ? -1 : c2Var.f1693t.G(), z11 ? -9223372036854775807L : c2Var.f1693t.M());
        }
    }
}
