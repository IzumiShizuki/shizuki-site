package zd;

import ce.k;
import ce.p;
import ce.s;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class i extends p {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final i f26795g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final wd.a f26796h = new wd.a(28);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ce.e f26797a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List f26798b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public List f26799c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f26800d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public byte f26801e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f26802f;

    static {
        i iVar = new i();
        f26795g = iVar;
        List list = Collections.EMPTY_LIST;
        iVar.f26798b = list;
        iVar.f26799c = list;
    }

    public i() {
        this.f26800d = -1;
        this.f26801e = (byte) -1;
        this.f26802f = -1;
        this.f26797a = ce.e.f3915a;
    }

    @Override // ce.x
    public final boolean b() {
        if (this.f26801e == 1) {
            return true;
        }
        this.f26801e = (byte) 1;
        return true;
    }

    @Override // ce.b
    public final int c() {
        int i10 = this.f26802f;
        if (i10 != -1) {
            return i10;
        }
        int iG = 0;
        for (int i11 = 0; i11 < this.f26798b.size(); i11++) {
            iG += ce.g.g(1, (ce.b) this.f26798b.get(i11));
        }
        int iF = 0;
        for (int i12 = 0; i12 < this.f26799c.size(); i12++) {
            iF += ce.g.f(((Integer) this.f26799c.get(i12)).intValue());
        }
        int iF2 = iG + iF;
        if (!this.f26799c.isEmpty()) {
            iF2 = iF2 + 1 + ce.g.f(iF);
        }
        this.f26800d = iF;
        int size = this.f26797a.size() + iF2;
        this.f26802f = size;
        return size;
    }

    @Override // ce.b
    public final k d() {
        e eVar = new e();
        List list = Collections.EMPTY_LIST;
        eVar.f26767c = list;
        eVar.f26768d = list;
        return eVar;
    }

    @Override // ce.b
    public final k e() {
        e eVar = new e();
        List list = Collections.EMPTY_LIST;
        eVar.f26767c = list;
        eVar.f26768d = list;
        eVar.g(this);
        return eVar;
    }

    @Override // ce.b
    public final void f(ce.g gVar) throws IOException {
        c();
        for (int i10 = 0; i10 < this.f26798b.size(); i10++) {
            gVar.H(1, (ce.b) this.f26798b.get(i10));
        }
        if (this.f26799c.size() > 0) {
            gVar.O(42);
            gVar.O(this.f26800d);
        }
        for (int i11 = 0; i11 < this.f26799c.size(); i11++) {
            gVar.G(((Integer) this.f26799c.get(i11)).intValue());
        }
        gVar.K(this.f26797a);
    }

    public i(ce.f fVar, ce.i iVar) {
        this.f26800d = -1;
        this.f26801e = (byte) -1;
        this.f26802f = -1;
        List list = Collections.EMPTY_LIST;
        this.f26798b = list;
        this.f26799c = list;
        ce.d dVar = new ce.d();
        ce.g gVarU = ce.g.u(dVar, 1);
        boolean z10 = false;
        int i10 = 0;
        while (!z10) {
            try {
                try {
                    int iN = fVar.n();
                    if (iN != 0) {
                        if (iN == 10) {
                            if ((i10 & 1) != 1) {
                                this.f26798b = new ArrayList();
                                i10 |= 1;
                            }
                            this.f26798b.add(fVar.g(h.f26782n, iVar));
                        } else if (iN == 40) {
                            if ((i10 & 2) != 2) {
                                this.f26799c = new ArrayList();
                                i10 |= 2;
                            }
                            this.f26799c.add(Integer.valueOf(fVar.k()));
                        } else if (iN != 42) {
                            if (!fVar.q(iN, gVarU)) {
                            }
                        } else {
                            int iD = fVar.d(fVar.k());
                            if ((i10 & 2) != 2 && fVar.b() > 0) {
                                this.f26799c = new ArrayList();
                                i10 |= 2;
                            }
                            while (fVar.b() > 0) {
                                this.f26799c.add(Integer.valueOf(fVar.k()));
                            }
                            fVar.c(iD);
                        }
                    }
                    z10 = true;
                } catch (Throwable th2) {
                    if ((i10 & 1) == 1) {
                        this.f26798b = Collections.unmodifiableList(this.f26798b);
                    }
                    if ((i10 & 2) == 2) {
                        this.f26799c = Collections.unmodifiableList(this.f26799c);
                    }
                    try {
                        gVarU.m();
                    } catch (IOException unused) {
                    } catch (Throwable th3) {
                        this.f26797a = dVar.i();
                        throw th3;
                    }
                    this.f26797a = dVar.i();
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
        if ((i10 & 1) == 1) {
            this.f26798b = Collections.unmodifiableList(this.f26798b);
        }
        if ((i10 & 2) == 2) {
            this.f26799c = Collections.unmodifiableList(this.f26799c);
        }
        try {
            gVarU.m();
        } catch (IOException unused2) {
        } catch (Throwable th4) {
            this.f26797a = dVar.i();
            throw th4;
        }
        this.f26797a = dVar.i();
    }

    public i(e eVar) {
        this.f26800d = -1;
        this.f26801e = (byte) -1;
        this.f26802f = -1;
        this.f26797a = eVar.f3948a;
    }
}
