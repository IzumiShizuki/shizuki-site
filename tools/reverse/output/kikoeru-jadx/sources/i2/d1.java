package i2;

import b7.d4;
import java.util.HashSet;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j0 f8662a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c1 f8663b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u f8664c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public g1 f8665d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a2 f8666e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public j1.p f8667f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public z0.e f8668g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public z0.e f8669h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final z0.e f8670i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public d4 f8671j;

    public d1(j0 j0Var) {
        this.f8662a = j0Var;
        c1 c1Var = new c1();
        c1Var.f9693d = -1;
        this.f8663b = c1Var;
        u uVar = new u(j0Var);
        this.f8664c = uVar;
        this.f8665d = uVar;
        a2 a2Var = uVar.R;
        this.f8666e = a2Var;
        this.f8667f = a2Var;
        this.f8670i = new z0.e(new j1.q[16]);
    }

    public static final void a(d1 d1Var, j1.p pVar, g1 g1Var) {
        for (j1.p pVar2 = pVar.f9694e; pVar2 != null; pVar2 = pVar2.f9694e) {
            if (pVar2 == d1Var.f8663b) {
                j0 j0VarV = d1Var.f8662a.v();
                g1Var.f8704s = j0VarV != null ? j0VarV.F.f8664c : null;
                d1Var.f8665d = g1Var;
                return;
            } else {
                if ((pVar2.f9692c & 2) != 0) {
                    return;
                }
                pVar2.A0(g1Var);
            }
        }
    }

    public static j1.p b(j1.o oVar, j1.p pVar) {
        j1.p pVarH;
        if (oVar instanceof a1) {
            pVarH = ((a1) oVar).h();
            pVarH.f9692c = h1.f(pVarH);
        } else {
            c cVar = new c();
            cVar.f9692c = h1.d(oVar);
            cVar.f8654o = oVar;
            cVar.f8656q = new HashSet();
            pVarH = cVar;
        }
        if (pVarH.f9703n) {
            f2.a.b("A ModifierNodeElement cannot return an already attached node from create() ");
        }
        pVarH.f9698i = true;
        j1.p pVar2 = pVar.f9695f;
        if (pVar2 != null) {
            pVar2.f9694e = pVarH;
            pVarH.f9695f = pVar2;
        }
        pVar.f9695f = pVarH;
        pVarH.f9694e = pVar;
        return pVarH;
    }

    public static j1.p c(j1.p pVar) {
        boolean z10 = pVar.f9703n;
        if (z10) {
            o.f0 f0Var = h1.f8724a;
            if (!z10) {
                f2.a.b("autoInvalidateRemovedNode called on unattached node");
            }
            h1.a(pVar, -1, 2);
            pVar.y0();
            pVar.q0();
        }
        j1.p pVar2 = pVar.f9695f;
        j1.p pVar3 = pVar.f9694e;
        if (pVar2 != null) {
            pVar2.f9694e = pVar3;
            pVar.f9695f = null;
        }
        if (pVar3 != null) {
            pVar3.f9695f = pVar2;
            pVar.f9694e = null;
        }
        jc.l.b(pVar3);
        return pVar3;
    }

    public static void h(j1.o oVar, j1.o oVar2, j1.p pVar) {
        if ((oVar instanceof a1) && (oVar2 instanceof a1)) {
            jc.l.c(pVar, "null cannot be cast to non-null type T of androidx.compose.ui.node.NodeChainKt.updateUnsafe");
            ((a1) oVar2).l(pVar);
            if (pVar.f9703n) {
                h1.c(pVar);
                return;
            } else {
                pVar.f9699j = true;
                return;
            }
        }
        if (!(pVar instanceof c)) {
            f2.a.b("Unknown Modifier.Node type");
            return;
        }
        c cVar = (c) pVar;
        if (cVar.f9703n) {
            cVar.C0();
        }
        cVar.f8654o = oVar2;
        cVar.f9692c = h1.d(oVar2);
        if (cVar.f9703n) {
            cVar.B0(false);
        }
        if (pVar.f9703n) {
            h1.c(pVar);
        } else {
            pVar.f9699j = true;
        }
    }

    public final boolean d(int i10) {
        return (i10 & this.f8667f.f9693d) != 0;
    }

    public final void e() {
        for (j1.p pVar = this.f8667f; pVar != null; pVar = pVar.f9695f) {
            pVar.x0();
            if (pVar.f9698i) {
                o.f0 f0Var = h1.f8724a;
                if (!pVar.f9703n) {
                    f2.a.b("autoInvalidateInsertedNode called on unattached node");
                }
                h1.a(pVar, -1, 1);
            }
            if (pVar.f9699j) {
                h1.c(pVar);
            }
            pVar.f9698i = false;
            pVar.f9699j = false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:118:0x0258, code lost:
    
        r13 = r28 + 2;
        r11 = r24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x025e, code lost:
    
        r3 = r3 + 1;
        r12 = r20;
        r11 = r21;
        r13 = r26;
        r14 = r29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0148, code lost:
    
        r26 = r13;
        r29 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x014e, code lost:
    
        if ((r19 & 1) != 0) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0150, code lost:
    
        r11 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0152, code lost:
    
        r11 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0153, code lost:
    
        r13 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0154, code lost:
    
        if (r13 > r3) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0156, code lost:
    
        if (r13 == r12) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0158, code lost:
    
        if (r13 == r3) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x015a, code lost:
    
        r24 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0168, code lost:
    
        if (r20[(r13 + 1) + r17] >= r20[(r13 - 1) + r17]) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x016b, code lost:
    
        r24 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x016d, code lost:
    
        r11 = r20[(r13 - 1) + r17];
        r14 = r11 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0176, code lost:
    
        r24 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0178, code lost:
    
        r11 = r20[(r13 + 1) + r17];
        r14 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x017f, code lost:
    
        r22 = r10 - ((r6 - r14) - r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0185, code lost:
    
        if (r3 == 0) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0187, code lost:
    
        r25 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x018a, code lost:
    
        r25 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x018c, code lost:
    
        if (r14 != r11) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x018e, code lost:
    
        r27 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0191, code lost:
    
        r27 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0193, code lost:
    
        r25 = r22 + (r25 & r27);
        r22 = r11;
        r11 = r22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x019d, code lost:
    
        if (r14 <= r7) goto L186;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x019f, code lost:
    
        if (r11 <= r15) goto L187;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01a1, code lost:
    
        r27 = r11;
        r28 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01ad, code lost:
    
        if (r0.f(r14 - 1, r27 - 1) == false) goto L185;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01af, code lost:
    
        r14 = r14 - 1;
        r11 = r27 - 1;
        r13 = r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01b6, code lost:
    
        r27 = r11;
        r28 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01ba, code lost:
    
        r20[r17 + r28] = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x01be, code lost:
    
        if (r24 == false) goto L181;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01c0, code lost:
    
        r11 = r19 - r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01c2, code lost:
    
        if (r11 < r12) goto L182;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01c4, code lost:
    
        if (r11 > r3) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01ca, code lost:
    
        if (r16[r17 + r11] < r14) goto L184;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01cc, code lost:
    
        r26[0] = r14;
        r11 = 1;
        r26[1] = r27;
        r26[2] = r22;
        r26[3] = r25;
        r26[4] = 1;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0109 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x013e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(int r32, z0.e r33, z0.e r34, j1.p r35, boolean r36) {
        /*
            Method dump skipped, instruction units count: 938
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: i2.d1.f(int, z0.e, z0.e, j1.p, boolean):void");
    }

    public final void g() {
        j0 j0Var;
        c0 c0Var;
        o1 o1Var;
        j1.p pVar = this.f8666e.f9694e;
        g1 g1Var = this.f8664c;
        while (true) {
            j0Var = this.f8662a;
            if (pVar == null) {
                break;
            }
            z zVarG = f.g(pVar);
            if (zVarG != null) {
                g1 g1Var2 = pVar.f9697h;
                if (g1Var2 != null) {
                    c0Var = (c0) g1Var2;
                    z zVar = c0Var.R;
                    c0Var.p1(zVarG);
                    if (zVar != pVar && (o1Var = c0Var.K) != null) {
                        o1Var.invalidate();
                    }
                } else {
                    c0Var = new c0(j0Var, zVarG);
                    pVar.A0(c0Var);
                }
                g1Var.f8704s = c0Var;
                c0Var.f8703r = g1Var;
                g1Var = c0Var;
            } else {
                pVar.A0(g1Var);
            }
            pVar = pVar.f9694e;
        }
        j0 j0VarV = j0Var.v();
        g1Var.f8704s = j0VarV != null ? j0VarV.F.f8664c : null;
        this.f8665d = g1Var;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        j1.p pVar = this.f8667f;
        a2 a2Var = this.f8666e;
        if (pVar == a2Var) {
            sb.append("]");
        } else {
            while (true) {
                if (pVar == null || pVar == a2Var) {
                    break;
                }
                sb.append(String.valueOf(pVar));
                if (pVar.f9695f == a2Var) {
                    sb.append("]");
                    break;
                }
                sb.append(",");
                pVar = pVar.f9695f;
            }
        }
        String string = sb.toString();
        jc.l.d(string, "toString(...)");
        return string;
    }
}
