package m0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class s3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final s3 f13595a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final s3 f13596b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final s3 f13597c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ s3[] f13598d;

    static {
        s3 s3Var = new s3("Focused", 0);
        f13595a = s3Var;
        s3 s3Var2 = new s3("UnfocusedEmpty", 1);
        f13596b = s3Var2;
        s3 s3Var3 = new s3("UnfocusedNotEmpty", 2);
        f13597c = s3Var3;
        f13598d = new s3[]{s3Var, s3Var2, s3Var3};
    }

    public static s3 valueOf(String str) {
        return (s3) Enum.valueOf(s3.class, str);
    }

    public static s3[] values() {
        return (s3[]) f13598d.clone();
    }
}
