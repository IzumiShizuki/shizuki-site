package hb;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class o extends eb.z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f8336a;

    public o(q qVar) {
        this.f8336a = qVar;
    }

    @Override // eb.z
    public final Object a(mb.a aVar) throws IOException {
        if (aVar.h0() == 9) {
            aVar.c0();
            return null;
        }
        Object objC = c();
        Map map = this.f8336a.f8339a;
        try {
            aVar.g();
            while (aVar.y()) {
                n nVar = (n) map.get(aVar.X());
                if (nVar == null) {
                    aVar.n0();
                } else {
                    e(objC, aVar, nVar);
                }
            }
            aVar.o();
            return d(objC);
        } catch (IllegalAccessException e10) {
            pc.f0 f0Var = jb.c.f10806a;
            throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.11.0). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e10);
        } catch (IllegalStateException e11) {
            throw new eb.t(e11);
        }
    }

    @Override // eb.z
    public final void b(mb.b bVar, Object obj) throws IOException {
        if (obj == null) {
            bVar.y();
            return;
        }
        bVar.i();
        try {
            Iterator it = this.f8336a.f8340b.iterator();
            while (it.hasNext()) {
                ((n) it.next()).a(bVar, obj);
            }
            bVar.o();
        } catch (IllegalAccessException e10) {
            pc.f0 f0Var = jb.c.f10806a;
            throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.11.0). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e10);
        }
    }

    public abstract Object c();

    public abstract Object d(Object obj);

    public abstract void e(Object obj, mb.a aVar, n nVar);
}
