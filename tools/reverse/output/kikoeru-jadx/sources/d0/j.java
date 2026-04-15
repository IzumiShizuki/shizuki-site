package d0;

import g2.g1;
import java.util.List;
import u.e1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f5346a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f5347b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f5348c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f5349d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final j1.f f5350e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final j1.g f5351f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final f3.m f5352g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f5353h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f5354i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f5355j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int[] f5356k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f5357l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f5358m;

    public j(int i10, int i11, List list, long j10, Object obj, e1 e1Var, j1.f fVar, j1.g gVar, f3.m mVar, boolean z10) {
        this.f5346a = i10;
        this.f5347b = list;
        this.f5348c = j10;
        this.f5349d = obj;
        this.f5350e = fVar;
        this.f5351f = gVar;
        this.f5352g = mVar;
        this.f5353h = z10;
        this.f5354i = e1Var == e1.f20882a;
        int size = list.size();
        int iMax = 0;
        for (int i12 = 0; i12 < size; i12++) {
            g1 g1Var = (g1) list.get(i12);
            iMax = Math.max(iMax, !this.f5354i ? g1Var.f7181b : g1Var.f7180a);
        }
        this.f5355j = iMax;
        this.f5356k = new int[this.f5347b.size() * 2];
        this.f5358m = Integer.MIN_VALUE;
    }

    public final void a(int i10) {
        this.f5357l += i10;
        int[] iArr = this.f5356k;
        int length = iArr.length;
        for (int i11 = 0; i11 < length; i11++) {
            boolean z10 = this.f5354i;
            if ((z10 && i11 % 2 == 1) || (!z10 && i11 % 2 == 0)) {
                iArr[i11] = iArr[i11] + i10;
            }
        }
    }

    public final void b(int i10, int i11, int i12) {
        int i13;
        this.f5357l = i10;
        boolean z10 = this.f5354i;
        this.f5358m = z10 ? i12 : i11;
        List list = this.f5347b;
        int size = list.size();
        for (int i14 = 0; i14 < size; i14++) {
            g1 g1Var = (g1) list.get(i14);
            int i15 = i14 * 2;
            int[] iArr = this.f5356k;
            if (z10) {
                j1.f fVar = this.f5350e;
                if (fVar == null) {
                    x.a.b("null horizontalAlignment");
                    throw new ce.j0();
                }
                iArr[i15] = fVar.a(g1Var.f7180a, i11, this.f5352g);
                iArr[i15 + 1] = i10;
                i13 = g1Var.f7181b;
            } else {
                iArr[i15] = i10;
                int i16 = i15 + 1;
                j1.g gVar = this.f5351f;
                if (gVar == null) {
                    x.a.b("null verticalAlignment");
                    throw new ce.j0();
                }
                iArr[i16] = gVar.a(g1Var.f7181b, i12);
                i13 = g1Var.f7180a;
            }
            i10 += i13;
        }
    }
}
