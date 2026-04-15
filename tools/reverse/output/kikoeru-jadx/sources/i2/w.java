package i2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final w f8882a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final w f8883b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final w f8884c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final w f8885d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ w[] f8886e;

    static {
        w wVar = new w("LookaheadMeasurement", 0);
        f8882a = wVar;
        w wVar2 = new w("LookaheadPlacement", 1);
        f8883b = wVar2;
        w wVar3 = new w("Measurement", 2);
        f8884c = wVar3;
        w wVar4 = new w("Placement", 3);
        f8885d = wVar4;
        f8886e = new w[]{wVar, wVar2, wVar3, wVar4};
    }

    public static w valueOf(String str) {
        return (w) Enum.valueOf(w.class, str);
    }

    public static w[] values() {
        return (w[]) f8886e.clone();
    }
}
