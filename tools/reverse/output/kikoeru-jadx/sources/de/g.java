package de;

import java.io.IOException;
import se.n0;
import se.w;
import se.x0;

/* JADX INFO: loaded from: classes.dex */
public final class g implements ic.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5903a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f5904b;

    public /* synthetic */ g(i iVar, int i10) {
        this.f5903a = i10;
        this.f5904b = iVar;
    }

    @Override // ic.k
    public final Object a(Object obj) throws IOException {
        switch (this.f5903a) {
            case 0:
                n0 n0Var = (n0) obj;
                jc.l.e(n0Var, "it");
                if (n0Var.c()) {
                    return "*";
                }
                w wVarB = n0Var.b();
                jc.l.d(wVarB, "getType(...)");
                String strV = this.f5904b.V(wVarB);
                if (n0Var.a() == x0.INVARIANT) {
                    return strV;
                }
                return n0Var.a() + ' ' + strV;
            default:
                w wVar = (w) obj;
                jc.l.b(wVar);
                return this.f5904b.V(wVar);
        }
    }
}
