package sc;

import com.tencent.bugly.beta.tinker.TinkerReport;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
public final class v implements ic.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19886a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d0 f19887b;

    public /* synthetic */ v(d0 d0Var, int i10) {
        this.f19886a = i10;
        this.f19887b = d0Var;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, ub.h] */
    @Override // ic.a
    public final Object b() throws InvocationTargetException {
        int i10 = this.f19886a;
        g0 g0Var = g0.f19800a;
        g0 g0Var2 = g0.f19801b;
        d0 d0Var = this.f19887b;
        switch (i10) {
            case 0:
                return new a0(d0Var);
            case 1:
                return d0Var.i(d0Var.a().E().n0(), g0Var);
            case 2:
                le.o oVarK0 = d0Var.a().k0();
                jc.l.d(oVarK0, "getStaticScope(...)");
                return d0Var.i(oVarK0, g0Var);
            case 3:
                return d0Var.i(d0Var.a().E().n0(), g0Var2);
            case 4:
                le.o oVarK02 = d0Var.a().k0();
                jc.l.d(oVarK02, "getStaticScope(...)");
                return d0Var.i(oVarK02, g0Var2);
            case 5:
                HashSet hashSet = d0.f19785d;
                be.b bVarR = d0Var.r();
                Class cls = d0Var.f19786b;
                z1 z1Var = ((a0) d0Var.f19787c.getValue()).f19797a;
                pc.u uVar = f0.f19796b[0];
                Object objB = z1Var.b();
                jc.l.d(objB, "getValue(...)");
                dd.f fVar = (dd.f) objB;
                oe.i iVar = fVar.f5871a;
                yc.e eVarB = (bVarR.f2742c && cls.isAnnotationPresent(Metadata.class)) ? iVar.b(bVarR) : yc.v.d(iVar.f16365b, bVarR);
                if (eVarB != null) {
                    return eVarB;
                }
                if (cls.isSynthetic()) {
                    return d0.q(bVarR, fVar);
                }
                dd.c cVarS = g8.a.s(cls);
                vd.a aVar = cVarS != null ? (vd.a) cVarS.f5867b.f9019c : null;
                switch (aVar == null ? -1 : b0.f19760a[aVar.ordinal()]) {
                    case -1:
                    case 6:
                        throw new hc.a("Unresolved class: " + cls + " (kind = " + aVar + ')');
                    case 0:
                    default:
                        throw new ce.j0();
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                        return d0.q(bVarR, fVar);
                    case 5:
                        throw new hc.a("Unknown class: " + cls + " (kind = " + aVar + ')');
                }
            case 6:
                Annotation[] annotations = d0Var.f19786b.getAnnotations();
                jc.l.d(annotations, "getAnnotations(...)");
                ArrayList arrayList = new ArrayList();
                for (Annotation annotation : annotations) {
                    if (!d0.f19785d.contains(g8.a.D(g8.a.y(annotation)).getName())) {
                        arrayList.add(annotation);
                    }
                }
                return f2.l(arrayList);
            case 7:
                Class cls2 = d0Var.f19786b;
                if (cls2.isAnonymousClass()) {
                    return null;
                }
                be.b bVarR2 = d0Var.r();
                if (!bVarR2.f2742c) {
                    String strB = bVarR2.f().b();
                    jc.l.d(strB, "asString(...)");
                    return strB;
                }
                String simpleName = cls2.getSimpleName();
                Method enclosingMethod = cls2.getEnclosingMethod();
                if (enclosingMethod != null) {
                    return ef.n.P0(simpleName, enclosingMethod.getName() + '$');
                }
                Constructor<?> enclosingConstructor = cls2.getEnclosingConstructor();
                if (enclosingConstructor == null) {
                    return ef.n.O0('$', simpleName, simpleName);
                }
                return ef.n.P0(simpleName, enclosingConstructor.getName() + '$');
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_DALVIK /* 8 */:
                if (d0Var.f19786b.isAnonymousClass()) {
                    return null;
                }
                be.b bVarR3 = d0Var.r();
                if (bVarR3.f2742c) {
                    return null;
                }
                return bVarR3.a().f2744a.f2747a;
            default:
                Collection collectionF = d0Var.f();
                ArrayList arrayList2 = new ArrayList(vb.n.K(collectionF, 10));
                Iterator it = collectionF.iterator();
                while (it.hasNext()) {
                    arrayList2.add(new k0(d0Var, (yc.j) it.next()));
                }
                return arrayList2;
        }
    }

    public v(d0 d0Var, a0 a0Var) {
        this.f19886a = 7;
        this.f19887b = d0Var;
    }
}
