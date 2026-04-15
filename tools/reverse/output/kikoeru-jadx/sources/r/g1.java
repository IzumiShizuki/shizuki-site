package r;

import com.tencent.bugly.beta.tinker.TinkerReport;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class g1 extends jc.m implements ic.k {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final g1 f18413c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final g1 f18414d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final g1 f18415e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final g1 f18416f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final g1 f18417g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final g1 f18418h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final g1 f18419i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final g1 f18420j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final g1 f18421k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final g1 f18422l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final g1 f18423m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final g1 f18424n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final g1 f18425o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final g1 f18426p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final g1 f18427q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final g1 f18428r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final g1 f18429s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final g1 f18430t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final g1 f18431u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final g1 f18432v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final g1 f18433w;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f18434b;

    static {
        int i10 = 1;
        f18413c = new g1(i10, 0);
        f18414d = new g1(i10, 1);
        f18415e = new g1(i10, 2);
        f18416f = new g1(i10, 3);
        f18417g = new g1(i10, 4);
        f18418h = new g1(i10, 5);
        f18419i = new g1(i10, 6);
        f18420j = new g1(i10, 7);
        f18421k = new g1(i10, 8);
        f18422l = new g1(i10, 9);
        f18423m = new g1(i10, 10);
        f18424n = new g1(i10, 11);
        f18425o = new g1(i10, 12);
        f18426p = new g1(i10, 13);
        f18427q = new g1(i10, 14);
        f18428r = new g1(i10, 15);
        f18429s = new g1(i10, 16);
        f18430t = new g1(i10, 17);
        f18431u = new g1(i10, 18);
        f18432v = new g1(i10, 19);
        f18433w = new g1(i10, 20);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g1(int i10, int i11) {
        super(i10);
        this.f18434b = i11;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, ub.h] */
    @Override // ic.k
    public final Object a(Object obj) {
        switch (this.f18434b) {
            case 0:
                return ub.a0.f21526a;
            case 1:
                ((ic.a) obj).b();
                return ub.a0.f21526a;
            case 2:
                w0 w0Var = (w0) obj;
                long j10 = w0Var.f18608f;
                ((h1.y) t1.f18582a.getValue()).d(w0Var, f18415e, w0Var.f18609g);
                long j11 = w0Var.f18608f;
                if (j10 != j11) {
                    p0 p0Var = w0Var.f18616n;
                    if (p0Var != null) {
                        if (p0Var.f18508a > j11) {
                            w0Var.H1();
                        } else {
                            p0Var.f18514g = j11;
                            if (p0Var.f18509b == null) {
                                p0Var.f18515h = lc.b.S((1.0d - ((double) p0Var.f18512e.a(0))) * w0Var.f18608f);
                            }
                        }
                    } else if (j11 != 0) {
                        w0Var.J1();
                    }
                }
                return ub.a0.f21526a;
            case 3:
                long j12 = ((f3.g) obj).f6658a;
                return new m(Float.intBitsToFloat((int) (j12 >> 32)), Float.intBitsToFloat((int) (j12 & 4294967295L)));
            case 4:
                m mVar = (m) obj;
                return new f3.g((((long) Float.floatToRawIntBits(mVar.f18478a)) << 32) | (((long) Float.floatToRawIntBits(mVar.f18479b)) & 4294967295L));
            case 5:
                return new l(((f3.f) obj).f6657a);
            case 6:
                return new f3.f(((l) obj).f18474a);
            case 7:
                return new l(((Number) obj).floatValue());
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_DALVIK /* 8 */:
                return Float.valueOf(((l) obj).f18474a);
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_ART /* 9 */:
                long j13 = ((f3.j) obj).f6660a;
                return new m((int) (j13 >> 32), (int) (j13 & 4294967295L));
            case TinkerReport.KEY_APPLY_WITH_RETRY /* 10 */:
                m mVar2 = (m) obj;
                return new f3.j((((long) Math.round(mVar2.f18478a)) << 32) | (((long) Math.round(mVar2.f18479b)) & 4294967295L));
            case 11:
                long j14 = ((f3.l) obj).f6666a;
                return new m((int) (j14 >> 32), (int) (j14 & 4294967295L));
            case 12:
                m mVar3 = (m) obj;
                int iRound = Math.round(mVar3.f18478a);
                if (iRound < 0) {
                    iRound = 0;
                }
                int iRound2 = Math.round(mVar3.f18479b);
                return new f3.l((((long) (iRound2 >= 0 ? iRound2 : 0)) & 4294967295L) | (((long) iRound) << 32));
            case 13:
                return new l(((Number) obj).intValue());
            case 14:
                return Integer.valueOf((int) ((l) obj).f18474a);
            case 15:
                long j15 = ((p1.b) obj).f16481a;
                return new m(Float.intBitsToFloat((int) (j15 >> 32)), Float.intBitsToFloat((int) (j15 & 4294967295L)));
            case 16:
                m mVar4 = (m) obj;
                return new p1.b((((long) Float.floatToRawIntBits(mVar4.f18478a)) << 32) | (((long) Float.floatToRawIntBits(mVar4.f18479b)) & 4294967295L));
            case 17:
                p1.c cVar = (p1.c) obj;
                return new o(cVar.f16483a, cVar.f16484b, cVar.f16485c, cVar.f16486d);
            case 18:
                o oVar = (o) obj;
                return new p1.c(oVar.f18502a, oVar.f18503b, oVar.f18504c, oVar.f18505d);
            case 19:
                long j16 = ((p1.e) obj).f16495a;
                return new m(Float.intBitsToFloat((int) (j16 >> 32)), Float.intBitsToFloat((int) (j16 & 4294967295L)));
            default:
                m mVar5 = (m) obj;
                return new p1.e((((long) Float.floatToRawIntBits(mVar5.f18478a)) << 32) | (((long) Float.floatToRawIntBits(mVar5.f18479b)) & 4294967295L));
        }
    }
}
