package a0;

import c7.e1;
import g2.f1;
import i2.l0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import q.t0;
import r.y1;
import x0.w0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class s extends jc.m implements ic.k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f109b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f110c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f111d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f112e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f113f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(ic.a aVar, boolean z10, q1.f fVar, q1.k kVar) {
        super(1);
        this.f111d = aVar;
        this.f110c = z10;
        this.f112e = fVar;
        this.f113f = kVar;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.util.List] */
    @Override // ic.k
    public final Object a(Object obj) {
        switch (this.f109b) {
            case 0:
                f1 f1Var = (f1) obj;
                ArrayList arrayList = (ArrayList) this.f112e;
                f1Var.f7178a = true;
                int size = arrayList.size();
                int i10 = 0;
                while (true) {
                    boolean z10 = this.f110c;
                    if (i10 >= size) {
                        ?? r0 = this.f113f;
                        int size2 = ((Collection) r0).size();
                        for (int i11 = 0; i11 < size2; i11++) {
                            ((u) r0.get(i11)).a(f1Var, z10);
                        }
                        f1Var.f7178a = false;
                        ((w0) this.f111d).getValue();
                        return ub.a0.f21526a;
                    }
                    ((u) arrayList.get(i10)).a(f1Var, z10);
                    i10++;
                }
                break;
            default:
                q1.k kVar = (q1.k) this.f113f;
                q1.f fVar = (q1.f) this.f112e;
                l0 l0Var = (l0) obj;
                l0Var.b();
                s1.b bVar = l0Var.f8782a;
                if (((Boolean) ((ic.a) this.f111d).b()).booleanValue()) {
                    if (this.f110c) {
                        long jC0 = bVar.c0();
                        e1 e1Var = bVar.f19346b;
                        long jD = e1Var.D();
                        e1Var.z().f();
                        try {
                            ((y1) e1Var.f3618b).g0(-1.0f, 1.0f, jC0);
                            bVar.f(fVar, kVar);
                        } finally {
                            t0.L(e1Var, jD);
                        }
                    } else {
                        bVar.f(fVar, kVar);
                    }
                }
                return ub.a0.f21526a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(w0 w0Var, ArrayList arrayList, List list, boolean z10) {
        super(1);
        this.f111d = w0Var;
        this.f112e = arrayList;
        this.f113f = list;
        this.f110c = z10;
    }
}
