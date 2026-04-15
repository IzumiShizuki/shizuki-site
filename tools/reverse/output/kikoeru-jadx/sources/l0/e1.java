package l0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class e1 implements l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f11459a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f11460b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f11461c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final r f11462d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p f11463e;

    public e1(boolean z10, int i10, int i11, r rVar, p pVar) {
        this.f11459a = z10;
        this.f11460b = i10;
        this.f11461c = i11;
        this.f11462d = rVar;
        this.f11463e = pVar;
    }

    @Override // l0.l0
    public final boolean a() {
        return this.f11459a;
    }

    @Override // l0.l0
    public final p b() {
        return this.f11463e;
    }

    @Override // l0.l0
    public final r c() {
        return this.f11462d;
    }

    @Override // l0.l0
    public final p d() {
        return this.f11463e;
    }

    @Override // l0.l0
    public final int e() {
        return this.f11461c;
    }

    @Override // l0.l0
    public final p f() {
        return this.f11463e;
    }

    @Override // l0.l0
    public final i g() {
        int i10 = this.f11460b;
        int i11 = this.f11461c;
        return i10 < i11 ? i.f11497b : i10 > i11 ? i.f11496a : this.f11463e.b();
    }

    @Override // l0.l0
    public final o.c0 h(r rVar) {
        boolean z10 = rVar.f11604c;
        q qVar = rVar.f11603b;
        q qVar2 = rVar.f11602a;
        if ((!z10 && qVar2.f11597b > qVar.f11597b) || (z10 && qVar2.f11597b <= qVar.f11597b)) {
            rVar = r.a(rVar, null, null, !z10, 3);
        }
        long j10 = this.f11463e.f11585a;
        o.c0 c0Var = o.q.f16031a;
        o.c0 c0Var2 = new o.c0();
        c0Var2.h(j10, rVar);
        return c0Var2;
    }

    @Override // l0.l0
    public final boolean i(l0 l0Var) {
        if (this.f11462d == null || l0Var == null || !(l0Var instanceof e1) || this.f11460b != l0Var.k() || this.f11461c != l0Var.e() || this.f11459a != l0Var.a()) {
            return true;
        }
        p pVar = ((e1) l0Var).f11463e;
        p pVar2 = this.f11463e;
        return (pVar2.f11585a == pVar.f11585a && pVar2.f11587c == pVar.f11587c && pVar2.f11588d == pVar.f11588d) ? false : true;
    }

    @Override // l0.l0
    public final p j() {
        return this.f11463e;
    }

    @Override // l0.l0
    public final int k() {
        return this.f11460b;
    }

    @Override // l0.l0
    public final int m() {
        return 1;
    }

    public final String toString() {
        return "SingleSelectionLayout(isStartHandle=" + this.f11459a + ", crossed=" + g() + ", info=\n\t" + this.f11463e + ')';
    }

    @Override // l0.l0
    public final void l(ic.k kVar) {
    }
}
