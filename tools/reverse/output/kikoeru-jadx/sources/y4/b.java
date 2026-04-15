package y4;

import android.util.Pair;
import android.util.SparseArray;
import b0.w1;
import b5.q;
import b5.t;
import g5.w;
import j2.h0;
import j5.a0;
import j5.b0;
import j5.b1;
import j5.c1;
import j5.d1;
import j5.e1;
import j5.o1;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import m4.j1;
import m4.o0;
import m5.r;
import n5.p;
import p4.c0;
import q.t0;
import s4.f0;
import ya.a1;
import ya.g0;
import ya.i0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class b implements b0, d1, k5.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f25448a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ah.j f25449b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f0 f25450c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t f25451d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final m3.l f25452e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final w1 f25453f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f25454g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final p f25455h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final n5.f f25456i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final o1 f25457j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final a[] f25458k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final w f25459l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final o f25460m;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final ah.j f25462o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final q f25463p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public a0 f25464q;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public j5.m f25467t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public z4.c f25468u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f25469v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public List f25470w;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public long f25472y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final Pattern f25447z = Pattern.compile("CC([1-4])=(.+)");
    public static final Pattern A = Pattern.compile("([1-4])=lang:(\\w+)(,.+)?");

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f25471x = true;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public k5.i[] f25465r = new k5.i[0];

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public l[] f25466s = new l[0];

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final IdentityHashMap f25461n = new IdentityHashMap();

    public b(int i10, z4.c cVar, w1 w1Var, int i11, ah.j jVar, f0 f0Var, t tVar, q qVar, m3.l lVar, ah.j jVar2, long j10, p pVar, n5.f fVar, w wVar, d dVar, w4.k kVar) {
        int i12;
        int i13;
        int[][] iArr;
        boolean[] zArr;
        m4.q[] qVarArrN;
        z4.f fVarB;
        Integer num;
        t tVar2 = tVar;
        this.f25448a = i10;
        this.f25468u = cVar;
        this.f25453f = w1Var;
        this.f25469v = i11;
        this.f25449b = jVar;
        this.f25450c = f0Var;
        this.f25451d = tVar2;
        this.f25463p = qVar;
        this.f25452e = lVar;
        this.f25462o = jVar2;
        this.f25454g = j10;
        this.f25455h = pVar;
        this.f25456i = fVar;
        this.f25459l = wVar;
        this.f25460m = new o(cVar, dVar, fVar);
        int i14 = 0;
        wVar.getClass();
        g0 g0Var = i0.f25998b;
        a1 a1Var = a1.f25946e;
        this.f25467t = new j5.m(a1Var, a1Var);
        z4.h hVarB = cVar.b(i11);
        List list = hVarB.f26424d;
        this.f25470w = list;
        List list2 = hVarB.f26423c;
        int size = list2.size();
        HashMap map = new HashMap(ya.q.b(size));
        ArrayList arrayList = new ArrayList(size);
        SparseArray sparseArray = new SparseArray(size);
        for (int i15 = 0; i15 < size; i15++) {
            map.put(Long.valueOf(((z4.a) list2.get(i15)).f26379a), Integer.valueOf(i15));
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(Integer.valueOf(i15));
            arrayList.add(arrayList2);
            sparseArray.put(i15, arrayList2);
        }
        for (int i16 = 0; i16 < size; i16++) {
            z4.a aVar = (z4.a) list2.get(i16);
            List list3 = aVar.f26383e;
            List list4 = aVar.f26384f;
            z4.f fVarB2 = b("http://dashif.org/guidelines/trickmode", list3);
            fVarB2 = fVarB2 == null ? b("http://dashif.org/guidelines/trickmode", list4) : fVarB2;
            int iIntValue = (fVarB2 == null || (num = (Integer) map.get(Long.valueOf(Long.parseLong(fVarB2.f26415b)))) == null) ? i16 : num.intValue();
            if (iIntValue == i16 && (fVarB = b("urn:mpeg:dash:adaptation-set-switching:2016", list4)) != null) {
                String str = fVarB.f26415b;
                int i17 = c0.f16548a;
                for (String str2 : str.split(",", -1)) {
                    Integer num2 = (Integer) map.get(Long.valueOf(Long.parseLong(str2)));
                    if (num2 != null) {
                        iIntValue = Math.min(iIntValue, num2.intValue());
                    }
                }
            }
            if (iIntValue != i16) {
                List list5 = (List) sparseArray.get(i16);
                List list6 = (List) sparseArray.get(iIntValue);
                list6.addAll(list5);
                sparseArray.put(i16, list6);
                arrayList.remove(list5);
            }
        }
        int size2 = arrayList.size();
        int[][] iArr2 = new int[size2][];
        for (int i18 = 0; i18 < size2; i18++) {
            int[] iArrA0 = g8.a.a0((Collection) arrayList.get(i18));
            iArr2[i18] = iArrA0;
            Arrays.sort(iArrA0);
        }
        boolean[] zArr2 = new boolean[size2];
        m4.q[][] qVarArr = new m4.q[size2][];
        int i19 = 0;
        int i20 = 0;
        while (i19 < size2) {
            int[] iArr3 = iArr2[i19];
            int length = iArr3.length;
            int i21 = 0;
            while (true) {
                if (i21 >= length) {
                    iArr = iArr2;
                    break;
                }
                List list7 = ((z4.a) list2.get(iArr3[i21])).f26381c;
                iArr = iArr2;
                while (i14 < list7.size()) {
                    if (!((z4.m) list7.get(i14)).f26440d.isEmpty()) {
                        zArr2[i19] = true;
                        i20++;
                        break;
                    }
                    i14++;
                }
                i21++;
                iArr2 = iArr;
                i14 = 0;
            }
            int[] iArr4 = iArr[i19];
            int length2 = iArr4.length;
            int i22 = 0;
            while (true) {
                if (i22 >= length2) {
                    zArr = zArr2;
                    qVarArrN = new m4.q[0];
                    break;
                }
                int i23 = iArr4[i22];
                z4.a aVar2 = (z4.a) list2.get(i23);
                List list8 = ((z4.a) list2.get(i23)).f26382d;
                int[] iArr5 = iArr4;
                int i24 = 0;
                while (i24 < list8.size()) {
                    z4.f fVar2 = (z4.f) list8.get(i24);
                    int i25 = length2;
                    zArr = zArr2;
                    if ("urn:scte:dash:cc:cea-608:2015".equals(fVar2.f26414a)) {
                        m4.p pVar2 = new m4.p();
                        pVar2.f14488m = o0.p("application/cea-608");
                        pVar2.f14476a = a0.c.H(aVar2.f26379a, ":cea608", new StringBuilder());
                        qVarArrN = n(fVar2, f25447z, new m4.q(pVar2));
                        break;
                    }
                    if ("urn:scte:dash:cc:cea-708:2015".equals(fVar2.f26414a)) {
                        m4.p pVar3 = new m4.p();
                        pVar3.f14488m = o0.p("application/cea-708");
                        pVar3.f14476a = a0.c.H(aVar2.f26379a, ":cea708", new StringBuilder());
                        qVarArrN = n(fVar2, A, new m4.q(pVar3));
                        break;
                    }
                    i24++;
                    zArr2 = zArr;
                    length2 = i25;
                }
                i22++;
                iArr4 = iArr5;
            }
            qVarArr[i19] = qVarArrN;
            if (qVarArrN.length != 0) {
                i20++;
            }
            i19++;
            zArr2 = zArr;
            iArr2 = iArr;
            i14 = 0;
        }
        int[][] iArr6 = iArr2;
        boolean[] zArr3 = zArr2;
        int size3 = list.size() + i20 + size2;
        j1[] j1VarArr = new j1[size3];
        a[] aVarArr = new a[size3];
        int i26 = 0;
        int i27 = 0;
        while (i27 < size2) {
            int[] iArr7 = iArr6[i27];
            ArrayList arrayList3 = new ArrayList();
            int length3 = iArr7.length;
            int i28 = 0;
            while (i28 < length3) {
                arrayList3.addAll(((z4.a) list2.get(iArr7[i28])).f26381c);
                i28++;
                size2 = size2;
            }
            int i29 = size2;
            int size4 = arrayList3.size();
            m4.q[] qVarArr2 = new m4.q[size4];
            int i30 = 0;
            while (i30 < size4) {
                int i31 = size4;
                m4.q qVar2 = ((z4.m) arrayList3.get(i30)).f26437a;
                int i32 = i26;
                m4.p pVarA = qVar2.a();
                pVarA.L = tVar2.k(qVar2);
                qVarArr2[i30] = new m4.q(pVarA);
                i30++;
                size4 = i31;
                i26 = i32;
            }
            int i33 = i26;
            z4.a aVar3 = (z4.a) list2.get(iArr7[0]);
            m4.q[][] qVarArr3 = qVarArr;
            long j11 = aVar3.f26379a;
            String string = j11 != -1 ? Long.toString(j11) : t0.B(i27, "unset:");
            int i34 = i33 + 1;
            if (zArr3[i27]) {
                i12 = i33 + 2;
            } else {
                i12 = i34;
                i34 = -1;
            }
            List list9 = list2;
            if (qVarArr3[i27].length != 0) {
                i13 = i12 + 1;
            } else {
                i13 = i12;
                i12 = -1;
            }
            k(jVar, qVarArr2);
            int i35 = i13;
            j1VarArr[i33] = new j1(string, qVarArr2);
            int i36 = aVar3.f26380b;
            g0 g0Var2 = i0.f25998b;
            a1 a1Var2 = a1.f25946e;
            a aVar4 = new a(i36, 0, iArr7, i33, i34, i12, -1, a1Var2);
            int[] iArr8 = iArr7;
            int i37 = i33;
            aVarArr[i37] = aVar4;
            int i38 = -1;
            if (i34 != -1) {
                String strJ = h0.j(string, ":emsg");
                m4.p pVar4 = new m4.p();
                pVar4.f14476a = strJ;
                pVar4.f14488m = o0.p("application/x-emsg");
                j1VarArr[i34] = new j1(strJ, new m4.q(pVar4));
                a aVar5 = new a(5, 1, iArr8, i37, -1, -1, -1, a1Var2);
                iArr8 = iArr8;
                i37 = i37;
                aVarArr[i34] = aVar5;
                i38 = -1;
            }
            if (i12 != i38) {
                String strJ2 = h0.j(string, ":cc");
                aVarArr[i12] = new a(3, 1, iArr8, i37, -1, -1, -1, i0.r(qVarArr3[i27]));
                k(jVar, qVarArr3[i27]);
                j1VarArr[i12] = new j1(strJ2, qVarArr3[i27]);
            }
            i27++;
            size2 = i29;
            tVar2 = tVar;
            i26 = i35;
            qVarArr = qVarArr3;
            list2 = list9;
        }
        int i39 = 0;
        while (i39 < list.size()) {
            z4.g gVar = (z4.g) list.get(i39);
            m4.p pVar5 = new m4.p();
            pVar5.f14476a = gVar.a();
            pVar5.f14488m = o0.p("application/x-emsg");
            j1VarArr[i26] = new j1(gVar.a() + ":" + i39, new m4.q(pVar5));
            g0 g0Var3 = i0.f25998b;
            aVarArr[i26] = new a(5, 2, new int[0], -1, -1, -1, i39, a1.f25946e);
            i39++;
            i26++;
        }
        Pair pairCreate = Pair.create(new o1(j1VarArr), aVarArr);
        this.f25457j = (o1) pairCreate.first;
        this.f25458k = (a[]) pairCreate.second;
    }

    public static z4.f b(String str, List list) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            z4.f fVar = (z4.f) list.get(i10);
            if (str.equals(fVar.f26414a)) {
                return fVar;
            }
        }
        return null;
    }

    public static void k(ah.j jVar, m4.q[] qVarArr) {
        for (int i10 = 0; i10 < qVarArr.length; i10++) {
            m4.q qVar = qVarArr[i10];
            k5.d dVar = (k5.d) jVar.f392d;
            if (dVar.f11043b && ((m3.l) dVar.f11044c).k(qVar)) {
                m4.p pVarA = qVar.a();
                String str = qVar.f14541k;
                pVarA.f14488m = o0.p("application/x-media3-cues");
                pVarA.I = ((m3.l) dVar.f11044c).e(qVar);
                StringBuilder sb = new StringBuilder();
                sb.append(qVar.f14544n);
                sb.append(str != null ? " ".concat(str) : "");
                pVarA.f14485j = sb.toString();
                pVarA.f14493r = Long.MAX_VALUE;
                qVar = new m4.q(pVarA);
            }
            qVarArr[i10] = qVar;
        }
    }

    public static m4.q[] n(z4.f fVar, Pattern pattern, m4.q qVar) {
        String str = fVar.f26415b;
        if (str == null) {
            return new m4.q[]{qVar};
        }
        int i10 = c0.f16548a;
        String[] strArrSplit = str.split(";", -1);
        m4.q[] qVarArr = new m4.q[strArrSplit.length];
        for (int i11 = 0; i11 < strArrSplit.length; i11++) {
            Matcher matcher = pattern.matcher(strArrSplit[i11]);
            if (!matcher.matches()) {
                return new m4.q[]{qVar};
            }
            int i12 = Integer.parseInt(matcher.group(1));
            m4.p pVarA = qVar.a();
            pVarA.f14476a = qVar.f14531a + ":" + i12;
            pVarA.H = i12;
            pVarA.f14479d = matcher.group(2);
            qVarArr[i11] = new m4.q(pVarA);
        }
        return qVarArr;
    }

    @Override // j5.d1
    public final void c(e1 e1Var) {
        this.f25464q.c(this);
    }

    @Override // j5.e1
    public final long d() {
        return this.f25467t.d();
    }

    @Override // j5.e1
    public final boolean e(v4.f0 f0Var) {
        return this.f25467t.e(f0Var);
    }

    @Override // j5.b0
    public final void f() {
        this.f25455h.b();
    }

    @Override // j5.b0
    public final void g(a0 a0Var, long j10) {
        this.f25464q = a0Var;
        a0Var.a(this);
    }

    @Override // j5.b0
    public final long h(long j10) throws Throwable {
        k5.a aVar;
        for (k5.i iVar : this.f25465r) {
            b1[] b1VarArr = iVar.f11082n;
            b1 b1Var = iVar.f11081m;
            n5.o oVar = iVar.f11077i;
            ArrayList arrayList = iVar.f11079k;
            iVar.f11088t = j10;
            iVar.f11091w = false;
            if (iVar.z()) {
                iVar.f11087s = j10;
            } else {
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    aVar = (k5.a) arrayList.get(i10);
                    long j11 = aVar.f11061g;
                    if (j11 == j10 && aVar.f11029k == -9223372036854775807L) {
                        break;
                    }
                    if (j11 > j10) {
                        break;
                    }
                }
                aVar = null;
                if (aVar != null ? b1Var.F(aVar.c(0)) : b1Var.G(j10, j10 < iVar.d())) {
                    iVar.f11089u = iVar.B(b1Var.t(), 0);
                    for (b1 b1Var2 : b1VarArr) {
                        b1Var2.G(j10, true);
                    }
                } else {
                    iVar.f11087s = j10;
                    iVar.f11093y = false;
                    arrayList.clear();
                    iVar.f11089u = 0;
                    if (oVar.d()) {
                        b1Var.k();
                        for (b1 b1Var3 : b1VarArr) {
                            b1Var3.k();
                        }
                        oVar.a();
                    } else {
                        oVar.f15374c = null;
                        b1Var.D(false);
                        for (b1 b1Var4 : iVar.f11082n) {
                            b1Var4.D(false);
                        }
                    }
                }
            }
        }
        for (l lVar : this.f25466s) {
            int iA = c0.a(lVar.f25530c, j10, true);
            lVar.f25534g = iA;
            lVar.f25535h = (lVar.f25531d && iA == lVar.f25530c.length) ? j10 : -9223372036854775807L;
        }
        return j10;
    }

    @Override // j5.b0
    public final void i(long j10) throws Throwable {
        long j11;
        for (k5.i iVar : this.f25465r) {
            if (!iVar.z()) {
                b1 b1Var = iVar.f11081m;
                int i10 = b1Var.f10225q;
                b1Var.j(j10, true);
                b1 b1Var2 = iVar.f11081m;
                int i11 = b1Var2.f10225q;
                if (i11 > i10) {
                    synchronized (b1Var2) {
                        j11 = b1Var2.f10224p == 0 ? Long.MIN_VALUE : b1Var2.f10222n[b1Var2.f10226r];
                    }
                    int i12 = 0;
                    while (true) {
                        b1[] b1VarArr = iVar.f11082n;
                        if (i12 >= b1VarArr.length) {
                            break;
                        }
                        b1VarArr[i12].j(j11, iVar.f11072d[i12]);
                        i12++;
                    }
                }
                int iMin = Math.min(iVar.B(i11, 0), iVar.f11089u);
                if (iMin > 0) {
                    c0.S(0, iMin, iVar.f11079k);
                    iVar.f11089u -= iMin;
                }
            }
        }
    }

    public final int j(int[] iArr, int i10) {
        int i11 = iArr[i10];
        if (i11 != -1) {
            a[] aVarArr = this.f25458k;
            int i12 = aVarArr[i11].f25443e;
            for (int i13 = 0; i13 < iArr.length; i13++) {
                int i14 = iArr[i13];
                if (i14 == i12 && aVarArr[i14].f25441c == 0) {
                    return i13;
                }
            }
        }
        return -1;
    }

    @Override // j5.b0
    public final long l(r[] rVarArr, boolean[] zArr, c1[] c1VarArr, boolean[] zArr2, long j10) throws Throwable {
        int i10;
        boolean z10;
        int[] iArr;
        int[] iArr2;
        int i11;
        j1 j1VarA;
        int i12;
        i0 i0Var;
        int i13;
        n nVar;
        boolean z11;
        int[] iArr3 = new int[rVarArr.length];
        char c3 = 0;
        int i14 = 0;
        while (true) {
            i10 = -1;
            if (i14 >= rVarArr.length) {
                break;
            }
            r rVar = rVarArr[i14];
            if (rVar != null) {
                iArr3[i14] = this.f25457j.b(rVar.b());
            } else {
                iArr3[i14] = -1;
            }
            i14++;
        }
        for (int i15 = 0; i15 < rVarArr.length; i15++) {
            if (rVarArr[i15] == null || !zArr[i15]) {
                c1 c1Var = c1VarArr[i15];
                if (c1Var instanceof k5.i) {
                    ((k5.i) c1Var).C(this);
                } else if (c1Var instanceof k5.g) {
                    k5.g gVar = (k5.g) c1Var;
                    k5.i iVar = gVar.f11068e;
                    boolean[] zArr3 = iVar.f11072d;
                    int i16 = gVar.f11066c;
                    p4.c.i(zArr3[i16]);
                    iVar.f11072d[i16] = false;
                }
                c1VarArr[i15] = null;
            }
        }
        int i17 = 0;
        while (true) {
            z10 = true;
            if (i17 >= rVarArr.length) {
                break;
            }
            c1 c1Var2 = c1VarArr[i17];
            if ((c1Var2 instanceof j5.r) || (c1Var2 instanceof k5.g)) {
                int iJ = j(iArr3, i17);
                if (iJ == -1) {
                    z11 = c1VarArr[i17] instanceof j5.r;
                } else {
                    c1 c1Var3 = c1VarArr[i17];
                    z11 = (c1Var3 instanceof k5.g) && ((k5.g) c1Var3).f11064a == c1VarArr[iJ];
                }
                if (!z11) {
                    c1 c1Var4 = c1VarArr[i17];
                    if (c1Var4 instanceof k5.g) {
                        k5.g gVar2 = (k5.g) c1Var4;
                        k5.i iVar2 = gVar2.f11068e;
                        boolean[] zArr4 = iVar2.f11072d;
                        int i18 = gVar2.f11066c;
                        p4.c.i(zArr4[i18]);
                        iVar2.f11072d[i18] = false;
                    }
                    c1VarArr[i17] = null;
                }
            }
            i17++;
        }
        int i19 = 0;
        while (i19 < rVarArr.length) {
            r rVar2 = rVarArr[i19];
            if (rVar2 == null) {
                iArr2 = iArr3;
                i11 = i19;
            } else {
                c1 c1Var5 = c1VarArr[i19];
                if (c1Var5 == null) {
                    zArr2[i19] = z10;
                    a aVar = this.f25458k[iArr3[i19]];
                    int i20 = aVar.f25441c;
                    if (i20 == 0) {
                        int i21 = aVar.f25444f;
                        boolean z12 = i21 != i10;
                        if (z12) {
                            j1VarA = this.f25457j.a(i21);
                            i12 = 1;
                        } else {
                            j1VarA = null;
                            i12 = 0;
                        }
                        int i22 = aVar.f25445g;
                        if (i22 != i10) {
                            i0Var = this.f25458k[i22].f25446h;
                        } else {
                            g0 g0Var = i0.f25998b;
                            i0Var = a1.f25946e;
                        }
                        int size = i0Var.size() + i12;
                        m4.q[] qVarArr = new m4.q[size];
                        int[] iArr4 = new int[size];
                        if (z12) {
                            qVarArr[c3] = j1VarA.f14307d[c3];
                            iArr4[c3] = 5;
                            i13 = 1;
                        } else {
                            i13 = 0;
                        }
                        ArrayList arrayList = new ArrayList();
                        for (int i23 = 0; i23 < i0Var.size(); i23++) {
                            m4.q qVar = (m4.q) i0Var.get(i23);
                            qVarArr[i13] = qVar;
                            iArr4[i13] = 3;
                            arrayList.add(qVar);
                            i13 += z10 ? 1 : 0;
                        }
                        if (this.f25468u.f26392d && z12) {
                            o oVar = this.f25460m;
                            nVar = new n(oVar, oVar.f25543a);
                        } else {
                            nVar = null;
                        }
                        ah.j jVar = this.f25449b;
                        p pVar = this.f25455h;
                        z4.c cVar = this.f25468u;
                        w1 w1Var = this.f25453f;
                        int i24 = this.f25469v;
                        int[] iArr5 = aVar.f25439a;
                        int i25 = aVar.f25440b;
                        iArr2 = iArr3;
                        long j11 = this.f25454g;
                        f0 f0Var = this.f25450c;
                        s4.h hVarQ = ((s4.g) jVar.f391c).q();
                        if (f0Var != null) {
                            hVarQ.t(f0Var);
                        }
                        n nVar2 = nVar;
                        i11 = i19;
                        k5.i iVar3 = new k5.i(aVar.f25440b, iArr4, qVarArr, new k((k5.d) jVar.f392d, pVar, cVar, w1Var, i24, iArr5, rVar2, i25, hVarQ, j11, jVar.f390b, z12, arrayList, nVar), this, this.f25456i, j10, this.f25451d, this.f25463p, this.f25452e, this.f25462o, this.f25471x);
                        synchronized (this) {
                            this.f25461n.put(iVar3, nVar2);
                        }
                        c1VarArr[i11] = iVar3;
                    } else {
                        iArr2 = iArr3;
                        i11 = i19;
                        if (i20 == 2) {
                            c1VarArr[i11] = new l((z4.g) this.f25470w.get(aVar.f25442d), rVar2.b().f14307d[0], this.f25468u.f26392d);
                        }
                    }
                } else {
                    iArr2 = iArr3;
                    i11 = i19;
                    if (c1Var5 instanceof k5.i) {
                        ((k5.i) c1Var5).f11073e.f25523j = rVar2;
                    }
                }
            }
            i19 = i11 + 1;
            iArr3 = iArr2;
            c3 = 0;
            i10 = -1;
            z10 = true;
        }
        int[] iArr6 = iArr3;
        int i26 = 0;
        while (i26 < rVarArr.length) {
            if (c1VarArr[i26] != null || rVarArr[i26] == null) {
                iArr = iArr6;
            } else {
                a aVar2 = this.f25458k[iArr6[i26]];
                if (aVar2.f25441c == 1) {
                    iArr = iArr6;
                    int iJ2 = j(iArr, i26);
                    if (iJ2 != -1) {
                        k5.i iVar4 = (k5.i) c1VarArr[iJ2];
                        int i27 = aVar2.f25440b;
                        boolean[] zArr5 = iVar4.f11072d;
                        b1[] b1VarArr = iVar4.f11082n;
                        for (int i28 = 0; i28 < b1VarArr.length; i28++) {
                            if (iVar4.f11070b[i28] == i27) {
                                p4.c.i(!zArr5[i28]);
                                zArr5[i28] = true;
                                b1VarArr[i28].G(j10, true);
                                c1VarArr[i26] = new k5.g(iVar4, iVar4, b1VarArr[i28], i28);
                            }
                        }
                        throw new IllegalStateException();
                    }
                    c1VarArr[i26] = new j5.r();
                    i26++;
                    iArr6 = iArr;
                } else {
                    iArr = iArr6;
                }
            }
            i26++;
            iArr6 = iArr;
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (c1 c1Var6 : c1VarArr) {
            if (c1Var6 instanceof k5.i) {
                arrayList2.add((k5.i) c1Var6);
            } else if (c1Var6 instanceof l) {
                arrayList3.add((l) c1Var6);
            }
        }
        k5.i[] iVarArr = new k5.i[arrayList2.size()];
        this.f25465r = iVarArr;
        arrayList2.toArray(iVarArr);
        l[] lVarArr = new l[arrayList3.size()];
        this.f25466s = lVarArr;
        arrayList3.toArray(lVarArr);
        w wVar = this.f25459l;
        AbstractList abstractListV = ya.q.v(arrayList2, new w4.c(22));
        wVar.getClass();
        this.f25467t = new j5.m(arrayList2, abstractListV);
        if (this.f25471x) {
            this.f25471x = false;
            this.f25472y = j10;
        }
        return j10;
    }

    @Override // j5.e1
    public final boolean m() {
        return this.f25467t.m();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0065  */
    @Override // j5.b0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long o(long r20, v4.b1 r22) {
        /*
            r19 = this;
            r1 = r20
            r7 = r19
            k5.i[] r0 = r7.f25465r
            int r3 = r0.length
            r4 = 0
            r5 = 0
        L9:
            if (r5 >= r3) goto L76
            r6 = r0[r5]
            int r8 = r6.f11069a
            r9 = 2
            if (r8 != r9) goto L71
            y4.k r0 = r6.f11073e
            y4.i[] r0 = r0.f25522i
            int r3 = r0.length
        L17:
            if (r4 >= r3) goto L76
            r5 = r0[r4]
            java.lang.Object r6 = r5.f25512f
            y4.h r6 = (y4.h) r6
            long r8 = r5.f25508b
            java.lang.Object r10 = r5.f25512f
            y4.h r10 = (y4.h) r10
            if (r6 == 0) goto L6c
            long r11 = r5.g()
            r13 = 0
            int r6 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r6 != 0) goto L32
            goto L6c
        L32:
            p4.c.j(r10)
            long r3 = r5.f25507a
            long r3 = r10.l(r1, r3)
            long r3 = r3 + r8
            r13 = r3
            long r3 = r5.i(r13)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L65
            r15 = -1
            r17 = 1
            int r0 = (r11 > r15 ? 1 : (r11 == r15 ? 0 : -1))
            if (r0 == 0) goto L5c
            p4.c.j(r10)
            long r15 = r10.v()
            long r15 = r15 + r8
            long r15 = r15 + r11
            long r15 = r15 - r17
            int r0 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r0 >= 0) goto L65
        L5c:
            long r8 = r13 + r17
            long r5 = r5.i(r8)
        L62:
            r0 = r22
            goto L67
        L65:
            r5 = r3
            goto L62
        L67:
            long r0 = r0.a(r1, r3, r5)
            return r0
        L6c:
            int r4 = r4 + 1
            r1 = r20
            goto L17
        L71:
            int r5 = r5 + 1
            r1 = r20
            goto L9
        L76:
            return r20
        */
        throw new UnsupportedOperationException("Method not decompiled: y4.b.o(long, v4.b1):long");
    }

    @Override // j5.b0
    public final long p() {
        k5.i[] iVarArr = this.f25465r;
        int length = iVarArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            k5.i iVar = iVarArr[i10];
            iVar.getClass();
            try {
                if (iVar.f11092x) {
                    return this.f25472y;
                }
            } finally {
                iVar.f11092x = false;
            }
        }
        return -9223372036854775807L;
    }

    @Override // j5.b0
    public final o1 q() {
        return this.f25457j;
    }

    @Override // j5.e1
    public final long t() {
        return this.f25467t.t();
    }

    @Override // j5.e1
    public final void w(long j10) {
        for (k5.i iVar : this.f25465r) {
            if (!iVar.f11077i.d()) {
                long jD = this.f25468u.d(this.f25469v);
                b1 b1Var = iVar.f11081m;
                p4.c.i(!iVar.f11077i.d());
                if (!iVar.z() && jD != -9223372036854775807L && !iVar.f11079k.isEmpty()) {
                    k5.a aVarX = iVar.x();
                    long j11 = aVarX.f11030l;
                    if (j11 == -9223372036854775807L) {
                        j11 = aVarX.f11062h;
                    }
                    if (j11 > jD) {
                        long jQ = b1Var.q();
                        if (jQ > jD) {
                            b1Var.l(jD);
                            for (b1 b1Var2 : iVar.f11082n) {
                                b1Var2.l(jD);
                            }
                            iVar.f11075g.M(iVar.f11069a, jD, jQ);
                        }
                    }
                }
            }
        }
        this.f25467t.w(j10);
    }
}
