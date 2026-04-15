package j8;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f10613a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final f f10614b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final f f10615c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final f f10616d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ f[] f10617e;

    static {
        f fVar = new f("MEMORY_CACHE", 0);
        f10613a = fVar;
        f fVar2 = new f("MEMORY", 1);
        f10614b = fVar2;
        f fVar3 = new f("DISK", 2);
        f10615c = fVar3;
        f fVar4 = new f("NETWORK", 3);
        f10616d = fVar4;
        f10617e = new f[]{fVar, fVar2, fVar3, fVar4};
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) f10617e.clone();
    }
}
