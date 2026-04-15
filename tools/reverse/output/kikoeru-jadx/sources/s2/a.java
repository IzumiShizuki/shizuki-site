package s2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f19356a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f19357b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f19358c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ a[] f19359d;

    static {
        a aVar = new a("On", 0);
        f19356a = aVar;
        a aVar2 = new a("Off", 1);
        f19357b = aVar2;
        a aVar3 = new a("Indeterminate", 2);
        f19358c = aVar3;
        f19359d = new a[]{aVar, aVar2, aVar3};
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f19359d.clone();
    }
}
