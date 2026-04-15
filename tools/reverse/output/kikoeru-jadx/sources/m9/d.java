package m9;

import com.cnl.kikoeru.R;
import com.tencent.bugly.beta.tinker.TinkerReport;
import hd.q0;
import j2.h0;
import m0.r3;
import m0.z8;
import nf.u;
import nf.x;
import q1.n0;
import q1.q;
import u3.x0;
import ub.a0;
import w1.g0;
import x0.o;
import x0.v;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements ic.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14995a;

    public /* synthetic */ d(int i10) {
        this.f14995a = i10;
    }

    @Override // ic.n
    public final Object q(Object obj, Object obj2) {
        int i10 = this.f14995a;
        a0 a0Var = a0.f21526a;
        switch (i10) {
            case 0:
                o oVar = (o) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!oVar.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    oVar.Q();
                } else {
                    w1.f fVarB = x0.f21358p;
                    if (fVarB == null) {
                        w1.e eVar = new w1.e("Filled.VpnKey", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                        int i11 = g0.f23208a;
                        n0 n0Var = new n0(q.f17569b);
                        q0 q0VarH = h0.h(12.65f, 10.0f);
                        q0VarH.m(11.83f, 7.67f, 9.61f, 6.0f, 7.0f, 6.0f);
                        q0VarH.n(-3.31f, 0.0f, -6.0f, 2.69f, -6.0f, 6.0f);
                        q0VarH.w(2.69f, 6.0f, 6.0f, 6.0f);
                        q0VarH.n(2.61f, 0.0f, 4.83f, -1.67f, 5.65f, -4.0f);
                        q0VarH.q(17.0f);
                        q0VarH.z(4.0f);
                        q0VarH.r(4.0f);
                        q0VarH.z(-4.0f);
                        q0VarH.r(2.0f);
                        q0VarH.z(-4.0f);
                        q0VarH.q(12.65f);
                        q0VarH.l();
                        q0VarH.u(7.0f, 14.0f);
                        q0VarH.n(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f);
                        q0VarH.w(0.9f, -2.0f, 2.0f, -2.0f);
                        q0VarH.w(2.0f, 0.9f, 2.0f, 2.0f);
                        q0VarH.w(-0.9f, 2.0f, -2.0f, 2.0f);
                        q0VarH.l();
                        w1.e.a(eVar, q0VarH.f8447b, 0, n0Var);
                        fVarB = eVar.b();
                        x0.f21358p = fVarB;
                    }
                    r3.b(fVarB, n7.e.E(R.string.password, oVar), null, 0L, oVar, 0, 12);
                }
                break;
            case 1:
                o oVar2 = (o) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (!oVar2.N(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    oVar2.Q();
                } else {
                    z8.b(n7.e.E(R.string.confirm_regist, oVar2), null, 0L, lc.b.C(20), null, null, 0L, null, null, 0L, 0, false, 0, 0, null, oVar2, 3072, 0, 131062);
                }
                break;
            case 2:
                break;
            case 3:
                yb.f fVar = (yb.f) obj2;
                if (fVar instanceof u) {
                    Integer num = obj instanceof Integer ? (Integer) obj : null;
                    int iIntValue3 = num != null ? num.intValue() : 1;
                    if (iIntValue3 != 0) {
                    }
                }
                break;
            case 4:
                u uVar = (u) obj;
                yb.f fVar2 = (yb.f) obj2;
                if (uVar == null) {
                    if (fVar2 instanceof u) {
                    }
                    break;
                }
                break;
            case 5:
                x xVar = (x) obj;
                yb.f fVar3 = (yb.f) obj2;
                if (fVar3 instanceof u) {
                    u uVar2 = (u) fVar3;
                    Object objC = uVar2.c(xVar.f15863a);
                    Object[] objArr = xVar.f15864b;
                    int i12 = xVar.f15866d;
                    objArr[i12] = objC;
                    u[] uVarArr = xVar.f15865c;
                    xVar.f15866d = i12 + 1;
                    uVarArr[i12] = uVar2;
                }
                break;
            case 6:
                o oVar3 = (o) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (!oVar3.N(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    oVar3.Q();
                }
                break;
            case 7:
                o oVar4 = (o) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (!oVar4.N(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    oVar4.Q();
                } else {
                    q9.a.b(0, oVar4);
                }
                break;
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_DALVIK /* 8 */:
                o oVar5 = (o) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                if (!oVar5.N(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    oVar5.Q();
                } else {
                    r9.f.c(0, oVar5);
                }
                break;
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_ART /* 9 */:
                o oVar6 = (o) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                if (!oVar6.N(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    oVar6.Q();
                } else {
                    z8.b(na.q.g(R.string.app_link_not_verified_title), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, oVar6, 0, 0, 131070);
                }
                break;
            case TinkerReport.KEY_APPLY_WITH_RETRY /* 10 */:
                o oVar7 = (o) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                if (!oVar7.N(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    oVar7.Q();
                } else {
                    z8.b(na.q.g(R.string.app_link_not_verified_message), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, oVar7, 0, 0, 131070);
                }
                break;
            case 11:
                ((Integer) obj2).getClass();
                p9.a.c(v.D(1), (o) obj);
                break;
            case 12:
                ((Integer) obj2).getClass();
                p9.a.c(v.D(1), (o) obj);
                break;
            case 13:
                o oVar8 = (o) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                if (!oVar8.N(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    oVar8.Q();
                } else {
                    w1.f fVarB2 = android.support.v4.media.session.b.f436d;
                    if (fVarB2 == null) {
                        w1.e eVar2 = new w1.e("AutoMirrored.Filled.Sort", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, true, 96);
                        int i13 = g0.f23208a;
                        n0 n0Var2 = new n0(q.f17569b);
                        q0 q0Var = new q0((byte) 0, 6);
                        q0Var.u(3.0f, 18.0f);
                        q0Var.r(6.0f);
                        q0Var.z(-2.0f);
                        h0.t(q0Var, 3.0f, 16.0f, 2.0f);
                        q0Var.u(3.0f, 6.0f);
                        q0Var.z(2.0f);
                        q0Var.r(18.0f);
                        q0Var.s(21.0f, 6.0f);
                        q0Var.s(3.0f, 6.0f);
                        q0Var.l();
                        q0Var.u(3.0f, 13.0f);
                        q0Var.r(12.0f);
                        q0Var.z(-2.0f);
                        h0.t(q0Var, 3.0f, 11.0f, 2.0f);
                        w1.e.a(eVar2, q0Var.f8447b, 0, n0Var2);
                        fVarB2 = eVar2.b();
                        android.support.v4.media.session.b.f436d = fVarB2;
                    }
                    r3.b(fVarB2, "Sort", null, 0L, oVar8, 48, 12);
                }
                break;
            case 14:
                o oVar9 = (o) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                if (!oVar9.N(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    oVar9.Q();
                } else {
                    r3.b(nh.b.t(), "Add", null, 0L, oVar9, 48, 12);
                }
                break;
            case 15:
                o oVar10 = (o) obj;
                int iIntValue11 = ((Integer) obj2).intValue();
                if (!oVar10.N(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    oVar10.Q();
                } else {
                    r3.b(n7.e.r(), "copyLink", null, 0L, oVar10, 48, 12);
                }
                break;
            case 16:
                o oVar11 = (o) obj;
                int iIntValue12 = ((Integer) obj2).intValue();
                if (!oVar11.N(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    oVar11.Q();
                } else {
                    r3.b(a2.c.M(), "playlist", null, 0L, oVar11, 48, 12);
                }
                break;
            case 17:
                o oVar12 = (o) obj;
                int iIntValue13 = ((Integer) obj2).intValue();
                if (!oVar12.N(iIntValue13 & 1, (iIntValue13 & 3) != 2)) {
                    oVar12.Q();
                } else {
                    z8.b(na.q.g(R.string.playlist_name), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, oVar12, 0, 0, 131070);
                }
                break;
            case 18:
                o oVar13 = (o) obj;
                int iIntValue14 = ((Integer) obj2).intValue();
                if (!oVar13.N(iIntValue14 & 1, (iIntValue14 & 3) != 2)) {
                    oVar13.Q();
                } else {
                    z8.b(na.q.g(R.string.playlist_name_notnull), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, oVar13, 0, 0, 131070);
                }
                break;
            case 19:
                o oVar14 = (o) obj;
                int iIntValue15 = ((Integer) obj2).intValue();
                if (!oVar14.N(iIntValue15 & 1, (iIntValue15 & 3) != 2)) {
                    oVar14.Q();
                } else {
                    z8.b(na.q.g(R.string.playlist_desc), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, oVar14, 0, 0, 131070);
                }
                break;
            case 20:
                o oVar15 = (o) obj;
                int iIntValue16 = ((Integer) obj2).intValue();
                if (!oVar15.N(iIntValue16 & 1, (iIntValue16 & 3) != 2)) {
                    oVar15.Q();
                } else {
                    z8.b(na.q.g(R.string.blacklist_type), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, oVar15, 0, 0, 131070);
                }
                break;
            case 21:
                o oVar16 = (o) obj;
                int iIntValue17 = ((Integer) obj2).intValue();
                if (!oVar16.N(iIntValue17 & 1, (iIntValue17 & 3) != 2)) {
                    oVar16.Q();
                } else {
                    z8.b(na.q.g(R.string.playlist_add_works), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, oVar16, 0, 0, 131070);
                }
                break;
            case 22:
                o oVar17 = (o) obj;
                int iIntValue18 = ((Integer) obj2).intValue();
                if (!oVar17.N(iIntValue18 & 1, (iIntValue18 & 3) != 2)) {
                    oVar17.Q();
                } else {
                    z8.b(na.q.g(R.string.playlist_add_works_desc), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, oVar17, 0, 0, 131070);
                }
                break;
            case 23:
                o oVar18 = (o) obj;
                int iIntValue19 = ((Integer) obj2).intValue();
                if (!oVar18.N(iIntValue19 & 1, (iIntValue19 & 3) != 2)) {
                    oVar18.Q();
                } else {
                    z8.b(na.q.g(R.string.add_playlist_to_favorite), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, oVar18, 0, 0, 131070);
                }
                break;
            case 24:
                o oVar19 = (o) obj;
                int iIntValue20 = ((Integer) obj2).intValue();
                if (!oVar19.N(iIntValue20 & 1, (iIntValue20 & 3) != 2)) {
                    oVar19.Q();
                } else {
                    z8.b(na.q.g(R.string.input_playlist_share_url), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, oVar19, 0, 0, 131070);
                }
                break;
            case 25:
                o oVar20 = (o) obj;
                int iIntValue21 = ((Integer) obj2).intValue();
                if (!oVar20.N(iIntValue21 & 1, (iIntValue21 & 3) != 2)) {
                    oVar20.Q();
                } else {
                    z8.b(na.q.g(R.string.playlist), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, oVar20, 0, 0, 131070);
                }
                break;
            case 26:
                o oVar21 = (o) obj;
                int iIntValue22 = ((Integer) obj2).intValue();
                if (!oVar21.N(iIntValue22 & 1, (iIntValue22 & 3) != 2)) {
                    oVar21.Q();
                } else {
                    w1.f fVarB3 = nh.a.f15892o;
                    if (fVarB3 == null) {
                        w1.e eVar3 = new w1.e("Outlined.AddLink", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                        int i14 = g0.f23208a;
                        n0 n0Var3 = new n0(q.f17569b);
                        q0 q0Var2 = new q0((byte) 0, 6);
                        q0Var2.u(8.0f, 11.0f);
                        q0Var2.r(8.0f);
                        q0Var2.z(2.0f);
                        q0Var2.q(8.0f);
                        q0Var2.y(11.0f);
                        q0Var2.l();
                        q0Var2.u(20.1f, 12.0f);
                        q0Var2.q(22.0f);
                        q0Var2.n(0.0f, -2.76f, -2.24f, -5.0f, -5.0f, -5.0f);
                        q0Var2.r(-4.0f);
                        q0Var2.z(1.9f);
                        q0Var2.r(4.0f);
                        q0Var2.m(18.71f, 8.9f, 20.1f, 10.29f, 20.1f, 12.0f);
                        q0Var2.l();
                        q0Var2.u(3.9f, 12.0f);
                        q0Var2.n(0.0f, -1.71f, 1.39f, -3.1f, 3.1f, -3.1f);
                        q0Var2.r(4.0f);
                        q0Var2.y(7.0f);
                        q0Var2.q(7.0f);
                        q0Var2.n(-2.76f, 0.0f, -5.0f, 2.24f, -5.0f, 5.0f);
                        q0Var2.w(2.24f, 5.0f, 5.0f, 5.0f);
                        q0Var2.r(4.0f);
                        q0Var2.z(-1.9f);
                        q0Var2.q(7.0f);
                        q0Var2.m(5.29f, 15.1f, 3.9f, 13.71f, 3.9f, 12.0f);
                        q0Var2.l();
                        q0Var2.u(19.0f, 12.0f);
                        q0Var2.r(-2.0f);
                        q0Var2.z(3.0f);
                        q0Var2.r(-3.0f);
                        q0Var2.z(2.0f);
                        q0Var2.r(3.0f);
                        q0Var2.z(3.0f);
                        q0Var2.r(2.0f);
                        q0Var2.z(-3.0f);
                        q0Var2.r(3.0f);
                        q0Var2.z(-2.0f);
                        q0Var2.r(-3.0f);
                        q0Var2.y(12.0f);
                        q0Var2.l();
                        w1.e.a(eVar3, q0Var2.f8447b, 0, n0Var3);
                        fVarB3 = eVar3.b();
                        nh.a.f15892o = fVarB3;
                    }
                    r3.b(fVarB3, "addPlaylist", null, 0L, oVar21, 48, 12);
                }
                break;
            case 27:
                o oVar22 = (o) obj;
                int iIntValue23 = ((Integer) obj2).intValue();
                if (!oVar22.N(iIntValue23 & 1, (iIntValue23 & 3) != 2)) {
                    oVar22.Q();
                } else {
                    w1.f fVarB4 = n7.d.f15453o;
                    if (fVarB4 == null) {
                        w1.e eVar4 = new w1.e("Outlined.CreateNewFolder", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                        int i15 = g0.f23208a;
                        n0 n0Var4 = new n0(q.f17569b);
                        q0 q0Var3 = new q0((byte) 0, 6);
                        q0Var3.u(20.0f, 6.0f);
                        q0Var3.r(-8.0f);
                        q0Var3.t(-2.0f, -2.0f);
                        q0Var3.s(4.0f, 4.0f);
                        q0Var3.n(-1.11f, 0.0f, -1.99f, 0.89f, -1.99f, 2.0f);
                        q0Var3.s(2.0f, 18.0f);
                        q0Var3.n(0.0f, 1.11f, 0.89f, 2.0f, 2.0f, 2.0f);
                        q0Var3.r(16.0f);
                        q0Var3.n(1.11f, 0.0f, 2.0f, -0.89f, 2.0f, -2.0f);
                        q0Var3.s(22.0f, 8.0f);
                        q0Var3.n(0.0f, -1.11f, -0.89f, -2.0f, -2.0f, -2.0f);
                        q0Var3.l();
                        q0Var3.u(20.0f, 18.0f);
                        q0Var3.s(4.0f, 18.0f);
                        q0Var3.s(4.0f, 6.0f);
                        q0Var3.r(5.17f);
                        q0Var3.t(2.0f, 2.0f);
                        h0.t(q0Var3, 20.0f, 8.0f, 10.0f);
                        q0Var3.u(12.0f, 14.0f);
                        q0Var3.r(2.0f);
                        q0Var3.z(2.0f);
                        q0Var3.r(2.0f);
                        q0Var3.z(-2.0f);
                        q0Var3.r(2.0f);
                        q0Var3.z(-2.0f);
                        q0Var3.r(-2.0f);
                        q0Var3.z(-2.0f);
                        q0Var3.r(-2.0f);
                        q0Var3.z(2.0f);
                        q0Var3.r(-2.0f);
                        q0Var3.l();
                        w1.e.a(eVar4, q0Var3.f8447b, 0, n0Var4);
                        fVarB4 = eVar4.b();
                        n7.d.f15453o = fVarB4;
                    }
                    r3.b(fVarB4, "createPlaylist", null, 0L, oVar22, 48, 12);
                }
                break;
            case 28:
                o oVar23 = (o) obj;
                int iIntValue24 = ((Integer) obj2).intValue();
                if (!oVar23.N(iIntValue24 & 1, (iIntValue24 & 3) != 2)) {
                    oVar23.Q();
                } else {
                    w1.f fVarB5 = nh.b.f15897d;
                    if (fVarB5 == null) {
                        w1.e eVar5 = new w1.e("Filled.Edit", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                        int i16 = g0.f23208a;
                        n0 n0Var5 = new n0(q.f17569b);
                        q0 q0Var4 = new q0((byte) 0, 6);
                        q0Var4.u(3.0f, 17.25f);
                        q0Var4.y(21.0f);
                        q0Var4.r(3.75f);
                        q0Var4.s(17.81f, 9.94f);
                        q0Var4.t(-3.75f, -3.75f);
                        q0Var4.s(3.0f, 17.25f);
                        q0Var4.l();
                        q0Var4.u(20.71f, 7.04f);
                        q0Var4.n(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.41f);
                        q0Var4.t(-2.34f, -2.34f);
                        q0Var4.n(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f);
                        q0Var4.t(-1.83f, 1.83f);
                        q0Var4.t(3.75f, 3.75f);
                        q0Var4.t(1.83f, -1.83f);
                        q0Var4.l();
                        w1.e.a(eVar5, q0Var4.f8447b, 0, n0Var5);
                        fVarB5 = eVar5.b();
                        nh.b.f15897d = fVarB5;
                    }
                    r3.b(fVarB5, "edit", null, 0L, oVar23, 48, 12);
                }
                break;
            default:
                o oVar24 = (o) obj;
                int iIntValue25 = ((Integer) obj2).intValue();
                if (!oVar24.N(iIntValue25 & 1, (iIntValue25 & 3) != 2)) {
                    oVar24.Q();
                } else {
                    r3.b(nh.a.n(), "delete", null, 0L, oVar24, 48, 12);
                }
                break;
        }
        return a0Var;
    }

    public /* synthetic */ d(int i10, int i11) {
        this.f14995a = i11;
    }
}
