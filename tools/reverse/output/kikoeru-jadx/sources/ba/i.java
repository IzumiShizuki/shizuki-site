package ba;

import android.view.View;
import com.tencent.bugly.beta.tinker.TinkerReport;
import java.util.List;
import m0.f2;
import m0.t2;
import m0.u2;
import r.m1;
import r.p1;
import x0.n2;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i implements ic.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2379a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2380b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f2381c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f2382d;

    public /* synthetic */ i(ic.k kVar, x0.w0 w0Var, hg.b bVar) {
        this.f2379a = 14;
        this.f2381c = kVar;
        this.f2380b = w0Var;
        this.f2382d = bVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ic.k
    public final Object a(Object obj) {
        int i10 = this.f2379a;
        int i11 = 5;
        int i12 = 6;
        boolean z10 = false;
        Object[] objArr = 0;
        yb.c cVar = null;
        int i13 = 3;
        int i14 = 1;
        ub.a0 a0Var = ub.a0.f21526a;
        Object obj2 = this.f2382d;
        Object obj3 = this.f2381c;
        Object obj4 = this.f2380b;
        switch (i10) {
            case 0:
                jc.l.e((h0.r0) obj, "$this$KeyboardActions");
                ((ic.k) obj3).a((String) ((n2) obj2).getValue());
                j2.h0.c((o1.i) obj4);
                return a0Var;
            case 1:
                e.c cVar2 = (e.c) obj2;
                ((d.j0) obj4).a((androidx.lifecycle.x) obj3, cVar2);
                return new b0.h0(i11, cVar2);
            case 2:
                e.k kVar = (e.k) obj2;
                ((d.j0) obj4).a((androidx.lifecycle.x) obj3, kVar);
                return new b0.h0(i12, kVar);
            case 3:
                h1.s sVar = (h1.s) obj4;
                e7.j jVar = (e7.j) obj3;
                sVar.add(jVar);
                return new f7.m((f7.q) obj2, jVar, sVar, objArr == true ? 1 : 0);
            case 4:
                g1.e eVar = (g1.e) obj4;
                g1.j jVar2 = (g1.j) obj2;
                o.k0 k0Var = eVar.f7140b;
                if (!k0Var.b(obj3)) {
                    eVar.f7139a.remove(obj3);
                    k0Var.m(obj3, jVar2);
                    return new f7.m(eVar, obj3, jVar2, i14);
                }
                throw new IllegalArgumentException(("Key " + obj3 + " was used multiple times ").toString());
            case 5:
                f2 f2Var = (f2) obj3;
                g2.g1 g1Var = (g2.g1) obj2;
                g2.f1 f1Var = (g2.f1) obj;
                float fC = ((g2.x0) obj4).O() ? f2Var.f12971o.d().c(f2Var.f12971o.f13852h.getValue()) : f2Var.f12971o.f();
                u.e1 e1Var = f2Var.f12973q;
                float f10 = e1Var == u.e1.f20883b ? fC : 0.0f;
                if (e1Var != u.e1.f20882a) {
                    fC = 0.0f;
                }
                f1Var.h(g1Var, lc.b.R(f10), lc.b.R(fC), 0.0f);
                return a0Var;
            case 6:
                t2 t2Var = (t2) obj3;
                hf.y yVar = (hf.y) obj2;
                q2.k kVar2 = (q2.k) obj;
                pc.u[] uVarArr = q2.v.f17698a;
                q2.w wVar = q2.t.f17673d;
                pc.u uVar = q2.v.f17698a[2];
                wVar.a(kVar2, (String) obj4);
                if (((u2) t2Var.f13649a.f13851g.getValue()) == u2.f13691b) {
                    q2.v.b(kVar2, new a9.d(20, t2Var, yVar, z10));
                }
                return a0Var;
            case 7:
                n2 n2Var = (n2) obj2;
                q1.i0 i0Var = (q1.i0) obj;
                i0Var.f(((Number) n2Var.getValue()).floatValue());
                i0Var.g(((Number) n2Var.getValue()).floatValue());
                i0Var.b(((Number) ((n2) obj3).getValue()).floatValue());
                i0Var.k(((q1.p0) ((x0.w0) obj4).getValue()).f17568a);
                return a0Var;
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_DALVIK /* 8 */:
                hf.a0.y((hf.y) obj4, null, null, new lf.w0((u.o0) obj3, (x0.w0) obj2, cVar, i13), 3);
                return a0Var;
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_ART /* 9 */:
                x0.w0 w0Var = (x0.w0) obj4;
                x0.w0 w0Var2 = (x0.w0) obj3;
                x0.w0 w0Var3 = (x0.w0) obj2;
                p1.b bVar = (p1.b) obj;
                if (((Number) w0Var.getValue()).floatValue() == 1.0f) {
                    w0Var.setValue(Float.valueOf(2.0f));
                    w0Var3.setValue(new p1.b(p1.b.h(p1.b.b(2.0f, ((p1.b) w0Var2.getValue()).f16481a), bVar.f16481a)));
                } else {
                    w0Var.setValue(Float.valueOf(1.0f));
                    w0Var3.setValue(new p1.b(0L));
                }
                return a0Var;
            case TinkerReport.KEY_APPLY_WITH_RETRY /* 10 */:
                hf.a0.y((hf.y) obj4, null, null, new a0.y(((Integer) obj).intValue(), (k0) obj3, (c0.z) obj2, null, 4), 3);
                return a0Var;
            case 11:
                List list = (List) obj;
                jc.l.e(list, "it");
                hf.a0.y((hf.y) obj4, null, null, new q.q(list, (bg.p) obj3, (q9.o) obj2, null, 2), 3);
                return a0Var;
            case 12:
                s0.i iVar = (s0.i) obj4;
                iVar.f19329k.addView(iVar, iVar.f19330l);
                iVar.i((ic.a) obj3, (f3.m) obj2);
                return new b0.h0(15, iVar);
            case 13:
                x0.w0 w0Var4 = (x0.w0) obj4;
                a0.j jVar3 = (a0.j) obj;
                jc.l.e(jVar3, "$this$LazyColumn");
                List list2 = (List) w0Var4.getValue();
                jVar3.m(list2.size(), new p1(12, new t2.x(23), list2), new v(4, list2), new f1.f(new u9.g(list2, (uh.y) obj3, w0Var4, (View) obj2, 0), -1091073711, true));
                return a0Var;
            case 14:
                ic.k kVar3 = (ic.k) obj3;
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                ((x0.w0) obj4).setValue(bool);
                ((hg.b) obj2).e(bool, z8.n.f26582a[0]);
                if (kVar3 != null) {
                    kVar3.a(bool);
                }
                return a0Var;
            case 15:
                a0.j jVar4 = (a0.j) obj;
                jc.l.e(jVar4, "$this$LazyColumn");
                List list3 = (List) ((x0.w0) obj4).getValue();
                jVar4.m(list3.size(), null, new v(5, list3), new f1.f(new w(list3, (hf.y) obj3, (z9.r) obj2, i14), -632812321, true));
                return a0Var;
            default:
                z9.r rVar = (z9.r) obj4;
                a0.j jVar5 = (a0.j) obj;
                jc.l.e(jVar5, "$this$LazyColumn");
                List list4 = (List) rVar.f26665m.getValue();
                jVar5.m(list4.size(), null, new v(6, list4), new f1.f(new u9.g(list4, rVar, (a0.g0) obj3, (e7.a0) obj2, 1), -1091073711, true));
                return a0Var;
        }
    }

    public /* synthetic */ i(Object obj, Object obj2, Object obj3, int i10) {
        this.f2379a = i10;
        this.f2380b = obj;
        this.f2381c = obj2;
        this.f2382d = obj3;
    }

    public /* synthetic */ i(s0.i iVar, ic.a aVar, String str, f3.m mVar) {
        this.f2379a = 12;
        this.f2380b = iVar;
        this.f2381c = aVar;
        this.f2382d = mVar;
    }

    public /* synthetic */ i(x0.w0 w0Var, m1 m1Var, m1 m1Var2) {
        this.f2379a = 7;
        this.f2380b = w0Var;
        this.f2382d = m1Var;
        this.f2381c = m1Var2;
    }
}
