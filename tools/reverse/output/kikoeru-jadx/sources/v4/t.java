package v4;

import android.media.MediaFormat;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class t implements p5.q, q5.a, w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public p5.q f22632a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public q5.a f22633b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public p5.q f22634c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public q5.a f22635d;

    @Override // q5.a
    public final void a(long j10, float[] fArr) {
        q5.a aVar = this.f22635d;
        if (aVar != null) {
            aVar.a(j10, fArr);
        }
        q5.a aVar2 = this.f22633b;
        if (aVar2 != null) {
            aVar2.a(j10, fArr);
        }
    }

    @Override // q5.a
    public final void b() {
        q5.a aVar = this.f22635d;
        if (aVar != null) {
            aVar.b();
        }
        q5.a aVar2 = this.f22633b;
        if (aVar2 != null) {
            aVar2.b();
        }
    }

    @Override // p5.q
    public final void c(long j10, long j11, m4.q qVar, MediaFormat mediaFormat) {
        long j12;
        long j13;
        m4.q qVar2;
        MediaFormat mediaFormat2;
        p5.q qVar3 = this.f22634c;
        if (qVar3 != null) {
            qVar3.c(j10, j11, qVar, mediaFormat);
            mediaFormat2 = mediaFormat;
            qVar2 = qVar;
            j13 = j11;
            j12 = j10;
        } else {
            j12 = j10;
            j13 = j11;
            qVar2 = qVar;
            mediaFormat2 = mediaFormat;
        }
        p5.q qVar4 = this.f22632a;
        if (qVar4 != null) {
            qVar4.c(j12, j13, qVar2, mediaFormat2);
        }
    }

    @Override // v4.w0
    public final void d(int i10, Object obj) {
        if (i10 == 7) {
            this.f22632a = (p5.q) obj;
            return;
        }
        if (i10 == 8) {
            this.f22633b = (q5.a) obj;
            return;
        }
        if (i10 != 10000) {
            return;
        }
        q5.k kVar = (q5.k) obj;
        if (kVar == null) {
            this.f22634c = null;
            this.f22635d = null;
        } else {
            this.f22634c = kVar.getVideoFrameMetadataListener();
            this.f22635d = kVar.getCameraMotionListener();
        }
    }
}
