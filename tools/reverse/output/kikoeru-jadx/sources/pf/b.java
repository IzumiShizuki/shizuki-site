package pf;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f17121a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f17122b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f17123c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f17124d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final b f17125e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ b[] f17126f;

    static {
        b bVar = new b("CPU_ACQUIRED", 0);
        f17121a = bVar;
        b bVar2 = new b("BLOCKING", 1);
        f17122b = bVar2;
        b bVar3 = new b("PARKING", 2);
        f17123c = bVar3;
        b bVar4 = new b("DORMANT", 3);
        f17124d = bVar4;
        b bVar5 = new b("TERMINATED", 4);
        f17125e = bVar5;
        f17126f = new b[]{bVar, bVar2, bVar3, bVar4, bVar5};
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f17126f.clone();
    }
}
