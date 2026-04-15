package g5;

import android.os.HandlerThread;
import b7.d4;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements xa.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7348a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f7349b;

    public /* synthetic */ c(int i10, int i11) {
        this.f7348a = i11;
        this.f7349b = i10;
    }

    @Override // xa.i
    public final Object get() {
        switch (this.f7348a) {
            case 0:
                return new HandlerThread(d4.g(this.f7349b, "ExoPlayer:MediaCodecAsyncAdapter:"));
            default:
                return new HandlerThread(d4.g(this.f7349b, "ExoPlayer:MediaCodecQueueingThread:"));
        }
    }
}
