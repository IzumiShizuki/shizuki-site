package m4;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final b f14121f = new b(new a[0], 0, -9223372036854775807L, 0);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f14122g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f14123h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f14124i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f14125j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f14126k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f14127a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f14128b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f14129c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f14130d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a[] f14131e;

    static {
        a aVar = new a(0L, -1, -1, new int[0], new i0[0], new long[0], 0L, false, new String[0], false);
        int[] iArr = aVar.f14095f;
        int length = iArr.length;
        int iMax = Math.max(0, length);
        int[] iArrCopyOf = Arrays.copyOf(iArr, iMax);
        Arrays.fill(iArrCopyOf, length, iMax, 0);
        long[] jArr = aVar.f14096g;
        int length2 = jArr.length;
        int iMax2 = Math.max(0, length2);
        long[] jArrCopyOf = Arrays.copyOf(jArr, iMax2);
        Arrays.fill(jArrCopyOf, length2, iMax2, -9223372036854775807L);
        f14122g = new a(aVar.f14090a, 0, aVar.f14092c, iArrCopyOf, (i0[]) Arrays.copyOf(aVar.f14094e, 0), jArrCopyOf, aVar.f14098i, aVar.f14099j, (String[]) Arrays.copyOf(aVar.f14097h, 0), aVar.f14100k);
        int i10 = p4.c0.f16548a;
        f14123h = Integer.toString(1, 36);
        f14124i = Integer.toString(2, 36);
        f14125j = Integer.toString(3, 36);
        f14126k = Integer.toString(4, 36);
    }

    public b(a[] aVarArr, long j10, long j11, int i10) {
        this.f14128b = j10;
        this.f14129c = j11;
        this.f14127a = aVarArr.length + i10;
        this.f14131e = aVarArr;
        this.f14130d = i10;
    }

    public final a a(int i10) {
        int i11 = this.f14130d;
        return i10 < i11 ? f14122g : this.f14131e[i10 - i11];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        int i10 = p4.c0.f16548a;
        return this.f14127a == bVar.f14127a && this.f14128b == bVar.f14128b && this.f14129c == bVar.f14129c && this.f14130d == bVar.f14130d && Arrays.equals(this.f14131e, bVar.f14131e);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f14131e) + (((((((this.f14127a * 961) + ((int) this.f14128b)) * 31) + ((int) this.f14129c)) * 31) + this.f14130d) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AdPlaybackState(adsId=null, adResumePositionUs=");
        sb.append(this.f14128b);
        sb.append(", adGroups=[");
        int i10 = 0;
        while (true) {
            a[] aVarArr = this.f14131e;
            if (i10 >= aVarArr.length) {
                sb.append("])");
                return sb.toString();
            }
            sb.append("adGroup(timeUs=");
            sb.append(aVarArr[i10].f14090a);
            sb.append(", ads=[");
            for (int i11 = 0; i11 < aVarArr[i10].f14095f.length; i11++) {
                sb.append("ad(state=");
                int i12 = aVarArr[i10].f14095f[i11];
                if (i12 == 0) {
                    sb.append('_');
                } else if (i12 == 1) {
                    sb.append('R');
                } else if (i12 == 2) {
                    sb.append('S');
                } else if (i12 == 3) {
                    sb.append('P');
                } else if (i12 != 4) {
                    sb.append('?');
                } else {
                    sb.append('!');
                }
                sb.append(", durationUs=");
                sb.append(aVarArr[i10].f14096g[i11]);
                sb.append(')');
                if (i11 < aVarArr[i10].f14095f.length - 1) {
                    sb.append(", ");
                }
            }
            sb.append("])");
            if (i10 < aVarArr.length - 1) {
                sb.append(", ");
            }
            i10++;
        }
    }
}
