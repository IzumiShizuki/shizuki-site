package td;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f20680a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final g f20681b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final g f20682c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ g[] f20683d;

    static {
        g gVar = new g("FORCE_FLEXIBILITY", 0);
        f20680a = gVar;
        g gVar2 = new g("NULLABLE", 1);
        f20681b = gVar2;
        g gVar3 = new g("NOT_NULL", 2);
        f20682c = gVar3;
        f20683d = new g[]{gVar, gVar2, gVar3};
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) f20683d.clone();
    }
}
