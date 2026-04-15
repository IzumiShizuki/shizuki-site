package de;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p f5959a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final p f5960b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ p[] f5961c;

    static {
        p pVar = new p("RENDER_OVERRIDE", 0);
        f5959a = pVar;
        p pVar2 = new p("RENDER_OPEN", 1);
        f5960b = pVar2;
        f5961c = new p[]{pVar, pVar2, new p("RENDER_OPEN_OVERRIDE", 2)};
    }

    public static p valueOf(String str) {
        return (p) Enum.valueOf(p.class, str);
    }

    public static p[] values() {
        return (p[]) f5961c.clone();
    }
}
