package q;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f0 f17290a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final f0 f17291b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final f0 f17292c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ f0[] f17293d;

    static {
        f0 f0Var = new f0("PreEnter", 0);
        f17290a = f0Var;
        f0 f0Var2 = new f0("Visible", 1);
        f17291b = f0Var2;
        f0 f0Var3 = new f0("PostExit", 2);
        f17292c = f0Var3;
        f17293d = new f0[]{f0Var, f0Var2, f0Var3};
    }

    public static f0 valueOf(String str) {
        return (f0) Enum.valueOf(f0.class, str);
    }

    public static f0[] values() {
        return (f0[]) f17293d.clone();
    }
}
