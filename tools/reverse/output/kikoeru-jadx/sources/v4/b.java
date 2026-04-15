package v4;

import android.content.Context;
import android.media.AudioManager;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements xa.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22399a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f22400b;

    public /* synthetic */ b(Context context, int i10) {
        this.f22399a = i10;
        this.f22400b = context;
    }

    @Override // xa.i
    public final Object get() {
        n5.i iVar;
        switch (this.f22399a) {
            case 0:
                AudioManager audioManager = (AudioManager) this.f22400b.getApplicationContext().getSystemService("audio");
                audioManager.getClass();
                return audioManager;
            case 1:
                return new l(this.f22400b);
            case 2:
                Context context = this.f22400b;
                return new j5.q(new m0.w(context), new r5.l());
            case 3:
                return new m5.p(this.f22400b);
            default:
                Context context2 = this.f22400b;
                ya.a1 a1Var = n5.i.f15339n;
                synchronized (n5.i.class) {
                    try {
                        if (n5.i.f15345t == null) {
                            n5.h hVar = new n5.h(context2);
                            n5.i.f15345t = new n5.i(hVar.f15334a, hVar.f15335b, hVar.f15336c, hVar.f15337d, hVar.f15338e);
                        }
                        iVar = n5.i.f15345t;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return iVar;
        }
    }
}
