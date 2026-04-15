package androidx.media3.exoplayer.offline;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class l extends Thread {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f921a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s f922b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n f923c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f924d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f925e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile j f926f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public volatile boolean f927g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Exception f928h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f929i = -1;

    public l(o oVar, s sVar, n nVar, boolean z10, int i10, j jVar) {
        this.f921a = oVar;
        this.f922b = sVar;
        this.f923c = nVar;
        this.f924d = z10;
        this.f925e = i10;
        this.f926f = jVar;
    }

    public final void a(boolean z10) {
        if (z10) {
            this.f926f = null;
        }
        if (this.f927g) {
            return;
        }
        this.f927g = true;
        this.f922b.cancel();
        interrupt();
    }

    public final void b(long j10, long j11, float f10) {
        this.f923c.f943a = j11;
        this.f923c.f944b = f10;
        if (j10 != this.f929i) {
            this.f929i = j10;
            j jVar = this.f926f;
            if (jVar != null) {
                jVar.obtainMessage(11, (int) (j10 >> 32), (int) j10, this).sendToTarget();
            }
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        try {
            if (this.f924d) {
                this.f922b.remove();
            } else {
                long j10 = -1;
                int i10 = 0;
                while (!this.f927g) {
                    try {
                        this.f922b.a(this);
                        break;
                    } catch (IOException e10) {
                        if (!this.f927g) {
                            long j11 = this.f923c.f943a;
                            if (j11 != j10) {
                                j10 = j11;
                                i10 = 0;
                            }
                            int i11 = i10 + 1;
                            if (i11 > this.f925e) {
                                throw e10;
                            }
                            Thread.sleep(Math.min(i10 * 1000, 5000));
                            i10 = i11;
                        }
                    }
                }
            }
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        } catch (Exception e11) {
            this.f928h = e11;
        }
        j jVar = this.f926f;
        if (jVar != null) {
            jVar.obtainMessage(10, this).sendToTarget();
        }
    }
}
