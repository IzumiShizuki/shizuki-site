package hb;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class c extends eb.z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8305a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f8306b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f8307c;

    public c(eb.m mVar, Type type, eb.z zVar, gb.o oVar) {
        this.f8306b = new j(mVar, zVar, type);
        this.f8307c = oVar;
    }

    @Override // eb.z
    public final Object a(mb.a aVar) throws IOException {
        switch (this.f8305a) {
            case 0:
                if (aVar.h0() == 9) {
                    aVar.c0();
                    return null;
                }
                Collection collection = (Collection) ((gb.o) this.f8307c).k();
                aVar.b();
                while (aVar.y()) {
                    collection.add(((eb.z) ((j) this.f8306b).f8319c).a(aVar));
                }
                aVar.n();
                return collection;
            default:
                Class cls = (Class) this.f8306b;
                Object objA = ((q0) this.f8307c).f8343c.a(aVar);
                if (objA == null || cls.isInstance(objA)) {
                    return objA;
                }
                throw new eb.t("Expected a " + cls.getName() + " but was " + objA.getClass().getName() + "; at path " + aVar.u(true));
        }
    }

    @Override // eb.z
    public final void b(mb.b bVar, Object obj) throws IOException {
        switch (this.f8305a) {
            case 0:
                Collection collection = (Collection) obj;
                if (collection != null) {
                    bVar.g();
                    Iterator it = collection.iterator();
                    while (it.hasNext()) {
                        ((j) this.f8306b).b(bVar, it.next());
                    }
                    bVar.n();
                } else {
                    bVar.y();
                }
                break;
            default:
                ((q0) this.f8307c).f8343c.b(bVar, obj);
                break;
        }
    }

    public c(q0 q0Var, Class cls) {
        this.f8307c = q0Var;
        this.f8306b = cls;
    }
}
