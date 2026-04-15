package f7;

import java.util.Map;
import o.k0;
import x0.e0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class m implements e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6773a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f6774b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f6775c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f6776d;

    public /* synthetic */ m(Object obj, Object obj2, Object obj3, int i10) {
        this.f6773a = i10;
        this.f6774b = obj;
        this.f6775c = obj2;
        this.f6776d = obj3;
    }

    @Override // x0.e0
    public final void a() {
        switch (this.f6773a) {
            case 0:
                q qVar = (q) this.f6774b;
                e7.j jVar = (e7.j) this.f6775c;
                qVar.b().c(jVar);
                ((h1.s) this.f6776d).remove(jVar);
                break;
            case 1:
                g1.e eVar = (g1.e) this.f6774b;
                k0 k0Var = eVar.f7140b;
                Object obj = this.f6775c;
                Object objK = k0Var.k(obj);
                g1.j jVar2 = (g1.j) this.f6776d;
                if (objK == jVar2) {
                    Map map = eVar.f7139a;
                    Map mapC = jVar2.c();
                    if (!mapC.isEmpty()) {
                        map.put(obj, mapC);
                    } else {
                        map.remove(obj);
                    }
                }
                break;
            default:
                h1.s sVar = (h1.s) this.f6776d;
                Object obj2 = this.f6774b;
                sVar.remove(obj2);
                ((q.m) this.f6775c).f17363d.k(obj2);
                break;
        }
    }

    public m(h1.s sVar, Object obj, q.m mVar) {
        this.f6773a = 2;
        this.f6776d = sVar;
        this.f6774b = obj;
        this.f6775c = mVar;
    }
}
