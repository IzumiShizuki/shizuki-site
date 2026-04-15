package tb;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f20601a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f20602b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f20603c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f20604d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f20605e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ a[] f20606f;

    static {
        a aVar = new a("LevelDebug", 0);
        f20601a = aVar;
        a aVar2 = new a("LevelInfo", 1);
        f20602b = aVar2;
        a aVar3 = new a("LevelWarning", 2);
        f20603c = aVar3;
        a aVar4 = new a("LevelError", 3);
        f20604d = aVar4;
        a aVar5 = new a("LevelNone", 4);
        f20605e = aVar5;
        f20606f = new a[]{aVar, aVar2, aVar3, aVar4, aVar5};
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f20606f.clone();
    }
}
