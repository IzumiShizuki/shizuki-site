package d;

import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c0 implements ic.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5188a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j0 f5189b;

    public /* synthetic */ c0(j0 j0Var, int i10) {
        this.f5188a = i10;
        this.f5189b = j0Var;
    }

    @Override // ic.k
    public final Object a(Object obj) {
        Object objPrevious;
        Object objPrevious2;
        c cVar = (c) obj;
        switch (this.f5188a) {
            case 0:
                jc.l.e(cVar, "backEvent");
                j0 j0Var = this.f5189b;
                vb.j jVar = j0Var.f5215b;
                ListIterator listIterator = jVar.listIterator(jVar.a());
                while (true) {
                    if (listIterator.hasPrevious()) {
                        objPrevious = listIterator.previous();
                        if (((b0) objPrevious).f5180a) {
                        }
                    } else {
                        objPrevious = null;
                    }
                }
                b0 b0Var = (b0) objPrevious;
                if (j0Var.f5216c != null) {
                    j0Var.b();
                }
                j0Var.f5216c = b0Var;
                if (b0Var != null) {
                    b0Var.d(cVar);
                }
                break;
            default:
                jc.l.e(cVar, "backEvent");
                j0 j0Var2 = this.f5189b;
                b0 b0Var2 = j0Var2.f5216c;
                if (b0Var2 == null) {
                    vb.j jVar2 = j0Var2.f5215b;
                    ListIterator listIterator2 = jVar2.listIterator(jVar2.a());
                    while (true) {
                        if (listIterator2.hasPrevious()) {
                            objPrevious2 = listIterator2.previous();
                            if (((b0) objPrevious2).f5180a) {
                            }
                        } else {
                            objPrevious2 = null;
                        }
                    }
                    b0Var2 = (b0) objPrevious2;
                }
                if (b0Var2 != null) {
                    b0Var2.c(cVar);
                }
                break;
        }
        return ub.a0.f21526a;
    }
}
