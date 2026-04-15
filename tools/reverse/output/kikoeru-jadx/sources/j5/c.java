package j5;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class c implements c1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c1 f10235a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f10236b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d f10237c;

    public c(d dVar, c1 c1Var) {
        this.f10237c = dVar;
        this.f10235a = c1Var;
    }

    @Override // j5.c1
    public final boolean a() {
        return !this.f10237c.b() && this.f10235a.a();
    }

    @Override // j5.c1
    public final void b() {
        this.f10235a.b();
    }

    @Override // j5.c1
    public final int j(long j10) {
        if (this.f10237c.b()) {
            return -3;
        }
        return this.f10235a.j(j10);
    }

    @Override // j5.c1
    public final int n(v2.e eVar, u4.f fVar, int i10) {
        d dVar = this.f10237c;
        if (dVar.b()) {
            return -3;
        }
        if (this.f10236b) {
            fVar.f17713b = 4;
            return -4;
        }
        long jT = dVar.t();
        int iN = this.f10235a.n(eVar, fVar, i10);
        if (iN != -5) {
            long j10 = dVar.f10243f;
            if (j10 == Long.MIN_VALUE || ((iN != -4 || fVar.f21384g < j10) && !(iN == -3 && jT == Long.MIN_VALUE && !fVar.f21383f))) {
                return iN;
            }
            fVar.h();
            fVar.f17713b = 4;
            this.f10236b = true;
            return -4;
        }
        m4.q qVar = (m4.q) eVar.f22365c;
        qVar.getClass();
        int i11 = qVar.H;
        int i12 = qVar.G;
        if (i12 == 0 && i11 == 0) {
            return -5;
        }
        if (dVar.f10242e != 0) {
            i12 = 0;
        }
        if (dVar.f10243f != Long.MIN_VALUE) {
            i11 = 0;
        }
        m4.p pVarA = qVar.a();
        pVarA.F = i12;
        pVarA.G = i11;
        eVar.f22365c = new m4.q(pVarA);
        return -5;
    }
}
