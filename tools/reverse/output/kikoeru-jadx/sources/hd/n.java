package hd;

import i7.j1;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ pc.u[] f8423a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c7.e1 f8424b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final androidx.media3.exoplayer.offline.u f8425c;

    static {
        jc.o oVar = new jc.o(n.class, "hasAnnotations", "getHasAnnotations(Lkotlin/metadata/KmClass;)Z", 1);
        jc.a0 a0Var = jc.z.f10839a;
        f8423a = new pc.u[]{a0Var.e(oVar), q.t0.G(n.class, "hasAnnotations", "getHasAnnotations(Lkotlin/metadata/KmConstructor;)Z", 1, a0Var), q.t0.G(n.class, "hasAnnotations", "getHasAnnotations(Lkotlin/metadata/KmFunction;)Z", 1, a0Var), q.t0.G(n.class, "hasAnnotations", "getHasAnnotations(Lkotlin/metadata/KmProperty;)Z", 1, a0Var), q.t0.G(n.class, "hasAnnotations", "getHasAnnotations(Lkotlin/metadata/KmPropertyAccessorAttributes;)Z", 1, a0Var), q.t0.G(n.class, "hasAnnotations", "getHasAnnotations(Lkotlin/metadata/KmValueParameter;)Z", 1, a0Var), q.t0.G(n.class, "hasAnnotations", "getHasAnnotations(Lkotlin/metadata/KmTypeAlias;)Z", 1, a0Var), q.t0.G(n.class, "modality", "getModality(Lkotlin/metadata/KmClass;)Lkotlin/metadata/Modality;", 1, a0Var), q.t0.G(n.class, "visibility", "getVisibility(Lkotlin/metadata/KmClass;)Lkotlin/metadata/Visibility;", 1, a0Var), q.t0.G(n.class, "kind", "getKind(Lkotlin/metadata/KmClass;)Lkotlin/metadata/ClassKind;", 1, a0Var), q.t0.G(n.class, "isInner", "isInner(Lkotlin/metadata/KmClass;)Z", 1, a0Var), q.t0.G(n.class, "isData", "isData(Lkotlin/metadata/KmClass;)Z", 1, a0Var), q.t0.G(n.class, "isExternal", "isExternal(Lkotlin/metadata/KmClass;)Z", 1, a0Var), q.t0.G(n.class, "isExpect", "isExpect(Lkotlin/metadata/KmClass;)Z", 1, a0Var), q.t0.G(n.class, "isValue", "isValue(Lkotlin/metadata/KmClass;)Z", 1, a0Var), q.t0.G(n.class, "isFunInterface", "isFunInterface(Lkotlin/metadata/KmClass;)Z", 1, a0Var), q.t0.G(n.class, "hasEnumEntries", "getHasEnumEntries(Lkotlin/metadata/KmClass;)Z", 1, a0Var), q.t0.G(n.class, "visibility", "getVisibility(Lkotlin/metadata/KmConstructor;)Lkotlin/metadata/Visibility;", 1, a0Var), q.t0.G(n.class, "isSecondary", "isSecondary(Lkotlin/metadata/KmConstructor;)Z", 1, a0Var), q.t0.G(n.class, "hasNonStableParameterNames", "getHasNonStableParameterNames(Lkotlin/metadata/KmConstructor;)Z", 1, a0Var), q.t0.G(n.class, "kind", "getKind(Lkotlin/metadata/KmFunction;)Lkotlin/metadata/MemberKind;", 1, a0Var), q.t0.G(n.class, "visibility", "getVisibility(Lkotlin/metadata/KmFunction;)Lkotlin/metadata/Visibility;", 1, a0Var), q.t0.G(n.class, "modality", "getModality(Lkotlin/metadata/KmFunction;)Lkotlin/metadata/Modality;", 1, a0Var), q.t0.G(n.class, "isOperator", "isOperator(Lkotlin/metadata/KmFunction;)Z", 1, a0Var), q.t0.G(n.class, "isInfix", "isInfix(Lkotlin/metadata/KmFunction;)Z", 1, a0Var), q.t0.G(n.class, "isInline", "isInline(Lkotlin/metadata/KmFunction;)Z", 1, a0Var), q.t0.G(n.class, "isTailrec", "isTailrec(Lkotlin/metadata/KmFunction;)Z", 1, a0Var), q.t0.G(n.class, "isExternal", "isExternal(Lkotlin/metadata/KmFunction;)Z", 1, a0Var), q.t0.G(n.class, "isSuspend", "isSuspend(Lkotlin/metadata/KmFunction;)Z", 1, a0Var), q.t0.G(n.class, "isExpect", "isExpect(Lkotlin/metadata/KmFunction;)Z", 1, a0Var), q.t0.G(n.class, "hasNonStableParameterNames", "getHasNonStableParameterNames(Lkotlin/metadata/KmFunction;)Z", 1, a0Var), q.t0.G(n.class, "visibility", "getVisibility(Lkotlin/metadata/KmProperty;)Lkotlin/metadata/Visibility;", 1, a0Var), q.t0.G(n.class, "modality", "getModality(Lkotlin/metadata/KmProperty;)Lkotlin/metadata/Modality;", 1, a0Var), q.t0.G(n.class, "kind", "getKind(Lkotlin/metadata/KmProperty;)Lkotlin/metadata/MemberKind;", 1, a0Var), q.t0.G(n.class, "isVar", "isVar(Lkotlin/metadata/KmProperty;)Z", 1, a0Var), q.t0.G(n.class, "isConst", "isConst(Lkotlin/metadata/KmProperty;)Z", 1, a0Var), q.t0.G(n.class, "isLateinit", "isLateinit(Lkotlin/metadata/KmProperty;)Z", 1, a0Var), q.t0.G(n.class, "hasConstant", "getHasConstant(Lkotlin/metadata/KmProperty;)Z", 1, a0Var), q.t0.G(n.class, "isExternal", "isExternal(Lkotlin/metadata/KmProperty;)Z", 1, a0Var), q.t0.G(n.class, "isDelegated", "isDelegated(Lkotlin/metadata/KmProperty;)Z", 1, a0Var), q.t0.G(n.class, "isExpect", "isExpect(Lkotlin/metadata/KmProperty;)Z", 1, a0Var), q.t0.G(n.class, "visibility", "getVisibility(Lkotlin/metadata/KmPropertyAccessorAttributes;)Lkotlin/metadata/Visibility;", 1, a0Var), q.t0.G(n.class, "modality", "getModality(Lkotlin/metadata/KmPropertyAccessorAttributes;)Lkotlin/metadata/Modality;", 1, a0Var), q.t0.G(n.class, "isNotDefault", "isNotDefault(Lkotlin/metadata/KmPropertyAccessorAttributes;)Z", 1, a0Var), q.t0.G(n.class, "isExternal", "isExternal(Lkotlin/metadata/KmPropertyAccessorAttributes;)Z", 1, a0Var), q.t0.G(n.class, "isInline", "isInline(Lkotlin/metadata/KmPropertyAccessorAttributes;)Z", 1, a0Var), q.t0.G(n.class, "isNullable", "isNullable(Lkotlin/metadata/KmType;)Z", 1, a0Var), q.t0.G(n.class, "isSuspend", "isSuspend(Lkotlin/metadata/KmType;)Z", 1, a0Var), q.t0.G(n.class, "isDefinitelyNonNull", "isDefinitelyNonNull(Lkotlin/metadata/KmType;)Z", 1, a0Var), q.t0.G(n.class, "isReified", "isReified(Lkotlin/metadata/KmTypeParameter;)Z", 1, a0Var), q.t0.G(n.class, "visibility", "getVisibility(Lkotlin/metadata/KmTypeAlias;)Lkotlin/metadata/Visibility;", 1, a0Var), q.t0.G(n.class, "declaresDefaultValue", "getDeclaresDefaultValue(Lkotlin/metadata/KmValueParameter;)Z", 1, a0Var), q.t0.G(n.class, "isCrossinline", "isCrossinline(Lkotlin/metadata/KmValueParameter;)Z", 1, a0Var), q.t0.G(n.class, "isNoinline", "isNoinline(Lkotlin/metadata/KmValueParameter;)Z", 1, a0Var), q.t0.G(n.class, "isNegated", "isNegated(Lkotlin/metadata/KmEffectExpression;)Z", 1, a0Var), q.t0.G(n.class, "isNullCheckPredicate", "isNullCheckPredicate(Lkotlin/metadata/KmEffectExpression;)Z", 1, a0Var)};
        yd.b bVar = yd.d.f26173c;
        jc.l.d(bVar, "HAS_ANNOTATIONS");
        j1 j1Var = new j1(bVar);
        id.a aVar = id.a.f9497h;
        if (j1Var.f9177b != 1 || j1Var.f9178c != 1) {
            throw new IllegalArgumentException(a0.c.J("BooleanFlagDelegate can work only with boolean flags (bitWidth = 1 and value = 1), but ", j1Var, " was passed").toString());
        }
        j1 j1Var2 = new j1(bVar);
        int i10 = id.b.f9498h;
        if (j1Var2.f9177b != 1) {
            throw new IllegalArgumentException(a0.c.J("BooleanFlagDelegate can work only with boolean flags (bitWidth = 1 and value = 1), but ", j1Var2, " was passed").toString());
        }
        a2.c.H(new j1(bVar));
        j1 j1Var3 = new j1(bVar);
        id.e eVar = id.e.f9501h;
        if (j1Var3.f9177b != 1 || j1Var3.f9178c != 1) {
            throw new IllegalArgumentException(a0.c.J("BooleanFlagDelegate can work only with boolean flags (bitWidth = 1 and value = 1), but ", j1Var3, " was passed").toString());
        }
        a2.c.W(new j1(bVar));
        a2.c.f0(new j1(bVar));
        j1 j1Var4 = new j1(bVar);
        if (j1Var4.f9177b != 1) {
            throw new IllegalArgumentException(a0.c.J("BooleanFlagDelegate can work only with boolean flags (bitWidth = 1 and value = 1), but ", j1Var4, " was passed").toString());
        }
        a2.c.T(f.f8383h);
        a2.c.g0(l.f8403h);
        b bVar2 = b.f8360h;
        yd.c cVar = yd.d.f26176f;
        jc.l.d(cVar, "CLASS_KIND");
        bc.b bVar3 = o.f8435j;
        ArrayList arrayList = new ArrayList(vb.n.K(bVar3, 10));
        jc.b bVar4 = new jc.b(7, bVar3);
        while (bVar4.hasNext()) {
            arrayList.add(((o) bVar4.next()).f8436a);
        }
        f8424b = new c7.e1(bVar2, cVar, bVar3, arrayList);
        yd.b bVar5 = yd.d.f26177g;
        jc.l.d(bVar5, "IS_INNER");
        j1 j1Var5 = new j1(bVar5);
        id.a aVar2 = id.a.f9497h;
        if (j1Var5.f9177b != 1 || j1Var5.f9178c != 1) {
            throw new IllegalArgumentException(a0.c.J("BooleanFlagDelegate can work only with boolean flags (bitWidth = 1 and value = 1), but ", j1Var5, " was passed").toString());
        }
        yd.b bVar6 = yd.d.f26178h;
        jc.l.d(bVar6, "IS_DATA");
        j1 j1Var6 = new j1(bVar6);
        if (j1Var6.f9177b != 1 || j1Var6.f9178c != 1) {
            throw new IllegalArgumentException(a0.c.J("BooleanFlagDelegate can work only with boolean flags (bitWidth = 1 and value = 1), but ", j1Var6, " was passed").toString());
        }
        yd.b bVar7 = yd.d.f26179i;
        jc.l.d(bVar7, "IS_EXTERNAL_CLASS");
        j1 j1Var7 = new j1(bVar7);
        if (j1Var7.f9177b != 1 || j1Var7.f9178c != 1) {
            throw new IllegalArgumentException(a0.c.J("BooleanFlagDelegate can work only with boolean flags (bitWidth = 1 and value = 1), but ", j1Var7, " was passed").toString());
        }
        yd.b bVar8 = yd.d.f26180j;
        jc.l.d(bVar8, "IS_EXPECT_CLASS");
        j1 j1Var8 = new j1(bVar8);
        if (j1Var8.f9177b != 1 || j1Var8.f9178c != 1) {
            throw new IllegalArgumentException(a0.c.J("BooleanFlagDelegate can work only with boolean flags (bitWidth = 1 and value = 1), but ", j1Var8, " was passed").toString());
        }
        yd.b bVar9 = yd.d.f26181k;
        jc.l.d(bVar9, "IS_VALUE_CLASS");
        f8425c = new androidx.media3.exoplayer.offline.u(aVar2, new j1(bVar9));
        yd.b bVar10 = yd.d.f26182l;
        jc.l.d(bVar10, "IS_FUN_INTERFACE");
        j1 j1Var9 = new j1(bVar10);
        if (j1Var9.f9177b != 1 || j1Var9.f9178c != 1) {
            throw new IllegalArgumentException(a0.c.J("BooleanFlagDelegate can work only with boolean flags (bitWidth = 1 and value = 1), but ", j1Var9, " was passed").toString());
        }
        yd.b bVar11 = yd.d.f26183m;
        jc.l.d(bVar11, "HAS_ENUM_ENTRIES");
        j1 j1Var10 = new j1(bVar11);
        if (j1Var10.f9177b != 1 || j1Var10.f9178c != 1) {
            throw new IllegalArgumentException(a0.c.J("BooleanFlagDelegate can work only with boolean flags (bitWidth = 1 and value = 1), but ", j1Var10, " was passed").toString());
        }
        a2.c.g0(m.f8421h);
        yd.b bVar12 = yd.d.f26184n;
        jc.l.d(bVar12, "IS_SECONDARY");
        j1 j1Var11 = new j1(bVar12);
        int i11 = id.b.f9498h;
        if (j1Var11.f9177b != 1) {
            throw new IllegalArgumentException(a0.c.J("BooleanFlagDelegate can work only with boolean flags (bitWidth = 1 and value = 1), but ", j1Var11, " was passed").toString());
        }
        yd.b bVar13 = yd.d.f26185o;
        jc.l.d(bVar13, "IS_CONSTRUCTOR_WITH_NON_STABLE_PARAMETER_NAMES");
        j1 j1Var12 = new j1(bVar13);
        if (j1Var12.f9177b != 1) {
            throw new IllegalArgumentException(a0.c.J("BooleanFlagDelegate can work only with boolean flags (bitWidth = 1 and value = 1), but ", j1Var12, " was passed").toString());
        }
        a2.c.S(c.f8366h);
        a2.c.g0(h.f8393h);
        a2.c.T(g.f8388h);
        yd.b bVar14 = yd.d.f26187q;
        jc.l.d(bVar14, "IS_OPERATOR");
        a2.c.H(new j1(bVar14));
        yd.b bVar15 = yd.d.f26188r;
        jc.l.d(bVar15, "IS_INFIX");
        a2.c.H(new j1(bVar15));
        yd.b bVar16 = yd.d.f26189s;
        jc.l.d(bVar16, "IS_INLINE");
        a2.c.H(new j1(bVar16));
        yd.b bVar17 = yd.d.f26190t;
        jc.l.d(bVar17, "IS_TAILREC");
        a2.c.H(new j1(bVar17));
        yd.b bVar18 = yd.d.f26191u;
        jc.l.d(bVar18, "IS_EXTERNAL_FUNCTION");
        a2.c.H(new j1(bVar18));
        yd.b bVar19 = yd.d.f26192v;
        jc.l.d(bVar19, "IS_SUSPEND");
        a2.c.H(new j1(bVar19));
        yd.b bVar20 = yd.d.f26193w;
        jc.l.d(bVar20, "IS_EXPECT_FUNCTION");
        a2.c.H(new j1(bVar20));
        yd.b bVar21 = yd.d.f26194x;
        jc.l.d(bVar21, "IS_FUNCTION_WITH_NON_STABLE_PARAMETER_NAMES");
        a2.c.H(new j1(bVar21));
        a2.c.g0(i.f8398h);
        a2.c.T(d.f8370h);
        a2.c.S(a.f8356h);
        yd.b bVar22 = yd.d.f26195y;
        jc.l.d(bVar22, "IS_VAR");
        j1 j1Var13 = new j1(bVar22);
        id.e eVar2 = id.e.f9501h;
        if (j1Var13.f9177b != 1 || j1Var13.f9178c != 1) {
            throw new IllegalArgumentException(a0.c.J("BooleanFlagDelegate can work only with boolean flags (bitWidth = 1 and value = 1), but ", j1Var13, " was passed").toString());
        }
        yd.b bVar23 = yd.d.B;
        jc.l.d(bVar23, "IS_CONST");
        j1 j1Var14 = new j1(bVar23);
        if (j1Var14.f9177b != 1 || j1Var14.f9178c != 1) {
            throw new IllegalArgumentException(a0.c.J("BooleanFlagDelegate can work only with boolean flags (bitWidth = 1 and value = 1), but ", j1Var14, " was passed").toString());
        }
        yd.b bVar24 = yd.d.C;
        jc.l.d(bVar24, "IS_LATEINIT");
        j1 j1Var15 = new j1(bVar24);
        if (j1Var15.f9177b != 1 || j1Var15.f9178c != 1) {
            throw new IllegalArgumentException(a0.c.J("BooleanFlagDelegate can work only with boolean flags (bitWidth = 1 and value = 1), but ", j1Var15, " was passed").toString());
        }
        yd.b bVar25 = yd.d.D;
        jc.l.d(bVar25, "HAS_CONSTANT");
        j1 j1Var16 = new j1(bVar25);
        if (j1Var16.f9177b != 1 || j1Var16.f9178c != 1) {
            throw new IllegalArgumentException(a0.c.J("BooleanFlagDelegate can work only with boolean flags (bitWidth = 1 and value = 1), but ", j1Var16, " was passed").toString());
        }
        yd.b bVar26 = yd.d.E;
        jc.l.d(bVar26, "IS_EXTERNAL_PROPERTY");
        j1 j1Var17 = new j1(bVar26);
        if (j1Var17.f9177b != 1 || j1Var17.f9178c != 1) {
            throw new IllegalArgumentException(a0.c.J("BooleanFlagDelegate can work only with boolean flags (bitWidth = 1 and value = 1), but ", j1Var17, " was passed").toString());
        }
        yd.b bVar27 = yd.d.F;
        jc.l.d(bVar27, "IS_DELEGATED");
        j1 j1Var18 = new j1(bVar27);
        if (j1Var18.f9177b != 1 || j1Var18.f9178c != 1) {
            throw new IllegalArgumentException(a0.c.J("BooleanFlagDelegate can work only with boolean flags (bitWidth = 1 and value = 1), but ", j1Var18, " was passed").toString());
        }
        yd.b bVar28 = yd.d.G;
        jc.l.d(bVar28, "IS_EXPECT_PROPERTY");
        j1 j1Var19 = new j1(bVar28);
        if (j1Var19.f9177b != 1 || j1Var19.f9178c != 1) {
            throw new IllegalArgumentException(a0.c.J("BooleanFlagDelegate can work only with boolean flags (bitWidth = 1 and value = 1), but ", j1Var19, " was passed").toString());
        }
        a2.c.g0(j.f8400h);
        a2.c.T(e.f8376h);
        yd.b bVar29 = yd.d.K;
        jc.l.d(bVar29, "IS_NOT_DEFAULT");
        a2.c.W(new j1(bVar29));
        yd.b bVar30 = yd.d.L;
        jc.l.d(bVar30, "IS_EXTERNAL_ACCESSOR");
        a2.c.W(new j1(bVar30));
        yd.b bVar31 = yd.d.M;
        jc.l.d(bVar31, "IS_INLINE_ACCESSOR");
        a2.c.W(new j1(bVar31));
        int i12 = id.f.f9502h;
        yd.b bVar32 = yd.d.f26171a;
        int i13 = bVar32.f25324b + 1;
        int i14 = bVar32.f25325c;
        j1 j1Var20 = new j1(i13, i14, 1);
        if (i14 != 1) {
            throw new IllegalArgumentException(a0.c.J("BooleanFlagDelegate can work only with boolean flags (bitWidth = 1 and value = 1), but ", j1Var20, " was passed").toString());
        }
        yd.b bVar33 = yd.d.f26172b;
        int i15 = bVar33.f25324b + 1;
        int i16 = bVar33.f25325c;
        j1 j1Var21 = new j1(i15, i16, 1);
        if (i16 != 1) {
            throw new IllegalArgumentException(a0.c.J("BooleanFlagDelegate can work only with boolean flags (bitWidth = 1 and value = 1), but ", j1Var21, " was passed").toString());
        }
        a2.c.g0(k.f8402h);
        yd.b bVar34 = yd.d.H;
        jc.l.d(bVar34, "DECLARES_DEFAULT_VALUE");
        a2.c.f0(new j1(bVar34));
        yd.b bVar35 = yd.d.I;
        jc.l.d(bVar35, "IS_CROSSINLINE");
        a2.c.f0(new j1(bVar35));
        yd.b bVar36 = yd.d.J;
        jc.l.d(bVar36, "IS_NOINLINE");
        a2.c.f0(new j1(bVar36));
        yd.b bVar37 = yd.d.N;
        jc.l.d(bVar37, "IS_NEGATED");
        j1 j1Var22 = new j1(bVar37);
        if (j1Var22.f9177b != 1) {
            throw new IllegalArgumentException(a0.c.J("BooleanFlagDelegate can work only with boolean flags (bitWidth = 1 and value = 1), but ", j1Var22, " was passed").toString());
        }
        yd.b bVar38 = yd.d.O;
        jc.l.d(bVar38, "IS_NULL_CHECK_PREDICATE");
        j1 j1Var23 = new j1(bVar38);
        if (j1Var23.f9177b != 1) {
            throw new IllegalArgumentException(a0.c.J("BooleanFlagDelegate can work only with boolean flags (bitWidth = 1 and value = 1), but ", j1Var23, " was passed").toString());
        }
    }

    public static final o a(l0 l0Var) {
        pc.u uVar = f8423a[9];
        c7.e1 e1Var = f8424b;
        e1Var.getClass();
        jc.l.e(uVar, "property");
        return (o) ((Enum) ((bc.a) e1Var.f3620d).get(((ce.q) ((y0.i0) e1Var.f3619c).d(((Number) ((jc.o) e1Var.f3618b).get(l0Var)).intValue())).a()));
    }
}
