package m6;

import p4.c0;
import r5.b0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class b implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f14767a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f14768b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f14769c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i f14770d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f14771e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f14772f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f14773g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f14774h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f14775i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f14776j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f14777k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f14778l;

    public b(i iVar, long j10, long j11, long j12, long j13, boolean z10) {
        p4.c.c(j10 >= 0 && j11 > j10);
        this.f14770d = iVar;
        this.f14768b = j10;
        this.f14769c = j11;
        if (j12 == j11 - j10 || z10) {
            this.f14772f = j13;
            this.f14771e = 4;
        } else {
            this.f14771e = 0;
        }
        this.f14767a = new f();
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00c4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c5  */
    @Override // m6.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long d(r5.o r28) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 349
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m6.b.d(r5.o):long");
    }

    @Override // m6.g
    public final b0 j() {
        if (this.f14772f != 0) {
            return new a(this);
        }
        return null;
    }

    @Override // m6.g
    public final void m(long j10) {
        this.f14774h = c0.j(j10, 0L, this.f14772f - 1);
        this.f14771e = 2;
        this.f14775i = this.f14768b;
        this.f14776j = this.f14769c;
        this.f14777k = 0L;
        this.f14778l = this.f14772f;
    }
}
