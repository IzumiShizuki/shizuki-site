package b7;

import android.media.LoudnessCodecController;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Trace;
import android.view.Surface;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class d4 implements g5.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1735a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f1736b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f1737c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f1738d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f1739e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f1740f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Object f1741g;

    public d4() {
        this.f1735a = 0;
        this.f1738d = new Object();
        this.f1739e = new o.e(0);
    }

    public static void b(d4 d4Var, MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto, int i10) {
        c7.e1 e1Var;
        LoudnessCodecController loudnessCodecController;
        g5.f fVar = (g5.f) d4Var.f1739e;
        MediaCodec mediaCodec = (MediaCodec) d4Var.f1738d;
        HandlerThread handlerThread = fVar.f7364b;
        p4.c.i(fVar.f7365c == null);
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        mediaCodec.setCallback(fVar, handler);
        fVar.f7365c = handler;
        Trace.beginSection("configureCodec");
        mediaCodec.configure(mediaFormat, surface, mediaCrypto, i10);
        Trace.endSection();
        ((g5.l) d4Var.f1740f).start();
        Trace.beginSection("startCodec");
        mediaCodec.start();
        Trace.endSection();
        if (p4.c0.f16548a >= 35 && (e1Var = (c7.e1) d4Var.f1741g) != null && ((loudnessCodecController = (LoudnessCodecController) e1Var.f3620d) == null || loudnessCodecController.addMediaCodec(mediaCodec))) {
            p4.c.i(((HashSet) e1Var.f3618b).add(mediaCodec));
        }
        d4Var.f1737c = 1;
    }

    public static String g(int i10, String str) {
        StringBuilder sb = new StringBuilder(str);
        if (i10 == 1) {
            sb.append("Audio");
        } else if (i10 == 2) {
            sb.append("Video");
        } else {
            sb.append("Unknown(");
            sb.append(i10);
            sb.append(")");
        }
        return sb.toString();
    }

    private final void k() {
        ArrayList arrayList;
        synchronized (this.f1738d) {
            try {
                this.f1736b = true;
                arrayList = new ArrayList(((o.e) this.f1739e).values());
                ((o.e) this.f1739e).clear();
                if (((a9.m) this.f1740f) != null) {
                    Handler handler = (Handler) this.f1741g;
                    handler.getClass();
                    handler.post((a9.m) this.f1740f);
                    this.f1740f = null;
                    this.f1741g = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((c4) it.next()).m();
        }
    }

    @Override // g5.k
    public void B() {
        ((MediaCodec) this.f1738d).detachOutputSurface();
    }

    @Override // g5.k
    public ByteBuffer E0(int i10) {
        return ((MediaCodec) this.f1738d).getOutputBuffer(i10);
    }

    @Override // g5.k
    public void N(int i10, long j10) {
        ((MediaCodec) this.f1738d).releaseOutputBuffer(i10, j10);
    }

    @Override // g5.k
    public int O() {
        ((g5.l) this.f1740f).a();
        g5.f fVar = (g5.f) this.f1739e;
        synchronized (fVar.f7363a) {
            try {
                IllegalStateException illegalStateException = fVar.f7376n;
                if (illegalStateException != null) {
                    fVar.f7376n = null;
                    throw illegalStateException;
                }
                MediaCodec.CodecException codecException = fVar.f7372j;
                if (codecException != null) {
                    fVar.f7372j = null;
                    throw codecException;
                }
                MediaCodec.CryptoException cryptoException = fVar.f7373k;
                if (cryptoException != null) {
                    fVar.f7373k = null;
                    throw cryptoException;
                }
                int i10 = -1;
                if (fVar.f7374l > 0 || fVar.f7375m) {
                    return -1;
                }
                m4.j jVar = fVar.f7366d;
                int i11 = jVar.f14296b;
                int i12 = jVar.f14297c;
                if (!(i11 == i12)) {
                    if (i11 == i12) {
                        throw new ArrayIndexOutOfBoundsException();
                    }
                    i10 = ((int[]) jVar.f14299e)[i11];
                    jVar.f14296b = (i11 + 1) & jVar.f14298d;
                }
                return i10;
            } finally {
            }
        }
    }

    @Override // g5.k
    public int W(MediaCodec.BufferInfo bufferInfo) {
        ((g5.l) this.f1740f).a();
        g5.f fVar = (g5.f) this.f1739e;
        synchronized (fVar.f7363a) {
            try {
                IllegalStateException illegalStateException = fVar.f7376n;
                if (illegalStateException != null) {
                    fVar.f7376n = null;
                    throw illegalStateException;
                }
                MediaCodec.CodecException codecException = fVar.f7372j;
                if (codecException != null) {
                    fVar.f7372j = null;
                    throw codecException;
                }
                MediaCodec.CryptoException cryptoException = fVar.f7373k;
                if (cryptoException != null) {
                    fVar.f7373k = null;
                    throw cryptoException;
                }
                if (fVar.f7374l > 0 || fVar.f7375m) {
                    return -1;
                }
                m4.j jVar = fVar.f7367e;
                int i10 = jVar.f14296b;
                int i11 = jVar.f14297c;
                if (i10 == i11) {
                    return -1;
                }
                if (i10 == i11) {
                    throw new ArrayIndexOutOfBoundsException();
                }
                int i12 = ((int[]) jVar.f14299e)[i10];
                jVar.f14296b = (i10 + 1) & jVar.f14298d;
                if (i12 >= 0) {
                    p4.c.j(fVar.f7370h);
                    MediaCodec.BufferInfo bufferInfo2 = (MediaCodec.BufferInfo) fVar.f7368f.remove();
                    bufferInfo.set(bufferInfo2.offset, bufferInfo2.size, bufferInfo2.presentationTimeUs, bufferInfo2.flags);
                } else if (i12 == -2) {
                    fVar.f7370h = (MediaFormat) fVar.f7369g.remove();
                }
                return i12;
            } finally {
            }
        }
    }

    @Override // g5.k
    public void a() {
        c7.e1 e1Var;
        c7.e1 e1Var2;
        switch (this.f1735a) {
            case 0:
                k();
                return;
            default:
                try {
                    if (this.f1737c == 1) {
                        ((g5.l) this.f1740f).shutdown();
                        g5.f fVar = (g5.f) this.f1739e;
                        synchronized (fVar.f7363a) {
                            fVar.f7375m = true;
                            fVar.f7364b.quit();
                            fVar.a();
                        }
                    }
                    this.f1737c = 2;
                    if (this.f1736b) {
                        return;
                    }
                    try {
                        int i10 = p4.c0.f16548a;
                        if (i10 >= 30 && i10 < 33) {
                            ((MediaCodec) this.f1738d).stop();
                            break;
                        }
                        if (i10 >= 35 && (e1Var2 = (c7.e1) this.f1741g) != null) {
                            e1Var2.U((MediaCodec) this.f1738d);
                        }
                        ((MediaCodec) this.f1738d).release();
                        this.f1736b = true;
                        return;
                    } finally {
                    }
                } catch (Throwable th2) {
                    if (!this.f1736b) {
                        try {
                            int i11 = p4.c0.f16548a;
                            if (i11 >= 30 && i11 < 33) {
                                ((MediaCodec) this.f1738d).stop();
                            }
                            if (i11 >= 35 && (e1Var = (c7.e1) this.f1741g) != null) {
                                e1Var.U((MediaCodec) this.f1738d);
                            }
                            ((MediaCodec) this.f1738d).release();
                            this.f1736b = true;
                        } finally {
                        }
                        break;
                    }
                    throw th2;
                }
                break;
        }
    }

    @Override // g5.k
    public void c(Bundle bundle) {
        ((g5.l) this.f1740f).c(bundle);
    }

    @Override // g5.k
    public void d(int i10, int i11, int i12, long j10) {
        ((g5.l) this.f1740f).d(i10, i11, i12, j10);
    }

    @Override // g5.k
    public void e(int i10, u4.b bVar, long j10, int i11) {
        ((g5.l) this.f1740f).e(i10, bVar, j10, i11);
    }

    public boolean f(int i10, int i11) {
        z0.e eVar = (z0.e) this.f1739e;
        int i12 = this.f1737c;
        j1.o oVar = (j1.o) eVar.f26372a[i10 + i12];
        j1.o oVar2 = (j1.o) ((z0.e) this.f1740f).f26372a[i12 + i11];
        return jc.l.a(oVar, oVar2) || oVar.getClass() == oVar2.getClass();
    }

    @Override // g5.k
    public void flush() {
        ((g5.l) this.f1740f).flush();
        ((MediaCodec) this.f1738d).flush();
        g5.f fVar = (g5.f) this.f1739e;
        synchronized (fVar.f7363a) {
            fVar.f7374l++;
            Handler handler = fVar.f7365c;
            int i10 = p4.c0.f16548a;
            handler.post(new a9.m(14, fVar));
        }
        ((MediaCodec) this.f1738d).start();
    }

    @Override // g5.k
    public void h(p5.h hVar, Handler handler) {
        ((MediaCodec) this.f1738d).setOnFrameRenderedListener(new g5.b(this, hVar, 0), handler);
    }

    @Override // g5.k
    public void i(int i10) {
        ((MediaCodec) this.f1738d).releaseOutputBuffer(i10, false);
    }

    public int j() {
        int i10;
        synchronized (this.f1738d) {
            i10 = this.f1737c;
            this.f1737c = i10 + 1;
        }
        return i10;
    }

    @Override // g5.k
    public boolean j0(b0.c1 c1Var) {
        g5.f fVar = (g5.f) this.f1739e;
        synchronized (fVar.f7363a) {
            fVar.f7377o = c1Var;
        }
        return true;
    }

    public void l(int i10, Object obj) {
        synchronized (this.f1738d) {
            try {
                c4 c4Var = (c4) ((o.e) this.f1739e).remove(Integer.valueOf(i10));
                if (c4Var != null) {
                    if (i4.class == obj.getClass()) {
                        c4Var.k(obj);
                    } else {
                        p4.c.B("SequencedFutureManager", "Type mismatch, expected " + i4.class + ", but was " + obj.getClass());
                    }
                }
                if (((a9.m) this.f1740f) != null && ((o.e) this.f1739e).isEmpty()) {
                    a();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // g5.k
    public void o0(int i10) {
        ((MediaCodec) this.f1738d).setVideoScalingMode(i10);
    }

    @Override // g5.k
    public MediaFormat x() {
        MediaFormat mediaFormat;
        g5.f fVar = (g5.f) this.f1739e;
        synchronized (fVar.f7363a) {
            try {
                mediaFormat = fVar.f7370h;
                if (mediaFormat == null) {
                    throw new IllegalStateException();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return mediaFormat;
    }

    @Override // g5.k
    public ByteBuffer x0(int i10) {
        return ((MediaCodec) this.f1738d).getInputBuffer(i10);
    }

    @Override // g5.k
    public void y0(Surface surface) {
        ((MediaCodec) this.f1738d).setOutputSurface(surface);
    }

    public d4(MediaCodec mediaCodec, HandlerThread handlerThread, g5.l lVar, c7.e1 e1Var) {
        this.f1735a = 1;
        this.f1738d = mediaCodec;
        this.f1739e = new g5.f(handlerThread);
        this.f1740f = lVar;
        this.f1741g = e1Var;
        this.f1737c = 0;
    }

    public d4(i2.d1 d1Var, j1.p pVar, int i10, z0.e eVar, z0.e eVar2, boolean z10) {
        this.f1735a = 2;
        this.f1741g = d1Var;
        this.f1738d = pVar;
        this.f1737c = i10;
        this.f1739e = eVar;
        this.f1740f = eVar2;
        this.f1736b = z10;
    }
}
