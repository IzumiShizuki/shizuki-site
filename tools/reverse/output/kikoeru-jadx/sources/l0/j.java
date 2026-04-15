package l0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j f11507a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final j f11508b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final j f11509c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ j[] f11510d;

    static {
        j jVar = new j("BEFORE", 0);
        f11507a = jVar;
        j jVar2 = new j("ON", 1);
        f11508b = jVar2;
        j jVar3 = new j("AFTER", 2);
        f11509c = jVar3;
        f11510d = new j[]{jVar, jVar2, jVar3};
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) f11510d.clone();
    }
}
