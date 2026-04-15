package hb;

import java.lang.reflect.Field;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class p extends o {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gb.o f8337b;

    public p(gb.o oVar, q qVar) {
        super(qVar);
        this.f8337b = oVar;
    }

    @Override // hb.o
    public final Object c() {
        return this.f8337b.k();
    }

    @Override // hb.o
    public final void e(Object obj, mb.a aVar, n nVar) throws IllegalAccessException {
        Field field = nVar.f8329b;
        Object objA = nVar.f8333f.a(aVar);
        if (objA == null && nVar.f8334g) {
            return;
        }
        if (nVar.f8335h) {
            throw new eb.p(j2.h0.x("Cannot set value of 'static final' ", jb.c.d(field, false)));
        }
        field.set(obj, objA);
    }

    @Override // hb.o
    public final Object d(Object obj) {
        return obj;
    }
}
