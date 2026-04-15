package f6;

import java.util.Objects;
import p4.c0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class k extends i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f6742b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f6743c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f6744d;

    public k(String str, String str2, String str3) {
        super("----");
        this.f6742b = str;
        this.f6743c = str2;
        this.f6744d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && k.class == obj.getClass()) {
            k kVar = (k) obj;
            String str = kVar.f6743c;
            int i10 = c0.f16548a;
            if (Objects.equals(this.f6743c, str) && Objects.equals(this.f6742b, kVar.f6742b) && Objects.equals(this.f6744d, kVar.f6744d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f6742b;
        int iHashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f6743c;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f6744d;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // f6.i
    public final String toString() {
        return this.f6740a + ": domain=" + this.f6742b + ", description=" + this.f6743c;
    }
}
