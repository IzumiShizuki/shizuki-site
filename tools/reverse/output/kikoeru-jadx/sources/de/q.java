package de;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final q f5962a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final q f5963b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final q f5964c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ q[] f5965d;

    static {
        q qVar = new q("ALL", 0);
        f5962a = qVar;
        q qVar2 = new q("ONLY_NON_SYNTHESIZED", 1);
        f5963b = qVar2;
        q qVar3 = new q("NONE", 2);
        f5964c = qVar3;
        f5965d = new q[]{qVar, qVar2, qVar3};
    }

    public static q valueOf(String str) {
        return (q) Enum.valueOf(q.class, str);
    }

    public static q[] values() {
        return (q[]) f5965d.clone();
    }
}
