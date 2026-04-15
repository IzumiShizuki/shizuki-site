package zd;

import ce.k;
import ce.p;
import ce.s;
import ce.w;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class h extends p {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final h f26781m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final wd.a f26782n = new wd.a(29);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ce.e f26783a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f26784b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f26785c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f26786d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f26787e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public g f26788f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public List f26789g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f26790h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public List f26791i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f26792j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public byte f26793k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f26794l;

    static {
        h hVar = new h();
        f26781m = hVar;
        hVar.f26785c = 1;
        hVar.f26786d = 0;
        hVar.f26787e = "";
        hVar.f26788f = g.f26776b;
        List list = Collections.EMPTY_LIST;
        hVar.f26789g = list;
        hVar.f26791i = list;
    }

    public h() {
        this.f26790h = -1;
        this.f26792j = -1;
        this.f26793k = (byte) -1;
        this.f26794l = -1;
        this.f26783a = ce.e.f3915a;
    }

    @Override // ce.x
    public final boolean b() {
        if (this.f26793k == 1) {
            return true;
        }
        this.f26793k = (byte) 1;
        return true;
    }

    @Override // ce.b
    public final int c() {
        ce.e wVar;
        int i10 = this.f26794l;
        if (i10 != -1) {
            return i10;
        }
        int iE = (this.f26784b & 1) == 1 ? ce.g.e(1, this.f26785c) : 0;
        if ((this.f26784b & 2) == 2) {
            iE += ce.g.e(2, this.f26786d);
        }
        if ((this.f26784b & 8) == 8) {
            iE += ce.g.d(3, this.f26788f.f26780a);
        }
        int iF = 0;
        for (int i11 = 0; i11 < this.f26789g.size(); i11++) {
            iF += ce.g.f(((Integer) this.f26789g.get(i11)).intValue());
        }
        int iF2 = iE + iF;
        if (!this.f26789g.isEmpty()) {
            iF2 = iF2 + 1 + ce.g.f(iF);
        }
        this.f26790h = iF;
        int iF3 = 0;
        for (int i12 = 0; i12 < this.f26791i.size(); i12++) {
            iF3 += ce.g.f(((Integer) this.f26791i.get(i12)).intValue());
        }
        int size = iF2 + iF3;
        if (!this.f26791i.isEmpty()) {
            size = size + 1 + ce.g.f(iF3);
        }
        this.f26792j = iF3;
        if ((this.f26784b & 4) == 4) {
            Object obj = this.f26787e;
            if (obj instanceof String) {
                try {
                    wVar = new w(((String) obj).getBytes("UTF-8"));
                    this.f26787e = wVar;
                } catch (UnsupportedEncodingException e10) {
                    throw new RuntimeException("UTF-8 not supported?", e10);
                }
            } else {
                wVar = (ce.e) obj;
            }
            size += wVar.size() + ce.g.i(wVar.size()) + ce.g.k(6);
        }
        int size2 = this.f26783a.size() + size;
        this.f26794l = size2;
        return size2;
    }

    @Override // ce.b
    public final k d() {
        return f.g();
    }

    @Override // ce.b
    public final k e() {
        f fVarG = f.g();
        fVarG.h(this);
        return fVarG;
    }

    @Override // ce.b
    public final void f(ce.g gVar) throws IOException {
        ce.e wVar;
        c();
        if ((this.f26784b & 1) == 1) {
            gVar.F(1, this.f26785c);
        }
        if ((this.f26784b & 2) == 2) {
            gVar.F(2, this.f26786d);
        }
        if ((this.f26784b & 8) == 8) {
            gVar.E(3, this.f26788f.f26780a);
        }
        if (this.f26789g.size() > 0) {
            gVar.O(34);
            gVar.O(this.f26790h);
        }
        for (int i10 = 0; i10 < this.f26789g.size(); i10++) {
            gVar.G(((Integer) this.f26789g.get(i10)).intValue());
        }
        if (this.f26791i.size() > 0) {
            gVar.O(42);
            gVar.O(this.f26792j);
        }
        for (int i11 = 0; i11 < this.f26791i.size(); i11++) {
            gVar.G(((Integer) this.f26791i.get(i11)).intValue());
        }
        if ((this.f26784b & 4) == 4) {
            Object obj = this.f26787e;
            if (obj instanceof String) {
                try {
                    wVar = new w(((String) obj).getBytes("UTF-8"));
                    this.f26787e = wVar;
                } catch (UnsupportedEncodingException e10) {
                    throw new RuntimeException("UTF-8 not supported?", e10);
                }
            } else {
                wVar = (ce.e) obj;
            }
            gVar.Q(6, 2);
            gVar.O(wVar.size());
            gVar.K(wVar);
        }
        gVar.K(this.f26783a);
    }

    public h(ce.f fVar) {
        g gVar;
        this.f26790h = -1;
        this.f26792j = -1;
        this.f26793k = (byte) -1;
        this.f26794l = -1;
        this.f26785c = 1;
        boolean z10 = false;
        this.f26786d = 0;
        this.f26787e = "";
        g gVar2 = g.f26776b;
        this.f26788f = gVar2;
        List list = Collections.EMPTY_LIST;
        this.f26789g = list;
        this.f26791i = list;
        ce.d dVar = new ce.d();
        ce.g gVarU = ce.g.u(dVar, 1);
        int i10 = 0;
        while (!z10) {
            try {
                try {
                    try {
                        int iN = fVar.n();
                        if (iN != 0) {
                            if (iN == 8) {
                                this.f26784b |= 1;
                                this.f26785c = fVar.k();
                            } else if (iN == 16) {
                                this.f26784b |= 2;
                                this.f26786d = fVar.k();
                            } else if (iN == 24) {
                                int iK = fVar.k();
                                if (iK == 0) {
                                    gVar = gVar2;
                                } else if (iK != 1) {
                                    gVar = iK != 2 ? null : g.f26778d;
                                } else {
                                    gVar = g.f26777c;
                                }
                                if (gVar == null) {
                                    gVarU.O(iN);
                                    gVarU.O(iK);
                                } else {
                                    this.f26784b |= 8;
                                    this.f26788f = gVar;
                                }
                            } else if (iN == 32) {
                                if ((i10 & 16) != 16) {
                                    this.f26789g = new ArrayList();
                                    i10 |= 16;
                                }
                                this.f26789g.add(Integer.valueOf(fVar.k()));
                            } else if (iN == 34) {
                                int iD = fVar.d(fVar.k());
                                if ((i10 & 16) != 16 && fVar.b() > 0) {
                                    this.f26789g = new ArrayList();
                                    i10 |= 16;
                                }
                                while (fVar.b() > 0) {
                                    this.f26789g.add(Integer.valueOf(fVar.k()));
                                }
                                fVar.c(iD);
                            } else if (iN == 40) {
                                if ((i10 & 32) != 32) {
                                    this.f26791i = new ArrayList();
                                    i10 |= 32;
                                }
                                this.f26791i.add(Integer.valueOf(fVar.k()));
                            } else if (iN == 42) {
                                int iD2 = fVar.d(fVar.k());
                                if ((i10 & 32) != 32 && fVar.b() > 0) {
                                    this.f26791i = new ArrayList();
                                    i10 |= 32;
                                }
                                while (fVar.b() > 0) {
                                    this.f26791i.add(Integer.valueOf(fVar.k()));
                                }
                                fVar.c(iD2);
                            } else if (iN != 50) {
                                if (!fVar.q(iN, gVarU)) {
                                }
                            } else {
                                w wVarE = fVar.e();
                                this.f26784b |= 4;
                                this.f26787e = wVarE;
                            }
                        }
                        z10 = true;
                    } catch (s e10) {
                        e10.f3972a = this;
                        throw e10;
                    }
                } catch (IOException e11) {
                    s sVar = new s(e11.getMessage());
                    sVar.f3972a = this;
                    throw sVar;
                }
            } catch (Throwable th2) {
                if ((i10 & 16) == 16) {
                    this.f26789g = Collections.unmodifiableList(this.f26789g);
                }
                if ((i10 & 32) == 32) {
                    this.f26791i = Collections.unmodifiableList(this.f26791i);
                }
                try {
                    gVarU.m();
                } catch (IOException unused) {
                } catch (Throwable th3) {
                    this.f26783a = dVar.i();
                    throw th3;
                }
                this.f26783a = dVar.i();
                throw th2;
            }
        }
        if ((i10 & 16) == 16) {
            this.f26789g = Collections.unmodifiableList(this.f26789g);
        }
        if ((i10 & 32) == 32) {
            this.f26791i = Collections.unmodifiableList(this.f26791i);
        }
        try {
            gVarU.m();
        } catch (IOException unused2) {
        } catch (Throwable th4) {
            this.f26783a = dVar.i();
            throw th4;
        }
        this.f26783a = dVar.i();
    }

    public h(f fVar) {
        this.f26790h = -1;
        this.f26792j = -1;
        this.f26793k = (byte) -1;
        this.f26794l = -1;
        this.f26783a = fVar.f3948a;
    }
}
