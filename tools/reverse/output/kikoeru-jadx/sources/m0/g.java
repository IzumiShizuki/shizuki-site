package m0;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g implements ic.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13005a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f13006b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f13007c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f13008d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f13009e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f13010f;

    public /* synthetic */ g(ArrayList arrayList, g2.x0 x0Var, float f10, int i10, ArrayList arrayList2) {
        this.f13008d = arrayList;
        this.f13010f = x0Var;
        this.f13007c = f10;
        this.f13006b = i10;
        this.f13009e = arrayList2;
    }

    @Override // ic.k
    public final Object a(Object obj) {
        int i10;
        int i11 = this.f13005a;
        boolean z10 = false;
        Object obj2 = this.f13010f;
        Object obj3 = this.f13009e;
        float f10 = this.f13007c;
        int i12 = this.f13006b;
        Object obj4 = this.f13008d;
        switch (i11) {
            case 0:
                ArrayList arrayList = (ArrayList) obj4;
                g2.x0 x0Var = (g2.x0) obj2;
                ArrayList arrayList2 = (ArrayList) obj3;
                g2.f1 f1Var = (g2.f1) obj;
                int size = arrayList.size();
                int i13 = 0;
                while (i13 < size) {
                    List list = (List) arrayList.get(i13);
                    int size2 = list.size();
                    int[] iArr = new int[size2];
                    int i14 = 0;
                    while (i14 < size2) {
                        iArr[i14] = ((g2.g1) list.get(i14)).f7180a + (i14 < ud.b.r(list) ? x0Var.a0(f10) : 0);
                        i14++;
                    }
                    y.o0 o0Var = y.k.f25156a;
                    int[] iArr2 = new int[size2];
                    y.k.c(i12, iArr, iArr2, z10);
                    int size3 = list.size();
                    for (int i15 = 0; i15 < size3; i15++) {
                        f1Var.h((g2.g1) list.get(i15), iArr2[i15], ((Number) arrayList2.get(i13)).intValue(), 0.0f);
                    }
                    i13++;
                    z10 = false;
                }
                return ub.a0.f21526a;
            default:
                oc.a aVar = (oc.a) obj4;
                ic.k kVar = (ic.k) obj3;
                ic.a aVar2 = (ic.a) obj2;
                float fFloatValue = ((Float) obj).floatValue();
                float f11 = aVar.f16305a;
                float f12 = aVar.f16306b;
                float fJ = nh.b.j(fFloatValue, f11, f12);
                if (i12 > 0 && (i10 = i12 + 1) >= 0) {
                    float fAbs = fJ;
                    float f13 = fAbs;
                    int i16 = 0;
                    while (true) {
                        float fL = android.support.v4.media.session.b.L(aVar.f16305a, f12, i16 / i10);
                        float f14 = fL - fJ;
                        if (Math.abs(f14) <= fAbs) {
                            fAbs = Math.abs(f14);
                            f13 = fL;
                        }
                        if (i16 != i10) {
                            i16++;
                        } else {
                            fJ = f13;
                        }
                    }
                }
                if (fJ != f10) {
                    kVar.a(Float.valueOf(fJ));
                    if (aVar2 != null) {
                        aVar2.b();
                    }
                    z10 = true;
                }
                return Boolean.valueOf(z10);
        }
    }

    public /* synthetic */ g(oc.a aVar, int i10, float f10, ic.k kVar, ic.a aVar2) {
        this.f13008d = aVar;
        this.f13006b = i10;
        this.f13007c = f10;
        this.f13009e = kVar;
        this.f13010f = aVar2;
    }
}
