package b7;

import android.graphics.Bitmap;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class o implements cb.s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1996a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m3.c f1997b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g1 f1998c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f1999d;

    public /* synthetic */ o(m3.c cVar, g1 g1Var, int i10) {
        this.f1996a = i10;
        this.f1997b = cVar;
        this.f1998c = g1Var;
    }

    @Override // cb.s
    public final void d(Object obj) {
        switch (this.f1996a) {
            case 0:
                Bitmap bitmap = (Bitmap) obj;
                if (!this.f1999d) {
                    m3.c cVar = this.f1997b;
                    cVar.d(bitmap);
                    m mVar = new m(1001, cVar.a());
                    g1 g1Var = this.f1998c;
                    p1 p1Var = (p1) g1Var.f1782b;
                    p1Var.f2026e.execute(new n1(g1Var.f1781a, 0, p1Var, (v1) g1Var.f1783c, mVar));
                }
                break;
            default:
                Bitmap bitmap2 = (Bitmap) obj;
                if (!this.f1999d) {
                    m3.c cVar2 = this.f1997b;
                    cVar2.d(bitmap2);
                    m mVar2 = new m(666, cVar2.a());
                    g1 g1Var2 = this.f1998c;
                    p1 p1Var2 = (p1) g1Var2.f1782b;
                    p1Var2.f2026e.execute(new n1(g1Var2.f1781a, 0, p1Var2, (v1) g1Var2.f1783c, mVar2));
                }
                break;
        }
    }

    @Override // cb.s
    public final void g(Throwable th2) {
        switch (this.f1996a) {
            case 0:
                if (!this.f1999d) {
                    p4.c.B("NotificationProvider", "Failed to load bitmap: " + th2.getMessage());
                }
                break;
            default:
                if (!this.f1999d) {
                    p4.c.B("NotificationProvider", "Failed to load bitmap: " + th2.getMessage());
                }
                break;
        }
    }
}
