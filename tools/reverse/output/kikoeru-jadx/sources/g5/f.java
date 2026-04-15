package g5;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import b0.c1;
import java.util.ArrayDeque;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class f extends MediaCodec.Callback {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HandlerThread f7364b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Handler f7365c;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public MediaFormat f7370h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public MediaFormat f7371i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public MediaCodec.CodecException f7372j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public MediaCodec.CryptoException f7373k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f7374l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f7375m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public IllegalStateException f7376n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public c1 f7377o;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f7363a = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final m4.j f7366d = new m4.j();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final m4.j f7367e = new m4.j();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayDeque f7368f = new ArrayDeque();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayDeque f7369g = new ArrayDeque();

    public f(HandlerThread handlerThread) {
        this.f7364b = handlerThread;
    }

    public final void a() {
        ArrayDeque arrayDeque = this.f7369g;
        if (!arrayDeque.isEmpty()) {
            this.f7371i = (MediaFormat) arrayDeque.getLast();
        }
        m4.j jVar = this.f7366d;
        jVar.f14297c = jVar.f14296b;
        m4.j jVar2 = this.f7367e;
        jVar2.f14297c = jVar2.f14296b;
        this.f7368f.clear();
        arrayDeque.clear();
    }

    public final void b(IllegalStateException illegalStateException) {
        synchronized (this.f7363a) {
            this.f7376n = illegalStateException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onCryptoError(MediaCodec mediaCodec, MediaCodec.CryptoException cryptoException) {
        synchronized (this.f7363a) {
            this.f7373k = cryptoException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        synchronized (this.f7363a) {
            this.f7372j = codecException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onInputBufferAvailable(MediaCodec mediaCodec, int i10) {
        v4.w wVar;
        synchronized (this.f7363a) {
            this.f7366d.a(i10);
            c1 c1Var = this.f7377o;
            if (c1Var != null && (wVar = ((q) c1Var.f1208b).F) != null) {
                wVar.a();
            }
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputBufferAvailable(MediaCodec mediaCodec, int i10, MediaCodec.BufferInfo bufferInfo) {
        v4.w wVar;
        synchronized (this.f7363a) {
            try {
                MediaFormat mediaFormat = this.f7371i;
                if (mediaFormat != null) {
                    this.f7367e.a(-2);
                    this.f7369g.add(mediaFormat);
                    this.f7371i = null;
                }
                this.f7367e.a(i10);
                this.f7368f.add(bufferInfo);
                c1 c1Var = this.f7377o;
                if (c1Var != null && (wVar = ((q) c1Var.f1208b).F) != null) {
                    wVar.a();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        synchronized (this.f7363a) {
            this.f7367e.a(-2);
            this.f7369g.add(mediaFormat);
            this.f7371i = null;
        }
    }
}
