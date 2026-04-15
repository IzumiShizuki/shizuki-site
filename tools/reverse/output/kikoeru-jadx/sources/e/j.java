package e;

import a0.g0;
import android.content.Context;
import android.graphics.Rect;
import android.net.Uri;
import android.view.ScrollCaptureSession;
import b0.m;
import com.tencent.bugly.beta.tinker.TinkerReport;
import f7.w;
import hf.a0;
import hf.y;
import i7.d1;
import i7.v1;
import ic.n;
import j2.q0;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;
import lf.h0;
import lf.t0;
import m0.x;
import n7.v;
import r.e0;
import r.q1;
import r.w0;
import s.v0;
import u.c2;
import u.q2;
import x0.n2;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class j extends ac.i implements n {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f6028e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f6029f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Object f6030g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Object f6031h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f6032i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f6033j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(d1 d1Var, yb.c cVar, int i10) {
        super(2, cVar);
        this.f6028e = i10;
        this.f6033j = d1Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A(java.util.List r5, java.util.List r6, ac.c r7) {
        /*
            boolean r0 = r7 instanceof j9.y
            if (r0 == 0) goto L13
            r0 = r7
            j9.y r0 = (j9.y) r0
            int r1 = r0.f10771f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f10771f = r1
            goto L18
        L13:
            j9.y r0 = new j9.y
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f10770e
            int r1 = r0.f10771f
            r2 = 1
            if (r1 == 0) goto L31
            if (r1 != r2) goto L29
            java.util.List r5 = r0.f10769d
            java.util.List r5 = (java.util.List) r5
            ub.a.f(r7)
            goto L91
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            ub.a.f(r7)
            lf.b1 r7 = j9.b0.f10660b
            java.lang.Object r1 = r7.getValue()
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            int r1 = r1 + r2
            java.lang.Integer r3 = new java.lang.Integer
            r3.<init>(r1)
            r1 = 0
            r7.m(r1, r3)
            lf.b1 r7 = j9.b0.f10661c
            java.lang.Object r3 = r7.getValue()
            java.lang.Number r3 = (java.lang.Number) r3
            int r3 = r3.intValue()
            int r4 = r6.size()
            int r4 = r4 + r3
            java.lang.Integer r3 = new java.lang.Integer
            r3.<init>(r4)
            r7.m(r1, r3)
            r7 = r5
            java.util.Collection r7 = (java.util.Collection) r7
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.List r6 = vb.m.G0(r6)
            r7.add(r6)
            int r6 = r5.size()
            r7 = 100
            if (r6 < r7) goto L94
            com.cnl.kikoeru.data.db.AppDatabase r6 = a9.i.c()
            j9.w r7 = new j9.w
            r3 = 1
            r7.<init>(r5, r1, r3)
            r1 = r5
            java.util.List r1 = (java.util.List) r1
            r0.f10769d = r1
            r0.f10771f = r2
            java.lang.Object r6 = u3.x0.I(r6, r7, r0)
            zb.a r7 = zb.a.f26667a
            if (r6 != r7) goto L91
            return r7
        L91:
            r5.clear()
        L94:
            ub.a0 r5 = ub.a0.f21526a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: e.j.A(java.util.List, java.util.List, ac.c):java.lang.Object");
    }

    private final Object B(Object obj) {
        u.g gVar = (u.g) this.f6031h;
        m mVar = gVar.f20904s;
        int i10 = this.f6029f;
        try {
            try {
                if (i10 == 0) {
                    ub.a.f(obj);
                    hf.d1 d1VarR = a0.r(((y) this.f6030g).O());
                    gVar.f20909x = true;
                    c2 c2Var = gVar.f20901p;
                    v0 v0Var = v0.f19292a;
                    w wVar = new w((q2) this.f6032i, gVar, (u.c) this.f6033j, d1VarR, (yb.c) null, 6);
                    this.f6029f = 1;
                    Object objF = c2Var.f(v0Var, wVar, this);
                    zb.a aVar = zb.a.f26667a;
                    if (objF == aVar) {
                        return aVar;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ub.a.f(obj);
                }
                mVar.b();
                gVar.f20909x = false;
                mVar.a(null);
                gVar.f20906u = false;
                return ub.a0.f21526a;
            } catch (CancellationException e10) {
                throw e10;
            }
        } catch (Throwable th2) {
            gVar.f20909x = false;
            mVar.a(null);
            gVar.f20906u = false;
            throw th2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0016  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x011a -> B:22:0x0068). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object C(jc.y r23, java.util.List r24, java.lang.String r25, java.util.List r26, b4.a r27, ac.c r28) {
        /*
            Method dump skipped, instruction units count: 501
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e.j.C(jc.y, java.util.List, java.lang.String, java.util.List, b4.a, ac.c):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:(1:151)|69|70|172|71|72|149|73|74|(1:179)(7:77|78|130|131|133|49|(4:134|135|145|146)(0))) */
    /* JADX WARN: Can't wrap try/catch for region: R(10:151|69|70|172|71|72|149|73|74|(1:179)(7:77|78|130|131|133|49|(4:134|135|145|146)(0))) */
    /* JADX WARN: Can't wrap try/catch for region: R(11:98|(2:155|100)(1:104)|101|105|106|147|107|108|170|109|118) */
    /* JADX WARN: Can't wrap try/catch for region: R(17:57|(1:174)|58|(1:60)(6:62|63|157|64|65|66)|61|153|67|(10:151|69|70|172|71|72|149|73|74|(1:179)(7:77|78|130|131|133|49|(4:134|135|145|146)(0)))(9:90|159|91|(2:117|176)(2:95|(4:97|133|49|(0)(0))(11:98|(2:155|100)(1:104)|101|105|106|147|107|108|170|109|118))|130|131|133|49|(0)(0))|84|85|128|78|130|131|133|49|(0)(0)) */
    /* JADX WARN: Can't wrap try/catch for region: R(6:62|63|157|64|65|66) */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0303, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0304, code lost:
    
        r6 = r2;
        r2 = r12;
        r11 = r13;
        r12 = r14;
        r14 = r15;
        r15 = r25;
        r10 = r27;
        r35 = r35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x030f, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0310, code lost:
    
        r25 = r25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0326, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0327, code lost:
    
        r17 = r1;
        r25 = r5;
        r27 = r7;
        r18 = r23;
        r1 = r33;
        r35 = r35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0333, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0334, code lost:
    
        r17 = r1;
        r25 = r5;
        r27 = r7;
        r1 = r9;
        r18 = r23;
        r35 = r35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x026b, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x026c, code lost:
    
        r8 = r20;
        r2 = r22;
        r18 = r23;
        r17 = r27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0274, code lost:
    
        r1 = r33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0282, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0283, code lost:
    
        r17 = r1;
        r25 = r5;
        r18 = r23;
     */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0375  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01fc A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0143 A[Catch: all -> 0x005c, TryCatch #12 {all -> 0x005c, blocks: (B:13:0x004f, B:49:0x013d, B:51:0x0143, B:53:0x014d, B:128:0x0353, B:30:0x00d6, B:32:0x00dd, B:35:0x00e2, B:37:0x00e7, B:38:0x00fb, B:40:0x0101, B:41:0x010d, B:43:0x0118, B:46:0x011d, B:48:0x0122, B:47:0x0120, B:36:0x00e5), top: B:168:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01d9 A[Catch: all -> 0x033e, Exception -> 0x0343, TRY_LEAVE, TryCatch #17 {Exception -> 0x0343, all -> 0x033e, blocks: (B:58:0x01ca, B:62:0x01d9), top: B:174:0x01ca }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0295  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:132:0x0363 -> B:131:0x0360). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:77:0x0251 -> B:78:0x025b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:97:0x02b8 -> B:133:0x036e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object D(jc.y r34, java.util.List r35, java.lang.String r36, java.util.List r37, java.io.File r38, java.lang.String r39, java.lang.String r40, ac.c r41) {
        /*
            Method dump skipped, instruction units count: 911
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e.j.D(jc.y, java.util.List, java.lang.String, java.util.List, java.io.File, java.lang.String, java.lang.String, ac.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object x(java.lang.String r4, jc.y r5, java.util.List r6, java.util.List r7, java.lang.String r8, ac.c r9) {
        /*
            boolean r0 = r9 instanceof j9.x
            if (r0 == 0) goto L13
            r0 = r9
            j9.x r0 = (j9.x) r0
            int r1 = r0.f10768f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f10768f = r1
            goto L18
        L13:
            j9.x r0 = new j9.x
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f10767e
            int r1 = r0.f10768f
            r2 = 1
            ub.a0 r3 = ub.a0.f21526a
            if (r1 == 0) goto L34
            if (r1 != r2) goto L2c
            java.util.List r4 = r0.f10766d
            r6 = r4
            java.util.List r6 = (java.util.List) r6
            ub.a.f(r9)
            goto L66
        L2c:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L34:
            ub.a.f(r9)
            if (r4 == 0) goto L3a
            goto L69
        L3a:
            ef.l r4 = j9.u.f10754b
            java.lang.String r4 = na.w.i(r4, r8)
            if (r4 == 0) goto L69
            java.lang.Object r8 = r5.f10838a
            boolean r8 = jc.l.a(r8, r4)
            if (r8 == 0) goto L4b
            goto L69
        L4b:
            r5.f10838a = r4
            r4 = r6
            java.util.Collection r4 = (java.util.Collection) r4
            boolean r4 = r4.isEmpty()
            if (r4 != 0) goto L69
            r4 = r6
            java.util.List r4 = (java.util.List) r4
            r0.f10766d = r4
            r0.f10768f = r2
            java.lang.Object r4 = A(r7, r6, r0)
            zb.a r5 = zb.a.f26667a
            if (r4 != r5) goto L66
            return r5
        L66:
            r6.clear()
        L69:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: e.j.x(java.lang.String, jc.y, java.util.List, java.util.List, java.lang.String, ac.c):java.lang.Object");
    }

    /* JADX WARN: Path cross not found for [B:11:0x0042, B:18:0x007a], limit reached: 22 */
    /* JADX WARN: Path cross not found for [B:18:0x007a, B:11:0x0042], limit reached: 22 */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0098  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0078 -> B:11:0x0042). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0095 -> B:11:0x0042). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object y(java.lang.Object r12) {
        /*
            r11 = this;
            int r0 = r11.f6029f
            r1 = 1
            r2 = 2
            zb.a r3 = zb.a.f26667a
            if (r0 == 0) goto L30
            if (r0 == r1) goto L22
            if (r0 != r2) goto L1a
            java.lang.Object r0 = r11.f6030g
            jc.v r0 = (jc.v) r0
            java.lang.Object r4 = r11.f6031h
            hf.y r4 = (hf.y) r4
            ub.a.f(r12)
            r8 = r0
            r9 = r4
            goto L42
        L1a:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L22:
            java.lang.Object r0 = r11.f6030g
            jc.v r0 = (jc.v) r0
            java.lang.Object r4 = r11.f6031h
            hf.y r4 = (hf.y) r4
            ub.a.f(r12)
            r8 = r0
            r9 = r4
            goto L73
        L30:
            ub.a.f(r12)
            java.lang.Object r12 = r11.f6031h
            hf.y r12 = (hf.y) r12
            jc.v r0 = new jc.v
            r0.<init>()
            r4 = 1065353216(0x3f800000, float:1.0)
            r0.f10835a = r4
            r9 = r12
            r8 = r0
        L42:
            b0.o0 r5 = new b0.o0
            java.lang.Object r12 = r11.f6032i
            r6 = r12
            x0.w0 r6 = (x0.w0) r6
            java.lang.Object r12 = r11.f6033j
            r7 = r12
            r.e0 r7 = (r.e0) r7
            r10 = 3
            r5.<init>(r6, r7, r8, r9, r10)
            r11.f6031h = r9
            r11.f6030g = r8
            r11.f6029f = r1
            yb.h r12 = r11.s()
            j2.x1 r0 = j2.x1.f10093a
            yb.f r12 = r12.R(r0)
            if (r12 != 0) goto L98
            yb.h r12 = r11.s()
            x0.s0 r12 = x0.v.s(r12)
            java.lang.Object r12 = r12.k(r5, r11)
            if (r12 != r3) goto L73
            goto L97
        L73:
            float r12 = r8.f10835a
            r0 = 0
            int r12 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r12 != 0) goto L42
            b0.d0 r12 = new b0.d0
            r0 = 28
            r12.<init>(r0, r9)
            i7.n r12 = x0.v.B(r12)
            r.d0 r0 = new r.d0
            r4 = 0
            r0.<init>(r2, r4)
            r11.f6031h = r9
            r11.f6030g = r8
            r11.f6029f = r2
            java.lang.Object r12 = lf.p0.n(r12, r0, r11)
            if (r12 != r3) goto L42
        L97:
            return r3
        L98:
            java.lang.ClassCastException r12 = new java.lang.ClassCastException
            r12.<init>()
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: e.j.y(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [ic.k, jc.m] */
    /* JADX WARN: Type inference failed for: r1v13, types: [lf.h0, mf.b] */
    /* JADX WARN: Type inference failed for: r1v6, types: [ac.i, ic.n] */
    /* JADX WARN: Type inference failed for: r8v13, types: [lf.h0, mf.b] */
    @Override // ac.a
    public final yb.c o(Object obj, yb.c cVar) {
        switch (this.f6028e) {
            case 0:
                return new j((k) this.f6031h, (n) this.f6032i, (b7.n) this.f6033j, cVar, 0);
            case 1:
                return new j((Context) this.f6031h, (String) this.f6032i, (String) this.f6033j, cVar, 1);
            case 2:
                j jVar = new j((w0) this.f6031h, (e7.j) this.f6032i, (q1) this.f6033j, cVar, 2);
                jVar.f6030g = obj;
                return jVar;
            case 3:
                return new j((g0) this.f6030g, (x0.w0) this.f6031h, (x0.w0) this.f6032i, (n2) this.f6033j, cVar, 3);
            case 4:
                return new j((ha.g) this.f6032i, (String) this.f6033j, cVar, 4);
            case 5:
                j jVar2 = new j((v1) this.f6032i, (i7.i) this.f6033j, cVar, 5);
                jVar2.f6031h = obj;
                return jVar2;
            case 6:
                j jVar3 = new j((d1) this.f6033j, cVar, 6);
                jVar3.f6032i = obj;
                return jVar3;
            case 7:
                j jVar4 = new j((d1) this.f6033j, cVar, 7);
                jVar4.f6032i = obj;
                return jVar4;
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_DALVIK /* 8 */:
                j jVar5 = new j((lf.g) this.f6032i, (n) this.f6033j, cVar);
                jVar5.f6031h = obj;
                return jVar5;
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_ART /* 9 */:
                j jVar6 = new j((ic.k) this.f6031h, (j0.c) this.f6032i, (j0.m) this.f6033j, cVar, 9);
                jVar6.f6030g = obj;
                return jVar6;
            case TinkerReport.KEY_APPLY_WITH_RETRY /* 10 */:
                j jVar7 = new j((ic.k) this.f6031h, (AtomicReference) this.f6033j, (n) this.f6032i, cVar);
                jVar7.f6030g = obj;
                return jVar7;
            case 11:
                return new j((Uri) this.f6032i, (String) this.f6033j, cVar, 11);
            case 12:
                return new j((x0.w0) this.f6030g, (x0.w0) this.f6031h, (x0.w0) this.f6032i, (lf.f) this.f6033j, cVar, 12);
            case 13:
                j jVar8 = new j((jc.y) this.f6032i, (lf.g) this.f6033j, cVar, 13);
                jVar8.f6031h = obj;
                return jVar8;
            case 14:
                j jVar9 = new j((lf.f) this.f6031h, (h0) this.f6032i, this.f6033j, cVar);
                jVar9.f6030g = obj;
                return jVar9;
            case 15:
                return new j((t0) this.f6030g, (lf.f) this.f6031h, (h0) this.f6032i, this.f6033j, cVar);
            case 16:
                return new j((x) this.f6030g, (x0.w0) this.f6031h, (x0.w0) this.f6032i, (x0.w0) this.f6033j, cVar, 16);
            case 17:
                j jVar10 = new j((v) this.f6031h, (hf.k) this.f6032i, (lf.w0) this.f6033j, cVar, 17);
                jVar10.f6030g = obj;
                return jVar10;
            case 18:
                return new j((p2.c) this.f6030g, (ScrollCaptureSession) this.f6031h, (Rect) this.f6032i, (Consumer) this.f6033j, cVar, 18);
            case 19:
                return new j(this.f6030g, (r.c) this.f6031h, (x0.w0) this.f6032i, (x0.w0) this.f6033j, cVar, 19);
            case 20:
                j jVar11 = new j((x0.w0) this.f6032i, (e0) this.f6033j, cVar, 20);
                jVar11.f6031h = obj;
                return jVar11;
            case 21:
                j jVar12 = new j((u.g) this.f6031h, (q2) this.f6032i, (u.c) this.f6033j, cVar, 21);
                jVar12.f6030g = obj;
                return jVar12;
            default:
                j jVar13 = new j((ic.k) this.f6032i, (fg.f) this.f6033j, cVar, 22);
                jVar13.f6031h = obj;
                return jVar13;
        }
    }

    @Override // ic.n
    public final Object q(Object obj, Object obj2) throws Throwable {
        switch (this.f6028e) {
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_ART /* 9 */:
                ((j) o((q0) obj, (yb.c) obj2)).u(ub.a0.f21526a);
                break;
            case 13:
                break;
            case 20:
                ((j) o((y) obj, (yb.c) obj2)).u(ub.a0.f21526a);
                break;
        }
        return ((j) o((y) obj, (yb.c) obj2)).u(ub.a0.f21526a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:202:0x03ec, code lost:
    
        if (u3.x0.I(r1, r2, r4) == r11) goto L203;
     */
    /* JADX WARN: Code restructure failed: missing block: B:321:0x0658, code lost:
    
        if (r0.g(r4) == r11) goto L322;
     */
    /* JADX WARN: Code restructure failed: missing block: B:517:?, code lost:
    
        throw null;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:201:0x03d9 A[Catch: Exception -> 0x0333, TryCatch #5 {Exception -> 0x0333, blocks: (B:173:0x032e, B:204:0x03f0, B:180:0x0349, B:198:0x03cd, B:199:0x03d0, B:201:0x03d9, B:183:0x035a, B:193:0x03b1, B:195:0x03ba, B:186:0x039d), top: B:476:0x031a }] */
    /* JADX WARN: Removed duplicated region for block: B:234:0x047f  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x0536  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x0552  */
    /* JADX WARN: Removed duplicated region for block: B:377:0x07b5  */
    /* JADX WARN: Removed duplicated region for block: B:382:0x07e1  */
    /* JADX WARN: Removed duplicated region for block: B:513:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:525:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v186, types: [lf.g, lf.h0, mf.b] */
    /* JADX WARN: Type inference failed for: r0v191, types: [lf.f] */
    /* JADX WARN: Type inference failed for: r0v207, types: [yb.e] */
    /* JADX WARN: Type inference failed for: r12v14, types: [ac.i, ic.n] */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v121, types: [lf.f] */
    /* JADX WARN: Type inference failed for: r1v149 */
    /* JADX WARN: Type inference failed for: r1v150 */
    /* JADX WARN: Type inference failed for: r1v85, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v89 */
    /* JADX WARN: Type inference failed for: r2v59, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v32, types: [ic.k, jc.m] */
    /* JADX WARN: Type inference failed for: r3v42, types: [lf.g, lf.h0, mf.b] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:274:0x054c -> B:265:0x051c). Please report as a decompilation issue!!! */
    @Override // ac.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object u(java.lang.Object r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2610
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e.j.u(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public j(ic.k kVar, AtomicReference atomicReference, n nVar, yb.c cVar) {
        super(2, cVar);
        this.f6028e = 10;
        this.f6031h = (jc.m) kVar;
        this.f6033j = atomicReference;
        this.f6032i = nVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(Object obj, Object obj2, Object obj3, Object obj4, yb.c cVar, int i10) {
        super(2, cVar);
        this.f6028e = i10;
        this.f6030g = obj;
        this.f6031h = obj2;
        this.f6032i = obj3;
        this.f6033j = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(Object obj, Object obj2, Object obj3, yb.c cVar, int i10) {
        super(2, cVar);
        this.f6028e = i10;
        this.f6031h = obj;
        this.f6032i = obj2;
        this.f6033j = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(Object obj, Object obj2, yb.c cVar, int i10) {
        super(2, cVar);
        this.f6028e = i10;
        this.f6032i = obj;
        this.f6033j = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public j(lf.f fVar, h0 h0Var, Object obj, yb.c cVar) {
        super(2, cVar);
        this.f6028e = 14;
        this.f6031h = fVar;
        this.f6032i = (mf.b) h0Var;
        this.f6033j = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public j(lf.g gVar, n nVar, yb.c cVar) {
        super(2, cVar);
        this.f6028e = 8;
        this.f6032i = gVar;
        this.f6033j = (ac.i) nVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public j(t0 t0Var, lf.f fVar, h0 h0Var, Object obj, yb.c cVar) {
        super(2, cVar);
        this.f6028e = 15;
        this.f6030g = t0Var;
        this.f6031h = fVar;
        this.f6032i = (mf.b) h0Var;
        this.f6033j = obj;
    }
}
