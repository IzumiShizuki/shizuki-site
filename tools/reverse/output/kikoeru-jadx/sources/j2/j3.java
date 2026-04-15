package j2;

import android.view.View;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class j3 implements androidx.lifecycle.v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ nf.d f9838a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v0 f9839b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ x0.t1 f9840c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ jc.y f9841d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ View f9842e;

    public j3(nf.d dVar, v0 v0Var, x0.t1 t1Var, jc.y yVar, View view) {
        this.f9838a = dVar;
        this.f9839b = v0Var;
        this.f9840c = t1Var;
        this.f9841d = yVar;
        this.f9842e = view;
    }

    @Override // androidx.lifecycle.v
    public final void i(androidx.lifecycle.x xVar, androidx.lifecycle.o oVar) {
        switch (i3.f9833a[oVar.ordinal()]) {
            case 1:
                hf.a0.y(this.f9838a, null, hf.z.f8619d, new cg.g(this.f9841d, this.f9840c, xVar, this, this.f9842e, null, 1), 1);
                return;
            case 2:
                v0 v0Var = this.f9839b;
                if (v0Var != null) {
                    b5.d0 d0Var = (b5.d0) v0Var.f10063c;
                    synchronized (d0Var.f1521b) {
                        try {
                            if (!d0Var.m()) {
                                ArrayList arrayList = (ArrayList) d0Var.f1522c;
                                d0Var.f1522c = (ArrayList) d0Var.f1523d;
                                d0Var.f1523d = arrayList;
                                d0Var.f1520a = true;
                                int size = arrayList.size();
                                for (int i10 = 0; i10 < size; i10++) {
                                    ((yb.c) arrayList.get(i10)).h(ub.a0.f21526a);
                                }
                                arrayList.clear();
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
                this.f9840c.K();
                return;
            case 3:
                this.f9840c.C();
                return;
            case 4:
                this.f9840c.x();
                return;
            case 5:
            case 6:
            case 7:
                return;
            default:
                throw new ce.j0();
        }
    }
}
