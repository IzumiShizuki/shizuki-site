package qd;

import c7.e1;
import ed.q;
import m0.w;
import se.k0;
import yc.q0;

/* JADX INFO: loaded from: classes.dex */
public final class c implements ic.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e1 f18148a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q0 f18149b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f18150c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final k0 f18151d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final q f18152e;

    public c(e1 e1Var, q0 q0Var, a aVar, k0 k0Var, q qVar) {
        this.f18148a = e1Var;
        this.f18149b = q0Var;
        this.f18150c = aVar;
        this.f18151d = k0Var;
        this.f18152e = qVar;
    }

    @Override // ic.a
    public final Object b() {
        w wVar = (w) this.f18148a.f3620d;
        yc.h hVarH = this.f18151d.h();
        return wVar.B(this.f18149b, a.a(a.a(this.f18150c, null, false, null, hVarH != null ? hVarH.E() : null, 31), null, this.f18152e.d(), null, null, 59));
    }
}
