package m0;

import android.view.KeyEvent;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class p6 implements ic.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f13458a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ oc.a f13459b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f13460c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x0.w0 f13461d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f13462e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f13463f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ x0.w0 f13464g;

    public p6(boolean z10, oc.a aVar, int i10, x0.w0 w0Var, float f10, boolean z11, x0.w0 w0Var2) {
        this.f13458a = z10;
        this.f13459b = aVar;
        this.f13460c = i10;
        this.f13461d = w0Var;
        this.f13462e = f10;
        this.f13463f = z11;
        this.f13464g = w0Var2;
    }

    @Override // ic.k
    public final Object a(Object obj) {
        KeyEvent keyEvent = ((a2.b) obj).f188a;
        oc.a aVar = this.f13459b;
        float f10 = aVar.f16306b;
        if (!this.f13458a) {
            return Boolean.FALSE;
        }
        int iO = a2.c.O(keyEvent);
        boolean z10 = false;
        if (iO == 2) {
            float f11 = aVar.f16305a;
            float fAbs = Math.abs(f10 - f11);
            int i10 = this.f13460c;
            float f12 = fAbs / (i10 > 0 ? i10 + 1 : 100);
            long jE = g8.a.e(keyEvent.getKeyCode());
            boolean zA = a2.a.a(jE, a2.a.f173d);
            float f13 = this.f13462e;
            x0.w0 w0Var = this.f13461d;
            if (zA) {
                ((ic.k) w0Var.getValue()).a(nh.b.m(Float.valueOf(f13 + f12), aVar));
            } else if (a2.a.a(jE, a2.a.f174e)) {
                ((ic.k) w0Var.getValue()).a(nh.b.m(Float.valueOf(f13 - f12), aVar));
            } else {
                boolean zA2 = a2.a.a(jE, a2.a.f176g);
                boolean z11 = this.f13463f;
                if (zA2) {
                    ((ic.k) w0Var.getValue()).a(nh.b.m(Float.valueOf(((z11 ? -1 : 1) * f12) + f13), aVar));
                } else if (a2.a.a(jE, a2.a.f175f)) {
                    ((ic.k) w0Var.getValue()).a(nh.b.m(Float.valueOf(f13 - ((z11 ? -1 : 1) * f12)), aVar));
                } else if (a2.a.a(jE, a2.a.f182m)) {
                    ((ic.k) w0Var.getValue()).a(Float.valueOf(f11));
                } else if (a2.a.a(jE, a2.a.f183n)) {
                    ((ic.k) w0Var.getValue()).a(Float.valueOf(f10));
                } else if (a2.a.a(jE, a2.a.f184o)) {
                    ((ic.k) w0Var.getValue()).a(nh.b.m(Float.valueOf(f13 - (nh.b.k(r7 / 10, 1, 10) * f12)), aVar));
                } else if (a2.a.a(jE, a2.a.f185p)) {
                    ((ic.k) w0Var.getValue()).a(nh.b.m(Float.valueOf((nh.b.k(r7 / 10, 1, 10) * f12) + f13), aVar));
                }
            }
            z10 = true;
        } else if (iO == 1) {
            long jE2 = g8.a.e(keyEvent.getKeyCode());
            if (a2.a.a(jE2, a2.a.f173d) || a2.a.a(jE2, a2.a.f174e) || a2.a.a(jE2, a2.a.f176g) || a2.a.a(jE2, a2.a.f175f) || a2.a.a(jE2, a2.a.f182m) || a2.a.a(jE2, a2.a.f183n) || a2.a.a(jE2, a2.a.f184o) || a2.a.a(jE2, a2.a.f185p)) {
                ic.a aVar2 = (ic.a) this.f13464g.getValue();
                if (aVar2 != null) {
                    aVar2.b();
                }
                z10 = true;
            }
        }
        return Boolean.valueOf(z10);
    }
}
