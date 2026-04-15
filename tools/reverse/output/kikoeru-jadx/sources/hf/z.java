package hf;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final z f8616a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final z f8617b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final z f8618c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final z f8619d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ z[] f8620e;

    static {
        z zVar = new z("DEFAULT", 0);
        f8616a = zVar;
        z zVar2 = new z("LAZY", 1);
        f8617b = zVar2;
        z zVar3 = new z("ATOMIC", 2);
        f8618c = zVar3;
        z zVar4 = new z("UNDISPATCHED", 3);
        f8619d = zVar4;
        f8620e = new z[]{zVar, zVar2, zVar3, zVar4};
    }

    public static z valueOf(String str) {
        return (z) Enum.valueOf(z.class, str);
    }

    public static z[] values() {
        return (z[]) f8620e.clone();
    }
}
