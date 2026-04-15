package lf;

import com.tencent.bugly.beta.tinker.TinkerReport;
import i7.c2;
import i7.r1;
import m0.k3;
import m0.s1;
import r.u1;
import u.i1;
import x0.l1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class w0 extends ac.i implements ic.n {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f12512e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f12513f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f12514g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f12515h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w0(int i10, Object obj, yb.c cVar) {
        super(2, cVar);
        this.f12512e = i10;
        this.f12515h = obj;
    }

    /* JADX WARN: Type inference failed for: r1v19, types: [ac.i, ic.n] */
    @Override // ac.a
    public final yb.c o(Object obj, yb.c cVar) {
        switch (this.f12512e) {
            case 0:
                w0 w0Var = new w0(0, (mf.u) this.f12515h, cVar);
                w0Var.f12514g = obj;
                return w0Var;
            case 1:
                return new w0((k3) this.f12514g, (s1) this.f12515h, cVar, 1);
            case 2:
                return new w0((k3) this.f12514g, (w.j) this.f12515h, cVar, 2);
            case 3:
                return new w0((u.o0) this.f12514g, (x0.w0) this.f12515h, cVar, 3);
            case 4:
                return new w0((r.c) this.f12514g, (u1) this.f12515h, cVar, 4);
            case 5:
                return new w0((m9.c) this.f12514g, (String) this.f12515h, cVar, 5);
            case 6:
                w0 w0Var2 = new w0(6, (mf.e) this.f12515h, cVar);
                w0Var2.f12514g = obj;
                return w0Var2;
            case 7:
                w0 w0Var3 = new w0(7, (mf.f) this.f12515h, cVar);
                w0Var3.f12514g = obj;
                return w0Var3;
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_DALVIK /* 8 */:
                w0 w0Var4 = new w0(8, (g) this.f12515h, cVar);
                w0Var4.f12514g = obj;
                return w0Var4;
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_ART /* 9 */:
                return new w0((n7.v) this.f12514g, (ic.n) this.f12515h, cVar);
            case TinkerReport.KEY_APPLY_WITH_RETRY /* 10 */:
                w0 w0Var5 = new w0(10, (r1) this.f12515h, cVar);
                w0Var5.f12514g = obj;
                return w0Var5;
            case 11:
                return new w0((n7.m0) this.f12514g, (ic.a) this.f12515h, cVar, 11);
            case 12:
                return new w0((p2.c) this.f12514g, (Runnable) this.f12515h, cVar, 12);
            case 13:
                return new w0((ic.n) this.f12514g, (p7.r) this.f12515h, cVar, 13);
            case 14:
                return new w0((ic.n) this.f12514g, (jc.y) this.f12515h, cVar, 14);
            case 15:
                return new w0((bg.p) this.f12514g, (x0.w0) this.f12515h, cVar, 15);
            case 16:
                return new w0((w.k) this.f12514g, (w.h) this.f12515h, cVar, 16);
            case 17:
                return new w0((w.k) this.f12514g, (w.i) this.f12515h, cVar, 17);
            case 18:
                return new w0((s7.d) this.f12514g, (c2) this.f12515h, cVar, 18);
            case 19:
                w0 w0Var6 = new w0(19, (kf.j) this.f12515h, cVar);
                w0Var6.f12514g = obj;
                return w0Var6;
            case 20:
                w0 w0Var7 = new w0(20, (c0.s) this.f12515h, cVar);
                w0Var7.f12514g = obj;
                return w0Var7;
            case 21:
                return new w0((u.c2) this.f12514g, (ic.n) this.f12515h, cVar, 21);
            case 22:
                return new w0((hf.d1) this.f12514g, (i1) this.f12515h, cVar, 22);
            case 23:
                w0 w0Var8 = new w0(23, (u0.b) this.f12515h, cVar);
                w0Var8.f12514g = obj;
                return w0Var8;
            case 24:
                return new w0((a0.v) this.f12514g, (r.j) this.f12515h, cVar, 24);
            case 25:
                w0 w0Var9 = new w0(25, (v0.l0) this.f12515h, cVar);
                w0Var9.f12514g = obj;
                return w0Var9;
            default:
                return new w0((f) this.f12514g, (l1) this.f12515h, cVar, 26);
        }
    }

    @Override // ic.n
    public final Object q(Object obj, Object obj2) throws Throwable {
        switch (this.f12512e) {
            case 0:
                ((w0) o((g) obj, (yb.c) obj2)).u(ub.a0.f21526a);
                return zb.a.f26667a;
            case 1:
                return ((w0) o((hf.y) obj, (yb.c) obj2)).u(ub.a0.f21526a);
            case 2:
                return ((w0) o((hf.y) obj, (yb.c) obj2)).u(ub.a0.f21526a);
            case 3:
                return ((w0) o((hf.y) obj, (yb.c) obj2)).u(ub.a0.f21526a);
            case 4:
                return ((w0) o((hf.y) obj, (yb.c) obj2)).u(ub.a0.f21526a);
            case 5:
                return ((w0) o((hf.y) obj, (yb.c) obj2)).u(ub.a0.f21526a);
            case 6:
                return ((w0) o((kf.s) obj, (yb.c) obj2)).u(ub.a0.f21526a);
            case 7:
                return ((w0) o((g) obj, (yb.c) obj2)).u(ub.a0.f21526a);
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_DALVIK /* 8 */:
                return ((w0) o(obj, (yb.c) obj2)).u(ub.a0.f21526a);
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_ART /* 9 */:
                return ((w0) o((hf.y) obj, (yb.c) obj2)).u(ub.a0.f21526a);
            case TinkerReport.KEY_APPLY_WITH_RETRY /* 10 */:
                return ((w0) o((hf.y) obj, (yb.c) obj2)).u(ub.a0.f21526a);
            case 11:
                return ((w0) o((hf.y) obj, (yb.c) obj2)).u(ub.a0.f21526a);
            case 12:
                return ((w0) o((hf.y) obj, (yb.c) obj2)).u(ub.a0.f21526a);
            case 13:
                return ((w0) o((hf.y) obj, (yb.c) obj2)).u(ub.a0.f21526a);
            case 14:
                return ((w0) o((hf.y) obj, (yb.c) obj2)).u(ub.a0.f21526a);
            case 15:
                return ((w0) o((hf.y) obj, (yb.c) obj2)).u(ub.a0.f21526a);
            case 16:
                return ((w0) o((hf.y) obj, (yb.c) obj2)).u(ub.a0.f21526a);
            case 17:
                return ((w0) o((hf.y) obj, (yb.c) obj2)).u(ub.a0.f21526a);
            case 18:
                return ((w0) o((p7.l) obj, (yb.c) obj2)).u(ub.a0.f21526a);
            case 19:
                return ((w0) o((hf.y) obj, (yb.c) obj2)).u(ub.a0.f21526a);
            case 20:
                return ((w0) o((hf.y) obj, (yb.c) obj2)).u(ub.a0.f21526a);
            case 21:
                return ((w0) o((hf.y) obj, (yb.c) obj2)).u(ub.a0.f21526a);
            case 22:
                return ((w0) o((hf.y) obj, (yb.c) obj2)).u(ub.a0.f21526a);
            case 23:
                return ((w0) o((hf.y) obj, (yb.c) obj2)).u(ub.a0.f21526a);
            case 24:
                return ((w0) o((hf.y) obj, (yb.c) obj2)).u(ub.a0.f21526a);
            case 25:
                return ((w0) o((c2.x) obj, (yb.c) obj2)).u(ub.a0.f21526a);
            default:
                return ((w0) o((hf.y) obj, (yb.c) obj2)).u(ub.a0.f21526a);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:158:0x02bb, code lost:
    
        if (r0 == r11) goto L162;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x02c6, code lost:
    
        if (r0 == r11) goto L162;
     */
    /* JADX WARN: Code restructure failed: missing block: B:377:?, code lost:
    
        return r11;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0158 A[Catch: all -> 0x0136, TryCatch #1 {all -> 0x0136, blocks: (B:72:0x0132, B:82:0x014e, B:84:0x0158, B:87:0x0167, B:79:0x0142), top: B:353:0x0128 }] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0191 A[DONT_GENERATE] */
    /* JADX WARN: Type inference failed for: r0v50, types: [n7.v] */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v36, types: [hf.d1] */
    /* JADX WARN: Type inference failed for: r1v39, types: [hf.d1] */
    /* JADX WARN: Type inference failed for: r1v52 */
    /* JADX WARN: Type inference failed for: r1v53 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v15, types: [int] */
    /* JADX WARN: Type inference failed for: r2v7, types: [n7.x] */
    /* JADX WARN: Type inference failed for: r6v9, types: [ac.i, ic.n] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:88:0x018d -> B:82:0x014e). Please report as a decompilation issue!!! */
    @Override // ac.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object u(java.lang.Object r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1524
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: lf.w0.u(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w0(Object obj, Object obj2, yb.c cVar, int i10) {
        super(2, cVar);
        this.f12512e = i10;
        this.f12514g = obj;
        this.f12515h = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public w0(n7.v vVar, ic.n nVar, yb.c cVar) {
        super(2, cVar);
        this.f12512e = 9;
        this.f12514g = vVar;
        this.f12515h = (ac.i) nVar;
    }
}
