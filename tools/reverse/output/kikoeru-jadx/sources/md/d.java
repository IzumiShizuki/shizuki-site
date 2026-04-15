package md;

import bd.y0;
import ic.k;
import jc.l;
import se.w;
import vc.n;
import yc.y;

/* JADX INFO: loaded from: classes.dex */
public final class d implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f15109a = new d();

    @Override // ic.k
    public final Object a(Object obj) {
        w wVarB;
        y yVar = (y) obj;
        Object obj2 = e.f15110a;
        l.e(yVar, "module");
        y0 y0VarJ = a2.c.J(c.f15106b, yVar.g().j(n.f22891t));
        return (y0VarJ == null || (wVarB = y0VarJ.b()) == null) ? ue.l.c(ue.k.UNMAPPED_ANNOTATION_TARGET_TYPE, new String[0]) : wVarB;
    }
}
