package f6;

import java.util.Arrays;
import java.util.Objects;
import p4.c0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class m extends i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f6750b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f6751c;

    public m(byte[] bArr, String str) {
        super("PRIV");
        this.f6750b = str;
        this.f6751c = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && m.class == obj.getClass()) {
            m mVar = (m) obj;
            String str = mVar.f6750b;
            int i10 = c0.f16548a;
            if (Objects.equals(this.f6750b, str) && Arrays.equals(this.f6751c, mVar.f6751c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f6750b;
        return Arrays.hashCode(this.f6751c) + ((527 + (str != null ? str.hashCode() : 0)) * 31);
    }

    @Override // f6.i
    public final String toString() {
        return this.f6740a + ": owner=" + this.f6750b;
    }
}
