package r5;

import java.util.Collections;
import m4.n0;
import m4.o0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f18864a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f18865b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f18866c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f18867d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f18868e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f18869f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f18870g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f18871h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f18872i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f18873j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final m0.w f18874k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final n0 f18875l;

    public t(byte[] bArr, int i10) {
        p4.r rVar = new p4.r(bArr, bArr.length);
        rVar.q(i10 * 8);
        this.f18864a = rVar.i(16);
        this.f18865b = rVar.i(16);
        this.f18866c = rVar.i(24);
        this.f18867d = rVar.i(24);
        int i11 = rVar.i(20);
        this.f18868e = i11;
        this.f18869f = d(i11);
        this.f18870g = rVar.i(3) + 1;
        int i12 = rVar.i(5) + 1;
        this.f18871h = i12;
        this.f18872i = a(i12);
        this.f18873j = rVar.k(36);
        this.f18874k = null;
        this.f18875l = null;
    }

    public static int a(int i10) {
        if (i10 == 8) {
            return 1;
        }
        if (i10 == 12) {
            return 2;
        }
        if (i10 == 16) {
            return 4;
        }
        if (i10 != 20) {
            return i10 != 24 ? -1 : 6;
        }
        return 5;
    }

    public static int d(int i10) {
        switch (i10) {
            case 8000:
                return 4;
            case 16000:
                return 5;
            case 22050:
                return 6;
            case 24000:
                return 7;
            case 32000:
                return 8;
            case 44100:
                return 9;
            case 48000:
                return 10;
            case 88200:
                return 1;
            case 96000:
                return 11;
            case 176400:
                return 2;
            case 192000:
                return 3;
            default:
                return -1;
        }
    }

    public final long b() {
        long j10 = this.f18873j;
        if (j10 == 0) {
            return -9223372036854775807L;
        }
        return (j10 * 1000000) / ((long) this.f18868e);
    }

    public final m4.q c(byte[] bArr, n0 n0Var) {
        bArr[4] = -128;
        int i10 = this.f18867d;
        if (i10 <= 0) {
            i10 = -1;
        }
        n0 n0Var2 = this.f18875l;
        if (n0Var2 != null) {
            n0Var = n0Var2.b(n0Var);
        }
        m4.p pVar = new m4.p();
        pVar.f14488m = o0.p("audio/flac");
        pVar.f14489n = i10;
        pVar.C = this.f18870g;
        pVar.D = this.f18868e;
        pVar.E = p4.c0.A(this.f18871h);
        pVar.f14491p = Collections.singletonList(bArr);
        pVar.f14486k = n0Var;
        return new m4.q(pVar);
    }

    public t(int i10, int i11, int i12, int i13, int i14, int i15, int i16, long j10, m0.w wVar, n0 n0Var) {
        this.f18864a = i10;
        this.f18865b = i11;
        this.f18866c = i12;
        this.f18867d = i13;
        this.f18868e = i14;
        this.f18869f = d(i14);
        this.f18870g = i15;
        this.f18871h = i16;
        this.f18872i = a(i16);
        this.f18873j = j10;
        this.f18874k = wVar;
        this.f18875l = n0Var;
    }
}
