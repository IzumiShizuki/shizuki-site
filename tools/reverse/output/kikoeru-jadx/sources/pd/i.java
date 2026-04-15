package pd;

import b0.w1;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Collection;
import java.util.List;
import se.k0;
import yc.b1;
import yc.e1;
import yc.l0;
import yc.n0;
import yc.r0;
import yc.y0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class i extends bd.m implements nd.c {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final w1 f17024g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ed.o f17025h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final yc.e f17026i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final w1 f17027j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ub.p f17028k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final yc.f f17029l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final yc.x f17030m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e1 f17031n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f17032o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final h f17033p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final n f17034q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final l0 f17035r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final le.i f17036s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final c0 f17037t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final od.c f17038u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final re.i f17039v;

    static {
        vb.l.N0(new String[]{"equals", "hashCode", "getClass", "wait", "notify", "notifyAll", "toString"});
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public i(w1 w1Var, yc.k kVar, ed.o oVar, yc.e eVar) throws IllegalAccessException, InvocationTargetException {
        Boolean bool;
        Boolean bool2;
        jc.l.e(w1Var, "outerContext");
        jc.l.e(kVar, "containingDeclaration");
        jc.l.e(oVar, "jClass");
        od.a aVar = (od.a) w1Var.f1395c;
        super(aVar.f16315a, kVar, oVar.e(), aVar.f16324j.c(oVar));
        this.f17024g = w1Var;
        this.f17025h = oVar;
        this.f17026i = eVar;
        w1 w1VarF = n7.d.f(w1Var, this, oVar, 4);
        this.f17027j = w1VarF;
        od.a aVar2 = (od.a) w1VarF.f1395c;
        re.o oVar2 = aVar2.f16315a;
        aVar2.f16321g.getClass();
        this.f17028k = ub.a.d(new g(this, 0));
        Class cls = oVar.f6508a;
        this.f17029l = cls.isAnnotation() ? yc.f.f26113e : cls.isInterface() ? yc.f.f26110b : cls.isEnum() ? yc.f.f26111c : yc.f.f26109a;
        boolean zIsAnnotation = cls.isAnnotation();
        yc.x xVar = yc.x.f26155b;
        if (!zIsAnnotation && !cls.isEnum()) {
            jc.l.e(cls, "clazz");
            Method method = (Method) android.support.v4.media.session.b.K().f1395c;
            if (method == null) {
                bool = null;
            } else {
                Object objInvoke = method.invoke(cls, null);
                jc.l.c(objInvoke, "null cannot be cast to non-null type kotlin.Boolean");
                bool = (Boolean) objInvoke;
            }
            boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
            jc.l.e(cls, "clazz");
            Method method2 = (Method) android.support.v4.media.session.b.K().f1395c;
            if (method2 == null) {
                bool2 = null;
            } else {
                Object objInvoke2 = method2.invoke(cls, null);
                jc.l.c(objInvoke2, "null cannot be cast to non-null type kotlin.Boolean");
                bool2 = (Boolean) objInvoke2;
            }
            boolean z10 = (bool2 != null ? bool2.booleanValue() : false) || Modifier.isAbstract(cls.getModifiers()) || cls.isInterface();
            boolean zIsFinal = Modifier.isFinal(cls.getModifiers());
            yc.x.f26154a.getClass();
            if (zBooleanValue) {
                xVar = yc.x.f26156c;
            } else if (z10) {
                xVar = yc.x.f26158e;
            } else if (!zIsFinal) {
                xVar = yc.x.f26157d;
            }
        }
        this.f17030m = xVar;
        int modifiers = cls.getModifiers();
        this.f17031n = Modifier.isPublic(modifiers) ? b1.f26096c : Modifier.isPrivate(modifiers) ? y0.f26161c : Modifier.isProtected(modifiers) ? Modifier.isStatic(modifiers) ? cd.c.f3891c : cd.b.f3890c : cd.a.f3889c;
        Class<?> declaringClass = cls.getDeclaringClass();
        this.f17032o = ((declaringClass != null ? new ed.o(declaringClass) : null) == null || Modifier.isStatic(cls.getModifiers())) ? false : true;
        this.f17033p = new h(this);
        n nVar = new n(w1VarF, this, oVar, eVar != null, null);
        this.f17034q = nVar;
        n0 n0Var = l0.f26117d;
        ((te.l) aVar2.f16335u).getClass();
        bd.a aVar3 = new bd.a(17, this);
        n0Var.getClass();
        jc.l.e(oVar2, "storageManager");
        this.f17035r = new l0(this, oVar2, aVar3);
        this.f17036s = new le.i(nVar);
        this.f17037t = new c0(w1VarF, oVar, this);
        this.f17038u = n7.e.z(w1VarF, oVar);
        g gVar = new g(this, 1);
        re.l lVar = (re.l) oVar2;
        lVar.getClass();
        this.f17039v = new re.i(lVar, gVar);
    }

    @Override // bd.c, yc.e
    public final le.o I0() {
        return this.f17036s;
    }

    @Override // yc.e
    public final r0 J0() {
        return null;
    }

    @Override // yc.e, yc.i
    public final List L() {
        return (List) this.f17039v.b();
    }

    @Override // bd.c, yc.e
    public final le.o N0() {
        return (n) super.N0();
    }

    @Override // yc.w
    public final boolean O0() {
        return false;
    }

    @Override // yc.h
    public final k0 Q() {
        return this.f17033p;
    }

    @Override // yc.e
    public final boolean R() {
        return false;
    }

    @Override // yc.e
    public final boolean S0() {
        return false;
    }

    @Override // yc.e
    public final Collection T() {
        return (List) this.f17034q.f17057q.b();
    }

    @Override // yc.e
    public final boolean W() {
        return false;
    }

    @Override // yc.w
    public final boolean c0() {
        return false;
    }

    @Override // yc.i
    public final boolean d0() {
        return this.f17032o;
    }

    @Override // yc.e, yc.w, yc.n
    public final ld.o f() {
        ld.o oVar = yc.o.f26125a;
        e1 e1Var = this.f17031n;
        if (jc.l.a(e1Var, oVar)) {
            Class<?> declaringClass = this.f17025h.f6508a.getDeclaringClass();
            if ((declaringClass != null ? new ed.o(declaringClass) : null) == null) {
                ld.o oVar2 = ld.p.f12238a;
                jc.l.b(oVar2);
                return oVar2;
            }
        }
        return gh.g.Q(e1Var);
    }

    @Override // zc.a
    public final zc.h getAnnotations() {
        return this.f17038u;
    }

    @Override // bd.e0
    public final le.o i(te.f fVar) {
        l0 l0Var = this.f17035r;
        ie.d.j(l0Var.f26119a);
        return (n) ((le.o) n7.b0.r(l0Var.f26121c, l0.f26118e[0]));
    }

    @Override // yc.e
    public final yc.f j() {
        return this.f17029l;
    }

    @Override // yc.e
    public final bd.l j0() {
        return null;
    }

    @Override // yc.e
    public final le.o k0() {
        return this.f17037t;
    }

    @Override // yc.e
    public final boolean l() {
        return false;
    }

    public final n q() {
        return (n) super.N0();
    }

    @Override // yc.e, yc.w
    public final yc.x s() {
        return this.f17030m;
    }

    public final String toString() {
        return "Lazy Java class " + ie.d.h(this);
    }

    @Override // yc.e
    public final boolean w() {
        return false;
    }
}
