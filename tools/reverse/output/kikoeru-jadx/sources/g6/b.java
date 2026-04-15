package g6;

import java.util.Arrays;
import java.util.Locale;
import p4.c0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f7436a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f7437b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f7438c;

    public b(int i10, long j10, long j11) {
        p4.c.c(j10 < j11);
        this.f7436a = j10;
        this.f7437b = j11;
        this.f7438c = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b.class == obj.getClass()) {
            b bVar = (b) obj;
            if (this.f7436a == bVar.f7436a && this.f7437b == bVar.f7437b && this.f7438c == bVar.f7438c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f7436a), Long.valueOf(this.f7437b), Integer.valueOf(this.f7438c)});
    }

    public final String toString() {
        int i10 = c0.f16548a;
        Locale locale = Locale.US;
        return "Segment: startTimeMs=" + this.f7436a + ", endTimeMs=" + this.f7437b + ", speedDivisor=" + this.f7438c;
    }
}
