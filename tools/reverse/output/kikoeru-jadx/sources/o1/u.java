package o1;

import ce.j0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final u f16127a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final u f16128b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final u f16129c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final u f16130d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ u[] f16131e;

    static {
        u uVar = new u("Active", 0);
        f16127a = uVar;
        u uVar2 = new u("ActiveParent", 1);
        f16128b = uVar2;
        u uVar3 = new u("Captured", 2);
        f16129c = uVar3;
        u uVar4 = new u("Inactive", 3);
        f16130d = uVar4;
        f16131e = new u[]{uVar, uVar2, uVar3, uVar4};
    }

    public static u valueOf(String str) {
        return (u) Enum.valueOf(u.class, str);
    }

    public static u[] values() {
        return (u[]) f16131e.clone();
    }

    public final boolean a() {
        int iOrdinal = ordinal();
        if (iOrdinal == 0 || iOrdinal == 1 || iOrdinal == 2) {
            return true;
        }
        if (iOrdinal == 3) {
            return false;
        }
        throw new j0();
    }

    public final boolean b() {
        int iOrdinal = ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                return false;
            }
            if (iOrdinal != 2) {
                if (iOrdinal == 3) {
                    return false;
                }
                throw new j0();
            }
        }
        return true;
    }
}
