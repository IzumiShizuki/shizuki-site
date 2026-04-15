package z6;

import com.tencent.bugly.beta.tinker.TinkerReport;
import java.math.RoundingMode;
import m4.o0;
import m4.p;
import m4.p0;
import p4.c0;
import p4.s;
import r5.h0;
import r5.q;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class a implements b {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int[] f26477m = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int[] f26478n = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, 107, 118, 130, 143, TinkerReport.KEY_APPLIED_PACKAGE_CHECK_RES_META, 173, 190, TinkerReport.KEY_APPLIED_FAIL_COST_OTHER, 230, TinkerReport.KEY_LOADED_EXCEPTION_DEX_CHECK, 279, TinkerReport.KEY_LOADED_MISSING_DEX_OPT, 337, 371, 408, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f26479a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h0 f26480b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l6.d f26481c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f26482d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final byte[] f26483e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final s f26484f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f26485g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final m4.q f26486h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f26487i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f26488j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f26489k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f26490l;

    public a(q qVar, h0 h0Var, l6.d dVar) throws p0 {
        this.f26479a = qVar;
        this.f26480b = h0Var;
        this.f26481c = dVar;
        int i10 = dVar.f11737c;
        int iMax = Math.max(1, i10 / 10);
        this.f26485g = iMax;
        s sVar = new s((byte[]) dVar.f11740f);
        sVar.n();
        int iN = sVar.n();
        this.f26482d = iN;
        int i11 = dVar.f11736b;
        int i12 = dVar.f11738d;
        int i13 = (((i12 - (i11 * 4)) * 8) / (dVar.f11739e * i11)) + 1;
        if (iN != i13) {
            throw p0.a(null, "Expected frames per block: " + i13 + "; got: " + iN);
        }
        int iF = c0.f(iMax, iN);
        this.f26483e = new byte[iF * i12];
        this.f26484f = new s(iN * 2 * i11 * iF);
        int i14 = ((i12 * i10) * 8) / iN;
        p pVar = new p();
        pVar.f14488m = o0.p("audio/raw");
        pVar.f14483h = i14;
        pVar.f14484i = i14;
        pVar.f14489n = iMax * 2 * i11;
        pVar.C = i11;
        pVar.D = i10;
        pVar.E = 2;
        this.f26486h = new m4.q(pVar);
    }

    @Override // z6.b
    public final void a(long j10) {
        this.f26487i = 0;
        this.f26488j = j10;
        this.f26489k = 0;
        this.f26490l = 0L;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0046 A[ADDED_TO_REGION, EDGE_INSN: B:43:0x0046->B:14:0x0046 BREAK  A[LOOP:0: B:6:0x0024->B:13:0x0040], REMOVE, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x003d -> B:4:0x0021). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // z6.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean b(r5.o r25, long r26) {
        /*
            Method dump skipped, instruction units count: 330
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: z6.a.b(r5.o, long):boolean");
    }

    @Override // z6.b
    public final void c(int i10, long j10) {
        this.f26479a.a(new e(this.f26481c, this.f26482d, i10, j10));
        this.f26480b.b(this.f26486h);
    }

    public final void d(int i10) {
        long j10 = this.f26488j;
        long j11 = this.f26490l;
        l6.d dVar = this.f26481c;
        long j12 = dVar.f11737c;
        int i11 = c0.f16548a;
        long jV = j10 + c0.V(j11, 1000000L, j12, RoundingMode.DOWN);
        int i12 = i10 * 2 * dVar.f11736b;
        this.f26480b.a(jV, 1, i12, this.f26489k - i12, null);
        this.f26490l += (long) i10;
        this.f26489k -= i12;
    }
}
