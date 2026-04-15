package w1;

import java.util.ArrayList;
import q1.n0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f23160a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f23161b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f23162c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f23163d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f23164e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f23165f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f23166g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f23167h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ArrayList f23168i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final d f23169j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f23170k;

    public e(String str, float f10, float f11, float f12, float f13, long j10, int i10, boolean z10, int i11) {
        str = (i11 & 1) != 0 ? "" : str;
        long j11 = (i11 & 32) != 0 ? q1.q.f17575h : j10;
        int i12 = (i11 & 64) != 0 ? 5 : i10;
        boolean z11 = (i11 & 128) != 0 ? false : z10;
        this.f23160a = str;
        this.f23161b = f10;
        this.f23162c = f11;
        this.f23163d = f12;
        this.f23164e = f13;
        this.f23165f = j11;
        this.f23166g = i12;
        this.f23167h = z11;
        ArrayList arrayList = new ArrayList();
        this.f23168i = arrayList;
        d dVar = new d(null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, 1023);
        this.f23169j = dVar;
        arrayList.add(dVar);
    }

    public static void a(e eVar, ArrayList arrayList, int i10, n0 n0Var) {
        if (eVar.f23170k) {
            f2.a.b("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
        }
        ((d) eVar.f23168i.get(r0.size() - 1)).f23157j.add(new j0("", arrayList, i10, n0Var, 1.0f, null, 1.0f, 1.0f, 0, 2, 1.0f, 0.0f, 1.0f, 0.0f));
    }

    public final f b() {
        if (this.f23170k) {
            f2.a.b("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
        }
        while (true) {
            ArrayList arrayList = this.f23168i;
            if (arrayList.size() <= 1) {
                d dVar = this.f23169j;
                f fVar = new f(this.f23160a, this.f23161b, this.f23162c, this.f23163d, this.f23164e, new f0(dVar.f23148a, dVar.f23149b, dVar.f23150c, dVar.f23151d, dVar.f23152e, dVar.f23153f, dVar.f23154g, dVar.f23155h, dVar.f23156i, dVar.f23157j), this.f23165f, this.f23166g, this.f23167h);
                this.f23170k = true;
                return fVar;
            }
            if (this.f23170k) {
                f2.a.b("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
            }
            d dVar2 = (d) arrayList.remove(arrayList.size() - 1);
            ((d) arrayList.get(arrayList.size() - 1)).f23157j.add(new f0(dVar2.f23148a, dVar2.f23149b, dVar2.f23150c, dVar2.f23151d, dVar2.f23152e, dVar2.f23153f, dVar2.f23154g, dVar2.f23155h, dVar2.f23156i, dVar2.f23157j));
        }
    }
}
