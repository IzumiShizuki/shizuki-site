package qf;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i f18255a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final i f18256b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final i f18257c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final i f18258d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ i[] f18259e;

    static {
        i iVar = new i("SUCCESSFUL", 0);
        f18255a = iVar;
        i iVar2 = new i("REREGISTER", 1);
        f18256b = iVar2;
        i iVar3 = new i("CANCELLED", 2);
        f18257c = iVar3;
        i iVar4 = new i("ALREADY_SELECTED", 3);
        f18258d = iVar4;
        f18259e = new i[]{iVar, iVar2, iVar3, iVar4};
    }

    public static i valueOf(String str) {
        return (i) Enum.valueOf(i.class, str);
    }

    public static i[] values() {
        return (i[]) f18259e.clone();
    }
}
