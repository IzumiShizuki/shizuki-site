package s;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class c1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final x0.z f19118a = new x0.z(k.f19196f);

    public static final f a(x0.o oVar) {
        oVar.W(282942128);
        g gVar = (g) oVar.j(f19118a);
        if (gVar == null) {
            oVar.p(false);
            return null;
        }
        boolean zF = oVar.f(gVar);
        Object objK = oVar.K();
        if (zF || objK == x0.k.f24334a) {
            Object fVar = new f(gVar.f19153a, gVar.f19154b, gVar.f19155c, gVar.f19156d);
            oVar.h0(fVar);
            objK = fVar;
        }
        f fVar2 = (f) objK;
        oVar.p(false);
        return fVar2;
    }
}
