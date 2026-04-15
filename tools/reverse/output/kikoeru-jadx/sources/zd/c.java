package zd;

import ce.k;
import ce.p;
import ce.s;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class c extends p {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final c f26747g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final wd.a f26748h = new wd.a(26);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ce.e f26749a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f26750b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f26751c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f26752d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public byte f26753e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f26754f;

    static {
        c cVar = new c();
        f26747g = cVar;
        cVar.f26751c = 0;
        cVar.f26752d = 0;
    }

    public c() {
        this.f26753e = (byte) -1;
        this.f26754f = -1;
        this.f26749a = ce.e.f3915a;
    }

    public static a i(c cVar) {
        a aVar = new a(1);
        aVar.i(cVar);
        return aVar;
    }

    @Override // ce.x
    public final boolean b() {
        if (this.f26753e == 1) {
            return true;
        }
        this.f26753e = (byte) 1;
        return true;
    }

    @Override // ce.b
    public final int c() {
        int i10 = this.f26754f;
        if (i10 != -1) {
            return i10;
        }
        int iE = (this.f26750b & 1) == 1 ? ce.g.e(1, this.f26751c) : 0;
        if ((this.f26750b & 2) == 2) {
            iE += ce.g.e(2, this.f26752d);
        }
        int size = this.f26749a.size() + iE;
        this.f26754f = size;
        return size;
    }

    @Override // ce.b
    public final k d() {
        return new a(1);
    }

    @Override // ce.b
    public final k e() {
        return i(this);
    }

    @Override // ce.b
    public final void f(ce.g gVar) throws IOException {
        c();
        if ((this.f26750b & 1) == 1) {
            gVar.F(1, this.f26751c);
        }
        if ((this.f26750b & 2) == 2) {
            gVar.F(2, this.f26752d);
        }
        gVar.K(this.f26749a);
    }

    public c(ce.f fVar) {
        this.f26753e = (byte) -1;
        this.f26754f = -1;
        boolean z10 = false;
        this.f26751c = 0;
        this.f26752d = 0;
        ce.d dVar = new ce.d();
        ce.g gVarU = ce.g.u(dVar, 1);
        while (!z10) {
            try {
                try {
                    int iN = fVar.n();
                    if (iN != 0) {
                        if (iN == 8) {
                            this.f26750b |= 1;
                            this.f26751c = fVar.k();
                        } else if (iN != 16) {
                            if (!fVar.q(iN, gVarU)) {
                            }
                        } else {
                            this.f26750b |= 2;
                            this.f26752d = fVar.k();
                        }
                    }
                    z10 = true;
                } catch (Throwable th2) {
                    try {
                        gVarU.m();
                    } catch (IOException unused) {
                    } catch (Throwable th3) {
                        this.f26749a = dVar.i();
                        throw th3;
                    }
                    this.f26749a = dVar.i();
                    throw th2;
                }
            } catch (s e10) {
                e10.f3972a = this;
                throw e10;
            } catch (IOException e11) {
                s sVar = new s(e11.getMessage());
                sVar.f3972a = this;
                throw sVar;
            }
        }
        try {
            gVarU.m();
        } catch (IOException unused2) {
        } catch (Throwable th4) {
            this.f26749a = dVar.i();
            throw th4;
        }
        this.f26749a = dVar.i();
    }

    public c(a aVar) {
        this.f26753e = (byte) -1;
        this.f26754f = -1;
        this.f26749a = aVar.f3948a;
    }
}
