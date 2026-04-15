package f6;

import java.util.Arrays;
import java.util.Objects;
import p4.c0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class f extends i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f6731b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f6732c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f6733d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final byte[] f6734e;

    public f(String str, String str2, String str3, byte[] bArr) {
        super("GEOB");
        this.f6731b = str;
        this.f6732c = str2;
        this.f6733d = str3;
        this.f6734e = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && f.class == obj.getClass()) {
            f fVar = (f) obj;
            String str = fVar.f6731b;
            int i10 = c0.f16548a;
            if (Objects.equals(this.f6731b, str) && Objects.equals(this.f6732c, fVar.f6732c) && Objects.equals(this.f6733d, fVar.f6733d) && Arrays.equals(this.f6734e, fVar.f6734e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f6731b;
        int iHashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f6732c;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f6733d;
        return Arrays.hashCode(this.f6734e) + ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    @Override // f6.i
    public final String toString() {
        return this.f6740a + ": mimeType=" + this.f6731b + ", filename=" + this.f6732c + ", description=" + this.f6733d;
    }
}
