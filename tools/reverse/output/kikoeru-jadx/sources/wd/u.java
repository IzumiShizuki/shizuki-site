package wd;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class u extends ce.p {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final u f23967j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final a f23968k = new a(7);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ce.e f23969a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f23970b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public s f23971c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public List f23972d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public z f23973e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public t f23974f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public r f23975g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public byte f23976h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f23977i;

    static {
        u uVar = new u();
        f23967j = uVar;
        uVar.f23971c = s.f23922b;
        uVar.f23972d = Collections.EMPTY_LIST;
        uVar.f23973e = z.f24054l;
        uVar.f23974f = t.f23942b;
        uVar.f23975g = r.f23908b;
    }

    public u() {
        this.f23976h = (byte) -1;
        this.f23977i = -1;
        this.f23969a = ce.e.f3915a;
    }

    @Override // ce.x
    public final boolean b() {
        byte b10 = this.f23976h;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        for (int i10 = 0; i10 < this.f23972d.size(); i10++) {
            if (!((z) this.f23972d.get(i10)).b()) {
                this.f23976h = (byte) 0;
                return false;
            }
        }
        if ((this.f23970b & 2) != 2 || this.f23973e.b()) {
            this.f23976h = (byte) 1;
            return true;
        }
        this.f23976h = (byte) 0;
        return false;
    }

    @Override // ce.b
    public final int c() {
        int i10 = this.f23977i;
        if (i10 != -1) {
            return i10;
        }
        int iD = (this.f23970b & 1) == 1 ? ce.g.d(1, this.f23971c.f23926a) : 0;
        for (int i11 = 0; i11 < this.f23972d.size(); i11++) {
            iD += ce.g.g(2, (ce.b) this.f23972d.get(i11));
        }
        if ((this.f23970b & 2) == 2) {
            iD += ce.g.g(3, this.f23973e);
        }
        if ((this.f23970b & 4) == 4) {
            iD += ce.g.d(4, this.f23974f.f23946a);
        }
        if ((this.f23970b & 8) == 8) {
            iD += ce.g.d(5, this.f23975g.f23912a);
        }
        int size = this.f23969a.size() + iD;
        this.f23977i = size;
        return size;
    }

    @Override // ce.b
    public final ce.k d() {
        return q.h();
    }

    @Override // ce.b
    public final ce.k e() {
        q qVarH = q.h();
        qVarH.j(this);
        return qVarH;
    }

    @Override // ce.b
    public final void f(ce.g gVar) throws IOException {
        c();
        if ((this.f23970b & 1) == 1) {
            gVar.E(1, this.f23971c.f23926a);
        }
        for (int i10 = 0; i10 < this.f23972d.size(); i10++) {
            gVar.H(2, (ce.b) this.f23972d.get(i10));
        }
        if ((this.f23970b & 2) == 2) {
            gVar.H(3, this.f23973e);
        }
        if ((this.f23970b & 4) == 4) {
            gVar.E(4, this.f23974f.f23946a);
        }
        if ((this.f23970b & 8) == 8) {
            gVar.E(5, this.f23975g.f23912a);
        }
        gVar.K(this.f23969a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public u(ce.f fVar, ce.i iVar) {
        this.f23976h = (byte) -1;
        this.f23977i = -1;
        s sVar = s.f23922b;
        this.f23971c = sVar;
        this.f23972d = Collections.EMPTY_LIST;
        this.f23973e = z.f24054l;
        t tVar = t.f23942b;
        this.f23974f = tVar;
        r rVar = r.f23908b;
        this.f23975g = rVar;
        ce.d dVar = new ce.d();
        ce.g gVarU = ce.g.u(dVar, 1);
        boolean z10 = false;
        char c3 = 0;
        while (!z10) {
            try {
                try {
                    int iN = fVar.n();
                    if (iN != 0) {
                        r rVar2 = null;
                        s sVar2 = null;
                        x xVarG = null;
                        t tVar2 = null;
                        if (iN == 8) {
                            int iK = fVar.k();
                            if (iK == 0) {
                                sVar2 = sVar;
                            } else if (iK == 1) {
                                sVar2 = s.f23923c;
                            } else if (iK == 2) {
                                sVar2 = s.f23924d;
                            }
                            if (sVar2 == null) {
                                gVarU.O(iN);
                                gVarU.O(iK);
                            } else {
                                this.f23970b |= 1;
                                this.f23971c = sVar2;
                            }
                        } else if (iN == 18) {
                            if ((c3 & 2) != 2) {
                                this.f23972d = new ArrayList();
                                c3 = 2;
                            }
                            this.f23972d.add(fVar.g(z.f24055m, iVar));
                        } else if (iN == 26) {
                            if ((this.f23970b & 2) == 2) {
                                z zVar = this.f23973e;
                                zVar.getClass();
                                xVarG = x.g();
                                xVarG.h(zVar);
                            }
                            z zVar2 = (z) fVar.g(z.f24055m, iVar);
                            this.f23973e = zVar2;
                            if (xVarG != null) {
                                xVarG.h(zVar2);
                                this.f23973e = xVarG.f();
                            }
                            this.f23970b |= 2;
                        } else if (iN == 32) {
                            int iK2 = fVar.k();
                            if (iK2 == 0) {
                                tVar2 = tVar;
                            } else if (iK2 == 1) {
                                tVar2 = t.f23943c;
                            } else if (iK2 == 2) {
                                tVar2 = t.f23944d;
                            }
                            if (tVar2 == null) {
                                gVarU.O(iN);
                                gVarU.O(iK2);
                            } else {
                                this.f23970b |= 4;
                                this.f23974f = tVar2;
                            }
                        } else if (iN != 40) {
                            if (!fVar.q(iN, gVarU)) {
                            }
                        } else {
                            int iK3 = fVar.k();
                            if (iK3 == 0) {
                                rVar2 = rVar;
                            } else if (iK3 == 1) {
                                rVar2 = r.f23909c;
                            } else if (iK3 == 2) {
                                rVar2 = r.f23910d;
                            }
                            if (rVar2 == null) {
                                gVarU.O(iN);
                                gVarU.O(iK3);
                            } else {
                                this.f23970b |= 8;
                                this.f23975g = rVar2;
                            }
                        }
                    }
                    z10 = true;
                } catch (Throwable th2) {
                    if ((c3 & 2) == 2) {
                        this.f23972d = Collections.unmodifiableList(this.f23972d);
                    }
                    try {
                        gVarU.m();
                    } catch (IOException unused) {
                    } catch (Throwable th3) {
                        this.f23969a = dVar.i();
                        throw th3;
                    }
                    this.f23969a = dVar.i();
                    throw th2;
                }
            } catch (ce.s e10) {
                e10.f3972a = this;
                throw e10;
            } catch (IOException e11) {
                ce.s sVar3 = new ce.s(e11.getMessage());
                sVar3.f3972a = this;
                throw sVar3;
            }
        }
        if ((c3 & 2) == 2) {
            this.f23972d = Collections.unmodifiableList(this.f23972d);
        }
        try {
            gVarU.m();
        } catch (IOException unused2) {
        } catch (Throwable th4) {
            this.f23969a = dVar.i();
            throw th4;
        }
        this.f23969a = dVar.i();
    }

    public u(q qVar) {
        this.f23976h = (byte) -1;
        this.f23977i = -1;
        this.f23969a = qVar.f3948a;
    }
}
