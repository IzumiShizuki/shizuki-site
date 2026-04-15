package p5;

import android.util.Base64;
import cb.d0;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import m4.t1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class m implements xa.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16701a;

    @Override // xa.i
    public final Object get() {
        switch (this.f16701a) {
            case 0:
                try {
                    Class<?> cls = Class.forName("androidx.media3.effect.DefaultVideoFrameProcessor$Factory$Builder");
                    Object objInvoke = cls.getMethod("build", null).invoke(cls.getConstructor(null).newInstance(null), null);
                    objInvoke.getClass();
                    return (t1) objInvoke;
                } catch (Exception e10) {
                    throw new IllegalStateException(e10);
                }
            case 1:
                ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
                if (executorServiceNewSingleThreadExecutor instanceof cb.z) {
                    return (cb.z) executorServiceNewSingleThreadExecutor;
                }
                return executorServiceNewSingleThreadExecutor instanceof ScheduledExecutorService ? new d0((ScheduledExecutorService) executorServiceNewSingleThreadExecutor) : new cb.a0(executorServiceNewSingleThreadExecutor);
            case 2:
                return new v4.j(new n5.f(), 50000, 50000, 1000, 2000, false);
            case 3:
                byte[] bArr = new byte[12];
                w4.f.f23365i.nextBytes(bArr);
                return Base64.encodeToString(bArr, 10);
            default:
                throw new IllegalStateException();
        }
    }
}
