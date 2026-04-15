package m0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class b2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b2 f12718a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b2 f12719b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ b2[] f12720c;

    static {
        b2 b2Var = new b2("StartToEnd", 0);
        f12718a = b2Var;
        b2 b2Var2 = new b2("EndToStart", 1);
        f12719b = b2Var2;
        f12720c = new b2[]{b2Var, b2Var2};
    }

    public static b2 valueOf(String str) {
        return (b2) Enum.valueOf(b2.class, str);
    }

    public static b2[] values() {
        return (b2[]) f12720c.clone();
    }
}
