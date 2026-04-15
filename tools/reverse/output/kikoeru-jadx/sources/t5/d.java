package t5;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class d implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f20518a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f20519b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f20520c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f20521d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f20522e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f20523f;

    public d(int i10, int i11, int i12, int i13, int i14, int i15) {
        this.f20518a = i10;
        this.f20519b = i11;
        this.f20520c = i12;
        this.f20521d = i13;
        this.f20522e = i14;
        this.f20523f = i15;
    }

    public final int a() {
        int i10 = this.f20518a;
        if (i10 == 1935960438) {
            return 2;
        }
        if (i10 == 1935963489) {
            return 1;
        }
        if (i10 == 1937012852) {
            return 3;
        }
        p4.c.B("AviStreamHeaderChunk", "Found unsupported streamType fourCC: " + Integer.toHexString(i10));
        return -1;
    }

    @Override // t5.a
    public final int b() {
        return 1752331379;
    }
}
