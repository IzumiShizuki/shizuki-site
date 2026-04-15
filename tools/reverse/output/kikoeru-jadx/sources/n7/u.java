package n7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final u f15572a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final u f15573b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ u[] f15574c;

    /* JADX INFO: Fake field, exist only in values array */
    u EF0;

    static {
        u uVar = new u("AUTOMATIC", 0);
        u uVar2 = new u("TRUNCATE", 1);
        f15572a = uVar2;
        u uVar3 = new u("WRITE_AHEAD_LOGGING", 2);
        f15573b = uVar3;
        f15574c = new u[]{uVar, uVar2, uVar3};
    }

    public static u valueOf(String str) {
        return (u) Enum.valueOf(u.class, str);
    }

    public static u[] values() {
        return (u[]) f15574c.clone();
    }
}
