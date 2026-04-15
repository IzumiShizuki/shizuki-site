package b7;

import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class a1 implements IBinder.DeathRecipient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c7.h0 f1618a = new c7.h0(this);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public b5.b f1619b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public c7.i0 f1620c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Handler f1621d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ d1 f1622e;

    public a1(d1 d1Var, Looper looper) {
        this.f1622e = d1Var;
        this.f1621d = new Handler(looper, new androidx.media3.exoplayer.offline.f(2, this));
    }

    public final void a(c7.l0 l0Var) {
        d1 d1Var = this.f1622e;
        c1 c1Var = d1Var.f1723m;
        d1Var.f1723m = new c1(l0Var, c1Var.f1667b, c1Var.f1668c, c1Var.f1669d, c1Var.f1670e, c1Var.f1671f, c1Var.f1672g, c1Var.f1673h);
        k();
    }

    public final void b(boolean z10) {
        d0 d0Var = this.f1622e.f1712b;
        d0Var.getClass();
        p4.c.i(Looper.myLooper() == d0Var.f1707d.getLooper());
        b0 b0Var = d0Var.f1706c;
        Bundle bundle = new Bundle();
        bundle.putBoolean("androidx.media3.session.ARGUMENT_CAPTIONING_ENABLED", z10);
        b0Var.v(d0Var, new e4("androidx.media3.session.SESSION_COMMAND_ON_CAPTIONING_ENABLED_CHANGED", Bundle.EMPTY), bundle);
    }

    @Override // android.os.IBinder.DeathRecipient
    public final void binderDied() {
        i(8, null, null);
    }

    public final void c(Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        Bundle bundle2 = bundle;
        d1 d1Var = this.f1622e;
        c1 c1Var = d1Var.f1723m;
        d1Var.f1723m = new c1(c1Var.f1666a, c1Var.f1667b, c1Var.f1668c, c1Var.f1669d, c1Var.f1670e, c1Var.f1671f, c1Var.f1672g, bundle2);
        d1Var.f1724n = true;
        k();
    }

    public final void d(c7.r0 r0Var) {
        d1 d1Var = this.f1622e;
        c1 c1Var = d1Var.f1723m;
        d1Var.f1723m = new c1(c1Var.f1666a, c1Var.f1667b, r0Var, c1Var.f1669d, c1Var.f1670e, c1Var.f1671f, c1Var.f1672g, c1Var.f1673h);
        k();
    }

    public final void e(c7.p1 p1Var) {
        d1 d1Var = this.f1622e;
        c1 c1Var = d1Var.f1723m;
        d1Var.f1723m = new c1(c1Var.f1666a, d1.d(p1Var), c1Var.f1668c, c1Var.f1669d, c1Var.f1670e, c1Var.f1671f, c1Var.f1672g, c1Var.f1673h);
        k();
    }

    public final void f(List list) {
        d1 d1Var = this.f1622e;
        c1 c1Var = d1Var.f1723m;
        d1Var.f1723m = new c1(c1Var.f1666a, c1Var.f1667b, c1Var.f1668c, d1.b(list), c1Var.f1670e, c1Var.f1671f, c1Var.f1672g, c1Var.f1673h);
        k();
    }

    public final void g(CharSequence charSequence) {
        d1 d1Var = this.f1622e;
        c1 c1Var = d1Var.f1723m;
        d1Var.f1723m = new c1(c1Var.f1666a, c1Var.f1667b, c1Var.f1668c, c1Var.f1669d, charSequence, c1Var.f1671f, c1Var.f1672g, c1Var.f1673h);
        k();
    }

    public final void h(String str, Bundle bundle) {
        d0 d0Var = this.f1622e.f1712b;
        if (str == null) {
            return;
        }
        d0Var.getClass();
        p4.c.i(Looper.myLooper() == d0Var.f1707d.getLooper());
        b0 b0Var = d0Var.f1706c;
        Bundle bundle2 = Bundle.EMPTY;
        e4 e4Var = new e4(str, bundle2);
        if (bundle == null) {
            bundle = bundle2;
        }
        b0Var.v(d0Var, e4Var, bundle);
    }

    public final void i(int i10, Object obj, Bundle bundle) {
        b5.b bVar = this.f1619b;
        if (bVar != null) {
            Message messageObtainMessage = bVar.obtainMessage(i10, obj);
            if (bundle != null) {
                messageObtainMessage.setData(bundle);
            }
            messageObtainMessage.sendToTarget();
        }
    }

    public final void j(Handler handler) {
        if (handler != null) {
            b5.b bVar = new b5.b(this, handler.getLooper());
            this.f1619b = bVar;
            bVar.f1508b = true;
        } else {
            b5.b bVar2 = this.f1619b;
            if (bVar2 != null) {
                bVar2.f1508b = false;
                bVar2.removeCallbacksAndMessages(null);
                this.f1619b = null;
            }
        }
    }

    public final void k() {
        Handler handler = this.f1621d;
        if (handler.hasMessages(1)) {
            return;
        }
        handler.sendEmptyMessageDelayed(1, 500L);
    }
}
