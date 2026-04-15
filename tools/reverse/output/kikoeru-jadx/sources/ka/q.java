package ka;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final q f11303a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final q f11304b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final q f11305c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final q f11306d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ q[] f11307e;

    static {
        q qVar = new q("EMPTY", 0);
        f11303a = qVar;
        q qVar2 = new q("LOADING", 1);
        f11304b = qVar2;
        q qVar3 = new q("ERROR", 2);
        f11305c = qVar3;
        q qVar4 = new q("SUCCESS", 3);
        f11306d = qVar4;
        f11307e = new q[]{qVar, qVar2, qVar3, qVar4};
    }

    public static q valueOf(String str) {
        return (q) Enum.valueOf(q.class, str);
    }

    public static q[] values() {
        return (q[]) f11307e.clone();
    }
}
