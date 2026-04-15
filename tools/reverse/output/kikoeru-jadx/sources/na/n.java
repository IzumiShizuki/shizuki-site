package na;

import android.content.Intent;
import com.cnl.kikoeru.R;
import x0.w0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class n extends ac.i implements ic.k {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f15724e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f15725f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ w0 f15726g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ e.h f15727h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(w0 w0Var, e.h hVar, yb.c cVar, int i10) {
        super(1, cVar);
        this.f15724e = i10;
        this.f15726g = w0Var;
        this.f15727h = hVar;
    }

    @Override // ic.k
    public final Object a(Object obj) {
        yb.c cVar = (yb.c) obj;
        switch (this.f15724e) {
            case 0:
                return new n(this.f15726g, this.f15727h, cVar, 0).u(ub.a0.f21526a);
            default:
                return new n(this.f15726g, this.f15727h, cVar, 1).u(ub.a0.f21526a);
        }
    }

    @Override // ac.a
    public final Object u(Object obj) {
        Object objB;
        Object objB2;
        switch (this.f15724e) {
            case 0:
                int i10 = this.f15725f;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ub.a.f(obj);
                    return obj;
                }
                ub.a.f(obj);
                e.h hVar = this.f15727h;
                this.f15725f = 1;
                hf.k kVar = new hf.k(1, ud.s.p(this));
                kVar.r();
                w0 w0Var = this.f15726g;
                w0Var.setValue(kVar);
                try {
                    hVar.W(new Intent("android.intent.action.OPEN_DOCUMENT_TREE"));
                    objB = ub.a0.f21526a;
                    break;
                } catch (Throwable th2) {
                    objB = ub.a.b(th2);
                }
                Throwable thA = ub.n.a(objB);
                if (thA != null) {
                    ka.n.c(q.g(R.string.open_document_failed), 0L, null, null, 511);
                    hf.j jVar = (hf.j) w0Var.getValue();
                    if (jVar != null) {
                        jVar.t(thA);
                    }
                }
                Object objQ = kVar.q();
                zb.a aVar = zb.a.f26667a;
                return objQ == aVar ? aVar : objQ;
            default:
                int i11 = this.f15725f;
                if (i11 != 0) {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ub.a.f(obj);
                    return obj;
                }
                ub.a.f(obj);
                e.h hVar2 = this.f15727h;
                this.f15725f = 1;
                hf.k kVar2 = new hf.k(1, ud.s.p(this));
                kVar2.r();
                w0 w0Var2 = this.f15726g;
                w0Var2.setValue(kVar2);
                try {
                    hVar2.W("*/*");
                    objB2 = ub.a0.f21526a;
                    break;
                } catch (Throwable th3) {
                    objB2 = ub.a.b(th3);
                }
                Throwable thA2 = ub.n.a(objB2);
                if (thA2 != null) {
                    ka.n.c(q.g(R.string.open_document_failed), 0L, null, null, 511);
                    hf.j jVar2 = (hf.j) w0Var2.getValue();
                    if (jVar2 != null) {
                        jVar2.t(thA2);
                    }
                }
                Object objQ2 = kVar2.q();
                zb.a aVar2 = zb.a.f26667a;
                return objQ2 == aVar2 ? aVar2 : objQ2;
        }
    }
}
