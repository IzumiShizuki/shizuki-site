package d;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.q0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e implements ic.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5192a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n f5193b;

    public /* synthetic */ e(n nVar, int i10) {
        this.f5192a = i10;
        this.f5193b = nVar;
    }

    @Override // ic.a
    public final Object b() {
        switch (this.f5192a) {
            case 0:
                n nVar = this.f5193b;
                return new w(nVar.f5242f, new e(nVar, 3));
            case 1:
                n nVar2 = this.f5193b;
                return new q0(nVar2.getApplication(), nVar2, nVar2.getIntent() != null ? nVar2.getIntent().getExtras() : null);
            case 2:
                n nVar3 = this.f5193b;
                j0 j0Var = new j0(new a9.m(11, nVar3));
                if (Build.VERSION.SDK_INT >= 33) {
                    if (jc.l.a(Looper.myLooper(), Looper.getMainLooper())) {
                        nVar3.f14026a.W0(new f(j0Var, nVar3));
                    } else {
                        new Handler(Looper.getMainLooper()).post(new b5.h(12, nVar3, j0Var));
                    }
                }
                return j0Var;
            default:
                this.f5193b.reportFullyDrawn();
                return ub.a0.f21526a;
        }
    }
}
