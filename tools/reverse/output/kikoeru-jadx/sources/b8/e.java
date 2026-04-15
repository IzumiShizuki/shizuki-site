package b8;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f2242a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final e f2243b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final e f2244c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final e f2245d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final e f2246e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ e[] f2247f;

    static {
        e eVar = new e("ON_CONFIGURE", 0);
        f2242a = eVar;
        e eVar2 = new e("ON_CREATE", 1);
        f2243b = eVar2;
        e eVar3 = new e("ON_UPGRADE", 2);
        f2244c = eVar3;
        e eVar4 = new e("ON_DOWNGRADE", 3);
        f2245d = eVar4;
        e eVar5 = new e("ON_OPEN", 4);
        f2246e = eVar5;
        f2247f = new e[]{eVar, eVar2, eVar3, eVar4, eVar5};
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) f2247f.clone();
    }
}
