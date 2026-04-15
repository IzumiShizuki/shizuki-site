package de;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final t f5969a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final s f5970b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ u[] f5971c;

    static {
        t tVar = new t();
        f5969a = tVar;
        s sVar = new s();
        f5970b = sVar;
        f5971c = new u[]{tVar, sVar};
    }

    public static u valueOf(String str) {
        return (u) Enum.valueOf(u.class, str);
    }

    public static u[] values() {
        return (u[]) f5971c.clone();
    }

    public abstract String a(String str);
}
