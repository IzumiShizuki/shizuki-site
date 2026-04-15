package zd;

import ce.k;
import ce.p;
import ce.s;
import java.io.IOException;
import wd.q;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class d extends p {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final d f26755j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final wd.a f26756k = new wd.a(27);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ce.e f26757a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f26758b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public b f26759c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public c f26760d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public c f26761e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public c f26762f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public c f26763g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public byte f26764h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f26765i;

    static {
        d dVar = new d();
        f26755j = dVar;
        dVar.f26759c = b.f26739g;
        c cVar = c.f26747g;
        dVar.f26760d = cVar;
        dVar.f26761e = cVar;
        dVar.f26762f = cVar;
        dVar.f26763g = cVar;
    }

    public d() {
        this.f26764h = (byte) -1;
        this.f26765i = -1;
        this.f26757a = ce.e.f3915a;
    }

    @Override // ce.x
    public final boolean b() {
        if (this.f26764h == 1) {
            return true;
        }
        this.f26764h = (byte) 1;
        return true;
    }

    @Override // ce.b
    public final int c() {
        int i10 = this.f26765i;
        if (i10 != -1) {
            return i10;
        }
        int iG = (this.f26758b & 1) == 1 ? ce.g.g(1, this.f26759c) : 0;
        if ((this.f26758b & 2) == 2) {
            iG += ce.g.g(2, this.f26760d);
        }
        if ((this.f26758b & 4) == 4) {
            iG += ce.g.g(3, this.f26761e);
        }
        if ((this.f26758b & 8) == 8) {
            iG += ce.g.g(4, this.f26762f);
        }
        if ((this.f26758b & 16) == 16) {
            iG += ce.g.g(5, this.f26763g);
        }
        int size = this.f26757a.size() + iG;
        this.f26765i = size;
        return size;
    }

    @Override // ce.b
    public final k d() {
        return q.i();
    }

    @Override // ce.b
    public final k e() {
        q qVarI = q.i();
        qVarI.k(this);
        return qVarI;
    }

    @Override // ce.b
    public final void f(ce.g gVar) throws IOException {
        c();
        if ((this.f26758b & 1) == 1) {
            gVar.H(1, this.f26759c);
        }
        if ((this.f26758b & 2) == 2) {
            gVar.H(2, this.f26760d);
        }
        if ((this.f26758b & 4) == 4) {
            gVar.H(3, this.f26761e);
        }
        if ((this.f26758b & 8) == 8) {
            gVar.H(4, this.f26762f);
        }
        if ((this.f26758b & 16) == 16) {
            gVar.H(5, this.f26763g);
        }
        gVar.K(this.f26757a);
    }

    public final boolean i() {
        return (this.f26758b & 4) == 4;
    }

    public d(ce.f fVar, ce.i iVar) {
        this.f26764h = (byte) -1;
        this.f26765i = -1;
        this.f26759c = b.f26739g;
        c cVar = c.f26747g;
        this.f26760d = cVar;
        this.f26761e = cVar;
        this.f26762f = cVar;
        this.f26763g = cVar;
        ce.d dVar = new ce.d();
        ce.g gVarU = ce.g.u(dVar, 1);
        boolean z10 = false;
        while (!z10) {
            try {
                try {
                    int iN = fVar.n();
                    if (iN != 0) {
                        a aVarI = null;
                        if (iN == 10) {
                            if ((this.f26758b & 1) == 1) {
                                b bVar = this.f26759c;
                                bVar.getClass();
                                aVarI = new a(0);
                                aVarI.h(bVar);
                            }
                            b bVar2 = (b) fVar.g(b.f26740h, iVar);
                            this.f26759c = bVar2;
                            if (aVarI != null) {
                                aVarI.h(bVar2);
                                this.f26759c = aVarI.f();
                            }
                            this.f26758b |= 1;
                        } else if (iN == 18) {
                            if ((this.f26758b & 2) == 2) {
                                c cVar2 = this.f26760d;
                                cVar2.getClass();
                                aVarI = c.i(cVar2);
                            }
                            c cVar3 = (c) fVar.g(c.f26748h, iVar);
                            this.f26760d = cVar3;
                            if (aVarI != null) {
                                aVarI.i(cVar3);
                                this.f26760d = aVarI.g();
                            }
                            this.f26758b |= 2;
                        } else if (iN == 26) {
                            if ((this.f26758b & 4) == 4) {
                                c cVar4 = this.f26761e;
                                cVar4.getClass();
                                aVarI = c.i(cVar4);
                            }
                            c cVar5 = (c) fVar.g(c.f26748h, iVar);
                            this.f26761e = cVar5;
                            if (aVarI != null) {
                                aVarI.i(cVar5);
                                this.f26761e = aVarI.g();
                            }
                            this.f26758b |= 4;
                        } else if (iN == 34) {
                            if ((this.f26758b & 8) == 8) {
                                c cVar6 = this.f26762f;
                                cVar6.getClass();
                                aVarI = c.i(cVar6);
                            }
                            c cVar7 = (c) fVar.g(c.f26748h, iVar);
                            this.f26762f = cVar7;
                            if (aVarI != null) {
                                aVarI.i(cVar7);
                                this.f26762f = aVarI.g();
                            }
                            this.f26758b |= 8;
                        } else if (iN != 42) {
                            if (!fVar.q(iN, gVarU)) {
                            }
                        } else {
                            if ((this.f26758b & 16) == 16) {
                                c cVar8 = this.f26763g;
                                cVar8.getClass();
                                aVarI = c.i(cVar8);
                            }
                            c cVar9 = (c) fVar.g(c.f26748h, iVar);
                            this.f26763g = cVar9;
                            if (aVarI != null) {
                                aVarI.i(cVar9);
                                this.f26763g = aVarI.g();
                            }
                            this.f26758b |= 16;
                        }
                    }
                    z10 = true;
                } catch (s e10) {
                    e10.f3972a = this;
                    throw e10;
                } catch (IOException e11) {
                    s sVar = new s(e11.getMessage());
                    sVar.f3972a = this;
                    throw sVar;
                }
            } catch (Throwable th2) {
                try {
                    gVarU.m();
                } catch (IOException unused) {
                } catch (Throwable th3) {
                    this.f26757a = dVar.i();
                    throw th3;
                }
                this.f26757a = dVar.i();
                throw th2;
            }
        }
        try {
            gVarU.m();
        } catch (IOException unused2) {
        } catch (Throwable th4) {
            this.f26757a = dVar.i();
            throw th4;
        }
        this.f26757a = dVar.i();
    }

    public d(q qVar) {
        this.f26764h = (byte) -1;
        this.f26765i = -1;
        this.f26757a = qVar.f3948a;
    }
}
