package t9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f20565a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f20566b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f20567c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f20568d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f20569e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f20570f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ a[] f20571g;

    static {
        a aVar = new a("TITLE", 0);
        f20565a = aVar;
        a aVar2 = new a("RJ", 1);
        f20566b = aVar2;
        a aVar3 = new a("CIRCLE", 2);
        f20567c = aVar3;
        a aVar4 = new a("VA", 3);
        f20568d = aVar4;
        a aVar5 = new a("TAG", 4);
        f20569e = aVar5;
        a aVar6 = new a("RAW", 5);
        f20570f = aVar6;
        f20571g = new a[]{aVar, aVar2, aVar3, aVar4, aVar5, aVar6};
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f20571g.clone();
    }
}
