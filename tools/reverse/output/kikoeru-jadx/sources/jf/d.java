package jf;

import android.os.Handler;
import android.os.Looper;
import ba.q0;
import hf.a0;
import hf.f0;
import hf.k;
import hf.l0;
import hf.n0;
import hf.o1;
import hf.u;
import j2.h0;
import java.util.concurrent.CancellationException;
import jc.l;
import nf.n;
import yb.h;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class d extends u implements f0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Handler f10869c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f10870d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f10871e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final d f10872f;

    public d(Handler handler, String str, boolean z10) {
        this.f10869c = handler;
        this.f10870d = str;
        this.f10871e = z10;
        this.f10872f = z10 ? this : new d(handler, str, true);
    }

    @Override // hf.f0
    public final n0 O(long j10, final Runnable runnable, h hVar) {
        if (j10 > 4611686018427387903L) {
            j10 = 4611686018427387903L;
        }
        if (this.f10869c.postDelayed(runnable, j10)) {
            return new n0() { // from class: jf.c
                @Override // hf.n0
                public final void a() {
                    this.f10867a.f10869c.removeCallbacks(runnable);
                }
            };
        }
        i0(hVar, runnable);
        return o1.f8575a;
    }

    @Override // hf.f0
    public final void X(long j10, k kVar) {
        b5.h hVar = new b5.h(16, kVar, this);
        if (j10 > 4611686018427387903L) {
            j10 = 4611686018427387903L;
        }
        if (this.f10869c.postDelayed(hVar, j10)) {
            kVar.w(new q0(7, this, hVar));
        } else {
            i0(kVar.f8561e, hVar);
        }
    }

    @Override // hf.u
    public final void e0(h hVar, Runnable runnable) {
        if (this.f10869c.post(runnable)) {
            return;
        }
        i0(hVar, runnable);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return dVar.f10869c == this.f10869c && dVar.f10871e == this.f10871e;
    }

    @Override // hf.u
    public final boolean g0(h hVar) {
        return (this.f10871e && l.a(Looper.myLooper(), this.f10869c.getLooper())) ? false : true;
    }

    @Override // hf.u
    public u h0(int i10) {
        nf.b.a(i10);
        return this;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f10869c) ^ (this.f10871e ? 1231 : 1237);
    }

    public final void i0(h hVar, Runnable runnable) {
        a0.i(hVar, new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed"));
        pf.e eVar = l0.f8566a;
        pf.d.f17138c.e0(hVar, runnable);
    }

    @Override // hf.u
    public final String toString() {
        d dVar;
        String str;
        pf.e eVar = l0.f8566a;
        d dVar2 = n.f15850a;
        if (this == dVar2) {
            str = "Dispatchers.Main";
        } else {
            try {
                dVar = dVar2.f10872f;
            } catch (UnsupportedOperationException unused) {
                dVar = null;
            }
            str = this == dVar ? "Dispatchers.Main.immediate" : null;
        }
        if (str != null) {
            return str;
        }
        String string = this.f10870d;
        if (string == null) {
            string = this.f10869c.toString();
        }
        return this.f10871e ? h0.j(string, ".immediate") : string;
    }

    public d(Handler handler) {
        this(handler, null, false);
    }
}
