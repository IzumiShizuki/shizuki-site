package xc;

import pc.u;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class e implements bf.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f24919a = new e();

    public static yc.e a(yc.e eVar) {
        be.d dVarG = ee.e.g(eVar);
        String str = d.f24905a;
        be.c cVar = (be.c) d.f24915k.get(dVarG);
        if (cVar != null) {
            return ie.d.e(eVar).j(cVar);
        }
        throw new IllegalArgumentException("Given class " + eVar + " is not a read-only collection");
    }

    public static yc.e b(be.c cVar, vc.i iVar) {
        jc.l.e(iVar, "builtIns");
        String str = d.f24905a;
        be.b bVar = (be.b) d.f24912h.get(cVar.f2744a);
        if (bVar != null) {
            return iVar.j(bVar.a());
        }
        return null;
    }

    @Override // bf.b
    public Iterable d(Object obj) {
        u[] uVarArr = l.f24942h;
        return ((yc.c) obj).a().A();
    }
}
