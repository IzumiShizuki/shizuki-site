package j4;

import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.m0;
import androidx.lifecycle.x0;
import i9.f;
import x0.o;
import x0.z;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final z f10201a = new z(new f(4));

    public static x0 a(o oVar) {
        x0 x0VarE = (x0) oVar.j(f10201a);
        if (x0VarE == null) {
            oVar.W(1260197609);
            x0VarE = m0.e((View) oVar.j(AndroidCompositionLocals_androidKt.f725f));
        } else {
            oVar.W(1260196493);
        }
        oVar.p(false);
        return x0VarE;
    }
}
