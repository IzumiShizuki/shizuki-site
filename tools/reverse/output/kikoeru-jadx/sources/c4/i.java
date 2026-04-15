package c4;

import com.tencent.bugly.proguard.H;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;
import n7.b0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class i implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3370a = 2;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f3371b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f3372c;

    public i(int i10, LinkedBlockingQueue linkedBlockingQueue) {
        this.f3371b = i10;
        this.f3372c = linkedBlockingQueue;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Runnable runnable;
        switch (this.f3370a) {
            case 0:
                ArrayList arrayList = (ArrayList) this.f3372c;
                int size = arrayList.size();
                int i10 = 0;
                if (this.f3371b != 1) {
                    while (i10 < size) {
                        ((b3.f) arrayList.get(i10)).f1496b.f1208b = b3.i.f1499a;
                        i10++;
                    }
                } else {
                    while (i10 < size) {
                        b3.f fVar = (b3.f) arrayList.get(i10);
                        fVar.f1495a.setValue(Boolean.TRUE);
                        fVar.f1496b.f1208b = new b3.j(true);
                        i10++;
                    }
                }
                break;
            case 1:
                H h10 = (H) this.f3372c;
                int i11 = this.f3371b;
                boolean zB = h10.b(i11);
                h10.f4864f.edit().putBoolean(i11 + "_" + h10.f4862d, !zB).commit();
                break;
            default:
                for (int i12 = 0; i12 < this.f3371b && (runnable = (Runnable) ((LinkedBlockingQueue) this.f3372c).poll()) != null; i12++) {
                    runnable.run();
                }
                break;
        }
    }

    public i(H h10, int i10) {
        this.f3372c = h10;
        this.f3371b = i10;
    }

    public i(List list, int i10, Throwable th2) {
        b0.g(list, "initCallbacks cannot be null");
        this.f3372c = new ArrayList(list);
        this.f3371b = i10;
    }
}
