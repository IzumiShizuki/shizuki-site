package t2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i f20336a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final i f20337b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final i f20338c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final i f20339d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final i f20340e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final i f20341f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final i f20342g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ i[] f20343h;

    static {
        i iVar = new i("Paragraph", 0);
        f20336a = iVar;
        i iVar2 = new i("Span", 1);
        f20337b = iVar2;
        i iVar3 = new i("VerbatimTts", 2);
        f20338c = iVar3;
        i iVar4 = new i("Url", 3);
        f20339d = iVar4;
        i iVar5 = new i("Link", 4);
        f20340e = iVar5;
        i iVar6 = new i("Clickable", 5);
        f20341f = iVar6;
        i iVar7 = new i("String", 6);
        f20342g = iVar7;
        f20343h = new i[]{iVar, iVar2, iVar3, iVar4, iVar5, iVar6, iVar7};
    }

    public static i valueOf(String str) {
        return (i) Enum.valueOf(i.class, str);
    }

    public static i[] values() {
        return (i[]) f20343h.clone();
    }
}
