package ka;

import na.v;
import ub.a0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements ic.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11245a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f11246b;

    public /* synthetic */ c(g gVar, int i10) {
        this.f11245a = i10;
        this.f11246b = gVar;
    }

    @Override // ic.a
    public final Object b() {
        int i10 = this.f11245a;
        a0 a0Var = a0.f21526a;
        g gVar = this.f11246b;
        switch (i10) {
            case 0:
                j.c(gVar);
                break;
            case 1:
                gVar.f11259d.a(gVar);
                j.c(gVar);
                break;
            case 2:
                gVar.getClass();
                j.c(gVar);
                break;
            case 3:
                j.c(gVar);
                break;
            case 4:
                j.c(gVar);
                break;
            case 5:
                gVar.f11259d.a(gVar);
                j.c(gVar);
                break;
            default:
                v.f15761a.getClass();
                long jCurrentTimeMillis = System.currentTimeMillis();
                int i11 = ff.a.f7057d;
                long jD = ff.a.d(ff.f.m(7, ff.c.DAYS)) + jCurrentTimeMillis;
                v.f15764d.e(Long.valueOf(jD), v.f15762b[1]);
                j.c(gVar);
                break;
        }
        return a0Var;
    }
}
