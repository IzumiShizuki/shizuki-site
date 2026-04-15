package l1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f11694a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final e f11695b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ e[] f11696c;

    static {
        e eVar = new e("VIEW_APPEAR", 0);
        f11694a = eVar;
        e eVar2 = new e("VIEW_DISAPPEAR", 1);
        f11695b = eVar2;
        f11696c = new e[]{eVar, eVar2};
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) f11696c.clone();
    }
}
