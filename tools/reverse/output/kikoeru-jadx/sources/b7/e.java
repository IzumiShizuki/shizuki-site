package b7;

import android.os.Bundle;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1742a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1743b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1744c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Serializable f1745d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f1746e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f1747f;

    public /* synthetic */ e(b0.w1 w1Var, g gVar, AtomicBoolean atomicBoolean, h hVar, AtomicBoolean atomicBoolean2) {
        this.f1743b = w1Var;
        this.f1744c = gVar;
        this.f1745d = atomicBoolean;
        this.f1747f = hVar;
        this.f1746e = atomicBoolean2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f1742a;
        Object obj = this.f1747f;
        Object obj2 = this.f1746e;
        Serializable serializable = this.f1745d;
        Object obj3 = this.f1744c;
        Object obj4 = this.f1743b;
        switch (i10) {
            case 0:
                ((g) obj3).run().a(new f((b0.w1) obj4, (AtomicBoolean) serializable, (h) obj, (AtomicBoolean) obj2), cb.r.f3875a);
                break;
            default:
                p1 p1Var = (p1) obj4;
                String str = (String) serializable;
                Bundle bundle = (Bundle) obj2;
                d0 d0Var = (d0) obj;
                boolean z10 = false;
                switch (p1Var.f2023b.f11232a) {
                    case 0:
                        jc.l.e(bundle, "extras");
                        if (str.equals("subtitle")) {
                            j9.d.f10668a.getClass();
                            if (j9.d.f10672e) {
                                j9.d.d(a9.i.a());
                            } else {
                                j9.d.b(a9.i.a());
                            }
                        } else if (str.equals("favorite")) {
                            pf.e eVar = hf.l0.f8566a;
                            hf.a0.y(hf.a0.b(pf.d.f17138c), null, null, new k9.b(2, null), 3);
                        }
                        z10 = true;
                        break;
                }
                if (!z10) {
                    p1Var.f2026e.execute(new b5.m(p1Var, d0Var, str, bundle));
                }
                break;
        }
    }

    public /* synthetic */ e(p1 p1Var, v1 v1Var, String str, Bundle bundle, d0 d0Var) {
        this.f1743b = p1Var;
        this.f1744c = v1Var;
        this.f1745d = str;
        this.f1746e = bundle;
        this.f1747f = d0Var;
    }
}
