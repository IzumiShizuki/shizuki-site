package i9;

import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Build;
import com.cnl.kikoeru.R;
import e7.y;
import java.util.List;
import jc.r;
import jc.z;
import m4.i0;
import m4.i1;
import m4.l0;
import m4.n0;
import m4.o1;
import m4.q1;
import m4.r0;
import m4.s0;
import m4.u0;
import m4.u1;
import m4.v0;
import m4.w0;
import m4.x0;
import na.q;
import pc.f0;
import pc.u;
import v4.v;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class l implements w0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ u[] f9485b = {z.f10839a.f(new r(l.class, "ignoreAudioFocus", "<v#0>", 0))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ v f9486a;

    public l(v vVar) {
        this.f9486a = vVar;
    }

    @Override // m4.w0
    public final void D(i0 i0Var, int i10) {
        if (i0Var != null) {
            h9.d.f8242b.setValue(Integer.valueOf(this.f9486a.G()));
            o.f9489a.getClass();
            o.d();
        }
    }

    @Override // m4.w0
    public final void U(boolean z10) {
        h9.d.f8244d.setValue(Boolean.valueOf(z10));
        if (((Boolean) f0.P(gg.c.a(), "ignoreAudioFocus", Boolean.FALSE, z.a(Boolean.TYPE)).c(f9485b[0])).booleanValue()) {
            return;
        }
        Object systemService = a9.i.a().getSystemService("audio");
        jc.l.c(systemService, "null cannot be cast to non-null type android.media.AudioManager");
        AudioManager audioManager = (AudioManager) systemService;
        if (z10) {
            if (Build.VERSION.SDK_INT < 26) {
                g1.d dVar = n.f9487a;
                audioManager.requestAudioFocus(new j(1), 3, 1);
                return;
            } else {
                AudioFocusRequest audioFocusRequestI = k1.g.i(n.f9488b.getValue());
                jc.l.b(audioFocusRequestI);
                audioManager.requestAudioFocus(audioFocusRequestI);
                return;
            }
        }
        if (Build.VERSION.SDK_INT < 26) {
            g1.d dVar2 = n.f9487a;
            audioManager.abandonAudioFocus(new j(2));
        } else {
            AudioFocusRequest audioFocusRequestI2 = k1.g.i(n.f9488b.getValue());
            jc.l.b(audioFocusRequestI2);
            audioManager.abandonAudioFocusRequest(audioFocusRequestI2);
        }
    }

    @Override // m4.w0
    public final void d(int i10) {
        h9.d.f8245e.setValue(Integer.valueOf(i10));
    }

    @Override // m4.w0
    public final void i(r0 r0Var) {
        jc.l.e(r0Var, "error");
        int i10 = r0Var.f14570a;
        r0Var.printStackTrace();
        q.c("Playback error: " + r0Var.b() + ", " + r0Var.getMessage(), "ExoPlayer");
        if (!jc.l.a(r0Var.getMessage(), "Source error")) {
            ka.n.c(r0Var, 0L, null, null, 511);
            return;
        }
        String strConcat = (i10 == 2002 || i10 == 2001) ? q.g(R.string.network_error).concat(" ") : "";
        ka.n.c(strConcat + r0Var.b() + "(" + i10 + ")", 10000L, new y(7, r0Var), q.g(R.string.detail), 490);
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
    public final /* synthetic */ void F(u1 u1Var) {
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
    public final /* synthetic */ void Q(n0 n0Var) {
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
    public final /* synthetic */ void e(int i10) {
    }

    @Override // m4.w0
    public final /* synthetic */ void f(l0 l0Var) {
    }

    @Override // m4.w0
    public final /* synthetic */ void h(l0 l0Var) {
    }

    @Override // m4.w0
    public final /* synthetic */ void j(q1 q1Var) {
    }

    @Override // m4.w0
    public final /* synthetic */ void l(boolean z10) {
    }

    @Override // m4.w0
    public final /* synthetic */ void o(s0 s0Var) {
    }

    @Override // m4.w0
    public final /* synthetic */ void p(float f10) {
    }

    @Override // m4.w0
    public final /* synthetic */ void r(int i10) {
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
    public final /* synthetic */ void y(u0 u0Var) {
    }

    @Override // m4.w0
    public final /* synthetic */ void B(int i10, boolean z10) {
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
    public final /* synthetic */ void n(int i10, boolean z10) {
    }

    @Override // m4.w0
    public final /* synthetic */ void g(x0 x0Var, x0 x0Var2, int i10) {
    }
}
