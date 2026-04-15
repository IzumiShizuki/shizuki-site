package ua;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f21491a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ b[] f21492b;

    /* JADX INFO: Fake field, exist only in values array */
    b EF0;

    static {
        b bVar = new b("NONE", 0);
        b bVar2 = new b("COMPLEMENTARY", 1);
        b bVar3 = new b("ANALOGOUS", 2);
        b bVar4 = new b("SPLIT_COMPLEMENTARY", 3);
        b bVar5 = new b("TRIADIC", 4);
        b bVar6 = new b("TETRADIC", 5);
        b bVar7 = new b("MONOCHROMATIC", 6);
        b bVar8 = new b("SHADES", 7);
        f21491a = bVar8;
        f21492b = new b[]{bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7, bVar8};
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f21492b.clone();
    }
}
