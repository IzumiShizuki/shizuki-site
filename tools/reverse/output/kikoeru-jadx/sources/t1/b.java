package t1;

import a0.v;
import android.graphics.Outline;
import android.graphics.RectF;
import android.os.Build;
import java.util.Locale;
import p4.p;
import q.a0;
import q1.b0;
import q1.c0;
import q1.d0;
import q1.e0;
import q1.h0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f20139a;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Outline f20144f;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f20148j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public h0 f20149k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public e0 f20150l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public q1.h f20151m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f20152n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public s1.b f20153o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public p f20154p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f20155q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f20157s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f20158t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public long f20159u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public long f20160v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f20161w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public RectF f20162x;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public f3.c f20140b = s1.c.f19349a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public f3.m f20141c = f3.m.f6667a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ic.k f20142d = a.f20136c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a0 f20143e = new a0(10, this);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f20145g = true;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f20146h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f20147i = 9205357640488583168L;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final v f20156r = new v();

    static {
        int i10;
        String lowerCase = Build.FINGERPRINT.toLowerCase(Locale.ROOT);
        jc.l.d(lowerCase, "toLowerCase(...)");
        if (!lowerCase.equals("robolectric") && (i10 = Build.VERSION.SDK_INT) < 28 && i10 >= 22) {
            c.f20167e.a();
        }
    }

    public b(d dVar) {
        this.f20139a = dVar;
        dVar.E(false);
        this.f20158t = 0L;
        this.f20159u = 0L;
        this.f20160v = 9205357640488583168L;
    }

    public final void a() {
        Outline outline;
        if (this.f20145g) {
            boolean z10 = this.f20161w;
            Outline outline2 = null;
            d dVar = this.f20139a;
            if (z10 || dVar.L() > 0.0f) {
                e0 e0Var = this.f20150l;
                if (e0Var != null) {
                    RectF rectF = this.f20162x;
                    if (rectF == null) {
                        rectF = new RectF();
                        this.f20162x = rectF;
                    }
                    boolean z11 = e0Var instanceof q1.h;
                    if (!z11) {
                        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
                    }
                    ((q1.h) e0Var).f17511a.computeBounds(rectF, false);
                    int i10 = Build.VERSION.SDK_INT;
                    if (i10 > 28 || ((q1.h) e0Var).f17511a.isConvex()) {
                        outline = this.f20144f;
                        if (outline == null) {
                            outline = new Outline();
                            this.f20144f = outline;
                        }
                        if (i10 >= 30) {
                            if (!z11) {
                                throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
                            }
                            outline.setPath(((q1.h) e0Var).f17511a);
                        } else {
                            if (!z11) {
                                throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
                            }
                            outline.setConvexPath(((q1.h) e0Var).f17511a);
                        }
                        this.f20152n = !outline.canClip();
                    } else {
                        Outline outline3 = this.f20144f;
                        if (outline3 != null) {
                            outline3.setEmpty();
                        }
                        this.f20152n = true;
                        outline = null;
                    }
                    this.f20150l = e0Var;
                    if (outline != null) {
                        outline.setAlpha(dVar.a());
                        outline2 = outline;
                    }
                    dVar.q(outline2, (4294967295L & ((long) Math.round(rectF.height()))) | (((long) Math.round(rectF.width())) << 32));
                    if (this.f20152n && this.f20161w) {
                        dVar.E(false);
                        dVar.f();
                    } else {
                        dVar.E(this.f20161w);
                    }
                } else {
                    dVar.E(this.f20161w);
                    Outline outline4 = this.f20144f;
                    if (outline4 == null) {
                        outline4 = new Outline();
                        this.f20144f = outline4;
                    }
                    Outline outline5 = outline4;
                    long jR = gh.g.R(this.f20159u);
                    long j10 = this.f20146h;
                    long j11 = this.f20147i;
                    long j12 = j11 == 9205357640488583168L ? jR : j11;
                    int i11 = (int) (j10 >> 32);
                    int i12 = (int) (j10 & 4294967295L);
                    outline5.setRoundRect(Math.round(Float.intBitsToFloat(i11)), Math.round(Float.intBitsToFloat(i12)), Math.round(Float.intBitsToFloat((int) (j12 >> 32)) + Float.intBitsToFloat(i11)), Math.round(Float.intBitsToFloat((int) (4294967295L & j12)) + Float.intBitsToFloat(i12)), this.f20148j);
                    outline5.setAlpha(dVar.a());
                    dVar.q(outline5, gh.g.N(j12));
                }
            } else {
                dVar.E(false);
                dVar.q(null, 0L);
            }
        }
        this.f20145g = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x006a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b() {
        /*
            r17 = this;
            r0 = r17
            boolean r1 = r0.f20157s
            if (r1 == 0) goto L77
            int r1 = r0.f20155q
            if (r1 != 0) goto L77
            a0.v r1 = r0.f20156r
            java.lang.Object r2 = r1.f153b
            t1.b r2 = (t1.b) r2
            if (r2 == 0) goto L1e
            int r3 = r2.f20155q
            int r3 = r3 + (-1)
            r2.f20155q = r3
            r2.b()
            r2 = 0
            r1.f153b = r2
        L1e:
            java.lang.Object r1 = r1.f155d
            o.l0 r1 = (o.l0) r1
            if (r1 == 0) goto L72
            java.lang.Object[] r2 = r1.f16003b
            long[] r3 = r1.f16002a
            int r4 = r3.length
            int r4 = r4 + (-2)
            if (r4 < 0) goto L6f
            r5 = 0
            r6 = 0
        L2f:
            r7 = r3[r6]
            long r9 = ~r7
            r11 = 7
            long r9 = r9 << r11
            long r9 = r9 & r7
            r11 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r9 = r9 & r11
            int r13 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r13 == 0) goto L6a
            int r9 = r6 - r4
            int r9 = ~r9
            int r9 = r9 >>> 31
            r10 = 8
            int r9 = 8 - r9
            r11 = 0
        L49:
            if (r11 >= r9) goto L68
            r12 = 255(0xff, double:1.26E-321)
            long r12 = r12 & r7
            r14 = 128(0x80, double:6.3E-322)
            int r16 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r16 >= 0) goto L64
            int r12 = r6 << 3
            int r12 = r12 + r11
            r12 = r2[r12]
            t1.b r12 = (t1.b) r12
            int r13 = r12.f20155q
            int r13 = r13 + (-1)
            r12.f20155q = r13
            r12.b()
        L64:
            long r7 = r7 >> r10
            int r11 = r11 + 1
            goto L49
        L68:
            if (r9 != r10) goto L6f
        L6a:
            if (r6 == r4) goto L6f
            int r6 = r6 + 1
            goto L2f
        L6f:
            r1.b()
        L72:
            t1.d r1 = r0.f20139a
            r1.f()
        L77:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: t1.b.b():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0098  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(s1.d r18) {
        /*
            r17 = this;
            r0 = r17
            a0.v r1 = r0.f20156r
            java.lang.Object r2 = r1.f153b
            t1.b r2 = (t1.b) r2
            r1.f154c = r2
            java.lang.Object r2 = r1.f155d
            o.l0 r2 = (o.l0) r2
            if (r2 == 0) goto L2b
            boolean r3 = r2.h()
            if (r3 == 0) goto L2b
            java.lang.Object r3 = r1.f156e
            o.l0 r3 = (o.l0) r3
            if (r3 != 0) goto L25
            int r3 = o.t0.f16044a
            o.l0 r3 = new o.l0
            r3.<init>()
            r1.f156e = r3
        L25:
            r3.k(r2)
            r2.b()
        L2b:
            r2 = 1
            r1.f152a = r2
            ic.k r2 = r0.f20142d
            r3 = r18
            r2.a(r3)
            r2 = 0
            r1.f152a = r2
            java.lang.Object r3 = r1.f154c
            t1.b r3 = (t1.b) r3
            if (r3 == 0) goto L47
            int r4 = r3.f20155q
            int r4 = r4 + (-1)
            r3.f20155q = r4
            r3.b()
        L47:
            java.lang.Object r1 = r1.f156e
            o.l0 r1 = (o.l0) r1
            if (r1 == 0) goto La0
            boolean r3 = r1.h()
            if (r3 == 0) goto La0
            java.lang.Object[] r3 = r1.f16003b
            long[] r4 = r1.f16002a
            int r5 = r4.length
            int r5 = r5 + (-2)
            if (r5 < 0) goto L9d
            r6 = 0
        L5d:
            r7 = r4[r6]
            long r9 = ~r7
            r11 = 7
            long r9 = r9 << r11
            long r9 = r9 & r7
            r11 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r9 = r9 & r11
            int r13 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r13 == 0) goto L98
            int r9 = r6 - r5
            int r9 = ~r9
            int r9 = r9 >>> 31
            r10 = 8
            int r9 = 8 - r9
            r11 = 0
        L77:
            if (r11 >= r9) goto L96
            r12 = 255(0xff, double:1.26E-321)
            long r12 = r12 & r7
            r14 = 128(0x80, double:6.3E-322)
            int r16 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r16 >= 0) goto L92
            int r12 = r6 << 3
            int r12 = r12 + r11
            r12 = r3[r12]
            t1.b r12 = (t1.b) r12
            int r13 = r12.f20155q
            int r13 = r13 + (-1)
            r12.f20155q = r13
            r12.b()
        L92:
            long r7 = r7 >> r10
            int r11 = r11 + 1
            goto L77
        L96:
            if (r9 != r10) goto L9d
        L98:
            if (r6 == r5) goto L9d
            int r6 = r6 + 1
            goto L5d
        L9d:
            r1.b()
        La0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: t1.b.c(s1.d):void");
    }

    public final h0 d() {
        h0 c0Var;
        h0 h0Var = this.f20149k;
        e0 e0Var = this.f20150l;
        if (h0Var != null) {
            return h0Var;
        }
        if (e0Var != null) {
            b0 b0Var = new b0(e0Var);
            this.f20149k = b0Var;
            return b0Var;
        }
        long jR = gh.g.R(this.f20159u);
        long j10 = this.f20146h;
        long j11 = this.f20147i;
        if (j11 != 9205357640488583168L) {
            jR = j11;
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j10 & 4294967295L));
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (jR >> 32)) + fIntBitsToFloat;
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (jR & 4294967295L)) + fIntBitsToFloat2;
        float f10 = this.f20148j;
        if (f10 > 0.0f) {
            c0Var = new d0(nd.h.b(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat3, fIntBitsToFloat4, (((long) Float.floatToRawIntBits(f10)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(f10)))));
        } else {
            c0Var = new c0(new p1.c(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat3, fIntBitsToFloat4));
        }
        this.f20149k = c0Var;
        return c0Var;
    }

    public final void e(f3.c cVar, f3.m mVar, long j10, ic.k kVar) {
        boolean zB = f3.l.b(this.f20159u, j10);
        d dVar = this.f20139a;
        if (!zB) {
            this.f20159u = j10;
            long j11 = this.f20158t;
            dVar.t((int) (j11 >> 32), (int) (j11 & 4294967295L), j10);
            if (this.f20147i == 9205357640488583168L) {
                this.f20145g = true;
                a();
            }
        }
        this.f20140b = cVar;
        this.f20141c = mVar;
        this.f20142d = kVar;
        dVar.G(cVar, mVar, this, this.f20143e);
    }

    public final void f(float f10) {
        d dVar = this.f20139a;
        if (dVar.a() == f10) {
            return;
        }
        dVar.k(f10);
    }

    public final void g(long j10, long j11, float f10) {
        if (p1.b.c(this.f20146h, j10) && p1.e.a(this.f20147i, j11) && this.f20148j == f10 && this.f20150l == null) {
            return;
        }
        this.f20149k = null;
        this.f20150l = null;
        this.f20145g = true;
        this.f20152n = false;
        this.f20146h = j10;
        this.f20147i = j11;
        this.f20148j = f10;
        a();
    }
}
