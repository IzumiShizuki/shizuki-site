package f6;

import java.util.Objects;
import p4.c0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class e extends i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f6728b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f6729c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f6730d;

    public e(String str, String str2, String str3) {
        super("COMM");
        this.f6728b = str;
        this.f6729c = str2;
        this.f6730d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && e.class == obj.getClass()) {
            e eVar = (e) obj;
            String str = eVar.f6729c;
            int i10 = c0.f16548a;
            if (Objects.equals(this.f6729c, str) && Objects.equals(this.f6728b, eVar.f6728b) && Objects.equals(this.f6730d, eVar.f6730d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f6728b;
        int iHashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f6729c;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f6730d;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // f6.i
    public final String toString() {
        return this.f6740a + ": language=" + this.f6728b + ", description=" + this.f6729c + ", text=" + this.f6730d;
    }
}
