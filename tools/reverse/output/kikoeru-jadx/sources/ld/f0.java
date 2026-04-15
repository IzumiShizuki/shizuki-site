package ld;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ArrayList f12214a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ArrayList f12215b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f12216c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final LinkedHashMap f12217d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Set f12218e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Set f12219f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final b0 f12220g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Object f12221h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final LinkedHashMap f12222i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final HashSet f12223j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final LinkedHashMap f12224k;

    /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v29, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v33, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v51, types: [java.lang.Object, java.util.Map] */
    static {
        Set<String> setN0 = vb.l.N0(new String[]{"containsAll", "removeAll", "retainAll"});
        ArrayList arrayList = new ArrayList(vb.n.K(setN0, 10));
        for (String str : setN0) {
            String strC = je.c.BOOLEAN.c();
            jc.l.d(strC, "getDesc(...)");
            arrayList.add(l.a("java/util/Collection", str, "Ljava/util/Collection;", strC));
        }
        f12214a = arrayList;
        ArrayList arrayList2 = new ArrayList(vb.n.K(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((b0) it.next()).f12189e);
        }
        f12215b = arrayList2;
        ArrayList arrayList3 = f12214a;
        ArrayList arrayList4 = new ArrayList(vb.n.K(arrayList3, 10));
        Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            arrayList4.add(((b0) it2.next()).f12186b.b());
        }
        String strConcat = "java/util/".concat("Collection");
        je.c cVar = je.c.BOOLEAN;
        String strC2 = cVar.c();
        jc.l.d(strC2, "getDesc(...)");
        b0 b0VarA = l.a(strConcat, "contains", "Ljava/lang/Object;", strC2);
        e0 e0Var = e0.f12206d;
        ub.k kVar = new ub.k(b0VarA, e0Var);
        String strConcat2 = "java/util/".concat("Collection");
        String strC3 = cVar.c();
        jc.l.d(strC3, "getDesc(...)");
        ub.k kVar2 = new ub.k(l.a(strConcat2, "remove", "Ljava/lang/Object;", strC3), e0Var);
        String strConcat3 = "java/util/".concat("Map");
        String strC4 = cVar.c();
        jc.l.d(strC4, "getDesc(...)");
        ub.k kVar3 = new ub.k(l.a(strConcat3, "containsKey", "Ljava/lang/Object;", strC4), e0Var);
        String strConcat4 = "java/util/".concat("Map");
        String strC5 = cVar.c();
        jc.l.d(strC5, "getDesc(...)");
        ub.k kVar4 = new ub.k(l.a(strConcat4, "containsValue", "Ljava/lang/Object;", strC5), e0Var);
        String strConcat5 = "java/util/".concat("Map");
        String strC6 = cVar.c();
        jc.l.d(strC6, "getDesc(...)");
        ub.k kVar5 = new ub.k(l.a(strConcat5, "remove", "Ljava/lang/Object;Ljava/lang/Object;", strC6), e0Var);
        ub.k kVar6 = new ub.k(l.a("java/util/".concat("Map"), "getOrDefault", "Ljava/lang/Object;Ljava/lang/Object;", "Ljava/lang/Object;"), e0.f12207e);
        b0 b0VarA2 = l.a("java/util/".concat("Map"), "get", "Ljava/lang/Object;", "Ljava/lang/Object;");
        e0 e0Var2 = e0.f12204b;
        ub.k kVar7 = new ub.k(b0VarA2, e0Var2);
        ub.k kVar8 = new ub.k(l.a("java/util/".concat("Map"), "remove", "Ljava/lang/Object;", "Ljava/lang/Object;"), e0Var2);
        String strConcat6 = "java/util/".concat("List");
        je.c cVar2 = je.c.INT;
        String strC7 = cVar2.c();
        jc.l.d(strC7, "getDesc(...)");
        b0 b0VarA3 = l.a(strConcat6, "indexOf", "Ljava/lang/Object;", strC7);
        e0 e0Var3 = e0.f12205c;
        ub.k kVar9 = new ub.k(b0VarA3, e0Var3);
        String strConcat7 = "java/util/".concat("List");
        String strC8 = cVar2.c();
        jc.l.d(strC8, "getDesc(...)");
        Map mapV = vb.w.v(kVar, kVar2, kVar3, kVar4, kVar5, kVar6, kVar7, kVar8, kVar9, new ub.k(l.a(strConcat7, "lastIndexOf", "Ljava/lang/Object;", strC8), e0Var3));
        f12216c = mapV;
        LinkedHashMap linkedHashMap = new LinkedHashMap(vb.w.t(mapV.size()));
        for (Map.Entry entry : mapV.entrySet()) {
            linkedHashMap.put(((b0) entry.getKey()).f12189e, entry.getValue());
        }
        f12217d = linkedHashMap;
        LinkedHashSet linkedHashSetJ = ud.e.J(f12216c.keySet(), f12214a);
        ArrayList arrayList5 = new ArrayList(vb.n.K(linkedHashSetJ, 10));
        Iterator it3 = linkedHashSetJ.iterator();
        while (it3.hasNext()) {
            arrayList5.add(((b0) it3.next()).f12186b);
        }
        f12218e = vb.m.K0(arrayList5);
        ArrayList arrayList6 = new ArrayList(vb.n.K(linkedHashSetJ, 10));
        Iterator it4 = linkedHashSetJ.iterator();
        while (it4.hasNext()) {
            arrayList6.add(((b0) it4.next()).f12189e);
        }
        f12219f = vb.m.K0(arrayList6);
        je.c cVar3 = je.c.INT;
        String strC9 = cVar3.c();
        jc.l.d(strC9, "getDesc(...)");
        b0 b0VarA4 = l.a("java/util/List", "removeAt", strC9, "Ljava/lang/Object;");
        f12220g = b0VarA4;
        String strConcat8 = "java/lang/".concat("Number");
        String strC10 = je.c.BYTE.c();
        jc.l.d(strC10, "getDesc(...)");
        ub.k kVar10 = new ub.k(l.a(strConcat8, "toByte", "", strC10), be.e.e("byteValue"));
        String strConcat9 = "java/lang/".concat("Number");
        String strC11 = je.c.SHORT.c();
        jc.l.d(strC11, "getDesc(...)");
        ub.k kVar11 = new ub.k(l.a(strConcat9, "toShort", "", strC11), be.e.e("shortValue"));
        String strConcat10 = "java/lang/".concat("Number");
        String strC12 = cVar3.c();
        jc.l.d(strC12, "getDesc(...)");
        ub.k kVar12 = new ub.k(l.a(strConcat10, "toInt", "", strC12), be.e.e("intValue"));
        String strConcat11 = "java/lang/".concat("Number");
        String strC13 = je.c.LONG.c();
        jc.l.d(strC13, "getDesc(...)");
        ub.k kVar13 = new ub.k(l.a(strConcat11, "toLong", "", strC13), be.e.e("longValue"));
        String strConcat12 = "java/lang/".concat("Number");
        String strC14 = je.c.FLOAT.c();
        jc.l.d(strC14, "getDesc(...)");
        ub.k kVar14 = new ub.k(l.a(strConcat12, "toFloat", "", strC14), be.e.e("floatValue"));
        String strConcat13 = "java/lang/".concat("Number");
        String strC15 = je.c.DOUBLE.c();
        jc.l.d(strC15, "getDesc(...)");
        ub.k kVar15 = new ub.k(l.a(strConcat13, "toDouble", "", strC15), be.e.e("doubleValue"));
        ub.k kVar16 = new ub.k(b0VarA4, be.e.e("remove"));
        String strConcat14 = "java/lang/".concat("CharSequence");
        String strC16 = cVar3.c();
        jc.l.d(strC16, "getDesc(...)");
        String strC17 = je.c.CHAR.c();
        jc.l.d(strC17, "getDesc(...)");
        Map mapV2 = vb.w.v(kVar10, kVar11, kVar12, kVar13, kVar14, kVar15, kVar16, new ub.k(l.a(strConcat14, "get", strC16, strC17), be.e.e("charAt")), new ub.k(l.a("java/util/concurrent/atomic/".concat("AtomicInteger"), "load", "", "I"), be.e.e("get")), new ub.k(l.a("java/util/concurrent/atomic/".concat("AtomicInteger"), "store", "I", "V"), be.e.e("set")), new ub.k(l.a("java/util/concurrent/atomic/".concat("AtomicInteger"), "exchange", "I", "I"), be.e.e("getAndSet")), new ub.k(l.a("java/util/concurrent/atomic/".concat("AtomicInteger"), "fetchAndAdd", "I", "I"), be.e.e("getAndAdd")), new ub.k(l.a("java/util/concurrent/atomic/".concat("AtomicInteger"), "addAndFetch", "I", "I"), be.e.e("addAndGet")), new ub.k(l.a("java/util/concurrent/atomic/".concat("AtomicLong"), "load", "", "J"), be.e.e("get")), new ub.k(l.a("java/util/concurrent/atomic/".concat("AtomicLong"), "store", "J", "V"), be.e.e("set")), new ub.k(l.a("java/util/concurrent/atomic/".concat("AtomicLong"), "exchange", "J", "J"), be.e.e("getAndSet")), new ub.k(l.a("java/util/concurrent/atomic/".concat("AtomicLong"), "fetchAndAdd", "J", "J"), be.e.e("getAndAdd")), new ub.k(l.a("java/util/concurrent/atomic/".concat("AtomicLong"), "addAndFetch", "J", "J"), be.e.e("addAndGet")), new ub.k(l.a("java/util/concurrent/atomic/".concat("AtomicBoolean"), "load", "", "Z"), be.e.e("get")), new ub.k(l.a("java/util/concurrent/atomic/".concat("AtomicBoolean"), "store", "Z", "V"), be.e.e("set")), new ub.k(l.a("java/util/concurrent/atomic/".concat("AtomicBoolean"), "exchange", "Z", "Z"), be.e.e("getAndSet")), new ub.k(l.a("java/util/concurrent/atomic/".concat("AtomicReference"), "load", "", "Ljava/lang/Object;"), be.e.e("get")), new ub.k(l.a("java/util/concurrent/atomic/".concat("AtomicReference"), "store", "Ljava/lang/Object;", "V"), be.e.e("set")), new ub.k(l.a("java/util/concurrent/atomic/".concat("AtomicReference"), "exchange", "Ljava/lang/Object;", "Ljava/lang/Object;"), be.e.e("getAndSet")), new ub.k(l.a("java/util/concurrent/atomic/".concat("AtomicIntegerArray"), "loadAt", "I", "I"), be.e.e("get")), new ub.k(l.a("java/util/concurrent/atomic/".concat("AtomicIntegerArray"), "storeAt", "II", "V"), be.e.e("set")), new ub.k(l.a("java/util/concurrent/atomic/".concat("AtomicIntegerArray"), "exchangeAt", "II", "I"), be.e.e("getAndSet")), new ub.k(l.a("java/util/concurrent/atomic/".concat("AtomicIntegerArray"), "compareAndSetAt", "III", "Z"), be.e.e("compareAndSet")), new ub.k(l.a("java/util/concurrent/atomic/".concat("AtomicIntegerArray"), "fetchAndAddAt", "II", "I"), be.e.e("getAndAdd")), new ub.k(l.a("java/util/concurrent/atomic/".concat("AtomicIntegerArray"), "addAndFetchAt", "II", "I"), be.e.e("addAndGet")), new ub.k(l.a("java/util/concurrent/atomic/".concat("AtomicLongArray"), "loadAt", "I", "J"), be.e.e("get")), new ub.k(l.a("java/util/concurrent/atomic/".concat("AtomicLongArray"), "storeAt", "IJ", "V"), be.e.e("set")), new ub.k(l.a("java/util/concurrent/atomic/".concat("AtomicLongArray"), "exchangeAt", "IJ", "J"), be.e.e("getAndSet")), new ub.k(l.a("java/util/concurrent/atomic/".concat("AtomicLongArray"), "compareAndSetAt", "IJJ", "Z"), be.e.e("compareAndSet")), new ub.k(l.a("java/util/concurrent/atomic/".concat("AtomicLongArray"), "fetchAndAddAt", "IJ", "J"), be.e.e("getAndAdd")), new ub.k(l.a("java/util/concurrent/atomic/".concat("AtomicLongArray"), "addAndFetchAt", "IJ", "J"), be.e.e("addAndGet")), new ub.k(l.a("java/util/concurrent/atomic/".concat("AtomicReferenceArray"), "loadAt", "I", "Ljava/lang/Object;"), be.e.e("get")), new ub.k(l.a("java/util/concurrent/atomic/".concat("AtomicReferenceArray"), "storeAt", "ILjava/lang/Object;", "V"), be.e.e("set")), new ub.k(l.a("java/util/concurrent/atomic/".concat("AtomicReferenceArray"), "exchangeAt", "ILjava/lang/Object;", "Ljava/lang/Object;"), be.e.e("getAndSet")), new ub.k(l.a("java/util/concurrent/atomic/".concat("AtomicReferenceArray"), "compareAndSetAt", "ILjava/lang/Object;Ljava/lang/Object;", "Z"), be.e.e("compareAndSet")));
        f12221h = mapV2;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(vb.w.t(mapV2.size()));
        for (Map.Entry entry2 : mapV2.entrySet()) {
            linkedHashMap2.put(((b0) entry2.getKey()).f12189e, entry2.getValue());
        }
        f12222i = linkedHashMap2;
        ?? r12 = f12221h;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Map.Entry entry3 : r12.entrySet()) {
            b0 b0Var = (b0) entry3.getKey();
            be.e eVar = (be.e) entry3.getValue();
            String str2 = b0Var.f12185a;
            String str3 = b0Var.f12187c;
            String str4 = b0Var.f12188d;
            jc.l.e(str2, "classInternalName");
            jc.l.e(eVar, "name");
            String str5 = eVar + '(' + str3 + ')' + str4;
            jc.l.e(str5, "jvmDescriptor");
            linkedHashSet.add(str2 + '.' + str5);
        }
        Set setKeySet = f12221h.keySet();
        HashSet hashSet = new HashSet();
        Iterator it5 = setKeySet.iterator();
        while (it5.hasNext()) {
            hashSet.add(((b0) it5.next()).f12186b);
        }
        f12223j = hashSet;
        Set<Map.Entry> setEntrySet = f12221h.entrySet();
        ArrayList<ub.k> arrayList7 = new ArrayList(vb.n.K(setEntrySet, 10));
        for (Map.Entry entry4 : setEntrySet) {
            arrayList7.add(new ub.k(((b0) entry4.getKey()).f12186b, entry4.getValue()));
        }
        int iT = vb.w.t(vb.n.K(arrayList7, 10));
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(iT >= 16 ? iT : 16);
        for (ub.k kVar17 : arrayList7) {
            linkedHashMap3.put((be.e) kVar17.f21544b, (be.e) kVar17.f21543a);
        }
        f12224k = linkedHashMap3;
    }
}
