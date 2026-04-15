package td;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f20676a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final e f20677b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ e[] f20678c;

    static {
        e eVar = new e("READ_ONLY", 0);
        f20676a = eVar;
        e eVar2 = new e("MUTABLE", 1);
        f20677b = eVar2;
        f20678c = new e[]{eVar, eVar2};
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) f20678c.clone();
    }
}
