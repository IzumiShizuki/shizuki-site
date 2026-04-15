package wc;

import bd.j0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import q.t0;
import se.f0;
import se.h0;
import vb.n;
import vb.r;
import vc.o;
import yc.n0;
import yc.q0;
import yc.v;
import yc.y;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class b extends se.b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c f23493c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar) {
        super(cVar.f23496e);
        this.f23493c = cVar;
    }

    @Override // se.f
    public final Collection b() {
        List listX;
        Iterable iterableW;
        c cVar = this.f23493c;
        int i10 = cVar.f23499h;
        k kVar = cVar.f23498g;
        g gVar = g.f23505c;
        if (jc.l.a(kVar, gVar)) {
            listX = ud.b.w(c.f23494l);
        } else if (jc.l.a(kVar, h.f23506c)) {
            listX = ud.b.x(c.f23495m, new be.b(o.f22908k, gVar.a(i10)));
        } else {
            j jVar = j.f23508c;
            if (jc.l.a(kVar, jVar)) {
                listX = ud.b.w(c.f23494l);
            } else {
                if (!jc.l.a(kVar, i.f23507c)) {
                    int i11 = cf.a.f3993a;
                    throw new IllegalStateException("should not be called");
                }
                listX = ud.b.x(c.f23495m, new be.b(o.f22903f, jVar.a(i10)));
            }
        }
        y yVarY = ((j0) cVar.f23497f).y();
        List<be.b> list = listX;
        ArrayList arrayList = new ArrayList(n.K(list, 10));
        for (be.b bVar : list) {
            yc.e eVarD = v.d(yVarY, bVar);
            if (eVarD == null) {
                throw new IllegalStateException(("Built-in class " + bVar + " not found").toString());
            }
            List list2 = cVar.f23502k;
            int size = eVarD.Q().o().size();
            jc.l.e(list2, "<this>");
            if (size < 0) {
                throw new IllegalArgumentException(t0.C(size, "Requested element count ", " is less than zero.").toString());
            }
            if (size == 0) {
                iterableW = r.f22819a;
            } else {
                int size2 = list2.size();
                if (size >= size2) {
                    iterableW = vb.m.G0(list2);
                } else if (size == 1) {
                    iterableW = ud.b.w(vb.m.h0(list2));
                } else {
                    ArrayList arrayList2 = new ArrayList(size);
                    if (list2 instanceof RandomAccess) {
                        for (int i12 = size2 - size; i12 < size2; i12++) {
                            arrayList2.add(list2.get(i12));
                        }
                    } else {
                        ListIterator listIterator = list2.listIterator(size2 - size);
                        while (listIterator.hasNext()) {
                            arrayList2.add(listIterator.next());
                        }
                    }
                    iterableW = arrayList2;
                }
            }
            Iterable iterable = iterableW;
            ArrayList arrayList3 = new ArrayList(n.K(iterable, 10));
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                arrayList3.add(new f0(((q0) it.next()).E()));
            }
            h0.f19950b.getClass();
            arrayList.add(se.c.u(h0.f19951c, eVarD, arrayList3));
        }
        return vb.m.G0(arrayList);
    }

    @Override // se.f
    public final n0 d() {
        return n0.f26123c;
    }

    @Override // se.b, se.k0
    public final yc.h h() {
        return this.f23493c;
    }

    @Override // se.k0
    public final boolean j() {
        return true;
    }

    @Override // se.b
    /* JADX INFO: renamed from: m */
    public final yc.e h() {
        return this.f23493c;
    }

    @Override // se.k0
    public final List o() {
        return this.f23493c.f23502k;
    }

    public final String toString() {
        return this.f23493c.toString();
    }
}
