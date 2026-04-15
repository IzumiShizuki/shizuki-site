package yc;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f26109a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final f f26110b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final f f26111c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final f f26112d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final f f26113e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final f f26114f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ f[] f26115g;

    static {
        f fVar = new f("CLASS", 0);
        f26109a = fVar;
        f fVar2 = new f("INTERFACE", 1);
        f26110b = fVar2;
        f fVar3 = new f("ENUM_CLASS", 2);
        f26111c = fVar3;
        f fVar4 = new f("ENUM_ENTRY", 3);
        f26112d = fVar4;
        f fVar5 = new f("ANNOTATION_CLASS", 4);
        f26113e = fVar5;
        f fVar6 = new f("OBJECT", 5);
        f26114f = fVar6;
        f26115g = new f[]{fVar, fVar2, fVar3, fVar4, fVar5, fVar6};
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) f26115g.clone();
    }

    public final boolean a() {
        return this == f26114f || this == f26112d;
    }
}
