package cg;

import android.app.Activity;
import android.content.Context;
import android.provider.Settings;
import androidx.lifecycle.s0;
import androidx.media3.exoplayer.ExoPlayer;
import hf.r1;
import java.util.List;
import m4.i1;
import m4.o1;
import m4.q1;
import m4.r0;
import m4.u0;
import m4.u1;
import m4.v0;
import m4.w0;
import m4.x0;
import m4.y0;
import x0.a1;
import x0.e1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class v extends s0 implements w0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ExoPlayer f4113b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p f4114c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e1 f4115d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final e1 f4116e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final a1 f4117f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e1 f4118g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e1 f4119h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final e1 f4120i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e1 f4121j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final e1 f4122k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e1 f4123l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e1 f4124m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e1 f4125n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public float f4126o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e1 f4127p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e1 f4128q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public r1 f4129r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public r1 f4130s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final dg.a f4131t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f4132u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f4133v;

    public v(Context context, ExoPlayer exoPlayer) {
        jc.l.e(context, "context");
        this.f4113b = exoPlayer;
        this.f4114c = p.f4094a;
        this.f4115d = x0.v.v(o.f4085a);
        this.f4116e = x0.v.v(Boolean.TRUE);
        this.f4117f = new a1(0.0f);
        Boolean bool = Boolean.FALSE;
        this.f4118g = x0.v.v(new ub.k(bool, bool));
        this.f4119h = x0.v.v(bool);
        v4.v vVar = (v4.v) exoPlayer;
        this.f4120i = x0.v.v(Boolean.valueOf(vVar.r()));
        this.f4121j = x0.v.v(0L);
        this.f4122k = x0.v.v(0L);
        this.f4123l = x0.v.v(0L);
        this.f4124m = x0.v.v("");
        this.f4125n = x0.v.v(bool);
        this.f4126o = 1.0f;
        this.f4127p = x0.v.v(bool);
        this.f4128q = x0.v.v(bool);
        x0.v.v(Float.valueOf(1.0f));
        this.f4131t = new dg.a(context);
        vVar.f22683m.a(this);
    }

    public static boolean x(Activity activity) {
        return Settings.System.getInt(activity.getContentResolver(), "accelerometer_rotation", 0) == 1;
    }

    public final void A() {
        o oVarW = w();
        o oVar = o.f4086b;
        e1 e1Var = this.f4125n;
        y0 y0Var = this.f4113b;
        if (oVarW == oVar) {
            if (((Boolean) e1Var.getValue()).booleanValue()) {
                float f10 = ((v4.v) y0Var).O1().f14581a;
                float f11 = this.f4126o;
                if (f10 != f11) {
                    ((androidx.lifecycle.q) y0Var).y1(f11);
                }
                e1Var.setValue(Boolean.FALSE);
                return;
            }
            return;
        }
        if (w() == o.f4087c) {
            ((androidx.lifecycle.q) y0Var).s1(5, (long) this.f4117f.e());
        }
        V(false);
        T(false);
        this.f4115d.setValue(o.f4085a);
        X();
        if (((Boolean) e1Var.getValue()).booleanValue()) {
            float f12 = ((v4.v) y0Var).O1().f14581a;
            float f13 = this.f4126o;
            if (f12 != f13) {
                ((androidx.lifecycle.q) y0Var).y1(f13);
            }
            e1Var.setValue(Boolean.FALSE);
        }
    }

    @Override // m4.w0
    public final void F(u1 u1Var) {
        jc.l.e(u1Var, "videoSize");
        int i10 = u1Var.f14598a;
        int i11 = u1Var.f14599b;
        dg.a aVar = this.f4131t;
        aVar.getClass();
        if (i10 > 0 && i11 > 0) {
            eg.g gVar = aVar.f6009a;
            gVar.f6597a = i10;
            gVar.f6598b = i11;
            aVar.requestLayout();
        }
        this.f4132u = i10 < i11;
    }

    public final void G(boolean z10, boolean z11, Activity activity) {
        hf.a0.y(androidx.lifecycle.m0.h(this), null, null, new s(this, z10, z11, activity, null), 3);
    }

    public final void H(float f10) {
        v4.v vVar = (v4.v) this.f4113b;
        if (vVar.i() == 2 || vVar.i() == 3) {
            g8.a.T(w(), "ControlViewModel");
            float fM1 = vVar.M1();
            if (fM1 < Float.MAX_VALUE) {
                fM1 = Float.MAX_VALUE;
            }
            this.f4117f.f(nh.b.j(f10, 0.0f, fM1));
            if (w() == o.f4085a) {
                this.f4115d.setValue(o.f4087c);
            }
        }
    }

    public final void T(boolean z10) {
        this.f4127p.setValue(Boolean.valueOf(z10));
    }

    @Override // m4.w0
    public final void U(boolean z10) {
        this.f4131t.setKeepScreenOn(z10);
    }

    public final void V(boolean z10) {
        this.f4128q.setValue(Boolean.valueOf(z10));
    }

    public final void W(boolean z10) {
        this.f4119h.setValue(Boolean.valueOf(z10));
    }

    public final void X() {
        r1 r1Var = this.f4129r;
        yb.c cVar = null;
        if (r1Var != null) {
            r1Var.g(null);
        }
        this.f4116e.setValue(Boolean.TRUE);
        this.f4129r = hf.a0.y(androidx.lifecycle.m0.h(this), null, null, new q(this, cVar, 1), 3);
    }

    public final void Y() {
        v4.v vVar = (v4.v) this.f4113b;
        if (vVar.i() == 2 || vVar.i() == 3) {
            long jM1 = vVar.M1();
            if (jM1 == -9223372036854775807L) {
                jM1 = 0;
            }
            this.f4123l.setValue(Long.valueOf(jM1));
            this.f4121j.setValue(Long.valueOf(vVar.M()));
            if (w() == o.f4085a) {
                this.f4117f.f(vVar.M());
            }
            this.f4122k.setValue(Long.valueOf(vVar.H1()));
        }
    }

    @Override // m4.w0
    public final void n(int i10, boolean z10) {
        this.f4120i.setValue(Boolean.valueOf(z10));
    }

    @Override // m4.w0
    public final void r(int i10) {
        o oVar = o.f4085a;
        e1 e1Var = this.f4115d;
        o oVar2 = o.f4088d;
        yb.c cVar = null;
        if (i10 == 1) {
            W(false);
            hf.a0.y(androidx.lifecycle.m0.h(this), null, null, new u(this, cVar, 1), 3);
            if (w() == oVar2) {
                e1Var.setValue(oVar);
                return;
            }
            return;
        }
        if (i10 == 2) {
            W(true);
            Y();
            hf.a0.y(androidx.lifecycle.m0.h(this), null, null, new u(this, cVar, 0), 3);
        } else {
            if (i10 != 3) {
                if (i10 != 4) {
                    return;
                }
                W(false);
                hf.a0.y(androidx.lifecycle.m0.h(this), null, null, new u(this, cVar, 1), 3);
                e1Var.setValue(oVar2);
                return;
            }
            W(false);
            Y();
            hf.a0.y(androidx.lifecycle.m0.h(this), null, null, new u(this, cVar, 0), 3);
            if (w() == oVar2) {
                e1Var.setValue(oVar);
            }
        }
    }

    @Override // androidx.lifecycle.s0
    public final void v() {
        ((v4.v) this.f4113b).U1(this);
    }

    public final o w() {
        return (o) this.f4115d.getValue();
    }

    @Override // m4.w0
    public final void y(u0 u0Var) {
        jc.l.e(u0Var, "availableCommands");
        if (u0Var.a(2)) {
            W(true);
            V(false);
            T(false);
        }
    }

    public final boolean z() {
        return ((Boolean) ((ub.k) this.f4118g.getValue()).f21543a).booleanValue();
    }

    @Override // m4.w0
    public final /* synthetic */ void I() {
    }

    @Override // m4.w0
    public final /* synthetic */ void C(long j10) {
    }

    @Override // m4.w0
    public final /* synthetic */ void E(long j10) {
    }

    @Override // m4.w0
    public final /* synthetic */ void J(boolean z10) {
    }

    @Override // m4.w0
    public final /* synthetic */ void K(List list) {
    }

    @Override // m4.w0
    public final /* synthetic */ void M(v0 v0Var) {
    }

    @Override // m4.w0
    public final /* synthetic */ void N(long j10) {
    }

    @Override // m4.w0
    public final /* synthetic */ void O(r0 r0Var) {
    }

    @Override // m4.w0
    public final /* synthetic */ void Q(m4.n0 n0Var) {
    }

    @Override // m4.w0
    public final /* synthetic */ void R(m4.d dVar) {
    }

    @Override // m4.w0
    public final /* synthetic */ void S(o1 o1Var) {
    }

    @Override // m4.w0
    public final /* synthetic */ void b(int i10) {
    }

    @Override // m4.w0
    public final /* synthetic */ void c(boolean z10) {
    }

    @Override // m4.w0
    public final /* synthetic */ void d(int i10) {
    }

    @Override // m4.w0
    public final /* synthetic */ void e(int i10) {
    }

    @Override // m4.w0
    public final /* synthetic */ void f(m4.l0 l0Var) {
    }

    @Override // m4.w0
    public final /* synthetic */ void h(m4.l0 l0Var) {
    }

    @Override // m4.w0
    public final /* synthetic */ void i(r0 r0Var) {
    }

    @Override // m4.w0
    public final /* synthetic */ void j(q1 q1Var) {
    }

    @Override // m4.w0
    public final /* synthetic */ void l(boolean z10) {
    }

    @Override // m4.w0
    public final /* synthetic */ void o(m4.s0 s0Var) {
    }

    @Override // m4.w0
    public final /* synthetic */ void p(float f10) {
    }

    @Override // m4.w0
    public final /* synthetic */ void s(o4.c cVar) {
    }

    @Override // m4.w0
    public final /* synthetic */ void t(boolean z10) {
    }

    @Override // m4.w0
    public final /* synthetic */ void u(m4.k kVar) {
    }

    @Override // m4.w0
    public final /* synthetic */ void B(int i10, boolean z10) {
    }

    @Override // m4.w0
    public final /* synthetic */ void D(m4.i0 i0Var, int i10) {
    }

    @Override // m4.w0
    public final /* synthetic */ void L(int i10, boolean z10) {
    }

    @Override // m4.w0
    public final /* synthetic */ void P(int i10, int i11) {
    }

    @Override // m4.w0
    public final /* synthetic */ void m(i1 i1Var, int i10) {
    }

    @Override // m4.w0
    public final /* synthetic */ void g(x0 x0Var, x0 x0Var2, int i10) {
    }
}
