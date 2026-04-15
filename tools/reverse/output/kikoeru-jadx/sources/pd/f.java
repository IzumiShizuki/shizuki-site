package pd;

import b0.w1;
import bd.y0;
import c7.e1;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import q.t0;
import se.n0;
import se.s0;
import yc.m0;
import yc.q0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class f implements nd.g {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ pc.u[] f17011h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w1 f17012a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ed.e f17013b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final re.h f17014c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final re.i f17015d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final dd.g f17016e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final re.i f17017f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f17018g;

    static {
        jc.s sVar = new jc.s(f.class, "fqName", "getFqName()Lorg/jetbrains/kotlin/name/FqName;", 0);
        jc.a0 a0Var = jc.z.f10839a;
        f17011h = new pc.u[]{a0Var.g(sVar), t0.H(f.class, "type", "getType()Lorg/jetbrains/kotlin/types/SimpleType;", 0, a0Var), t0.H(f.class, "allValueArguments", "getAllValueArguments()Ljava/util/Map;", 0, a0Var)};
    }

    public f(w1 w1Var, ed.e eVar, boolean z10) {
        jc.l.e(w1Var, "c");
        jc.l.e(eVar, "javaAnnotation");
        this.f17012a = w1Var;
        this.f17013b = eVar;
        od.a aVar = (od.a) w1Var.f1395c;
        re.o oVar = aVar.f16315a;
        e eVar2 = new e(this, 0);
        re.l lVar = (re.l) oVar;
        lVar.getClass();
        this.f17014c = new re.h(lVar, eVar2);
        e eVar3 = new e(this, 1);
        re.l lVar2 = (re.l) oVar;
        lVar2.getClass();
        this.f17015d = new re.i(lVar2, eVar3);
        this.f17016e = aVar.f16324j.c(eVar);
        e eVar4 = new e(this, 2);
        re.l lVar3 = (re.l) oVar;
        lVar3.getClass();
        this.f17017f = new re.i(lVar3, eVar4);
        this.f17018g = z10;
    }

    @Override // zc.b
    public final be.c a() {
        pc.u uVar = f17011h[0];
        re.h hVar = this.f17014c;
        jc.l.e(hVar, "<this>");
        jc.l.e(uVar, "p");
        return (be.c) hVar.b();
    }

    @Override // zc.b
    public final se.w b() {
        return (se.a0) n7.b0.r(this.f17015d, f17011h[1]);
    }

    @Override // zc.b
    public final Map c() {
        return (Map) n7.b0.r(this.f17017f, f17011h[2]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final ge.g d(sd.a aVar) {
        se.w wVarH;
        if (aVar instanceof ed.v) {
            return ge.h.b(null, ((ed.v) aVar).f6515b);
        }
        if (aVar instanceof ed.t) {
            Enum r72 = ((ed.t) aVar).f6513b;
            Class<?> enclosingClass = r72.getClass();
            if (!enclosingClass.isEnum()) {
                enclosingClass = enclosingClass.getEnclosingClass();
            }
            jc.l.b(enclosingClass);
            return new ge.i(ed.d.a(enclosingClass), be.e.e(r72.name()));
        }
        boolean z10 = aVar instanceof ed.h;
        w1 w1Var = this.f17012a;
        if (z10) {
            ed.h hVar = (ed.h) aVar;
            be.e eVar = hVar.f6497a;
            if (eVar == null) {
                eVar = ld.w.f12258b;
            }
            jc.l.b(eVar);
            ArrayList arrayListA = hVar.a();
            if (!se.c.l((se.a0) n7.b0.r(this.f17015d, f17011h[1]))) {
                yc.e eVarD = ie.d.d(this);
                jc.l.b(eVarD);
                y0 y0VarJ = a2.c.J(eVar, eVarD);
                if (y0VarJ == null || (wVarH = y0VarJ.b()) == null) {
                    wVarH = ((od.a) w1Var.f1395c).f16329o.g().h(ue.l.c(ue.k.UNKNOWN_ARRAY_ELEMENT_TYPE_OF_ANNOTATION_ARGUMENT, new String[0]));
                }
                ArrayList arrayList = new ArrayList(vb.n.K(arrayListA, 10));
                Iterator it = arrayListA.iterator();
                while (it.hasNext()) {
                    ge.g gVarD = d((sd.a) it.next());
                    if (gVarD == null) {
                        gVarD = new ge.u(null);
                    }
                    arrayList.add(gVarD);
                }
                return new ge.x(arrayList, wVarH);
            }
        } else {
            if (aVar instanceof ed.g) {
                return new ge.a((Object) new f(w1Var, new ed.e(((ed.g) aVar).f6498b), false));
            }
            if (aVar instanceof ed.p) {
                Class cls = ((ed.p) aVar).f6509b;
                se.w wVarH0 = ((e1) w1Var.f1397e).h0(cls.isPrimitive() ? new ed.z(cls) : ((cls instanceof GenericArrayType) || cls.isArray()) ? new ed.i(cls) : cls instanceof WildcardType ? new ed.e0((WildcardType) cls) : new ed.q(cls), n7.e.F(s0.f19985b, false, null, 7));
                if (!se.c.l(wVarH0)) {
                    se.w wVarB = wVarH0;
                    int i10 = 0;
                    while (vc.i.y(wVarB)) {
                        wVarB = ((n0) vb.m.x0(wVarB.q())).b();
                        jc.l.d(wVarB, "getType(...)");
                        i10++;
                    }
                    yc.h hVarH = wVarB.t().h();
                    if (hVarH instanceof yc.e) {
                        be.b bVarF = ie.d.f(hVarH);
                        return bVarF == null ? new ge.s(new ge.p(wVarH0)) : new ge.s(bVarF, i10);
                    }
                    if (hVarH instanceof q0) {
                        be.c cVarI = vc.n.f22865a.i();
                        return new ge.s(new be.b(cVarI.b(), cVarI.f2744a.g()), 0);
                    }
                }
            }
        }
        return null;
    }

    @Override // zc.b
    public final m0 m() {
        return this.f17016e;
    }

    public final String toString() {
        return de.i.f5906c.v(this, null);
    }
}
