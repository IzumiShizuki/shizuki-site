package e3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j f6078a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final j f6079b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ j[] f6080c;

    static {
        j jVar = new j("Ltr", 0);
        f6078a = jVar;
        j jVar2 = new j("Rtl", 1);
        f6079b = jVar2;
        f6080c = new j[]{jVar, jVar2};
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) f6080c.clone();
    }
}
