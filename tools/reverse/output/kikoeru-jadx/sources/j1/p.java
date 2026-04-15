package j1;

import b0.s1;
import c2.w;
import hf.a0;
import hf.d1;
import hf.f1;
import hf.y;
import i2.g1;
import i2.l1;
import j2.v;
import s.b0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class p implements i2.m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public nf.d f9691b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f9692c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public p f9694e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public p f9695f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public l1 f9696g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public g1 f9697h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f9698i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f9699j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f9700k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f9701l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public s1 f9702m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f9703n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public p f9690a = this;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f9693d = -1;

    public void A0(g1 g1Var) {
        this.f9697h = g1Var;
    }

    public final y n0() {
        nf.d dVar = this.f9691b;
        if (dVar != null) {
            return dVar;
        }
        nf.d dVarB = a0.b(((v) i2.f.z(this)).getCoroutineContext().G(new f1((d1) ((v) i2.f.z(this)).getCoroutineContext().R(hf.v.f8599b))));
        this.f9691b = dVarB;
        return dVarB;
    }

    public boolean o0() {
        return !(this instanceof b0);
    }

    public void p0() {
        if (this.f9703n) {
            f2.a.b("node attached multiple times");
        }
        if (this.f9697h == null) {
            f2.a.b("attach invoked on a node without a coordinator");
        }
        this.f9703n = true;
        this.f9700k = true;
    }

    public void q0() {
        if (!this.f9703n) {
            f2.a.b("Cannot detach a node that is not attached");
        }
        if (this.f9700k) {
            f2.a.b("Must run runAttachLifecycle() before markAsDetached()");
        }
        if (this.f9701l) {
            f2.a.b("Must run runDetachLifecycle() before markAsDetached()");
        }
        this.f9703n = false;
        nf.d dVar = this.f9691b;
        if (dVar != null) {
            a0.h(dVar, new w(1, "The Modifier.Node was detached"));
            this.f9691b = null;
        }
    }

    public void w0() {
        if (!this.f9703n) {
            f2.a.b("reset() called on an unattached node");
        }
        v0();
    }

    public void x0() {
        if (!this.f9703n) {
            f2.a.b("Must run markAsAttached() prior to runAttachLifecycle");
        }
        if (!this.f9700k) {
            f2.a.b("Must run runAttachLifecycle() only once after markAsAttached()");
        }
        this.f9700k = false;
        r0();
        this.f9701l = true;
    }

    public void y0() {
        if (!this.f9703n) {
            f2.a.b("node detached multiple times");
        }
        if (this.f9697h == null) {
            f2.a.b("detach invoked on a node without a coordinator");
        }
        if (!this.f9701l) {
            f2.a.b("Must run runDetachLifecycle() once after runAttachLifecycle() and before markAsDetached()");
        }
        this.f9701l = false;
        s1 s1Var = this.f9702m;
        if (s1Var != null) {
            s1Var.b();
        }
        t0();
    }

    public void z0(p pVar) {
        this.f9690a = pVar;
    }

    public void r0() {
    }

    public /* synthetic */ void s0() {
    }

    public void t0() {
    }

    public /* synthetic */ void u0() {
    }

    public void v0() {
    }
}
