package b7;

import android.util.SparseBooleanArray;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class n1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1991a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1992b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1993c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f1994d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f1995e;

    public /* synthetic */ n1(int i10, int i11, Object obj, Object obj2, Object obj3) {
        this.f1991a = i11;
        this.f1993c = obj;
        this.f1992b = i10;
        this.f1994d = obj2;
        this.f1995e = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1991a) {
            case 0:
                p1 p1Var = (p1) this.f1993c;
                v1 v1Var = (v1) this.f1994d;
                m mVar = (m) this.f1995e;
                if (this.f1992b == p1Var.f2029h) {
                    p1Var.d(v1Var, mVar, p1Var.c(v1Var, false));
                }
                break;
            default:
                ah.j jVar = (ah.j) this.f1993c;
                List list = (List) this.f1994d;
                t1 t1Var = (t1) this.f1995e;
                c2 c2Var = ((o2) jVar.f392d).f2008g;
                int i10 = this.f1992b;
                if (i10 == -1) {
                    c2Var.f1693t.b(list);
                } else {
                    c2Var.f1693t.a(i10, list);
                }
                new SparseBooleanArray().append(20, true);
                c2Var.o(t1Var);
                break;
        }
    }
}
