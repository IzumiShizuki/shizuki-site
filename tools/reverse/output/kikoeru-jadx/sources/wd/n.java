package wd;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class n extends ce.m {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final n f23859k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final a f23860l = new a(5);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ce.e f23861b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f23862c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f23863d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public List f23864e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public List f23865f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public List f23866g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public List f23867h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public byte f23868i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f23869j;

    static {
        n nVar = new n();
        f23859k = nVar;
        nVar.f23863d = 6;
        List list = Collections.EMPTY_LIST;
        nVar.f23864e = list;
        nVar.f23865f = list;
        nVar.f23866g = list;
        nVar.f23867h = list;
    }

    public n(m mVar) {
        super(mVar);
        this.f23868i = (byte) -1;
        this.f23869j = -1;
        this.f23861b = mVar.f3948a;
    }

    @Override // ce.x
    public final ce.b a() {
        return f23859k;
    }

    @Override // ce.x
    public final boolean b() {
        byte b10 = this.f23868i;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        for (int i10 = 0; i10 < this.f23864e.size(); i10++) {
            if (!((b1) this.f23864e.get(i10)).b()) {
                this.f23868i = (byte) 0;
                return false;
            }
        }
        for (int i11 = 0; i11 < this.f23866g.size(); i11++) {
            if (!((l) this.f23866g.get(i11)).b()) {
                this.f23868i = (byte) 0;
                return false;
            }
        }
        for (int i12 = 0; i12 < this.f23867h.size(); i12++) {
            if (!((h) this.f23867h.get(i12)).b()) {
                this.f23868i = (byte) 0;
                return false;
            }
        }
        if (i()) {
            this.f23868i = (byte) 1;
            return true;
        }
        this.f23868i = (byte) 0;
        return false;
    }

    @Override // ce.b
    public final int c() {
        int i10 = this.f23869j;
        if (i10 != -1) {
            return i10;
        }
        int iE = (this.f23862c & 1) == 1 ? ce.g.e(1, this.f23863d) : 0;
        for (int i11 = 0; i11 < this.f23864e.size(); i11++) {
            iE += ce.g.g(2, (ce.b) this.f23864e.get(i11));
        }
        for (int i12 = 0; i12 < this.f23867h.size(); i12++) {
            iE += ce.g.g(3, (ce.b) this.f23867h.get(i12));
        }
        int iF = 0;
        for (int i13 = 0; i13 < this.f23865f.size(); i13++) {
            iF += ce.g.f(((Integer) this.f23865f.get(i13)).intValue());
        }
        int size = (this.f23865f.size() * 2) + iE + iF;
        for (int i14 = 0; i14 < this.f23866g.size(); i14++) {
            size += ce.g.g(32, (ce.b) this.f23866g.get(i14));
        }
        int size2 = this.f23861b.size() + j() + size;
        this.f23869j = size2;
        return size2;
    }

    @Override // ce.b
    public final ce.k d() {
        return m.h();
    }

    @Override // ce.b
    public final ce.k e() {
        m mVarH = m.h();
        mVarH.i(this);
        return mVarH;
    }

    @Override // ce.b
    public final void f(ce.g gVar) throws IOException {
        c();
        androidx.media3.exoplayer.offline.u uVar = new androidx.media3.exoplayer.offline.u(this);
        if ((this.f23862c & 1) == 1) {
            gVar.F(1, this.f23863d);
        }
        for (int i10 = 0; i10 < this.f23864e.size(); i10++) {
            gVar.H(2, (ce.b) this.f23864e.get(i10));
        }
        for (int i11 = 0; i11 < this.f23867h.size(); i11++) {
            gVar.H(3, (ce.b) this.f23867h.get(i11));
        }
        for (int i12 = 0; i12 < this.f23865f.size(); i12++) {
            gVar.F(31, ((Integer) this.f23865f.get(i12)).intValue());
        }
        for (int i13 = 0; i13 < this.f23866g.size(); i13++) {
            gVar.H(32, (ce.b) this.f23866g.get(i13));
        }
        uVar.e1(19000, gVar);
        gVar.K(this.f23861b);
    }

    public n() {
        this.f23868i = (byte) -1;
        this.f23869j = -1;
        this.f23861b = ce.e.f3915a;
    }

    public n(ce.f fVar, ce.i iVar) {
        this.f23868i = (byte) -1;
        this.f23869j = -1;
        this.f23863d = 6;
        List list = Collections.EMPTY_LIST;
        this.f23864e = list;
        this.f23865f = list;
        this.f23866g = list;
        this.f23867h = list;
        ce.d dVar = new ce.d();
        ce.g gVarU = ce.g.u(dVar, 1);
        boolean z10 = false;
        int i10 = 0;
        while (!z10) {
            try {
                try {
                    int iN = fVar.n();
                    if (iN != 0) {
                        if (iN == 8) {
                            this.f23862c |= 1;
                            this.f23863d = fVar.k();
                        } else if (iN == 18) {
                            if ((i10 & 2) != 2) {
                                this.f23864e = new ArrayList();
                                i10 |= 2;
                            }
                            this.f23864e.add(fVar.g(b1.f23574o, iVar));
                        } else if (iN == 26) {
                            if ((i10 & 16) != 16) {
                                this.f23867h = new ArrayList();
                                i10 |= 16;
                            }
                            this.f23867h.add(fVar.g(h.f23705h, iVar));
                        } else if (iN == 248) {
                            if ((i10 & 4) != 4) {
                                this.f23865f = new ArrayList();
                                i10 |= 4;
                            }
                            this.f23865f.add(Integer.valueOf(fVar.k()));
                        } else if (iN == 250) {
                            int iD = fVar.d(fVar.k());
                            if ((i10 & 4) != 4 && fVar.b() > 0) {
                                this.f23865f = new ArrayList();
                                i10 |= 4;
                            }
                            while (fVar.b() > 0) {
                                this.f23865f.add(Integer.valueOf(fVar.k()));
                            }
                            fVar.c(iD);
                        } else if (iN != 258) {
                            if (!n(fVar, gVarU, iVar, iN)) {
                            }
                        } else {
                            if ((i10 & 8) != 8) {
                                this.f23866g = new ArrayList();
                                i10 |= 8;
                            }
                            this.f23866g.add(fVar.g(l.f23832h, iVar));
                        }
                    }
                    z10 = true;
                } catch (Throwable th2) {
                    if ((i10 & 2) == 2) {
                        this.f23864e = Collections.unmodifiableList(this.f23864e);
                    }
                    if ((i10 & 16) == 16) {
                        this.f23867h = Collections.unmodifiableList(this.f23867h);
                    }
                    if ((i10 & 4) == 4) {
                        this.f23865f = Collections.unmodifiableList(this.f23865f);
                    }
                    if ((i10 & 8) == 8) {
                        this.f23866g = Collections.unmodifiableList(this.f23866g);
                    }
                    try {
                        gVarU.m();
                    } catch (IOException unused) {
                    } catch (Throwable th3) {
                        this.f23861b = dVar.i();
                        throw th3;
                    }
                    this.f23861b = dVar.i();
                    m();
                    throw th2;
                }
            } catch (ce.s e10) {
                e10.f3972a = this;
                throw e10;
            } catch (IOException e11) {
                ce.s sVar = new ce.s(e11.getMessage());
                sVar.f3972a = this;
                throw sVar;
            }
        }
        if ((i10 & 2) == 2) {
            this.f23864e = Collections.unmodifiableList(this.f23864e);
        }
        if ((i10 & 16) == 16) {
            this.f23867h = Collections.unmodifiableList(this.f23867h);
        }
        if ((i10 & 4) == 4) {
            this.f23865f = Collections.unmodifiableList(this.f23865f);
        }
        if ((i10 & 8) == 8) {
            this.f23866g = Collections.unmodifiableList(this.f23866g);
        }
        try {
            gVarU.m();
        } catch (IOException unused2) {
        } catch (Throwable th4) {
            this.f23861b = dVar.i();
            throw th4;
        }
        this.f23861b = dVar.i();
        m();
    }
}
