package lh;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f12556a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f12557b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f12558c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f12559d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f12560e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public c0 f12561f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public c0 f12562g;

    public c0() {
        this.f12556a = new byte[8192];
        this.f12560e = true;
        this.f12559d = false;
    }

    public final c0 a() {
        c0 c0Var = this.f12561f;
        if (c0Var == this) {
            c0Var = null;
        }
        c0 c0Var2 = this.f12562g;
        jc.l.b(c0Var2);
        c0Var2.f12561f = this.f12561f;
        c0 c0Var3 = this.f12561f;
        jc.l.b(c0Var3);
        c0Var3.f12562g = this.f12562g;
        this.f12561f = null;
        this.f12562g = null;
        return c0Var;
    }

    public final void b(c0 c0Var) {
        jc.l.e(c0Var, "segment");
        c0Var.f12562g = this;
        c0Var.f12561f = this.f12561f;
        c0 c0Var2 = this.f12561f;
        jc.l.b(c0Var2);
        c0Var2.f12562g = c0Var;
        this.f12561f = c0Var;
    }

    public final c0 c() {
        this.f12559d = true;
        return new c0(this.f12556a, this.f12557b, this.f12558c, true);
    }

    public final void d(c0 c0Var, int i10) {
        jc.l.e(c0Var, "sink");
        byte[] bArr = c0Var.f12556a;
        if (!c0Var.f12560e) {
            throw new IllegalStateException("only owner can write");
        }
        int i11 = c0Var.f12558c;
        int i12 = i11 + i10;
        if (i12 > 8192) {
            if (c0Var.f12559d) {
                throw new IllegalArgumentException();
            }
            int i13 = c0Var.f12557b;
            if (i12 - i13 > 8192) {
                throw new IllegalArgumentException();
            }
            vb.l.g0(0, i13, i11, bArr, bArr);
            c0Var.f12558c -= c0Var.f12557b;
            c0Var.f12557b = 0;
        }
        int i14 = c0Var.f12558c;
        int i15 = this.f12557b;
        vb.l.g0(i14, i15, i15 + i10, this.f12556a, bArr);
        c0Var.f12558c += i10;
        this.f12557b += i10;
    }

    public c0(byte[] bArr, int i10, int i11, boolean z10) {
        jc.l.e(bArr, "data");
        this.f12556a = bArr;
        this.f12557b = i10;
        this.f12558c = i11;
        this.f12559d = z10;
        this.f12560e = false;
    }
}
