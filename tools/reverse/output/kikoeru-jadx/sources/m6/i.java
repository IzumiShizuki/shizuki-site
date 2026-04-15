package m6;

import m0.w;
import p4.s;
import r5.h0;
import r5.q;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public h0 f14800b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public q f14801c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public g f14802d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f14803e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f14804f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f14805g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f14806h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f14807i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f14809k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f14810l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f14811m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f14799a = new e();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public w f14808j = new w(1);

    public void a(long j10) {
        this.f14805g = j10;
    }

    public abstract long b(s sVar);

    public abstract boolean c(s sVar, long j10, w wVar);

    public void d(boolean z10) {
        if (z10) {
            this.f14808j = new w(1);
            this.f14804f = 0L;
            this.f14806h = 0;
        } else {
            this.f14806h = 1;
        }
        this.f14803e = -1L;
        this.f14805g = 0L;
    }
}
