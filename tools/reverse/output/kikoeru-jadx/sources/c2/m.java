package c2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final m f3314a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final m f3315b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final m f3316c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ m[] f3317d;

    static {
        m mVar = new m("Initial", 0);
        f3314a = mVar;
        m mVar2 = new m("Main", 1);
        f3315b = mVar2;
        m mVar3 = new m("Final", 2);
        f3316c = mVar3;
        f3317d = new m[]{mVar, mVar2, mVar3};
    }

    public static m valueOf(String str) {
        return (m) Enum.valueOf(m.class, str);
    }

    public static m[] values() {
        return (m[]) f3317d.clone();
    }
}
