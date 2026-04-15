package v0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b0 f22173a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b0 f22174b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ b0[] f22175c;

    static {
        b0 b0Var = new b0("THUMB", 0);
        f22173a = b0Var;
        b0 b0Var2 = new b0("TRACK", 1);
        f22174b = b0Var2;
        f22175c = new b0[]{b0Var, b0Var2};
    }

    public static b0 valueOf(String str) {
        return (b0) Enum.valueOf(b0.class, str);
    }

    public static b0[] values() {
        return (b0[]) f22175c.clone();
    }
}
