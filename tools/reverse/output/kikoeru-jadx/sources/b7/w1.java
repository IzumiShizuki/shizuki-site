package b7;

import android.os.RemoteException;
import com.cnl.kikoeru.MainService;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class w1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2164a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c2 f2165b;

    public /* synthetic */ w1(c2 c2Var, int i10) {
        this.f2164a = i10;
        this.f2165b = c2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2164a) {
            case 0:
                c2 c2Var = this.f2165b;
                a2 a2Var = c2Var.f1695v;
                if (a2Var != null) {
                    z3 z3Var = c2Var.f1693t;
                    z3Var.r0();
                    ((v4.v) z3Var.f2227a).U1(new m4.r(z3Var, a2Var));
                    return;
                }
                return;
            case 1:
                c2 c2Var2 = this.f2165b;
                b0.c1 c1Var = c2Var2.f1696w;
                if (c1Var != null) {
                    ((MainService) c1Var.f1208b).i(c2Var2.f1684k, false);
                    return;
                }
                return;
            case 2:
                c2 c2Var3 = this.f2165b;
                synchronized (c2Var3.f1674a) {
                    try {
                        if (c2Var3.f1698y) {
                            return;
                        }
                        final h4 h4VarG = c2Var3.f1693t.g();
                        if (!c2Var3.f1676c.hasMessages(1) && s3.d(h4VarG, c2Var3.f1692s.f2136c)) {
                            b0.w1 w1Var = c2Var3.f1680g.f2047g;
                            ya.i0 i0VarL = w1Var.L();
                            for (int i10 = 0; i10 < i0VarL.size(); i10++) {
                                final t1 t1Var = (t1) i0VarL.get(i10);
                                final boolean zT = w1Var.T(t1Var, 16);
                                final boolean zT2 = w1Var.T(t1Var, 17);
                                c2Var3.b(t1Var, new b2() { // from class: b7.x1
                                    @Override // b7.b2
                                    public final void b(s1 s1Var, int i11) {
                                        s1Var.i(i11, h4VarG, zT, zT2, t1Var.f2097c);
                                    }
                                });
                            }
                            try {
                                c2Var3.f1681h.f2010i.i(0, h4VarG, true, true, 0);
                            } catch (RemoteException e10) {
                                p4.c.o("MediaSessionImpl", "Exception in using media1 API", e10);
                            }
                            break;
                        }
                        c2Var3.s();
                        return;
                    } finally {
                    }
                }
            default:
                this.f2165b.s();
                return;
        }
    }
}
