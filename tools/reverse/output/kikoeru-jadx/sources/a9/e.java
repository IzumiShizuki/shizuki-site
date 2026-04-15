package a9;

import e7.a0;
import hf.y;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class e extends ac.i implements ic.n {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f224e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ a0 f225f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(a0 a0Var, yb.c cVar, int i10) {
        super(2, cVar);
        this.f224e = i10;
        this.f225f = a0Var;
    }

    @Override // ac.a
    public final yb.c o(Object obj, yb.c cVar) {
        switch (this.f224e) {
            case 0:
                return new e(this.f225f, cVar, 0);
            case 1:
                return new e(this.f225f, cVar, 1);
            default:
                return new e(this.f225f, cVar, 2);
        }
    }

    @Override // ic.n
    public final Object q(Object obj, Object obj2) {
        y yVar = (y) obj;
        yb.c cVar = (yb.c) obj2;
        switch (this.f224e) {
            case 0:
                e eVar = (e) o(yVar, cVar);
                ub.a0 a0Var = ub.a0.f21526a;
                eVar.u(a0Var);
                return a0Var;
            case 1:
                e eVar2 = (e) o(yVar, cVar);
                ub.a0 a0Var2 = ub.a0.f21526a;
                eVar2.u(a0Var2);
                return a0Var2;
            default:
                e eVar3 = (e) o(yVar, cVar);
                ub.a0 a0Var3 = ub.a0.f21526a;
                eVar3.u(a0Var3);
                return a0Var3;
        }
    }

    @Override // ac.a
    public final Object u(Object obj) {
        int i10 = this.f224e;
        ub.a0 a0Var = ub.a0.f21526a;
        a0 a0Var2 = this.f225f;
        switch (i10) {
            case 0:
                ub.a.f(obj);
                a0Var2.c();
                a0.b(a0Var2, "MainScreen");
                break;
            case 1:
                ub.a.f(obj);
                u.f266d = new WeakReference(a0Var2);
                break;
            default:
                ub.a.f(obj);
                r9.f.f18982f = new WeakReference(a0Var2);
                break;
        }
        return a0Var;
    }
}
