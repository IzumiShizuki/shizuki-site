package f1;

import ba.f0;
import ic.q;
import ic.r;
import ic.s;
import ic.t;
import ic.u;
import java.util.ArrayList;
import jc.c0;
import x0.p1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class f implements ic.n, ic.o, ic.p, q, r, s, t, u, ic.b, ic.c, ic.d, ic.e, ic.f, ic.g, ic.h, ic.i, ic.j, ic.l, ic.m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f6623a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f6624b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f6625c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public p1 f6626d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ArrayList f6627e;

    public f(Object obj, int i10, boolean z10) {
        this.f6623a = i10;
        this.f6624b = z10;
        this.f6625c = obj;
    }

    public final Object f(int i10, Object obj, x0.o oVar) {
        oVar.Y(this.f6623a);
        n(oVar);
        int iA = oVar.f(this) ? g.a(2, 1) : g.a(1, 1);
        Object obj2 = this.f6625c;
        jc.l.c(obj2, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \"p1\")] kotlin.Any?, @[ParameterName(name = \"c\")] androidx.compose.runtime.Composer, @[ParameterName(name = \"changed\")] kotlin.Int, kotlin.Any?>");
        c0.c(3, obj2);
        Object objG = ((ic.o) obj2).g(obj, oVar, Integer.valueOf(iA | i10));
        p1 p1VarR = oVar.r();
        if (p1VarR != null) {
            p1VarR.f24421d = new b(this, obj, i10, 0);
        }
        return objG;
    }

    @Override // ic.o
    public final /* bridge */ /* synthetic */ Object g(Object obj, Object obj2, Object obj3) {
        return f(((Number) obj3).intValue(), obj, (x0.o) obj2);
    }

    public final Object h(int i10, x0.o oVar) {
        oVar.Y(this.f6623a);
        n(oVar);
        int iA = i10 | (oVar.f(this) ? g.a(2, 0) : g.a(1, 0));
        Object obj = this.f6625c;
        jc.l.c(obj, "null cannot be cast to non-null type kotlin.Function2<@[ParameterName(name = \"c\")] androidx.compose.runtime.Composer, @[ParameterName(name = \"changed\")] kotlin.Int, kotlin.Any?>");
        c0.c(2, obj);
        Object objQ = ((ic.n) obj).q(oVar, Integer.valueOf(iA));
        p1 p1VarR = oVar.r();
        if (p1VarR != null) {
            p1VarR.f24421d = new e(2, this, f.class, "invoke", "invoke(Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;", 8, 0);
        }
        return objQ;
    }

    public final Object i(a0.d dVar, Integer num, Object obj, x0.o oVar, int i10) {
        oVar.Y(this.f6623a);
        n(oVar);
        int iA = oVar.f(this) ? g.a(2, 3) : g.a(1, 3);
        Object obj2 = this.f6625c;
        jc.l.c(obj2, "null cannot be cast to non-null type kotlin.Function5<@[ParameterName(name = \"p1\")] kotlin.Any?, @[ParameterName(name = \"p2\")] kotlin.Any?, @[ParameterName(name = \"p3\")] kotlin.Any?, @[ParameterName(name = \"c\")] androidx.compose.runtime.Composer, @[ParameterName(name = \"changed\")] kotlin.Int, kotlin.Any?>");
        c0.c(5, obj2);
        Object objK = ((q) obj2).k(dVar, num, obj, oVar, Integer.valueOf(iA | i10));
        p1 p1VarR = oVar.r();
        if (p1VarR != null) {
            p1VarR.f24421d = new f0(this, dVar, num, obj, i10, 1);
        }
        return objK;
    }

    public final Object j(Object obj, Object obj2, Object obj3, Object obj4, x0.o oVar, int i10) {
        oVar.Y(this.f6623a);
        n(oVar);
        int iA = oVar.f(this) ? g.a(2, 4) : g.a(1, 4);
        Object obj5 = this.f6625c;
        jc.l.c(obj5, "null cannot be cast to non-null type kotlin.Function6<@[ParameterName(name = \"p1\")] kotlin.Any?, @[ParameterName(name = \"p2\")] kotlin.Any?, @[ParameterName(name = \"p3\")] kotlin.Any?, @[ParameterName(name = \"p4\")] kotlin.Any?, @[ParameterName(name = \"c\")] androidx.compose.runtime.Composer, @[ParameterName(name = \"changed\")] kotlin.Int, kotlin.Any?>");
        c0.c(6, obj5);
        Object objP = ((r) obj5).p(obj, obj2, obj3, obj4, oVar, Integer.valueOf(iA | i10));
        p1 p1VarR = oVar.r();
        if (p1VarR != null) {
            p1VarR.f24421d = new d(this, obj, obj2, obj3, obj4, i10);
        }
        return objP;
    }

    @Override // ic.q
    public final /* bridge */ /* synthetic */ Object k(a0.d dVar, Integer num, Object obj, x0.o oVar, Integer num2) {
        return i(dVar, num, obj, oVar, num2.intValue());
    }

    @Override // ic.p
    public final /* bridge */ /* synthetic */ Object l(Object obj, Object obj2, Object obj3, Object obj4) {
        return m(obj, obj2, (x0.o) obj3, ((Number) obj4).intValue());
    }

    public final Object m(Object obj, Object obj2, x0.o oVar, int i10) {
        oVar.Y(this.f6623a);
        n(oVar);
        int iA = oVar.f(this) ? g.a(2, 2) : g.a(1, 2);
        Object obj3 = this.f6625c;
        jc.l.c(obj3, "null cannot be cast to non-null type kotlin.Function4<@[ParameterName(name = \"p1\")] kotlin.Any?, @[ParameterName(name = \"p2\")] kotlin.Any?, @[ParameterName(name = \"c\")] androidx.compose.runtime.Composer, @[ParameterName(name = \"changed\")] kotlin.Int, kotlin.Any?>");
        c0.c(4, obj3);
        Object objL = ((ic.p) obj3).l(obj, obj2, oVar, Integer.valueOf(iA | i10));
        p1 p1VarR = oVar.r();
        if (p1VarR != null) {
            p1VarR.f24421d = new c(i10, 0, this, obj, obj2);
        }
        return objL;
    }

    public final void n(x0.o oVar) {
        p1 p1VarW;
        if (!this.f6624b || (p1VarW = oVar.w()) == null) {
            return;
        }
        oVar.getClass();
        p1VarW.f24419b |= 1;
        if (g.g(this.f6626d, p1VarW)) {
            this.f6626d = p1VarW;
            return;
        }
        ArrayList arrayList = this.f6627e;
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList();
            this.f6627e = arrayList2;
            arrayList2.add(p1VarW);
            return;
        }
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (g.g((p1) arrayList.get(i10), p1VarW)) {
                arrayList.set(i10, p1VarW);
                return;
            }
        }
        arrayList.add(p1VarW);
    }

    public final void o(ub.e eVar) {
        if (jc.l.a(this.f6625c, eVar)) {
            return;
        }
        boolean z10 = this.f6625c == null;
        this.f6625c = eVar;
        if (z10 || !this.f6624b) {
            return;
        }
        p1 p1Var = this.f6626d;
        if (p1Var != null) {
            p1Var.c();
            this.f6626d = null;
        }
        ArrayList arrayList = this.f6627e;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((p1) arrayList.get(i10)).c();
            }
            arrayList.clear();
        }
    }

    @Override // ic.r
    public final /* bridge */ /* synthetic */ Object p(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        return j(obj, obj2, obj3, obj4, (x0.o) obj5, ((Number) obj6).intValue());
    }

    @Override // ic.n
    public final /* bridge */ /* synthetic */ Object q(Object obj, Object obj2) {
        return h(((Number) obj2).intValue(), (x0.o) obj);
    }
}
