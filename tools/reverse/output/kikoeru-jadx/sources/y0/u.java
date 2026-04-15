package y0;

import java.util.ArrayList;
import x0.c2;
import x0.d2;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class u extends i0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final u f25347d = new u(1, 0, 2);

    @Override // y0.i0
    public final void c(m4.j jVar, x0.c cVar, d2 d2Var, f1.m mVar, j0 j0Var) {
        x0.a aVar;
        int iC;
        int iE = jVar.e(0);
        if (d2Var.f24278n != 0) {
            x0.p.c("Cannot move a group while inserting");
        }
        if (iE < 0) {
            x0.p.c("Parameter offset is out of bounds");
        }
        if (iE == 0) {
            return;
        }
        int i10 = d2Var.f24284t;
        int i11 = d2Var.f24286v;
        int i12 = d2Var.f24285u;
        int i13 = i10;
        while (iE > 0) {
            i13 += d2Var.f24266b[(d2Var.r(i13) * 5) + 3];
            if (i13 > i12) {
                x0.p.c("Parameter offset is out of bounds");
            }
            iE--;
        }
        int i14 = d2Var.f24266b[(d2Var.r(i13) * 5) + 3];
        int iG = d2Var.g(d2Var.f24266b, d2Var.r(d2Var.f24284t));
        int iG2 = d2Var.g(d2Var.f24266b, d2Var.r(i13));
        int i15 = i13 + i14;
        int iG3 = d2Var.g(d2Var.f24266b, d2Var.r(i15));
        int i16 = iG3 - iG2;
        d2Var.w(i16, Math.max(d2Var.f24284t - 1, 0));
        d2Var.v(i14);
        int[] iArr = d2Var.f24266b;
        int iR = d2Var.r(i15) * 5;
        vb.l.h0(d2Var.r(i10) * 5, iR, (i14 * 5) + iR, iArr, iArr);
        if (i16 > 0) {
            Object[] objArr = d2Var.f24267c;
            int iH = d2Var.h(iG2 + i16);
            System.arraycopy(objArr, iH, objArr, iG, d2Var.h(iG3 + i16) - iH);
        }
        int i17 = iG2 + i16;
        int i18 = i17 - iG;
        int i19 = d2Var.f24275k;
        int i20 = d2Var.f24276l;
        int length = d2Var.f24267c.length;
        int i21 = d2Var.f24277m;
        int i22 = i10 + i14;
        int i23 = i10;
        while (i23 < i22) {
            int iR2 = d2Var.r(i23);
            int i24 = i18;
            int[] iArr2 = iArr;
            iArr2[(iR2 * 5) + 4] = d2.i(d2.i(d2Var.g(iArr, iR2) - i24, i21 < iR2 ? 0 : i19, i20, length), d2Var.f24275k, d2Var.f24276l, d2Var.f24267c.length);
            i23++;
            i18 = i24;
            iArr = iArr2;
            i19 = i19;
        }
        int i25 = i15 + i14;
        int iP = d2Var.p();
        int iB = c2.b(d2Var.f24268d, i15, iP);
        ArrayList arrayList = new ArrayList();
        if (iB >= 0) {
            while (iB < d2Var.f24268d.size() && (iC = d2Var.c((aVar = (x0.a) d2Var.f24268d.get(iB)))) >= i15 && iC < i25) {
                arrayList.add(aVar);
            }
        }
        int i26 = i10 - i15;
        int size = arrayList.size();
        for (int i27 = 0; i27 < size; i27++) {
            x0.a aVar2 = (x0.a) arrayList.get(i27);
            int iC2 = d2Var.c(aVar2) + i26;
            if (iC2 >= d2Var.f24271g) {
                aVar2.f24233a = -(iP - iC2);
            } else {
                aVar2.f24233a = iC2;
            }
            d2Var.f24268d.add(c2.b(d2Var.f24268d, iC2, iP), aVar2);
        }
        if (d2Var.H(i15, i14)) {
            x0.p.c("Unexpectedly removed anchors");
        }
        d2Var.m(i11, d2Var.f24285u, i10);
        if (i16 > 0) {
            d2Var.I(i17, i16, i15 - 1);
        }
    }
}
