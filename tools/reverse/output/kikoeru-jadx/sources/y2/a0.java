package y2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a0 f25355a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a0 f25356b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a0 f25357c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a0 f25358d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ a0[] f25359e;

    static {
        a0 a0Var = new a0("StartInput", 0);
        f25355a = a0Var;
        a0 a0Var2 = new a0("StopInput", 1);
        f25356b = a0Var2;
        a0 a0Var3 = new a0("ShowKeyboard", 2);
        f25357c = a0Var3;
        a0 a0Var4 = new a0("HideKeyboard", 3);
        f25358d = a0Var4;
        f25359e = new a0[]{a0Var, a0Var2, a0Var3, a0Var4};
    }

    public static a0 valueOf(String str) {
        return (a0) Enum.valueOf(a0.class, str);
    }

    public static a0[] values() {
        return (a0[]) f25359e.clone();
    }
}
