package pc;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final m f16975a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final m f16976b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final m f16977c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final m f16978d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ m[] f16979e;

    static {
        m mVar = new m("INSTANCE", 0);
        f16975a = mVar;
        m mVar2 = new m("CONTEXT", 1);
        f16976b = mVar2;
        m mVar3 = new m("EXTENSION_RECEIVER", 2);
        f16977c = mVar3;
        m mVar4 = new m("VALUE", 3);
        f16978d = mVar4;
        f16979e = new m[]{mVar, mVar2, mVar3, mVar4};
    }

    public static m valueOf(String str) {
        return (m) Enum.valueOf(m.class, str);
    }

    public static m[] values() {
        return (m[]) f16979e.clone();
    }
}
