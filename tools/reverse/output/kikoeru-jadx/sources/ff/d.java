package ff;

import com.tencent.bugly.beta.tinker.TinkerReport;
import java.io.Serializable;
import jc.l;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class d implements Comparable, Serializable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final d f7068c = new d(-31557014167219200L, 0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final d f7069d = new d(31556889864403199L, 999999999);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f7070a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f7071b;

    public d(long j10, int i10) {
        this.f7070a = j10;
        this.f7071b = i10;
        if (-31557014167219200L > j10 || j10 >= 31556889864403200L) {
            throw new IllegalArgumentException("Instant exceeds minimum or maximum instant");
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        d dVar = (d) obj;
        l.e(dVar, "other");
        int iH = l.h(this.f7070a, dVar.f7070a);
        return iH != 0 ? iH : l.g(this.f7071b, dVar.f7071b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f7070a == dVar.f7070a && this.f7071b == dVar.f7071b;
    }

    public final int hashCode() {
        long j10 = this.f7070a;
        return (this.f7071b * 51) + ((int) (j10 ^ (j10 >>> 32)));
    }

    public final String toString() {
        long j10;
        long j11;
        int[] iArr;
        StringBuilder sb = new StringBuilder();
        long j12 = this.f7070a;
        long j13 = j12 / 86400;
        if ((j12 ^ 86400) < 0 && j13 * 86400 != j12) {
            j13--;
        }
        long j14 = j12 % 86400;
        int i10 = (int) (j14 + (86400 & (((j14 ^ 86400) & ((-j14) | j14)) >> 63)));
        long j15 = (j13 + ((long) 719528)) - ((long) 60);
        if (j15 < 0) {
            long j16 = 146097;
            long j17 = ((j15 + 1) / j16) - 1;
            j10 = -1;
            j11 = ((long) TinkerReport.KEY_LOADED_SUCC_COST_500_LESS) * j17;
            j15 += (-j17) * j16;
        } else {
            j10 = -1;
            j11 = 0;
        }
        long j18 = TinkerReport.KEY_LOADED_SUCC_COST_500_LESS;
        long j19 = ((j18 * j15) + ((long) 591)) / ((long) 146097);
        long j20 = 365;
        long j21 = j20 * j19;
        long j22 = 4;
        long j23 = (j19 / j22) + j21;
        long j24 = 100;
        long j25 = j15 - ((j19 / j18) + (j23 - (j19 / j24)));
        if (j25 < 0) {
            j19 += j10;
            j25 = j15 - ((j19 / j18) + (((j19 / j22) + (j20 * j19)) - (j19 / j24)));
        }
        int i11 = (int) j25;
        int i12 = ((i11 * 5) + 2) / TinkerReport.KEY_APPLIED_PACKAGE_CHECK_APK_TINKER_ID_NOT_FOUND;
        int i13 = ((i12 + 2) % 12) + 1;
        int i14 = (i11 - (((i12 * TinkerReport.KEY_LOADED_MISSING_PATCH_INFO) + 5) / 10)) + 1;
        int i15 = (int) (j19 + j11 + ((long) (i12 / 10)));
        int i16 = i10 / 3600;
        int i17 = i10 - (i16 * 3600);
        int i18 = i17 / 60;
        int i19 = i17 - (i18 * 60);
        int i20 = 0;
        if (Math.abs(i15) < 1000) {
            StringBuilder sb2 = new StringBuilder();
            if (i15 >= 0) {
                sb2.append(i15 + 10000);
                l.d(sb2.deleteCharAt(0), "deleteCharAt(...)");
            } else {
                sb2.append(i15 - 10000);
                l.d(sb2.deleteCharAt(1), "deleteCharAt(...)");
            }
            sb.append((CharSequence) sb2);
        } else {
            if (i15 >= 10000) {
                sb.append('+');
            }
            sb.append(i15);
        }
        sb.append('-');
        f.h(sb, sb, i13);
        sb.append('-');
        f.h(sb, sb, i14);
        sb.append('T');
        f.h(sb, sb, i16);
        sb.append(':');
        f.h(sb, sb, i18);
        sb.append(':');
        f.h(sb, sb, i19);
        int i21 = this.f7071b;
        if (i21 != 0) {
            sb.append('.');
            while (true) {
                int i22 = i20 + 1;
                iArr = f.f7072a;
                if (i21 % iArr[i22] != 0) {
                    break;
                }
                i20 = i22;
            }
            int i23 = i20 - (i20 % 3);
            String strValueOf = String.valueOf((i21 / iArr[i23]) + iArr[9 - i23]);
            l.c(strValueOf, "null cannot be cast to non-null type java.lang.String");
            String strSubstring = strValueOf.substring(1);
            l.d(strSubstring, "substring(...)");
            sb.append(strSubstring);
        }
        sb.append('Z');
        return sb.toString();
    }
}
