package i2;

import android.os.SystemClock;
import android.view.MotionEvent;
import java.util.Collection;
import java.util.HashSet;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class c extends j1.p implements z, p, y1, u1, h2.e, h2.f, s1, y, q, o1.e, o1.p, o1.s, q1, n1.a {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public j1.o f8654o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public h2.a f8655p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public HashSet f8656q;

    @Override // i2.y1
    public final /* synthetic */ boolean A() {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x005a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void B0(boolean r6) {
        /*
            Method dump skipped, instruction units count: 294
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: i2.c.B0(boolean):void");
    }

    public final void C0() {
        if (!this.f9703n) {
            f2.a.b("unInitializeModifier called on unattached node");
        }
        j1.o oVar = this.f8654o;
        if ((this.f9692c & 32) != 0) {
            if (oVar instanceof y.s0) {
                h2.d modifierLocalManager = ((j2.v) f.z(this)).getModifierLocalManager();
                h2.g gVar = y.u1.f25267a;
                modifierLocalManager.f8109d.b(f.y(this));
                modifierLocalManager.f8110e.b(gVar);
                modifierLocalManager.a();
            }
            if (oVar instanceof h2.c) {
                ((h2.c) oVar).i(f.f8687a);
            }
        }
        if ((this.f9692c & 8) != 0) {
            ((j2.v) f.z(this)).F();
        }
    }

    public final void D0() {
        if (this.f9703n) {
            this.f8656q.clear();
            ((j2.v) f.z(this)).getSnapshotObserver().a(this, e.f8672c, new b(this, 1));
        }
    }

    @Override // i2.p
    public final void G() {
        f.m(this);
    }

    @Override // i2.u1
    public final void H() {
        j1.o oVar = this.f8654o;
        jc.l.c(oVar, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        ((c2.z) oVar).f3358d.getClass();
    }

    @Override // h2.e
    public final a2.c K() {
        h2.a aVar = this.f8655p;
        return aVar != null ? aVar : h2.b.f8105d;
    }

    @Override // i2.y1
    public final void L(q2.k kVar) {
        char c3;
        j1.o oVar = this.f8654o;
        jc.l.c(oVar, "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsModifier");
        q2.k kVarJ = ((q2.l) oVar).j();
        jc.l.c(kVar, "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsConfiguration");
        o.k0 k0Var = kVar.f17630a;
        if (kVarJ.f17632c) {
            kVar.f17632c = true;
        }
        if (kVarJ.f17633d) {
            kVar.f17633d = true;
        }
        o.k0 k0Var2 = kVarJ.f17630a;
        Object[] objArr = k0Var2.f15996b;
        Object[] objArr2 = k0Var2.f15997c;
        long[] jArr = k0Var2.f15995a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i10 = 0;
        while (true) {
            long j10 = jArr[i10];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i10 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j10) < 128) {
                        int i13 = (i10 << 3) + i12;
                        Object obj = objArr[i13];
                        Object obj2 = objArr2[i13];
                        q2.w wVar = (q2.w) obj;
                        if (!k0Var.b(wVar)) {
                            k0Var.m(wVar, obj2);
                        } else if (obj2 instanceof q2.a) {
                            Object objG = k0Var.g(wVar);
                            jc.l.c(objG, "null cannot be cast to non-null type androidx.compose.ui.semantics.AccessibilityAction<*>");
                            q2.a aVar = (q2.a) objG;
                            c3 = '\b';
                            String str = aVar.f17586a;
                            if (str == null) {
                                str = ((q2.a) obj2).f17586a;
                            }
                            ub.e eVar = aVar.f17587b;
                            if (eVar == null) {
                                eVar = ((q2.a) obj2).f17587b;
                            }
                            k0Var.m(wVar, new q2.a(str, eVar));
                        }
                        c3 = '\b';
                    } else {
                        c3 = '\b';
                    }
                    j10 >>= c3;
                }
                if (i11 != 8) {
                    return;
                }
            }
            if (i10 == length) {
                return;
            } else {
                i10++;
            }
        }
    }

    @Override // i2.p
    public final void R(l0 l0Var) {
        j1.o oVar = this.f8654o;
        jc.l.c(oVar, "null cannot be cast to non-null type androidx.compose.ui.draw.DrawModifier");
        ((s.p0) oVar).f19254a.b(l0Var);
    }

    @Override // o1.p
    public final void Y(o1.l lVar) {
        j1.o oVar = this.f8654o;
        f2.a.b("applyFocusProperties called on wrong node");
        oVar.getClass();
        throw new ClassCastException();
    }

    @Override // n1.a
    public final f3.c a() {
        return f.y(this).f8766y;
    }

    @Override // i2.z
    public final int b(q0 q0Var, g2.u0 u0Var, int i10) {
        j1.o oVar = this.f8654o;
        jc.l.c(oVar, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((g2.f0) oVar).b(q0Var, u0Var, i10);
    }

    @Override // i2.z
    public final int c(q0 q0Var, g2.u0 u0Var, int i10) {
        j1.o oVar = this.f8654o;
        jc.l.c(oVar, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((g2.f0) oVar).c(q0Var, u0Var, i10);
    }

    @Override // i2.z
    public final int d(q0 q0Var, g2.u0 u0Var, int i10) {
        j1.o oVar = this.f8654o;
        jc.l.c(oVar, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((g2.f0) oVar).d(q0Var, u0Var, i10);
    }

    @Override // i2.u1
    public final boolean d0() {
        j1.o oVar = this.f8654o;
        jc.l.c(oVar, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        ((c2.z) oVar).f3358d.getClass();
        return true;
    }

    @Override // n1.a
    public final long e() {
        return gh.g.R(f.v(this, 128).f7182c);
    }

    @Override // i2.z
    public final int f(q0 q0Var, g2.u0 u0Var, int i10) {
        j1.o oVar = this.f8654o;
        jc.l.c(oVar, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((g2.f0) oVar).f(q0Var, u0Var, i10);
    }

    @Override // i2.z
    public final g2.w0 g(g2.x0 x0Var, g2.u0 u0Var, long j10) {
        j1.o oVar = this.f8654o;
        jc.l.c(oVar, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((g2.f0) oVar).g(x0Var, u0Var, j10);
    }

    @Override // n1.a
    public final f3.m getLayoutDirection() {
        return f.y(this).f8767z;
    }

    @Override // i2.y1
    public final /* synthetic */ boolean h() {
        return true;
    }

    @Override // i2.u1
    public final void h0() {
        z();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    @Override // i2.u1
    public final void j(c2.l lVar, c2.m mVar, long j10) {
        boolean z10;
        boolean z11;
        boolean z12;
        j1.o oVar = this.f8654o;
        jc.l.c(oVar, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        b0.w1 w1Var = ((c2.z) oVar).f3358d;
        c2.z zVar = (c2.z) w1Var.f1394b;
        ?? r0 = lVar.f3309a;
        Collection collection = (Collection) r0;
        int size = collection.size();
        for (int i10 = 0; i10 < size; i10++) {
            c2.t tVar = (c2.t) r0.get(i10);
            if (c2.s.a(tVar) || c2.s.c(tVar)) {
                z10 = false;
                break;
            }
        }
        z10 = true;
        if (!z10) {
            z11 = false;
            break;
        }
        int size2 = collection.size();
        for (int i11 = 0; i11 < size2; i11++) {
            if (((c2.t) r0.get(i11)).b()) {
                z11 = false;
                break;
            }
        }
        z11 = true;
        if (zVar.f3357c) {
            z12 = true;
        } else {
            int size3 = collection.size();
            int i12 = 0;
            while (true) {
                if (i12 < size3) {
                    c2.t tVar2 = (c2.t) r0.get(i12);
                    if (c2.s.a(tVar2) || c2.s.c(tVar2)) {
                        break;
                    } else {
                        i12++;
                    }
                } else if (z11) {
                    break;
                } else {
                    z12 = false;
                }
            }
            z12 = true;
        }
        c2.y yVar = (c2.y) w1Var.f1396d;
        c2.y yVar2 = c2.y.f3353c;
        c2.m mVar2 = c2.m.f3316c;
        if (yVar != yVar2) {
            if (mVar == c2.m.f3314a && z12) {
                w1Var.f1397e = lVar;
                w1Var.A(lVar, !z10 || zVar.f3357c);
            }
            if (mVar == c2.m.f3315b && z10 && lVar.equals((c2.l) w1Var.f1397e) && zVar.f3357c) {
                int size4 = collection.size();
                for (int i13 = 0; i13 < size4; i13++) {
                    ((c2.t) r0.get(i13)).a();
                }
            }
            if (mVar == mVar2 && !z12 && !lVar.equals((c2.l) w1Var.f1397e)) {
                w1Var.A(lVar, true);
            }
        }
        if (mVar == mVar2) {
            int size5 = collection.size();
            int i14 = 0;
            while (true) {
                if (i14 >= size5) {
                    w1Var.f1396d = c2.y.f3351a;
                    ((c2.z) w1Var.f1394b).f3357c = false;
                    w1Var.f1397e = null;
                    break;
                } else if (!c2.s.c((c2.t) r0.get(i14))) {
                    break;
                } else {
                    i14++;
                }
            }
            if (lVar.equals((c2.l) w1Var.f1397e) && z10) {
                int size6 = collection.size();
                int i15 = 0;
                while (true) {
                    if (i15 >= size6) {
                        break;
                    }
                    if (!((c2.t) r0.get(i15)).b()) {
                        i15++;
                    } else if (!zVar.f3357c) {
                        w1Var.f0(lVar);
                        return;
                    }
                }
                int size7 = collection.size();
                for (int i16 = 0; i16 < size7; i16++) {
                    ((c2.t) r0.get(i16)).a();
                }
            }
        }
    }

    @Override // i2.y1
    public final /* synthetic */ boolean k0() {
        return false;
    }

    @Override // i2.u1
    public final long l() {
        return b2.f8652a;
    }

    @Override // i2.s1
    public final Object l0(Object obj) {
        j1.o oVar = this.f8654o;
        jc.l.c(oVar, "null cannot be cast to non-null type androidx.compose.ui.layout.ParentDataModifier");
        return (q.i) oVar;
    }

    @Override // o1.e
    public final void o(o1.u uVar) {
        j1.o oVar = this.f8654o;
        f2.a.b("onFocusEvent called on wrong node");
        oVar.getClass();
        throw new ClassCastException();
    }

    @Override // i2.q1
    public final boolean q() {
        return this.f9703n;
    }

    @Override // j1.p
    public final void r0() {
        B0(true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10, types: [j1.p] */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [j1.p] */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [z0.e] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [z0.e] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v6 */
    @Override // h2.f
    public final Object s(h2.g gVar) {
        d1 d1Var;
        this.f8656q.add(gVar);
        if (!this.f9690a.f9703n) {
            f2.a.b("visitAncestors called on an unattached node");
        }
        j1.p pVar = this.f9690a.f9694e;
        j0 j0VarY = f.y(this);
        while (j0VarY != null) {
            if ((j0VarY.F.f8667f.f9693d & 32) != 0) {
                while (pVar != null) {
                    if ((pVar.f9692c & 32) != 0) {
                        ?? F = pVar;
                        ?? eVar = 0;
                        while (F != 0) {
                            if (F instanceof h2.e) {
                                h2.e eVar2 = (h2.e) F;
                                if (eVar2.K().C(gVar)) {
                                    return eVar2.K().I(gVar);
                                }
                            } else if ((F.f9692c & 32) != 0 && (F instanceof n)) {
                                j1.p pVar2 = ((n) F).f8789p;
                                int i10 = 0;
                                F = F;
                                eVar = eVar;
                                while (pVar2 != null) {
                                    if ((pVar2.f9692c & 32) != 0) {
                                        i10++;
                                        eVar = eVar;
                                        if (i10 == 1) {
                                            F = pVar2;
                                        } else {
                                            if (eVar == 0) {
                                                eVar = new z0.e(new j1.p[16]);
                                            }
                                            if (F != 0) {
                                                eVar.b(F);
                                                F = 0;
                                            }
                                            eVar.b(pVar2);
                                        }
                                    }
                                    pVar2 = pVar2.f9695f;
                                    F = F;
                                    eVar = eVar;
                                }
                                if (i10 == 1) {
                                }
                            }
                            F = f.f(eVar);
                        }
                    }
                    pVar = pVar.f9694e;
                }
            }
            j0VarY = j0VarY.v();
            pVar = (j0VarY == null || (d1Var = j0VarY.F) == null) ? null : d1Var.f8666e;
        }
        return gVar.f8112a.b();
    }

    @Override // j1.p
    public final void s0() {
        if (this.f8654o instanceof c2.z) {
            z();
        }
    }

    @Override // j1.p
    public final void t0() {
        C0();
    }

    public final String toString() {
        return this.f8654o.toString();
    }

    @Override // i2.q
    public final void u(g1 g1Var) {
        j1.o oVar = this.f8654o;
        jc.l.c(oVar, "null cannot be cast to non-null type androidx.compose.ui.layout.OnGloballyPositionedModifier");
        b0.e eVar = (b0.e) oVar;
        if (eVar.f1216a) {
            return;
        }
        eVar.f1216a = true;
        hf.k kVar = eVar.f1217b;
        if (kVar != null) {
            kVar.h(ub.a0.f21526a);
        }
        eVar.f1217b = null;
    }

    @Override // i2.u1
    public final void z() {
        j1.o oVar = this.f8654o;
        jc.l.c(oVar, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        b0.w1 w1Var = ((c2.z) oVar).f3358d;
        c2.y yVar = (c2.y) w1Var.f1396d;
        c2.z zVar = (c2.z) w1Var.f1394b;
        if (yVar == c2.y.f3352b) {
            long jUptimeMillis = SystemClock.uptimeMillis();
            MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
            motionEventObtain.setSource(0);
            ((c2.a0) zVar.h()).a(motionEventObtain);
            motionEventObtain.recycle();
            w1Var.f1396d = c2.y.f3351a;
            zVar.f3357c = false;
            w1Var.f1397e = null;
        }
    }

    @Override // i2.y
    public final void B(g2.c0 c0Var) {
    }

    @Override // i2.y
    public final void m(long j10) {
    }
}
