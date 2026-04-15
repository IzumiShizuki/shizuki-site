package y6;

import java.util.List;
import m7.k0;
import ya.a1;
import ya.g0;
import ya.i0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class a implements r5.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f25552a = new b("audio/ac3");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p4.s f25553b = new p4.s(2786);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f25554c;

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003e, code lost:
    
        if ((r4 - r3) < 8192) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0036, code lost:
    
        r5.f18848f = 0;
        r4 = r4 + 1;
     */
    @Override // r5.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean f(r5.o r14) throws java.io.EOFException, java.io.InterruptedIOException {
        /*
            r13 = this;
            p4.s r0 = new p4.s
            r1 = 10
            r0.<init>(r1)
            r2 = 0
            r3 = 0
        L9:
            byte[] r4 = r0.f16611a
            r5 = r14
            r5.k r5 = (r5.k) r5
            r5.i(r4, r2, r1, r2)
            r0.G(r2)
            int r4 = r0.x()
            r6 = 4801587(0x494433, float:6.728456E-39)
            r7 = 3
            if (r4 == r6) goto L80
            r5.f18848f = r2
            r5.a(r3, r2)
            r4 = r3
        L24:
            r14 = 0
        L25:
            byte[] r6 = r0.f16611a
            r8 = 6
            r5.i(r6, r2, r8, r2)
            r0.G(r2)
            int r6 = r0.A()
            r9 = 2935(0xb77, float:4.113E-42)
            if (r6 == r9) goto L45
            r5.f18848f = r2
            int r4 = r4 + 1
            int r14 = r4 - r3
            r6 = 8192(0x2000, float:1.148E-41)
            if (r14 < r6) goto L41
            goto L79
        L41:
            r5.a(r4, r2)
            goto L24
        L45:
            r6 = 1
            int r14 = r14 + r6
            r9 = 4
            if (r14 < r9) goto L4b
            return r6
        L4b:
            byte[] r10 = r0.f16611a
            int r11 = r10.length
            r12 = -1
            if (r11 >= r8) goto L53
            r9 = -1
            goto L77
        L53:
            r11 = 5
            r11 = r10[r11]
            r11 = r11 & 248(0xf8, float:3.48E-43)
            int r11 = r11 >> r7
            if (r11 <= r1) goto L6b
            r8 = 2
            r9 = r10[r8]
            r9 = r9 & 7
            int r9 = r9 << 8
            r10 = r10[r7]
            r10 = r10 & 255(0xff, float:3.57E-43)
            r9 = r9 | r10
            int r9 = r9 + r6
            int r9 = r9 * 2
            goto L77
        L6b:
            r6 = r10[r9]
            r9 = r6 & 192(0xc0, float:2.69E-43)
            int r8 = r9 >> 6
            r6 = r6 & 63
            int r9 = r5.b.f(r8, r6)
        L77:
            if (r9 != r12) goto L7a
        L79:
            return r2
        L7a:
            int r9 = r9 + (-6)
            r5.a(r9, r2)
            goto L25
        L80:
            r0.H(r7)
            int r4 = r0.t()
            int r6 = r4 + 10
            int r3 = r3 + r6
            r5.a(r4, r2)
            goto L9
        */
        throw new UnsupportedOperationException("Method not decompiled: y6.a.f(r5.o):boolean");
    }

    @Override // r5.n
    public final int g(r5.o oVar, b0.a aVar) {
        p4.s sVar = this.f25553b;
        int i10 = oVar.read(sVar.f16611a, 0, 2786);
        if (i10 == -1) {
            return -1;
        }
        sVar.G(0);
        sVar.F(i10);
        boolean z10 = this.f25554c;
        b bVar = this.f25552a;
        if (!z10) {
            bVar.f25569o = 0L;
            this.f25554c = true;
        }
        bVar.b(sVar);
        return 0;
    }

    @Override // r5.n
    public final void h(r5.q qVar) {
        this.f25552a.c(qVar, new k0(0, 1));
        qVar.n();
        qVar.a(new r5.s(-9223372036854775807L));
    }

    @Override // r5.n
    public final void i(long j10, long j11) {
        this.f25554c = false;
        this.f25552a.a();
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
