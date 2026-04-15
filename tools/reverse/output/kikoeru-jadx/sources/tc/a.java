package tc;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f20610a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f20611b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ a[] f20612c;

    static {
        a aVar = new a("CALL_BY_NAME", 0);
        f20610a = aVar;
        a aVar2 = new a("POSITIONAL_CALL", 1);
        f20611b = aVar2;
        f20612c = new a[]{aVar, aVar2};
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f20612c.clone();
    }
}
