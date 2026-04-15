package m4;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class u {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f14587c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f14588d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f14589a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f14590b;

    static {
        int i10 = p4.c0.f16548a;
        f14587c = Integer.toString(0, 36);
        f14588d = Integer.toString(1, 36);
    }

    public u(String str, String str2) {
        this.f14589a = p4.c0.O(str);
        this.f14590b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && u.class == obj.getClass()) {
            u uVar = (u) obj;
            String str = uVar.f14589a;
            int i10 = p4.c0.f16548a;
            if (Objects.equals(this.f14589a, str) && Objects.equals(this.f14590b, uVar.f14590b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.f14590b.hashCode() * 31;
        String str = this.f14589a;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }
}
