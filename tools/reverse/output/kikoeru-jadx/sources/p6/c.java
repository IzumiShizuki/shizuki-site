package p6;

import bd.f0;
import com.tencent.bugly.beta.tinker.TinkerReport;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p4.s;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class c extends h {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f16783i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f16784j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f16785k;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public List f16789o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public List f16790p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f16791q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f16792r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f16793s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f16794t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public byte f16795u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public byte f16796v;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f16798x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public long f16799y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int[] f16781z = {11, 1, 3, 12, 14, 5, 7, 9};
    public static final int[] A = {0, 4, 8, 12, 16, 20, 24, 28};
    public static final int[] B = {-1, -16711936, -16776961, -16711681, -65536, -256, -65281};
    public static final int[] C = {32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 225, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 233, 93, 237, 243, TinkerReport.KEY_LOADED_UNKNOWN_EXCEPTION, 97, 98, 99, 100, TinkerReport.KEY_APPLIED_UPGRADE_FAIL, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, TinkerReport.KEY_APPLIED_EXCEPTION, TinkerReport.KEY_APPLIED_DEXOPT_OTHER, TinkerReport.KEY_APPLIED_DEXOPT_EXIST, 231, 247, TinkerReport.KEY_APPLIED_FAIL_COST_OTHER, 241, 9632};
    public static final int[] D = {174, 176, 189, 191, 8482, 162, 163, 9834, 224, 32, 232, 226, 234, 238, 244, TinkerReport.KEY_LOADED_UNCAUGHT_EXCEPTION};
    public static final int[] E = {193, TinkerReport.KEY_APPLIED_SUCC_COST_10S_LESS, 211, 218, 220, TinkerReport.KEY_LOADED_EXCEPTION_DEX, 8216, 161, 42, 39, 8212, 169, 8480, 8226, 8220, 8221, 192, 194, 199, TinkerReport.KEY_APPLIED_SUCC_COST_5S_LESS, TinkerReport.KEY_APPLIED_SUCC_COST_30S_LESS, TinkerReport.KEY_APPLIED_SUCC_COST_60S_LESS, 235, TinkerReport.KEY_APPLIED_FAIL_COST_10S_LESS, TinkerReport.KEY_APPLIED_FAIL_COST_30S_LESS, 239, 212, 217, 249, 219, 171, 187};
    public static final int[] F = {195, 227, TinkerReport.KEY_APPLIED_FAIL_COST_5S_LESS, TinkerReport.KEY_APPLIED_SUCC_COST_OTHER, 236, 210, 242, 213, 245, TinkerReport.KEY_APPLIED_DEXOPT_FORMAT, 125, 92, 94, 95, TinkerReport.KEY_APPLIED_INFO_CORRUPTED, 126, 196, 228, 214, 246, 223, 165, 164, 9474, 197, 229, 216, 248, 9484, 9488, 9492, 9496};
    public static final boolean[] G = {false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final s f16782h = new s();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ArrayList f16787m = new ArrayList();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public b f16788n = new b(0, 4);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f16797w = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final long f16786l = 16000000;

    public c(int i10, String str) {
        this.f16783i = "application/x-mp4-cea-608".equals(str) ? 2 : 3;
        if (i10 == 1) {
            this.f16785k = 0;
            this.f16784j = 0;
        } else if (i10 == 2) {
            this.f16785k = 1;
            this.f16784j = 0;
        } else if (i10 == 3) {
            this.f16785k = 0;
            this.f16784j = 1;
        } else if (i10 != 4) {
            p4.c.B("Cea608Decoder", "Invalid channel. Defaulting to CC1.");
            this.f16785k = 0;
            this.f16784j = 0;
        } else {
            this.f16785k = 1;
            this.f16784j = 1;
        }
        m(0);
        l();
        this.f16798x = true;
        this.f16799y = -9223372036854775807L;
    }

    @Override // p6.h, u4.c
    public final void flush() {
        super.flush();
        this.f16789o = null;
        this.f16790p = null;
        m(0);
        this.f16792r = 4;
        this.f16788n.f16780h = 4;
        l();
        this.f16793s = false;
        this.f16794t = false;
        this.f16795u = (byte) 0;
        this.f16796v = (byte) 0;
        this.f16797w = 0;
        this.f16798x = true;
        this.f16799y = -9223372036854775807L;
    }

    @Override // p6.h
    public final f0 g() {
        List list = this.f16789o;
        this.f16790p = list;
        list.getClass();
        return new f0(list);
    }

    /* JADX WARN: Removed duplicated region for block: B:179:0x0085 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:181:0x007e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a6 A[FALL_THROUGH] */
    @Override // p6.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h(p6.g r15) {
        /*
            Method dump skipped, instruction units count: 678
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p6.c.h(p6.g):void");
    }

    @Override // p6.h, u4.c
    /* JADX INFO: renamed from: i */
    public final o6.c e() {
        o6.c cVar;
        o6.c cVarE = super.e();
        if (cVarE != null) {
            return cVarE;
        }
        long j10 = this.f16786l;
        if (j10 == -9223372036854775807L) {
            return null;
        }
        long j11 = this.f16799y;
        if (j11 == -9223372036854775807L || this.f16844e - j11 < j10 || (cVar = (o6.c) this.f16841b.pollFirst()) == null) {
            return null;
        }
        this.f16789o = Collections.EMPTY_LIST;
        this.f16799y = -9223372036854775807L;
        f0 f0VarG = g();
        long j12 = this.f16844e;
        cVar.f21387c = j12;
        cVar.f16249e = f0VarG;
        cVar.f16250f = j12;
        return cVar;
    }

    @Override // p6.h
    public final boolean j() {
        return this.f16789o != this.f16790p;
    }

    public final ArrayList k() {
        ArrayList arrayList = this.f16787m;
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        int iMin = 2;
        for (int i10 = 0; i10 < size; i10++) {
            o4.b bVarC = ((b) arrayList.get(i10)).c(Integer.MIN_VALUE);
            arrayList2.add(bVarC);
            if (bVarC != null) {
                iMin = Math.min(iMin, bVarC.f16205i);
            }
        }
        ArrayList arrayList3 = new ArrayList(size);
        for (int i11 = 0; i11 < size; i11++) {
            o4.b bVarC2 = (o4.b) arrayList2.get(i11);
            if (bVarC2 != null) {
                if (bVarC2.f16205i != iMin) {
                    bVarC2 = ((b) arrayList.get(i11)).c(iMin);
                    bVarC2.getClass();
                }
                arrayList3.add(bVarC2);
            }
        }
        return arrayList3;
    }

    public final void l() {
        b bVar = this.f16788n;
        bVar.f16779g = this.f16791q;
        bVar.f16773a.clear();
        bVar.f16774b.clear();
        bVar.f16775c.setLength(0);
        bVar.f16776d = 15;
        bVar.f16777e = 0;
        bVar.f16778f = 0;
        ArrayList arrayList = this.f16787m;
        arrayList.clear();
        arrayList.add(this.f16788n);
    }

    public final void m(int i10) {
        int i11 = this.f16791q;
        if (i11 == i10) {
            return;
        }
        this.f16791q = i10;
        if (i10 != 3) {
            l();
            if (i11 == 3 || i10 == 1 || i10 == 0) {
                this.f16789o = Collections.EMPTY_LIST;
                return;
            }
            return;
        }
        int i12 = 0;
        while (true) {
            ArrayList arrayList = this.f16787m;
            if (i12 >= arrayList.size()) {
                return;
            }
            ((b) arrayList.get(i12)).f16779g = i10;
            i12++;
        }
    }

    @Override // p6.h, u4.c
    public final void a() {
    }
}
