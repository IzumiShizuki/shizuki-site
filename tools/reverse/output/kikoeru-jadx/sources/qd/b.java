package qd;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f18144a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f18145b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f18146c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ b[] f18147d;

    static {
        b bVar = new b("INFLEXIBLE", 0);
        f18144a = bVar;
        b bVar2 = new b("FLEXIBLE_UPPER_BOUND", 1);
        f18145b = bVar2;
        b bVar3 = new b("FLEXIBLE_LOWER_BOUND", 2);
        f18146c = bVar3;
        f18147d = new b[]{bVar, bVar2, bVar3};
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f18147d.clone();
    }
}
