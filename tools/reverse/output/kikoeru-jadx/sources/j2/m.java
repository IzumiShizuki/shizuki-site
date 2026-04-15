package j2;

import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class m implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9883a = 0;

    public /* synthetic */ m() {
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f9883a) {
            case 0:
                o.g0 g0Var = v.f10025c1;
                synchronized (g0Var) {
                    try {
                        int i10 = 0;
                        if (Build.VERSION.SDK_INT < 30) {
                            Object[] objArr = g0Var.f15970a;
                            int i11 = g0Var.f15971b;
                            while (i10 < i11) {
                                v vVar = (v) objArr[i10];
                                boolean showLayoutBounds = vVar.getShowLayoutBounds();
                                Class cls = v.Z0;
                                vVar.setShowLayoutBounds(l0.y());
                                if (showLayoutBounds != vVar.getShowLayoutBounds()) {
                                    v.r(vVar.getRoot());
                                }
                                i10++;
                            }
                        } else {
                            Object[] objArr2 = g0Var.f15970a;
                            int i12 = g0Var.f15971b;
                            while (i10 < i12) {
                                v.r(((v) objArr2[i10]).getRoot());
                                i10++;
                            }
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return;
            default:
                return;
        }
    }

    public /* synthetic */ m(p5.p pVar) {
    }

    private final void a() {
    }
}
