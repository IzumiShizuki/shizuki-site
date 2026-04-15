package o1;

import a0.a0;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.autofill.AutofillManager;
import androidx.compose.ui.focus.FocusOwnerImpl$modifier$1;
import i2.a1;
import i2.d1;
import i2.j0;
import j1.p;
import j2.l0;
import j2.t1;
import java.util.ArrayList;
import jc.y;
import o.d0;
import o.g0;
import q1.h0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class k implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j2.v f16097a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j2.v f16098b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final g f16100d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public d0 f16102f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public v f16104h;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v f16099c = new v(2, null, 6);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final FocusOwnerImpl$modifier$1 f16101e = new a1() { // from class: androidx.compose.ui.focus.FocusOwnerImpl$modifier$1
        public final boolean equals(Object obj) {
            return obj == this;
        }

        @Override // i2.a1
        public final p h() {
            return this.f688a.f16099c;
        }

        public final int hashCode() {
            return this.f688a.f16099c.hashCode();
        }

        @Override // i2.a1
        public final /* bridge */ /* synthetic */ void l(p pVar) {
        }
    };

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final g0 f16103g = new g0(1);

    /* JADX WARN: Type inference failed for: r4v3, types: [androidx.compose.ui.focus.FocusOwnerImpl$modifier$1] */
    public k(j2.v vVar, j2.v vVar2) {
        this.f16097a = vVar;
        this.f16098b = vVar2;
        this.f16100d = new g(this, vVar2);
    }

    public final boolean a(boolean z10) {
        d1 d1Var;
        v vVar = this.f16104h;
        if (vVar != null) {
            g(null);
            u uVar = u.f16127a;
            u uVar2 = u.f16130d;
            vVar.B0(uVar, uVar2);
            if (!vVar.f9690a.f9703n) {
                f2.a.b("visitAncestors called on an unattached node");
            }
            j1.p pVar = vVar.f9690a.f9694e;
            j0 j0VarY = i2.f.y(vVar);
            while (j0VarY != null) {
                if ((j0VarY.F.f8667f.f9693d & 1024) != 0) {
                    while (pVar != null) {
                        if ((pVar.f9692c & 1024) != 0) {
                            z0.e eVar = null;
                            j1.p pVarF = pVar;
                            while (pVarF != null) {
                                if (pVarF instanceof v) {
                                    ((v) pVarF).B0(u.f16128b, uVar2);
                                } else if ((pVarF.f9692c & 1024) != 0 && (pVarF instanceof i2.n)) {
                                    int i10 = 0;
                                    for (j1.p pVar2 = ((i2.n) pVarF).f8789p; pVar2 != null; pVar2 = pVar2.f9695f) {
                                        if ((pVar2.f9692c & 1024) != 0) {
                                            i10++;
                                            if (i10 == 1) {
                                                pVarF = pVar2;
                                            } else {
                                                if (eVar == null) {
                                                    eVar = new z0.e(new j1.p[16]);
                                                }
                                                if (pVarF != null) {
                                                    eVar.b(pVarF);
                                                    pVarF = null;
                                                }
                                                eVar.b(pVar2);
                                            }
                                        }
                                    }
                                    if (i10 == 1) {
                                    }
                                }
                                pVarF = i2.f.f(eVar);
                            }
                        }
                        pVar = pVar.f9694e;
                    }
                }
                j0VarY = j0VarY.v();
                pVar = (j0VarY == null || (d1Var = j0VarY.F) == null) ? null : d1Var.f8666e;
            }
        }
        return true;
    }

    public final boolean b(boolean z10, int i10, boolean z11) {
        int iOrdinal;
        boolean z12 = true;
        if (z10 || (iOrdinal = f.s(this.f16099c, i10).ordinal()) == 0) {
            a(z10);
        } else {
            if (iOrdinal != 1 && iOrdinal != 2 && iOrdinal != 3) {
                throw new ce.j0();
            }
            z12 = false;
        }
        if (z12 && z11) {
            c();
        }
        return z12;
    }

    public final void c() {
        j2.v vVar = this.f16097a;
        if (vVar.isFocused() || vVar.hasFocus()) {
            vVar.clearFocus();
        } else if (vVar.hasFocus()) {
            View viewFindFocus = vVar.findFocus();
            if (viewFindFocus != null) {
                viewFindFocus.clearFocus();
            }
            vVar.clearFocus();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e2 A[Catch: all -> 0x0019, TryCatch #0 {all -> 0x0019, blocks: (B:3:0x0007, B:5:0x000e, B:10:0x001c, B:14:0x0026, B:17:0x0032, B:19:0x0038, B:20:0x003d, B:22:0x0045, B:24:0x004a, B:26:0x0050, B:30:0x0056, B:128:0x016a, B:130:0x0170, B:131:0x0173, B:133:0x017e, B:136:0x018a, B:140:0x0194, B:143:0x019a, B:144:0x019f, B:164:0x01d9, B:145:0x01a3, B:147:0x01a9, B:149:0x01ad, B:151:0x01b5, B:153:0x01bb, B:157:0x01c3, B:159:0x01cc, B:160:0x01d0, B:161:0x01d3, B:165:0x01de, B:166:0x01e1, B:168:0x01e7, B:170:0x01eb, B:173:0x01f2, B:175:0x01fa, B:182:0x0211, B:184:0x0216, B:186:0x021a, B:209:0x025c, B:190:0x0226, B:192:0x022c, B:194:0x0230, B:196:0x0238, B:198:0x023e, B:202:0x0246, B:204:0x024f, B:205:0x0253, B:206:0x0256, B:210:0x0261, B:214:0x0271, B:216:0x0276, B:218:0x027a, B:241:0x02bc, B:222:0x0286, B:224:0x028c, B:226:0x0290, B:228:0x0298, B:230:0x029e, B:234:0x02a6, B:236:0x02af, B:237:0x02b3, B:238:0x02b6, B:243:0x02c3, B:245:0x02ca, B:34:0x005e, B:36:0x0064, B:37:0x0067, B:39:0x006f, B:42:0x007b, B:46:0x0085, B:77:0x00d8, B:79:0x00dc, B:49:0x008a, B:51:0x0090, B:53:0x0094, B:55:0x009c, B:57:0x00a2, B:61:0x00aa, B:63:0x00b3, B:64:0x00b7, B:65:0x00ba, B:68:0x00c0, B:69:0x00c5, B:70:0x00c8, B:72:0x00ce, B:74:0x00d2, B:80:0x00e2, B:82:0x00e8, B:83:0x00eb, B:85:0x00f5, B:88:0x0101, B:92:0x010b, B:123:0x015e, B:125:0x0162, B:95:0x0110, B:97:0x0116, B:99:0x011a, B:101:0x0122, B:103:0x0128, B:107:0x0130, B:109:0x0139, B:110:0x013d, B:111:0x0140, B:114:0x0146, B:115:0x014b, B:116:0x014e, B:118:0x0154, B:120:0x0158), top: B:254:0x0007 }] */
    /* JADX WARN: Type inference failed for: r0v10, types: [j1.p] */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v16, types: [z0.e] */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v20, types: [z0.e] */
    /* JADX WARN: Type inference failed for: r0v24, types: [j1.p] */
    /* JADX WARN: Type inference failed for: r0v25 */
    /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v27 */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r0v29 */
    /* JADX WARN: Type inference failed for: r0v30 */
    /* JADX WARN: Type inference failed for: r0v44 */
    /* JADX WARN: Type inference failed for: r0v45 */
    /* JADX WARN: Type inference failed for: r0v46 */
    /* JADX WARN: Type inference failed for: r0v47 */
    /* JADX WARN: Type inference failed for: r0v48 */
    /* JADX WARN: Type inference failed for: r0v49 */
    /* JADX WARN: Type inference failed for: r0v9, types: [j1.p] */
    /* JADX WARN: Type inference failed for: r15v10 */
    /* JADX WARN: Type inference failed for: r15v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v12 */
    /* JADX WARN: Type inference failed for: r15v13 */
    /* JADX WARN: Type inference failed for: r15v14 */
    /* JADX WARN: Type inference failed for: r15v15 */
    /* JADX WARN: Type inference failed for: r15v17 */
    /* JADX WARN: Type inference failed for: r15v18 */
    /* JADX WARN: Type inference failed for: r15v4, types: [j1.p] */
    /* JADX WARN: Type inference failed for: r15v5, types: [j1.p] */
    /* JADX WARN: Type inference failed for: r15v9, types: [j1.p] */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v30 */
    /* JADX WARN: Type inference failed for: r1v35, types: [z0.e] */
    /* JADX WARN: Type inference failed for: r1v36 */
    /* JADX WARN: Type inference failed for: r1v37 */
    /* JADX WARN: Type inference failed for: r1v38 */
    /* JADX WARN: Type inference failed for: r1v39, types: [z0.e] */
    /* JADX WARN: Type inference failed for: r1v43 */
    /* JADX WARN: Type inference failed for: r1v44 */
    /* JADX WARN: Type inference failed for: r1v45 */
    /* JADX WARN: Type inference failed for: r1v46 */
    /* JADX WARN: Type inference failed for: r7v37 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean d(android.view.KeyEvent r14, ic.a r15) {
        /*
            Method dump skipped, instruction units count: 741
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o1.k.d(android.view.KeyEvent, ic.a):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v14, types: [j1.p] */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r5v10, types: [j1.p] */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13, types: [j1.p] */
    /* JADX WARN: Type inference failed for: r5v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v19 */
    /* JADX WARN: Type inference failed for: r5v20 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v11, types: [ic.k, jc.m] */
    /* JADX WARN: Type inference failed for: r6v17, types: [ic.k, jc.m] */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v33 */
    /* JADX WARN: Type inference failed for: r6v34 */
    /* JADX WARN: Type inference failed for: r6v35 */
    /* JADX WARN: Type inference failed for: r6v36 */
    /* JADX WARN: Type inference failed for: r6v4, types: [z0.e] */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7, types: [z0.e] */
    /* JADX WARN: Type inference failed for: r7v7 */
    public final Boolean e(int i10, p1.c cVar, ic.k kVar) {
        Boolean bool;
        boolean zA;
        Object obj;
        d1 d1Var;
        v vVar = this.f16099c;
        v vVarG = f.g(vVar);
        int i11 = 4;
        j2.v vVar2 = this.f16098b;
        if (vVarG != null) {
            f3.m layoutDirection = vVar2.getLayoutDirection();
            bool = null;
            n nVarC0 = vVarG.C0();
            r rVar = nVarC0.f16116h;
            r rVar2 = nVarC0.f16117i;
            if (i10 == 1) {
                rVar = nVarC0.f16110b;
            } else if (i10 == 2) {
                rVar = nVarC0.f16111c;
            } else if (i10 == 5) {
                rVar = nVarC0.f16112d;
            } else if (i10 == 6) {
                rVar = nVarC0.f16113e;
            } else if (i10 == 3) {
                int iOrdinal = layoutDirection.ordinal();
                if (iOrdinal != 0) {
                    if (iOrdinal != 1) {
                        throw new ce.j0();
                    }
                    rVar = rVar2;
                }
                if (rVar == r.f16122b) {
                    rVar = null;
                }
                if (rVar == null) {
                    rVar = nVarC0.f16114f;
                }
            } else if (i10 == 4) {
                int iOrdinal2 = layoutDirection.ordinal();
                if (iOrdinal2 == 0) {
                    rVar = rVar2;
                } else if (iOrdinal2 != 1) {
                    throw new ce.j0();
                }
                if (rVar == r.f16122b) {
                    rVar = null;
                }
                if (rVar == null) {
                    rVar = nVarC0.f16115g;
                }
            } else {
                if (i10 != 7 && i10 != 8) {
                    throw new IllegalStateException("invalid FocusDirection");
                }
                a aVar = new a(i10);
                k kVar2 = (k) ((j2.v) i2.f.z(vVarG)).getFocusOwner();
                v vVar3 = kVar2.f16104h;
                if (i10 == 7) {
                    nVarC0.f16118j.a(aVar);
                } else {
                    nVarC0.f16119k.a(aVar);
                }
                rVar = aVar.f16079b ? r.f16123c : vVar3 != kVar2.f16104h ? r.f16124d : r.f16122b;
            }
            if (!jc.l.a(rVar, r.f16123c)) {
                if (jc.l.a(rVar, r.f16124d)) {
                    v vVarG2 = f.g(vVar);
                    if (vVarG2 != null) {
                        return (Boolean) kVar.a(vVarG2);
                    }
                } else if (!jc.l.a(rVar, r.f16122b)) {
                    return Boolean.valueOf(rVar.a(kVar));
                }
            }
            return bool;
        }
        bool = null;
        vVarG = null;
        f3.m layoutDirection2 = vVar2.getLayoutDirection();
        cg.b bVar = new cg.b(vVarG, this, kVar);
        if (i10 == 1 || i10 == 2) {
            if (i10 == 1) {
                zA = f.k(vVar, bVar);
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException("This function should only be used for 1-D focus search");
                }
                zA = f.a(vVar, bVar);
            }
            return Boolean.valueOf(zA);
        }
        if (i10 == 3 || i10 == 4 || i10 == 5 || i10 == 6) {
            return f.E(i10, bVar, vVar, cVar);
        }
        if (i10 == 7) {
            int iOrdinal3 = layoutDirection2.ordinal();
            if (iOrdinal3 != 0) {
                if (iOrdinal3 != 1) {
                    throw new ce.j0();
                }
                i11 = 3;
            }
            v vVarG3 = f.g(vVar);
            if (vVarG3 != null) {
                return f.E(i11, bVar, vVarG3, cVar);
            }
            return bool;
        }
        if (i10 != 8) {
            throw new IllegalStateException(("Focus search invoked with invalid FocusDirection " + ((Object) d.a(i10))).toString());
        }
        v vVarG4 = f.g(vVar);
        boolean zBooleanValue = false;
        if (vVarG4 == null) {
            obj = bool;
        } else {
            if (!vVarG4.f9690a.f9703n) {
                f2.a.b("visitAncestors called on an unattached node");
            }
            Object obj2 = vVarG4.f9690a.f9694e;
            j0 j0VarY = i2.f.y(vVarG4);
            loop0: while (j0VarY != null) {
                if ((j0VarY.F.f8667f.f9693d & 1024) != 0) {
                    for (?? r32 = obj2; r32 != 0; r32 = r32.f9694e) {
                        if ((r32.f9692c & 1024) != 0) {
                            ?? F = r32;
                            ?? eVar = bool;
                            while (F != 0) {
                                if (F instanceof v) {
                                    v vVar4 = (v) F;
                                    if (vVar4.C0().f16109a) {
                                        obj = vVar4;
                                        break loop0;
                                    }
                                } else if ((F.f9692c & 1024) != 0 && (F instanceof i2.n)) {
                                    j1.p pVar = ((i2.n) F).f8789p;
                                    int i12 = 0;
                                    F = F;
                                    eVar = eVar;
                                    while (pVar != null) {
                                        if ((pVar.f9692c & 1024) != 0) {
                                            i12++;
                                            eVar = eVar;
                                            if (i12 == 1) {
                                                F = pVar;
                                            } else {
                                                if (eVar == 0) {
                                                    eVar = new z0.e(new j1.p[16]);
                                                }
                                                if (F != 0) {
                                                    eVar.b(F);
                                                    F = bool;
                                                }
                                                eVar.b(pVar);
                                            }
                                        }
                                        pVar = pVar.f9695f;
                                        F = F;
                                        eVar = eVar;
                                    }
                                    if (i12 == 1) {
                                    }
                                }
                                F = i2.f.f(eVar);
                            }
                        }
                    }
                }
                j0VarY = j0VarY.v();
                obj2 = (j0VarY == null || (d1Var = j0VarY.F) == null) ? bool : d1Var.f8666e;
            }
            obj = bool;
        }
        if (obj != null && !obj.equals(vVar)) {
            zBooleanValue = ((Boolean) bVar.a(obj)).booleanValue();
        }
        return Boolean.valueOf(zBooleanValue);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final boolean f(int i10) {
        boolean zY;
        View viewA;
        y yVar = new y();
        yVar.f10838a = Boolean.FALSE;
        v vVar = this.f16104h;
        j2.v vVar2 = this.f16097a;
        Boolean boolE = e(i10, vVar2.getEmbeddedViewFocusRect(), new j(i10, 0, yVar));
        if (!jc.l.a(boolE, Boolean.TRUE) || vVar == this.f16104h) {
            if (boolE != null && yVar.f10838a != null) {
                if (!boolE.booleanValue() || !((Boolean) yVar.f10838a).booleanValue()) {
                    if (i10 != 1 && i10 != 2) {
                        if (i10 != 7 && i10 != 8) {
                            Integer numC = f.C(i10);
                            if (numC == null) {
                                throw new IllegalStateException("Invalid focus direction");
                            }
                            int iIntValue = numC.intValue();
                            p1.c embeddedViewFocusRect = vVar2.getEmbeddedViewFocusRect();
                            Rect rectZ = embeddedViewFocusRect != null ? h0.z(embeddedViewFocusRect) : null;
                            Object obj = t1.f10004f.get();
                            jc.l.b(obj);
                            t1 t1Var = (t1) obj;
                            if (rectZ == null) {
                                viewA = t1Var.b(vVar2, vVar2.findFocus(), iIntValue);
                            } else {
                                t1Var.f10005a.set(rectZ);
                                Rect rect = t1Var.f10005a;
                                ArrayList<View> arrayList = t1Var.f10009e;
                                try {
                                    arrayList.clear();
                                    if (Build.VERSION.SDK_INT < 26) {
                                        l0.n(vVar2, arrayList, vVar2.isInTouchMode());
                                    } else {
                                        vVar2.addFocusables(arrayList, iIntValue, vVar2.isInTouchMode() ? 1 : 0);
                                    }
                                    viewA = arrayList.isEmpty() ? null : t1Var.a(iIntValue, rect, null, vVar2, arrayList);
                                    arrayList.clear();
                                } catch (Throwable th2) {
                                    arrayList.clear();
                                    throw th2;
                                }
                            }
                            zY = viewA != null ? f.y(viewA, Integer.valueOf(iIntValue), rectZ) : false;
                            if (!zY) {
                            }
                        }
                        if (!zY) {
                        }
                    } else if (b(false, i10, false)) {
                        Boolean boolE2 = e(i10, null, new a0(i10, 3));
                        if (boolE2 != null ? boolE2.booleanValue() : false) {
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final void g(v vVar) {
        j0 j0VarY;
        q2.k kVarX;
        j0 j0VarY2;
        q2.k kVarX2;
        v vVar2 = this.f16104h;
        this.f16104h = vVar;
        g0 g0Var = this.f16103g;
        Object[] objArr = g0Var.f15970a;
        int i10 = g0Var.f15971b;
        for (int i11 = 0; i11 < i10; i11++) {
            k1.b bVar = (k1.b) objArr[i11];
            bVar.getClass();
            if (vVar2 != null && (j0VarY2 = i2.f.y(vVar2)) != null && (kVarX2 = j0VarY2.x()) != null && kVarX2.f17630a.b(q2.j.f17610g)) {
                ((AutofillManager) bVar.f10983a.f9258a).notifyViewExited(bVar.f10985c, j0VarY2.f8743b);
            }
            if (vVar != null && (j0VarY = i2.f.y(vVar)) != null && (kVarX = j0VarY.x()) != null && kVarX.f17630a.b(q2.j.f17610g)) {
                int i12 = j0VarY.f8743b;
                bVar.f10986d.f18730a.N(i12, new k1.a(bVar, i12));
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x00ac, code lost:
    
        if (((r10 & ((~r10) << 6)) & (-9187201950435737472L)) == 0) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00ae, code lost:
    
        r3 = r4.b(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00b4, code lost:
    
        if (r4.f15940e != 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00c5, code lost:
    
        if (((r4.f15936a[r3 >> 3] >> ((r3 & 7) << 3)) & 255) != 254) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00c7, code lost:
    
        r37 = r12;
        r25 = 128;
        r41 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00cf, code lost:
    
        r3 = r4.f15938c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00d1, code lost:
    
        if (r3 <= r5) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00eb, code lost:
    
        if (java.lang.Long.compare((((long) r4.f15939d) * 32) ^ Long.MIN_VALUE, (((long) r3) * 25) ^ Long.MIN_VALUE) > 0) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00ed, code lost:
    
        r3 = r4.f15936a;
        r5 = r4.f15938c;
        r6 = r4.f15937b;
        r14 = (r5 + 7) >> 3;
        r15 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00f8, code lost:
    
        if (r15 >= r14) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00fa, code lost:
    
        r9 = r3[r15] & (-9187201950435737472L);
        r3[r15] = (-72340172838076674L) & ((~r9) + (r9 >>> 7));
        r15 = r15 + 1;
        r12 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0117, code lost:
    
        r37 = r12;
        r25 = 128;
        r9 = vb.l.x0(r3);
        r10 = r9 - 1;
        r14 = 72057594037927935L;
        r3[r10] = (r3[r10] & 72057594037927935L) | (-72057594037927936L);
        r3[r9] = r3[0];
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0136, code lost:
    
        if (r9 == r5) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0138, code lost:
    
        r10 = r9 >> 3;
        r23 = (r9 & 7) << 3;
        r11 = (r3[r10] >> r23) & 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0146, code lost:
    
        if (r11 != 128) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0148, code lost:
    
        r9 = r9 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x014d, code lost:
    
        if (r11 == 254) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0150, code lost:
    
        r11 = r6[r9];
        r12 = ((int) (r11 ^ (r11 >>> 32))) * (-862048943);
        r11 = (r12 << 16) ^ r12;
        r12 = r11 >>> 7;
        r24 = r4.b(r12);
        r12 = r12 & r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0170, code lost:
    
        if ((((r24 - r12) & r5) / 8) != (((r9 - r12) & r5) / 8)) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0172, code lost:
    
        r39 = r14;
        r3[r10] = (((long) (r11 & 127)) << r23) | (r3[r10] & (~(255 << r23)));
        r3[r3.length - r7] = (r3[0] & r39) | Long.MIN_VALUE;
        r9 = r9 + 1;
        r14 = r39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0194, code lost:
    
        r39 = r14;
        r12 = r24 >> 3;
        r13 = r3[r12];
        r15 = (r24 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x01a4, code lost:
    
        if (((r13 >> r15) & 255) != 128) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x01a6, code lost:
    
        r42 = r8;
        r27 = r5;
        r44 = r6;
        r3[r12] = ((~(255 << r15)) & r13) | (((long) (r11 & 127)) << r15);
        r3[r10] = (r3[r10] & (~(255 << r23))) | (128 << r23);
        r44[r24] = r44[r9];
        r44[r9] = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x01cb, code lost:
    
        r27 = r5;
        r44 = r6;
        r42 = r8;
        r3[r12] = (((long) (r11 & 127)) << r15) | ((~(255 << r15)) & r13);
        r5 = r44[r24];
        r44[r24] = r44[r9];
        r44[r9] = r5;
        r9 = r9 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x01e8, code lost:
    
        r3[r3.length - 1] = (r3[0] & r39) | Long.MIN_VALUE;
        r9 = r9 + 1;
        r6 = r44;
        r5 = r27;
        r14 = r39;
        r8 = r42;
        r7 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x01ff, code lost:
    
        r42 = r8;
        r41 = true;
        r4.f15940e = o.s0.a(r4.f15938c) - r4.f15939d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0212, code lost:
    
        r42 = r8;
        r37 = r12;
        r25 = 128;
        r41 = true;
        r3 = o.s0.b(r4.f15938c);
        r5 = r4.f15936a;
        r6 = r4.f15937b;
        r7 = r4.f15938c;
        r4.c(r3);
        r3 = r4.f15936a;
        r8 = r4.f15937b;
        r9 = r4.f15938c;
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0230, code lost:
    
        if (r10 >= r7) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x023f, code lost:
    
        if (((r5[r10 >> 3] >> ((r10 & 7) << 3)) & 255) >= 128) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0241, code lost:
    
        r11 = r6[r10];
        r14 = ((int) ((r11 >>> 32) ^ r11)) * (-862048943);
        r13 = (r14 << 16) ^ r14;
        r14 = r4.b(r13 >>> 7);
        r15 = r5;
        r16 = r6;
        r5 = r13 & 127;
        r13 = r14 >> 3;
        r17 = (r14 & 7) << 3;
        r5 = (r3[r13] & (~(255 << r17))) | (r5 << r17);
        r3[r13] = r5;
        r3[(((r14 - 7) & r9) + (r9 & 7)) >> 3] = r5;
        r8[r14] = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x027b, code lost:
    
        r15 = r5;
        r16 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x027e, code lost:
    
        r10 = r10 + 1;
        r5 = r15;
        r6 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0284, code lost:
    
        r3 = r4.b(r42);
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0288, code lost:
    
        r30 = r3;
        r4.f15939d++;
        r3 = r4.f15940e;
        r5 = r4.f15936a;
        r6 = r30 >> 3;
        r7 = r5[r6];
        r9 = (r30 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x02a2, code lost:
    
        if (((r7 >> r9) & 255) != r25) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x02a4, code lost:
    
        r22 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x02a6, code lost:
    
        r4.f15940e = r3 - r22;
        r3 = r4.f15938c;
        r7 = (r7 & (~(255 << r9))) | (r37 << r9);
        r5[r6] = r7;
        r5[(((r30 - 7) & r3) + (r3 & 7)) >> 3] = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0353, code lost:
    
        if (((r7 & ((~r7) << 6)) & (-9187201950435737472L)) == 0) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0355, code lost:
    
        r11 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean h(android.view.KeyEvent r44) {
        /*
            Method dump skipped, instruction units count: 912
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o1.k.h(android.view.KeyEvent):boolean");
    }
}
