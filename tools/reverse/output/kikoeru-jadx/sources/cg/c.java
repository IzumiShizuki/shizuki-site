package cg;

import android.content.res.Configuration;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import x0.w0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class c extends jc.m implements ic.k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f4004b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ w0 f4005c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(w0 w0Var, int i10) {
        super(1);
        this.f4004b = i10;
        this.f4005c = w0Var;
    }

    @Override // ic.k
    public final Object a(Object obj) {
        int i10 = this.f4004b;
        ub.a0 a0Var = ub.a0.f21526a;
        w0 w0Var = this.f4005c;
        switch (i10) {
            case 0:
                jc.l.e((x) obj, "it");
                w0Var.setValue(Boolean.FALSE);
                break;
            case 1:
                w0Var.setValue(new f3.l(((f3.l) obj).f6666a));
                break;
            case 2:
                w0Var.setValue(new f3.l(((f3.l) obj).f6666a));
                break;
            case 3:
                ((ic.k) w0Var.getValue()).a(new p1.b(((p1.b) obj).f16481a));
                break;
            case 4:
                Configuration configuration = new Configuration((Configuration) obj);
                x0.z zVar = AndroidCompositionLocals_androidKt.f720a;
                w0Var.setValue(configuration);
                break;
            case 5:
                w0Var.setValue((l0.r) obj);
                break;
            case 6:
                break;
            case 7:
                ta.c cVar = (ta.c) obj;
                jc.l.e(cVar, "it");
                ((ic.k) w0Var.getValue()).a(cVar);
                break;
            default:
                g2.c0 c0Var = (g2.c0) obj;
                jc.l.e(c0Var, "it");
                w0Var.setValue(new p1.b(c0Var.H(0L)));
                break;
        }
        return a0Var;
    }
}
