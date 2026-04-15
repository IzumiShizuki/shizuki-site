package i8;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final long f9469a = f3.b.h(0, 0, 0, 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final t8.e f9470b;

    static {
        t8.h hVar = t8.h.f20562c;
        f9470b = new t8.e();
    }

    public static final s8.i a(Object obj, x0.o oVar) {
        oVar.X(1087186730);
        if (obj instanceof s8.i) {
            s8.i iVar = (s8.i) obj;
            oVar.p(false);
            return iVar;
        }
        Context context = (Context) oVar.j(AndroidCompositionLocals_androidKt.f721b);
        oVar.X(-1245195153);
        boolean zF = oVar.f(context) | oVar.f(obj);
        Object objK = oVar.K();
        if (zF || objK == x0.k.f24334a) {
            s8.h hVar = new s8.h(context);
            hVar.f19591c = obj;
            objK = hVar.b();
            oVar.h0(objK);
        }
        s8.i iVar2 = (s8.i) objK;
        oVar.p(false);
        oVar.p(false);
        return iVar2;
    }
}
