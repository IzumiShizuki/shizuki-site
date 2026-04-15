package h0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i0 f7679a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final i0 f7680b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final i0 f7681c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ i0[] f7682d;

    static {
        i0 i0Var = new i0("None", 0);
        f7679a = i0Var;
        i0 i0Var2 = new i0("Selection", 1);
        f7680b = i0Var2;
        i0 i0Var3 = new i0("Cursor", 2);
        f7681c = i0Var3;
        f7682d = new i0[]{i0Var, i0Var2, i0Var3};
    }

    public static i0 valueOf(String str) {
        return (i0) Enum.valueOf(i0.class, str);
    }

    public static i0[] values() {
        return (i0[]) f7682d.clone();
    }
}
