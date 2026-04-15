package nf;

import hf.a0;
import hf.h0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public class q extends hf.a implements ac.d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final yb.c f15852d;

    public q(yb.c cVar, yb.h hVar) {
        super(hVar, true);
        this.f15852d = cVar;
    }

    @Override // hf.k1
    public final boolean V() {
        return true;
    }

    @Override // ac.d
    public final ac.d f() {
        yb.c cVar = this.f15852d;
        if (cVar instanceof ac.d) {
            return (ac.d) cVar;
        }
        return null;
    }

    @Override // hf.k1
    public void l(Object obj) throws h0 {
        b.h(a0.A(obj), ud.s.p(this.f15852d));
    }

    @Override // hf.k1
    public void p(Object obj) {
        this.f15852d.h(a0.A(obj));
    }

    public void o0() {
    }
}
