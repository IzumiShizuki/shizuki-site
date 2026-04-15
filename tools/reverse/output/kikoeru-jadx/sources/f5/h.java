package f5;

import android.graphics.Bitmap;
import android.os.Trace;
import androidx.media3.exoplayer.image.ImageOutput;
import b0.c1;
import b7.c3;
import java.util.ArrayDeque;
import m4.q;
import q.t0;
import v4.m;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class h extends v4.e {
    public int A;
    public q B;
    public b C;
    public u4.f D;
    public ImageOutput E;
    public Bitmap F;
    public boolean G;
    public g H;
    public g I;
    public int J;
    public boolean K;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final c f6703r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final u4.f f6704s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ArrayDeque f6705t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f6706u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f6707v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public f f6708w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public long f6709x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public long f6710y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f6711z;

    public h(c cVar) {
        super(4);
        this.f6703r = cVar;
        this.E = ImageOutput.f860a;
        this.f6704s = new u4.f(0);
        this.f6708w = f.f6697c;
        this.f6705t = new ArrayDeque();
        this.f6710y = -9223372036854775807L;
        this.f6709x = -9223372036854775807L;
        this.f6711z = 0;
        this.A = 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x014b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A(long r13) throws v4.m {
        /*
            Method dump skipped, instruction units count: 341
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f5.h.A(long):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0109  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean B(long r14) {
        /*
            Method dump skipped, instruction units count: 334
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f5.h.B(long):boolean");
    }

    public final void C() throws m {
        if (this.K) {
            q qVar = this.B;
            qVar.getClass();
            c1 c1Var = (c1) this.f6703r;
            int iH = c1Var.H(qVar);
            if (iH != t0.g(4, 0, 0, 0) && iH != t0.g(3, 0, 0, 0)) {
                throw f(new d("Provided decoder factory can't create decoder for format."), this.B, false, 4005);
            }
            b bVar = this.C;
            if (bVar != null) {
                bVar.a();
            }
            this.C = new b((c3) c1Var.f1208b);
            this.K = false;
        }
    }

    public final void D() {
        this.D = null;
        this.f6711z = 0;
        this.f6710y = -9223372036854775807L;
        b bVar = this.C;
        if (bVar != null) {
            bVar.a();
            this.C = null;
        }
    }

    @Override // v4.e, v4.w0
    public final void d(int i10, Object obj) {
        if (i10 != 15) {
            return;
        }
        ImageOutput imageOutput = obj instanceof ImageOutput ? (ImageOutput) obj : null;
        if (imageOutput == null) {
            imageOutput = ImageOutput.f860a;
        }
        this.E = imageOutput;
    }

    @Override // v4.e
    public final String i() {
        return "ImageRenderer";
    }

    @Override // v4.e
    public final boolean k() {
        return this.f6707v;
    }

    @Override // v4.e
    public final boolean l() {
        int i10 = this.A;
        if (i10 != 3) {
            return i10 == 0 && this.G;
        }
        return true;
    }

    @Override // v4.e
    public final void m() {
        this.B = null;
        this.f6708w = f.f6697c;
        this.f6705t.clear();
        D();
        this.E.getClass();
    }

    @Override // v4.e
    public final void n(boolean z10, boolean z11) {
        this.A = z11 ? 1 : 0;
    }

    @Override // v4.e
    public final void o(long j10, boolean z10) {
        this.A = Math.min(this.A, 1);
        this.f6707v = false;
        this.f6706u = false;
        this.F = null;
        this.H = null;
        this.I = null;
        this.G = false;
        this.D = null;
        b bVar = this.C;
        if (bVar != null) {
            bVar.flush();
        }
        this.f6705t.clear();
    }

    @Override // v4.e
    public final void p() {
        D();
    }

    @Override // v4.e
    public final void q() {
        D();
        this.A = Math.min(this.A, 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0023, code lost:
    
        if (r2 >= r6) goto L15;
     */
    @Override // v4.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void t(m4.q[] r5, long r6, long r8, j5.d0 r10) {
        /*
            r4 = this;
            f5.f r5 = r4.f6708w
            long r5 = r5.f6699b
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r7 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r7 == 0) goto L31
            java.util.ArrayDeque r5 = r4.f6705t
            boolean r6 = r5.isEmpty()
            if (r6 == 0) goto L26
            long r6 = r4.f6710y
            int r10 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r10 == 0) goto L31
            long r2 = r4.f6709x
            int r10 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r10 == 0) goto L26
            int r10 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r10 < 0) goto L26
            goto L31
        L26:
            f5.f r6 = new f5.f
            long r0 = r4.f6710y
            r6.<init>(r0, r8)
            r5.add(r6)
            return
        L31:
            f5.f r5 = new f5.f
            r5.<init>(r0, r8)
            r4.f6708w = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: f5.h.t(m4.q[], long, long, j5.d0):void");
    }

    @Override // v4.e
    public final void v(long j10, long j11) throws m {
        if (this.f6707v) {
            return;
        }
        if (this.B == null) {
            v2.e eVar = this.f22452c;
            eVar.n();
            u4.f fVar = this.f6704s;
            fVar.h();
            int iU = u(eVar, fVar, 2);
            if (iU != -5) {
                if (iU == -4) {
                    p4.c.i(fVar.d(4));
                    this.f6706u = true;
                    this.f6707v = true;
                    return;
                }
                return;
            }
            q qVar = (q) eVar.f22365c;
            p4.c.j(qVar);
            this.B = qVar;
            this.K = true;
        }
        if (this.C == null) {
            C();
        }
        try {
            Trace.beginSection("drainAndFeedDecoder");
            while (A(j10)) {
            }
            while (B(j10)) {
            }
            Trace.endSection();
        } catch (d e10) {
            throw f(e10, null, false, 4003);
        }
    }

    @Override // v4.e
    public final int y(q qVar) {
        return ((c1) this.f6703r).H(qVar);
    }
}
