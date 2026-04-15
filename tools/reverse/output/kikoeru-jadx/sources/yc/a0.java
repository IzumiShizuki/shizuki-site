package yc;

import b0.w1;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class a0 implements ic.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26091a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w1 f26092b;

    public /* synthetic */ a0(w1 w1Var, int i10) {
        this.f26091a = i10;
        this.f26092b = w1Var;
    }

    @Override // ic.k
    public final Object a(Object obj) {
        switch (this.f26091a) {
            case 0:
                be.c cVar = (be.c) obj;
                jc.l.e(cVar, "fqName");
                return new bd.r((y) this.f26092b.f1396d, cVar, 0);
            default:
                b0 b0Var = (b0) obj;
                jc.l.e(b0Var, "<destruct>");
                be.b bVar = b0Var.f26094a;
                List list = b0Var.f26095b;
                if (bVar.f2742c) {
                    throw new UnsupportedOperationException("Unresolved local class: " + bVar);
                }
                be.b bVarE = bVar.e();
                w1 w1Var = this.f26092b;
                g gVarK = bVarE != null ? w1Var.K(bVarE, vb.m.V(list, 1)) : (g) ((re.e) w1Var.f1397e).a(bVar.f2740a);
                boolean zG = bVar.g();
                re.l lVar = (re.l) w1Var.f1395c;
                be.e eVarF = bVar.f();
                Integer num = (Integer) vb.m.a0(list);
                return new c0(lVar, gVarK, eVarF, zG, num != null ? num.intValue() : 0);
        }
    }
}
