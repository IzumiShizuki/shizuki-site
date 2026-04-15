package uh;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a0 f21948a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a0 f21949b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ a0[] f21950c;

    static {
        a0 a0Var = new a0("BACKWARD", 0);
        f21948a = a0Var;
        a0 a0Var2 = new a0("FORWARD", 1);
        f21949b = a0Var2;
        f21950c = new a0[]{a0Var, a0Var2};
    }

    public static a0 valueOf(String str) {
        return (a0) Enum.valueOf(a0.class, str);
    }

    public static a0[] values() {
        return (a0[]) f21950c.clone();
    }
}
