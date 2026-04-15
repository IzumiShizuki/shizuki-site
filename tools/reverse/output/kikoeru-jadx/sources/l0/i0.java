package l0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i0 f11500a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final i0 f11501b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final i0 f11502c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ i0[] f11503d;

    static {
        i0 i0Var = new i0("Left", 0);
        f11500a = i0Var;
        i0 i0Var2 = new i0("Middle", 1);
        f11501b = i0Var2;
        i0 i0Var3 = new i0("Right", 2);
        f11502c = i0Var3;
        f11503d = new i0[]{i0Var, i0Var2, i0Var3};
    }

    public static i0 valueOf(String str) {
        return (i0) Enum.valueOf(i0.class, str);
    }

    public static i0[] values() {
        return (i0[]) f11503d.clone();
    }
}
