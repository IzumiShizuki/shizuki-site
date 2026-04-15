package c2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final y f3351a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final y f3352b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final y f3353c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ y[] f3354d;

    static {
        y yVar = new y("Unknown", 0);
        f3351a = yVar;
        y yVar2 = new y("Dispatching", 1);
        f3352b = yVar2;
        y yVar3 = new y("NotDispatching", 2);
        f3353c = yVar3;
        f3354d = new y[]{yVar, yVar2, yVar3};
    }

    public static y valueOf(String str) {
        return (y) Enum.valueOf(y.class, str);
    }

    public static y[] values() {
        return (y[]) f3354d.clone();
    }
}
