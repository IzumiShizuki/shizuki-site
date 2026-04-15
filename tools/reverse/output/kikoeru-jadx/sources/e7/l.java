package e7;

import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import lf.b1;
import lf.p0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g5.w f6353a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b1 f6354b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b1 f6355c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f6356d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final lf.k0 f6357e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final lf.k0 f6358f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final m0 f6359g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ a0 f6360h;

    public l(a0 a0Var, m0 m0Var) {
        jc.l.e(m0Var, "navigator");
        this.f6360h = a0Var;
        this.f6353a = new g5.w(16);
        b1 b1VarC = p0.c(vb.r.f22819a);
        this.f6354b = b1VarC;
        b1 b1VarC2 = p0.c(vb.t.f22821a);
        this.f6355c = b1VarC2;
        this.f6357e = new lf.k0(b1VarC);
        this.f6358f = new lf.k0(b1VarC2);
        this.f6359g = m0Var;
    }

    public final void a(j jVar) {
        jc.l.e(jVar, "backStackEntry");
        synchronized (this.f6353a) {
            b1 b1Var = this.f6354b;
            ArrayList arrayListR0 = vb.m.r0((Collection) b1Var.getValue(), jVar);
            b1Var.getClass();
            b1Var.m(null, arrayListR0);
        }
    }

    public final j b(u uVar, Bundle bundle) {
        h7.g gVar = this.f6360h.f6299b;
        gVar.getClass();
        return pe.d.C(gVar.f8159a.f6300c, uVar, bundle, gVar.h(), gVar.f8173o);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x007f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(e7.j r9) {
        /*
            r8 = this;
            java.lang.String r0 = "entry"
            jc.l.e(r9, r0)
            e7.a0 r0 = r8.f6360h
            h7.g r0 = r0.f6299b
            lf.b1 r1 = r0.f8166h
            java.lang.String r2 = r9.f6338f
            java.util.LinkedHashMap r3 = r0.f8181w
            java.lang.Object r4 = r3.get(r9)
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
            boolean r4 = jc.l.a(r4, r5)
            lf.b1 r5 = r8.f6355c
            java.lang.Object r6 = r5.getValue()
            java.util.Set r6 = (java.util.Set) r6
            java.util.LinkedHashSet r6 = ud.e.G(r6, r9)
            r7 = 0
            r5.m(r7, r6)
            r3.remove(r9)
            vb.j r3 = r0.f8164f
            boolean r5 = r3.contains(r9)
            if (r5 != 0) goto L90
            r0.q(r9)
            h7.c r5 = r9.f6340h
            androidx.lifecycle.z r5 = r5.f8143j
            androidx.lifecycle.p r5 = r5.f826d
            androidx.lifecycle.p r6 = androidx.lifecycle.p.f796c
            int r5 = r5.compareTo(r6)
            if (r5 < 0) goto L4a
            androidx.lifecycle.p r5 = androidx.lifecycle.p.f794a
            r9.g(r5)
        L4a:
            boolean r9 = r3.isEmpty()
            if (r9 == 0) goto L51
            goto L6a
        L51:
            java.util.Iterator r9 = r3.iterator()
        L55:
            boolean r3 = r9.hasNext()
            if (r3 == 0) goto L6a
            java.lang.Object r3 = r9.next()
            e7.j r3 = (e7.j) r3
            java.lang.String r3 = r3.f6338f
            boolean r3 = jc.l.a(r3, r2)
            if (r3 == 0) goto L55
            goto L82
        L6a:
            if (r4 != 0) goto L82
            e7.m r9 = r0.f8173o
            if (r9 == 0) goto L82
            java.lang.String r3 = "backStackEntryId"
            jc.l.e(r2, r3)
            java.util.LinkedHashMap r9 = r9.f6361b
            java.lang.Object r9 = r9.remove(r2)
            androidx.lifecycle.w0 r9 = (androidx.lifecycle.w0) r9
            if (r9 == 0) goto L82
            r9.a()
        L82:
            r0.r()
            java.util.ArrayList r9 = r0.o()
            r1.getClass()
            r1.m(r7, r9)
            return
        L90:
            boolean r9 = r8.f6356d
            if (r9 != 0) goto Lad
            r0.r()
            lf.b1 r9 = r0.f8165g
            java.util.ArrayList r2 = vb.m.H0(r3)
            r9.getClass()
            r9.m(r7, r2)
            java.util.ArrayList r9 = r0.o()
            r1.getClass()
            r1.m(r7, r9)
        Lad:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e7.l.c(e7.j):void");
    }

    public final void d(j jVar, boolean z10) {
        h7.g gVar = this.f6360h.f6299b;
        a9.d dVar = new a9.d(this, jVar, z10);
        gVar.getClass();
        m0 m0VarB = gVar.f8177s.b(jVar.f6334b.f6399a);
        gVar.f8181w.put(jVar, Boolean.valueOf(z10));
        if (!m0VarB.equals(this.f6359g)) {
            Object obj = gVar.f8178t.get(m0VarB);
            jc.l.b(obj);
            ((l) obj).d(jVar, z10);
            return;
        }
        h7.e eVar = gVar.f8180v;
        if (eVar != null) {
            eVar.a(jVar);
            dVar.b();
            return;
        }
        vb.j jVar2 = gVar.f8164f;
        int iIndexOf = jVar2.indexOf(jVar);
        if (iIndexOf < 0) {
            String str = "Ignoring pop of " + jVar + " as it was not found on the current back stack";
            jc.l.e(str, "message");
            Log.i("NavController", str);
            return;
        }
        int i10 = iIndexOf + 1;
        if (i10 != jVar2.f22816c) {
            gVar.l(true, ((j) jVar2.get(i10)).f6334b.f6400b.f8187a, false);
        }
        h7.g.n(gVar, jVar);
        dVar.b();
        gVar.f8160b.b();
        gVar.b();
    }

    public final void e(j jVar, boolean z10) {
        Object objPrevious;
        b1 b1Var = this.f6355c;
        Iterable iterable = (Iterable) b1Var.getValue();
        boolean z11 = iterable instanceof Collection;
        lf.k0 k0Var = this.f6357e;
        if (!z11 || !((Collection) iterable).isEmpty()) {
            Iterator it = iterable.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (((j) it.next()) == jVar) {
                    Iterable iterable2 = (Iterable) k0Var.f12434a.getValue();
                    if ((iterable2 instanceof Collection) && ((Collection) iterable2).isEmpty()) {
                        return;
                    }
                    Iterator it2 = iterable2.iterator();
                    while (it2.hasNext()) {
                        if (((j) it2.next()) == jVar) {
                        }
                    }
                    return;
                }
            }
        }
        b1Var.m(null, ud.e.K((Set) b1Var.getValue(), jVar));
        b1 b1Var2 = k0Var.f12434a;
        b1 b1Var3 = k0Var.f12434a;
        List list = (List) b1Var2.getValue();
        ListIterator listIterator = list.listIterator(list.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            }
            objPrevious = listIterator.previous();
            j jVar2 = (j) objPrevious;
            if (!jc.l.a(jVar2, jVar) && ((List) b1Var3.getValue()).lastIndexOf(jVar2) < ((List) b1Var3.getValue()).lastIndexOf(jVar)) {
                break;
            }
        }
        j jVar3 = (j) objPrevious;
        if (jVar3 != null) {
            b1Var.m(null, ud.e.K((Set) b1Var.getValue(), jVar3));
        }
        d(jVar, z10);
    }

    public final void f(j jVar) {
        jc.l.e(jVar, "backStackEntry");
        h7.g gVar = this.f6360h.f6299b;
        gVar.getClass();
        m0 m0VarB = gVar.f8177s.b(jVar.f6334b.f6399a);
        if (!m0VarB.equals(this.f6359g)) {
            Object obj = gVar.f8178t.get(m0VarB);
            if (obj == null) {
                throw new IllegalStateException(j2.h0.n(new StringBuilder("NavigatorBackStack for "), jVar.f6334b.f6399a, " should already be created").toString());
            }
            ((l) obj).f(jVar);
            return;
        }
        ic.k kVar = gVar.f8179u;
        if (kVar != null) {
            kVar.a(jVar);
            a(jVar);
            return;
        }
        String str = "Ignoring add of destination " + jVar.f6334b + " outside of the call to navigate(). ";
        jc.l.e(str, "message");
        Log.i("NavController", str);
    }
}
