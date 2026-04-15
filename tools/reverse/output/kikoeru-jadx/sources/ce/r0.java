package ce;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF2' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public class r0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final r0 f3964c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final r0 f3965d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final o0 f3966e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final p0 f3967f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final r0 f3968g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ r0[] f3969h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s0 f3970a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f3971b;

    /* JADX INFO: Fake field, exist only in values array */
    r0 EF0;

    /* JADX INFO: Fake field, exist only in values array */
    r0 EF1;

    /* JADX INFO: Fake field, exist only in values array */
    r0 EF2;

    static {
        r0 r0Var = new r0("DOUBLE", 0, s0.f3976e, 1);
        r0 r0Var2 = new r0("FLOAT", 1, s0.f3975d, 5);
        s0 s0Var = s0.f3974c;
        r0 r0Var3 = new r0("INT64", 2, s0Var, 0);
        r0 r0Var4 = new r0("UINT64", 3, s0Var, 0);
        s0 s0Var2 = s0.f3973b;
        r0 r0Var5 = new r0("INT32", 4, s0Var2, 0);
        f3964c = r0Var5;
        r0 r0Var6 = new r0("FIXED64", 5, s0Var, 1);
        r0 r0Var7 = new r0("FIXED32", 6, s0Var2, 5);
        r0 r0Var8 = new r0("BOOL", 7, s0.f3977f, 0);
        f3965d = r0Var8;
        n0 n0Var = new n0("STRING", 8, s0.f3978g, 2);
        s0 s0Var3 = s0.f3981j;
        o0 o0Var = new o0("GROUP", 9, s0Var3, 3);
        f3966e = o0Var;
        p0 p0Var = new p0("MESSAGE", 10, s0Var3, 2);
        f3967f = p0Var;
        q0 q0Var = new q0("BYTES", 11, s0.f3979h, 2);
        r0 r0Var9 = new r0("UINT32", 12, s0Var2, 0);
        r0 r0Var10 = new r0("ENUM", 13, s0.f3980i, 0);
        f3968g = r0Var10;
        f3969h = new r0[]{r0Var, r0Var2, r0Var3, r0Var4, r0Var5, r0Var6, r0Var7, r0Var8, n0Var, o0Var, p0Var, q0Var, r0Var9, r0Var10, new r0("SFIXED32", 14, s0Var2, 5), new r0("SFIXED64", 15, s0Var, 1), new r0("SINT32", 16, s0Var2, 0), new r0("SINT64", 17, s0Var, 0)};
    }

    public r0(String str, int i10, s0 s0Var, int i11) {
        this.f3970a = s0Var;
        this.f3971b = i11;
    }

    public static r0 valueOf(String str) {
        return (r0) Enum.valueOf(r0.class, str);
    }

    public static r0[] values() {
        return (r0[]) f3969h.clone();
    }

    public boolean a() {
        return !(this instanceof n0);
    }
}
