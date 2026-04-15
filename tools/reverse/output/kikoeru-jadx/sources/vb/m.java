package vb;

import j2.h0;
import java.io.IOException;
import java.util.AbstractCollection;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import java.util.Set;
import jc.c0;
import q.t0;

/* JADX INFO: loaded from: classes.dex */
public abstract class m extends p {
    public static List A0(List list, oc.d dVar) {
        jc.l.e(list, "<this>");
        jc.l.e(dVar, "indices");
        return dVar.isEmpty() ? r.f22819a : G0(list.subList(dVar.f16307a, dVar.f16308b + 1));
    }

    public static List B0(AbstractList abstractList) {
        jc.l.e(abstractList, "<this>");
        if (abstractList.size() <= 1) {
            return G0(abstractList);
        }
        Object[] array = abstractList.toArray(new Comparable[0]);
        Comparable[] comparableArr = (Comparable[]) array;
        jc.l.e(comparableArr, "<this>");
        if (comparableArr.length > 1) {
            Arrays.sort(comparableArr);
        }
        return l.c0(array);
    }

    public static List C0(Iterable iterable, Comparator comparator) {
        jc.l.e(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            List listI0 = I0(iterable);
            p.M(listI0, comparator);
            return listI0;
        }
        Collection collection = (Collection) iterable;
        if (collection.size() <= 1) {
            return G0(iterable);
        }
        Object[] array = collection.toArray(new Object[0]);
        l.K0(array, comparator);
        return l.c0(array);
    }

    public static List D0(Iterable iterable, int i10) {
        jc.l.e(iterable, "<this>");
        if (i10 < 0) {
            throw new IllegalArgumentException(t0.C(i10, "Requested element count ", " is less than zero.").toString());
        }
        if (i10 == 0) {
            return r.f22819a;
        }
        if (iterable instanceof Collection) {
            if (i10 >= ((Collection) iterable).size()) {
                return G0(iterable);
            }
            if (i10 == 1) {
                return ud.b.w(X(iterable));
            }
        }
        ArrayList arrayList = new ArrayList(i10);
        Iterator it = iterable.iterator();
        int i11 = 0;
        while (it.hasNext()) {
            arrayList.add(it.next());
            i11++;
            if (i11 == i10) {
                break;
            }
        }
        return ud.b.B(arrayList);
    }

