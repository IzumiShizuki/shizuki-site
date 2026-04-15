package cg;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final x f4136a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final x f4137b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ x[] f4138c;

    static {
        x xVar = new x("BRIGHTNESS", 0);
        f4136a = xVar;
        x xVar2 = new x("VOLUME", 1);
        f4137b = xVar2;
        f4138c = new x[]{xVar, xVar2};
    }

    public static x valueOf(String str) {
        return (x) Enum.valueOf(x.class, str);
    }

    public static x[] values() {
        return (x[]) f4138c.clone();
    }
}
