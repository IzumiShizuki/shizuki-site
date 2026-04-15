package p4;

import android.os.Handler;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class x {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ArrayList f16626b = new ArrayList(50);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f16627a;

    public x(Handler handler) {
        this.f16627a = handler;
    }

    public static w b() {
        w wVar;
        ArrayList arrayList = f16626b;
        synchronized (arrayList) {
            try {
                wVar = arrayList.isEmpty() ? new w() : (w) arrayList.remove(arrayList.size() - 1);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return wVar;
    }

    public final w a(int i10, Object obj) {
        w wVarB = b();
        wVarB.f16625a = this.f16627a.obtainMessage(i10, obj);
        return wVarB;
    }

    public final boolean c(Runnable runnable) {
        return this.f16627a.post(runnable);
    }

    public final void d(int i10) {
        c.c(i10 != 0);
        this.f16627a.removeMessages(i10);
    }

    public final boolean e(int i10) {
        return this.f16627a.sendEmptyMessage(i10);
    }
}
