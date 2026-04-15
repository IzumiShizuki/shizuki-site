package ba;

import com.cnl.kikoeru.R;
import com.tencent.bugly.beta.tinker.TinkerReport;
import m0.z8;
import s.o1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class p implements ic.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2444a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f2445b;

    public /* synthetic */ p(int i10, int i11, String str) {
        this.f2444a = i11;
        this.f2445b = str;
    }

    @Override // ic.n
    public final Object q(Object obj, Object obj2) {
        int i10 = this.f2444a;
        String str = this.f2445b;
        ub.a0 a0Var = ub.a0.f21526a;
        switch (i10) {
            case 0:
                x0.o oVar = (x0.o) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!oVar.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    oVar.Q();
                } else {
                    z8.b(this.f2445b, null, 0L, 0L, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, oVar, 0, 3120, 120830);
                }
                break;
            case 1:
                x0.o oVar2 = (x0.o) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (!oVar2.N(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    oVar2.Q();
                } else {
                    z8.b(na.q.h(R.string.delete_search_history, str), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, oVar2, 0, 0, 131070);
                }
                break;
            case 2:
                x0.o oVar3 = (x0.o) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (!oVar3.N(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    oVar3.Q();
                } else {
                    z8.b(this.f2445b, null, 0L, 0L, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, oVar3, 0, 3120, 120830);
                }
                break;
            case 3:
                x0.o oVar4 = (x0.o) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (!oVar4.N(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    oVar4.Q();
                } else {
                    z8.b(this.f2445b, null, 0L, 0L, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, oVar4, 0, 3120, 120830);
                }
                break;
            case 4:
                x0.o oVar5 = (x0.o) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (!oVar5.N(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    oVar5.Q();
                } else {
                    z8.b(this.f2445b, null, q1.q.f17571d, 0L, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, oVar5, 384, 3120, 120826);
                }
                break;
            case 5:
                x0.o oVar6 = (x0.o) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                if (!oVar6.N(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    oVar6.Q();
                } else {
                    z8.b(this.f2445b, n7.b0.x(n7.b0.x(androidx.compose.foundation.layout.a.j(j1.n.f9689a, 5), new o1(0), true), new o1(0), false), 0L, lc.b.C(11), null, null, 0L, null, null, 0L, 0, false, 0, 0, null, oVar6, 3072, 0, 131060);
                }
                break;
            case 6:
                ((Integer) obj2).getClass();
                ia.a.a(str, (x0.o) obj, x0.v.D(1));
                break;
            case 7:
                ((Integer) obj2).getClass();
                ia.a.a(str, (x0.o) obj, x0.v.D(1));
                break;
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_DALVIK /* 8 */:
                x0.o oVar7 = (x0.o) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                if (!oVar7.N(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    oVar7.Q();
                } else {
                    z8.b(this.f2445b, null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, oVar7, 0, 0, 131070);
                }
                break;
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_ART /* 9 */:
                x0.o oVar8 = (x0.o) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                if (!oVar8.N(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    oVar8.Q();
                } else {
                    z8.b(this.f2445b, null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, oVar8, 0, 0, 131070);
                }
                break;
            case TinkerReport.KEY_APPLY_WITH_RETRY /* 10 */:
                ((Integer) obj2).getClass();
                p9.a.b(str, (x0.o) obj, x0.v.D(1));
                break;
            case 11:
                x0.o oVar9 = (x0.o) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                if (!oVar9.N(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    oVar9.Q();
                } else {
                    z8.b(na.q.h(R.string.delete_confirm, str), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, oVar9, 0, 0, 131070);
                }
                break;
            case 12:
                x0.o oVar10 = (x0.o) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                if (!oVar10.N(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    oVar10.Q();
                } else {
                    z8.b(this.f2445b, null, 0L, 0L, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, oVar10, 0, 3120, 120830);
                }
                break;
            case 13:
                x0.o oVar11 = (x0.o) obj;
                int iIntValue11 = ((Integer) obj2).intValue();
                if (!oVar11.N(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    oVar11.Q();
                } else {
                    z8.b(this.f2445b, null, 0L, 0L, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, oVar11, 0, 3120, 120830);
                }
                break;
            case 14:
                x0.o oVar12 = (x0.o) obj;
                int iIntValue12 = ((Integer) obj2).intValue();
                if (!oVar12.N(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    oVar12.Q();
                } else {
                    z8.b(this.f2445b, null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, oVar12, 0, 0, 131070);
                }
                break;
            case 15:
                x0.o oVar13 = (x0.o) obj;
                int iIntValue13 = ((Integer) obj2).intValue();
                if (!oVar13.N(iIntValue13 & 1, (iIntValue13 & 3) != 2)) {
                    oVar13.Q();
                } else {
                    z8.b(this.f2445b, null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, oVar13, 0, 0, 131070);
                }
                break;
            case 16:
                x0.o oVar14 = (x0.o) obj;
                int iIntValue14 = ((Integer) obj2).intValue();
                if (!oVar14.N(iIntValue14 & 1, (iIntValue14 & 3) != 2)) {
                    oVar14.Q();
                } else {
                    String str2 = this.f2445b;
                    jc.l.b(str2);
                    z8.b(str2, null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, oVar14, 0, 0, 131070);
                }
                break;
            case 17:
                x0.o oVar15 = (x0.o) obj;
                int iIntValue15 = ((Integer) obj2).intValue();
                if (!oVar15.N(iIntValue15 & 1, (iIntValue15 & 3) != 2)) {
                    oVar15.Q();
                } else {
                    z8.b(this.f2445b, null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, oVar15, 0, 0, 131070);
                }
                break;
            default:
                x0.o oVar16 = (x0.o) obj;
                int iIntValue16 = ((Integer) obj2).intValue();
                if (!oVar16.N(iIntValue16 & 1, (iIntValue16 & 3) != 2)) {
                    oVar16.Q();
                } else {
                    z8.b(this.f2445b, null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, oVar16, 0, 0, 131070);
                }
                break;
        }
        return a0Var;
    }

    public /* synthetic */ p(int i10, String str) {
        this.f2444a = i10;
        this.f2445b = str;
    }
}
