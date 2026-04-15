package i7;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f9075a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h2 f9076b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j1 f9077c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final lf.f f9078d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final b0.c1 f9079e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final AtomicBoolean f9080f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final kf.f f9081g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e1 f9082h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final hf.f1 f9083i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final v1 f9084j;

    public d1(Object obj, h2 h2Var, j1 j1Var, n nVar, i2 i2Var, d.i0 i0Var) {
        jc.l.e(h2Var, "pagingSource");
        jc.l.e(nVar, "retryFlow");
        this.f9075a = obj;
        this.f9076b = h2Var;
        this.f9077c = j1Var;
        this.f9078d = nVar;
        this.f9079e = new b0.c1(28);
        this.f9080f = new AtomicBoolean(false);
        yb.c cVar = null;
        this.f9081g = g8.a.c(-2, 6, null);
        this.f9082h = new e1(j1Var);
        hf.f1 f1VarC = hf.a0.c();
        this.f9083i = f1VarC;
        this.f9084j = new v1(new e.j(this, cVar, 7), u.e(new b0.x(f1VarC, new e.j(this, cVar, 6), (yb.c) null)));
    }

    public static final Object a(d1 d1Var, v1 v1Var, d0 d0Var, ac.i iVar) {
        d1Var.getClass();
        lf.f fVarF = u.f(v1Var, new q0(null, d1Var, d0Var));
        r0 r0Var = new r0(d0Var, null);
        jc.l.e(fVarF, "<this>");
        Object objB = lf.p0.g(new n(new s(fVarF, r0Var, null, 0)), -1).b(new s0(0, d1Var, d0Var), iVar);
        return objB == zb.a.f26667a ? objB : ub.a0.f21526a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:248:0x03d8, code lost:
    
        r3.getClass();
        r2 = r3;
        r3 = r4;
        r4 = r10;
        r10 = r12;
        r12 = r13;
        r13 = r14;
        r7 = r19;
        r9 = r20;
        r14 = r5;
     */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0443  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x04a8  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x04c3  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0549  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x05b2  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0605  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0608  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0633  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x066c A[Catch: all -> 0x067b, TryCatch #8 {all -> 0x067b, blocks: (B:198:0x0639, B:199:0x0652, B:201:0x066c, B:203:0x0674, B:205:0x0678, B:209:0x0681, B:208:0x067f, B:210:0x0684), top: B:246:0x0639 }] */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0678 A[Catch: all -> 0x067b, TryCatch #8 {all -> 0x067b, blocks: (B:198:0x0639, B:199:0x0652, B:201:0x066c, B:203:0x0674, B:205:0x0678, B:209:0x0681, B:208:0x067f, B:210:0x0684), top: B:246:0x0639 }] */
    /* JADX WARN: Removed duplicated region for block: B:208:0x067f A[Catch: all -> 0x067b, TryCatch #8 {all -> 0x067b, blocks: (B:198:0x0639, B:199:0x0652, B:201:0x066c, B:203:0x0674, B:205:0x0678, B:209:0x0681, B:208:0x067f, B:210:0x0684), top: B:246:0x0639 }] */
    /* JADX WARN: Removed duplicated region for block: B:213:0x06af  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x06bf  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x06c8  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x06cc  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x06e5 A[Catch: all -> 0x02e5, TRY_ENTER, TryCatch #6 {all -> 0x02e5, blocks: (B:50:0x02b2, B:58:0x02c6, B:60:0x02d5, B:64:0x02eb, B:66:0x02f1, B:68:0x0308, B:69:0x030d, B:71:0x0322, B:74:0x033a, B:226:0x06e5, B:227:0x06ea), top: B:244:0x02b2 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001c  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x039c A[Catch: all -> 0x03c3, TRY_LEAVE, TryCatch #4 {all -> 0x03c3, blocks: (B:81:0x0384, B:83:0x039c), top: B:240:0x0384 }] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x03c7  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x03dc  */
    /* JADX WARN: Type inference failed for: r0v110 */
    /* JADX WARN: Type inference failed for: r0v117 */
    /* JADX WARN: Type inference failed for: r0v118 */
    /* JADX WARN: Type inference failed for: r0v119 */
    /* JADX WARN: Type inference failed for: r0v120 */
    /* JADX WARN: Type inference failed for: r0v121 */
    /* JADX WARN: Type inference failed for: r0v39 */
    /* JADX WARN: Type inference failed for: r0v46 */
    /* JADX WARN: Type inference failed for: r0v82, types: [i7.d1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v84 */
    /* JADX WARN: Type inference failed for: r0v87 */
    /* JADX WARN: Type inference failed for: r0v88, types: [java.lang.Enum, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v91 */
    /* JADX WARN: Type inference failed for: r0v92, types: [i7.d0] */
    /* JADX WARN: Type inference failed for: r0v95, types: [i7.d0, java.lang.Enum, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v23, types: [i7.d0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v28 */
    /* JADX WARN: Type inference failed for: r13v36 */
    /* JADX WARN: Type inference failed for: r13v50, types: [i7.d1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v52, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v53, types: [i7.d1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v55 */
    /* JADX WARN: Type inference failed for: r13v58 */
    /* JADX WARN: Type inference failed for: r13v59 */
    /* JADX WARN: Type inference failed for: r13v60 */
    /* JADX WARN: Type inference failed for: r13v61 */
    /* JADX WARN: Type inference failed for: r13v62 */
    /* JADX WARN: Type inference failed for: r13v63 */
    /* JADX WARN: Type inference failed for: r13v64 */
    /* JADX WARN: Type inference failed for: r14v12, types: [i7.d1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v13 */
    /* JADX WARN: Type inference failed for: r14v16 */
    /* JADX WARN: Type inference failed for: r14v17 */
    /* JADX WARN: Type inference failed for: r14v18 */
    /* JADX WARN: Type inference failed for: r14v35 */
    /* JADX WARN: Type inference failed for: r14v36 */
    /* JADX WARN: Type inference failed for: r14v42, types: [i7.d0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v45, types: [i7.d0] */
    /* JADX WARN: Type inference failed for: r14v46 */
    /* JADX WARN: Type inference failed for: r14v47 */
    /* JADX WARN: Type inference failed for: r14v48 */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [rf.a] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Enum, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v26 */
    /* JADX WARN: Type inference failed for: r1v44, types: [i7.d0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v46 */
    /* JADX WARN: Type inference failed for: r1v47 */
    /* JADX WARN: Type inference failed for: r1v52 */
    /* JADX WARN: Type inference failed for: r1v54, types: [i7.g1] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v83 */
    /* JADX WARN: Type inference failed for: r22v8 */
    /* JADX WARN: Type inference failed for: r22v9 */
    /* JADX WARN: Type inference failed for: r23v3 */
    /* JADX WARN: Type inference failed for: r23v4 */
    /* JADX WARN: Type inference failed for: r23v5 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v36 */
    /* JADX WARN: Type inference failed for: r2v47 */
    /* JADX WARN: Type inference failed for: r2v48 */
    /* JADX WARN: Type inference failed for: r2v49, types: [i7.g1] */
    /* JADX WARN: Type inference failed for: r2v66, types: [i7.d1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v69, types: [i7.d1] */
    /* JADX WARN: Type inference failed for: r2v70 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v29 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v33 */
    /* JADX WARN: Type inference failed for: r3v34 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v8, types: [i7.d0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v1, types: [i7.u2] */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v41, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v19 */
    /* JADX WARN: Type inference failed for: r7v5, types: [i7.d1] */
    /* JADX WARN: Type inference failed for: r9v4, types: [i7.u2] */
    /* JADX WARN: Type inference failed for: r9v8, types: [c7.e1] */
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(i7.d1 r22, i7.d0 r23, i7.v r24, yb.c r25) {
        /*
            Method dump skipped, instruction units count: 1810
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: i7.d1.b(i7.d1, i7.d0, i7.v, yb.c):java.lang.Object");
    }

    public static final Object c(d1 d1Var, d0 d0Var, u2 u2Var, a1 a1Var) throws Throwable {
        d1Var.getClass();
        int i10 = p0.f9254a[d0Var.ordinal()];
        ub.a0 a0Var = ub.a0.f21526a;
        if (i10 == 1) {
            Object objF = d1Var.f(a1Var);
            return objF == zb.a.f26667a ? objF : a0Var;
        }
        if (u2Var == null) {
            throw new IllegalStateException("Cannot retry APPEND / PREPEND load on PagingSource without ViewportHint");
        }
        b0.c1 c1Var = d1Var.f9079e;
        c1Var.getClass();
        if (d0Var == d0.f9072b || d0Var == d0.f9073c) {
            ((b0.w1) c1Var.f1208b).X(null, new b0.i0(10, d0Var, u2Var));
            return a0Var;
        }
        throw new IllegalArgumentException(("invalid load type for reset: " + d0Var).toString());
    }

    public static final void d(d1 d1Var, hf.y yVar) {
        j1 j1Var = d1Var.f9077c;
        yb.c cVar = null;
        hf.a0.y(yVar, null, null, new c1(d1Var, cVar, 0), 3);
        hf.a0.y(yVar, null, null, new c1(d1Var, cVar, 1), 3);
    }

    public static String h(d0 d0Var, Object obj, g2 g2Var) {
        if (g2Var == null) {
            return "End " + d0Var + " with loadkey " + obj + ". Load CANCELLED.";
        }
        return "End " + d0Var + " with loadKey " + obj + ". Returned " + g2Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(ac.c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof i7.v0
            if (r0 == 0) goto L13
            r0 = r5
            i7.v0 r0 = (i7.v0) r0
            int r1 = r0.f9342i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f9342i = r1
            goto L18
        L13:
            i7.v0 r0 = new i7.v0
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f9340g
            int r1 = r0.f9342i
            r2 = 1
            if (r1 == 0) goto L33
            if (r1 != r2) goto L2b
            rf.c r1 = r0.f9339f
            i7.e1 r2 = r0.f9338e
            i7.d1 r0 = r0.f9337d
            ub.a.f(r5)
            goto L4d
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L33:
            ub.a.f(r5)
            i7.e1 r5 = r4.f9082h
            rf.c r1 = r5.f9090a
            r0.f9337d = r4
            r0.f9338e = r5
            r0.f9339f = r1
            r0.f9342i = r2
            java.lang.Object r0 = r1.g(r0)
            zb.a r2 = zb.a.f26667a
            if (r0 != r2) goto L4b
            return r2
        L4b:
            r0 = r4
            r2 = r5
        L4d:
            r5 = 0
            i7.g1 r2 = r2.f9091b     // Catch: java.lang.Throwable -> L62
            b0.c1 r0 = r0.f9079e     // Catch: java.lang.Throwable -> L62
            java.lang.Object r0 = r0.f1208b     // Catch: java.lang.Throwable -> L62
            b0.w1 r0 = (b0.w1) r0     // Catch: java.lang.Throwable -> L62
            java.lang.Object r0 = r0.f1397e     // Catch: java.lang.Throwable -> L62
            i7.s2 r0 = (i7.s2) r0     // Catch: java.lang.Throwable -> L62
            i7.i2 r0 = r2.a(r0)     // Catch: java.lang.Throwable -> L62
            r1.b(r5)
            return r0
        L62:
            r0 = move-exception
            r1.b(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: i7.d1.e(ac.c):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:112:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0198 A[Catch: all -> 0x019e, TRY_ENTER, TryCatch #4 {all -> 0x019e, blocks: (B:62:0x017e, B:65:0x0198, B:68:0x01a1, B:70:0x01a8), top: B:137:0x017e }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01a8 A[Catch: all -> 0x019e, TRY_LEAVE, TryCatch #4 {all -> 0x019e, blocks: (B:62:0x017e, B:65:0x0198, B:68:0x01a1, B:70:0x01a8), top: B:137:0x017e }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0227  */
    /* JADX WARN: Type inference failed for: r13v6, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r3v0, types: [int] */
    /* JADX WARN: Type inference failed for: r3v1, types: [rf.a] */
    /* JADX WARN: Type inference failed for: r3v10, types: [i7.h2, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v2, types: [rf.a] */
    /* JADX WARN: Type inference failed for: r3v28, types: [rf.a] */
    /* JADX WARN: Type inference failed for: r3v36 */
    /* JADX WARN: Type inference failed for: r3v37 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(ac.c r17) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 712
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: i7.d1.f(ac.c):java.lang.Object");
    }

    public final c2 g(d0 d0Var, Object obj) {
        d0 d0Var2 = d0.f9071a;
        j1 j1Var = this.f9077c;
        int i10 = d0Var == d0Var2 ? j1Var.f9178c : j1Var.f9176a;
        jc.l.e(d0Var, "loadType");
        int iOrdinal = d0Var.ordinal();
        if (iOrdinal == 0) {
            return new b2(i10, obj);
        }
        if (iOrdinal == 1) {
            if (obj != null) {
                return new a2(i10, obj);
            }
            throw new IllegalArgumentException("key cannot be null for prepend");
        }
        if (iOrdinal != 2) {
            throw new ce.j0();
        }
        if (obj != null) {
            return new z1(i10, obj);
        }
        throw new IllegalArgumentException("key cannot be null for append");
    }

    public final Object i(g1 g1Var, d0 d0Var, int i10, int i11) {
        g1Var.getClass();
        ArrayList arrayList = g1Var.f9122c;
        int iOrdinal = d0Var.ordinal();
        if (iOrdinal == 0) {
            throw new IllegalArgumentException("Cannot get loadId for loadType: REFRESH");
        }
        if (iOrdinal != 1 && iOrdinal != 2) {
            throw new ce.j0();
        }
        if (i10 == 0 && !(g1Var.f9129j.w(d0Var) instanceof y) && i11 < this.f9077c.f9177b) {
            return d0Var == d0.f9072b ? ((f2) vb.m.Y(arrayList)).f9098b : ((f2) vb.m.h0(arrayList)).f9099c;
        }
        return null;
    }

    public final Object j(g1 g1Var, d0 d0Var, y yVar, ac.c cVar) {
        c7.e1 e1Var = g1Var.f9129j;
        if (!jc.l.a(e1Var.w(d0Var), yVar)) {
            e1Var.Y(d0Var, yVar);
            Object objJ = this.f9081g.j(new j0(e1Var.f0(), null), cVar);
            if (objJ == zb.a.f26667a) {
                return objJ;
            }
        }
        return ub.a0.f21526a;
    }

    public final Object k(g1 g1Var, d0 d0Var, ac.c cVar) {
        c7.e1 e1Var = g1Var.f9129j;
        b0 b0VarW = e1Var.w(d0Var);
        z zVar = z.f9388b;
        if (!jc.l.a(b0VarW, zVar)) {
            e1Var.Y(d0Var, zVar);
            Object objJ = this.f9081g.j(new j0(e1Var.f0(), null), cVar);
            if (objJ == zb.a.f26667a) {
                return objJ;
            }
        }
        return ub.a0.f21526a;
    }
}
