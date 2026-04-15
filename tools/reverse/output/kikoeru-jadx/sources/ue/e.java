package ue;

import java.util.Collection;
import java.util.List;
import ub.p;
import vb.r;
import yc.h0;
import yc.y;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class e implements y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f21615a = new e();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final be.e f21616b = be.e.g("<Error module>");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final r f21617c = r.f22819a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final p f21618d = ub.a.d(d.f21614a);

    @Override // yc.y
    public final List D0() {
        return f21617c;
    }

    @Override // yc.y
    public final h0 K0(be.c cVar) {
        jc.l.e(cVar, "fqName");
        throw new IllegalStateException("Should not be called!");
    }

    @Override // yc.y
    public final Object P0(app.nekogram.translator.r rVar) {
        jc.l.e(rVar, "capability");
        return null;
    }

    @Override // yc.k
    public final Object a0(yc.m mVar, Object obj) {
        return null;
    }

    @Override // yc.y
    public final boolean b0(y yVar) {
        jc.l.e(yVar, "targetModule");
        return false;
    }

    @Override // yc.y
    public final vc.i g() {
        return (vc.i) f21618d.getValue();
    }

    @Override // zc.a
    public final zc.h getAnnotations() {
        return zc.g.f26696a;
    }

    @Override // yc.k
    public final be.e getName() {
        return f21616b;
    }

    @Override // yc.y
    public final Collection p(be.c cVar, ic.k kVar) {
        jc.l.e(cVar, "fqName");
        return r.f22819a;
    }

    @Override // yc.k
    public final yc.k y() {
        return null;
    }

    @Override // yc.k, yc.b
    public final yc.k a() {
        return this;
    }
}
