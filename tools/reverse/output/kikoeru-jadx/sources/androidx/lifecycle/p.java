package androidx.lifecycle;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p f794a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final p f795b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final p f796c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final p f797d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final p f798e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ p[] f799f;

    static {
        p pVar = new p("DESTROYED", 0);
        f794a = pVar;
        p pVar2 = new p("INITIALIZED", 1);
        f795b = pVar2;
        p pVar3 = new p("CREATED", 2);
        f796c = pVar3;
        p pVar4 = new p("STARTED", 3);
        f797d = pVar4;
        p pVar5 = new p("RESUMED", 4);
        f798e = pVar5;
        f799f = new p[]{pVar, pVar2, pVar3, pVar4, pVar5};
    }

    public static p valueOf(String str) {
        return (p) Enum.valueOf(p.class, str);
    }

    public static p[] values() {
        return (p[]) f799f.clone();
    }
}
