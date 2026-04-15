package re;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final k f19005a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final k f19006b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final k f19007c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ k[] f19008d;

    static {
        k kVar = new k("NOT_COMPUTED", 0);
        f19005a = kVar;
        k kVar2 = new k("COMPUTING", 1);
        f19006b = kVar2;
        k kVar3 = new k("RECURSION_WAS_DETECTED", 2);
        f19007c = kVar3;
        f19008d = new k[]{kVar, kVar2, kVar3};
    }

    public static k valueOf(String str) {
        return (k) Enum.valueOf(k.class, str);
    }

    public static k[] values() {
        return (k[]) f19008d.clone();
    }
}
