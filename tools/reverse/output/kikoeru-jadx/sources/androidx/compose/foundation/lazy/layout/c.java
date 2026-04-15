package androidx.compose.foundation.lazy.layout;

import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.media3.exoplayer.offline.u;
import b0.a1;
import b0.i0;
import b0.k0;
import b0.o0;
import b0.y1;
import b0.z0;
import g2.n1;
import g2.q1;
import ic.n;
import ic.o;
import j1.q;
import java.util.Arrays;
import jc.m;
import ub.a0;
import x0.d0;
import x0.k;
import x0.r0;
import x0.w0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class c extends m implements o {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z0 f587b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ q f588c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n f589d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ w0 f590e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(z0 z0Var, q qVar, n nVar, w0 w0Var) {
        super(3);
        this.f587b = z0Var;
        this.f588c = qVar;
        this.f589d = nVar;
        this.f590e = w0Var;
    }

    @Override // ic.o
    public final Object g(Object obj, Object obj2, Object obj3) {
        q qVarE;
        g1.c cVar = (g1.c) obj;
        x0.o oVar = (x0.o) obj2;
        ((Number) obj3).intValue();
        Object objK = oVar.K();
        r0 r0Var = k.f24334a;
        if (objK == r0Var) {
            objK = new k0(cVar, new a0.n(this.f590e, 1));
            oVar.h0(objK);
        }
        k0 k0Var = (k0) objK;
        Object objK2 = oVar.K();
        if (objK2 == r0Var) {
            objK2 = new q1(new u(k0Var));
            oVar.h0(objK2);
        }
        q1 q1Var = (q1) objK2;
        z0 z0Var = this.f587b;
        if (z0Var != null) {
            oVar.W(204281539);
            oVar.W(6591363);
            Object obj4 = y1.f1408a;
            if (obj4 != null) {
                oVar.W(1213893039);
                oVar.p(false);
            } else {
                oVar.W(1213931944);
                View view = (View) oVar.j(AndroidCompositionLocals_androidKt.f725f);
                boolean zF = oVar.f(view);
                Object objK3 = oVar.K();
                if (zF || objK3 == r0Var) {
                    objK3 = new b0.b(view);
                    oVar.h0(objK3);
                }
                obj4 = (b0.b) objK3;
                oVar.p(false);
            }
            Object obj5 = obj4;
            oVar.p(false);
            Object[] objArr = {z0Var, k0Var, q1Var, obj5};
            boolean zF2 = oVar.f(z0Var) | oVar.h(k0Var) | oVar.h(q1Var) | oVar.h(obj5);
            Object objK4 = oVar.K();
            if (zF2 || objK4 == r0Var) {
                o0 o0Var = new o0(z0Var, k0Var, q1Var, obj5, 0);
                oVar.h0(o0Var);
                objK4 = o0Var;
            }
            ic.k kVar = (ic.k) objK4;
            Object[] objArrCopyOf = Arrays.copyOf(objArr, 4);
            boolean zF3 = false;
            for (Object obj6 : objArrCopyOf) {
                zF3 |= oVar.f(obj6);
            }
            Object objK5 = oVar.K();
            if (zF3 || objK5 == r0Var) {
                oVar.h0(new d0(kVar));
            }
            oVar.p(false);
        } else {
            oVar.W(204710145);
            oVar.p(false);
        }
        int i10 = a1.f1191b;
        q qVar = this.f588c;
        if (z0Var != null && (qVarE = qVar.e(new TraversablePrefetchStateModifierElement(z0Var))) != null) {
            qVar = qVarE;
        }
        boolean zF4 = oVar.f(k0Var);
        n nVar = this.f589d;
        boolean zF5 = zF4 | oVar.f(nVar);
        Object objK6 = oVar.K();
        if (zF5 || objK6 == r0Var) {
            objK6 = new i0(1, k0Var, nVar);
            oVar.h0(objK6);
        }
        n1.b(q1Var, qVar, (n) objK6, oVar, 8);
        return a0.f21526a;
    }
}
