package o6;

import java.util.List;
import ya.i0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i0 f16242a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f16243b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f16244c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f16245d;

    public a(long j10, long j11, List list) {
        this.f16242a = i0.q(list);
        this.f16243b = j10;
        this.f16244c = j11;
        long j12 = -9223372036854775807L;
        if (j10 != -9223372036854775807L && j11 != -9223372036854775807L) {
            j12 = j10 + j11;
        }
        this.f16245d = j12;
    }
}
