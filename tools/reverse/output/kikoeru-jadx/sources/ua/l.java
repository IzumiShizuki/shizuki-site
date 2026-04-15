package ua;

import android.view.View;
import b0.l0;
import bd.s0;
import ce.j0;
import com.cnl.kikoeru.R;
import d0.y;
import f3.m;
import g2.e0;
import j1.q;
import j2.l1;
import j2.z2;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Map;
import java.util.logging.Logger;
import jc.c0;
import jc.z;
import n7.x;
import p4.s;
import q1.n0;
import t2.k0;
import u.e1;
import ud.n;
import wf.d1;
import x0.o;
import x0.o2;
import x0.p1;
import x0.y1;
import xf.r;
import y.u;
import y.v;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class l implements vf.b, vf.a {
    public static r E(ic.k kVar) {
        xf.b bVar = xf.c.f24987d;
        jc.l.e(bVar, "from");
        xf.h hVar = new xf.h();
        xf.j jVar = bVar.f24988a;
        hVar.f24999a = jVar.f25004a;
        boolean z10 = jVar.f25006c;
        hVar.f25000b = jVar.f25005b;
        String str = jVar.f25007d;
        hVar.f25001c = jVar.f25008e;
        hVar.f25002d = jVar.f25009f;
        xf.a aVar = jVar.f25011h;
        boolean z11 = jVar.f25010g;
        hVar.f25003e = bVar.f24989b;
        kVar.a(hVar);
        if (!jc.l.a(str, "    ")) {
            throw new IllegalArgumentException("Indent should not be specified when default printing mode is used");
        }
        xf.j jVar2 = new xf.j(hVar.f24999a, hVar.f25000b, z10, str, hVar.f25001c, hVar.f25002d, z11, aVar);
        y yVar = hVar.f25003e;
        jc.l.e(yVar, "module");
        r rVar = new r(jVar2, yVar);
        if (!yVar.equals(zf.d.f26817a)) {
            boolean z12 = jVar2.f25011h != xf.a.f24982a;
            for (Map.Entry entry : ((Map) yVar.f5431b).entrySet()) {
                pc.c cVar = (pc.c) entry.getKey();
                zf.c cVar2 = (zf.c) entry.getValue();
                if (cVar2 instanceof zf.a) {
                    jc.l.c(cVar, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
                    throw null;
                }
                if (!(cVar2 instanceof zf.b)) {
                    throw new j0();
                }
                jc.l.e(cVar, "kClass");
            }
            for (Map.Entry entry2 : ((Map) yVar.f5432c).entrySet()) {
                pc.c cVar3 = (pc.c) entry2.getKey();
                for (Map.Entry entry3 : ((Map) entry2.getValue()).entrySet()) {
                    pc.c cVar4 = (pc.c) entry3.getKey();
                    sf.a aVar2 = (sf.a) entry3.getValue();
                    jc.l.c(cVar3, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
                    jc.l.c(cVar4, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
                    jc.l.c(aVar2, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
                    uf.g gVarA = aVar2.a();
                    n nVarJ = gVarA.j();
                    if ((nVarJ instanceof uf.d) || jc.l.a(nVarJ, uf.i.f21703b)) {
                        throw new IllegalArgumentException("Serializer for " + cVar4.y() + " can't be registered as a subclass for polymorphic serialization because its kind " + nVarJ + " is not concrete. To work with multiple hierarchies, register it as a base class.");
                    }
                    if (z12 && (jc.l.a(nVarJ, uf.k.f21706c) || jc.l.a(nVarJ, uf.k.f21707d) || (nVarJ instanceof uf.f) || (nVarJ instanceof uf.j))) {
                        throw new IllegalArgumentException("Serializer for " + cVar4.y() + " of kind " + nVarJ + " cannot be serialized polymorphically with class discriminator.");
                    }
                    if (z12) {
                        int iP = gVarA.p();
                        for (int i10 = 0; i10 < iP; i10++) {
                            String strQ = gVarA.q(i10);
                            if (jc.l.a(strQ, jVar2.f25009f)) {
                                throw new IllegalArgumentException("Polymorphic serializer for " + cVar4 + " has property '" + strQ + "' that conflicts with JSON class discriminator. You can either change class discriminator in JsonConfiguration, rename property with @SerialName annotation or fall back to array polymorphism");
                            }
                        }
                    }
                }
            }
            for (Map.Entry entry4 : ((Map) yVar.f5433d).entrySet()) {
                pc.c cVar5 = (pc.c) entry4.getKey();
                ic.k kVar2 = (ic.k) entry4.getValue();
                jc.l.c(cVar5, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
                jc.l.c(kVar2, "null cannot be cast to non-null type kotlin.Function1<@[ParameterName(name = \"value\")] kotlin.Any, kotlinx.serialization.SerializationStrategy<kotlin.Any>?>");
                c0.c(1, kVar2);
            }
            for (Map.Entry entry5 : ((Map) yVar.f5435f).entrySet()) {
                pc.c cVar6 = (pc.c) entry5.getKey();
                ic.k kVar3 = (ic.k) entry5.getValue();
                jc.l.c(cVar6, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
                jc.l.c(kVar3, "null cannot be cast to non-null type kotlin.Function1<@[ParameterName(name = \"className\")] kotlin.String?, kotlinx.serialization.DeserializationStrategy<kotlin.Any>?>");
                c0.c(1, kVar3);
            }
        }
        return rVar;
    }

    public static final void F(long j10, ta.c cVar, float f10, o oVar, int i10) {
        int i11;
        jc.l.e(cVar, "color");
        oVar.Y(-2138992356);
        if ((i10 & 14) == 0) {
            i11 = (oVar.e(j10) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 112) == 0) {
            i11 |= oVar.f(cVar) ? 32 : 16;
        }
        if ((i10 & 896) == 0) {
            i11 |= oVar.c(f10) ? 256 : 128;
        }
        if ((i11 & 731) == 146 && oVar.z()) {
            oVar.Q();
        } else {
            o2 o2Var = l1.f9866h;
            f3.c cVar2 = (f3.c) oVar.j(o2Var);
            float f11 = f10 / 2;
            float fJ = cVar2.J(p1.b.e(j10)) - f11;
            float fJ2 = cVar2.J(p1.b.f(j10)) - f11;
            j1.n nVar = j1.n.f9689a;
            q qVarK = androidx.compose.foundation.layout.c.k(androidx.compose.foundation.layout.a.h(nVar, fJ, fJ2), f10, f10);
            oVar.X(-483455358);
            v vVarA = u.a(y.k.f25158c, j1.c.f9674m, oVar, 0);
            oVar.X(-1323940314);
            f3.c cVar3 = (f3.c) oVar.j(o2Var);
            m mVar = (m) oVar.j(l1.f9872n);
            z2 z2Var = (z2) oVar.j(l1.f9877s);
            i2.k.f8771g0.getClass();
            i2.i iVar = i2.j.f8733b;
            int i12 = i11;
            f1.f fVar = new f1.f(new e0(qVarK, 1), -2123382363, true);
            oVar.a0();
            if (oVar.S) {
                oVar.k(iVar);
            } else {
                oVar.k0();
            }
            oVar.f24399y = false;
            x0.v.A(i2.j.f8738g, vVarA, oVar);
            x0.v.A(i2.j.f8736e, cVar3, oVar);
            x0.v.A(i2.j.f8739h, mVar, oVar);
            x0.v.A(i2.j.f8740i, z2Var, oVar);
            oVar.f24399y = oVar.f24400z >= 0;
            fVar.g(new y1(oVar), oVar, 0);
            oVar.X(2058660585);
            oVar.X(-1163856341);
            G(androidx.compose.foundation.layout.c.j(nVar, f10), cVar, oVar, i12 & 112);
            oVar.p(false);
            oVar.p(false);
            oVar.p(true);
            oVar.p(false);
            oVar.p(false);
        }
        p1 p1VarR = oVar.r();
        if (p1VarR == null) {
            return;
        }
        p1VarR.f24421d = new k(j10, cVar, f10, i10);
    }

    public static final void G(q qVar, ta.c cVar, o oVar, int i10) {
        int i11;
        oVar.Y(378719274);
        if ((i10 & 14) == 0) {
            i11 = (oVar.f(qVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 112) == 0) {
            i11 |= oVar.f(cVar) ? 32 : 16;
        }
        if ((i11 & 91) == 18 && oVar.z()) {
            oVar.Q();
        } else {
            android.support.v4.media.session.b.m(qVar, g0.g.f7122a, cVar.b(), 0L, new s.o(2, new n0(q1.q.f17571d)), 4, d.f21494a, oVar, 1769472 | (i11 & 14), 8);
        }
        p1 p1VarR = oVar.r();
        if (p1VarR == null) {
            return;
        }
        p1VarR.f24421d = new l0(qVar, cVar, i10, 8);
    }

    public static final void H(Logger logger, yg.a aVar, yg.b bVar, String str) {
        logger.fine(bVar.f26348b + ' ' + String.format("%-22s", Arrays.copyOf(new Object[]{str}, 1)) + ": " + aVar.f26343a);
    }

    public static final zc.h I(zc.h hVar, zc.h hVar2) {
        jc.l.e(hVar, "first");
        jc.l.e(hVar2, "second");
        return hVar.isEmpty() ? hVar2 : hVar2.isEmpty() ? hVar : new zc.i(new zc.h[]{hVar, hVar2});
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ac  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String J(yc.t r6, int r7) {
        /*
            Method dump skipped, instruction units count: 201
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ua.l.J(yc.t, int):java.lang.String");
    }

    public static final String K(yc.b bVar) {
        jc.l.e(bVar, "<this>");
        if (!ee.e.n(bVar)) {
            yc.k kVarY = bVar.y();
            yc.e eVar = kVarY instanceof yc.e ? (yc.e) kVarY : null;
            if (eVar != null && !eVar.getName().f2752b) {
                yc.b bVarA = bVar.a();
                s0 s0Var = bVarA instanceof s0 ? (s0) bVarA : null;
                if (s0Var != null) {
                    return j.y(eVar, J(s0Var, 3));
                }
            }
        }
        return null;
    }

    public static final void L(int i10, int i11) {
        if (i10 <= i11) {
            return;
        }
        throw new IndexOutOfBoundsException("toIndex (" + i10 + ") is greater than size (" + i11 + ").");
    }

    public static int M(String str, int i10, int i11, boolean z10) {
        while (i10 < i11) {
            char cCharAt = str.charAt(i10);
            if (((cCharAt < ' ' && cCharAt != '\t') || cCharAt >= 127 || ('0' <= cCharAt && cCharAt < ':') || (('a' <= cCharAt && cCharAt < '{') || (('A' <= cCharAt && cCharAt < '[') || cCharAt == ':'))) == (!z10)) {
                return i10;
            }
            i10++;
        }
        return i11;
    }

    public static final void O(lh.l lVar, lh.y yVar) throws IOException {
        try {
            IOException iOException = null;
            for (lh.y yVar2 : lVar.u(yVar)) {
                try {
                    if (lVar.y(yVar2).f12584b) {
                        O(lVar, yVar2);
                    }
                    lVar.n(yVar2);
                } catch (IOException e10) {
                    if (iOException == null) {
                        iOException = e10;
                    }
                }
            }
            if (iOException != null) {
                throw iOException;
            }
        } catch (FileNotFoundException unused) {
        }
    }

    public static final String P(long j10) {
        return String.format("%6s", Arrays.copyOf(new Object[]{j10 <= -999500000 ? a0.c.H((j10 - ((long) 500000000)) / ((long) 1000000000), " s ", new StringBuilder()) : j10 <= -999500 ? a0.c.H((j10 - ((long) 500000)) / ((long) 1000000), " ms", new StringBuilder()) : j10 <= 0 ? a0.c.H((j10 - ((long) 500)) / ((long) 1000), " µs", new StringBuilder()) : j10 < 999500 ? a0.c.H((j10 + ((long) 500)) / ((long) 1000), " µs", new StringBuilder()) : j10 < 999500000 ? a0.c.H((j10 + ((long) 500000)) / ((long) 1000000), " ms", new StringBuilder()) : a0.c.H((j10 + ((long) 500000000)) / ((long) 1000000000), " s ", new StringBuilder())}, 1));
    }

    public static final long Q(e1 e1Var, int i10) {
        jc.l.e(e1Var, "orientation");
        int iOrdinal = e1Var.ordinal();
        if (iOrdinal == 0) {
            return android.support.v4.media.session.b.e(0, i10);
        }
        if (iOrdinal == 1) {
            return android.support.v4.media.session.b.e(i10, 0);
        }
        throw new j0();
    }

    public static final w7.e R(View view) {
        jc.l.e(view, "<this>");
        while (view != null) {
            Object tag = view.getTag(R.id.view_tree_saved_state_registry_owner);
            w7.e eVar = tag instanceof w7.e ? (w7.e) tag : null;
            if (eVar != null) {
                return eVar;
            }
            Object objX = ud.e.x(view);
            view = objX instanceof View ? (View) objX : null;
        }
        return null;
    }

    public static final float S(long j10, e1 e1Var) {
        jc.l.e(e1Var, "orientation");
        int iOrdinal = e1Var.ordinal();
        if (iOrdinal == 0) {
            return p1.b.f(j10);
        }
        if (iOrdinal == 1) {
            return p1.b.e(j10);
        }
        throw new j0();
    }

    public static final yb.h T(n7.v vVar, boolean z10, ac.c cVar) {
        if (!vVar.j()) {
            return ((nf.d) vVar.e()).f15823a;
        }
        x xVar = (x) cVar.s().R(x.f15588c);
        if (xVar != null) {
            yb.e eVar = xVar.f15589a;
            nf.d dVar = vVar.f15575a;
            if (dVar == null) {
                jc.l.k("coroutineScope");
                throw null;
            }
            yb.h hVarG = dVar.f15823a.G(eVar);
            if (hVarG != null) {
                return hVarG;
            }
        }
        if (z10) {
            yb.h hVar = vVar.f15576b;
            if (hVar != null) {
                return hVar;
            }
            jc.l.k("transactionContext");
            throw null;
        }
        nf.d dVar2 = vVar.f15575a;
        if (dVar2 != null) {
            return dVar2.f15823a;
        }
        jc.l.k("coroutineScope");
        throw null;
    }

    public static xa.i U(xa.i iVar) {
        return ((iVar instanceof xa.k) || (iVar instanceof xa.j)) ? iVar : iVar instanceof Serializable ? new xa.j(iVar) : new xa.k(iVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static long V(int r14, java.lang.String r15) {
        /*
            Method dump skipped, instruction units count: 323
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ua.l.V(int, java.lang.String):long");
    }

    public static final Object W(n7.v vVar, boolean z10, boolean z11, ic.k kVar) {
        jc.l.e(vVar, "db");
        vVar.a();
        if (!vVar.j() || vVar.k() || vVar.f15583i.get() == null) {
            return nd.h.t(new v7.c(vVar, z11, z10, kVar, (yb.c) null));
        }
        throw new IllegalStateException("Cannot access database on a different coroutine context inherited from a suspending transaction.");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object X(n7.v r16, boolean r17, boolean r18, ic.k r19, yb.c r20) {
        /*
            r0 = r20
            boolean r1 = r0 instanceof v7.d
            if (r1 == 0) goto L16
            r1 = r0
            v7.d r1 = (v7.d) r1
            int r2 = r1.f22763i
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L16
            int r2 = r2 - r3
            r1.f22763i = r2
        L14:
            r7 = r1
            goto L1c
        L16:
            v7.d r1 = new v7.d
            r1.<init>(r0)
            goto L14
        L1c:
            java.lang.Object r0 = r7.f22762h
            int r1 = r7.f22763i
            r2 = 3
            r3 = 2
            r8 = 1
            zb.a r9 = zb.a.f26667a
            if (r1 == 0) goto L4d
            if (r1 == r8) goto L49
            if (r1 == r3) goto L39
            if (r1 != r2) goto L31
            ub.a.f(r0)
            return r0
        L31:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L39:
            boolean r1 = r7.f22761g
            boolean r3 = r7.f22760f
            ic.k r4 = r7.f22759e
            n7.v r5 = r7.f22758d
            ub.a.f(r0)
            r14 = r1
            r13 = r3
            r15 = r4
            r12 = r5
            goto L9c
        L49:
            ub.a.f(r0)
            return r0
        L4d:
            ub.a.f(r0)
            boolean r0 = r16.j()
            if (r0 == 0) goto L7e
            boolean r0 = r16.m()
            if (r0 == 0) goto L7e
            boolean r0 = r16.k()
            if (r0 == 0) goto L7e
            v7.b r0 = new v7.b
            r4 = 0
            r6 = 1
            r3 = r16
            r2 = r17
            r1 = r18
            r5 = r19
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r1 = r2
            r2 = r0
            r0 = r3
            r7.f22763i = r8
            java.lang.Object r0 = r0.n(r1, r2, r7)
            if (r0 != r9) goto L7d
            goto Lb1
        L7d:
            return r0
        L7e:
            r0 = r16
            r1 = r17
            r4 = r18
            r7.f22758d = r0
            r5 = r19
            r7.f22759e = r5
            r7.f22760f = r1
            r7.f22761g = r4
            r7.f22763i = r3
            yb.h r3 = T(r0, r4, r7)
            if (r3 != r9) goto L97
            goto Lb1
        L97:
            r12 = r0
            r13 = r1
            r0 = r3
            r14 = r4
            r15 = r5
        L9c:
            yb.h r0 = (yb.h) r0
            v7.c r10 = new v7.c
            r11 = 0
            r10.<init>(r11, r12, r13, r14, r15)
            r1 = 0
            r7.f22758d = r1
            r7.f22759e = r1
            r7.f22763i = r2
            java.lang.Object r0 = hf.a0.H(r0, r10, r7)
            if (r0 != r9) goto Lb2
        Lb1:
            return r9
        Lb2:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ua.l.X(n7.v, boolean, boolean, ic.k, yb.c):java.lang.Object");
    }

    public static long Y(s sVar, int i10, int i11) {
        sVar.G(i10);
        if (sVar.a() < 5) {
            return -9223372036854775807L;
        }
        int iG = sVar.g();
        if ((8388608 & iG) != 0 || ((2096896 & iG) >> 8) != i11 || (iG & 32) == 0 || sVar.u() < 7 || sVar.a() < 7 || (sVar.u() & 16) != 16) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[6];
        sVar.e(bArr, 0, 6);
        return ((((long) bArr[0]) & 255) << 25) | ((((long) bArr[1]) & 255) << 17) | ((((long) bArr[2]) & 255) << 9) | ((((long) bArr[3]) & 255) << 1) | ((255 & ((long) bArr[4])) >> 7);
    }

    /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.RegisterArg.sameRegAndSVar(jadx.core.dex.instructions.args.InsnArg)" because "resultArg" is null
        	at jadx.core.dex.visitors.MoveInlineVisitor.processMove(MoveInlineVisitor.java:52)
        	at jadx.core.dex.visitors.MoveInlineVisitor.moveInline(MoveInlineVisitor.java:41)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:43)
        */
    public static final j2.f1 Z(
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r21v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:224)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:169)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:407)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:337)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:303)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
        */
    /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.RegisterArg.sameRegAndSVar(jadx.core.dex.instructions.args.InsnArg)" because "resultArg" is null
        	at jadx.core.dex.visitors.MoveInlineVisitor.processMove(MoveInlineVisitor.java:52)
        	at jadx.core.dex.visitors.MoveInlineVisitor.moveInline(MoveInlineVisitor.java:41)
        */

    public static final long a0(long j10, long j11) {
        int iC;
        int iE = k0.e(j10);
        int iD = k0.d(j10);
        if ((k0.e(j11) < k0.d(j10)) && (k0.e(j10) < k0.d(j11))) {
            if ((k0.e(j11) <= k0.e(j10)) && (k0.d(j10) <= k0.d(j11))) {
                iE = k0.e(j11);
                iD = iE;
            } else {
                if ((k0.e(j10) <= k0.e(j11)) && (k0.d(j11) <= k0.d(j10))) {
                    iC = k0.c(j11);
                } else {
                    int iE2 = k0.e(j11);
                    if (iE >= k0.d(j11) || iE2 > iE) {
                        iD = k0.e(j11);
                    } else {
                        iE = k0.e(j11);
                        iC = k0.c(j11);
                    }
                }
                iD -= iC;
            }
        } else if (iD > k0.e(j11)) {
            iE -= k0.c(j11);
            iC = k0.c(j11);
            iD -= iC;
        }
        return t2.c0.b(iE, iD);
    }

    @Override // vf.b
    public abstract short A();

    @Override // vf.b
    public float B() {
        N();
        throw null;
    }

    @Override // vf.a
    public float C(uf.g gVar, int i10) {
        jc.l.e(gVar, "descriptor");
        return B();
    }

    @Override // vf.b
    public double D() {
        N();
        throw null;
    }

    public void N() {
        throw new sf.h(z.f10839a.b(getClass()) + " can't retrieve untyped values");
    }

    @Override // vf.a
    public Object a(uf.g gVar, int i10, sf.a aVar, Object obj) {
        jc.l.e(gVar, "descriptor");
        if (aVar.a().n() || v()) {
            return d(aVar);
        }
        return null;
    }

    @Override // vf.a
    public double c(uf.g gVar, int i10) {
        jc.l.e(gVar, "descriptor");
        return D();
    }

    @Override // vf.b
    public Object d(sf.a aVar) {
        jc.l.e(aVar, "deserializer");
        return aVar.b(this);
    }

    @Override // vf.b
    public boolean e() {
        N();
        throw null;
    }

    @Override // vf.b
    public vf.b f(uf.g gVar) {
        jc.l.e(gVar, "descriptor");
        return this;
    }

    @Override // vf.a
    public Object g(uf.g gVar, int i10, sf.a aVar, Object obj) {
        jc.l.e(gVar, "descriptor");
        jc.l.e(aVar, "deserializer");
        return d(aVar);
    }

    @Override // vf.b
    public char h() {
        N();
        throw null;
    }

    @Override // vf.b
    public vf.a i(uf.g gVar) {
        jc.l.e(gVar, "descriptor");
        return this;
    }

    @Override // vf.a
    public void j(uf.g gVar) {
        jc.l.e(gVar, "descriptor");
    }

    @Override // vf.b
    public int k(uf.g gVar) {
        jc.l.e(gVar, "enumDescriptor");
        N();
        throw null;
    }

    @Override // vf.b
    public abstract int m();

    @Override // vf.a
    public byte n(d1 d1Var, int i10) {
        jc.l.e(d1Var, "descriptor");
        return z();
    }

    @Override // vf.a
    public boolean o(uf.g gVar, int i10) {
        jc.l.e(gVar, "descriptor");
        return e();
    }

    @Override // vf.a
    public String q(uf.g gVar, int i10) {
        jc.l.e(gVar, "descriptor");
        return r();
    }

    @Override // vf.b
    public String r() {
        N();
        throw null;
    }

    @Override // vf.a
    public vf.b s(d1 d1Var, int i10) {
        jc.l.e(d1Var, "descriptor");
        return f(d1Var.s(i10));
    }

    @Override // vf.a
    public int t(uf.g gVar, int i10) {
        jc.l.e(gVar, "descriptor");
        return m();
    }

    @Override // vf.b
    public abstract long u();

    @Override // vf.b
    public boolean v() {
        return true;
    }

    @Override // vf.a
    public char w(d1 d1Var, int i10) {
        jc.l.e(d1Var, "descriptor");
        return h();
    }

    @Override // vf.a
    public short x(d1 d1Var, int i10) {
        jc.l.e(d1Var, "descriptor");
        return A();
    }

    @Override // vf.a
    public long y(uf.g gVar, int i10) {
        jc.l.e(gVar, "descriptor");
        return u();
    }

    @Override // vf.b
    public abstract byte z();
}
