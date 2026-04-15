package xc;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final LinkedHashSet f24956a = ud.e.K(ud.h.i("Collection", "toArray()[Ljava/lang/Object;", "toArray([Ljava/lang/Object;)[Ljava/lang/Object;"), "java/lang/annotation/Annotation.annotationType()Ljava/lang/Class;");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final LinkedHashSet f24957b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final LinkedHashSet f24958c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final LinkedHashSet f24959d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final LinkedHashSet f24960e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final LinkedHashSet f24961f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final LinkedHashSet f24962g;

    static {
        List<je.c> listX = ud.b.x(je.c.BOOLEAN, je.c.CHAR);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (je.c cVar : listX) {
            be.c cVar2 = cVar.f10863d;
            if (cVar2 == null) {
                je.c.a(15);
                throw null;
            }
            String strB = cVar2.f2744a.g().b();
            jc.l.d(strB, "asString(...)");
            vb.m.P(linkedHashSet, ud.h.h(strB, cVar.f10861b + "Value()" + cVar.c()));
        }
        f24957b = ud.e.J(ud.e.J(ud.e.J(ud.e.J(ud.e.J(ud.e.J(linkedHashSet, ud.h.i("List", "sort(Ljava/util/Comparator;)V", "reversed()Ljava/util/List;")), ud.h.h("String", "codePointAt(I)I", "codePointBefore(I)I", "codePointCount(II)I", "compareToIgnoreCase(Ljava/lang/String;)I", "concat(Ljava/lang/String;)Ljava/lang/String;", "contains(Ljava/lang/CharSequence;)Z", "contentEquals(Ljava/lang/CharSequence;)Z", "contentEquals(Ljava/lang/StringBuffer;)Z", "endsWith(Ljava/lang/String;)Z", "equalsIgnoreCase(Ljava/lang/String;)Z", "getBytes()[B", "getBytes(II[BI)V", "getBytes(Ljava/lang/String;)[B", "getBytes(Ljava/nio/charset/Charset;)[B", "getChars(II[CI)V", "indexOf(I)I", "indexOf(II)I", "indexOf(Ljava/lang/String;)I", "indexOf(Ljava/lang/String;I)I", "intern()Ljava/lang/String;", "isEmpty()Z", "lastIndexOf(I)I", "lastIndexOf(II)I", "lastIndexOf(Ljava/lang/String;)I", "lastIndexOf(Ljava/lang/String;I)I", "matches(Ljava/lang/String;)Z", "offsetByCodePoints(II)I", "regionMatches(ILjava/lang/String;II)Z", "regionMatches(ZILjava/lang/String;II)Z", "replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "replace(CC)Ljava/lang/String;", "replaceFirst(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;", "split(Ljava/lang/String;I)[Ljava/lang/String;", "split(Ljava/lang/String;)[Ljava/lang/String;", "startsWith(Ljava/lang/String;I)Z", "startsWith(Ljava/lang/String;)Z", "substring(II)Ljava/lang/String;", "substring(I)Ljava/lang/String;", "toCharArray()[C", "toLowerCase()Ljava/lang/String;", "toLowerCase(Ljava/util/Locale;)Ljava/lang/String;", "toUpperCase()Ljava/lang/String;", "toUpperCase(Ljava/util/Locale;)Ljava/lang/String;", "trim()Ljava/lang/String;", "isBlank()Z", "lines()Ljava/util/stream/Stream;", "repeat(I)Ljava/lang/String;")), ud.h.h("Double", "isInfinite()Z", "isNaN()Z")), ud.h.h("Float", "isInfinite()Z", "isNaN()Z")), ud.h.h("Enum", "getDeclaringClass()Ljava/lang/Class;", "finalize()V")), ud.h.h("CharSequence", "isEmpty()Z"));
        f24958c = ud.h.i("List", "getFirst()Ljava/lang/Object;", "getLast()Ljava/lang/Object;");
        f24959d = ud.e.J(ud.e.J(ud.e.J(ud.e.J(ud.e.J(ud.e.J(ud.h.h("CharSequence", "codePoints()Ljava/util/stream/IntStream;", "chars()Ljava/util/stream/IntStream;"), ud.h.i("Iterator", "forEachRemaining(Ljava/util/function/Consumer;)V")), ud.h.h("Iterable", "forEach(Ljava/util/function/Consumer;)V", "spliterator()Ljava/util/Spliterator;")), ud.h.h("Throwable", "setStackTrace([Ljava/lang/StackTraceElement;)V", "fillInStackTrace()Ljava/lang/Throwable;", "getLocalizedMessage()Ljava/lang/String;", "printStackTrace()V", "printStackTrace(Ljava/io/PrintStream;)V", "printStackTrace(Ljava/io/PrintWriter;)V", "getStackTrace()[Ljava/lang/StackTraceElement;", "initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;", "getSuppressed()[Ljava/lang/Throwable;", "addSuppressed(Ljava/lang/Throwable;)V")), ud.h.i("Collection", "spliterator()Ljava/util/Spliterator;", "parallelStream()Ljava/util/stream/Stream;", "stream()Ljava/util/stream/Stream;", "removeIf(Ljava/util/function/Predicate;)Z")), ud.h.i("List", "replaceAll(Ljava/util/function/UnaryOperator;)V", "addFirst(Ljava/lang/Object;)V", "addLast(Ljava/lang/Object;)V", "removeFirst()Ljava/lang/Object;", "removeLast()Ljava/lang/Object;")), ud.h.i("Map", "getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "forEach(Ljava/util/function/BiConsumer;)V", "replaceAll(Ljava/util/function/BiFunction;)V", "merge(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "computeIfPresent(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "replace(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z", "replace(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "computeIfAbsent(Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;", "compute(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;"));
        f24960e = ud.e.J(ud.e.J(ud.h.i("Collection", "removeIf(Ljava/util/function/Predicate;)Z"), ud.h.i("List", "replaceAll(Ljava/util/function/UnaryOperator;)V", "sort(Ljava/util/Comparator;)V", "addFirst(Ljava/lang/Object;)V", "addLast(Ljava/lang/Object;)V", "removeFirst()Ljava/lang/Object;", "removeLast()Ljava/lang/Object;")), ud.h.i("Map", "computeIfAbsent(Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;", "computeIfPresent(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "compute(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "merge(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "remove(Ljava/lang/Object;Ljava/lang/Object;)Z", "replaceAll(Ljava/util/function/BiFunction;)V", "replace(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "replace(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z"));
        je.c cVar3 = je.c.BYTE;
        List listX2 = ud.b.x(je.c.BOOLEAN, cVar3, je.c.DOUBLE, je.c.FLOAT, cVar3, je.c.INT, je.c.LONG, je.c.SHORT);
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        Iterator it = listX2.iterator();
        while (it.hasNext()) {
            be.c cVar4 = ((je.c) it.next()).f10863d;
            if (cVar4 == null) {
                je.c.a(15);
                throw null;
            }
            String strB2 = cVar4.f2744a.g().b();
            jc.l.d(strB2, "asString(...)");
            String[] strArrA = ud.h.a("Ljava/lang/String;");
            vb.m.P(linkedHashSet2, ud.h.h(strB2, (String[]) Arrays.copyOf(strArrA, strArrA.length)));
        }
        String[] strArrA2 = ud.h.a("D");
        LinkedHashSet linkedHashSetJ = ud.e.J(linkedHashSet2, ud.h.h("Float", (String[]) Arrays.copyOf(strArrA2, strArrA2.length)));
        String[] strArrA3 = ud.h.a("[C", "[CII", "[III", "[BIILjava/lang/String;", "[BIILjava/nio/charset/Charset;", "[BLjava/lang/String;", "[BLjava/nio/charset/Charset;", "[BII", "[B", "Ljava/lang/StringBuffer;", "Ljava/lang/StringBuilder;");
        f24961f = ud.e.J(linkedHashSetJ, ud.h.h("String", (String[]) Arrays.copyOf(strArrA3, strArrA3.length)));
        String[] strArrA4 = ud.h.a("Ljava/lang/String;Ljava/lang/Throwable;ZZ");
        f24962g = ud.h.h("Throwable", (String[]) Arrays.copyOf(strArrA4, strArrA4.length));
    }
}
