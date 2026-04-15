package z5;

import r5.a0;
import r5.b0;
import r5.c0;
import r5.u;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class c extends u {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b0 f26472b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ bh.a f26473c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(bh.a aVar, b0 b0Var, b0 b0Var2) {
        super(b0Var);
        this.f26473c = aVar;
        this.f26472b = b0Var2;
    }

    @Override // r5.u, r5.b0
    public final a0 k(long j10) {
        a0 a0VarK = this.f26472b.k(j10);
        c0 c0Var = a0VarK.f18750a;
        long j11 = c0Var.f18784a;
        long j12 = c0Var.f18785b;
        long j13 = this.f26473c.f3007b;
        c0 c0Var2 = new c0(j11, j12 + j13);
        c0 c0Var3 = a0VarK.f18751b;
        return new a0(c0Var2, new c0(c0Var3.f18784a, c0Var3.f18785b + j13));
    }
}
