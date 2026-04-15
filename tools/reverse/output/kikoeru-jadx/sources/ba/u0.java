package ba;

import android.net.Uri;
import android.view.View;
import bg.a2;
import com.tencent.bugly.beta.tinker.TinkerReport;
import i7.k2;
import j2.b2;
import j2.y1;
import l0.l1;
import x0.n2;
import x0.t1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class u0 extends ac.i implements ic.n {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f2485e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f2486f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f2487g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f2488h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u0(int i10, Object obj, yb.c cVar) {
        super(2, cVar);
        this.f2485e = i10;
        this.f2488h = obj;
    }

    /* JADX WARN: Type inference failed for: r1v16, types: [ac.i, ic.n] */
    /* JADX WARN: Type inference failed for: r1v17, types: [ac.i, ic.n] */
    @Override // ac.a
    public final yb.c o(Object obj, yb.c cVar) {
        int i10 = this.f2485e;
        Object obj2 = this.f2488h;
        switch (i10) {
            case 0:
                return new u0((z0) this.f2487g, (x0.w0) obj2, cVar, 0);
            case 1:
                return new u0((String) obj2, (z0) this.f2487g, cVar);
            case 2:
                return new u0((c2.x) this.f2487g, (d0.d) obj2, cVar, 2);
            case 3:
                return new u0((da.m0) this.f2487g, (a2) obj2, cVar, 3);
            case 4:
                return new u0((e0.f) this.f2487g, (a0.o) obj2, cVar, 4);
            case 5:
                fa.v vVar = fa.v.f7039a;
                return new u0((x0.w0) obj2, (x0.w0) this.f2487g, cVar);
            case 6:
                return new u0((c2.x) this.f2487g, (l1) obj2, cVar, 6);
            case 7:
                return new u0((ha.g) this.f2487g, (String) obj2, cVar, 7);
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_DALVIK /* 8 */:
                return new u0((ha.g) this.f2487g, (n2) obj2, cVar, 8);
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_ART /* 9 */:
                u0 u0Var = new u0(9, (ch.l) obj2, cVar);
                u0Var.f2487g = obj;
                return u0Var;
            case TinkerReport.KEY_APPLY_WITH_RETRY /* 10 */:
                return new u0((lf.f) this.f2487g, (ch.l) obj2, cVar, 10);
            case 11:
                u0 u0Var2 = new u0(11, (i7.o0) obj2, cVar);
                u0Var2.f2487g = obj;
                return u0Var2;
            case 12:
                return new u0((i7.d1) this.f2487g, (k2) obj2, cVar, 12);
            case 13:
                return new u0((i7.d1) this.f2487g, (kf.f) obj2, cVar, 13);
            case 14:
                return new u0((i7.k0) this.f2487g, (a9.n) obj2, cVar, 14);
            case 15:
                return new u0((kf.f) this.f2487g, (ic.n) obj2, cVar);
            case 16:
                u0 u0Var3 = new u0((ac.i) obj2, cVar);
                u0Var3.f2487g = obj;
                return u0Var3;
            case 17:
                u0 u0Var4 = new u0(17, (i8.l) obj2, cVar);
                u0Var4.f2487g = obj;
                return u0Var4;
            case 18:
                return new u0((j0.c) this.f2487g, (j0.l) obj2, cVar, 18);
            case 19:
                return new u0((hf.d1) this.f2487g, (j0.h) obj2, cVar, 19);
            case 20:
                return new u0((j0.m) this.f2487g, (e.j) obj2, cVar, 20);
            case 21:
                u0 u0Var5 = new u0(21, (j2.q0) obj2, cVar);
                u0Var5.f2487g = obj;
                return u0Var5;
            case 22:
                return new u0((t1) this.f2487g, (View) obj2, cVar, 22);
            case 23:
                return new u0((lf.z0) this.f2487g, (b2) obj2, cVar, 23);
            case 24:
                u0 u0Var6 = new u0(24, (j3.u) obj2, cVar);
                u0Var6.f2487g = obj;
                return u0Var6;
            case 25:
                u0 u0Var7 = new u0(25, (j7.b) obj2, cVar);
                u0Var7.f2487g = obj;
                return u0Var7;
            case 26:
                return new u0((Uri) this.f2487g, (c7.e1) obj2, cVar, 26);
            case 27:
                return new u0((ka.k) this.f2487g, (ka.k) obj2, cVar, 27);
            case 28:
                return new u0((j2.g1) this.f2487g, (t2.g) obj2, cVar, 28);
            default:
                u0 u0Var8 = new u0(29, (lf.f) obj2, cVar);
                u0Var8.f2487g = obj;
                return u0Var8;
        }
    }

    @Override // ic.n
    public final Object q(Object obj, Object obj2) throws Throwable {
        switch (this.f2485e) {
            case 0:
                return ((u0) o((hf.y) obj, (yb.c) obj2)).u(ub.a0.f21526a);
            case 1:
                return ((u0) o((hf.y) obj, (yb.c) obj2)).u(ub.a0.f21526a);
            case 2:
                return ((u0) o((hf.y) obj, (yb.c) obj2)).u(ub.a0.f21526a);
            case 3:
                return ((u0) o((hf.y) obj, (yb.c) obj2)).u(ub.a0.f21526a);
            case 4:
                return ((u0) o((hf.y) obj, (yb.c) obj2)).u(ub.a0.f21526a);
            case 5:
                ((u0) o((hf.y) obj, (yb.c) obj2)).u(ub.a0.f21526a);
                return zb.a.f26667a;
            case 6:
                return ((u0) o((hf.y) obj, (yb.c) obj2)).u(ub.a0.f21526a);
            case 7:
                return ((u0) o((hf.y) obj, (yb.c) obj2)).u(ub.a0.f21526a);
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_DALVIK /* 8 */:
                return ((u0) o((hf.y) obj, (yb.c) obj2)).u(ub.a0.f21526a);
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_ART /* 9 */:
                return ((u0) o((lf.g) obj, (yb.c) obj2)).u(ub.a0.f21526a);
            case TinkerReport.KEY_APPLY_WITH_RETRY /* 10 */:
                return ((u0) o((hf.y) obj, (yb.c) obj2)).u(ub.a0.f21526a);
            case 11:
                return ((u0) o((k2) obj, (yb.c) obj2)).u(ub.a0.f21526a);
            case 12:
                return ((u0) o((hf.y) obj, (yb.c) obj2)).u(ub.a0.f21526a);
            case 13:
                return ((u0) o((hf.y) obj, (yb.c) obj2)).u(ub.a0.f21526a);
            case 14:
                return ((u0) o((hf.y) obj, (yb.c) obj2)).u(ub.a0.f21526a);
            case 15:
                return ((u0) o((hf.y) obj, (yb.c) obj2)).u(ub.a0.f21526a);
            case 16:
                return ((u0) o((lf.g) obj, (yb.c) obj2)).u(ub.a0.f21526a);
            case 17:
                return ((u0) o((s8.i) obj, (yb.c) obj2)).u(ub.a0.f21526a);
            case 18:
                return ((u0) o((hf.y) obj, (yb.c) obj2)).u(ub.a0.f21526a);
            case 19:
                ((u0) o((hf.y) obj, (yb.c) obj2)).u(ub.a0.f21526a);
                return zb.a.f26667a;
            case 20:
                ((u0) o((hf.y) obj, (yb.c) obj2)).u(ub.a0.f21526a);
                return zb.a.f26667a;
            case 21:
                ((u0) o((y1) obj, (yb.c) obj2)).u(ub.a0.f21526a);
                return zb.a.f26667a;
            case 22:
                return ((u0) o((hf.y) obj, (yb.c) obj2)).u(ub.a0.f21526a);
            case 23:
                ((u0) o((hf.y) obj, (yb.c) obj2)).u(ub.a0.f21526a);
                return zb.a.f26667a;
            case 24:
                return ((u0) o((hf.y) obj, (yb.c) obj2)).u(ub.a0.f21526a);
            case 25:
                return ((u0) o((i7.l1) obj, (yb.c) obj2)).u(ub.a0.f21526a);
            case 26:
                return ((u0) o((hf.y) obj, (yb.c) obj2)).u(ub.a0.f21526a);
            case 27:
                return ((u0) o((hf.y) obj, (yb.c) obj2)).u(ub.a0.f21526a);
            case 28:
                return ((u0) o((hf.y) obj, (yb.c) obj2)).u(ub.a0.f21526a);
            default:
                return ((u0) o((kf.s) obj, (yb.c) obj2)).u(ub.a0.f21526a);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:175:0x0321, code lost:
    
        if (hf.a0.l(500, r20) != r11) goto L177;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:86:0x01bd, B:88:0x01c1], limit reached: 522 */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0315  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0316 A[Catch: all -> 0x02d3, TryCatch #0 {all -> 0x02d3, blocks: (B:153:0x02cf, B:177:0x0324, B:171:0x030d, B:174:0x0316, B:159:0x02db, B:160:0x02df, B:161:0x02e7, B:168:0x02fe, B:170:0x0307), top: B:480:0x02c5 }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01cb A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Type inference failed for: r12v14, types: [ac.i, ic.n] */
    /* JADX WARN: Type inference failed for: r12v15, types: [ac.i, ic.n] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:175:0x0321 -> B:177:0x0324). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:82:0x01a7 -> B:84:0x01ab). Please report as a decompilation issue!!! */
    @Override // ac.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object u(java.lang.Object r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2246
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ba.u0.u(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public u0(ic.n nVar, yb.c cVar) {
        super(2, cVar);
        this.f2485e = 16;
        this.f2488h = (ac.i) nVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u0(Object obj, Object obj2, yb.c cVar, int i10) {
        super(2, cVar);
        this.f2485e = i10;
        this.f2487g = obj;
        this.f2488h = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(String str, z0 z0Var, yb.c cVar) {
        super(2, cVar);
        this.f2485e = 1;
        this.f2488h = str;
        this.f2487g = z0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public u0(kf.f fVar, ic.n nVar, yb.c cVar) {
        super(2, cVar);
        this.f2485e = 15;
        this.f2487g = fVar;
        this.f2488h = (ac.i) nVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(x0.w0 w0Var, x0.w0 w0Var2, yb.c cVar) {
        super(2, cVar);
        this.f2485e = 5;
        fa.v vVar = fa.v.f7039a;
        this.f2488h = w0Var;
        this.f2487g = w0Var2;
    }
}
