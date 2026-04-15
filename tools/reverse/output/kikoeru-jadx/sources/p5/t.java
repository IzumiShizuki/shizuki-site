package p5;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.view.Choreographer;
import p4.c0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class t implements Choreographer.FrameCallback, Handler.Callback {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final t f16730e = new t();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile long f16731a = -9223372036854775807L;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Handler f16732b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Choreographer f16733c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f16734d;

    public t() {
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:FrameReleaseChoreographer");
        handlerThread.start();
        Looper looper = handlerThread.getLooper();
        int i10 = c0.f16548a;
        Handler handler = new Handler(looper, this);
        this.f16732b = handler;
        handler.sendEmptyMessage(1);
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j10) {
        this.f16731a = j10;
        Choreographer choreographer = this.f16733c;
        choreographer.getClass();
        choreographer.postFrameCallbackDelayed(this, 500L);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i10 = message.what;
        if (i10 == 1) {
            try {
                this.f16733c = Choreographer.getInstance();
            } catch (RuntimeException e10) {
                p4.c.C("VideoFrameReleaseHelper", "Vsync sampling disabled due to platform error", e10);
            }
            return true;
        }
        if (i10 == 2) {
            Choreographer choreographer = this.f16733c;
            if (choreographer != null) {
                int i11 = this.f16734d + 1;
                this.f16734d = i11;
                if (i11 == 1) {
                    choreographer.postFrameCallback(this);
                }
            }
            return true;
        }
        if (i10 != 3) {
            return false;
        }
        Choreographer choreographer2 = this.f16733c;
        if (choreographer2 != null) {
            int i12 = this.f16734d - 1;
            this.f16734d = i12;
            if (i12 == 0) {
                choreographer2.removeFrameCallback(this);
                this.f16731a = -9223372036854775807L;
            }
        }
        return true;
    }
}
