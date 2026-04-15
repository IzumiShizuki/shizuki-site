package g2;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class l0 implements w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7228a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w0 f7229b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p0 f7230c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f7231d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ w0 f7232e;

    public /* synthetic */ l0(w0 w0Var, p0 p0Var, int i10, w0 w0Var2, int i11) {
        this.f7228a = i11;
        this.f7230c = p0Var;
        this.f7231d = i10;
        this.f7232e = w0Var2;
        this.f7229b = w0Var;
    }

    @Override // g2.w0
    public final int b() {
        switch (this.f7228a) {
        }
        return this.f7229b.b();
    }

    @Override // g2.w0
    public final int h() {
        switch (this.f7228a) {
        }
        return this.f7229b.h();
    }

    @Override // g2.w0
    public final Map i() {
        switch (this.f7228a) {
        }
        return this.f7229b.i();
    }

    @Override // g2.w0
    public final void j() {
        switch (this.f7228a) {
            case 0:
                int i10 = this.f7231d;
                p0 p0Var = this.f7230c;
                p0Var.f7257e = i10;
                this.f7232e.j();
                o.k0 k0Var = p0Var.f7264l;
                long[] jArr = k0Var.f15995a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i11 = 0;
                    while (true) {
                        long j10 = jArr[i11];
                        if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i12 = 8 - ((~(i11 - length)) >>> 31);
                            for (int i13 = 0; i13 < i12; i13++) {
                                if ((255 & j10) < 128) {
                                    int i14 = (i11 << 3) + i13;
                                    Object obj = k0Var.f15996b[i14];
                                    o1 o1Var = (o1) k0Var.f15997c[i14];
                                    int i15 = p0Var.f7265m.i(obj);
                                    if (i15 < 0 || i15 >= p0Var.f7257e) {
                                        o1Var.a();
                                        k0Var.l(i14);
                                    }
                                }
                                j10 >>= 8;
                            }
                            if (i12 != 8) {
                            }
                        }
                        if (i11 != length) {
                            i11++;
                        }
                    }
                }
                break;
            default:
                int i16 = this.f7231d;
                p0 p0Var2 = this.f7230c;
                p0Var2.f7256d = i16;
                this.f7232e.j();
                p0Var2.c(p0Var2.f7256d);
                break;
        }
    }

    @Override // g2.w0
    public final ic.k k() {
        switch (this.f7228a) {
        }
        return this.f7229b.k();
    }
}
