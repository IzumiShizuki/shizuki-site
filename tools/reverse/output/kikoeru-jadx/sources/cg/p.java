package cg;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p f4094a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final p f4095b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ p[] f4096c;

    static {
        p pVar = new p("AUTO", 0);
        f4094a = pVar;
        p pVar2 = new p("ENABLE", 1);
        p pVar3 = new p("DISABLE", 2);
        f4095b = pVar3;
        f4096c = new p[]{pVar, pVar2, pVar3};
    }

    public static p valueOf(String str) {
        return (p) Enum.valueOf(p.class, str);
    }

    public static p[] values() {
        return (p[]) f4096c.clone();
    }
}
