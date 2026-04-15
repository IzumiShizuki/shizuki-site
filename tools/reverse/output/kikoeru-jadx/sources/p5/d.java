package p5;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f16644a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f16645b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f16646c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f16647d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f16648e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f16649f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean[] f16650g = new boolean[15];

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f16651h;

    public final boolean a() {
        return this.f16647d > 15 && this.f16651h == 0;
    }

    public final void b(long j10) {
        long j11 = this.f16647d;
        if (j11 == 0) {
            this.f16644a = j10;
        } else if (j11 == 1) {
            long j12 = j10 - this.f16644a;
            this.f16645b = j12;
            this.f16649f = j12;
            this.f16648e = 1L;
        } else {
            long j13 = j10 - this.f16646c;
            int i10 = (int) (j11 % 15);
            long jAbs = Math.abs(j13 - this.f16645b);
            boolean[] zArr = this.f16650g;
            if (jAbs <= 1000000) {
                this.f16648e++;
                this.f16649f += j13;
                if (zArr[i10]) {
                    zArr[i10] = false;
                    this.f16651h--;
                }
            } else if (!zArr[i10]) {
                zArr[i10] = true;
                this.f16651h++;
            }
        }
        this.f16647d++;
        this.f16646c = j10;
    }

    public final void c() {
        this.f16647d = 0L;
        this.f16648e = 0L;
        this.f16649f = 0L;
        this.f16651h = 0;
        Arrays.fill(this.f16650g, false);
    }
}
