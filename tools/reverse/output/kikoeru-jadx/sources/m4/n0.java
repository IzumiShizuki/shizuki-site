package m4;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m0[] f14409a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f14410b;

    public n0(m0... m0VarArr) {
        this(-9223372036854775807L, m0VarArr);
    }

    public final n0 a(m0... m0VarArr) {
        if (m0VarArr.length == 0) {
            return this;
        }
        int i10 = p4.c0.f16548a;
        m0[] m0VarArr2 = this.f14409a;
        Object[] objArrCopyOf = Arrays.copyOf(m0VarArr2, m0VarArr2.length + m0VarArr.length);
        System.arraycopy(m0VarArr, 0, objArrCopyOf, m0VarArr2.length, m0VarArr.length);
        return new n0(this.f14410b, (m0[]) objArrCopyOf);
    }

    public final n0 b(n0 n0Var) {
        return n0Var == null ? this : a(n0Var.f14409a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && n0.class == obj.getClass()) {
            n0 n0Var = (n0) obj;
            if (Arrays.equals(this.f14409a, n0Var.f14409a) && this.f14410b == n0Var.f14410b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return gh.g.y(this.f14410b) + (Arrays.hashCode(this.f14409a) * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("entries=");
        sb.append(Arrays.toString(this.f14409a));
        long j10 = this.f14410b;
        if (j10 == -9223372036854775807L) {
            str = "";
        } else {
            str = ", presentationTimeUs=" + j10;
        }
        sb.append(str);
        return sb.toString();
    }

    public n0(long j10, m0... m0VarArr) {
        this.f14410b = j10;
        this.f14409a = m0VarArr;
    }

    public n0(List list) {
        this((m0[]) list.toArray(new m0[0]));
    }
}
