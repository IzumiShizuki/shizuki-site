package x0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class q1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final q1 f24427a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final q1 f24428b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final q1 f24429c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final q1 f24430d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final q1 f24431e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final q1 f24432f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ q1[] f24433g;

    static {
        q1 q1Var = new q1("ShutDown", 0);
        f24427a = q1Var;
        q1 q1Var2 = new q1("ShuttingDown", 1);
        f24428b = q1Var2;
        q1 q1Var3 = new q1("Inactive", 2);
        f24429c = q1Var3;
        q1 q1Var4 = new q1("InactivePendingWork", 3);
        f24430d = q1Var4;
        q1 q1Var5 = new q1("Idle", 4);
        f24431e = q1Var5;
        q1 q1Var6 = new q1("PendingWork", 5);
        f24432f = q1Var6;
        f24433g = new q1[]{q1Var, q1Var2, q1Var3, q1Var4, q1Var5, q1Var6};
    }

    public static q1 valueOf(String str) {
        return (q1) Enum.valueOf(q1.class, str);
    }

    public static q1[] values() {
        return (q1[]) f24433g.clone();
    }
}
