package yc;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final n0 f26154a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final x f26155b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final x f26156c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final x f26157d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final x f26158e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ x[] f26159f;

    static {
        x xVar = new x("FINAL", 0);
        f26155b = xVar;
        x xVar2 = new x("SEALED", 1);
        f26156c = xVar2;
        x xVar3 = new x("OPEN", 2);
        f26157d = xVar3;
        x xVar4 = new x("ABSTRACT", 3);
        f26158e = xVar4;
        f26159f = new x[]{xVar, xVar2, xVar3, xVar4};
        f26154a = new n0(5);
    }

    public static x valueOf(String str) {
        return (x) Enum.valueOf(x.class, str);
    }

    public static x[] values() {
        return (x[]) f26159f.clone();
    }
}
