package t8;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f20555a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final d f20556b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final d f20557c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ d[] f20558d;

    static {
        d dVar = new d("EXACT", 0);
        f20555a = dVar;
        d dVar2 = new d("INEXACT", 1);
        f20556b = dVar2;
        d dVar3 = new d("AUTOMATIC", 2);
        f20557c = dVar3;
        f20558d = new d[]{dVar, dVar2, dVar3};
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) f20558d.clone();
    }
}
