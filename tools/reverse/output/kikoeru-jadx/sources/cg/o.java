package cg;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final o f4085a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final o f4086b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final o f4087c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final o f4088d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ o[] f4089e;

    static {
        o oVar = new o("Normal", 0);
        f4085a = oVar;
        o oVar2 = new o("Locked", 1);
        f4086b = oVar2;
        o oVar3 = new o("HorizontalScroll", 2);
        f4087c = oVar3;
        o oVar4 = new o("Ended", 3);
        f4088d = oVar4;
        f4089e = new o[]{oVar, oVar2, oVar3, oVar4};
    }

    public static o valueOf(String str) {
        return (o) Enum.valueOf(o.class, str);
    }

    public static o[] values() {
        return (o[]) f4089e.clone();
    }
}
