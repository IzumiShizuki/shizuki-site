package h0;

import com.tencent.bugly.beta.tinker.TinkerReport;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class h extends jc.m implements ic.k {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final h f7632c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final h f7633d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final h f7634e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final h f7635f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final h f7636g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final h f7637h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final h f7638i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final h f7639j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final h f7640k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final h f7641l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final h f7642m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final h f7643n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final h f7644o;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f7645b;

    static {
        int i10 = 1;
        f7632c = new h(i10, 0);
        f7633d = new h(i10, 1);
        f7634e = new h(i10, 2);
        f7635f = new h(i10, 3);
        f7636g = new h(i10, 4);
        f7637h = new h(i10, 5);
        f7638i = new h(i10, 6);
        f7639j = new h(i10, 7);
        f7640k = new h(i10, 8);
        f7641l = new h(i10, 9);
        f7642m = new h(i10, 10);
        f7643n = new h(i10, 11);
        f7644o = new h(i10, 12);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(int i10, int i11) {
        super(i10);
        this.f7645b = i11;
    }

    @Override // ic.k
    public final Object a(Object obj) {
        int i10 = this.f7645b;
        ub.a0 a0Var = ub.a0.f21526a;
        switch (i10) {
            case 0:
                return a0Var;
            case 1:
                return a0Var;
            case 2:
                return Long.valueOf(((Number) obj).longValue());
            case 3:
                return a0Var;
            case 4:
                return a0Var;
            case 5:
                return a0Var;
            case 6:
                l0.f1 f1Var = (l0.f1) obj;
                long j10 = f1Var.f11477f;
                int i11 = t2.k0.f20357c;
                return new y2.e(((int) (j10 & 4294967295L)) - q0.r((int) (j10 & 4294967295L), f1Var.f11478g.f20320b), 0);
            case 7:
                l0.f1 f1Var2 = (l0.f1) obj;
                String str = f1Var2.f11478g.f20320b;
                long j11 = f1Var2.f11477f;
                int i12 = t2.k0.f20357c;
                int iO = q0.o((int) (j11 & 4294967295L), str);
                if (iO != -1) {
                    return new y2.e(0, iO - ((int) (4294967295L & f1Var2.f11477f)));
                }
                return null;
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_DALVIK /* 8 */:
                l0.f1 f1Var3 = (l0.f1) obj;
                Integer numE = f1Var3.e();
                if (numE == null) {
                    return null;
                }
                int iIntValue = numE.intValue();
                long j12 = f1Var3.f11477f;
                int i13 = t2.k0.f20357c;
                return new y2.e(((int) (4294967295L & j12)) - iIntValue, 0);
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_ART /* 9 */:
                l0.f1 f1Var4 = (l0.f1) obj;
                Integer numD = f1Var4.d();
                if (numD == null) {
                    return null;
                }
                int iIntValue2 = numD.intValue();
                long j13 = f1Var4.f11477f;
                int i14 = t2.k0.f20357c;
                return new y2.e(0, iIntValue2 - ((int) (4294967295L & j13)));
            case TinkerReport.KEY_APPLY_WITH_RETRY /* 10 */:
                l0.f1 f1Var5 = (l0.f1) obj;
                Integer numC = f1Var5.c();
                if (numC == null) {
                    return null;
                }
                int iIntValue3 = numC.intValue();
                long j14 = f1Var5.f11477f;
                int i15 = t2.k0.f20357c;
                return new y2.e(((int) (4294967295L & j14)) - iIntValue3, 0);
            case 11:
                l0.f1 f1Var6 = (l0.f1) obj;
                Integer numB = f1Var6.b();
                if (numB == null) {
                    return null;
                }
                int iIntValue4 = numB.intValue();
                long j15 = f1Var6.f11477f;
                int i16 = t2.k0.f20357c;
                return new y2.e(0, iIntValue4 - ((int) (4294967295L & j15)));
            default:
                List list = (List) obj;
                Object obj2 = list.get(1);
                jc.l.c(obj2, "null cannot be cast to non-null type kotlin.Boolean");
                u.e1 e1Var = ((Boolean) obj2).booleanValue() ? u.e1.f20882a : u.e1.f20883b;
                Object obj3 = list.get(0);
                jc.l.c(obj3, "null cannot be cast to non-null type kotlin.Float");
                return new p1(e1Var, ((Float) obj3).floatValue());
        }
    }
}
