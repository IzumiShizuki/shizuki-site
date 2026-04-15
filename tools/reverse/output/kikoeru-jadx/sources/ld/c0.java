package ld;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c0 f12191a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c0 f12192b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c0 f12193c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ c0[] f12194d;

    static {
        c0 c0Var = new c0("ONE_COLLECTION_PARAMETER", 0);
        f12191a = c0Var;
        c0 c0Var2 = new c0("OBJECT_PARAMETER_NON_GENERIC", 1);
        f12192b = c0Var2;
        c0 c0Var3 = new c0("OBJECT_PARAMETER_GENERIC", 2);
        f12193c = c0Var3;
        f12194d = new c0[]{c0Var, c0Var2, c0Var3};
    }

    public static c0 valueOf(String str) {
        return (c0) Enum.valueOf(c0.class, str);
    }

    public static c0[] values() {
        return (c0[]) f12194d.clone();
    }
}
