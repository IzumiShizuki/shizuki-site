package bd;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class b implements ic.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2545a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f2546b;

    public /* synthetic */ b(c cVar, int i10) {
        this.f2545a = i10;
        this.f2546b = cVar;
    }

    @Override // ic.a
    public final Object b() {
        int i10 = this.f2545a;
        c cVar = this.f2546b;
        switch (i10) {
            case 0:
                le.o oVarN0 = cVar.N0();
                a aVar = new a(0, this);
                ue.i iVar = se.u0.f19993a;
                if (ue.l.f(cVar)) {
                    return ue.l.c(ue.k.UNABLE_TO_SUBSTITUTE_TYPE, cVar.toString());
                }
                se.k0 k0VarQ = cVar.Q();
                if (k0VarQ == null) {
                    se.u0.a(12);
                    throw null;
                }
                if (oVarN0 == null) {
                    se.u0.a(13);
                    throw null;
                }
                List listD = se.u0.d(k0VarQ.o());
                se.h0.f19950b.getClass();
                return se.c.x(se.h0.f19951c, k0VarQ, listD, false, oVarN0, aVar);
            case 1:
                return new le.i(cVar.N0());
            default:
                return new a0(cVar);
        }
    }
}
