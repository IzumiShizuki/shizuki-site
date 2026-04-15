package t2;

import com.cnl.kikoeru.R;
import com.tencent.bugly.beta.tinker.TinkerReport;
import hd.q0;
import java.util.ArrayList;
import java.util.List;
import m0.b1;
import m0.c1;
import m0.r3;
import m0.z8;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class x implements ic.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20403a;

    public /* synthetic */ x(int i10) {
        this.f20403a = i10;
    }

    @Override // ic.n
    public final Object q(Object obj, Object obj2) {
        i iVar;
        Object objA;
        int i10 = this.f20403a;
        ub.a0 a0Var = ub.a0.f21526a;
        switch (i10) {
            case 0:
                p1.b bVar = (p1.b) obj2;
                return bVar == null ? false : p1.b.c(bVar.f16481a, 9205357640488583168L) ? Boolean.FALSE : ud.b.c(Float.valueOf(Float.intBitsToFloat((int) (bVar.f16481a >> 32))), Float.valueOf(Float.intBitsToFloat((int) (bVar.f16481a & 4294967295L))));
            case 1:
                g1.b bVar2 = (g1.b) obj;
                List list = ((a3.c) obj2).f196a;
                ArrayList arrayList = new ArrayList(list.size());
                int size = list.size();
                for (int i11 = 0; i11 < size; i11++) {
                    arrayList.add(b0.a((a3.b) list.get(i11), b0.f20281t, bVar2));
                }
                return arrayList;
            case 2:
                return ((a3.b) obj2).f194a.toLanguageTag();
            case 3:
                e3.i iVar2 = (e3.i) obj2;
                return ud.b.c(new e3.f(iVar2.f6076a), new e3.h(iVar2.f6077b), new e3.g());
            case 4:
                g1.b bVar3 = (g1.b) obj;
                e eVar = (e) obj2;
                Object obj3 = eVar.f20309a;
                if (obj3 instanceof s) {
                    iVar = i.f20336a;
                } else if (obj3 instanceof d0) {
                    iVar = i.f20337b;
                } else if (obj3 instanceof n0) {
                    iVar = i.f20338c;
                } else if (obj3 instanceof m0) {
                    iVar = i.f20339d;
                } else if (obj3 instanceof l) {
                    iVar = i.f20340e;
                } else if (obj3 instanceof k) {
                    iVar = i.f20341f;
                } else {
                    if (!(obj3 instanceof f0)) {
                        throw new UnsupportedOperationException();
                    }
                    iVar = i.f20342g;
                }
                switch (iVar.ordinal()) {
                    case 0:
                        jc.l.c(obj3, "null cannot be cast to non-null type androidx.compose.ui.text.ParagraphStyle");
                        objA = b0.a((s) obj3, b0.f20268g, bVar3);
                        break;
                    case 1:
                        jc.l.c(obj3, "null cannot be cast to non-null type androidx.compose.ui.text.SpanStyle");
                        objA = b0.a((d0) obj3, b0.f20269h, bVar3);
                        break;
                    case 2:
                        jc.l.c(obj3, "null cannot be cast to non-null type androidx.compose.ui.text.VerbatimTtsAnnotation");
                        objA = b0.a((n0) obj3, b0.f20264c, bVar3);
                        break;
                    case 3:
                        jc.l.c(obj3, "null cannot be cast to non-null type androidx.compose.ui.text.UrlAnnotation");
                        objA = b0.a((m0) obj3, b0.f20265d, bVar3);
                        break;
                    case 4:
                        jc.l.c(obj3, "null cannot be cast to non-null type androidx.compose.ui.text.LinkAnnotation.Url");
                        objA = b0.a((l) obj3, b0.f20266e, bVar3);
                        break;
                    case 5:
                        jc.l.c(obj3, "null cannot be cast to non-null type androidx.compose.ui.text.LinkAnnotation.Clickable");
                        objA = b0.a((k) obj3, b0.f20267f, bVar3);
                        break;
                    case 6:
                        jc.l.c(obj3, "null cannot be cast to non-null type androidx.compose.ui.text.StringAnnotation");
                        objA = ((f0) obj3).f20318a;
                        break;
                    default:
                        throw new ce.j0();
                }
                return ud.b.c(iVar, objA, Integer.valueOf(eVar.f20310b), Integer.valueOf(eVar.f20311c), eVar.f20312d);
            case 5:
                k kVar = (k) obj2;
                return ud.b.c(kVar.f20354a, b0.a(kVar.f20355b, b0.f20270i, (g1.b) obj));
            case 6:
                return ((n0) obj2).f20374a;
            case 7:
                return ((m0) obj2).f20365a;
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_DALVIK /* 8 */:
                g1.b bVar4 = (g1.b) obj;
                s sVar = (s) obj2;
                e3.k kVar2 = new e3.k(sVar.f20387a);
                e3.m mVar = new e3.m(sVar.f20388b);
                Object objA2 = b0.a(new f3.o(sVar.f20389c), b0.f20278q, bVar4);
                e3.q qVar = sVar.f20390d;
                e3.q qVar2 = e3.q.f6091c;
                Object objA3 = b0.a(qVar, b0.f20273l, bVar4);
                Object objA4 = b0.a(sVar.f20391e, c0.f20287a, bVar4);
                e3.i iVar3 = sVar.f20392f;
                e3.i iVar4 = e3.i.f6075c;
                return ud.b.c(kVar2, mVar, objA2, objA3, objA4, b0.a(iVar3, b0.f20282u, bVar4), b0.a(new e3.e(sVar.f20393g), c0.f20288b, bVar4), new e3.d(sVar.f20394h), b0.a(sVar.f20395i, c0.f20289c, bVar4));
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_ART /* 9 */:
                g1.b bVar5 = (g1.b) obj;
                d0 d0Var = (d0) obj2;
                q1.q qVar3 = new q1.q(d0Var.f20293a.b());
                a0 a0Var2 = b0.f20277p;
                Object objA5 = b0.a(qVar3, a0Var2, bVar5);
                f3.o oVar = new f3.o(d0Var.f20294b);
                a0 a0Var3 = b0.f20278q;
                Object objA6 = b0.a(oVar, a0Var3, bVar5);
                x2.k kVar3 = d0Var.f20295c;
                x2.k kVar4 = x2.k.f24560b;
                Object objA7 = b0.a(kVar3, b0.f20274m, bVar5);
                x2.i iVar5 = d0Var.f20296d;
                x2.j jVar = d0Var.f20297e;
                String str = d0Var.f20299g;
                Object objA8 = b0.a(new f3.o(d0Var.f20300h), a0Var3, bVar5);
                Object objA9 = b0.a(d0Var.f20301i, b0.f20275n, bVar5);
                Object objA10 = b0.a(d0Var.f20302j, b0.f20272k, bVar5);
                a3.c cVar = d0Var.f20303k;
                a3.c cVar2 = a3.c.f195c;
                Object objA11 = b0.a(cVar, b0.f20280s, bVar5);
                Object objA12 = b0.a(new q1.q(d0Var.f20304l), a0Var2, bVar5);
                Object objA13 = b0.a(d0Var.f20305m, b0.f20271j, bVar5);
                q1.k0 k0Var = d0Var.f20306n;
                q1.k0 k0Var2 = q1.k0.f17544d;
                return ud.b.c(objA5, objA6, objA7, iVar5, jVar, -1, str, objA8, objA9, objA10, objA11, objA12, objA13, b0.a(k0Var, b0.f20276o, bVar5));
            case TinkerReport.KEY_APPLY_WITH_RETRY /* 10 */:
                g1.b bVar6 = (g1.b) obj;
                j0 j0Var = (j0) obj2;
                d0 d0Var2 = j0Var.f20350a;
                androidx.media3.exoplayer.offline.u uVar = b0.f20269h;
                return ud.b.c(b0.a(d0Var2, uVar, bVar6), b0.a(j0Var.f20351b, uVar, bVar6), b0.a(j0Var.f20352c, uVar, bVar6), b0.a(j0Var.f20353d, uVar, bVar6));
            case 11:
                Boolean boolValueOf = Boolean.valueOf(((u) obj2).f20399a);
                androidx.media3.exoplayer.offline.u uVar2 = b0.f20262a;
                return ud.b.c(boolValueOf, new j());
            case 12:
                return Integer.valueOf(((e3.e) obj2).f6069a);
            case 13:
                e3.s sVar2 = (e3.s) obj2;
                e3.r rVar = new e3.r(sVar2.f6097a);
                androidx.media3.exoplayer.offline.u uVar3 = b0.f20262a;
                return ud.b.c(rVar, Boolean.valueOf(sVar2.f6098b));
            case 14:
                ((Integer) obj2).getClass();
                t9.e.b(x0.v.D(1), (x0.o) obj);
                return a0Var;
            case 15:
                x0.o oVar2 = (x0.o) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (oVar2.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    r3.b(nh.b.v(), "delete", null, ((b1) oVar2.j(c1.f12773a)).c(), oVar2, 48, 4);
                } else {
                    oVar2.Q();
                }
                return a0Var;
            case 16:
                x0.o oVar3 = (x0.o) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (oVar3.N(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    r3.b(nh.b.t(), "add", null, 0L, oVar3, 48, 12);
                } else {
                    oVar3.Q();
                }
                return a0Var;
            case 17:
                x0.o oVar4 = (x0.o) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (oVar4.N(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    z8.b(na.q.g(R.string.add_new_blacklist), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, oVar4, 0, 0, 131070);
                } else {
                    oVar4.Q();
                }
                return a0Var;
            case 18:
                x0.o oVar5 = (x0.o) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (oVar5.N(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    z8.b(na.q.g(R.string.blacklist_type), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, oVar5, 0, 0, 131070);
                } else {
                    oVar5.Q();
                }
                return a0Var;
            case 19:
                x0.o oVar6 = (x0.o) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (oVar6.N(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    z8.b(na.q.g(R.string.blacklist_value), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, oVar6, 0, 0, 131070);
                } else {
                    oVar6.Q();
                }
                return a0Var;
            case 20:
                x0.o oVar7 = (x0.o) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                if (oVar7.N(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    r3.b(nh.b.v(), "DeleteAll", null, 0L, oVar7, 48, 12);
                } else {
                    oVar7.Q();
                }
                return a0Var;
            case 21:
                ((Integer) obj2).getClass();
                u9.j.b(x0.v.D(1), (x0.o) obj);
                return a0Var;
            case 22:
                ((Integer) obj2).getClass();
                u9.j.a(x0.v.D(1), (x0.o) obj);
                return a0Var;
            case 23:
                ((Integer) obj).intValue();
                ub.k kVar5 = (ub.k) obj2;
                jc.l.e(kVar5, "it");
                return kVar5.f21543a;
            case 24:
                x0.o oVar8 = (x0.o) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                if (oVar8.N(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    w1.f fVarB = nd.h.f15800n;
                    if (fVarB == null) {
                        w1.e eVar2 = new w1.e("Rounded.DragHandle", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                        int i12 = w1.g0.f23208a;
                        q1.n0 n0Var = new q1.n0(q1.q.f17569b);
                        q0 q0Var = new q0((byte) 0, 6);
                        q0Var.u(19.0f, 9.0f);
                        q0Var.q(5.0f);
                        q0Var.n(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
                        q0Var.w(0.45f, 1.0f, 1.0f, 1.0f);
                        q0Var.r(14.0f);
                        q0Var.n(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
                        q0Var.w(-0.45f, -1.0f, -1.0f, -1.0f);
                        q0Var.l();
                        q0Var.u(5.0f, 15.0f);
                        q0Var.r(14.0f);
                        q0Var.n(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
                        q0Var.w(-0.45f, -1.0f, -1.0f, -1.0f);
                        q0Var.q(5.0f);
                        q0Var.n(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
                        q0Var.w(0.45f, 1.0f, 1.0f, 1.0f);
                        q0Var.l();
                        w1.e.a(eVar2, q0Var.f8447b, 0, n0Var);
                        fVarB = eVar2.b();
                        nd.h.f15800n = fVarB;
                    }
                    r3.b(fVarB, "Reorder", null, 0L, oVar8, 48, 12);
                } else {
                    oVar8.Q();
                }
                return a0Var;
            case 25:
                x0.o oVar9 = (x0.o) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                if (oVar9.N(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    r3.b(nh.b.x(), "Reset", null, 0L, oVar9, 48, 12);
                } else {
                    oVar9.Q();
                }
                return a0Var;
            case 26:
                x0.o oVar10 = (x0.o) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                if (oVar10.N(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    r3.b(nd.h.m(), null, null, 0L, oVar10, 48, 12);
                } else {
                    oVar10.Q();
                }
                return a0Var;
            case 27:
                x0.o oVar11 = (x0.o) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                if (oVar11.N(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    r3.b(n7.b0.l(), null, null, 0L, oVar11, 48, 12);
                } else {
                    oVar11.Q();
                }
                return a0Var;
            case 28:
                ((Integer) obj2).getClass();
                v9.b.b(x0.v.D(1), (x0.o) obj);
                return a0Var;
            default:
                ((Integer) obj2).getClass();
                v9.b.a(x0.v.D(1), (x0.o) obj);
                return a0Var;
        }
    }

    public /* synthetic */ x(int i10, int i11) {
        this.f20403a = i11;
    }
}
