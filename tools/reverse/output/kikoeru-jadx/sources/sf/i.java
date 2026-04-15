package sf;

import androidx.media3.exoplayer.offline.u;
import c7.e1;
import com.tencent.bugly.beta.tinker.TinkerReport;
import e3.m;
import e3.q;
import e3.r;
import e3.s;
import f3.o;
import i2.l0;
import j2.h0;
import java.util.ArrayList;
import java.util.List;
import n7.b0;
import q.t0;
import q1.k0;
import r.y1;
import t2.c0;
import t2.d0;
import t2.f0;
import t2.j0;
import t2.m0;
import t2.n0;
import t2.p;
import ub.a0;
import wf.z0;
import x2.n;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i implements ic.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20023a;

    public /* synthetic */ i(int i10) {
        this.f20023a = i10;
    }

    @Override // ic.k
    public final Object a(Object obj) {
        int i10 = this.f20023a;
        a0 a0Var = a0.f21526a;
        int i11 = 0;
        d0 d0Var = null;
        k0Var = null;
        k0 k0Var = null;
        sVar = null;
        s sVar = null;
        j0Var = null;
        j0 j0Var = null;
        kVar = null;
        t2.k kVar = null;
        lVar = null;
        t2.l lVar = null;
        m0Var = null;
        m0 m0Var = null;
        n0Var = null;
        n0 n0Var = null;
        d0Var = null;
        d0 d0Var2 = null;
        sVar = null;
        t2.s sVar2 = null;
        j0Var = null;
        j0 j0Var2 = null;
        d0Var = null;
        switch (i10) {
            case 0:
                pc.c cVar = (pc.c) obj;
                jc.l.e(cVar, "it");
                a aVarC = n7.e.C(cVar);
                if (aVarC == null) {
                    aVarC = z0.g(cVar) ? new d(cVar) : null;
                }
                if (aVarC != null) {
                    return b0.o(aVarC);
                }
                return null;
            case 1:
                float f10 = t0.f.f20107a;
                return a0Var;
            case 2:
                l0 l0Var = (l0) obj;
                e1 e1Var = l0Var.f8782a.f19346b;
                long jD = e1Var.D();
                e1Var.z().f();
                try {
                    ((e1) ((y1) e1Var.f3618b).f18634b).z().o(-3.4028235E38f, 0.0f, Float.MAX_VALUE, Float.MAX_VALUE, 1);
                    l0Var.b();
                    return a0Var;
                } finally {
                    t0.L(e1Var, jD);
                }
            case 3:
                return Boolean.valueOf(!(((t2.b) obj) instanceof t2.s));
            case 4:
                p pVar = (p) obj;
                StringBuilder sb = new StringBuilder("[");
                sb.append(pVar.f20378b);
                sb.append(", ");
                return h0.m(sb, pVar.f20379c, ')');
            case 5:
                jc.l.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                List list = (List) obj;
                Object obj2 = list.get(0);
                ic.k kVar2 = (ic.k) t2.b0.f20269h.f969c;
                Boolean bool = Boolean.FALSE;
                d0 d0Var3 = (jc.l.a(obj2, bool) || obj2 == null) ? null : (d0) kVar2.a(obj2);
                Object obj3 = list.get(1);
                d0 d0Var4 = (jc.l.a(obj3, bool) || obj3 == null) ? null : (d0) kVar2.a(obj3);
                Object obj4 = list.get(2);
                d0 d0Var5 = (jc.l.a(obj4, bool) || obj4 == null) ? null : (d0) kVar2.a(obj4);
                Object obj5 = list.get(3);
                if (!jc.l.a(obj5, bool) && obj5 != null) {
                    d0Var = (d0) kVar2.a(obj5);
                }
                return new j0(d0Var3, d0Var4, d0Var5, d0Var);
            case 6:
                jc.l.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                List list2 = (List) obj;
                Object obj6 = list2.get(1);
                List list3 = (jc.l.a(obj6, Boolean.FALSE) || obj6 == null) ? null : (List) ((ic.k) t2.b0.f20262a.f969c).a(obj6);
                Object obj7 = list2.get(0);
                String str = obj7 != null ? (String) obj7 : null;
                jc.l.b(str);
                return new t2.g(list3, str);
            case 7:
                jc.l.c(obj, "null cannot be cast to non-null type kotlin.Int");
                return new e3.l(((Integer) obj).intValue());
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_DALVIK /* 8 */:
                jc.l.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Float>");
                List list4 = (List) obj;
                return new e3.p(((Number) list4.get(0)).floatValue(), ((Number) list4.get(1)).floatValue());
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_ART /* 9 */:
                jc.l.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                List list5 = (List) obj;
                Object obj8 = list5.get(0);
                f3.p[] pVarArr = o.f6671b;
                ic.k kVar3 = t2.b0.f20278q.f20261b;
                Boolean bool2 = Boolean.FALSE;
                jc.l.a(obj8, bool2);
                o oVar = obj8 != null ? (o) kVar3.a(obj8) : null;
                jc.l.b(oVar);
                long j10 = oVar.f6673a;
                Object obj9 = list5.get(1);
                jc.l.a(obj9, bool2);
                o oVar2 = obj9 != null ? (o) kVar3.a(obj9) : null;
                jc.l.b(oVar2);
                return new q(j10, oVar2.f6673a);
            case TinkerReport.KEY_APPLY_WITH_RETRY /* 10 */:
                jc.l.c(obj, "null cannot be cast to non-null type kotlin.Int");
                return new x2.k(((Integer) obj).intValue());
            case 11:
                jc.l.c(obj, "null cannot be cast to non-null type kotlin.Float");
                return new e3.a(((Float) obj).floatValue());
            case 12:
                jc.l.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                List list6 = (List) obj;
                Object obj10 = list6.get(0);
                Integer num = obj10 != null ? (Integer) obj10 : null;
                jc.l.b(num);
                int iIntValue = num.intValue();
                Object obj11 = list6.get(1);
                Integer num2 = obj11 != null ? (Integer) obj11 : null;
                jc.l.b(num2);
                return new t2.k0(c0.b(iIntValue, num2.intValue()));
            case 13:
                jc.l.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                List list7 = (List) obj;
                Object obj12 = list7.get(0);
                int i12 = q1.q.f17576i;
                Boolean bool3 = Boolean.FALSE;
                jc.l.a(obj12, bool3);
                q1.q qVar = obj12 != null ? jc.l.a(obj12, Boolean.FALSE) ? new q1.q(q1.q.f17575h) : new q1.q(q1.h0.c(((Integer) obj12).intValue())) : null;
                jc.l.b(qVar);
                long j11 = qVar.f17577a;
                Object obj13 = list7.get(1);
                t2.a0 a0Var2 = t2.b0.f20279r;
                jc.l.a(obj13, bool3);
                p1.b bVar = obj13 != null ? (p1.b) a0Var2.f20261b.a(obj13) : null;
                jc.l.b(bVar);
                long j12 = bVar.f16481a;
                Object obj14 = list7.get(2);
                Float f11 = obj14 != null ? (Float) obj14 : null;
                jc.l.b(f11);
                return new k0(j11, j12, f11.floatValue());
            case 14:
                if (jc.l.a(obj, Boolean.FALSE)) {
                    return new o(o.f6672c);
                }
                jc.l.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                List list8 = (List) obj;
                Object obj15 = list8.get(0);
                Float f12 = obj15 != null ? (Float) obj15 : null;
                jc.l.b(f12);
                float fFloatValue = f12.floatValue();
                Object obj16 = list8.get(1);
                f3.p pVar2 = obj16 != null ? (f3.p) obj16 : null;
                jc.l.b(pVar2);
                return new o(lc.b.H(fFloatValue, pVar2.f6674a));
            case 15:
                jc.l.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                List list9 = (List) obj;
                Object obj17 = list9.get(0);
                String str2 = obj17 != null ? (String) obj17 : null;
                jc.l.b(str2);
                Object obj18 = list9.get(1);
                u uVar = t2.b0.f20270i;
                if (!jc.l.a(obj18, Boolean.FALSE) && obj18 != null) {
                    j0Var2 = (j0) ((ic.k) uVar.f969c).a(obj18);
                }
                return new t2.l(str2, j0Var2);
            case 16:
                if (jc.l.a(obj, Boolean.FALSE)) {
                    return new p1.b(9205357640488583168L);
                }
                jc.l.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                List list10 = (List) obj;
                Object obj19 = list10.get(0);
                Float f13 = obj19 != null ? (Float) obj19 : null;
                jc.l.b(f13);
                float fFloatValue2 = f13.floatValue();
                Object obj20 = list10.get(1);
                Float f14 = obj20 != null ? (Float) obj20 : null;
                jc.l.b(f14);
                return new p1.b((((long) Float.floatToRawIntBits(fFloatValue2)) << 32) | (((long) Float.floatToRawIntBits(f14.floatValue())) & 4294967295L));
            case 17:
                jc.l.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                List list11 = (List) obj;
                ArrayList arrayList = new ArrayList(list11.size());
                int size = list11.size();
                while (i11 < size) {
                    Object obj21 = list11.get(i11);
                    a3.b bVar2 = (jc.l.a(obj21, Boolean.FALSE) || obj21 == null) ? null : (a3.b) ((ic.k) t2.b0.f20281t.f969c).a(obj21);
                    jc.l.b(bVar2);
                    arrayList.add(bVar2);
                    i11++;
                }
                return new a3.c(arrayList);
            case 18:
                jc.l.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                List list12 = (List) obj;
                ArrayList arrayList2 = new ArrayList(list12.size());
                int size2 = list12.size();
                while (i11 < size2) {
                    Object obj22 = list12.get(i11);
                    t2.e eVar = (jc.l.a(obj22, Boolean.FALSE) || obj22 == null) ? null : (t2.e) ((ic.k) t2.b0.f20263b.f969c).a(obj22);
                    jc.l.b(eVar);
                    arrayList2.add(eVar);
                    i11++;
                }
                return arrayList2;
            case 19:
                jc.l.c(obj, "null cannot be cast to non-null type kotlin.String");
                return new a3.b(a3.e.f198a.x((String) obj));
            case 20:
                jc.l.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                List list13 = (List) obj;
                Object obj23 = list13.get(0);
                e3.f fVar = obj23 != null ? (e3.f) obj23 : null;
                jc.l.b(fVar);
                float f15 = fVar.f6073a;
                Object obj24 = list13.get(1);
                e3.h hVar = obj24 != null ? (e3.h) obj24 : null;
                jc.l.b(hVar);
                int i13 = hVar.f6074a;
                Object obj25 = list13.get(2);
                jc.l.b(obj25 != null ? (e3.g) obj25 : null);
                return new e3.i(f15, i13);
            case 21:
                jc.l.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                List list14 = (List) obj;
                Object obj26 = list14.get(0);
                t2.i iVar = obj26 != null ? (t2.i) obj26 : null;
                jc.l.b(iVar);
                Object obj27 = list14.get(2);
                Integer num3 = obj27 != null ? (Integer) obj27 : null;
                jc.l.b(num3);
                int iIntValue2 = num3.intValue();
                Object obj28 = list14.get(3);
                Integer num4 = obj28 != null ? (Integer) obj28 : null;
                jc.l.b(num4);
                int iIntValue3 = num4.intValue();
                Object obj29 = list14.get(4);
                String str3 = obj29 != null ? (String) obj29 : null;
                jc.l.b(str3);
                switch (iVar.ordinal()) {
                    case 0:
                        Object obj30 = list14.get(1);
                        u uVar2 = t2.b0.f20268g;
                        if (!jc.l.a(obj30, Boolean.FALSE) && obj30 != null) {
                            sVar2 = (t2.s) ((ic.k) uVar2.f969c).a(obj30);
                        }
                        jc.l.b(sVar2);
                        return new t2.e(sVar2, iIntValue2, iIntValue3, str3);
                    case 1:
                        Object obj31 = list14.get(1);
                        u uVar3 = t2.b0.f20269h;
                        if (!jc.l.a(obj31, Boolean.FALSE) && obj31 != null) {
                            d0Var2 = (d0) ((ic.k) uVar3.f969c).a(obj31);
                        }
                        jc.l.b(d0Var2);
                        return new t2.e(d0Var2, iIntValue2, iIntValue3, str3);
                    case 2:
                        Object obj32 = list14.get(1);
                        u uVar4 = t2.b0.f20264c;
                        if (!jc.l.a(obj32, Boolean.FALSE) && obj32 != null) {
                            n0Var = (n0) ((ic.k) uVar4.f969c).a(obj32);
                        }
                        jc.l.b(n0Var);
                        return new t2.e(n0Var, iIntValue2, iIntValue3, str3);
                    case 3:
                        Object obj33 = list14.get(1);
                        u uVar5 = t2.b0.f20265d;
                        if (!jc.l.a(obj33, Boolean.FALSE) && obj33 != null) {
                            m0Var = (m0) ((ic.k) uVar5.f969c).a(obj33);
                        }
                        jc.l.b(m0Var);
                        return new t2.e(m0Var, iIntValue2, iIntValue3, str3);
                    case 4:
                        Object obj34 = list14.get(1);
                        u uVar6 = t2.b0.f20266e;
                        if (!jc.l.a(obj34, Boolean.FALSE) && obj34 != null) {
                            lVar = (t2.l) ((ic.k) uVar6.f969c).a(obj34);
                        }
                        jc.l.b(lVar);
                        return new t2.e(lVar, iIntValue2, iIntValue3, str3);
                    case 5:
                        Object obj35 = list14.get(1);
                        u uVar7 = t2.b0.f20267f;
                        if (!jc.l.a(obj35, Boolean.FALSE) && obj35 != null) {
                            kVar = (t2.k) ((ic.k) uVar7.f969c).a(obj35);
                        }
                        jc.l.b(kVar);
                        return new t2.e(kVar, iIntValue2, iIntValue3, str3);
                    case 6:
                        Object obj36 = list14.get(1);
                        String str4 = obj36 != null ? (String) obj36 : null;
                        jc.l.b(str4);
                        return new t2.e(new f0(str4), iIntValue2, iIntValue3, str3);
                    default:
                        throw new ce.j0();
                }
            case 22:
                String str5 = obj != null ? (String) obj : null;
                jc.l.b(str5);
                return new n0(str5);
            case 23:
                String str6 = obj != null ? (String) obj : null;
                jc.l.b(str6);
                return new m0(str6);
            case 24:
                jc.l.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                List list15 = (List) obj;
                Object obj37 = list15.get(0);
                String str7 = obj37 != null ? (String) obj37 : null;
                jc.l.b(str7);
                Object obj38 = list15.get(1);
                u uVar8 = t2.b0.f20270i;
                if (!jc.l.a(obj38, Boolean.FALSE) && obj38 != null) {
                    j0Var = (j0) ((ic.k) uVar8.f969c).a(obj38);
                }
                return new t2.k(str7, j0Var);
            case 25:
                jc.l.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                List list16 = (List) obj;
                Object obj39 = list16.get(0);
                e3.k kVar4 = obj39 != null ? (e3.k) obj39 : null;
                jc.l.b(kVar4);
                int i14 = kVar4.f6081a;
                Object obj40 = list16.get(1);
                m mVar = obj40 != null ? (m) obj40 : null;
                jc.l.b(mVar);
                int i15 = mVar.f6086a;
                Object obj41 = list16.get(2);
                f3.p[] pVarArr2 = o.f6671b;
                t2.a0 a0Var3 = t2.b0.f20278q;
                Boolean bool4 = Boolean.FALSE;
                jc.l.a(obj41, bool4);
                o oVar3 = obj41 != null ? (o) a0Var3.f20261b.a(obj41) : null;
                jc.l.b(oVar3);
                long j13 = oVar3.f6673a;
                Object obj42 = list16.get(3);
                q qVar2 = q.f6091c;
                q qVar3 = (jc.l.a(obj42, bool4) || obj42 == null) ? null : (q) ((ic.k) t2.b0.f20273l.f969c).a(obj42);
                Object obj43 = list16.get(4);
                t2.u uVar9 = (jc.l.a(obj43, bool4) || obj43 == null) ? null : (t2.u) ((ic.k) c0.f20287a.f969c).a(obj43);
                Object obj44 = list16.get(5);
                e3.i iVar2 = e3.i.f6075c;
                e3.i iVar3 = (jc.l.a(obj44, bool4) || obj44 == null) ? null : (e3.i) ((ic.k) t2.b0.f20282u.f969c).a(obj44);
                Object obj45 = list16.get(6);
                e3.e eVar2 = (jc.l.a(obj45, bool4) || obj45 == null) ? null : (e3.e) ((ic.k) c0.f20288b.f969c).a(obj45);
                jc.l.b(eVar2);
                int i16 = eVar2.f6069a;
                Object obj46 = list16.get(7);
                e3.d dVar = obj46 != null ? (e3.d) obj46 : null;
                jc.l.b(dVar);
                int i17 = dVar.f6067a;
                Object obj47 = list16.get(8);
                boolean zA = jc.l.a(obj47, bool4);
                u uVar10 = c0.f20289c;
                if (!zA && obj47 != null) {
                    sVar = (s) ((ic.k) uVar10.f969c).a(obj47);
                }
                return new t2.s(i14, i15, j13, qVar3, uVar9, iVar3, i16, i17, sVar);
            case 26:
                jc.l.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                List list17 = (List) obj;
                Object obj48 = list17.get(0);
                int i18 = q1.q.f17576i;
                Boolean bool5 = Boolean.FALSE;
                jc.l.a(obj48, bool5);
                q1.q qVar4 = obj48 != null ? obj48.equals(bool5) ? new q1.q(q1.q.f17575h) : new q1.q(q1.h0.c(((Integer) obj48).intValue())) : null;
                jc.l.b(qVar4);
                long j14 = qVar4.f17577a;
                Object obj49 = list17.get(1);
                f3.p[] pVarArr3 = o.f6671b;
                ic.k kVar5 = t2.b0.f20278q.f20261b;
                jc.l.a(obj49, bool5);
                o oVar4 = obj49 != null ? (o) kVar5.a(obj49) : null;
                jc.l.b(oVar4);
                long j15 = oVar4.f6673a;
                Object obj50 = list17.get(2);
                x2.k kVar6 = x2.k.f24560b;
                x2.k kVar7 = (jc.l.a(obj50, bool5) || obj50 == null) ? null : (x2.k) ((ic.k) t2.b0.f20274m.f969c).a(obj50);
                Object obj51 = list17.get(3);
                x2.i iVar4 = obj51 != null ? (x2.i) obj51 : null;
                Object obj52 = list17.get(4);
                x2.j jVar = obj52 != null ? (x2.j) obj52 : null;
                Object obj53 = list17.get(6);
                String str8 = obj53 != null ? (String) obj53 : null;
                Object obj54 = list17.get(7);
                jc.l.a(obj54, bool5);
                o oVar5 = obj54 != null ? (o) kVar5.a(obj54) : null;
                jc.l.b(oVar5);
                long j16 = oVar5.f6673a;
                Object obj55 = list17.get(8);
                e3.a aVar = (jc.l.a(obj55, bool5) || obj55 == null) ? null : (e3.a) ((ic.k) t2.b0.f20275n.f969c).a(obj55);
                Object obj56 = list17.get(9);
                e3.p pVar3 = (jc.l.a(obj56, bool5) || obj56 == null) ? null : (e3.p) ((ic.k) t2.b0.f20272k.f969c).a(obj56);
                Object obj57 = list17.get(10);
                a3.c cVar2 = a3.c.f195c;
                a3.c cVar3 = (jc.l.a(obj57, bool5) || obj57 == null) ? null : (a3.c) ((ic.k) t2.b0.f20280s.f969c).a(obj57);
                Object obj58 = list17.get(11);
                jc.l.a(obj58, bool5);
                q1.q qVar5 = obj58 != null ? obj58.equals(bool5) ? new q1.q(q1.q.f17575h) : new q1.q(q1.h0.c(((Integer) obj58).intValue())) : null;
                jc.l.b(qVar5);
                long j17 = qVar5.f17577a;
                Object obj59 = list17.get(12);
                e3.l lVar2 = (jc.l.a(obj59, bool5) || obj59 == null) ? null : (e3.l) ((ic.k) t2.b0.f20271j.f969c).a(obj59);
                Object obj60 = list17.get(13);
                k0 k0Var2 = k0.f17544d;
                u uVar11 = t2.b0.f20276o;
                if (!jc.l.a(obj60, bool5) && obj60 != null) {
                    k0Var = (k0) ((ic.k) uVar11.f969c).a(obj60);
                }
                return new d0(j14, j15, kVar7, iVar4, jVar, (n) null, str8, j16, aVar, pVar3, cVar3, j17, lVar2, k0Var, 49184);
            case 27:
                jc.l.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                List list18 = (List) obj;
                Object obj61 = list18.get(0);
                Boolean bool6 = obj61 != null ? (Boolean) obj61 : null;
                jc.l.b(bool6);
                boolean zBooleanValue = bool6.booleanValue();
                Object obj62 = list18.get(1);
                jc.l.b(obj62 != null ? (t2.j) obj62 : null);
                return new t2.u(zBooleanValue);
            case 28:
                jc.l.c(obj, "null cannot be cast to non-null type kotlin.Int");
                return new e3.e(((Integer) obj).intValue());
            default:
                jc.l.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                List list19 = (List) obj;
                Object obj63 = list19.get(0);
                r rVar = obj63 != null ? (r) obj63 : null;
                jc.l.b(rVar);
                int i19 = rVar.f6094a;
                Object obj64 = list19.get(1);
                Boolean bool7 = obj64 != null ? (Boolean) obj64 : null;
                jc.l.b(bool7);
                return new s(i19, bool7.booleanValue());
        }
    }
}
