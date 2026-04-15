package j5;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class n0 extends k {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final m4.i0 f10362s;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final a[] f10363k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ArrayList f10364l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final m4.i1[] f10365m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ArrayList f10366n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final g5.w f10367o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f10368p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long[][] f10369q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public androidx.media3.exoplayer.offline.e f10370r;

    static {
        m4.w wVar = new m4.w();
        ya.g0 g0Var = ya.i0.f25998b;
        ya.a1 a1Var = ya.a1.f25946e;
        List list = Collections.EMPTY_LIST;
        ya.a1 a1Var2 = ya.a1.f25946e;
        m4.b0 b0Var = new m4.b0();
        f10362s = new m4.i0("MergingMediaSource", new m4.y(wVar), null, new m4.c0(b0Var), m4.l0.K, m4.e0.f14187d);
    }

    public n0(a... aVarArr) {
        g5.w wVar = new g5.w(19);
        this.f10363k = aVarArr;
        this.f10367o = wVar;
        this.f10366n = new ArrayList(Arrays.asList(aVarArr));
        this.f10368p = -1;
        this.f10364l = new ArrayList(aVarArr.length);
        for (int i10 = 0; i10 < aVarArr.length; i10++) {
            this.f10364l.add(new ArrayList());
        }
        this.f10365m = new m4.i1[aVarArr.length];
        this.f10369q = new long[0][];
        new HashMap();
        ya.q.d(8, "expectedKeys");
        ya.q.d(2, "expectedValuesPerKey");
        new ya.v0(ya.u.a(8)).f26069f = new ya.u0();
    }

    @Override // j5.a
    public final boolean a(m4.i0 i0Var) {
        a[] aVarArr = this.f10363k;
        return aVarArr.length > 0 && aVarArr[0].a(i0Var);
    }

    @Override // j5.a
    public final b0 c(d0 d0Var, n5.f fVar, long j10) {
        a[] aVarArr = this.f10363k;
        int length = aVarArr.length;
        b0[] b0VarArr = new b0[length];
        m4.i1[] i1VarArr = this.f10365m;
        int iB = i1VarArr[0].b(d0Var.f10245a);
        for (int i10 = 0; i10 < length; i10++) {
            d0 d0VarA = d0Var.a(i1VarArr[i10].l(iB));
            b0VarArr[i10] = aVarArr[i10].c(d0VarA, fVar, j10 - this.f10369q[iB][i10]);
            ((List) this.f10364l.get(i10)).add(new m0(d0VarA, b0VarArr[i10]));
        }
        return new l0(this.f10367o, this.f10369q[iB], b0VarArr);
    }

    @Override // j5.a
    public final m4.i0 i() {
        a[] aVarArr = this.f10363k;
        return aVarArr.length > 0 ? aVarArr[0].i() : f10362s;
    }

    @Override // j5.k, j5.a
    public final void k() throws androidx.media3.exoplayer.offline.e {
        androidx.media3.exoplayer.offline.e eVar = this.f10370r;
        if (eVar != null) {
            throw eVar;
        }
        super.k();
    }

    @Override // j5.a
    public final void m(s4.f0 f0Var) {
        this.f10327j = f0Var;
        this.f10326i = p4.c0.n(null);
        int i10 = 0;
        while (true) {
            a[] aVarArr = this.f10363k;
            if (i10 >= aVarArr.length) {
                return;
            }
            y(Integer.valueOf(i10), aVarArr[i10]);
            i10++;
        }
    }

    @Override // j5.a
    public final void o(b0 b0Var) {
        l0 l0Var = (l0) b0Var;
        int i10 = 0;
        while (true) {
            a[] aVarArr = this.f10363k;
            if (i10 >= aVarArr.length) {
                return;
            }
            List list = (List) this.f10364l.get(i10);
            int i11 = 0;
            while (true) {
                if (i11 >= list.size()) {
                    break;
                }
                if (((m0) list.get(i11)).f10355b.equals(b0Var)) {
                    list.remove(i11);
                    break;
                }
                i11++;
            }
            a aVar = aVarArr[i10];
            b0 b0Var2 = l0Var.f10341a[i10];
            if (b0Var2 instanceof m1) {
                b0Var2 = ((m1) b0Var2).f10356a;
            }
            aVar.o(b0Var2);
            i10++;
        }
    }

    @Override // j5.k, j5.a
    public final void q() {
        super.q();
        Arrays.fill(this.f10365m, (Object) null);
        this.f10368p = -1;
        this.f10370r = null;
        ArrayList arrayList = this.f10366n;
        arrayList.clear();
        Collections.addAll(arrayList, this.f10363k);
    }

    @Override // j5.a
    public final void t(m4.i0 i0Var) {
        this.f10363k[0].t(i0Var);
    }

    @Override // j5.k
    public final d0 u(Object obj, d0 d0Var) {
        int iIntValue = ((Integer) obj).intValue();
        ArrayList arrayList = this.f10364l;
        List list = (List) arrayList.get(iIntValue);
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (((m0) list.get(i10)).f10354a.equals(d0Var)) {
                return ((m0) ((List) arrayList.get(0)).get(i10)).f10354a;
            }
        }
        return null;
    }

    @Override // j5.k
    public final void x(Object obj, a aVar, m4.i1 i1Var) {
        Integer num = (Integer) obj;
        if (this.f10370r != null) {
            return;
        }
        if (this.f10368p == -1) {
            this.f10368p = i1Var.h();
        } else if (i1Var.h() != this.f10368p) {
            this.f10370r = new androidx.media3.exoplayer.offline.e();
            return;
        }
        int length = this.f10369q.length;
        m4.i1[] i1VarArr = this.f10365m;
        if (length == 0) {
            this.f10369q = (long[][]) Array.newInstance((Class<?>) Long.TYPE, this.f10368p, i1VarArr.length);
        }
        ArrayList arrayList = this.f10366n;
        arrayList.remove(aVar);
        i1VarArr[num.intValue()] = i1Var;
        if (arrayList.isEmpty()) {
            n(i1VarArr[0]);
        }
    }
}
