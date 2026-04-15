package y;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j0 f25152a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ j0[] f25153b;

    /* JADX INFO: Fake field, exist only in values array */
    j0 EF0;

    static {
        j0 j0Var = new j0("Visible", 0);
        j0 j0Var2 = new j0("Clip", 1);
        f25152a = j0Var2;
        f25153b = new j0[]{j0Var, j0Var2, new j0("ExpandIndicator", 2), new j0("ExpandOrCollapseIndicator", 3)};
    }

    public static j0 valueOf(String str) {
        return (j0) Enum.valueOf(j0.class, str);
    }

    public static j0[] values() {
        return (j0[]) f25153b.clone();
    }
}
