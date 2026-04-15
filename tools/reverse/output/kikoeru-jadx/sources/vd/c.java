package vd;

import ge.f;
import ud.o;
import ud.p;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class c implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22942a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f22943b;

    public /* synthetic */ c(e eVar, int i10) {
        this.f22942a = i10;
        this.f22943b = eVar;
    }

    @Override // ud.o, ud.p
    public final void b() {
        int i10 = this.f22942a;
    }

    @Override // ud.o
    public final void d(be.e eVar, Object obj) {
        switch (this.f22942a) {
            case 0:
                String strB = eVar.b();
                boolean zEquals = "k".equals(strB);
                e eVar2 = this.f22943b;
                if (!zEquals) {
                    if (!"mv".equals(strB)) {
                        if (!"xs".equals(strB)) {
                            if (!"xi".equals(strB)) {
                                "pn".equals(strB);
                            } else if (obj instanceof Integer) {
                                eVar2.f22950c = ((Integer) obj).intValue();
                            }
                        } else if (obj instanceof String) {
                            String str = (String) obj;
                            if (!str.isEmpty()) {
                                eVar2.f22949b = str;
                            }
                        }
                    } else if (obj instanceof int[]) {
                        eVar2.f22948a = (int[]) obj;
                    }
                } else if (obj instanceof Integer) {
                    a.f22930b.getClass();
                    a aVar = (a) a.f22931c.get((Integer) obj);
                    if (aVar == null) {
                        aVar = a.f22932d;
                    }
                    eVar2.f22954g = aVar;
                }
                break;
            case 1:
                break;
            default:
                String strB2 = eVar.b();
                boolean zEquals2 = "version".equals(strB2);
                e eVar3 = this.f22943b;
                if (!zEquals2) {
                    if ("multifileClassName".equals(strB2)) {
                        eVar3.f22949b = obj instanceof String ? (String) obj : null;
                    }
                } else if (obj instanceof int[]) {
                    eVar3.f22948a = (int[]) obj;
                }
                break;
        }
    }

    @Override // ud.o
    public final void h(be.e eVar, f fVar) {
        int i10 = this.f22942a;
    }

    @Override // ud.o
    public final void k(be.e eVar, be.b bVar, be.e eVar2) {
        int i10 = this.f22942a;
    }

    @Override // ud.o
    public final p l(be.e eVar) {
        switch (this.f22942a) {
            case 0:
                String strB = eVar.b();
                if ("d1".equals(strB)) {
                    return new b(this, 0);
                }
                if ("d2".equals(strB)) {
                    return new b(this, 1);
                }
                return null;
            case 1:
                if ("b".equals(eVar.b())) {
                    return new b(this, 2);
                }
                return null;
            default:
                String strB2 = eVar.b();
                if ("data".equals(strB2) || "filePartClassNames".equals(strB2)) {
                    return new d(this, 0);
                }
                if ("strings".equals(strB2)) {
                    return new d(this, 1);
                }
                return null;
        }
    }

    @Override // ud.o
    public final o q(be.b bVar, be.e eVar) {
        switch (this.f22942a) {
        }
        return null;
    }

    private final void g() {
    }

    private final void i() {
    }

    private final void j() {
    }

    private final void a(be.e eVar, Object obj) {
    }

    private final void c(be.e eVar, f fVar) {
    }

    private final void e(be.e eVar, f fVar) {
    }

    private final void f(be.e eVar, f fVar) {
    }

    private final void m(be.e eVar, be.b bVar, be.e eVar2) {
    }

    private final void n(be.e eVar, be.b bVar, be.e eVar2) {
    }

    private final void o(be.e eVar, be.b bVar, be.e eVar2) {
    }
}
