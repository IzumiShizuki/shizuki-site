package b7;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class d0 implements m4.y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f1704a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c0 f1705b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b0 f1706c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Handler f1707d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f1708e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f1709f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final f0 f1710g;

    public d0(Context context, k4 k4Var, Bundle bundle, b0 b0Var, Looper looper, f0 f0Var, androidx.media3.exoplayer.offline.u uVar) {
        d0 d0Var;
        c0 t0Var;
        p4.c.g(k4Var, "token must not be null");
        p4.c.s("MediaController", "Init " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.6.0-alpha01] [" + p4.c0.f16552e + "]");
        new m4.h1();
        this.f1708e = -9223372036854775807L;
        this.f1706c = b0Var;
        this.f1707d = new Handler(looper);
        this.f1710g = f0Var;
        if (k4Var.f1919a.i()) {
            uVar.getClass();
            t0Var = new d1(context, this, k4Var, bundle, looper, uVar);
            d0Var = this;
        } else {
            d0Var = this;
            t0Var = new t0(context, d0Var, k4Var, bundle, looper);
        }
        d0Var.f1705b = t0Var;
        t0Var.Q();
    }

    @Override // m4.y0
    public final void A0(List list) {
        f();
        p4.c.g(list, "mediaItems must not be null");
        for (int i10 = 0; i10 < list.size(); i10++) {
            p4.c.b("items must not contain null, index=" + i10, list.get(i10) != null);
        }
        c0 c0Var = this.f1705b;
        if (c0Var.T()) {
            c0Var.V(list);
        } else {
            p4.c.B("MediaController", "The controller is not connected. Ignoring setMediaItems().");
        }
    }

    @Override // m4.y0
    public final m4.r0 B() {
        f();
        c0 c0Var = this.f1705b;
        if (c0Var.T()) {
            return c0Var.B();
        }
        return null;
    }

    @Override // m4.y0
    public final boolean B0(int i10) {
        f();
        c0 c0Var = this.f1705b;
        return (!c0Var.T() ? m4.u0.f14591b : c0Var.N()).a(i10);
    }

    @Override // m4.y0
    public final long C() {
        f();
        c0 c0Var = this.f1705b;
        if (c0Var.T()) {
            return c0Var.C();
        }
        return 0L;
    }

    @Override // m4.y0
    public final m4.q1 D() {
        f();
        c0 c0Var = this.f1705b;
        return c0Var.T() ? c0Var.D() : m4.q1.f14559b;
    }

    @Override // m4.y0
    public final int F() {
        f();
        c0 c0Var = this.f1705b;
        if (c0Var.T()) {
            return c0Var.F();
        }
        return -1;
    }

    @Override // m4.y0
    public final int G() {
        f();
        c0 c0Var = this.f1705b;
        if (c0Var.T()) {
            return c0Var.G();
        }
        return -1;
    }

    @Override // m4.y0
    public final int H() {
        f();
        c0 c0Var = this.f1705b;
        if (c0Var.T()) {
            return c0Var.H();
        }
        return 0;
    }

    @Override // m4.y0
    public final m4.i1 J() {
        f();
        c0 c0Var = this.f1705b;
        return c0Var.T() ? c0Var.J() : m4.i1.f14291a;
    }

    @Override // m4.y0
    public final void K(int i10, long j10, List list) {
        f();
        p4.c.g(list, "mediaItems must not be null");
        for (int i11 = 0; i11 < list.size(); i11++) {
            p4.c.b("items must not contain null, index=" + i11, list.get(i11) != null);
        }
        c0 c0Var = this.f1705b;
        if (c0Var.T()) {
            c0Var.K(i10, j10, list);
        } else {
            p4.c.B("MediaController", "The controller is not connected. Ignoring setMediaItems().");
        }
    }

    @Override // m4.y0
    public final long M() {
        f();
        c0 c0Var = this.f1705b;
        if (c0Var.T()) {
            return c0Var.M();
        }
        return 0L;
    }

    public final void a() {
        p4.c.i(Looper.myLooper() == this.f1707d.getLooper());
        p4.c.i(!this.f1709f);
        this.f1709f = true;
        f0 f0Var = this.f1710g;
        f0Var.f1771j = true;
        d0 d0Var = f0Var.f1770i;
        if (d0Var != null) {
            f0Var.k(d0Var);
        }
    }

    public final void b(p4.g gVar) {
        p4.c.i(Looper.myLooper() == this.f1707d.getLooper());
        gVar.accept(this.f1706c);
    }

    @Override // m4.y0
    public final void c() {
        f();
        c0 c0Var = this.f1705b;
        if (c0Var.T()) {
            c0Var.c();
        } else {
            p4.c.B("MediaController", "The controller is not connected. Ignoring prepare().");
        }
    }

    public final void d() {
        f();
        if (this.f1704a) {
            return;
        }
        p4.c.s("MediaController", "Release " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.6.0-alpha01] [" + p4.c0.f16552e + "] [" + m4.j0.b() + "]");
        this.f1704a = true;
        Handler handler = this.f1707d;
        handler.removeCallbacksAndMessages(null);
        try {
            this.f1705b.a();
        } catch (Exception e10) {
            p4.c.m("MediaController", "Exception while releasing impl", e10);
        }
        if (this.f1709f) {
            p4.c.i(Looper.myLooper() == handler.getLooper());
            this.f1706c.a();
        } else {
            this.f1709f = true;
            f0 f0Var = this.f1710g;
            f0Var.getClass();
            f0Var.l(new SecurityException("Session rejected the connection request."));
        }
    }

    public final void e(Runnable runnable) {
        p4.c0.R(this.f1707d, runnable);
    }

    public final void f() {
        p4.c.h("MediaController method is called from a wrong thread. See javadoc of MediaController for details.", Looper.myLooper() == this.f1707d.getLooper());
    }

    @Override // m4.y0
    public final int i() {
        f();
        c0 c0Var = this.f1705b;
        if (c0Var.T()) {
            return c0Var.i();
        }
        return 1;
    }

    @Override // m4.y0
    public final void k() {
        f();
        c0 c0Var = this.f1705b;
        if (c0Var.T()) {
            c0Var.k();
        } else {
            p4.c.B("MediaController", "The controller is not connected. Ignoring play().");
        }
    }

    @Override // m4.y0
    public final boolean o() {
        f();
        c0 c0Var = this.f1705b;
        return c0Var.T() && c0Var.o();
    }

    @Override // m4.y0
    public final long q() {
        f();
        c0 c0Var = this.f1705b;
        if (c0Var.T()) {
            return c0Var.q();
        }
        return 0L;
    }

    @Override // m4.y0
    public final boolean r() {
        f();
        c0 c0Var = this.f1705b;
        return c0Var.T() && c0Var.r();
    }

    @Override // m4.y0
    public final void t(m4.i0 i0Var, long j10) {
        f();
        p4.c.g(i0Var, "mediaItems must not be null");
        c0 c0Var = this.f1705b;
        if (c0Var.T()) {
            c0Var.t(i0Var, j10);
        } else {
            p4.c.B("MediaController", "The controller is not connected. Ignoring setMediaItem().");
        }
    }

    @Override // m4.y0
    public final int u() {
        f();
        c0 c0Var = this.f1705b;
        if (c0Var.T()) {
            return c0Var.u();
        }
        return -1;
    }

    @Override // m4.y0
    public final void v() {
        f();
        c0 c0Var = this.f1705b;
        if (c0Var.T()) {
            c0Var.v();
        } else {
            p4.c.B("MediaController", "The controller is not connected. Ignoring seekTo().");
        }
    }

    @Override // m4.y0
    public final int x() {
        f();
        c0 c0Var = this.f1705b;
        if (c0Var.T()) {
            return c0Var.x();
        }
        return -1;
    }

    @Override // m4.y0
    public final void z(m4.i0 i0Var) {
        f();
        p4.c.g(i0Var, "mediaItems must not be null");
        c0 c0Var = this.f1705b;
        if (c0Var.T()) {
            c0Var.z(i0Var);
        } else {
            p4.c.B("MediaController", "The controller is not connected. Ignoring setMediaItems().");
        }
    }
}
