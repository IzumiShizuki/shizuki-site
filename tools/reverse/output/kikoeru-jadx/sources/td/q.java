package td;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final q f20714a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final q f20715b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final q f20716c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ q[] f20717d;

    static {
        q qVar = new q("FLEXIBLE_LOWER", 0);
        f20714a = qVar;
        q qVar2 = new q("FLEXIBLE_UPPER", 1);
        f20715b = qVar2;
        q qVar3 = new q("INFLEXIBLE", 2);
        f20716c = qVar3;
        f20717d = new q[]{qVar, qVar2, qVar3};
    }

    public static q valueOf(String str) {
        return (q) Enum.valueOf(q.class, str);
    }

    public static q[] values() {
        return (q[]) f20717d.clone();
    }
}
