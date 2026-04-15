package fa;

import h1.e0;
import hf.y;
import ub.a0;
import x0.c0;
import x0.f0;
import x0.n2;
import x0.w0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements ic.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6976a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f6977b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ n2 f6978c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f6979d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f6980e;

    public /* synthetic */ d(int i10, y yVar, w0 w0Var, w0 w0Var2) {
        this.f6978c = w0Var;
        this.f6980e = yVar;
        this.f6977b = i10;
        this.f6979d = w0Var2;
    }

    @Override // ic.k
    public final Object a(Object obj) {
        switch (this.f6976a) {
            case 0:
                w0 w0Var = (w0) this.f6978c;
                y yVar = (y) this.f6980e;
                w0 w0Var2 = (w0) this.f6979d;
                jc.l.e((f0) obj, "$this$DisposableEffect");
                w0Var.setValue(Boolean.FALSE);
                return new h(this.f6977b, yVar, w0Var2, w0Var);
            default:
                c0 c0Var = (c0) this.f6978c;
                f1.h hVar = (f1.h) this.f6979d;
                o.f0 f0Var = (o.f0) this.f6980e;
                if (obj == c0Var) {
                    throw new IllegalStateException("A derived state calculation cannot read itself");
                }
                if (obj instanceof e0) {
                    int i10 = hVar.f6631a - this.f6977b;
                    int iD = f0Var.d(obj);
                    f0Var.h(Math.min(i10, iD >= 0 ? f0Var.f15955c[iD] : Integer.MAX_VALUE), obj);
                }
                return a0.f21526a;
        }
    }

    public /* synthetic */ d(c0 c0Var, f1.h hVar, o.f0 f0Var, int i10) {
        this.f6978c = c0Var;
        this.f6979d = hVar;
        this.f6980e = f0Var;
        this.f6977b = i10;
    }
}
