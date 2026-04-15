package d0;

import g2.f1;
import g2.g1;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class u extends jc.m implements ic.k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f5400b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ArrayList f5401c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u(int i10, ArrayList arrayList) {
        super(1);
        this.f5400b = i10;
        this.f5401c = arrayList;
    }

    @Override // ic.k
    public final Object a(Object obj) {
        switch (this.f5400b) {
            case 0:
                f1 f1Var = (f1) obj;
                ArrayList arrayList = this.f5401c;
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    j jVar = (j) arrayList.get(i10);
                    List list = jVar.f5347b;
                    boolean z10 = jVar.f5354i;
                    if (jVar.f5358m == Integer.MIN_VALUE) {
                        x.a.a("position() should be called first");
                    }
                    int size2 = list.size();
                    int i11 = 0;
                    while (i11 < size2) {
                        g1 g1Var = (g1) list.get(i11);
                        int[] iArr = jVar.f5356k;
                        int i12 = i11 * 2;
                        int i13 = i10;
                        long j10 = (((long) iArr[i12 + 1]) & 4294967295L) | (((long) iArr[i12]) << 32);
                        if (jVar.f5353h) {
                            int i14 = z10 ? (int) (j10 >> 32) : (jVar.f5358m - ((int) (j10 >> 32))) - (z10 ? g1Var.f7181b : g1Var.f7180a);
                            j10 = (((long) (z10 ? (jVar.f5358m - ((int) (j10 & 4294967295L))) - (z10 ? g1Var.f7181b : g1Var.f7180a) : (int) (j10 & 4294967295L))) & 4294967295L) | (((long) i14) << 32);
                        }
                        long jD = f3.j.d(j10, jVar.f5348c);
                        if (z10) {
                            f1.q(f1Var, g1Var, jD);
                        } else {
                            f1.m(f1Var, g1Var, jD);
                        }
                        i11++;
                        i10 = i13;
                    }
                    i10++;
                }
                break;
            case 1:
                f1 f1Var2 = (f1) obj;
                ArrayList arrayList2 = this.f5401c;
                int size3 = arrayList2.size();
                for (int i15 = 0; i15 < size3; i15++) {
                    f1.l(f1Var2, (g1) arrayList2.get(i15), 0, 0);
                }
                break;
            case 2:
                f1 f1Var3 = (f1) obj;
                ArrayList arrayList3 = this.f5401c;
                int size4 = arrayList3.size();
                for (int i16 = 0; i16 < size4; i16++) {
                    f1.k(f1Var3, (g1) arrayList3.get(i16), 0, 0);
                }
                break;
            case 3:
                f1 f1Var4 = (f1) obj;
                ArrayList arrayList4 = this.f5401c;
                int iR = ud.b.r(arrayList4);
                if (iR >= 0) {
                    int i17 = 0;
                    while (true) {
                        f1.k(f1Var4, (g1) arrayList4.get(i17), 0, 0);
                        if (i17 != iR) {
                            i17++;
                        }
                    }
                }
                break;
            case 4:
                f1 f1Var5 = (f1) obj;
                ArrayList arrayList5 = this.f5401c;
                int size5 = arrayList5.size();
                for (int i18 = 0; i18 < size5; i18++) {
                    f1Var5.h((g1) arrayList5.get(i18), 0, 0, 0.0f);
                }
                break;
            default:
                f1 f1Var6 = (f1) obj;
                ArrayList arrayList6 = this.f5401c;
                int size6 = arrayList6.size();
                for (int i19 = 0; i19 < size6; i19++) {
                    f1Var6.h((g1) arrayList6.get(i19), 0, 0, 0.0f);
                }
                break;
        }
        return ub.a0.f21526a;
    }
}
