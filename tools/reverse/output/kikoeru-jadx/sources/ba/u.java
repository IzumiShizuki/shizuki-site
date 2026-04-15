package ba;

import java.io.ByteArrayInputStream;
import java.lang.reflect.Type;
import java.util.List;
import sc.f2;
import x0.n2;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class u implements ic.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2481a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f2482b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f2483c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f2484d;

    public /* synthetic */ u(Object obj, Object obj2, Object obj3, int i10) {
        this.f2481a = i10;
        this.f2482b = obj;
        this.f2483c = obj2;
        this.f2484d = obj3;
    }

    @Override // ic.a
    public final Object b() {
        int i10 = this.f2481a;
        ub.a0 a0Var = ub.a0.f21526a;
        Object obj = this.f2483c;
        Object obj2 = this.f2482b;
        Object obj3 = this.f2484d;
        switch (i10) {
            case 0:
                n2 n2Var = (n2) obj3;
                String strK = (String) obj2;
                if (ef.n.n0(strK, " ", false)) {
                    strK = q.t0.D("\"", strK, "\"");
                }
                if (((String) n2Var.getValue()).length() != 0) {
                    strK = j2.h0.k((String) n2Var.getValue(), " ", strK);
                }
                int length = strK.length();
                ((x0.w0) obj).setValue(new y2.y(t2.c0.b(length, length), strK, 4));
                return a0Var;
            case 1:
                return new bd.j((bd.k) obj3, (re.o) obj2, (yc.n0) obj);
            case 2:
                return ((ce.c) ((ce.y) obj2)).c((ByteArrayInputStream) obj, ((qe.o) obj3).f18207b.f16390a.f16379p);
            case 3:
                sc.a0 a0Var2 = (sc.a0) obj;
                sc.d0 d0Var = (sc.d0) obj3;
                yc.h hVarH = ((se.w) obj2).t().h();
                if (!(hVarH instanceof yc.e)) {
                    throw new hc.a("Supertype not a class: " + hVarH);
                }
                Class clsJ = f2.j((yc.e) hVarH);
                if (clsJ == null) {
                    throw new hc.a("Unsupported superclass of " + a0Var2 + ": " + hVarH);
                }
                Class cls = d0Var.f19786b;
                if (jc.l.a(cls.getSuperclass(), clsJ)) {
                    Type genericSuperclass = cls.getGenericSuperclass();
                    jc.l.b(genericSuperclass);
                    return genericSuperclass;
                }
                Class<?>[] interfaces = cls.getInterfaces();
                jc.l.d(interfaces, "getInterfaces(...)");
                int iA0 = vb.l.A0(clsJ, interfaces);
                if (iA0 >= 0) {
                    Type type = cls.getGenericInterfaces()[iA0];
                    jc.l.b(type);
                    return type;
                }
                throw new hc.a("No superclass of " + a0Var2 + " in Java reflection for " + hVarH);
            default:
                pc.u[] uVarArr = z8.i.f26554a;
                ((hg.b) obj3).e(((ub.k) ((List) obj2).get((int) ((Number) ((x0.w0) obj).getValue()).floatValue())).f21543a, z8.i.f26554a[0]);
                return a0Var;
        }
    }

    public u(bd.k kVar, re.o oVar, yc.n0 n0Var) {
        this.f2481a = 1;
        this.f2484d = kVar;
        this.f2482b = oVar;
        this.f2483c = n0Var;
    }
}
