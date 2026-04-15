package ig;

import fa.j;
import gg.d;
import gg.e;
import jc.l;
import jc.z;
import pc.v;
import vb.m;
import xf.c;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class b extends gg.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f9523b;

    public /* synthetic */ b(int i10) {
        this.f9523b = i10;
    }

    @Override // gg.a
    public final Object a(hg.b bVar) {
        Object objA;
        switch (this.f9523b) {
            case 0:
                gg.a aVar = this.f7542a;
                if (aVar == null) {
                    throw new IllegalStateException("ConvertInterceptor as last interceptor");
                }
                hg.a aVarB = bVar.b();
                v vVar = bVar.f8629d;
                aVarB.getClass();
                l.e(vVar, "type");
                e.f7548f0.getClass();
                if (m.S(d.f7547b, vVar.c())) {
                    return aVar.a(bVar);
                }
                aVarB.f8624b.get(vVar);
                Object objA2 = aVar.a(new hg.b(new j(bVar, 3), bVar.f8627b, bVar.f8628c, z.a(String.class)));
                if (!(objA2 instanceof String)) {
                    return objA2;
                }
                Object objA3 = ((c) aVarB.f8625c.f1208b).a((String) objA2, n7.e.B(vVar));
                l.c(objA3, "null cannot be cast to non-null type T of loli.ball.okkv.KotlinxSerializationConverter");
                return objA3;
            default:
                gg.a aVar2 = this.f7542a;
                return (aVar2 == null || (objA = aVar2.a(bVar)) == null) ? bVar.f8627b : objA;
        }
    }

    @Override // gg.a
    public final void b(hg.b bVar, Object obj) {
        switch (this.f9523b) {
            case 0:
                gg.a aVar = this.f7542a;
                if (aVar == null) {
                    throw new IllegalStateException("ConvertInterceptor as last interceptor");
                }
                hg.a aVarB = bVar.b();
                v vVar = bVar.f8629d;
                aVarB.getClass();
                l.e(vVar, "type");
                e.f7548f0.getClass();
                if (m.S(d.f7547b, vVar.c())) {
                    aVar.b(bVar, obj);
                    return;
                }
                aVarB.f8624b.get(vVar);
                if (obj != null) {
                    obj = ((c) aVarB.f8625c.f1208b).b(n7.e.B(vVar), obj);
                }
                aVar.b(new hg.b(new j(bVar, 3), bVar.f8627b, bVar.f8628c, z.a(String.class)), obj);
                return;
            default:
                gg.a aVar2 = this.f7542a;
                if (aVar2 != null) {
                    aVar2.b(bVar, obj);
                    return;
                }
                return;
        }
    }
}
