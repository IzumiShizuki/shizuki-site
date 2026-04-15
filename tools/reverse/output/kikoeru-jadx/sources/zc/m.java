package zc;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final m f26706a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final m f26707b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final m f26708c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ m[] f26709d;

    static {
        m mVar = new m("RUNTIME", 0);
        f26706a = mVar;
        m mVar2 = new m("BINARY", 1);
        f26707b = mVar2;
        m mVar3 = new m("SOURCE", 2);
        f26708c = mVar3;
        f26709d = new m[]{mVar, mVar2, mVar3};
    }

    public static m valueOf(String str) {
        return (m) Enum.valueOf(m.class, str);
    }

    public static m[] values() {
        return (m[]) f26709d.clone();
    }
}
