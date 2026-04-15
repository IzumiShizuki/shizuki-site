package c4;

import android.content.Context;
import b7.b1;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import m4.o0;
import p4.c0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class n implements j, g5.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f3388a;

    public /* synthetic */ n(Context context, boolean z10) {
        this.f3388a = context;
    }

    @Override // g5.j
    public g5.k P0(b1 b1Var) {
        Context context;
        int i10 = c0.f16548a;
        if (i10 < 23 || (i10 < 31 && ((context = this.f3388a) == null || i10 < 28 || !context.getPackageManager().hasSystemFeature("com.amazon.hardware.tv_screen")))) {
            return new g5.w(1).P0(b1Var);
        }
        int i11 = o0.i(((m4.q) b1Var.f1652d).f14544n);
        p4.c.s("DMCodecAdapterFactory", "Creating an asynchronous MediaCodec adapter for track type " + c0.E(i11));
        return new androidx.media3.exoplayer.offline.u(17, new g5.c(i11, 0), new g5.c(i11, 1)).P0(b1Var);
    }

    @Override // c4.j
    public void a(android.support.v4.media.session.b bVar) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new a(0, "EmojiCompatInitializer"));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        threadPoolExecutor.execute(new b5.m(this, bVar, threadPoolExecutor, 6));
    }

    public n(Context context) {
        this.f3388a = context.getApplicationContext();
    }
}
