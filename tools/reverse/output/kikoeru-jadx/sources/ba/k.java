package ba;

import android.graphics.Typeface;
import android.text.Spannable;
import androidx.compose.foundation.layout.LayoutWeightElement;
import bg.e2;
import com.tencent.bugly.beta.tinker.TinkerReport;
import java.util.List;
import java.util.WeakHashMap;
import m0.d9;
import m0.e9;
import m0.i5;
import m0.n3;
import m0.p3;
import m0.r3;
import m0.z8;
import ub.a0;
import y.j1;
import y.k1;
import y.s1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k implements ic.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2396a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2397b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f2398c;

    public /* synthetic */ k(int i10, Object obj, Object obj2) {
        this.f2396a = i10;
        this.f2397b = obj;
        this.f2398c = obj2;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // ic.o
    public final Object g(Object obj, Object obj2, Object obj3) {
        Typeface typeface;
        int i10 = this.f2396a;
        j1.n nVar = j1.n.f9689a;
        x0.r0 r0Var = x0.k.f24334a;
        ub.a0 a0Var = ub.a0.f21526a;
        Object obj4 = this.f2398c;
        Object obj5 = this.f2397b;
        final int i11 = 1;
        switch (i10) {
            case 0:
                e2 e2Var = (e2) obj5;
                String str = (String) obj4;
                x0.o oVar = (x0.o) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                jc.l.e((k1) obj, "$this$DropdownMenuItem");
                if (!oVar.N(iIntValue & 1, (iIntValue & 17) != 16)) {
                    oVar.Q();
                } else {
                    i5.a(b0.a() == e2Var, androidx.compose.foundation.layout.a.n(j1.n.f9689a, 0.0f, 0.0f, 5, 0.0f, 11), false, null, oVar, 432, 56);
                    z8.b(str, null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, oVar, 0, 0, 131070);
                }
                break;
            case 1:
                Spannable spannable = (Spannable) obj5;
                a9.o oVar2 = (a9.o) obj4;
                t2.d0 d0Var = (t2.d0) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                int iIntValue3 = ((Integer) obj3).intValue();
                x2.n nVar2 = d0Var.f20298f;
                x2.k kVar = d0Var.f20295c;
                if (kVar == null) {
                    kVar = x2.k.f24562d;
                }
                x2.i iVar = d0Var.f20296d;
                int i12 = iVar != null ? iVar.f24558a : 0;
                x2.j jVar = d0Var.f20297e;
                int i13 = jVar != null ? jVar.f24559a : 65535;
                b3.c cVar = (b3.c) oVar2.f250b;
                x2.p pVarB = ((x2.e) cVar.f1477e).b(nVar2, kVar, i12, i13);
                if (pVarB instanceof x2.p) {
                    Object obj6 = pVarB.f24575a;
                    jc.l.c(obj6, "null cannot be cast to non-null type android.graphics.Typeface");
                    typeface = (Typeface) obj6;
                } else {
                    c7.e1 e1Var = new c7.e1(pVarB, cVar.f1482j);
                    cVar.f1482j = e1Var;
                    Object obj7 = e1Var.f3620d;
                    jc.l.c(obj7, "null cannot be cast to non-null type android.graphics.Typeface");
                    typeface = (Typeface) obj7;
                }
                spannable.setSpan(new w2.b(1, typeface), iIntValue2, iIntValue3, 33);
                break;
            case 2:
                j9.u uVar = j9.u.f10753a;
                hf.y yVar = (hf.y) obj5;
                ic.k kVar2 = (ic.k) obj4;
                x0.o oVar3 = (x0.o) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                jc.l.e((y.w) obj, "$this$ModalBottomSheetLayout");
                if (!oVar3.N(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    oVar3.Q();
                } else {
                    j1.q qVarK = androidx.compose.foundation.layout.a.k(androidx.compose.foundation.layout.c.c(nVar, 1.0f), 15, 10);
                    j1 j1VarA = y.i1.a(y.k.f25156a, j1.c.f9672k, oVar3, 54);
                    int iQ = x0.v.q(oVar3);
                    x0.j1 j1VarL = oVar3.l();
                    j1.q qVarC = j1.a.c(qVarK, oVar3);
                    i2.k.f8771g0.getClass();
                    i2.i iVar2 = i2.j.f8733b;
                    oVar3.a0();
                    if (oVar3.S) {
                        oVar3.k(iVar2);
                    } else {
                        oVar3.k0();
                    }
                    x0.v.A(i2.j.f8738g, j1VarA, oVar3);
                    x0.v.A(i2.j.f8737f, j1VarL, oVar3);
                    i2.h hVar = i2.j.f8741j;
                    if (oVar3.S || !jc.l.a(oVar3.K(), Integer.valueOf(iQ))) {
                        j2.h0.s(iQ, oVar3, iQ, hVar);
                    }
                    x0.v.A(i2.j.f8735d, qVarC, oVar3);
                    bg.z zVarB = h9.d.b();
                    String str2 = zVarB != null ? zVarB.f2996d : null;
                    if (str2 == null) {
                        str2 = "";
                    }
                    long jC = lc.b.C(20);
                    x2.k kVar3 = x2.k.f24565g;
                    j1.q qVarC2 = androidx.compose.foundation.layout.c.c(nVar, 1.0f);
                    if (1.0f <= 0.0d) {
                        z.a.a("invalid weight; must be greater than zero");
                    }
                    z8.b(str2, qVarC2.e(new LayoutWeightElement(1.0f, true)), 0L, jC, null, kVar3, 0L, null, null, 0L, 0, false, 0, 0, null, oVar3, 199680, 0, 131028);
                    boolean zH = oVar3.h(yVar) | oVar3.h(kVar2) | oVar3.h(uVar);
                    Object objK = oVar3.K();
                    if (zH || objK == r0Var) {
                        objK = new fa.l(yVar, kVar2, 0);
                        oVar3.h0(objK);
                    }
                    p3.a((ic.a) objK, null, false, fa.b.f6958a, oVar3, 24576, 14);
                    oVar3.p(true);
                    float f10 = 5;
                    y.e1 e1Var2 = new y.e1(f10, f10, f10, f10);
                    WeakHashMap weakHashMap = s1.f25236u;
                    y.e1 e1VarJ = na.c.j(e1Var2, y.d.g(y.o0.f(oVar3).f25241e, oVar3), oVar3);
                    y.g gVarG = y.k.g(f10);
                    boolean zH2 = oVar3.h(uVar) | oVar3.h(yVar);
                    Object objK2 = oVar3.K();
                    if (zH2 || objK2 == r0Var) {
                        objK2 = new aa.e(yVar);
                        oVar3.h0(objK2);
                    }
                    a.a.g(24576, 491, null, (ic.k) objK2, null, null, null, null, oVar3, gVarG, e1VarJ, false);
                }
                break;
            case 3:
                String str3 = (String) obj4;
                String str4 = (String) obj5;
                x0.o oVar4 = (x0.o) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                jc.l.e((k1) obj, "$this$DropdownMenuItem");
                if (!oVar4.N(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    oVar4.Q();
                } else {
                    i5.a(jc.l.a(str3, str4), androidx.compose.foundation.layout.a.n(j1.n.f9689a, 0.0f, 0.0f, 10, 0.0f, 11), false, null, oVar4, 432, 56);
                    z8.b(str3, null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, oVar4, 0, 0, 131070);
                }
                break;
            case 4:
                ic.k kVar4 = (ic.k) obj5;
                ic.k kVar5 = (ic.k) obj4;
                x0.o oVar5 = (x0.o) obj2;
                ((Integer) obj3).getClass();
                jc.l.e((j1.q) obj, "$this$composed");
                oVar5.W(-852002338);
                s.m0 m0Var = (s.m0) oVar5.j(androidx.compose.foundation.f.f507a);
                Object objK3 = oVar5.K();
                if (objK3 == r0Var) {
                    objK3 = q.t0.I(oVar5);
                }
                w.k kVar6 = (w.k) objK3;
                jc.l.e(kVar6, "interactionSource");
                j1.k kVar7 = new j1.k(new la.d(kVar5, kVar4, kVar6, m0Var, 0));
                oVar5.p(false);
                break;
            case 5:
                w1.f fVar = (w1.f) obj5;
                String str5 = (String) obj4;
                x0.o oVar6 = (x0.o) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                jc.l.e((k1) obj, "$this$DropdownMenuItem");
                if (!oVar6.N(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                    oVar6.Q();
                } else {
                    r3.b(fVar, fVar.f23185a, null, 0L, oVar6, 0, 12);
                    y.d.d(androidx.compose.foundation.layout.c.n(nVar, 10), oVar6);
                    z8.b(str5, null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, ((d9) oVar6.j(e9.f12960b)).f12887j, oVar6, 0, 0, 65534);
                }
                break;
            case 6:
                fg.f fVar2 = (fg.f) obj5;
                String str6 = (String) obj4;
                x0.o oVar7 = (x0.o) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                jc.l.e((k1) obj, "$this$DropdownMenuItem");
                if (!oVar7.N(iIntValue7 & 1, (iIntValue7 & 17) != 16)) {
                    oVar7.Q();
                } else {
                    i5.a(jc.l.a(fVar2.getValue(), str6), null, false, null, oVar7, 48, 60);
                    z8.b(str6, null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, oVar7, 0, 0, 131070);
                }
                break;
            case 7:
                c0.z zVar = (c0.z) obj5;
                String str7 = (String) obj4;
                y.d1 d1Var = (y.d1) obj;
                x0.o oVar8 = (x0.o) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                jc.l.e(d1Var, "it");
                if ((iIntValue8 & 6) == 0) {
                    iIntValue8 |= oVar8.f(d1Var) ? 4 : 2;
                }
                if (!oVar8.N(iIntValue8 & 1, (iIntValue8 & 19) != 18)) {
                    oVar8.Q();
                } else {
                    q9.a.a(d1Var, zVar, str7, oVar8, iIntValue8 & 14);
                }
                break;
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_DALVIK /* 8 */:
                List list = (List) obj5;
                fg.f fVar3 = (fg.f) obj4;
                y.d1 d1Var2 = (y.d1) obj;
                x0.o oVar9 = (x0.o) obj2;
                int iIntValue9 = ((Integer) obj3).intValue();
                jc.l.e(d1Var2, "pad");
                if ((iIntValue9 & 6) == 0) {
                    iIntValue9 |= oVar9.f(d1Var2) ? 4 : 2;
                }
                if (!oVar9.N(iIntValue9 & 1, (iIntValue9 & 19) != 18)) {
                    oVar9.Q();
                } else {
                    ((p9.f) list.get(((Number) fVar3.getValue()).intValue())).f16956d.g(d1Var2, oVar9, Integer.valueOf(iIntValue9 & 14));
                }
                break;
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_ART /* 9 */:
                k0 k0Var = (k0) obj5;
                p9.d dVar = (p9.d) obj4;
                y.d1 d1Var3 = (y.d1) obj;
                x0.o oVar10 = (x0.o) obj2;
                int iIntValue10 = ((Integer) obj3).intValue();
                jc.l.e(d1Var3, "it");
                if ((iIntValue10 & 6) == 0) {
                    iIntValue10 |= oVar10.f(d1Var3) ? 4 : 2;
                }
                if (!oVar10.N(iIntValue10 & 1, (iIntValue10 & 19) != 18)) {
                    oVar10.Q();
                } else {
                    j0.a(d1Var3, k0Var, androidx.compose.ui.input.nestedscroll.a.a(nVar, dVar, null), null, oVar10, iIntValue10 & 14);
                }
                break;
            case TinkerReport.KEY_APPLY_WITH_RETRY /* 10 */:
                final z9.r rVar = (z9.r) obj5;
                final c9.f fVar4 = (c9.f) obj4;
                x0.o oVar11 = (x0.o) obj2;
                int iIntValue11 = ((Integer) obj3).intValue();
                jc.l.e((y.w) obj, "$this$DropdownMenu");
                if (!oVar11.N(iIntValue11 & 1, (iIntValue11 & 17) != 16)) {
                    oVar11.Q();
                } else {
                    boolean zH3 = oVar11.h(rVar);
                    Object objK4 = oVar11.K();
                    if (zH3 || objK4 == r0Var) {
                        objK4 = new z9.b(rVar, 1);
                        oVar11.h0(objK4);
                    }
                    m0.b0.b((ic.a) objK4, null, false, null, z9.a.f26600f, oVar11, 196608, 30);
                    boolean zH4 = oVar11.h(rVar) | oVar11.h(fVar4);
                    Object objK5 = oVar11.K();
                    if (zH4 || objK5 == r0Var) {
                        final int i14 = z ? 1 : 0;
                        objK5 = new ic.a() { // from class: z9.e
                            @Override // ic.a
                            public final Object b() {
                                switch (i14) {
                                    case 0:
                                        c9.f fVar5 = fVar4;
                                        byte[] bArr = fVar5.f3806d;
                                        jc.l.e(bArr, "<set-?>");
                                        r rVar2 = rVar;
                                        rVar2.f26661i.setValue(bArr);
                                        rVar2.f26660h.setValue(fVar5.f3807e);
                                        rVar2.f26662j = true;
                                        rVar2.G(true);
                                        rVar2.H(false);
                                        break;
                                    default:
                                        c9.f fVar6 = fVar4;
                                        byte[] bArr2 = fVar6.f3808f;
                                        jc.l.e(bArr2, "<this>");
                                        byte[] bArrJ0 = vb.l.J0(bArr2, new oc.d(0, Math.min(bArr2.length - 1, 50), 1));
                                        r rVar3 = rVar;
                                        rVar3.f26661i.setValue(bArrJ0);
                                        rVar3.f26660h.setValue(fVar6.f3809g);
                                        rVar3.f26662j = false;
                                        rVar3.G(true);
                                        rVar3.H(false);
                                        break;
                                }
                                return a0.f21526a;
                            }
                        };
                        oVar11.h0(objK5);
                    }
                    m0.b0.b((ic.a) objK5, null, false, null, z9.a.f26601g, oVar11, 196608, 30);
                    boolean zH5 = oVar11.h(rVar) | oVar11.h(fVar4);
                    Object objK6 = oVar11.K();
                    if (zH5 || objK6 == r0Var) {
                        objK6 = new ic.a() { // from class: z9.e
                            @Override // ic.a
                            public final Object b() {
                                switch (i11) {
                                    case 0:
                                        c9.f fVar5 = fVar4;
                                        byte[] bArr = fVar5.f3806d;
                                        jc.l.e(bArr, "<set-?>");
                                        r rVar2 = rVar;
                                        rVar2.f26661i.setValue(bArr);
                                        rVar2.f26660h.setValue(fVar5.f3807e);
                                        rVar2.f26662j = true;
                                        rVar2.G(true);
                                        rVar2.H(false);
                                        break;
                                    default:
                                        c9.f fVar6 = fVar4;
                                        byte[] bArr2 = fVar6.f3808f;
                                        jc.l.e(bArr2, "<this>");
                                        byte[] bArrJ0 = vb.l.J0(bArr2, new oc.d(0, Math.min(bArr2.length - 1, 50), 1));
                                        r rVar3 = rVar;
                                        rVar3.f26661i.setValue(bArrJ0);
                                        rVar3.f26660h.setValue(fVar6.f3809g);
                                        rVar3.f26662j = false;
                                        rVar3.G(true);
                                        rVar3.H(false);
                                        break;
                                }
                                return a0.f21526a;
                            }
                        };
                        oVar11.h0(objK6);
                    }
                    m0.b0.b((ic.a) objK6, null, false, null, z9.a.f26602h, oVar11, 196608, 30);
                }
                break;
            default:
                e7.a0 a0Var2 = (e7.a0) obj5;
                z9.r rVar2 = (z9.r) obj4;
                x0.o oVar12 = (x0.o) obj2;
                ((Integer) obj3).getClass();
                jc.l.e((q.u) obj, "$this$AnimatedVisibility");
                boolean zH6 = oVar12.h(a0Var2) | oVar12.h(rVar2);
                Object objK7 = oVar12.K();
                if (zH6 || objK7 == r0Var) {
                    objK7 = new z8.f(i11, a0Var2, rVar2);
                    oVar12.h0(objK7);
                }
                n3.a((ic.a) objK7, null, null, 0L, ((m0.b1) oVar12.j(m0.c1.f12773a)).a(), null, z9.a.f26595a, oVar12, 12582912, 94);
                break;
        }
        return a0Var;
    }

    public /* synthetic */ k(hf.y yVar, ic.k kVar) {
        this.f2396a = 2;
        j9.u uVar = j9.u.f10753a;
        this.f2397b = yVar;
        this.f2398c = kVar;
    }

    public /* synthetic */ k(String str, String str2) {
        this.f2396a = 3;
        this.f2398c = str;
        this.f2397b = str2;
    }
}
