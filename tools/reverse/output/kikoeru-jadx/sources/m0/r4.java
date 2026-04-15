package m0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class r4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final r4 f13548a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final r4 f13549b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final r4 f13550c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ r4[] f13551d;

    static {
        r4 r4Var = new r4("Hidden", 0);
        f13548a = r4Var;
        r4 r4Var2 = new r4("Expanded", 1);
        f13549b = r4Var2;
        r4 r4Var3 = new r4("HalfExpanded", 2);
        f13550c = r4Var3;
        f13551d = new r4[]{r4Var, r4Var2, r4Var3};
    }

    public static r4 valueOf(String str) {
        return (r4) Enum.valueOf(r4.class, str);
    }

    public static r4[] values() {
        return (r4[]) f13551d.clone();
    }
}
