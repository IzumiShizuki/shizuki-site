package x0;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final y0 f24408a = new y0("provider");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final y0 f24409b = new y0("provider");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final y0 f24410c = new y0("compositionLocalMap");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final y0 f24411d = new y0("providers");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final y0 f24412e = new y0("reference");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final androidx.media3.exoplayer.offline.i f24413f = new androidx.media3.exoplayer.offline.i(20);

    public static final void a(int i10, int i11, List list) {
        int iE = e(i10, list);
        if (iE < 0) {
            iE = -(iE + 1);
        }
        while (iE < list.size() && ((l0) list.get(iE)).f24344b < i11) {
        }
    }

    public static final void b(z1 z1Var, ArrayList arrayList, int i10) {
        boolean zL = z1Var.l(i10);
        int[] iArr = z1Var.f24530b;
        if (zL) {
            arrayList.add(z1Var.n(i10));
            return;
        }
        int i11 = iArr[(i10 * 5) + 3] + i10;
        for (int i12 = i10 + 1; i12 < i11; i12 += iArr[(i12 * 5) + 3]) {
            b(z1Var, arrayList, i12);
        }
    }

    public static final void c(String str) {
        throw new j(q.t0.D("Compose Runtime internal error. Unexpected or incorrect use of the Compose internal runtime API (", str, "). Please report to Google or use https://goo.gle/compose-feedback"));
    }

    public static final Void d(String str) {
        throw new j(q.t0.D("Compose Runtime internal error. Unexpected or incorrect use of the Compose internal runtime API (", str, "). Please report to Google or use https://goo.gle/compose-feedback"));
    }

    public static final int e(int i10, List list) {
        int size = list.size() - 1;
        int i11 = 0;
        while (i11 <= size) {
            int i12 = (i11 + size) >>> 1;
            int iG = jc.l.g(((l0) list.get(i12)).f24344b, i10);
            if (iG < 0) {
                i11 = i12 + 1;
            } else {
                if (iG <= 0) {
                    return i12;
                }
                size = i12 - 1;
            }
        }
        return -(i11 + 1);
    }

    public static final void f(d2 d2Var, int i10, Object obj) {
        int iH = d2Var.h(i10);
        Object[] objArr = d2Var.f24267c;
        Object obj2 = objArr[iH];
        objArr[iH] = k.f24334a;
        if (obj == obj2) {
            return;
        }
        c("Slot table is out of sync (expected " + obj + ", got " + obj2 + ')');
    }
}
