package c0;

import b0.c1;
import g2.w0;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import u.e1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class o implements w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[] f3113a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f3114b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f3115c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final w0 f3116d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f3117e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f3118f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f3119g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f3120h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final androidx.media3.exoplayer.offline.u f3121i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final c1 f3122j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final f3.c f3123k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f3124l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Object f3125m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final long f3126n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f3127o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f3128p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f3129q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f3130r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f3131s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final hf.y f3132t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final e1 f3133u;

    public o(int[] iArr, int[] iArr2, float f10, w0 w0Var, float f11, boolean z10, boolean z11, boolean z12, androidx.media3.exoplayer.offline.u uVar, c1 c1Var, f3.c cVar, int i10, List list, long j10, int i11, int i12, int i13, int i14, int i15, hf.y yVar) {
        this.f3113a = iArr;
        this.f3114b = iArr2;
        this.f3115c = f10;
        this.f3116d = w0Var;
        this.f3117e = f11;
        this.f3118f = z10;
        this.f3119g = z11;
        this.f3120h = z12;
        this.f3121i = uVar;
        this.f3122j = c1Var;
        this.f3123k = cVar;
        this.f3124l = i10;
        this.f3125m = list;
        this.f3126n = j10;
        this.f3127o = i11;
        this.f3128p = i12;
        this.f3129q = i13;
        this.f3130r = i14;
        this.f3131s = i15;
        this.f3132t = yVar;
        this.f3133u = z11 ? e1.f20882a : e1.f20883b;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.List] */
    public final o a(int i10, boolean z10) {
        int i11;
        int i12;
        if (this.f3120h) {
            return null;
        }
        ?? r22 = this.f3125m;
        if (r22.isEmpty()) {
            return null;
        }
        int[] iArr = this.f3113a;
        if (iArr.length == 0) {
            return null;
        }
        int[] iArr2 = this.f3114b;
        if (iArr2.length == 0) {
            return null;
        }
        int i13 = this.f3130r;
        int i14 = this.f3128p;
        int i15 = i14 - i13;
        Collection collection = (Collection) r22;
        int size = collection.size();
        for (int i16 = 0; i16 < size; i16++) {
            r rVar = (r) r22.get(i16);
            boolean z11 = rVar.f3152r;
            int i17 = rVar.f3148n;
            if (z11) {
                return null;
            }
            if ((rVar.l() <= 0) != (rVar.l() + i10 <= 0)) {
                return null;
            }
            int iL = rVar.l();
            int i18 = this.f3127o;
            if (iL <= i18) {
                if (i10 < 0) {
                    if ((rVar.l() + i17) - i18 <= (-i10)) {
                        return null;
                    }
                } else if (i18 - rVar.l() <= i10) {
                    return null;
                }
            }
            if (rVar.l() + i17 >= i15) {
                if (i10 < 0) {
                    if ((rVar.l() + i17) - i14 <= (-i10)) {
                        return null;
                    }
                } else if (i14 - rVar.l() <= i10) {
                    return null;
                }
            }
        }
        int size2 = collection.size();
        for (int i19 = 0; i19 < size2; i19++) {
            r rVar2 = (r) r22.get(i19);
            boolean z12 = rVar2.f3138d;
            if (!rVar2.f3152r) {
                long j10 = rVar2.f3154t;
                rVar2.f3154t = (((long) (z12 ? ((int) (j10 & 4294967295L)) + i10 : (int) (j10 & 4294967295L))) & 4294967295L) | (((long) (z12 ? (int) (j10 >> 32) : ((int) (j10 >> 32)) + i10)) << 32);
                if (z10) {
                    int i20 = 0;
                    for (int size3 = rVar2.f3137c.size(); i20 < size3; size3 = i11) {
                        b0.a0 a0VarA = rVar2.f3144j.a(i20, rVar2.f3136b);
                        if (a0VarA != null) {
                            long j11 = a0VarA.f1183l;
                            if (z12) {
                                i11 = size3;
                                i12 = (int) (j11 >> 32);
                            } else {
                                i11 = size3;
                                i12 = ((int) (j11 >> 32)) + i10;
                            }
                            a0VarA.f1183l = (((long) (z12 ? ((int) (j11 & 4294967295L)) + i10 : (int) (j11 & 4294967295L))) & 4294967295L) | (((long) i12) << 32);
                        } else {
                            i11 = size3;
                        }
                        i20++;
                    }
                }
            }
        }
        int length = iArr2.length;
        int[] iArr3 = new int[length];
        for (int i21 = 0; i21 < length; i21++) {
            iArr3[i21] = iArr2[i21] - i10;
        }
        return new o(iArr, iArr3, i10, this.f3116d, this.f3117e, this.f3118f || i10 > 0, this.f3119g, this.f3120h, this.f3121i, this.f3122j, this.f3123k, this.f3124l, r22, this.f3126n, this.f3127o, this.f3128p, this.f3129q, this.f3130r, this.f3131s, this.f3132t);
    }

    @Override // g2.w0
    public final int b() {
        return this.f3116d.b();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    public final List c() {
        return this.f3125m;
    }

    @Override // g2.w0
    public final int h() {
        return this.f3116d.h();
    }

    @Override // g2.w0
    public final Map i() {
        return this.f3116d.i();
    }

    @Override // g2.w0
    public final void j() {
        this.f3116d.j();
    }

    @Override // g2.w0
    public final ic.k k() {
        return this.f3116d.k();
    }
}
