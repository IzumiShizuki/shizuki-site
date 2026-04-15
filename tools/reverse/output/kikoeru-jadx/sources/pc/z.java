package pc;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final z f16984a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final z f16985b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final z f16986c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ z[] f16987d;

    static {
        z zVar = new z("INVARIANT", 0);
        f16984a = zVar;
        z zVar2 = new z("IN", 1);
        f16985b = zVar2;
        z zVar3 = new z("OUT", 2);
        f16986c = zVar3;
        f16987d = new z[]{zVar, zVar2, zVar3};
    }

    public static z valueOf(String str) {
        return (z) Enum.valueOf(z.class, str);
    }

    public static z[] values() {
        return (z[]) f16987d.clone();
    }
}
