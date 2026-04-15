package i7;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class h1 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final h1 f9146e = new h1(i0.f9157g);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f9147a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f9148b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f9149c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f9150d;

    public h1(int i10, int i11, List list) {
        jc.l.e(list, "pages");
        this.f9147a = vb.m.H0(list);
        Iterator it = list.iterator();
        int size = 0;
        while (it.hasNext()) {
            size += ((q2) it.next()).f9276b.size();
        }
        this.f9148b = size;
        this.f9149c = i10;
        this.f9150d = i11;
    }

    public final s2 a(int i10) {
        ArrayList arrayList;
        int iIntValue = i10 - this.f9149c;
        int i11 = 0;
        while (true) {
            arrayList = this.f9147a;
            if (iIntValue < ((q2) arrayList.get(i11)).f9276b.size() || i11 >= ud.b.r(arrayList)) {
                break;
            }
            iIntValue -= ((q2) arrayList.get(i11)).f9276b.size();
            i11++;
        }
        q2 q2Var = (q2) arrayList.get(i11);
        int i12 = i10 - this.f9149c;
        int iD = ((d() - i10) - this.f9150d) - 1;
        Integer numG0 = vb.l.G0(((q2) vb.m.Y(arrayList)).f9275a);
        jc.l.b(numG0);
        int iIntValue2 = numG0.intValue();
        int iC = c();
        int i13 = q2Var.f9277c;
        List list = q2Var.f9278d;
        if (list != null) {
            oc.d dVarQ = ud.b.q(list);
            if (iIntValue >= 0 && iIntValue <= dVarQ.f16308b) {
                iIntValue = ((Number) list.get(iIntValue)).intValue();
            }
        }
        return new s2(i13, iIntValue, i12, iD, iIntValue2, iC);
    }

    public final Object b(int i10) {
        ArrayList arrayList = this.f9147a;
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            int size2 = ((q2) arrayList.get(i11)).f9276b.size();
            if (size2 > i10) {
                break;
            }
            i10 -= size2;
            i11++;
        }
        return ((q2) arrayList.get(i11)).f9276b.get(i10);
    }

    public final int c() {
        Integer numValueOf;
        int[] iArr = ((q2) vb.m.h0(this.f9147a)).f9275a;
        jc.l.e(iArr, "<this>");
        if (iArr.length == 0) {
            numValueOf = null;
        } else {
            int i10 = iArr[0];
            int i11 = 1;
            int length = iArr.length - 1;
            if (1 <= length) {
                while (true) {
                    int i12 = iArr[i11];
                    if (i10 < i12) {
                        i10 = i12;
                    }
                    if (i11 == length) {
                        break;
                    }
                    i11++;
                }
            }
            numValueOf = Integer.valueOf(i10);
        }
        jc.l.b(numValueOf);
        return numValueOf.intValue();
    }

    public final int d() {
        return this.f9149c + this.f9148b + this.f9150d;
    }

    public final u e(k0 k0Var) {
        jc.l.e(k0Var, "pageEvent");
        boolean z10 = k0Var instanceof i0;
        ArrayList arrayList = this.f9147a;
        if (!z10) {
            if (!(k0Var instanceof f0)) {
                throw new IllegalStateException("Paging received an event to process StaticList or LoadStateUpdate while\nprocessing Inserts and Drops. If you see this exception, it is most\nlikely a bug in the library. Please file a bug so we can fix it at:\nhttps://issuetracker.google.com/issues/new?component=413106");
            }
            oc.d dVar = new oc.d(0, 0, 1);
            Iterator it = arrayList.iterator();
            int size = 0;
            while (it.hasNext()) {
                q2 q2Var = (q2) it.next();
                int[] iArr = q2Var.f9275a;
                int length = iArr.length;
                int i10 = 0;
                while (true) {
                    if (i10 < length) {
                        int i11 = iArr[i10];
                        if (dVar.f16307a <= i11 && i11 <= dVar.f16308b) {
                            size += q2Var.f9276b.size();
                            it.remove();
                            break;
                        }
                        i10++;
                    } else {
                        break;
                    }
                }
            }
            int i12 = this.f9148b - size;
            this.f9148b = i12;
            int i13 = this.f9150d;
            this.f9150d = 0;
            return new n1(this.f9149c + i12, size, 0, i13);
        }
        i0 i0Var = (i0) k0Var;
        List list = i0Var.f9159b;
        List list2 = list;
        Iterator it2 = list2.iterator();
        int size2 = 0;
        while (it2.hasNext()) {
            size2 += ((q2) it2.next()).f9276b.size();
        }
        int iOrdinal = i0Var.f9158a.ordinal();
        if (iOrdinal == 0) {
            throw new IllegalStateException("Paging received a refresh event in the middle of an actively loading generation\nof PagingData. If you see this exception, it is most likely a bug in the library.\nPlease file a bug so we can fix it at:\nhttps://issuetracker.google.com/issues/new?component=413106");
        }
        if (iOrdinal == 1) {
            int i14 = this.f9149c;
            arrayList.addAll(0, list);
            this.f9148b += size2;
            this.f9149c = i0Var.f9160c;
            ArrayList arrayList2 = new ArrayList();
            Iterator it3 = list2.iterator();
            while (it3.hasNext()) {
                vb.m.P(arrayList2, ((q2) it3.next()).f9276b);
            }
            return new p1(arrayList2, this.f9149c, i14);
        }
        if (iOrdinal != 2) {
            throw new ce.j0();
        }
        int i15 = this.f9150d;
        int i16 = this.f9148b;
        arrayList.addAll(arrayList.size(), list);
        this.f9148b += size2;
        this.f9150d = i0Var.f9161d;
        int i17 = this.f9149c + i16;
        ArrayList arrayList3 = new ArrayList();
        Iterator it4 = list2.iterator();
        while (it4.hasNext()) {
            vb.m.P(arrayList3, ((q2) it4.next()).f9276b);
        }
        return new m1(i17, this.f9150d, i15, arrayList3);
    }

    public final String toString() throws IOException {
        int i10 = this.f9148b;
        ArrayList arrayList = new ArrayList(i10);
        for (int i11 = 0; i11 < i10; i11++) {
            arrayList.add(b(i11));
        }
        return "[(" + this.f9149c + " placeholders), " + vb.m.f0(arrayList, null, null, null, null, 63) + ", (" + this.f9150d + " placeholders)]";
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public h1(i0 i0Var) {
        this(i0Var.f9160c, i0Var.f9161d, i0Var.f9159b);
        jc.l.e(i0Var, "insertEvent");
    }
}
