package x0;

import com.cnl.kikoeru.R;
import com.tencent.bugly.beta.tinker.TinkerReport;
import java.util.ArrayList;
import m0.r3;
import m0.z8;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class q2 implements ic.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24434a;

    public /* synthetic */ q2(int i10) {
        this.f24434a = i10;
    }

    @Override // ic.n
    public final Object q(Object obj, Object obj2) {
        yb.b bVar;
        int i10 = this.f24434a;
        ub.a0 a0Var = ub.a0.f21526a;
        switch (i10) {
            case 0:
                ((i2.j0) obj).f8748g = true;
                break;
            case 1:
                ((Integer) obj2).getClass();
                x9.a.a(v.D(1), (o) obj);
                break;
            case 2:
                ((Integer) obj2).getClass();
                y9.b.a(v.D(1), (o) obj);
                break;
            case 3:
                String str = (String) obj;
                yb.f fVar = (yb.f) obj2;
                jc.l.e(str, "acc");
                jc.l.e(fVar, "element");
                if (str.length() != 0) {
                }
                break;
            case 4:
                yb.h hVar = (yb.h) obj;
                yb.f fVar2 = (yb.f) obj2;
                jc.l.e(hVar, "acc");
                jc.l.e(fVar2, "element");
                yb.h hVarL = hVar.L(fVar2.getKey());
                yb.i iVar = yb.i.f26088a;
                if (hVarL != iVar) {
                    yb.d dVar = yb.d.f26087a;
                    yb.e eVar = (yb.e) hVarL.R(dVar);
                    if (eVar == null) {
                        bVar = new yb.b(fVar2, hVarL);
                    } else {
                        yb.h hVarL2 = hVarL.L(dVar);
                        if (hVarL2 != iVar) {
                            bVar = new yb.b(eVar, new yb.b(fVar2, hVarL2));
                        }
                    }
                    break;
                }
                break;
            case 5:
                o oVar = (o) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!oVar.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    oVar.Q();
                } else {
                    w1.f fVarB = a.a.f2c;
                    if (fVarB == null) {
                        w1.e eVar2 = new w1.e("AutoMirrored.Filled.PlaylistPlay", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, true, 96);
                        int i11 = w1.g0.f23208a;
                        long j10 = q1.q.f17569b;
                        q1.n0 n0Var = new q1.n0(j10);
                        ArrayList arrayList = new ArrayList(32);
                        arrayList.add(new w1.n(3.0f, 10.0f));
                        arrayList.add(new w1.t(11.0f));
                        arrayList.add(new w1.z(2.0f));
                        arrayList.add(new w1.t(-11.0f));
                        w1.j jVar = w1.j.f23242c;
                        arrayList.add(jVar);
                        w1.e.a(eVar2, arrayList, 0, n0Var);
                        q1.n0 n0Var2 = new q1.n0(j10);
                        ArrayList arrayList2 = new ArrayList(32);
                        arrayList2.add(new w1.n(3.0f, 6.0f));
                        arrayList2.add(new w1.t(11.0f));
                        arrayList2.add(new w1.z(2.0f));
                        arrayList2.add(new w1.t(-11.0f));
                        arrayList2.add(jVar);
                        w1.e.a(eVar2, arrayList2, 0, n0Var2);
                        q1.n0 n0Var3 = new q1.n0(j10);
                        ArrayList arrayList3 = new ArrayList(32);
                        arrayList3.add(new w1.n(3.0f, 14.0f));
                        arrayList3.add(new w1.t(7.0f));
                        arrayList3.add(new w1.z(2.0f));
                        arrayList3.add(new w1.t(-7.0f));
                        arrayList3.add(jVar);
                        w1.e.a(eVar2, arrayList3, 0, n0Var3);
                        q1.n0 n0Var4 = new q1.n0(j10);
                        ArrayList arrayList4 = new ArrayList(32);
                        arrayList4.add(new w1.n(16.0f, 13.0f));
                        arrayList4.add(new w1.u(0.0f, 8.0f));
                        arrayList4.add(new w1.u(6.0f, -4.0f));
                        arrayList4.add(jVar);
                        w1.e.a(eVar2, arrayList4, 0, n0Var4);
                        fVarB = eVar2.b();
                        a.a.f2c = fVarB;
                    }
                    r3.b(fVarB, "NavToPlaylist", null, 0L, oVar, 48, 12);
                }
                break;
            case 6:
                o oVar2 = (o) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (!oVar2.N(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    oVar2.Q();
                } else {
                    z8.b(n7.e.E(R.string.choose_encoding, oVar2), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, oVar2, 0, 0, 131070);
                }
                break;
            case 7:
                o oVar3 = (o) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (!oVar3.N(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    oVar3.Q();
                } else {
                    r3.b(nh.b.u(), "ClearAll", null, 0L, oVar3, 48, 12);
                }
                break;
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_DALVIK /* 8 */:
                o oVar4 = (o) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (!oVar4.N(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    oVar4.Q();
                } else {
                    r3.b(nh.b.t(), "add", null, 0L, oVar4, 48, 12);
                }
                break;
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_ART /* 9 */:
                o oVar5 = (o) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (!oVar5.N(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    oVar5.Q();
                } else {
                    z8.b(na.q.g(R.string.local_subtitle), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, oVar5, 0, 0, 131070);
                }
                break;
            case TinkerReport.KEY_APPLY_WITH_RETRY /* 10 */:
                o oVar6 = (o) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                if (!oVar6.N(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    oVar6.Q();
                } else {
                    z8.b(na.q.g(R.string.local_subtitle_summary), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, oVar6, 0, 0, 131070);
                }
                break;
            case 11:
                ((Integer) obj2).getClass();
                z9.m.g(v.D(1), (o) obj);
                break;
            default:
                ((Integer) obj2).getClass();
                z9.m.f(v.D(1), (o) obj);
                break;
        }
        return a0Var;
    }
}
