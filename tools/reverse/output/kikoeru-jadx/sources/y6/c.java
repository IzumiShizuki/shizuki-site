package y6;

import java.util.List;
import m7.k0;
import ya.a1;
import ya.g0;
import ya.i0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class c implements r5.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f25576a = new b(null, 0, 1, "audio/ac4");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p4.s f25577b = new p4.s(16384);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f25578c;

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003c, code lost:
    
        r5.f18848f = 0;
        r1 = r1 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0044, code lost:
    
        if ((r1 - r3) < 8192) goto L13;
     */
    @Override // r5.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean f(r5.o r15) throws java.io.EOFException, java.io.InterruptedIOException {
        /*
            r14 = this;
            p4.s r0 = new p4.s
            r1 = 10
            r0.<init>(r1)
            r2 = 0
            r3 = 0
        L9:
            byte[] r4 = r0.f16611a
            r5 = r15
            r5.k r5 = (r5.k) r5
            r5.i(r4, r2, r1, r2)
            r0.G(r2)
            int r4 = r0.x()
            r6 = 4801587(0x494433, float:6.728456E-39)
            r7 = 3
            if (r4 == r6) goto L8f
            r5.f18848f = r2
            r5.a(r3, r2)
            r1 = r3
        L24:
            r15 = 0
        L25:
            byte[] r4 = r0.f16611a
            r6 = 7
            r5.i(r4, r2, r6, r2)
            r0.G(r2)
            int r4 = r0.A()
            r8 = 44096(0xac40, float:6.1792E-41)
            r9 = 44097(0xac41, float:6.1793E-41)
            if (r4 == r8) goto L4b
            if (r4 == r9) goto L4b
            r5.f18848f = r2
            int r1 = r1 + 1
            int r15 = r1 - r3
            r4 = 8192(0x2000, float:1.148E-41)
            if (r15 < r4) goto L47
            goto L88
        L47:
            r5.a(r1, r2)
            goto L24
        L4b:
            r8 = 1
            int r15 = r15 + r8
            r10 = 4
            if (r15 < r10) goto L51
            return r8
        L51:
            byte[] r8 = r0.f16611a
            int r11 = r8.length
            r12 = -1
            if (r11 >= r6) goto L59
            r11 = -1
            goto L86
        L59:
            r11 = 2
            r11 = r8[r11]
            r11 = r11 & 255(0xff, float:3.57E-43)
            int r11 = r11 << 8
            r13 = r8[r7]
            r13 = r13 & 255(0xff, float:3.57E-43)
            r11 = r11 | r13
            r13 = 65535(0xffff, float:9.1834E-41)
            if (r11 != r13) goto L80
            r10 = r8[r10]
            r10 = r10 & 255(0xff, float:3.57E-43)
            int r10 = r10 << 16
            r11 = 5
            r11 = r8[r11]
            r11 = r11 & 255(0xff, float:3.57E-43)
            int r11 = r11 << 8
            r10 = r10 | r11
            r11 = 6
            r8 = r8[r11]
            r8 = r8 & 255(0xff, float:3.57E-43)
            r11 = r10 | r8
            goto L81
        L80:
            r6 = 4
        L81:
            if (r4 != r9) goto L85
            int r6 = r6 + 2
        L85:
            int r11 = r11 + r6
        L86:
            if (r11 != r12) goto L89
        L88:
            return r2
        L89:
            int r11 = r11 + (-7)
            r5.a(r11, r2)
            goto L25
        L8f:
            r0.H(r7)
            int r4 = r0.t()
            int r6 = r4 + 10
            int r3 = r3 + r6
            r5.a(r4, r2)
            goto L9
        */
        throw new UnsupportedOperationException("Method not decompiled: y6.c.f(r5.o):boolean");
    }

    @Override // r5.n
    public final int g(r5.o oVar, b0.a aVar) {
        p4.s sVar = this.f25577b;
        int i10 = oVar.read(sVar.f16611a, 0, 16384);
        if (i10 == -1) {
            return -1;
        }
        sVar.G(0);
        sVar.F(i10);
        boolean z10 = this.f25578c;
        b bVar = this.f25576a;
        if (!z10) {
            bVar.f25569o = 0L;
            this.f25578c = true;
        }
        bVar.b(sVar);
        return 0;
    }

    @Override // r5.n
    public final void h(r5.q qVar) {
        this.f25576a.c(qVar, new k0(0, 1));
        qVar.n();
        qVar.a(new r5.s(-9223372036854775807L));
    }

    @Override // r5.n
    public final void i(long j10, long j11) {
        this.f25578c = false;
        this.f25576a.a();
    }

    @Override // r5.n
    public final List j() {
        g0 g0Var = i0.f25998b;
        return a1.f25946e;
    }

    @Override // r5.n
    public final void a() {
    }

    @Override // r5.n
    public final r5.n c() {
        return this;
    }
}
