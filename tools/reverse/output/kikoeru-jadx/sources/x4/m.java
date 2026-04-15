package x4;

import android.media.AudioTrack;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f24629a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f24630b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f24631c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f24632d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f24633e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f24634f;

    public m(AudioTrack audioTrack) {
        this.f24629a = new l(audioTrack);
        a();
    }

    public final void a() {
        if (this.f24629a != null) {
            b(0);
        }
    }

    public final void b(int i10) {
        this.f24630b = i10;
        if (i10 == 0) {
            this.f24633e = 0L;
            this.f24634f = -1L;
            this.f24631c = System.nanoTime() / 1000;
            this.f24632d = 10000L;
            return;
        }
        if (i10 == 1) {
            this.f24632d = 10000L;
            return;
        }
        if (i10 == 2 || i10 == 3) {
            this.f24632d = 10000000L;
        } else {
            if (i10 != 4) {
                throw new IllegalStateException();
            }
            this.f24632d = 500000L;
        }
    }
}
