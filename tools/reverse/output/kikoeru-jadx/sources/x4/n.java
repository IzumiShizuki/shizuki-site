package x4;

import android.media.AudioTrack;
import java.lang.reflect.Method;
import java.math.RoundingMode;
import p4.c0;
import r.y1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class n {
    public long A;
    public long B;
    public long C;
    public boolean D;
    public long E;
    public long F;
    public boolean G;
    public long H;
    public p4.v I;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y1 f24635a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long[] f24636b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public AudioTrack f24637c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f24638d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public m f24639e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f24640f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f24641g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f24642h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f24643i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f24644j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f24645k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f24646l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Method f24647m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f24648n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f24649o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f24650p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f24651q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public long f24652r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f24653s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f24654t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public long f24655u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f24656v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f24657w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public long f24658x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public long f24659y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public long f24660z;

    public n(y1 y1Var) {
        this.f24635a = y1Var;
        try {
            this.f24647m = AudioTrack.class.getMethod("getLatency", null);
        } catch (NoSuchMethodException unused) {
        }
        this.f24636b = new long[10];
        this.I = p4.v.f16624a;
    }

    public final boolean a() {
        if (!this.f24641g) {
            return false;
        }
        AudioTrack audioTrack = this.f24637c;
        audioTrack.getClass();
        return audioTrack.getPlayState() == 2 && c() == 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0233 A[Catch: Exception -> 0x0249, TRY_LEAVE, TryCatch #0 {Exception -> 0x0249, blocks: (B:92:0x020e, B:94:0x0233), top: B:137:0x020e }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long b(boolean r29) {
        /*
            Method dump skipped, instruction units count: 815
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: x4.n.b(boolean):long");
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x009f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long c() {
        /*
            r13 = this;
            p4.v r0 = r13.I
            r0.getClass()
            long r0 = android.os.SystemClock.elapsedRealtime()
            long r2 = r13.f24658x
            r4 = 2
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r7 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r7 == 0) goto L46
            android.media.AudioTrack r2 = r13.f24637c
            r2.getClass()
            int r2 = r2.getPlayState()
            if (r2 != r4) goto L23
            long r0 = r13.f24660z
            return r0
        L23:
            long r0 = p4.c0.N(r0)
            long r2 = r13.f24658x
            long r0 = r0 - r2
            float r2 = r13.f24643i
            long r3 = p4.c0.y(r2, r0)
            int r0 = r13.f24640f
            long r5 = (long) r0
            r7 = 1000000(0xf4240, double:4.940656E-318)
            java.math.RoundingMode r9 = java.math.RoundingMode.UP
            long r0 = p4.c0.V(r3, r5, r7, r9)
            long r2 = r13.A
            long r4 = r13.f24660z
            long r4 = r4 + r0
            long r0 = java.lang.Math.min(r2, r4)
            return r0
        L46:
            long r2 = r13.f24652r
            long r2 = r0 - r2
            r7 = 5
            int r9 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r9 < 0) goto Lb7
            android.media.AudioTrack r2 = r13.f24637c
            r2.getClass()
            int r3 = r2.getPlayState()
            r7 = 1
            if (r3 != r7) goto L5d
            goto Lb5
        L5d:
            int r2 = r2.getPlaybackHeadPosition()
            long r7 = (long) r2
            r9 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r7 = r7 & r9
            boolean r2 = r13.f24641g
            r9 = 0
            if (r2 == 0) goto L7b
            if (r3 != r4) goto L78
            int r2 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r2 != 0) goto L78
            long r11 = r13.f24653s
            r13.f24655u = r11
        L78:
            long r11 = r13.f24655u
            long r7 = r7 + r11
        L7b:
            int r2 = p4.c0.f16548a
            r4 = 29
            if (r2 > r4) goto L99
            int r2 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r2 != 0) goto L97
            long r11 = r13.f24653s
            int r2 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r2 <= 0) goto L97
            r2 = 3
            if (r3 != r2) goto L97
            long r2 = r13.f24659y
            int r4 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r4 != 0) goto Lb5
            r13.f24659y = r0
            goto Lb5
        L97:
            r13.f24659y = r5
        L99:
            long r2 = r13.f24653s
            int r4 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r4 <= 0) goto Lb3
            boolean r4 = r13.G
            if (r4 == 0) goto Lac
            long r4 = r13.H
            long r4 = r4 + r2
            r13.H = r4
            r2 = 0
            r13.G = r2
            goto Lb3
        Lac:
            long r2 = r13.f24654t
            r4 = 1
            long r2 = r2 + r4
            r13.f24654t = r2
        Lb3:
            r13.f24653s = r7
        Lb5:
            r13.f24652r = r0
        Lb7:
            long r0 = r13.f24653s
            long r2 = r13.H
            long r0 = r0 + r2
            long r2 = r13.f24654t
            r4 = 32
            long r2 = r2 << r4
            long r0 = r0 + r2
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: x4.n.c():long");
    }

    public final boolean d(long j10) {
        if (this.f24658x == -9223372036854775807L) {
            long jB = b(false);
            int i10 = this.f24640f;
            int i11 = c0.f16548a;
            if (j10 > c0.V(jB, i10, 1000000L, RoundingMode.UP) || a()) {
                return true;
            }
        } else if (j10 > c() || a()) {
            return true;
        }
        return false;
    }

    public final void e() {
        this.f24645k = 0L;
        this.f24657w = 0;
        this.f24656v = 0;
        this.f24646l = 0L;
        this.C = 0L;
        this.F = 0L;
        this.f24644j = false;
    }
}
