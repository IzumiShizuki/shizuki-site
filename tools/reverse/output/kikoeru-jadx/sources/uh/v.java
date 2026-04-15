package uh;

import ce.j0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class v extends jc.m implements ic.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f22063b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a0.g0 f22064c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v(a0.g0 g0Var, int i10) {
        super(0);
        this.f22063b = i10;
        this.f22064c = g0Var;
    }

    @Override // ic.a
    public final Object b() {
        long jC;
        switch (this.f22063b) {
            case 0:
                a0.t tVarG = this.f22064c.g();
                int iOrdinal = tVarG.f128o.ordinal();
                if (iOrdinal == 0) {
                    jC = tVarG.c() & 4294967295L;
                } else {
                    if (iOrdinal != 1) {
                        throw new j0();
                    }
                    jC = tVarG.c() >> 32;
                }
                return Float.valueOf(((int) jC) * 0.05f);
            default:
                return this.f22064c.g().f128o;
        }
    }
}
