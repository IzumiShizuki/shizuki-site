package ub;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f21532a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final d f21533b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final d f21534c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ d[] f21535d;

    static {
        d dVar = new d("WARNING", 0);
        f21532a = dVar;
        d dVar2 = new d("ERROR", 1);
        f21533b = dVar2;
        d dVar3 = new d("HIDDEN", 2);
        f21534c = dVar3;
        f21535d = new d[]{dVar, dVar2, dVar3};
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) f21535d.clone();
    }
}
