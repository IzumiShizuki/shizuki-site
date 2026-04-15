package i7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class j2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j2 f9179a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ j2[] f9180b;

    static {
        j2 j2Var = new j2("LAUNCH_INITIAL_REFRESH", 0);
        f9179a = j2Var;
        f9180b = new j2[]{j2Var, new j2("SKIP_INITIAL_REFRESH", 1)};
    }

    public static j2 valueOf(String str) {
        return (j2) Enum.valueOf(j2.class, str);
    }

    public static j2[] values() {
        return (j2[]) f9180b.clone();
    }
}
