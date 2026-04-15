package df;

import androidx.lifecycle.n0;
import da.z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import pc.f0;
import q.t0;

/* JADX INFO: loaded from: classes.dex */
public abstract class m extends f0 {
    public static k W(Iterator it) {
        jc.l.e(it, "<this>");
        return new a(new n(0, it));
    }

    public static int X(k kVar) {
        Iterator it = kVar.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            it.next();
            i10++;
            if (i10 < 0) {
                throw new ArithmeticException("Count overflow has happened.");
            }
        }
        return i10;
    }

    public static k Y(k kVar, int i10) {
        if (i10 >= 0) {
            return i10 == 0 ? kVar : kVar instanceof d ? ((d) kVar).a(i10) : new c(kVar, i10);
        }
        throw new IllegalArgumentException(t0.C(i10, "Requested element count ", " is less than zero.").toString());
    }

    public static final i Z(k kVar) {
        d9.i iVar = new d9.i(9);
        if (!(kVar instanceof r)) {
            return new i(kVar, new g1.d(1), iVar);
        }
        r rVar = (r) kVar;
        return new i(rVar.f6007a, rVar.f6008b, iVar);
    }

    public static k a0(ic.a aVar) {
        return new a(new j(aVar, new z(2, aVar)));
    }

    public static k b0(Object obj, ic.k kVar) {
        return obj == null ? g.f5986a : new j(new n0(7, obj), kVar);
    }

    public static String c0(k kVar, String str) {
        jc.l.e(kVar, "<this>");
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "");
        int i10 = 0;
        for (Object obj : kVar) {
            i10++;
            if (i10 > 1) {
                sb.append((CharSequence) str);
            }
            a.a.s(sb, obj, null);
        }
        sb.append((CharSequence) "");
        return sb.toString();
    }

    public static Object d0(k kVar) {
        Iterator it = kVar.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException("Sequence is empty.");
        }
        Object next = it.next();
        while (it.hasNext()) {
            next = it.next();
        }
        return next;
    }

    public static r e0(k kVar, ic.k kVar2) {
        jc.l.e(kVar2, "transform");
        return new r(kVar, kVar2);
    }

    public static h f0(k kVar, ic.k kVar2) {
        return new h(new r(kVar, kVar2), false, new d9.i(10));
    }

    public static List g0(k kVar) {
        Iterator it = kVar.iterator();
        if (!it.hasNext()) {
            return vb.r.f22819a;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return ud.b.w(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }
}
