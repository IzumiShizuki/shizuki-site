package cg;

import android.app.Activity;
import android.os.Build;
import android.view.Window;
import r.y1;
import u3.a1;
import u3.x0;
import u3.y0;
import u3.z0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class t extends ac.i implements ic.n {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f4108e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f4109f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f4110g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t(Object obj, boolean z10, yb.c cVar, int i10) {
        super(2, cVar);
        this.f4108e = i10;
        this.f4110g = obj;
        this.f4109f = z10;
    }

    @Override // ac.a
    public final yb.c o(Object obj, yb.c cVar) {
        switch (this.f4108e) {
            case 0:
                return new t(this.f4109f, (v) this.f4110g, cVar);
            case 1:
                return new t((e.k) this.f4110g, this.f4109f, cVar, 1);
            case 2:
                return new t((Activity) this.f4110g, this.f4109f, cVar, 2);
            default:
                t tVar = new t(this.f4109f, cVar);
                tVar.f4110g = obj;
                return tVar;
        }
    }

    @Override // ic.n
    public final Object q(Object obj, Object obj2) {
        hf.y yVar = (hf.y) obj;
        yb.c cVar = (yb.c) obj2;
        switch (this.f4108e) {
            case 0:
                t tVar = (t) o(yVar, cVar);
                ub.a0 a0Var = ub.a0.f21526a;
                tVar.u(a0Var);
                return a0Var;
            case 1:
                t tVar2 = (t) o(yVar, cVar);
                ub.a0 a0Var2 = ub.a0.f21526a;
                tVar2.u(a0Var2);
                return a0Var2;
            case 2:
                t tVar3 = (t) o(yVar, cVar);
                ub.a0 a0Var3 = ub.a0.f21526a;
                tVar3.u(a0Var3);
                return a0Var3;
            default:
                t tVar4 = (t) o(yVar, cVar);
                ub.a0 a0Var4 = ub.a0.f21526a;
                tVar4.u(a0Var4);
                return a0Var4;
        }
    }

    /* JADX WARN: Type inference failed for: r5v7, types: [ic.a, jc.j] */
    @Override // ac.a
    public final Object u(Object obj) {
        b7.n nVar;
        Object objB;
        switch (this.f4108e) {
            case 0:
                v vVar = (v) this.f4110g;
                ub.a.f(obj);
                if (this.f4109f) {
                    vVar.f4115d.setValue(o.f4086b);
                    vVar.X();
                } else {
                    vVar.f4115d.setValue(o.f4085a);
                    vVar.X();
                }
                return ub.a0.f21526a;
            case 1:
                ub.a.f(obj);
                e.k kVar = (e.k) this.f4110g;
                boolean z10 = this.f4109f;
                if (!z10 && !kVar.f6037g && kVar.f5180a && (nVar = kVar.f6036f) != null) {
                    nVar.c();
                }
                kVar.f5180a = z10;
                ?? r52 = kVar.f5182c;
                if (r52 != 0) {
                    r52.b();
                }
                return ub.a0.f21526a;
            case 2:
                ub.a.f(obj);
                Activity activity = (Activity) this.f4110g;
                Window window = activity.getWindow();
                long j10 = q1.q.f17574g;
                window.setNavigationBarColor(q1.h0.B(j10));
                activity.getWindow().setStatusBarColor(q1.h0.B(j10));
                Window window2 = activity.getWindow();
                y1 y1Var = new y1(activity.getWindow().getDecorView());
                int i10 = Build.VERSION.SDK_INT;
                x0 a1Var = i10 >= 35 ? new a1(window2, y1Var, 1) : i10 >= 30 ? new x0(window2, y1Var, 1) : i10 >= 26 ? new z0(window2, y1Var, 0) : i10 >= 23 ? new y0(window2, y1Var, 0) : new x0(window2, y1Var, 0);
                boolean z11 = this.f4109f;
                a1Var.C(z11);
                a1Var.A(z11);
                return ub.a0.f21526a;
            default:
                ub.a0 a0Var = ub.a0.f21526a;
                ub.a.f(obj);
                try {
                    na.v.a(na.v.f15761a, this.f4109f);
                    objB = a0Var;
                } catch (Throwable th2) {
                    objB = ub.a.b(th2);
                }
                Throwable thA = ub.n.a(objB);
                if (thA != null) {
                    thA.printStackTrace();
                }
                return a0Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(boolean z10, v vVar, yb.c cVar) {
        super(2, cVar);
        this.f4108e = 0;
        this.f4109f = z10;
        this.f4110g = vVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(boolean z10, yb.c cVar) {
        super(2, cVar);
        this.f4108e = 3;
        this.f4109f = z10;
    }
}
