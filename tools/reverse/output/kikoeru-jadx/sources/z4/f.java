package z4;

import java.util.Objects;
import p4.c0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f26414a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f26415b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f26416c;

    public f(String str, String str2, String str3) {
        this.f26414a = str;
        this.f26415b = str2;
        this.f26416c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && f.class == obj.getClass()) {
            f fVar = (f) obj;
            String str = fVar.f26414a;
            int i10 = c0.f16548a;
            if (Objects.equals(this.f26414a, str) && Objects.equals(this.f26415b, fVar.f26415b) && Objects.equals(this.f26416c, fVar.f26416c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.f26414a.hashCode() * 31;
        String str = this.f26415b;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f26416c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }
}
