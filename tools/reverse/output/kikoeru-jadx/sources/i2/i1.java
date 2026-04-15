package i2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class i1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i1 f8729a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final i1 f8730b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ i1[] f8731c;

    static {
        i1 i1Var = new i1("Min", 0);
        f8729a = i1Var;
        i1 i1Var2 = new i1("Max", 1);
        f8730b = i1Var2;
        f8731c = new i1[]{i1Var, i1Var2};
    }

    public static i1 valueOf(String str) {
        return (i1) Enum.valueOf(i1.class, str);
    }

    public static i1[] values() {
        return (i1[]) f8731c.clone();
    }
}
