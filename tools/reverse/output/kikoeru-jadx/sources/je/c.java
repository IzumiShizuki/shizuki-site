package je;

import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;
import vc.k;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public enum c {
    BOOLEAN(k.f22847f, "boolean", "Z", "java.lang.Boolean"),
    CHAR(k.f22848g, "char", "C", "java.lang.Character"),
    BYTE(k.f22849h, "byte", "B", "java.lang.Byte"),
    SHORT(k.f22850i, "short", "S", "java.lang.Short"),
    INT(k.f22851j, "int", "I", "java.lang.Integer"),
    FLOAT(k.f22852k, "float", "F", "java.lang.Float"),
    LONG(k.f22853l, "long", "J", "java.lang.Long"),
    DOUBLE(k.f22854m, "double", "D", "java.lang.Double");


    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final HashMap f10854m = new HashMap();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final EnumMap f10855n = new EnumMap(k.class);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final HashMap f10856o = new HashMap();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final HashSet f10857p = new HashSet();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final HashMap f10858q = new HashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f10860a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f10861b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f10862c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final be.c f10863d;

    static {
        for (c cVar : values()) {
            f10854m.put(cVar.f10861b, cVar);
            f10855n.put(cVar.d(), cVar);
            f10856o.put(cVar.c(), cVar);
            String strReplace = cVar.f10863d.f2744a.f2747a.replace('.', '/');
            f10857p.add(strReplace);
            f10858q.put(strReplace, "(" + cVar.f10862c + ")L" + strReplace + ";");
        }
    }

    c(k kVar, String str, String str2, String str3) {
        if (kVar == null) {
            a(8);
            throw null;
        }
        this.f10860a = kVar;
        this.f10861b = str;
        this.f10862c = str2;
        this.f10863d = new be.c(str3);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0018  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x000c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ void a(int r8) {
        /*
            Method dump skipped, instruction units count: 274
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: je.c.a(int):void");
    }

    public static c b(String str) {
        c cVar = (c) f10854m.get(str);
        if (cVar != null) {
            return cVar;
        }
        throw new AssertionError("Non-primitive type name passed: ".concat(str));
    }

    public final String c() {
        String str = this.f10862c;
        if (str != null) {
            return str;
        }
        a(14);
        throw null;
    }

    public final k d() {
        k kVar = this.f10860a;
        if (kVar != null) {
            return kVar;
        }
        a(12);
        throw null;
    }
}
