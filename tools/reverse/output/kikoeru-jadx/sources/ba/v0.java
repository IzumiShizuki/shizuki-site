package ba;

import com.tencent.bugly.beta.tinker.TinkerReport;
import i7.h2;
import java.util.ArrayList;
import x0.t1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class v0 extends ac.i implements ic.n {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f2491e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f2492f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Object f2493g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v0(int i10, Object obj, yb.c cVar) {
        super(2, cVar);
        this.f2491e = i10;
        this.f2493g = obj;
    }

    @Override // ac.a
    public final yb.c o(Object obj, yb.c cVar) {
        switch (this.f2491e) {
            case 0:
                return new v0(0, (z0) this.f2493g, cVar);
            case 1:
                return new v0(1, (c2.j0) this.f2493g, cVar);
            case 2:
                return new v0(2, (da.m0) this.f2493g, cVar);
            case 3:
                return new v0(2, cVar);
            case 4:
                return new v0(4, (j0.h) this.f2493g, cVar);
            case 5:
                return new v0(5, (i8.l) this.f2493g, cVar);
            case 6:
                return new v0(6, (t1) this.f2493g, cVar);
            case 7:
                return new v0(7, (ka.k) this.f2493g, cVar);
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_DALVIK /* 8 */:
                return new v0(8, (n7.m0) this.f2493g, cVar);
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_ART /* 9 */:
                return new v0(9, (ArrayList) this.f2493g, cVar);
            case TinkerReport.KEY_APPLY_WITH_RETRY /* 10 */:
                return new v0(10, (hf.q) this.f2493g, cVar);
            case 11:
                return new v0((q9.q) this.f2493g, this.f2492f, cVar, 11);
            case 12:
                return new v0((q9.i0) this.f2493g, this.f2492f, cVar, 12);
            case 13:
                return new v0(13, (r.w0) this.f2493g, cVar);
            case 14:
                return new v0(14, (s.w) this.f2493g, cVar);
            case 15:
                return new v0(15, (s.x) this.f2493g, cVar);
            case 16:
                return new v0(16, (s.b0) this.f2493g, cVar);
            case 17:
                return new v0(17, (s.t0) this.f2493g, cVar);
            case 18:
                return new v0(18, (c0.s) this.f2493g, cVar);
            default:
                return new v0(19, (uh.y) this.f2493g, cVar);
        }
    }

    @Override // ic.n
    public final Object q(Object obj, Object obj2) throws Throwable {
        hf.y yVar = (hf.y) obj;
        yb.c cVar = (yb.c) obj2;
        switch (this.f2491e) {
            case 17:
                ((v0) o(yVar, cVar)).u(ub.a0.f21526a);
                break;
        }
        return ((v0) o(yVar, cVar)).u(ub.a0.f21526a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x00bf, code lost:
    
        if (x0.v.s(r5).k(new x0.t0(r4), r18) == r3) goto L45;
     */
    /* JADX WARN: Path cross not found for [B:38:0x009c, B:41:0x00a5], limit reached: 386 */
    /* JADX WARN: Path cross not found for [B:41:0x00a5, B:38:0x009c], limit reached: 386 */
    /* JADX WARN: Removed duplicated region for block: B:302:0x0666 A[PHI: r0 r15
      0x0666: PHI (r0v22 com.cnl.kikoeru.data.db.AppDatabase) = (r0v21 com.cnl.kikoeru.data.db.AppDatabase), (r0v27 com.cnl.kikoeru.data.db.AppDatabase) binds: [B:300:0x0663, B:288:0x0618] A[DONT_GENERATE, DONT_INLINE]
      0x0666: PHI (r15v4 yb.c) = (r15v3 yb.c), (r15v6 yb.c) binds: [B:300:0x0663, B:288:0x0618] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:394:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a9  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x00a7 -> B:36:0x0098). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x00bf -> B:46:0x00c2). Please report as a decompilation issue!!! */
    @Override // ac.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object u(java.lang.Object r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1860
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ba.v0.u(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v0(int i10, yb.c cVar) {
        super(i10, cVar);
        this.f2491e = 3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v0(h2 h2Var, int i10, yb.c cVar, int i11) {
        super(2, cVar);
        this.f2491e = i11;
        this.f2493g = h2Var;
        this.f2492f = i10;
    }
}
