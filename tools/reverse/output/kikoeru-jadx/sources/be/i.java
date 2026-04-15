package be;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i f2788a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final i f2789b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final i f2790c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ i[] f2791d;

    static {
        i iVar = new i("BEGINNING", 0);
        f2788a = iVar;
        i iVar2 = new i("MIDDLE", 1);
        f2789b = iVar2;
        i iVar3 = new i("AFTER_DOT", 2);
        f2790c = iVar3;
        f2791d = new i[]{iVar, iVar2, iVar3};
    }

    public static i valueOf(String str) {
        return (i) Enum.valueOf(i.class, str);
    }

    public static i[] values() {
        return (i[]) f2791d.clone();
    }
}
