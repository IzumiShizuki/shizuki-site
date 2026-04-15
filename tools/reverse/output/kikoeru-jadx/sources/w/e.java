package w;

import hf.y;
import java.util.ArrayList;
import lf.o0;
import ub.a0;
import x0.w0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class e extends ac.i implements ic.n {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f22972e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f22973f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ k f22974g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ w0 f22975h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(k kVar, w0 w0Var, yb.c cVar, int i10) {
        super(2, cVar);
        this.f22972e = i10;
        this.f22974g = kVar;
        this.f22975h = w0Var;
    }

    @Override // ac.a
    public final yb.c o(Object obj, yb.c cVar) {
        switch (this.f22972e) {
            case 0:
                return new e(this.f22974g, this.f22975h, cVar, 0);
            default:
                return new e(this.f22974g, this.f22975h, cVar, 1);
        }
    }

    @Override // ic.n
    public final Object q(Object obj, Object obj2) {
        y yVar = (y) obj;
        yb.c cVar = (yb.c) obj2;
        switch (this.f22972e) {
        }
        return ((e) o(yVar, cVar)).u(a0.f21526a);
    }

    @Override // ac.a
    public final Object u(Object obj) throws Throwable {
        switch (this.f22972e) {
            case 0:
                int i10 = this.f22973f;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ub.a.f(obj);
                    return a0.f21526a;
                }
                ub.a.f(obj);
                ArrayList arrayList = new ArrayList();
                o0 o0Var = this.f22974g.f22978a;
                d dVar = new d(arrayList, this.f22975h, 0);
                this.f22973f = 1;
                o0Var.getClass();
                o0.m(o0Var, dVar, this);
                return zb.a.f26667a;
            default:
                int i11 = this.f22973f;
                if (i11 != 0) {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ub.a.f(obj);
                    return a0.f21526a;
                }
                ub.a.f(obj);
                ArrayList arrayList2 = new ArrayList();
                o0 o0Var2 = this.f22974g.f22978a;
                d dVar2 = new d(arrayList2, this.f22975h, 1);
                this.f22973f = 1;
                o0Var2.getClass();
                o0.m(o0Var2, dVar2, this);
                return zb.a.f26667a;
        }
    }
}
