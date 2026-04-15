package td;

import java.util.LinkedHashMap;
import m0.w;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f20693a = new d(g.f20681b, false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final d f20694b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final d f20695c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final LinkedHashMap f20696d;

    static {
        g gVar = g.f20682c;
        f20694b = new d(gVar, false);
        f20695c = new d(gVar, true);
        String strConcat = "java/lang/".concat("Object");
        String strConcat2 = "java/util/function/".concat("Predicate");
        String strConcat3 = "java/util/function/".concat("Function");
        String strConcat4 = "java/util/function/".concat("Consumer");
        String strConcat5 = "java/util/function/".concat("BiFunction");
        String strConcat6 = "java/util/function/".concat("BiConsumer");
        String strConcat7 = "java/util/function/".concat("UnaryOperator");
        String strConcat8 = "java/util/".concat("stream/Stream");
        String strConcat9 = "java/util/".concat("Optional");
        i4.d dVar = new i4.d(4);
        new w(dVar, "java/util/".concat("Iterator")).z("forEachRemaining", null, new i(0, strConcat4));
        new w(dVar, "java/lang/".concat("Iterable")).z("spliterator", null, new n(4));
        w wVar = new w(dVar, "java/util/".concat("Collection"));
        wVar.z("removeIf", null, new i(17, strConcat2));
        wVar.z("stream", null, new i(26, strConcat8));
        wVar.z("parallelStream", null, new k(1, strConcat8));
        w wVar2 = new w(dVar, "java/util/".concat("List"));
        wVar2.z("replaceAll", null, new k(2, strConcat7));
        wVar2.z("addFirst", "2.1", new k(3, strConcat));
        wVar2.z("addLast", "2.1", new k(4, strConcat));
        wVar2.z("removeFirst", "2.1", new k(5, strConcat));
        wVar2.z("removeLast", "2.1", new k(6, strConcat));
        w wVar3 = new w(dVar, "java/util/".concat("LinkedList"));
        wVar3.z("addFirst", "2.1", new i(1, strConcat));
        wVar3.z("addLast", "2.1", new i(2, strConcat));
        wVar3.z("removeFirst", "2.1", new i(3, strConcat));
        wVar3.z("removeLast", "2.1", new i(4, strConcat));
        w wVar4 = new w(dVar, "java/util/".concat("LinkedHashSet"));
        wVar4.z("addFirst", "2.2", new i(5, strConcat));
        wVar4.z("addLast", "2.2", new i(6, strConcat));
        wVar4.z("removeFirst", "2.2", new i(7, strConcat));
        wVar4.z("removeLast", "2.2", new i(8, strConcat));
        wVar4.z("getFirst", "2.2", new i(9, strConcat));
        wVar4.z("getLast", "2.2", new i(10, strConcat));
        w wVar5 = new w(dVar, "java/util/".concat("Map"));
        wVar5.z("forEach", null, new i(11, strConcat6));
        wVar5.z("putIfAbsent", null, new i(12, strConcat));
        wVar5.z("replace", null, new i(13, strConcat));
        wVar5.z("replace", null, new i(14, strConcat));
        wVar5.z("replaceAll", null, new i(15, strConcat5));
        wVar5.z("compute", null, new j(0, strConcat, strConcat5));
        wVar5.z("computeIfAbsent", null, new j(1, strConcat, strConcat3));
        wVar5.z("computeIfPresent", null, new j(2, strConcat, strConcat5));
        wVar5.z("merge", null, new j(3, strConcat, strConcat5));
        w wVar6 = new w(dVar, "java/util/".concat("LinkedHashMap"));
        wVar6.z("putFirst", "2.2", new i(16, strConcat));
        wVar6.z("putLast", "2.2", new i(18, strConcat));
        w wVar7 = new w(dVar, strConcat9);
        wVar7.z("empty", null, new i(19, strConcat9));
        wVar7.z("of", null, new j(4, strConcat, strConcat9));
        wVar7.z("ofNullable", null, new j(5, strConcat, strConcat9));
        wVar7.z("get", null, new i(20, strConcat));
        wVar7.z("ifPresent", null, new i(21, strConcat4));
        new w(dVar, "java/lang/".concat("ref/Reference")).z("get", null, new i(22, strConcat));
        new w(dVar, strConcat2).z("test", null, new i(23, strConcat));
        new w(dVar, "java/util/function/".concat("BiPredicate")).z("test", null, new i(24, strConcat));
        new w(dVar, strConcat4).z("accept", null, new i(25, strConcat));
        new w(dVar, strConcat6).z("accept", null, new i(27, strConcat));
        new w(dVar, strConcat3).z("apply", null, new i(28, strConcat));
        new w(dVar, strConcat5).z("apply", null, new i(29, strConcat));
        new w(dVar, "java/util/function/".concat("Supplier")).z("get", null, new k(0, strConcat));
        f20696d = dVar.f9004a;
    }
}
