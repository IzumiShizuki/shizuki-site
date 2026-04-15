package androidx.lifecycle;

import java.util.HashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class h implements v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f771a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f772b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f773c;

    public h(f fVar, v vVar) {
        jc.l.e(fVar, "defaultLifecycleObserver");
        this.f772b = fVar;
        this.f773c = vVar;
    }

    @Override // androidx.lifecycle.v
    public final void i(x xVar, o oVar) {
        switch (this.f771a) {
            case 0:
                f fVar = (f) this.f772b;
                switch (g.f770a[oVar.ordinal()]) {
                    case 1:
                        fVar.g(xVar);
                        break;
                    case 2:
                        fVar.q(xVar);
                        break;
                    case 3:
                        fVar.b(xVar);
                        break;
                    case 4:
                        fVar.k(xVar);
                        break;
                    case 5:
                        fVar.n(xVar);
                        break;
                    case 6:
                        fVar.o(xVar);
                        break;
                    case 7:
                        throw new IllegalArgumentException("ON_ANY must not been send by anybody");
                    default:
                        throw new ce.j0();
                }
                v vVar = (v) this.f773c;
                if (vVar != null) {
                    vVar.i(xVar, oVar);
                    return;
                }
                return;
            case 1:
                if (oVar == o.ON_START) {
                    ((q) this.f772b).q1(this);
                    ((v2.e) this.f773c).z();
                    return;
                }
                return;
            default:
                HashMap map = ((b) this.f773c).f752a;
                List list = (List) map.get(oVar);
                Object obj = this.f772b;
                b.a(list, xVar, oVar, obj);
                b.a((List) map.get(o.ON_ANY), xVar, oVar, obj);
                return;
        }
    }

    public h(w wVar) {
        this.f772b = wVar;
        d dVar = d.f756c;
        Class<?> cls = wVar.getClass();
        b bVar = (b) dVar.f757a.get(cls);
        this.f773c = bVar == null ? dVar.a(cls, null) : bVar;
    }

    public h(q qVar, v2.e eVar) {
        this.f772b = qVar;
        this.f773c = eVar;
    }
}
