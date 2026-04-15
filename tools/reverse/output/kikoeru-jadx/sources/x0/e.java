package x0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class e implements s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t9.f f24289a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Throwable f24291c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f24290b = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final f1.a f24292d = new f1.a(0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public o.g0 f24293e = new o.g0();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public o.g0 f24294f = new o.g0();

    public e(t9.f fVar) {
        this.f24289a = fVar;
    }

    public static final void a(e eVar, Throwable th2) {
        int i10;
        synchronized (eVar.f24290b) {
            try {
                if (eVar.f24291c != null) {
                    return;
                }
                eVar.f24291c = th2;
                o.g0 g0Var = eVar.f24293e;
                Object[] objArr = g0Var.f15970a;
                int i11 = g0Var.f15971b;
                for (int i12 = 0; i12 < i11; i12++) {
                    hf.k kVar = ((d) objArr[i12]).f24262b;
                    if (kVar != null) {
                        kVar.h(ub.a.b(th2));
                    }
                }
                eVar.f24293e.c();
                f1.a aVar = eVar.f24292d;
                do {
                    i10 = aVar.get();
                } while (!aVar.compareAndSet(i10, ((((i10 >>> 27) & 15) + 1) & 15) << 27));
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // yb.h
    public final yb.h G(yb.h hVar) {
        return ud.b.C(this, hVar);
    }

    @Override // yb.h
    public final yb.h L(yb.g gVar) {
        return ud.b.z(this, gVar);
    }

    @Override // yb.h
    public final yb.f R(yb.g gVar) {
        return ud.b.o(this, gVar);
    }

    public final void c(long j10) {
        int i10;
        hf.k kVar;
        Object objB;
        synchronized (this.f24290b) {
            try {
                o.g0 g0Var = this.f24293e;
                this.f24293e = this.f24294f;
                this.f24294f = g0Var;
                f1.a aVar = this.f24292d;
                do {
                    i10 = aVar.get();
                } while (!aVar.compareAndSet(i10, ((((i10 >>> 27) & 15) + 1) & 15) << 27));
                int i11 = g0Var.f15971b;
                for (int i12 = 0; i12 < i11; i12++) {
                    d dVar = (d) g0Var.e(i12);
                    ic.k kVar2 = dVar.f24261a;
                    if (kVar2 != null && (kVar = dVar.f24262b) != null) {
                        try {
                            objB = kVar2.a(Long.valueOf(j10));
                        } catch (Throwable th2) {
                            objB = ub.a.b(th2);
                        }
                        kVar.h(objB);
                    }
                }
                g0Var.c();
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // yb.f
    public final yb.g getKey() {
        return r0.f24435b;
    }

    @Override // x0.s0
    public final Object k(ic.k kVar, yb.c cVar) {
        int i10;
        int i11;
        boolean z10 = true;
        hf.k kVar2 = new hf.k(1, ud.s.p(cVar));
        kVar2.r();
        d dVar = new d();
        dVar.f24261a = kVar;
        dVar.f24262b = kVar2;
        jc.w wVar = new jc.w();
        wVar.f10836a = -1;
        synchronized (this.f24290b) {
            Throwable th2 = this.f24291c;
            if (th2 != null) {
                kVar2.h(ub.a.b(th2));
            } else {
                f1.a aVar = this.f24292d;
                do {
                    i10 = aVar.get();
                    i11 = i10 + 1;
                } while (!aVar.compareAndSet(i10, i11));
                if ((134217727 & i11) != 1) {
                    z10 = false;
                }
                wVar.f10836a = (i11 >>> 27) & 15;
                this.f24293e.a(dVar);
                kVar2.w(new re.j(dVar, this, wVar, 1));
                if (z10) {
                    try {
                        this.f24289a.b();
                    } catch (Throwable th3) {
                        a(this, th3);
                    }
                }
            }
        }
        return kVar2.q();
    }

    @Override // yb.h
    public final Object y(ic.n nVar, Object obj) {
        return nVar.q(obj, this);
    }
}
