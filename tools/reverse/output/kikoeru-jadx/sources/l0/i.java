package l0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i f11496a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final i f11497b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final i f11498c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ i[] f11499d;

    static {
        i iVar = new i("CROSSED", 0);
        f11496a = iVar;
        i iVar2 = new i("NOT_CROSSED", 1);
        f11497b = iVar2;
        i iVar3 = new i("COLLAPSED", 2);
        f11498c = iVar3;
        f11499d = new i[]{iVar, iVar2, iVar3};
    }

    public static i valueOf(String str) {
        return (i) Enum.valueOf(i.class, str);
    }

    public static i[] values() {
        return (i[]) f11499d.clone();
    }
}
