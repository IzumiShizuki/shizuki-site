package ia;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.k;
import androidx.lifecycle.s0;
import androidx.lifecycle.x0;
import androidx.media3.exoplayer.ExoPlayer;
import ba.p;
import cg.u;
import cg.w;
import f1.f;
import ic.n;
import jc.z;
import ub.a0;
import x0.m1;
import x0.o;
import x0.p1;
import x0.v;
import y.d;
import yb.c;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f9494a = new f(new aa.b(24), -2024145588, false);

    public static final void a(String str, o oVar, int i10) {
        String str2;
        p1 p1VarR;
        p pVar;
        oVar.Y(1559109728);
        int i11 = (oVar.f(str) ? 4 : 2) | i10;
        if (oVar.N(i11 & 1, (i11 & 3) != 2)) {
            m1 m1Var = AndroidCompositionLocals_androidKt.f721b;
            Object obj = (Context) oVar.j(m1Var);
            x0 x0VarA = j4.a.a(oVar);
            if (x0VarA == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
            }
            c cVar = null;
            b bVar = (b) g8.a.w(x0VarA, z.f10839a.b(b.class), null, x0VarA instanceof k ? ((k) x0VarA).c() : i4.a.f9001b);
            boolean zH = oVar.h(bVar) | oVar.h(obj) | ((i11 & 14) == 4);
            Object objK = oVar.K();
            Object obj2 = x0.k.f24334a;
            if (zH || objK == obj2) {
                str2 = str;
                Object oVar2 = new f7.o(bVar, obj, str2, cVar, 5);
                oVar.h0(oVar2);
                objK = oVar2;
            } else {
                str2 = str;
            }
            a0 a0Var = a0.f21526a;
            v.e((n) objK, a0Var, oVar);
            ExoPlayer exoPlayer = (ExoPlayer) bVar.f9495b.getValue();
            if (exoPlayer == null) {
                p1VarR = oVar.r();
                if (p1VarR != null) {
                    pVar = new p(i10, 6, str2);
                    p1VarR.f24421d = pVar;
                }
                return;
            }
            oVar.X(252419151);
            w wVar = new w((Context) oVar.j(m1Var), exoPlayer);
            oVar.X(1729797275);
            x0 x0VarA2 = j4.a.a(oVar);
            if (x0VarA2 == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
            }
            s0 s0VarW = g8.a.w(x0VarA2, g8.a.H(cg.v.class), wVar, x0VarA2 instanceof k ? ((k) x0VarA2).c() : i4.a.f9001b);
            oVar.p(false);
            cg.v vVar = (cg.v) s0VarW;
            oVar.p(false);
            g8.a.d(vVar, oVar, 8);
            boolean zH2 = oVar.h(vVar);
            Object objK2 = oVar.K();
            if (zH2 || objK2 == obj2) {
                objK2 = new u(vVar, cVar, 2);
                oVar.h0(objK2);
            }
            v.e((n) objK2, a0Var, oVar);
            android.support.v4.media.session.b.d(vVar, d.n(androidx.compose.foundation.layout.c.f557c), oVar, 3080);
        } else {
            str2 = str;
            oVar.Q();
        }
        p1VarR = oVar.r();
        if (p1VarR != null) {
            pVar = new p(i10, 7, str2);
            p1VarR.f24421d = pVar;
        }
    }
}
