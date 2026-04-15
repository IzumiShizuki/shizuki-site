package f6;

import j2.h0;
import java.util.Objects;
import p4.c0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class o extends i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f6754b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f6755c;

    public o(String str, String str2, String str3) {
        super(str);
        this.f6754b = str2;
        this.f6755c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && o.class == obj.getClass()) {
            o oVar = (o) obj;
            if (this.f6740a.equals(oVar.f6740a)) {
                String str = oVar.f6754b;
                int i10 = c0.f16548a;
                if (Objects.equals(this.f6754b, str) && Objects.equals(this.f6755c, oVar.f6755c)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iE = h0.e(527, 31, this.f6740a);
        String str = this.f6754b;
        int iHashCode = (iE + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f6755c;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // f6.i
    public final String toString() {
        return this.f6740a + ": url=" + this.f6755c;
    }
}
