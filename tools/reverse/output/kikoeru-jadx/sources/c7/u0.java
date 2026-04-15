package c7;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class u0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f3732c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public b5.d f3734e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f3730a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t0 f3731b = new t0(this);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public WeakReference f3733d = new WeakReference(null);

    public final void C(w0 w0Var, Handler handler) {
        synchronized (this.f3730a) {
            try {
                this.f3733d = new WeakReference(w0Var);
                b5.d dVar = this.f3734e;
                b5.d dVar2 = null;
                if (dVar != null) {
                    dVar.removeCallbacksAndMessages(null);
                }
                if (w0Var != null && handler != null) {
                    dVar2 = new b5.d(this, handler.getLooper(), 4);
                }
                this.f3734e = dVar2;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void a(w0 w0Var, Handler handler) {
        if (this.f3732c) {
            this.f3732c = false;
            handler.removeMessages(1);
            p1 p1VarD = w0Var.d();
            long j10 = p1VarD == null ? 0L : p1VarD.f3691e;
            boolean z10 = p1VarD != null && p1VarD.f3687a == 3;
            boolean z11 = (516 & j10) != 0;
            boolean z12 = (j10 & 514) != 0;
            if (z10 && z12) {
                h();
            } else {
                if (z10 || !z11) {
                    return;
                }
                i();
            }
        }
    }

    public boolean g(Intent intent) {
        w0 w0Var;
        b5.d dVar;
        KeyEvent keyEvent;
        if (Build.VERSION.SDK_INT < 27) {
            synchronized (this.f3730a) {
                w0Var = (w0) this.f3733d.get();
                dVar = this.f3734e;
            }
            if (w0Var != null && dVar != null && (keyEvent = (KeyEvent) intent.getParcelableExtra("android.intent.extra.KEY_EVENT")) != null && keyEvent.getAction() == 0) {
                k1 k1VarC = w0Var.c();
                int keyCode = keyEvent.getKeyCode();
                if (keyCode != 79 && keyCode != 85) {
                    a(w0Var, dVar);
                    return false;
                }
                if (keyEvent.getRepeatCount() != 0) {
                    a(w0Var, dVar);
                    return true;
                }
                if (!this.f3732c) {
                    this.f3732c = true;
                    dVar.sendMessageDelayed(dVar.obtainMessage(1, k1VarC), ViewConfiguration.getDoubleTapTimeout());
                    return true;
                }
                dVar.removeMessages(1);
                this.f3732c = false;
                p1 p1VarD = w0Var.d();
                if (((p1VarD == null ? 0L : p1VarD.f3691e) & 32) != 0) {
                    y();
                }
                return true;
            }
        }
        return false;
    }

    public void B() {
    }

    public void f() {
    }

    public void h() {
    }

    public void i() {
    }

    public void m() {
    }

    public void r() {
    }

    public void y() {
    }

    public void z() {
    }

    public void A(long j10) {
    }

    public void b(q0 q0Var) {
    }

    public void q(q0 q0Var) {
    }

    public void s(long j10) {
    }

    public void t(float f10) {
    }

    public void u(q1 q1Var) {
    }

    public void v(q1 q1Var) {
    }

    public void w(int i10) {
    }

    public void x(int i10) {
    }

    public void c(q0 q0Var, int i10) {
    }

    public void e(String str, Bundle bundle) {
    }

    public void j(String str, Bundle bundle) {
    }

    public void k(String str, Bundle bundle) {
    }

    public void l(Uri uri, Bundle bundle) {
    }

    public void n(String str, Bundle bundle) {
    }

    public void o(String str, Bundle bundle) {
    }

    public void p(Uri uri, Bundle bundle) {
    }

    public void d(String str, Bundle bundle, ResultReceiver resultReceiver) {
    }
}