    public static final void E0(Iterable iterable, AbstractCollection abstractCollection) {
        jc.l.e(iterable, "<this>");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            abstractCollection.add(it.next());
        }
    }

    public static int[] F0(Collection collection) {
        jc.l.e(collection, "<this>");
        int[] iArr = new int[collection.size()];
        Iterator it = collection.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            iArr[i10] = ((Number) it.next()).intValue();
            i10++;
        }
        return iArr;
    }

    public static List G0(Iterable iterable) {
        jc.l.e(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            return ud.b.B(I0(iterable));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return r.f22819a;
        }
        if (size != 1) {
            return H0(collection);
        }
        return ud.b.w(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
    }

    public static ArrayList H0(Collection collection) {
        jc.l.e(collection, "<this>");
        return new ArrayList(collection);
    }

    public static final List I0(Iterable iterable) {
        jc.l.e(iterable, "<this>");
        if (iterable instanceof Collection) {
            return H0((Collection) iterable);
        }
        ArrayList arrayList = new ArrayList();
        E0(iterable, arrayList);
        return arrayList;
    }

    public static Set J0(Iterable iterable) {
        jc.l.e(iterable, "<this>");
        if (iterable instanceof Collection) {
            return new LinkedHashSet((Collection) iterable);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        E0(iterable, linkedHashSet);
        return linkedHashSet;
    }

    public static Set K0(Iterable iterable) {
        jc.l.e(iterable, "<this>");
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size != 0) {
                if (size == 1) {
                    return ud.e.X(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
                }
                LinkedHashSet linkedHashSet = new LinkedHashSet(w.t(collection.size()));
                E0(iterable, linkedHashSet);
                return linkedHashSet;
            }
        } else {
            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
            E0(iterable, linkedHashSet2);
            int size2 = linkedHashSet2.size();
            if (size2 != 0) {
                return size2 != 1 ? linkedHashSet2 : ud.e.X(linkedHashSet2.iterator().next());
            }
        }
        return t.f22821a;
    }

    public static df.o L0(Iterable iterable) {
        jc.l.e(iterable, "<this>");
        return new df.o(3, new t9.f(4, iterable));
    }

    public static ArrayList M0(Iterable iterable, Iterable iterable2) {
        jc.l.e(iterable, "<this>");
        jc.l.e(iterable2, "other");
        Iterator it = iterable.iterator();
        Iterator it2 = iterable2.iterator();
        ArrayList arrayList = new ArrayList(Math.min(n.K(iterable, 10), n.K(iterable2, 10)));
        while (it.hasNext() && it2.hasNext()) {
            arrayList.add(new ub.k(it.next(), it2.next()));
        }
        return arrayList;
    }

    public static final int N(int i10, List list) {
        if (i10 >= 0 && i10 <= ud.b.r(list)) {
            return ud.b.r(list) - i10;
        }
        StringBuilder sbO = h0.o(i10, "Element index ", " must be in range [");
        sbO.append(new oc.d(0, ud.b.r(list), 1));
        sbO.append("].");
        throw new IndexOutOfBoundsException(sbO.toString());
    }

    public static final int O(int i10, List list) {
        if (i10 >= 0 && i10 <= list.size()) {
            return list.size() - i10;
        }
        StringBuilder sbO = h0.o(i10, "Position index ", " must be in range [");
        sbO.append(new oc.d(0, list.size(), 1));
        sbO.append("].");
        throw new IndexOutOfBoundsException(sbO.toString());
    }

    public static void P(Collection collection, Iterable iterable) {
        jc.l.e(collection, "<this>");
        jc.l.e(iterable, "elements");
        if (iterable instanceof Collection) {
            collection.addAll((Collection) iterable);
            return;
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            collection.add(it.next());
        }
    }

    public static ef.i Q(List list) {
        jc.l.e(list, "<this>");
        return new ef.i(list);
    }

    public static df.n R(Iterable iterable) {
        jc.l.e(iterable, "<this>");
        return new df.n(4, iterable);
    }

    public static boolean S(Iterable iterable, Object obj) {
        jc.l.e(iterable, "<this>");
        return iterable instanceof Collection ? ((Collection) iterable).contains(obj) : c0(iterable, obj) >= 0;
    }

    public static final Collection T(Iterable iterable) {
        jc.l.e(iterable, "<this>");
        return iterable instanceof Collection ? (Collection) iterable : G0(iterable);
    }

    public static List U(Iterable iterable) {
        jc.l.e(iterable, "<this>");
        return G0(J0(iterable));
    }

    public static List V(Iterable iterable, int i10) {
        ArrayList arrayList;
        jc.l.e(iterable, "<this>");
        if (i10 < 0) {
            throw new IllegalArgumentException(t0.C(i10, "Requested element count ", " is less than zero.").toString());
        }
        if (i10 == 0) {
            return G0(iterable);
        }
        if (iterable instanceof Collection) {
            int size = ((Collection) iterable).size() - i10;
            if (size <= 0) {
                return r.f22819a;
            }
            if (size == 1) {
                return ud.b.w(g0(iterable));
            }
            arrayList = new ArrayList(size);
            if (iterable instanceof List) {
                if (iterable instanceof RandomAccess) {
                    List list = (List) iterable;
                    int size2 = list.size();
                    while (i10 < size2) {
                        arrayList.add(list.get(i10));
                        i10++;
                    }
                } else {
                    ListIterator listIterator = ((List) iterable).listIterator(i10);
                    while (listIterator.hasNext()) {
                        arrayList.add(listIterator.next());
                    }
                }
                return arrayList;
            }
        } else {
            arrayList = new ArrayList();
        }
        int i11 = 0;
        for (Object obj : iterable) {
            if (i11 >= i10) {
                arrayList.add(obj);
            } else {
                i11++;
            }
        }
        return ud.b.B(arrayList);
    }

    public static List W(List list) {
        jc.l.e(list, "<this>");
        List list2 = list;
        int size = list.size() - 1;
        if (size < 0) {
            size = 0;
        }
        return D0(list2, size);
    }

    public static Object X(Iterable iterable) {
        jc.l.e(iterable, "<this>");
        if (iterable instanceof List) {
            return Y((List) iterable);
        }
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    public static Object Y(List list) {
        jc.l.e(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(0);
    }

    public static Object Z(Iterable iterable) {
        jc.l.e(iterable, "<this>");
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.isEmpty()) {
                return null;
            }
            return list.get(0);
        }
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        return null;
    }

    public static Object a0(List list) {
        jc.l.e(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public static Object b0(int i10, List list) {
        jc.l.e(list, "<this>");
        if (i10 < 0 || i10 >= list.size()) {
            return null;
        }
        return list.get(i10);
    }

    public static int c0(Iterable iterable, Object obj) {
        jc.l.e(iterable, "<this>");
        if (iterable instanceof List) {
            return ((List) iterable).indexOf(obj);
        }
        int i10 = 0;
        for (Object obj2 : iterable) {
            if (i10 < 0) {
                ud.b.H();
                throw null;
            }
            if (jc.l.a(obj, obj2)) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    public static final void d0(Iterable iterable, Appendable appendable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, ic.k kVar) throws IOException {
        jc.l.e(iterable, "<this>");
        jc.l.e(appendable, "buffer");
        jc.l.e(charSequence, "separator");
        jc.l.e(charSequence2, "prefix");
        jc.l.e(charSequence3, "postfix");
        appendable.append(charSequence2);
        int i10 = 0;
        for (Object obj : iterable) {
            i10++;
            if (i10 > 1) {
                appendable.append(charSequence);
            }
            a.a.s(appendable, obj, kVar);
        }
        appendable.append(charSequence3);
    }

    public static /* synthetic */ void e0(Iterable iterable, StringBuilder sb, String str, String str2, String str3, ic.k kVar, int i10) throws IOException {
        if ((i10 & 2) != 0) {
            str = ", ";
        }
        String str4 = str;
        String str5 = (i10 & 4) != 0 ? "" : str2;
        String str6 = (i10 & 8) != 0 ? "" : str3;
        if ((i10 & 64) != 0) {
            kVar = null;
        }
        d0(iterable, sb, str4, str5, str6, "...", kVar);
    }

    public static String f0(Iterable iterable, String str, String str2, String str3, ic.k kVar, int i10) throws IOException {
        if ((i10 & 1) != 0) {
            str = ", ";
        }
        String str4 = str;
        String str5 = (i10 & 2) != 0 ? "" : str2;
        String str6 = (i10 & 4) != 0 ? "" : str3;
        if ((i10 & 32) != 0) {
            kVar = null;
        }
        jc.l.e(iterable, "<this>");
        jc.l.e(str5, "prefix");
        StringBuilder sb = new StringBuilder();
        d0(iterable, sb, str4, str5, str6, "...", kVar);
        return sb.toString();
    }

    public static Object g0(Iterable iterable) {
        jc.l.e(iterable, "<this>");
        if (iterable instanceof List) {
            return h0((List) iterable);
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException("Collection is empty.");
        }
        Object next = it.next();
        while (it.hasNext()) {
            next = it.next();
        }
        return next;
    }

    public static Object h0(List list) {
        jc.l.e(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(ud.b.r(list));
    }

    public static Object i0(List list) {
        jc.l.e(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(list.size() - 1);
    }

    public static Comparable j0(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Comparable comparable = (Comparable) it.next();
        while (it.hasNext()) {
            Comparable comparable2 = (Comparable) it.next();
            if (comparable.compareTo(comparable2) < 0) {
                comparable = comparable2;
            }
        }
        return comparable;
    }

    public static Float k0(Iterable iterable) {
        jc.l.e(iterable, "<this>");
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        float fFloatValue = ((Number) it.next()).floatValue();
        while (it.hasNext()) {
            fFloatValue = Math.max(fFloatValue, ((Number) it.next()).floatValue());
        }
        return Float.valueOf(fFloatValue);
    }

    public static Comparable l0(Iterable iterable) {
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        Comparable comparable = (Comparable) it.next();
        while (it.hasNext()) {
            Comparable comparable2 = (Comparable) it.next();
            if (comparable.compareTo(comparable2) < 0) {
                comparable = comparable2;
            }
        }
        return comparable;
    }

    public static Float m0(Iterable iterable) {
        jc.l.e(iterable, "<this>");
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        float fFloatValue = ((Number) it.next()).floatValue();
        while (it.hasNext()) {
            fFloatValue = Math.min(fFloatValue, ((Number) it.next()).floatValue());
        }
        return Float.valueOf(fFloatValue);
    }

    public static ArrayList n0(Iterable iterable, Object obj) {
        jc.l.e(iterable, "<this>");
        ArrayList arrayList = new ArrayList(n.K(iterable, 10));
        boolean z10 = false;
        for (Object obj2 : iterable) {
            boolean z11 = true;
            if (!z10 && jc.l.a(obj2, obj)) {
                z10 = true;
                z11 = false;
            }
            if (z11) {
                arrayList.add(obj2);
            }
        }
        return arrayList;
    }

    public static ArrayList o0(Iterable iterable, Iterable iterable2) {
        jc.l.e(iterable, "<this>");
        if (iterable instanceof Collection) {
            return q0((Collection) iterable, iterable2);
        }
        ArrayList arrayList = new ArrayList();
        P(arrayList, iterable);
        P(arrayList, iterable2);
        return arrayList;
    }

    public static ArrayList p0(Iterable iterable, Object obj) {
        if (iterable instanceof Collection) {
            return r0((Collection) iterable, obj);
        }
        ArrayList arrayList = new ArrayList();
        P(arrayList, iterable);
        arrayList.add(obj);
        return arrayList;
    }

    public static ArrayList q0(Collection collection, Iterable iterable) {
        jc.l.e(collection, "<this>");
        jc.l.e(iterable, "elements");
        if (!(iterable instanceof Collection)) {
            ArrayList arrayList = new ArrayList(collection);
            P(arrayList, iterable);
            return arrayList;
        }
        Collection collection2 = (Collection) iterable;
        ArrayList arrayList2 = new ArrayList(collection2.size() + collection.size());
        arrayList2.addAll(collection);
        arrayList2.addAll(collection2);
        return arrayList2;
    }

    public static ArrayList r0(Collection collection, Object obj) {
        jc.l.e(collection, "<this>");
        ArrayList arrayList = new ArrayList(collection.size() + 1);
        arrayList.addAll(collection);
        arrayList.add(obj);
        return arrayList;
    }

    public static void s0(List list, ic.k kVar) {
        int iR;
        jc.l.e(list, "<this>");
        jc.l.e(kVar, "predicate");
        if (!(list instanceof RandomAccess)) {
            if ((list instanceof kc.a) && !(list instanceof kc.b)) {
                c0.e(list, "kotlin.collections.MutableIterable");
                throw null;
            }
            try {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (((Boolean) kVar.a(it.next())).booleanValue()) {
                        it.remove();
                    }
                }
                return;
            } catch (ClassCastException e10) {
                jc.l.i(e10, c0.class.getName());
                throw e10;
            }
        }
        int iR2 = ud.b.r(list);
        int i10 = 0;
        if (iR2 >= 0) {
            int i11 = 0;
            while (true) {
                Object obj = list.get(i10);
                if (!((Boolean) kVar.a(obj)).booleanValue()) {
                    if (i11 != i10) {
                        list.set(i11, obj);
                    }
                    i11++;
                }
                if (i10 == iR2) {
                    break;
                } else {
                    i10++;
                }
            }
            i10 = i11;
        }
        if (i10 >= list.size() || i10 > (iR = ud.b.r(list))) {
            return;
        }
        while (true) {
            list.remove(iR);
            if (iR == i10) {
                return;
            } else {
                iR--;
            }
        }
    }

    public static Object t0(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return arrayList.remove(0);
    }

    public static Object u0(List list) {
        jc.l.e(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.remove(ud.b.r(list));
    }

    public static List v0(Iterable iterable) {
        jc.l.e(iterable, "<this>");
        if ((iterable instanceof Collection) && ((Collection) iterable).size() <= 1) {
            return G0(iterable);
        }
        List listI0 = I0(iterable);
        Collections.reverse(listI0);
        return listI0;
    }

    public static Object w0(Iterable iterable) {
        jc.l.e(iterable, "<this>");
        if (iterable instanceof List) {
            return x0((List) iterable);
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException("Collection is empty.");
        }
        Object next = it.next();
        if (it.hasNext()) {
            throw new IllegalArgumentException("Collection has more than one element.");
        }
        return next;
    }

    public static Object x0(List list) {
        jc.l.e(list, "<this>");
        int size = list.size();
        if (size == 0) {
            throw new NoSuchElementException("List is empty.");
        }
        if (size == 1) {
            return list.get(0);
        }
        throw new IllegalArgumentException("List has more than one element.");
    }

    public static Object y0(Iterable iterable) {
        jc.l.e(iterable, "<this>");
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.size() == 1) {
                return list.get(0);
            }
            return null;
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Object next = it.next();
        if (it.hasNext()) {
            return null;
        }
        return next;
    }

    public static Object z0(List list) {
        jc.l.e(list, "<this>");
        if (list.size() == 1) {
            return list.get(0);
        }
        return null;
    }
}
