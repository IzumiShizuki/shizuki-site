package y6;

import android.util.SparseArray;
import r5.h0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h0 f25724a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f25725b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f25726c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final p4.r f25729f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public byte[] f25730g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f25731h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f25732i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f25733j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f25735l;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f25739p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f25740q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f25741r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f25742s;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final SparseArray f25727d = new SparseArray();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final SparseArray f25728e = new SparseArray();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public n f25736m = new n();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public n f25737n = new n();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f25734k = false;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f25738o = false;

    public o(h0 h0Var, boolean z10, boolean z11) {
        this.f25724a = h0Var;
        this.f25725b = z10;
        this.f25726c = z11;
        byte[] bArr = new byte[128];
        this.f25730g = bArr;
        this.f25729f = new p4.r(bArr, 0, 0);
        n nVar = this.f25737n;
        nVar.f25709b = false;
        nVar.f25708a = false;
    }

    public final void a() {
        boolean z10;
        int i10;
        boolean z11 = false;
        if (this.f25725b) {
            n nVar = this.f25737n;
            z10 = nVar.f25709b && ((i10 = nVar.f25712e) == 7 || i10 == 2);
        } else {
            z10 = this.f25742s;
        }
        boolean z12 = this.f25741r;
        int i11 = this.f25732i;
        if (i11 == 5 || (z10 && i11 == 1)) {
            z11 = true;
        }
        this.f25741r = z12 | z11;
    }
}
