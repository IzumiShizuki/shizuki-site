package x0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class x1 implements hf.y, u1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final f f24519d = new f();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yb.h f24520a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x1 f24521b = this;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile yb.h f24522c;

    public x1(yb.h hVar) {
        this.f24520a = hVar;
    }

    @Override // hf.y
    public final yb.h O() {
        yb.h hVarG;
        yb.h hVar = this.f24522c;
        if (hVar == null || hVar == f24519d) {
            i1.c cVar = (i1.c) this.f24520a.R(i1.c.f8638b);
            yb.h w1Var = cVar != null ? new w1(cVar, this) : yb.i.f26088a;
            synchronized (this.f24521b) {
                try {
                    yb.h hVar2 = this.f24522c;
                    if (hVar2 == null) {
                        yb.h hVar3 = this.f24520a;
                        hVarG = hVar3.G(new hf.f1((hf.d1) hVar3.R(hf.v.f8599b))).G(yb.i.f26088a).G(w1Var);
                    } else if (hVar2 == f24519d) {
                        yb.h hVar4 = this.f24520a;
                        hf.f1 f1Var = new hf.f1((hf.d1) hVar4.R(hf.v.f8599b));
                        f1Var.w(new h0(0));
                        hVarG = hVar4.G(f1Var).G(yb.i.f26088a).G(w1Var);
                    } else {
                        hVarG = hVar2;
                    }
                    this.f24522c = hVarG;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            hVar = hVarG;
        }
        jc.l.b(hVar);
        return hVar;
    }

    @Override // x0.u1
    public final void a() {
        b();
    }

    public final void b() {
        synchronized (this.f24521b) {
            try {
                yb.h hVar = this.f24522c;
                if (hVar == null) {
                    this.f24522c = f24519d;
                } else {
                    hf.a0.i(hVar, new h0(0));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // x0.u1
    public final void c() {
        b();
    }

    @Override // x0.u1
    public final void d() {
    }
}
