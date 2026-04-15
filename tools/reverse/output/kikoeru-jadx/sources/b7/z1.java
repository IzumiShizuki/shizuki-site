package b7;

import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class z1 extends Handler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f2222a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f2223b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c2 f2224c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z1(c2 c2Var, Looper looper) {
        super(looper);
        this.f2224c = c2Var;
        this.f2222a = true;
        this.f2223b = true;
    }

    public final void a(boolean z10, boolean z11) {
        boolean z12 = false;
        this.f2222a = this.f2222a && z10;
        if (this.f2223b && z11) {
            z12 = true;
        }
        this.f2223b = z12;
        if (hasMessages(1)) {
            return;
        }
        sendEmptyMessage(1);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int iJ;
        c2 c2Var = this.f2224c;
        q3 q3Var = c2Var.f1680g;
        if (message.what != 1) {
            throw new IllegalStateException("Invalid message what=" + message.what);
        }
        v3 v3VarG = c2Var.f1692s.g(c2Var.f1693t.y(), c2Var.f1693t.g(), c2Var.f1692s.f2144k);
        c2Var.f1692s = v3VarG;
        boolean z10 = this.f2222a;
        boolean z11 = this.f2223b;
        v3 v3VarC0 = q3Var.C0(v3VarG);
        b0.w1 w1Var = q3Var.f2047g;
        ya.i0 i0VarL = w1Var.L();
        for (int i10 = 0; i10 < i0VarL.size(); i10++) {
            t1 t1Var = (t1) i0VarL.get(i10);
            try {
                d4 d4VarO = w1Var.O(t1Var);
                if (d4VarO != null) {
                    iJ = d4VarO.j();
                } else if (!(q3Var.f2047g.S(t1Var) || c2Var.f1681h.f2007f.S(t1Var))) {
                    break;
                } else {
                    iJ = 0;
                }
                m4.u0 u0VarG = s3.g(w1Var.G(t1Var), c2Var.f1693t.m());
                s1 s1Var = t1Var.f2098d;
                p4.c.j(s1Var);
                s1Var.c(iJ, v3VarC0, u0VarG, z10, z11);
            } catch (DeadObjectException unused) {
                q3Var.f2047g.a0(t1Var);
            } catch (RemoteException e10) {
                p4.c.C("MediaSessionImpl", "Exception in " + t1Var.toString(), e10);
            }
        }
        this.f2222a = true;
        this.f2223b = true;
    }
}
