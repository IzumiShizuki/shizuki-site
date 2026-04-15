package zb;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f26667a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f26668b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f26669c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ a[] f26670d;

    static {
        a aVar = new a("COROUTINE_SUSPENDED", 0);
        f26667a = aVar;
        a aVar2 = new a("UNDECIDED", 1);
        f26668b = aVar2;
        a aVar3 = new a("RESUMED", 2);
        f26669c = aVar3;
        f26670d = new a[]{aVar, aVar2, aVar3};
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f26670d.clone();
    }
}
