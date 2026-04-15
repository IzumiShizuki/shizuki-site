package uh;

import ce.j0;
import u.e1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a0.u f22068a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e1 f22069b;

    public x(a0.u uVar, e1 e1Var) {
        this.f22068a = uVar;
        this.f22069b = e1Var;
    }

    public final int a() {
        return this.f22068a.f131a;
    }

    public final Object b() {
        return this.f22068a.f139i;
    }

    public final long c() {
        return ua.l.Q(this.f22069b, this.f22068a.f143m);
    }

    public final long d() {
        int i10 = this.f22068a.f144n;
        e1 e1Var = this.f22069b;
        jc.l.e(e1Var, "orientation");
        int iOrdinal = e1Var.ordinal();
        if (iOrdinal == 0) {
            return gh.g.c(0, i10);
        }
        if (iOrdinal == 1) {
            return gh.g.c(i10, 0);
        }
        throw new j0();
    }
}
