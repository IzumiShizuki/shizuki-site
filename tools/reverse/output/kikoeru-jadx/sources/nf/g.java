package nf;

import hf.a0;
import hf.h0;
import hf.j0;
import hf.u1;
import hf.v0;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class g extends j0 implements ac.d, yb.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f15826h = AtomicReferenceFieldUpdater.newUpdater(g.class, Object.class, "_reusableCancellableContinuation$volatile");
    private volatile /* synthetic */ Object _reusableCancellableContinuation$volatile;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final hf.u f15827d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ac.c f15828e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f15829f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f15830g;

    public g(hf.u uVar, ac.c cVar) {
        super(-1);
        this.f15827d = uVar;
        this.f15828e = cVar;
        this.f15829f = b.f15815b;
        this.f15830g = b.m(cVar.s());
    }

    @Override // ac.d
    public final ac.d f() {
        return this.f15828e;
    }

    @Override // yb.c
    public final void h(Object obj) throws h0 {
        Throwable thA = ub.n.a(obj);
        Object sVar = thA == null ? obj : new hf.s(thA, false);
        ac.c cVar = this.f15828e;
        yb.h hVarS = cVar.s();
        hf.u uVar = this.f15827d;
        if (b.j(uVar, hVarS)) {
            this.f15829f = sVar;
            this.f8552c = 0;
            b.i(uVar, cVar.s(), this);
            return;
        }
        v0 v0VarA = u1.a();
        if (v0VarA.f8601c >= 4294967296L) {
            this.f15829f = sVar;
            this.f8552c = 0;
            v0VarA.j0(this);
            return;
        }
        v0VarA.l0(true);
        try {
            yb.h hVarS2 = cVar.s();
            Object objN = b.n(hVarS2, this.f15830g);
            try {
                cVar.h(obj);
                while (v0VarA.n0()) {
                }
            } finally {
                b.g(hVarS2, objN);
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    @Override // hf.j0
    public final Object i() {
        Object obj = this.f15829f;
        this.f15829f = b.f15815b;
        return obj;
    }

    @Override // yb.c
    public final yb.h s() {
        return this.f15828e.s();
    }

    public final String toString() {
        return "DispatchedContinuation[" + this.f15827d + ", " + a0.E(this.f15828e) + ']';
    }

    @Override // hf.j0
    public final yb.c c() {
        return this;
    }
}
