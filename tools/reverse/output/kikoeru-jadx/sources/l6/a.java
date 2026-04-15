package l6;

import m4.p0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f11723a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f11724b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f11725c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f11726d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f11727e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final p4.s f11728f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final p4.s f11729g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f11730h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f11731i;

    public a(p4.s sVar, p4.s sVar2, boolean z10) throws p0 {
        this.f11729g = sVar;
        this.f11728f = sVar2;
        this.f11727e = z10;
        sVar2.G(12);
        this.f11723a = sVar2.y();
        sVar.G(12);
        this.f11731i = sVar.y();
        r5.b.c("first_chunk must be 1", sVar.g() == 1);
        this.f11724b = -1;
    }

    public final boolean a() {
        int i10 = this.f11724b + 1;
        this.f11724b = i10;
        if (i10 == this.f11723a) {
            return false;
        }
        boolean z10 = this.f11727e;
        p4.s sVar = this.f11728f;
        this.f11726d = z10 ? sVar.z() : sVar.w();
        if (this.f11724b == this.f11730h) {
            p4.s sVar2 = this.f11729g;
            this.f11725c = sVar2.y();
            sVar2.H(4);
            int i11 = this.f11731i - 1;
            this.f11731i = i11;
            this.f11730h = i11 > 0 ? sVar2.y() - 1 : -1;
        }
        return true;
    }
}
