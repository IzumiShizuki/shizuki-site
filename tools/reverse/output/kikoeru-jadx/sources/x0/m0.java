package x0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final m0 f24351a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final m0 f24352b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final m0 f24353c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final m0 f24354d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ m0[] f24355e;

    static {
        m0 m0Var = new m0("IGNORED", 0);
        f24351a = m0Var;
        m0 m0Var2 = new m0("SCHEDULED", 1);
        f24352b = m0Var2;
        m0 m0Var3 = new m0("DEFERRED", 2);
        f24353c = m0Var3;
        m0 m0Var4 = new m0("IMMINENT", 3);
        f24354d = m0Var4;
        f24355e = new m0[]{m0Var, m0Var2, m0Var3, m0Var4};
    }

    public static m0 valueOf(String str) {
        return (m0) Enum.valueOf(m0.class, str);
    }

    public static m0[] values() {
        return (m0[]) f24355e.clone();
    }
}
