package n7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final n f15553a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final n f15554b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final n f15555c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ n[] f15556d;

    static {
        n nVar = new n("NO_OP", 0);
        f15553a = nVar;
        n nVar2 = new n("ADD", 1);
        f15554b = nVar2;
        n nVar3 = new n("REMOVE", 2);
        f15555c = nVar3;
        f15556d = new n[]{nVar, nVar2, nVar3};
    }

    public static n valueOf(String str) {
        return (n) Enum.valueOf(n.class, str);
    }

    public static n[] values() {
        return (n[]) f15556d.clone();
    }
}
