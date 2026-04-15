package i2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class c2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c2 f8657a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c2 f8658b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c2 f8659c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ c2[] f8660d;

    static {
        c2 c2Var = new c2("ContinueTraversal", 0);
        f8657a = c2Var;
        c2 c2Var2 = new c2("SkipSubtreeAndContinueTraversal", 1);
        f8658b = c2Var2;
        c2 c2Var3 = new c2("CancelTraversal", 2);
        f8659c = c2Var3;
        f8660d = new c2[]{c2Var, c2Var2, c2Var3};
    }

    public static c2 valueOf(String str) {
        return (c2) Enum.valueOf(c2.class, str);
    }

    public static c2[] values() {
        return (c2[]) f8660d.clone();
    }
}
