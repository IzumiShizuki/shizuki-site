package i7;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class g1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j1 f9120a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f9121b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f9122c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f9123d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f9124e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f9125f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final kf.f f9126g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final kf.f f9127h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final LinkedHashMap f9128i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final c7.e1 f9129j;

    public g1(j1 j1Var) {
        this.f9120a = j1Var;
        ArrayList arrayList = new ArrayList();
        this.f9121b = arrayList;
        this.f9122c = arrayList;
        this.f9126g = g8.a.c(-1, 6, null);
        this.f9127h = g8.a.c(-1, 6, null);
        this.f9128i = new LinkedHashMap();
        c7.e1 e1Var = new c7.e1(18);
        e1Var.Y(d0.f9071a, z.f9388b);
        this.f9129j = e1Var;
    }

    public final i2 a(s2 s2Var) {
        Integer numValueOf;
        j1 j1Var = this.f9120a;
        int i10 = j1Var.f9176a;
        ArrayList arrayList = this.f9122c;
        List listG0 = vb.m.G0(arrayList);
        if (s2Var != null) {
            int i11 = s2Var.f9311e;
            int size = this.f9124e;
            int i12 = -this.f9123d;
            int iR = ud.b.r(arrayList) - this.f9123d;
            int i13 = i12;
            while (i13 < i11) {
                size += i13 > iR ? i10 : ((f2) arrayList.get(this.f9123d + i13)).f9097a.size();
                i13++;
            }
            int i14 = size + s2Var.f9312f;
            if (i11 < i12) {
                i14 -= i10;
            }
            numValueOf = Integer.valueOf(i14);
        } else {
            numValueOf = null;
        }
        return new i2(listG0, numValueOf, j1Var, this.f9124e);
    }

    public final boolean b(int i10, d0 d0Var, f2 f2Var) {
        jc.l.e(d0Var, "loadType");
        jc.l.e(f2Var, "page");
        int i11 = f2Var.f9100d;
        List list = f2Var.f9097a;
        int i12 = f2Var.f9101e;
        int iOrdinal = d0Var.ordinal();
        ArrayList arrayList = this.f9121b;
        ArrayList arrayList2 = this.f9122c;
        if (iOrdinal == 0) {
            if (!arrayList2.isEmpty()) {
                throw new IllegalStateException("cannot receive multiple init calls");
            }
            if (i10 != 0) {
                throw new IllegalStateException("init loadId must be the initial value, 0");
            }
            arrayList.add(f2Var);
            this.f9123d = 0;
            if (i12 == Integer.MIN_VALUE) {
                i12 = 0;
            }
            this.f9125f = i12;
            if (i11 == Integer.MIN_VALUE) {
                i11 = 0;
            }
            this.f9124e = i11;
            return true;
        }
        LinkedHashMap linkedHashMap = this.f9128i;
        if (iOrdinal != 1) {
            if (iOrdinal != 2) {
                return true;
            }
            if (arrayList2.isEmpty()) {
                throw new IllegalStateException("should've received an init before append");
            }
            if (i10 == 0) {
                arrayList.add(f2Var);
                if (i12 == Integer.MIN_VALUE) {
                    int size = this.f9125f - list.size();
                    i12 = size < 0 ? 0 : size;
                }
                this.f9125f = i12 != Integer.MIN_VALUE ? i12 : 0;
                linkedHashMap.remove(d0.f9073c);
                return true;
            }
        } else {
            if (arrayList2.isEmpty()) {
                throw new IllegalStateException("should've received an init before prepend");
            }
            if (i10 == 0) {
                arrayList.add(0, f2Var);
                this.f9123d++;
                if (i11 == Integer.MIN_VALUE) {
                    int size2 = this.f9124e - list.size();
                    i11 = size2 < 0 ? 0 : size2;
                }
                this.f9124e = i11 != Integer.MIN_VALUE ? i11 : 0;
                linkedHashMap.remove(d0.f9072b);
                return true;
            }
        }
        return false;
    }

    public final i0 c(f2 f2Var, d0 d0Var) {
        jc.l.e(f2Var, "<this>");
        int iOrdinal = d0Var.ordinal();
        int size = 0;
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                size = 0 - this.f9123d;
            } else {
                if (iOrdinal != 2) {
                    throw new ce.j0();
                }
                size = (this.f9122c.size() - this.f9123d) - 1;
            }
        }
        List listW = ud.b.w(new q2(size, f2Var.f9097a));
        int iOrdinal2 = d0Var.ordinal();
        c7.e1 e1Var = this.f9129j;
        if (iOrdinal2 == 0) {
            i0 i0Var = i0.f9157g;
            return new i0(d0.f9071a, listW, this.f9124e, this.f9125f, e1Var.f0(), null);
        }
        if (iOrdinal2 == 1) {
            i0 i0Var2 = i0.f9157g;
            return new i0(d0.f9072b, listW, this.f9124e, -1, e1Var.f0(), null);
        }
        if (iOrdinal2 != 2) {
            throw new ce.j0();
        }
        i0 i0Var3 = i0.f9157g;
        return new i0(d0.f9073c, listW, -1, this.f9125f, e1Var.f0(), null);
    }
}
