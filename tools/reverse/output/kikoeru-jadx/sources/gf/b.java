package gf;

import java.io.Serializable;
import jc.l;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class b implements Comparable, Serializable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f7539c = new b(0, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f7540a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f7541b;

    public b(long j10, long j11) {
        this.f7540a = j10;
        this.f7541b = j11;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        b bVar = (b) obj;
        l.e(bVar, "other");
        long j10 = bVar.f7540a;
        long j11 = this.f7540a;
        if (j11 != j10) {
            return Long.compare(j11 ^ Long.MIN_VALUE, j10 ^ Long.MIN_VALUE);
        }
        return Long.compare(this.f7541b ^ Long.MIN_VALUE, bVar.f7541b ^ Long.MIN_VALUE);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f7540a == bVar.f7540a && this.f7541b == bVar.f7541b;
    }

    public final int hashCode() {
        long j10 = this.f7540a ^ this.f7541b;
        return (int) (j10 ^ (j10 >>> 32));
    }

    public final String toString() {
        byte[] bArr = new byte[36];
        lc.b.u(this.f7540a, bArr, 0, 0, 4);
        bArr[8] = 45;
        lc.b.u(this.f7540a, bArr, 9, 4, 6);
        bArr[13] = 45;
        lc.b.u(this.f7540a, bArr, 14, 6, 8);
        bArr[18] = 45;
        lc.b.u(this.f7541b, bArr, 19, 0, 2);
        bArr[23] = 45;
        lc.b.u(this.f7541b, bArr, 24, 2, 8);
        return new String(bArr, ef.a.f6541a);
    }
}
