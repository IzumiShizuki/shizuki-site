package l1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f11668a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f11669b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ a[] f11670c;

    static {
        a aVar = new a("SHOW_ORIGINAL", 0);
        f11668a = aVar;
        a aVar2 = new a("SHOW_TRANSLATED", 1);
        f11669b = aVar2;
        f11670c = new a[]{aVar, aVar2};
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f11670c.clone();
    }
}
