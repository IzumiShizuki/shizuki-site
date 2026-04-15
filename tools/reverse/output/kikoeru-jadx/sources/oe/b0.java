package oe;

import wd.t0;
import yc.m0;

/* JADX INFO: loaded from: classes.dex */
public final class b0 implements ic.k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b0 f16350b = new b0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16351a = 0;

    public /* synthetic */ b0() {
    }

    @Override // ic.k
    public final Object a(Object obj) {
        switch (this.f16351a) {
            case 0:
                t0 t0Var = (t0) obj;
                jc.l.e(t0Var, "it");
                return Integer.valueOf(t0Var.f23951d.size());
            default:
                jc.l.e((be.b) obj, "it");
                return m0.p0;
        }
    }

    public b0(pe.c cVar) {
    }
}
