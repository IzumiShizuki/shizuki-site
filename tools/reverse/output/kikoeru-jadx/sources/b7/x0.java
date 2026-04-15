package b7;

import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class x0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2172a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d1 f2173b;

    public /* synthetic */ x0(d1 d1Var, int i10) {
        this.f2172a = i10;
        this.f2173b = d1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2172a) {
            case 0:
                d1 d1Var = this.f2173b;
                if (((c7.j0) d1Var.f1718h.f968b).f3651e.a() == null) {
                    d1Var.j();
                    break;
                }
                break;
            default:
                d1 d1Var2 = this.f2173b;
                c7.o oVar = new c7.o(d1Var2.f1711a, d1Var2.f1713c.f1919a.f(), new c7.e1(d1Var2), d1Var2.f1712b.f1705b.U());
                d1Var2.f1719i = oVar;
                Log.d("MediaBrowserCompat", "Connecting to a MediaBrowserService.");
                oVar.f3674a.f3640b.connect();
                break;
        }
    }
}
