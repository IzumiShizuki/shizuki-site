package androidx.lifecycle;

import ba.f1;
import ba.z0;
import com.tencent.bugly.beta.tinker.TinkerReport;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class r extends ac.i implements ic.n {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f807e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f808f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f809g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(int i10, Object obj, yb.c cVar) {
        super(2, cVar);
        this.f807e = i10;
        this.f809g = obj;
    }

    /* JADX WARN: Type inference failed for: r1v23, types: [ac.i, ic.n] */
    @Override // ac.a
    public final yb.c o(Object obj, yb.c cVar) {
        switch (this.f807e) {
            case 0:
                r rVar = new r(0, (s) this.f809g, cVar);
                rVar.f808f = obj;
                return rVar;
            case 1:
                return new r((z0) this.f808f, (ba.k0) this.f809g, cVar, 1);
            case 2:
                return new r((z0) this.f808f, (f1) this.f809g, cVar, 2);
            case 3:
                return new r((cg.v) this.f808f, (wa.a) this.f809g, cVar, 3);
            case 4:
                return new r((da.m0) this.f808f, (Map) this.f809g, cVar, 4);
            case 5:
                r rVar2 = new r(5, (n0) this.f809g, cVar);
                rVar2.f808f = obj;
                return rVar2;
            case 6:
                r rVar3 = new r(6, (a9.n) this.f809g, cVar);
                rVar3.f808f = obj;
                return rVar3;
            case 7:
                r rVar4 = new r(7, (j0.h) this.f809g, cVar);
                rVar4.f808f = obj;
                return rVar4;
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_DALVIK /* 8 */:
                return new r((hf.y) this.f808f, (x0.w0) this.f809g, cVar, 8);
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_ART /* 9 */:
                return new r((m9.c) this.f808f, (ic.a) this.f809g, cVar, 9);
            case TinkerReport.KEY_APPLY_WITH_RETRY /* 10 */:
                r rVar5 = new r(10, (ArrayList) this.f809g, cVar);
                rVar5.f808f = obj;
                return rVar5;
            case 11:
                r rVar6 = new r((ac.i) this.f809g, cVar);
                rVar6.f808f = obj;
                return rVar6;
            case 12:
                return new r((String) this.f808f, (fg.f) this.f809g, cVar, 12);
            case 13:
                r rVar7 = new r(13, (String) this.f809g, cVar);
                rVar7.f808f = obj;
                return rVar7;
            default:
                return new r((String) this.f808f, (String) this.f809g, cVar, 14);
        }
    }

    @Override // ic.n
    public final Object q(Object obj, Object obj2) throws Throwable {
        switch (this.f807e) {
            case 0:
                r rVar = (r) o((hf.y) obj, (yb.c) obj2);
                ub.a0 a0Var = ub.a0.f21526a;
                rVar.u(a0Var);
                return a0Var;
            case 1:
                r rVar2 = (r) o((hf.y) obj, (yb.c) obj2);
                ub.a0 a0Var2 = ub.a0.f21526a;
                rVar2.u(a0Var2);
                return a0Var2;
            case 2:
                r rVar3 = (r) o((hf.y) obj, (yb.c) obj2);
                ub.a0 a0Var3 = ub.a0.f21526a;
                rVar3.u(a0Var3);
                return a0Var3;
            case 3:
                r rVar4 = (r) o((hf.y) obj, (yb.c) obj2);
                ub.a0 a0Var4 = ub.a0.f21526a;
                rVar4.u(a0Var4);
                return a0Var4;
            case 4:
                r rVar5 = (r) o((hf.y) obj, (yb.c) obj2);
                ub.a0 a0Var5 = ub.a0.f21526a;
                rVar5.u(a0Var5);
                return a0Var5;
            case 5:
                return ((r) o((hf.y) obj, (yb.c) obj2)).u(ub.a0.f21526a);
            case 6:
                return ((r) o(obj, (yb.c) obj2)).u(ub.a0.f21526a);
            case 7:
                return ((r) o((hf.y) obj, (yb.c) obj2)).u(ub.a0.f21526a);
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_DALVIK /* 8 */:
                r rVar6 = (r) o((hf.y) obj, (yb.c) obj2);
                ub.a0 a0Var6 = ub.a0.f21526a;
                rVar6.u(a0Var6);
                return a0Var6;
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_ART /* 9 */:
                return ((r) o((hf.y) obj, (yb.c) obj2)).u(ub.a0.f21526a);
            case TinkerReport.KEY_APPLY_WITH_RETRY /* 10 */:
                return ((r) o((hf.y) obj, (yb.c) obj2)).u(ub.a0.f21526a);
            case 11:
                return ((r) o((hf.y) obj, (yb.c) obj2)).u(ub.a0.f21526a);
            case 12:
                r rVar7 = (r) o((hf.y) obj, (yb.c) obj2);
                ub.a0 a0Var7 = ub.a0.f21526a;
                rVar7.u(a0Var7);
                return a0Var7;
            case 13:
                ((r) o((bg.p) obj, (yb.c) obj2)).u(ub.a0.f21526a);
                return Boolean.TRUE;
            default:
                r rVar8 = (r) o((hf.y) obj, (yb.c) obj2);
                ub.a0 a0Var8 = ub.a0.f21526a;
                rVar8.u(a0Var8);
                return a0Var8;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x0190, code lost:
    
        return r7.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0194, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0195, code lost:
    
        r5.m();
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0199, code lost:
    
        throw r0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v12, types: [ac.i, ic.n] */
    @Override // ac.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object u(java.lang.Object r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 594
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.r.u(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public r(ic.n nVar, yb.c cVar) {
        super(2, cVar);
        this.f807e = 11;
        this.f809g = (ac.i) nVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(Object obj, Object obj2, yb.c cVar, int i10) {
        super(2, cVar);
        this.f807e = i10;
        this.f808f = obj;
        this.f809g = obj2;
    }
}
