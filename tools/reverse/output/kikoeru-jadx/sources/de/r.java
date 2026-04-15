package de;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final r f5966a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final r f5967b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ r[] f5968c;

    /* JADX INFO: Fake field, exist only in values array */
    r EF0;

    static {
        r rVar = new r("PRETTY", 0);
        r rVar2 = new r("DEBUG", 1);
        f5966a = rVar2;
        r rVar3 = new r("NONE", 2);
        f5967b = rVar3;
        f5968c = new r[]{rVar, rVar2, rVar3};
    }

    public static r valueOf(String str) {
        return (r) Enum.valueOf(r.class, str);
    }

    public static r[] values() {
        return (r[]) f5968c.clone();
    }
}
