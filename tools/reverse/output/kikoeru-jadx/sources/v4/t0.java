package v4;

import android.os.Handler;
import j5.f1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import m4.i1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w4.k f22636a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final c0 f22640e;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final w4.d f22643h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final p4.x f22644i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f22646k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public s4.f0 f22647l;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public f1 f22645j = new f1();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final IdentityHashMap f22638c = new IdentityHashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashMap f22639d = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f22637b = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final HashMap f22641f = new HashMap();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final HashSet f22642g = new HashSet();

    public t0(c0 c0Var, w4.d dVar, p4.x xVar, w4.k kVar) {
        this.f22636a = kVar;
        this.f22640e = c0Var;
        this.f22643h = dVar;
        this.f22644i = xVar;
    }

    public final i1 a(int i10, ArrayList arrayList, f1 f1Var) {
        if (!arrayList.isEmpty()) {
            this.f22645j = f1Var;
            for (int i11 = i10; i11 < arrayList.size() + i10; i11++) {
                s0 s0Var = (s0) arrayList.get(i11 - i10);
                ArrayList arrayList2 = this.f22637b;
                if (i11 > 0) {
                    s0 s0Var2 = (s0) arrayList2.get(i11 - 1);
                    s0Var.f22630d = s0Var2.f22627a.f10481o.f10410e.o() + s0Var2.f22630d;
                    s0Var.f22631e = false;
                    s0Var.f22629c.clear();
                } else {
                    s0Var.f22630d = 0;
                    s0Var.f22631e = false;
                    s0Var.f22629c.clear();
                }
                int iO = s0Var.f22627a.f10481o.f10410e.o();
                for (int i12 = i11; i12 < arrayList2.size(); i12++) {
                    ((s0) arrayList2.get(i12)).f22630d += iO;
                }
                arrayList2.add(i11, s0Var);
                this.f22639d.put(s0Var.f22628b, s0Var);
                if (this.f22646k) {
                    e(s0Var);
                    if (this.f22638c.isEmpty()) {
                        this.f22642g.add(s0Var);
                    } else {
                        r0 r0Var = (r0) this.f22641f.get(s0Var);
                        if (r0Var != null) {
                            r0Var.f22623a.d(r0Var.f22624b);
                        }
                    }
                }
            }
        }
        return b();
    }

    public final i1 b() {
        ArrayList arrayList = this.f22637b;
        if (arrayList.isEmpty()) {
            return i1.f14291a;
        }
        int iO = 0;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            s0 s0Var = (s0) arrayList.get(i10);
            s0Var.f22630d = iO;
            iO += s0Var.f22627a.f10481o.f10410e.o();
        }
        return new y0(arrayList, this.f22645j);
    }

    public final void c() {
        Iterator it = this.f22642g.iterator();
        while (it.hasNext()) {
            s0 s0Var = (s0) it.next();
            if (s0Var.f22629c.isEmpty()) {
                r0 r0Var = (r0) this.f22641f.get(s0Var);
                if (r0Var != null) {
                    r0Var.f22623a.d(r0Var.f22624b);
                }
                it.remove();
            }
        }
    }

    public final void d(s0 s0Var) {
        if (s0Var.f22631e && s0Var.f22629c.isEmpty()) {
            r0 r0Var = (r0) this.f22641f.remove(s0Var);
            r0Var.getClass();
            q0 q0Var = r0Var.f22625c;
            j5.a aVar = r0Var.f22623a;
            aVar.p(r0Var.f22624b);
            aVar.s(q0Var);
            aVar.r(q0Var);
            this.f22642g.remove(s0Var);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [j5.e0, v4.l0] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void e(s0 s0Var) {
        j5.y yVar = s0Var.f22627a;
        ?? r12 = new j5.e0() { // from class: v4.l0
            @Override // j5.e0
            public final void a(j5.a aVar, i1 i1Var) {
                p4.x xVar = this.f22567a.f22640e.f22415h;
                xVar.d(2);
                xVar.e(22);
            }
        };
        q0 q0Var = new q0(this, s0Var);
        this.f22641f.put(s0Var, new r0(yVar, r12, q0Var));
        Handler handlerO = p4.c0.o(null);
        yVar.getClass();
        ah.j jVar = yVar.f10204c;
        jVar.getClass();
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) jVar.f392d;
        j5.i0 i0Var = new j5.i0();
        i0Var.f10303a = handlerO;
        i0Var.f10304b = q0Var;
        copyOnWriteArrayList.add(i0Var);
        Handler handlerO2 = p4.c0.o(null);
        b5.q qVar = yVar.f10205d;
        qVar.getClass();
        CopyOnWriteArrayList copyOnWriteArrayList2 = qVar.f1595c;
        b5.p pVar = new b5.p();
        pVar.f1591a = handlerO2;
        pVar.f1592b = q0Var;
        copyOnWriteArrayList2.add(pVar);
        yVar.l(r12, this.f22647l, this.f22636a);
    }

    public final void f(j5.b0 b0Var) {
        IdentityHashMap identityHashMap = this.f22638c;
        s0 s0Var = (s0) identityHashMap.remove(b0Var);
        s0Var.getClass();
        s0Var.f22627a.o(b0Var);
        s0Var.f22629c.remove(((j5.v) b0Var).f10446a);
        if (!identityHashMap.isEmpty()) {
            c();
        }
        d(s0Var);
    }

    public final void g(int i10, int i11) {
        for (int i12 = i11 - 1; i12 >= i10; i12--) {
            ArrayList arrayList = this.f22637b;
            s0 s0Var = (s0) arrayList.remove(i12);
            this.f22639d.remove(s0Var.f22628b);
            int i13 = -s0Var.f22627a.f10481o.f10410e.o();
            for (int i14 = i12; i14 < arrayList.size(); i14++) {
                ((s0) arrayList.get(i14)).f22630d += i13;
            }
            s0Var.f22631e = true;
            if (this.f22646k) {
                d(s0Var);
            }
        }
    }
}
