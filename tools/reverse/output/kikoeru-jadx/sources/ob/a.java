package ob;

import com.tencent.bugly.proguard.W;
import com.tencent.bugly.proguard.X;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16298a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.bugly.crashreport.biz.c f16299b;

    public /* synthetic */ a(com.tencent.bugly.crashreport.biz.c cVar, int i10) {
        this.f16298a = i10;
        this.f16299b = cVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f16298a) {
            case 0:
                try {
                    this.f16299b.c();
                } catch (Throwable th2) {
                    X.b(th2);
                    return;
                }
                break;
            default:
                long jCurrentTimeMillis = System.currentTimeMillis();
                com.tencent.bugly.crashreport.biz.c cVar = this.f16299b;
                if (jCurrentTimeMillis >= cVar.f4541b) {
                    cVar.a(3, false, 0L);
                    cVar.a();
                } else {
                    W.c().a(new a(cVar, 1), (cVar.f4541b - jCurrentTimeMillis) + 5000);
                }
                break;
        }
    }
}
