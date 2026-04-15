package hb;

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public class n0 extends eb.z {
    public static eb.o c(mb.a aVar, int i10) throws IOException {
        int iB = w0.c.b(i10);
        if (iB == 5) {
            return new eb.s(aVar.f0());
        }
        if (iB == 6) {
            return new eb.s(new gb.i(aVar.f0()));
        }
        if (iB == 7) {
            return new eb.s(Boolean.valueOf(aVar.G()));
        }
        if (iB != 8) {
            throw new IllegalStateException("Unexpected token: ".concat(j2.h0.A(i10)));
        }
        aVar.c0();
        return eb.q.f6469a;
    }

    public static void d(mb.b bVar, eb.o oVar) throws IOException {
        if (oVar == null || (oVar instanceof eb.q)) {
            bVar.y();
            return;
        }
        boolean z10 = oVar instanceof eb.s;
        if (z10) {
            if (!z10) {
                throw new IllegalStateException("Not a JSON Primitive: " + oVar);
            }
            eb.s sVar = (eb.s) oVar;
            Serializable serializable = sVar.f6471a;
            if (serializable instanceof Number) {
                bVar.X(sVar.i());
                return;
            } else if (serializable instanceof Boolean) {
                bVar.c0(serializable instanceof Boolean ? ((Boolean) serializable).booleanValue() : Boolean.parseBoolean(sVar.j()));
                return;
            } else {
                bVar.Y(sVar.j());
                return;
            }
        }
        boolean z11 = oVar instanceof eb.n;
        if (z11) {
            bVar.g();
            if (!z11) {
                throw new IllegalStateException("Not a JSON Array: " + oVar);
            }
            Iterator it = ((eb.n) oVar).f6468a.iterator();
            while (it.hasNext()) {
                d(bVar, (eb.o) it.next());
            }
            bVar.n();
            return;
        }
        boolean z12 = oVar instanceof eb.r;
        if (!z12) {
            throw new IllegalArgumentException("Couldn't write " + oVar.getClass());
        }
        bVar.i();
        if (!z12) {
            throw new IllegalStateException("Not a JSON Object: " + oVar);
        }
        Iterator it2 = ((gb.l) ((eb.r) oVar).f6470a.entrySet()).iterator();
        while (((gb.k) it2).hasNext()) {
            gb.m mVarB = ((gb.k) it2).b();
            bVar.q((String) mVarB.getKey());
            d(bVar, (eb.o) mVarB.getValue());
        }
        bVar.o();
    }

    @Override // eb.z
    public final Object a(mb.a aVar) throws IOException {
        eb.o nVar;
        eb.o nVar2;
        int iH0 = aVar.h0();
        int iB = w0.c.b(iH0);
        if (iB == 0) {
            aVar.b();
            nVar = new eb.n();
        } else if (iB != 2) {
            nVar = null;
        } else {
            aVar.g();
            nVar = new eb.r();
        }
        if (nVar == null) {
            return c(aVar, iH0);
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        while (true) {
            if (aVar.y()) {
                String strX = nVar instanceof eb.r ? aVar.X() : null;
                int iH02 = aVar.h0();
                int iB2 = w0.c.b(iH02);
                if (iB2 == 0) {
                    aVar.b();
                    nVar2 = new eb.n();
                } else if (iB2 != 2) {
                    nVar2 = null;
                } else {
                    aVar.g();
                    nVar2 = new eb.r();
                }
                boolean z10 = nVar2 != null;
                if (nVar2 == null) {
                    nVar2 = c(aVar, iH02);
                }
                if (nVar instanceof eb.n) {
                    ((eb.n) nVar).f6468a.add(nVar2);
                } else {
                    ((eb.r) nVar).f6470a.put(strX, nVar2);
                }
                if (z10) {
                    arrayDeque.addLast(nVar);
                    nVar = nVar2;
                }
            } else {
                if (nVar instanceof eb.n) {
                    aVar.n();
                } else {
                    aVar.o();
                }
                if (arrayDeque.isEmpty()) {
                    return nVar;
                }
                nVar = (eb.o) arrayDeque.removeLast();
            }
        }
    }

    @Override // eb.z
    public final /* bridge */ /* synthetic */ void b(mb.b bVar, Object obj) throws IOException {
        d(bVar, (eb.o) obj);
    }
}
