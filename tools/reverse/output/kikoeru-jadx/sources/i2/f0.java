package i2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f0 f8689a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final f0 f8690b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final f0 f8691c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final f0 f8692d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final f0 f8693e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ f0[] f8694f;

    static {
        f0 f0Var = new f0("Measuring", 0);
        f8689a = f0Var;
        f0 f0Var2 = new f0("LookaheadMeasuring", 1);
        f8690b = f0Var2;
        f0 f0Var3 = new f0("LayingOut", 2);
        f8691c = f0Var3;
        f0 f0Var4 = new f0("LookaheadLayingOut", 3);
        f8692d = f0Var4;
        f0 f0Var5 = new f0("Idle", 4);
        f8693e = f0Var5;
        f8694f = new f0[]{f0Var, f0Var2, f0Var3, f0Var4, f0Var5};
    }

    public static f0 valueOf(String str) {
        return (f0) Enum.valueOf(f0.class, str);
    }

    public static f0[] values() {
        return (f0[]) f8694f.clone();
    }
}
