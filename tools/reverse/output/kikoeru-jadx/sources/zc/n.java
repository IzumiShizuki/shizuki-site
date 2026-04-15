package zc;

import java.util.ArrayList;
import java.util.HashMap;
import vb.w;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final HashMap f26710b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final n f26711c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final n f26712d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final n f26713e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final n f26714f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final n f26715g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final n f26716h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final n f26717i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final n f26718j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final n f26719k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final n f26720l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final n f26721m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final n f26722n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final n f26723o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final n f26724p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final n f26725q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final n f26726r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final n f26727s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final n f26728t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final n f26729u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final n f26730v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final n f26731w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ n[] f26732x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ bc.b f26733y;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f26734a;

    static {
        n nVar = new n("CLASS", true, 0);
        f26711c = nVar;
        n nVar2 = new n("ANNOTATION_CLASS", true, 1);
        f26712d = nVar2;
        n nVar3 = new n("TYPE_PARAMETER", false, 2);
        f26713e = nVar3;
        n nVar4 = new n("PROPERTY", true, 3);
        f26714f = nVar4;
        n nVar5 = new n("FIELD", true, 4);
        f26715g = nVar5;
        n nVar6 = new n("LOCAL_VARIABLE", true, 5);
        f26716h = nVar6;
        n nVar7 = new n("VALUE_PARAMETER", true, 6);
        f26717i = nVar7;
        n nVar8 = new n("CONSTRUCTOR", true, 7);
        f26718j = nVar8;
        n nVar9 = new n("FUNCTION", true, 8);
        f26719k = nVar9;
        n nVar10 = new n("PROPERTY_GETTER", true, 9);
        f26720l = nVar10;
        n nVar11 = new n("PROPERTY_SETTER", true, 10);
        f26721m = nVar11;
        n nVar12 = new n("TYPE", false, 11);
        f26722n = nVar12;
        n nVar13 = new n("EXPRESSION", false, 12);
        n nVar14 = new n("FILE", false, 13);
        f26723o = nVar14;
        n nVar15 = new n("TYPEALIAS", false, 14);
        n nVar16 = new n("TYPE_PROJECTION", false, 15);
        n nVar17 = new n("STAR_PROJECTION", false, 16);
        n nVar18 = new n("PROPERTY_PARAMETER", false, 17);
        n nVar19 = new n("CLASS_ONLY", false, 18);
        f26724p = nVar19;
        n nVar20 = new n("OBJECT", false, 19);
        f26725q = nVar20;
        n nVar21 = new n("STANDALONE_OBJECT", false, 20);
        f26726r = nVar21;
        n nVar22 = new n("COMPANION_OBJECT", false, 21);
        f26727s = nVar22;
        n nVar23 = new n("INTERFACE", false, 22);
        f26728t = nVar23;
        n nVar24 = new n("ENUM_CLASS", false, 23);
        f26729u = nVar24;
        n nVar25 = new n("ENUM_ENTRY", false, 24);
        f26730v = nVar25;
        n nVar26 = new n("LOCAL_CLASS", false, 25);
        f26731w = nVar26;
        n[] nVarArr = {nVar, nVar2, nVar3, nVar4, nVar5, nVar6, nVar7, nVar8, nVar9, nVar10, nVar11, nVar12, nVar13, nVar14, nVar15, nVar16, nVar17, nVar18, nVar19, nVar20, nVar21, nVar22, nVar23, nVar24, nVar25, nVar26, new n("LOCAL_FUNCTION", false, 26), new n("MEMBER_FUNCTION", false, 27), new n("TOP_LEVEL_FUNCTION", false, 28), new n("MEMBER_PROPERTY", false, 29), new n("MEMBER_PROPERTY_WITH_BACKING_FIELD", false, 30), new n("MEMBER_PROPERTY_WITH_DELEGATE", false, 31), new n("MEMBER_PROPERTY_WITHOUT_FIELD_OR_DELEGATE", false, 32), new n("TOP_LEVEL_PROPERTY", false, 33), new n("TOP_LEVEL_PROPERTY_WITH_BACKING_FIELD", false, 34), new n("TOP_LEVEL_PROPERTY_WITH_DELEGATE", false, 35), new n("TOP_LEVEL_PROPERTY_WITHOUT_FIELD_OR_DELEGATE", false, 36), new n("BACKING_FIELD", true, 37), new n("INITIALIZER", false, 38), new n("DESTRUCTURING_DECLARATION", false, 39), new n("LAMBDA_EXPRESSION", false, 40), new n("ANONYMOUS_FUNCTION", false, 41), new n("OBJECT_LITERAL", false, 42)};
        f26732x = nVarArr;
        bc.b bVar = new bc.b(nVarArr);
        f26733y = bVar;
        f26710b = new HashMap();
        jc.b bVar2 = new jc.b(7, bVar);
        while (bVar2.hasNext()) {
            n nVar27 = (n) bVar2.next();
            f26710b.put(nVar27.name(), nVar27);
        }
        bc.b bVar3 = f26733y;
        ArrayList arrayList = new ArrayList();
        bVar3.getClass();
        jc.b bVar4 = new jc.b(7, bVar3);
        while (bVar4.hasNext()) {
            Object next = bVar4.next();
            if (((n) next).f26734a) {
                arrayList.add(next);
            }
        }
        vb.m.K0(arrayList);
        vb.m.K0(f26733y);
        n nVar28 = f26711c;
        ud.b.x(f26712d, nVar28);
        ud.b.x(f26731w, nVar28);
        ud.b.x(f26724p, nVar28);
        n nVar29 = f26725q;
        ud.b.x(f26727s, nVar29, nVar28);
        ud.b.x(f26726r, nVar29, nVar28);
        ud.b.x(f26728t, nVar28);
        ud.b.x(f26729u, nVar28);
        n nVar30 = f26714f;
        n nVar31 = f26715g;
        ud.b.x(f26730v, nVar30, nVar31);
        n nVar32 = f26721m;
        ud.b.w(nVar32);
        n nVar33 = f26720l;
        ud.b.w(nVar33);
        ud.b.w(f26719k);
        n nVar34 = f26723o;
        ud.b.w(nVar34);
        d dVar = d.f26686h;
        n nVar35 = f26717i;
        w.v(new ub.k(dVar, nVar35), new ub.k(d.f26680b, nVar31), new ub.k(d.f26682d, nVar30), new ub.k(d.f26681c, nVar34), new ub.k(d.f26683e, nVar33), new ub.k(d.f26684f, nVar32), new ub.k(d.f26685g, nVar35), new ub.k(d.f26687i, nVar35), new ub.k(d.f26688j, nVar31));
    }

    public n(String str, boolean z10, int i10) {
        this.f26734a = z10;
    }

    public static n valueOf(String str) {
        return (n) Enum.valueOf(n.class, str);
    }

    public static n[] values() {
        return (n[]) f26732x.clone();
    }
}
