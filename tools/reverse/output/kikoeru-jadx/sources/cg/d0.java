package cg;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.SuspendPointerInputElement;
import b0.o1;
import com.tencent.bugly.beta.tinker.TinkerReport;
import g2.g1;
import g2.u0;
import g2.x0;
import h0.l1;
import l0.p0;
import r.q1;
import x0.n2;
import x0.r0;
import x0.w0;
import y.e1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class d0 extends jc.m implements ic.o {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f4011b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f4012c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f4013d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d0(int i10, Object obj, Object obj2) {
        super(3);
        this.f4011b = i10;
        this.f4012c = obj;
        this.f4013d = obj2;
    }

    /* JADX WARN: Type inference failed for: r13v35, types: [ic.k, jc.m] */
    /* JADX WARN: Type inference failed for: r13v56, types: [ic.k, jc.m] */
    /* JADX WARN: Type inference failed for: r1v33, types: [ic.a, jc.m] */
    /* JADX WARN: Type inference failed for: r2v21, types: [ic.k, jc.m] */
    @Override // ic.o
    public final Object g(Object obj, Object obj2, Object obj3) {
        switch (this.f4011b) {
            case 0:
                x0.o oVar = (x0.o) obj2;
                ((Number) obj3).intValue();
                jc.l.e((q.u) obj, "$this$AnimatedVisibility");
                a.a.b((e1) this.f4012c, f1.g.b(oVar, 1784154471, new z((v) this.f4013d, 1)), oVar, 48);
                break;
            case 1:
                ((Number) obj3).intValue();
                jc.l.e((q.u) obj, "$this$AnimatedVisibility");
                w1.f fVar = (w1.f) this.f4012c;
                o0 o0Var = (o0) this.f4013d;
                pc.f0.a(fVar, String.valueOf(((Boolean) o0Var.f4091b.getValue()).booleanValue()), ((Number) o0Var.f4093d.getValue()).intValue(), (x0.o) obj2, 0);
                break;
            case 2:
                float fFloatValue = ((Number) obj).floatValue();
                float fFloatValue2 = ((Number) obj2).floatValue();
                float fFloatValue3 = ((Number) obj3).floatValue();
                d0.d dVar = (d0.d) this.f4012c;
                f3.m mVar = (f3.m) this.f4013d;
                boolean zU = ud.b.u(dVar, fFloatValue);
                if (dVar.k().f5415e != u.e1.f20882a && mVar != f3.m.f6667a) {
                    zU = !zU;
                }
                int i10 = dVar.k().f5412b;
                float fM = i10 == 0 ? 0.0f : ud.b.m(dVar) / i10;
                float f10 = fM - ((int) fM);
                char c3 = Math.abs(fFloatValue) >= dVar.f5324q.Q(v.j.f22127a) ? fFloatValue > 0.0f ? (char) 1 : (char) 2 : (char) 0;
                if (c3 == 0) {
                    fFloatValue2 = Math.abs(f10) > 0.5f ? fFloatValue3 : fFloatValue3;
                } else if (c3 != 1) {
                    if (c3 != 2) {
                        fFloatValue2 = 0.0f;
                    }
                }
                break;
            case 3:
                x0.o oVar2 = (x0.o) obj2;
                ((Number) obj3).intValue();
                w.k kVar = (w.k) this.f4013d;
                oVar2.W(-102778667);
                Object objK = oVar2.K();
                r0 r0Var = x0.k.f24334a;
                if (objK == r0Var) {
                    objK = x0.v.m(oVar2);
                    oVar2.h0(objK);
                }
                hf.y yVar = (hf.y) objK;
                Object objK2 = oVar2.K();
                if (objK2 == r0Var) {
                    objK2 = x0.v.v(null);
                    oVar2.h0(objK2);
                }
                w0 w0Var = (w0) objK2;
                w0 w0VarY = x0.v.y((ic.k) this.f4012c, oVar2);
                boolean zF = oVar2.f(kVar);
                Object objK3 = oVar2.K();
                if (zF || objK3 == r0Var) {
                    objK3 = new o1(10, w0Var, kVar);
                    oVar2.h0(objK3);
                }
                x0.v.c(kVar, (ic.k) objK3, oVar2);
                w.k kVar2 = (w.k) this.f4013d;
                boolean zH = oVar2.h(yVar) | oVar2.f(kVar) | oVar2.f(w0VarY);
                Object objK4 = oVar2.K();
                if (zH || objK4 == r0Var) {
                    objK4 = new l1(yVar, w0Var, kVar, w0VarY);
                    oVar2.h0(objK4);
                }
                SuspendPointerInputElement suspendPointerInputElement = new SuspendPointerInputElement(kVar2, null, null, (PointerInputEventHandler) objK4, 6);
                oVar2.p(false);
                break;
            case 4:
                x0.o oVar3 = (x0.o) obj2;
                ((Number) obj3).intValue();
                oVar3.W(759876635);
                ic.a aVar = (ic.a) this.f4012c;
                Object objK5 = oVar3.K();
                r0 r0Var2 = x0.k.f24334a;
                if (objK5 == r0Var2) {
                    objK5 = x0.v.o(aVar);
                    oVar3.h0(objK5);
                }
                n2 n2Var = (n2) objK5;
                Object objK6 = oVar3.K();
                if (objK6 == r0Var2) {
                    objK6 = new r.c(new p1.b(((p1.b) n2Var.getValue()).f16481a), p0.f11592b, new p1.b(p0.f11593c), 8);
                    oVar3.h0(objK6);
                }
                r.c cVar = (r.c) objK6;
                boolean zH2 = oVar3.h(cVar);
                Object objK7 = oVar3.K();
                if (zH2 || objK7 == r0Var2) {
                    objK7 = new b0.x(n2Var, cVar, (yb.c) null, 15);
                    oVar3.h0(objK7);
                }
                x0.v.e((ic.n) objK7, ub.a0.f21526a, oVar3);
                r.k kVar3 = cVar.f18333c;
                ic.k kVar4 = (ic.k) this.f4013d;
                boolean zF2 = oVar3.f(kVar3);
                Object objK8 = oVar3.K();
                if (zF2 || objK8 == r0Var2) {
                    objK8 = new l0.o0(kVar3, 0);
                    oVar3.h0(objK8);
                }
                j1.q qVar = (j1.q) kVar4.a((ic.a) objK8);
                oVar3.p(false);
                break;
            case 5:
                x0 x0Var = (x0) obj;
                g1 g1VarV = ((u0) obj2).v(((f3.a) obj3).f6651a);
                long j10 = (!x0Var.O() || ((Boolean) ((jc.m) this.f4012c).a(((q1) this.f4013d).f18542d.getValue())).booleanValue()) ? (((long) g1VarV.f7180a) << 32) | (((long) g1VarV.f7181b) & 4294967295L) : 0L;
                break;
            case 6:
                x0.o oVar4 = (x0.o) obj2;
                ((Number) obj3).intValue();
                oVar4.W(-353972293);
                s.n0 n0VarA = ((s.m0) this.f4012c).a((w.k) this.f4013d, oVar4);
                boolean zF3 = oVar4.f(n0VarA);
                Object objK9 = oVar4.K();
                if (zF3 || objK9 == x0.k.f24334a) {
                    objK9 = new s.p0(n0VarA);
                    oVar4.h0(objK9);
                }
                s.p0 p0Var = (s.p0) objK9;
                oVar4.p(false);
                break;
            case 7:
                t.c cVar2 = (t.c) obj;
                x0.o oVar5 = (x0.o) obj2;
                int iIntValue = ((Number) obj3).intValue();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= oVar5.f(cVar2) ? 4 : 2;
                }
                if (oVar5.N(iIntValue & 1, (iIntValue & 19) != 18)) {
                    String str = (String) ((d) this.f4012c).q(oVar5, 0);
                    if (ef.n.y0(str)) {
                        x.a.c("Label must not be blank");
                    }
                    t.m.b(str, cVar2, (jc.m) this.f4013d, oVar5, (iIntValue << 6) & 896);
                } else {
                    oVar5.Q();
                }
                break;
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_DALVIK /* 8 */:
                x0.o oVar6 = (x0.o) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                if (oVar6.N(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    Object objK10 = oVar6.K();
                    if (objK10 == x0.k.f24334a) {
                        objK10 = new t.g();
                        oVar6.h0(objK10);
                    }
                    t.g gVar = (t.g) objK10;
                    ?? r13 = (jc.m) this.f4012c;
                    t.c cVar3 = (t.c) this.f4013d;
                    gVar.f20071a.clear();
                    r13.a(gVar);
                    gVar.a(cVar3, oVar6, 0);
                } else {
                    oVar6.Q();
                }
                break;
            default:
                c2.t tVar = (c2.t) obj;
                c2.t tVar2 = (c2.t) obj2;
                long j11 = ((p1.b) obj3).f16481a;
                u.k0 k0Var = (u.k0) this.f4012c;
                if (((Boolean) k0Var.f20976r.a(tVar)).booleanValue()) {
                    if (!k0Var.f20981w) {
                        if (k0Var.f20979u == null) {
                            k0Var.f20979u = g8.a.c(Integer.MAX_VALUE, 6, null);
                        }
                        k0Var.f20981w = true;
                        hf.a0.y(k0Var.n0(), null, null, new u.j0(k0Var, null), 3);
                    }
                    lc.b.j((d2.e) this.f4013d, tVar);
                    long jH = p1.b.h(tVar2.f3324c, j11);
                    kf.f fVar2 = k0Var.f20979u;
                    if (fVar2 != null) {
                        fVar2.e(new u.n(jH));
                    }
                }
                break;
        }
        return ub.a0.f21526a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public d0(d dVar, ic.a aVar) {
        super(3);
        this.f4011b = 7;
        this.f4012c = dVar;
        this.f4013d = (jc.m) aVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public d0(ic.k kVar, q1 q1Var) {
        super(3);
        this.f4011b = 5;
        this.f4012c = (jc.m) kVar;
        this.f4013d = q1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public d0(ic.k kVar, t.c cVar) {
        super(3);
        this.f4011b = 8;
        this.f4012c = (jc.m) kVar;
        this.f4013d = cVar;
    }
}
