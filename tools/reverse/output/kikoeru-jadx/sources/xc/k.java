package xc;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final k f24936a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final k f24937b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final k f24938c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final k f24939d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final k f24940e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ k[] f24941f;

    static {
        k kVar = new k("HIDDEN", 0);
        f24936a = kVar;
        k kVar2 = new k("VISIBLE", 1);
        f24937b = kVar2;
        k kVar3 = new k("DEPRECATED_LIST_METHODS", 2);
        f24938c = kVar3;
        k kVar4 = new k("NOT_CONSIDERED", 3);
        f24939d = kVar4;
        k kVar5 = new k("DROP", 4);
        f24940e = kVar5;
        f24941f = new k[]{kVar, kVar2, kVar3, kVar4, kVar5};
    }

    public static k valueOf(String str) {
        return (k) Enum.valueOf(k.class, str);
    }

    public static k[] values() {
        return (k[]) f24941f.clone();
    }
}
