package n7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final z f15595a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final z f15596b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ z[] f15597c;

    static {
        z zVar = new z("DEFERRED", 0);
        f15595a = zVar;
        z zVar2 = new z("IMMEDIATE", 1);
        f15596b = zVar2;
        f15597c = new z[]{zVar, zVar2, new z("EXCLUSIVE", 2)};
    }

    public static z valueOf(String str) {
        return (z) Enum.valueOf(z.class, str);
    }

    public static z[] values() {
        return (z[]) f15597c.clone();
    }
}
