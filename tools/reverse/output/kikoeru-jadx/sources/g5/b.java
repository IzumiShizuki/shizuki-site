package g5;

import android.media.MediaCodec;
import android.os.Handler;
import android.os.Message;
import p4.c0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements MediaCodec.OnFrameRenderedListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7346a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p5.h f7347b;

    public /* synthetic */ b(k kVar, p5.h hVar, int i10) {
        this.f7346a = i10;
        this.f7347b = hVar;
    }

    @Override // android.media.MediaCodec.OnFrameRenderedListener
    public final void onFrameRendered(MediaCodec mediaCodec, long j10, long j11) {
        switch (this.f7346a) {
            case 0:
                p5.h hVar = this.f7347b;
                Handler handler = hVar.f16657a;
                if (c0.f16548a >= 30) {
                    hVar.a(j10);
                } else {
                    handler.sendMessageAtFrontOfQueue(Message.obtain(handler, 0, (int) (j10 >> 32), (int) j10));
                }
                break;
            default:
                p5.h hVar2 = this.f7347b;
                Handler handler2 = hVar2.f16657a;
                if (c0.f16548a >= 30) {
                    hVar2.a(j10);
                } else {
                    handler2.sendMessageAtFrontOfQueue(Message.obtain(handler2, 0, (int) (j10 >> 32), (int) j10));
                }
                break;
        }
    }
}
