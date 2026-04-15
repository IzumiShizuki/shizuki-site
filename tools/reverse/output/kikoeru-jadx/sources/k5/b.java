package k5;

import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class b implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f11033a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f11034b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f11035c;

    public b(long j10, long j11) {
        this.f11033a = j10;
        this.f11034b = j11;
        this.f11035c = j10 - 1;
    }

    public final void a() {
        long j10 = this.f11035c;
        if (j10 < this.f11033a || j10 > this.f11034b) {
            throw new NoSuchElementException();
        }
    }

    @Override // k5.m
    public final boolean next() {
        long j10 = this.f11035c + 1;
        this.f11035c = j10;
        return !(j10 > this.f11034b);
    }
}
