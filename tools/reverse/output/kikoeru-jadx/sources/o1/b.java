package o1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f16080a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f16081b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f16082c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ b[] f16083d;

    static {
        b bVar = new b("None", 0);
        f16080a = bVar;
        b bVar2 = new b("Cancelled", 1);
        f16081b = bVar2;
        b bVar3 = new b("Redirected", 2);
        f16082c = bVar3;
        f16083d = new b[]{bVar, bVar2, bVar3, new b("RedirectCancelled", 3)};
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f16083d.clone();
    }
}
