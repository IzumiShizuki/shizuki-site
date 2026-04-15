package f3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final m f6667a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final m f6668b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ m[] f6669c;

    static {
        m mVar = new m("Ltr", 0);
        f6667a = mVar;
        m mVar2 = new m("Rtl", 1);
        f6668b = mVar2;
        f6669c = new m[]{mVar, mVar2};
    }

    public static m valueOf(String str) {
        return (m) Enum.valueOf(m.class, str);
    }

    public static m[] values() {
        return (m[]) f6669c.clone();
    }
}
