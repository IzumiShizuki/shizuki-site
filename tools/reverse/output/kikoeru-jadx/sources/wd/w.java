package wd;

import com.tencent.bugly.beta.tinker.TinkerReport;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class w extends ce.m {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final w f24008h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final a f24009i = new a(8);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ce.e f24010b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f24011c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f24012d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public List f24013e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public byte f24014f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f24015g;

    static {
        w wVar = new w();
        f24008h = wVar;
        wVar.f24012d = 0;
        wVar.f24013e = Collections.EMPTY_LIST;
    }

    public w(v vVar) {
        super(vVar);
        this.f24014f = (byte) -1;
        this.f24015g = -1;
        this.f24010b = vVar.f3948a;
    }

    @Override // ce.x
    public final ce.b a() {
        return f24008h;
    }

    @Override // ce.x
    public final boolean b() {
        byte b10 = this.f24014f;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        for (int i10 = 0; i10 < this.f24013e.size(); i10++) {
            if (!((h) this.f24013e.get(i10)).b()) {
                this.f24014f = (byte) 0;
                return false;
            }
        }
        if (i()) {
            this.f24014f = (byte) 1;
            return true;
        }
        this.f24014f = (byte) 0;
        return false;
    }

    @Override // ce.b
    public final int c() {
        int i10 = this.f24015g;
        if (i10 != -1) {
            return i10;
        }
        int iE = (this.f24011c & 1) == 1 ? ce.g.e(1, this.f24012d) : 0;
        for (int i11 = 0; i11 < this.f24013e.size(); i11++) {
            iE += ce.g.g(2, (ce.b) this.f24013e.get(i11));
        }
        int size = this.f24010b.size() + j() + iE;
        this.f24015g = size;
        return size;
    }

    @Override // ce.b
    public final ce.k d() {
        v vVar = new v();
        vVar.f23991f = Collections.EMPTY_LIST;
        return vVar;
    }

    @Override // ce.b
    public final ce.k e() {
        v vVar = new v();
        vVar.f23991f = Collections.EMPTY_LIST;
        vVar.h(this);
        return vVar;
    }

    @Override // ce.b
    public final void f(ce.g gVar) throws IOException {
        c();
        androidx.media3.exoplayer.offline.u uVar = new androidx.media3.exoplayer.offline.u(this);
        if ((this.f24011c & 1) == 1) {
            gVar.F(1, this.f24012d);
        }
        for (int i10 = 0; i10 < this.f24013e.size(); i10++) {
            gVar.H(2, (ce.b) this.f24013e.get(i10));
        }
        uVar.e1(TinkerReport.KEY_APPLIED_SUCC_COST_5S_LESS, gVar);
        gVar.K(this.f24010b);
    }

    public w() {
        this.f24014f = (byte) -1;
        this.f24015g = -1;
        this.f24010b = ce.e.f3915a;
    }

    public w(ce.f fVar, ce.i iVar) {
        this.f24014f = (byte) -1;
        this.f24015g = -1;
        boolean z10 = false;
        this.f24012d = 0;
        this.f24013e = Collections.EMPTY_LIST;
        ce.d dVar = new ce.d();
        ce.g gVarU = ce.g.u(dVar, 1);
        char c3 = 0;
        while (!z10) {
            try {
                try {
                    int iN = fVar.n();
                    if (iN != 0) {
                        if (iN == 8) {
                            this.f24011c |= 1;
                            this.f24012d = fVar.k();
                        } else if (iN != 18) {
                            if (!n(fVar, gVarU, iVar, iN)) {
                            }
                        } else {
                            if ((c3 & 2) != 2) {
                                this.f24013e = new ArrayList();
                                c3 = 2;
                            }
                            this.f24013e.add(fVar.g(h.f23705h, iVar));
                        }
                    }
                    z10 = true;
                } catch (Throwable th2) {
                    if ((c3 & 2) == 2) {
                        this.f24013e = Collections.unmodifiableList(this.f24013e);
                    }
                    try {
                        gVarU.m();
                    } catch (IOException unused) {
                    } catch (Throwable th3) {
                        this.f24010b = dVar.i();
                        throw th3;
                    }
                    this.f24010b = dVar.i();
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
        if ((c3 & 2) == 2) {
            this.f24013e = Collections.unmodifiableList(this.f24013e);
        }
        try {
            gVarU.m();
        } catch (IOException unused2) {
        } catch (Throwable th4) {
            this.f24010b = dVar.i();
            throw th4;
        }
        this.f24010b = dVar.i();
        m();
    }
}
