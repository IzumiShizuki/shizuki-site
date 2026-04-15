package hb;

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class m extends eb.z {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final k f8325c = new k(1, eb.y.f6472a);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final eb.m f8326a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final eb.y f8327b;

    public m(eb.m mVar, eb.y yVar) {
        this.f8326a = mVar;
        this.f8327b = yVar;
    }

    @Override // eb.z
    public final Object a(mb.a aVar) throws IOException {
        Object arrayList;
        Serializable arrayList2;
        int iH0 = aVar.h0();
        int iB = w0.c.b(iH0);
        if (iB == 0) {
            aVar.b();
            arrayList = new ArrayList();
        } else if (iB != 2) {
            arrayList = null;
        } else {
            aVar.g();
            arrayList = new gb.n(true);
        }
        if (arrayList == null) {
            return c(aVar, iH0);
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        while (true) {
            if (aVar.y()) {
                String strX = arrayList instanceof Map ? aVar.X() : null;
                int iH02 = aVar.h0();
                int iB2 = w0.c.b(iH02);
                if (iB2 == 0) {
                    aVar.b();
                    arrayList2 = new ArrayList();
                } else if (iB2 != 2) {
                    arrayList2 = null;
                } else {
                    aVar.g();
                    arrayList2 = new gb.n(true);
                }
                boolean z10 = arrayList2 != null;
                if (arrayList2 == null) {
                    arrayList2 = c(aVar, iH02);
                }
                if (arrayList instanceof List) {
                    ((List) arrayList).add(arrayList2);
                } else {
                    ((Map) arrayList).put(strX, arrayList2);
                }
                if (z10) {
                    arrayDeque.addLast(arrayList);
                    arrayList = arrayList2;
                }
            } else {
                if (arrayList instanceof List) {
                    aVar.n();
                } else {
                    aVar.o();
                }
                if (arrayDeque.isEmpty()) {
                    return arrayList;
                }
                arrayList = arrayDeque.removeLast();
            }
        }
    }

    @Override // eb.z
    public final void b(mb.b bVar, Object obj) throws IOException {
        if (obj == null) {
            bVar.y();
            return;
        }
        Class<?> cls = obj.getClass();
        eb.m mVar = this.f8326a;
        mVar.getClass();
        eb.z zVarC = mVar.c(new lb.a(cls));
        if (!(zVarC instanceof m)) {
            zVarC.b(bVar, obj);
        } else {
            bVar.i();
            bVar.o();
        }
    }

    public final Serializable c(mb.a aVar, int i10) throws IOException {
        int iB = w0.c.b(i10);
        if (iB == 5) {
            return aVar.f0();
        }
        if (iB == 6) {
            return this.f8327b.a(aVar);
        }
        if (iB == 7) {
            return Boolean.valueOf(aVar.G());
        }
        if (iB != 8) {
            throw new IllegalStateException("Unexpected token: ".concat(j2.h0.A(i10)));
        }
        aVar.c0();
        return null;
    }
}
