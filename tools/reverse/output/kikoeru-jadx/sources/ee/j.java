package ee;

import b5.d0;
import java.io.IOException;
import java.util.ArrayList;
import ub.a0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class j implements ic.k, ug.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6529a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f6530b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f6531c;

    public /* synthetic */ j(int i10, Object obj, Object obj2) {
        this.f6529a = i10;
        this.f6530b = obj;
        this.f6531c = obj2;
    }

    private final Object f(Object obj) {
        d0 d0Var = (d0) this.f6530b;
        Object obj2 = d0Var.f1521b;
        hf.k kVar = (hf.k) this.f6531c;
        synchronized (obj2) {
            ((ArrayList) d0Var.f1522c).remove(kVar);
        }
        return a0.f21526a;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00a6  */
    @Override // ic.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.Object r13) {
        /*
            Method dump skipped, instruction units count: 1048
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ee.j.a(java.lang.Object):java.lang.Object");
    }

    @Override // ug.i
    public void r(zg.n nVar, IOException iOException) {
        if (nVar.f26883p) {
            return;
        }
        ((hf.k) this.f6531c).h(ub.a.b(iOException));
    }

    @Override // ug.i
    public void s(zg.n nVar, ug.d0 d0Var) {
        ((hf.k) this.f6531c).h(d0Var);
    }
}
