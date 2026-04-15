package u;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class e1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e1 f20882a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final e1 f20883b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ e1[] f20884c;

    static {
        e1 e1Var = new e1("Vertical", 0);
        f20882a = e1Var;
        e1 e1Var2 = new e1("Horizontal", 1);
        f20883b = e1Var2;
        f20884c = new e1[]{e1Var, e1Var2};
    }

    public static e1 valueOf(String str) {
        return (e1) Enum.valueOf(e1.class, str);
    }

    public static e1[] values() {
        return (e1[]) f20884c.clone();
    }
}
