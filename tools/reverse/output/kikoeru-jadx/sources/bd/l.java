package bd;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public class l extends z implements yc.j {
    public final boolean D;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(yc.e eVar, yc.j jVar, zc.h hVar, boolean z10, int i10, yc.m0 m0Var) {
        super(i10, be.g.f2759e, eVar, jVar, m0Var, hVar);
        if (eVar == null) {
            U0(0);
            throw null;
        }
        if (hVar == null) {
            U0(1);
            throw null;
        }
        if (i10 == 0) {
            U0(2);
            throw null;
        }
        if (m0Var == null) {
            U0(3);
            throw null;
        }
        this.D = z10;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x001a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x000e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ void U0(int r8) {
        /*
            Method dump skipped, instruction units count: 354
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bd.l.U0(int):void");
    }

    @Override // bd.z, yc.c, yc.b
    public final Collection A() {
        Set set = Collections.EMPTY_SET;
        if (set != null) {
            return set;
        }
        U0(21);
        throw null;
    }

    @Override // bd.z, yc.c
    public final yc.c F0(yc.e eVar, yc.x xVar, ld.o oVar) {
        return (l) E1(eVar, xVar, oVar);
    }

    @Override // bd.z, yc.c
    public final void H0(Collection collection) {
        if (collection != null) {
            return;
        }
        U0(22);
        throw null;
    }

    @Override // bd.z
    /* JADX INFO: renamed from: O1, reason: merged with bridge method [inline-methods] */
    public l F1(int i10, be.e eVar, yc.k kVar, yc.t tVar, yc.m0 m0Var, zc.h hVar) {
        if (kVar == null) {
            U0(23);
            throw null;
        }
        if (i10 == 0) {
            U0(24);
            throw null;
        }
        if (hVar == null) {
            U0(25);
            throw null;
        }
        if (i10 == 1 || i10 == 4) {
            return new l((yc.e) kVar, this, hVar, this.D, 1, m0Var);
        }
        throw new IllegalStateException("Attempt at creating a constructor that is not a declaration: \ncopy from: " + this + "\nnewOwner: " + kVar + "\nkind: " + y2.o.a(i10));
    }

    @Override // bd.q, yc.k
    /* JADX INFO: renamed from: P1, reason: merged with bridge method [inline-methods] */
    public final yc.e y() {
        yc.e eVar = (yc.e) super.y();
        if (eVar != null) {
            return eVar;
        }
        U0(17);
        throw null;
    }

    @Override // bd.z, bd.q, bd.p, yc.k, yc.b
    /* JADX INFO: renamed from: Q1, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final l a() {
        l lVar = (l) super.a();
        if (lVar != null) {
            return lVar;
        }
        U0(19);
        throw null;
    }

    public final void R1(List list, ld.o oVar) {
        if (list == null) {
            U0(13);
            throw null;
        }
        if (oVar != null) {
            S1(list, oVar, y().L());
        } else {
            U0(14);
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void S1(java.util.List r12, ld.o r13, java.util.List r14) {
        /*
            r11 = this;
            r0 = 0
            if (r12 == 0) goto L61
            if (r13 == 0) goto L5b
            if (r14 == 0) goto L55
            yc.e r1 = r11.y()
            boolean r2 = r1.d0()
            if (r2 == 0) goto L21
            yc.k r1 = r1.y()
            boolean r2 = r1 instanceof yc.e
            if (r2 == 0) goto L21
            yc.e r1 = (yc.e) r1
            bd.a0 r1 = r1.T0()
            r4 = r1
            goto L22
        L21:
            r4 = r0
        L22:
            yc.e r1 = r11.y()
            java.util.List r2 = r1.Q0()
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L3e
            java.util.List r1 = r1.Q0()
            if (r1 == 0) goto L38
        L36:
            r5 = r1
            goto L43
        L38:
            r12 = 15
            U0(r12)
            throw r0
        L3e:
            java.util.List r1 = java.util.Collections.EMPTY_LIST
            if (r1 == 0) goto L4f
            goto L36
        L43:
            r8 = 0
            yc.x r9 = yc.x.f26155b
            r3 = 0
            r2 = r11
            r7 = r12
            r10 = r13
            r6 = r14
            r2.I1(r3, r4, r5, r6, r7, r8, r9, r10)
            return
        L4f:
            r12 = 16
            U0(r12)
            throw r0
        L55:
            r12 = 12
            U0(r12)
            throw r0
        L5b:
            r12 = 11
            U0(r12)
            throw r0
        L61:
            r12 = 10
            U0(r12)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: bd.l.S1(java.util.List, ld.o, java.util.List):void");
    }

    @Override // bd.z, yc.t, yc.o0
    /* JADX INFO: renamed from: T1, reason: merged with bridge method [inline-methods] */
    public final l h(se.r0 r0Var) {
        if (r0Var != null) {
            return (l) super.h(r0Var);
        }
        U0(20);
        throw null;
    }

    @Override // yc.j
    public final boolean U() {
        return this.D;
    }

    @Override // yc.j
    public final yc.e V() {
        yc.e eVarY = y();
        if (eVarY != null) {
            return eVarY;
        }
        U0(18);
        throw null;
    }

    @Override // bd.z, yc.k
    public final Object a0(yc.m mVar, Object obj) {
        return mVar.J(this, obj);
    }
}
