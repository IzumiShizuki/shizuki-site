package se;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class t extends p0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final yc.q0[] f19987b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n0[] f19988c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f19989d;

    public t(yc.q0[] q0VarArr, n0[] n0VarArr, boolean z10) {
        jc.l.e(q0VarArr, "parameters");
        jc.l.e(n0VarArr, "arguments");
        this.f19987b = q0VarArr;
        this.f19988c = n0VarArr;
        this.f19989d = z10;
    }

    @Override // se.p0
    public final boolean b() {
        return this.f19989d;
    }

    @Override // se.p0
    public final n0 d(w wVar) {
        yc.h hVarH = wVar.t().h();
        yc.q0 q0Var = hVarH instanceof yc.q0 ? (yc.q0) hVarH : null;
        if (q0Var != null) {
            int index = q0Var.getIndex();
            yc.q0[] q0VarArr = this.f19987b;
            if (index < q0VarArr.length && jc.l.a(q0VarArr[index].Q(), q0Var.Q())) {
                return this.f19988c[index];
            }
        }
        return null;
    }

    @Override // se.p0
    public final boolean e() {
        return this.f19988c.length == 0;
    }
}
