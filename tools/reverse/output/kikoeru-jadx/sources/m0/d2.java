package m0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class d2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d2 f12847a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final d2 f12848b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final d2 f12849c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ d2[] f12850d;

    static {
        d2 d2Var = new d2("Default", 0);
        f12847a = d2Var;
        d2 d2Var2 = new d2("DismissedToEnd", 1);
        f12848b = d2Var2;
        d2 d2Var3 = new d2("DismissedToStart", 2);
        f12849c = d2Var3;
        f12850d = new d2[]{d2Var, d2Var2, d2Var3};
    }

    public static d2 valueOf(String str) {
        return (d2) Enum.valueOf(d2.class, str);
    }

    public static d2[] values() {
        return (d2[]) f12850d.clone();
    }
}
