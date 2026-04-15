package f7;

import android.graphics.Bitmap;
import h0.r1;
import h0.u0;
import hf.d1;
import j2.q0;
import l0.l1;
import r.q1;
import u.i1;
import u.q2;
import ub.a0;
import x0.a1;
import x0.s0;
import x0.s1;
import x0.t1;
import x0.w0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class w extends ac.i implements ic.n {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f6821e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f6822f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Object f6823g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f6824h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Object f6825i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f6826j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f6827k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public w(c2.x xVar, ic.o oVar, ic.k kVar, i1 i1Var, yb.c cVar) {
        super(2, cVar);
        this.f6821e = 7;
        this.f6825i = xVar;
        this.f6823g = (ac.i) oVar;
        this.f6826j = (jc.m) kVar;
        this.f6827k = i1Var;
    }

    /* JADX WARN: Type inference failed for: r6v13, types: [ac.i, ic.o] */
    /* JADX WARN: Type inference failed for: r7v13, types: [ic.k, jc.m] */
    @Override // ac.a
    public final yb.c o(Object obj, yb.c cVar) {
        switch (this.f6821e) {
            case 0:
                w wVar = new w((i) this.f6825i, (w0) this.f6823g, (a1) this.f6827k, (w0) this.f6826j, cVar);
                wVar.f6824h = obj;
                return wVar;
            case 1:
                return new w((u0) this.f6824h, (w0) this.f6823g, (y2.z) this.f6825i, (l1) this.f6826j, (y2.j) this.f6827k, cVar);
            case 2:
                return new w((e0.b) this.f6824h, (y2.y) this.f6825i, (u0) this.f6823g, (r1) this.f6826j, (y2.r) this.f6827k, cVar, 2);
            case 3:
                return new w((s8.i) this.f6824h, (h8.h) this.f6825i, (t8.h) this.f6823g, (h8.c) this.f6826j, (Bitmap) this.f6827k, cVar, 3);
            case 4:
                w wVar2 = new w((q0) this.f6825i, (ic.k) this.f6823g, (j0.c) this.f6826j, (j0.m) this.f6827k, cVar, 4);
                wVar2.f6824h = obj;
                return wVar2;
            case 5:
                return new w((r.w0) this.f6826j, this.f6824h, (q1) this.f6827k, cVar);
            case 6:
                w wVar3 = new w((q2) this.f6825i, (u.g) this.f6823g, (u.c) this.f6826j, (d1) this.f6827k, cVar, 6);
                wVar3.f6824h = obj;
                return wVar3;
            case 7:
                w wVar4 = new w((c2.x) this.f6825i, (ic.o) this.f6823g, (ic.k) this.f6826j, (i1) this.f6827k, cVar);
                wVar4.f6824h = obj;
                return wVar4;
            default:
                w wVar5 = new w((t1) this.f6823g, (s1) this.f6826j, (s0) this.f6827k, cVar);
                wVar5.f6824h = obj;
                return wVar5;
        }
    }

    @Override // ic.n
    public final Object q(Object obj, Object obj2) {
        switch (this.f6821e) {
            case 4:
                ((w) o((hf.y) obj, (yb.c) obj2)).u(a0.f21526a);
                break;
        }
        return ((w) o((hf.y) obj, (yb.c) obj2)).u(a0.f21526a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:157:0x034e, code lost:
    
        if (r.w0.E1(r8, r24) != r4) goto L88;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 3, insn: 0x0121: IF  (r5v24 ?? I:??[int, boolean, OBJECT, ARRAY, byte, short, char]) != (r3 I:??[int, boolean, OBJECT, ARRAY, byte, short, char])  -> B:51:0x0128 (LINE:290), block:B:47:0x0121 */
    /* JADX WARN: Removed duplicated region for block: B:113:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:276:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:279:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00c6 A[Catch: all -> 0x0023, LOOP:1: B:26:0x00c4->B:27:0x00c6, LOOP_END, TryCatch #1 {all -> 0x0023, blocks: (B:8:0x001e, B:25:0x00b4, B:27:0x00c6, B:28:0x00d2), top: B:262:0x0010 }] */
    /* JADX WARN: Type inference failed for: r2v60, types: [androidx.media3.exoplayer.offline.g, int] */
    /* JADX WARN: Type inference failed for: r5v23, types: [ac.i, ic.o] */
    /* JADX WARN: Type inference failed for: r6v20, types: [ic.k, jc.m] */
    @Override // ac.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object u(java.lang.Object r25) {
        /*
            Method dump skipped, instruction units count: 1444
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f7.w.u(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(i iVar, w0 w0Var, a1 a1Var, w0 w0Var2, yb.c cVar) {
        super(2, cVar);
        this.f6821e = 0;
        this.f6825i = iVar;
        this.f6823g = w0Var;
        this.f6827k = a1Var;
        this.f6826j = w0Var2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(u0 u0Var, w0 w0Var, y2.z zVar, l1 l1Var, y2.j jVar, yb.c cVar) {
        super(2, cVar);
        this.f6821e = 1;
        this.f6824h = u0Var;
        this.f6823g = w0Var;
        this.f6825i = zVar;
        this.f6826j = l1Var;
        this.f6827k = jVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, yb.c cVar, int i10) {
        super(2, cVar);
        this.f6821e = i10;
        this.f6824h = obj;
        this.f6825i = obj2;
        this.f6823g = obj3;
        this.f6826j = obj4;
        this.f6827k = obj5;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w(Object obj, Object obj2, Object obj3, Object obj4, yb.c cVar, int i10) {
        super(2, cVar);
        this.f6821e = i10;
        this.f6825i = obj;
        this.f6823g = obj2;
        this.f6826j = obj3;
        this.f6827k = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(r.w0 w0Var, Object obj, q1 q1Var, yb.c cVar) {
        super(2, cVar);
        this.f6821e = 5;
        this.f6826j = w0Var;
        this.f6824h = obj;
        this.f6827k = q1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(t1 t1Var, s1 s1Var, s0 s0Var, yb.c cVar) {
        super(2, cVar);
        this.f6821e = 8;
        this.f6823g = t1Var;
        this.f6826j = s1Var;
        this.f6827k = s0Var;
    }
}
