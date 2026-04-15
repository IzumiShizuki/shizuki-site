package lf;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final r0 f12484a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final r0 f12485b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final r0 f12486c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ r0[] f12487d;

    static {
        r0 r0Var = new r0("START", 0);
        f12484a = r0Var;
        r0 r0Var2 = new r0("STOP", 1);
        f12485b = r0Var2;
        r0 r0Var3 = new r0("STOP_AND_RESET_REPLAY_CACHE", 2);
        f12486c = r0Var3;
        f12487d = new r0[]{r0Var, r0Var2, r0Var3};
    }

    public static r0 valueOf(String str) {
        return (r0) Enum.valueOf(r0.class, str);
    }

    public static r0[] values() {
        return (r0[]) f12487d.clone();
    }
}
