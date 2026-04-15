package m7;

import java.util.ArrayList;
import q.t0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class b extends q {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ArrayList f14818e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ArrayList f14819f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ArrayList f14820g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ArrayList f14821h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ArrayList f14822i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ArrayList f14823j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ArrayList f14824k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ArrayList f14825l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ArrayList f14826m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public ArrayList f14827n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ArrayList f14828o;

    public static void c(ArrayList arrayList) {
        int size = arrayList.size() - 1;
        if (size >= 0) {
            throw t0.A(size, arrayList);
        }
    }

    @Override // m7.q
    public final void a() {
        ArrayList arrayList = this.f14822i;
        ArrayList arrayList2 = this.f14823j;
        ArrayList arrayList3 = this.f14819f;
        ArrayList arrayList4 = this.f14824k;
        ArrayList arrayList5 = this.f14821h;
        ArrayList arrayList6 = this.f14818e;
        ArrayList arrayList7 = this.f14820g;
        int size = arrayList7.size() - 1;
        if (size >= 0) {
            a0.c.N(arrayList7.get(size));
            throw null;
        }
        for (int size2 = arrayList6.size() - 1; size2 >= 0; size2--) {
            if (arrayList6.get(size2) != null) {
                throw new ClassCastException();
            }
            if (this.f14918a != null) {
                throw null;
            }
            arrayList6.remove(size2);
        }
        int size3 = arrayList3.size() - 1;
        if (size3 >= 0) {
            throw t0.A(size3, arrayList3);
        }
        int size4 = arrayList5.size() - 1;
        if (size4 >= 0) {
            a0.c.N(arrayList5.get(size4));
            throw null;
        }
        arrayList5.clear();
        if (b()) {
            for (int size5 = arrayList2.size() - 1; size5 >= 0; size5--) {
                ArrayList arrayList8 = (ArrayList) arrayList2.get(size5);
                int size6 = arrayList8.size() - 1;
                if (size6 >= 0) {
                    a0.c.N(arrayList8.get(size6));
                    throw null;
                }
            }
            for (int size7 = arrayList.size() - 1; size7 >= 0; size7--) {
                ArrayList arrayList9 = (ArrayList) arrayList.get(size7);
                int size8 = arrayList9.size() - 1;
                if (size8 >= 0) {
                    throw t0.A(size8, arrayList9);
                }
            }
            for (int size9 = arrayList4.size() - 1; size9 >= 0; size9--) {
                ArrayList arrayList10 = (ArrayList) arrayList4.get(size9);
                int size10 = arrayList10.size() - 1;
                if (size10 >= 0) {
                    a0.c.N(arrayList10.get(size10));
                    throw null;
                }
            }
            c(this.f14827n);
            c(this.f14826m);
            c(this.f14825l);
            c(this.f14828o);
            ArrayList arrayList11 = this.f14919b;
            if (arrayList11.size() > 0) {
                throw t0.A(0, arrayList11);
            }
            arrayList11.clear();
        }
    }

    @Override // m7.q
    public final boolean b() {
        return (this.f14819f.isEmpty() && this.f14821h.isEmpty() && this.f14820g.isEmpty() && this.f14818e.isEmpty() && this.f14826m.isEmpty() && this.f14827n.isEmpty() && this.f14825l.isEmpty() && this.f14828o.isEmpty() && this.f14823j.isEmpty() && this.f14822i.isEmpty() && this.f14824k.isEmpty()) ? false : true;
    }
}
