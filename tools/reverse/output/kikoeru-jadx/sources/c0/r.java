package c0;

import b0.r0;
import g2.g1;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class r implements r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f3135a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f3136b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f3137c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f3138d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f3139e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f3140f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f3141g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f3142h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Object f3143i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final androidx.compose.foundation.lazy.layout.b f3144j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final long f3145k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f3146l = true;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f3147m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f3148n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f3149o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f3150p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f3151q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f3152r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final long f3153s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f3154t;

    public r(int i10, Object obj, List list, boolean z10, int i11, int i12, int i13, int i14, int i15, Object obj2, androidx.compose.foundation.lazy.layout.b bVar, long j10) {
        int i16;
        long j11;
        long j12;
        this.f3135a = i10;
        this.f3136b = obj;
        this.f3137c = list;
        this.f3138d = z10;
        this.f3139e = i12;
        this.f3140f = i13;
        this.f3141g = i14;
        this.f3142h = i15;
        this.f3143i = obj2;
        this.f3144j = bVar;
        this.f3145k = j10;
        int i17 = 1;
        int i18 = 0;
        if (list.isEmpty()) {
            i16 = 0;
        } else {
            g1 g1Var = (g1) list.get(0);
            i16 = z10 ? g1Var.f7181b : g1Var.f7180a;
            int iR = ud.b.r(list);
            if (1 <= iR) {
                int i19 = 1;
                while (true) {
                    g1 g1Var2 = (g1) list.get(i19);
                    int i20 = this.f3138d ? g1Var2.f7181b : g1Var2.f7180a;
                    i16 = i20 > i16 ? i20 : i16;
                    if (i19 == iR) {
                        break;
                    } else {
                        i19++;
                    }
                }
            }
        }
        this.f3147m = i16;
        int i21 = i16 + i11;
        this.f3148n = i21 < 0 ? 0 : i21;
        List list2 = this.f3137c;
        if (!list2.isEmpty()) {
            g1 g1Var3 = (g1) list2.get(0);
            int i22 = this.f3138d ? g1Var3.f7180a : g1Var3.f7181b;
            int iR2 = ud.b.r(list2);
            if (1 <= iR2) {
                while (true) {
                    g1 g1Var4 = (g1) list2.get(i17);
                    int i23 = this.f3138d ? g1Var4.f7180a : g1Var4.f7181b;
                    i22 = i23 > i22 ? i23 : i22;
                    if (i17 == iR2) {
                        break;
                    } else {
                        i17++;
                    }
                }
            }
            i18 = i22;
        }
        this.f3149o = -1;
        if (this.f3138d) {
            j11 = ((long) i18) << 32;
            j12 = this.f3147m;
        } else {
            j11 = ((long) this.f3147m) << 32;
            j12 = i18;
        }
        this.f3153s = (4294967295L & j12) | j11;
        this.f3154t = 0L;
    }

    public final int a(long j10) {
        return (int) (this.f3138d ? j10 & 4294967295L : j10 >> 32);
    }

    @Override // b0.r0
    public final int b() {
        return this.f3137c.size();
    }

    @Override // b0.r0
    public final int c() {
        return this.f3148n;
    }

    @Override // b0.r0
    public final int d() {
        return this.f3140f;
    }

    @Override // b0.r0
    public final Object e(int i10) {
        return ((g1) this.f3137c.get(i10)).A();
    }

    @Override // b0.r0
    public final long f() {
        return this.f3145k;
    }

    @Override // b0.r0
    public final boolean g() {
        return this.f3138d;
    }

    @Override // b0.r0
    public final int getIndex() {
        return this.f3135a;
    }

    @Override // b0.r0
    public final Object getKey() {
        return this.f3136b;
    }

    @Override // b0.r0
    public final void h() {
        this.f3152r = true;
    }

    @Override // b0.r0
    public final long i(int i10) {
        return this.f3154t;
    }

    @Override // b0.r0
    public final int j() {
        return this.f3139e;
    }

    @Override // b0.r0
    public final void k(int i10, int i11, int i12, int i13) {
        if (this.f3138d) {
            i12 = i13;
        }
        m(i10, i11, i12);
    }

    public final int l() {
        return (int) (!this.f3138d ? this.f3154t >> 32 : this.f3154t & 4294967295L);
    }

    public final void m(int i10, int i11, int i12) {
        long j10;
        this.f3149o = i12;
        this.f3150p = -this.f3141g;
        this.f3151q = i12 + this.f3142h;
        if (this.f3138d) {
            j10 = (((long) i11) << 32) | (4294967295L & ((long) i10));
        } else {
            j10 = (((long) i11) & 4294967295L) | (((long) i10) << 32);
        }
        this.f3154t = j10;
    }
}
