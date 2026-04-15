package wd;

import java.io.IOException;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class k extends ce.m {
    public static final k G;
    public static final a H = new a(3);
    public z0 A;
    public List B;
    public g1 C;
    public List D;
    public byte E;
    public int F;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ce.e f23802b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f23803c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f23804d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f23805e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f23806f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public List f23807g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public List f23808h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public List f23809i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f23810j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public List f23811k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f23812l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public List f23813m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public List f23814n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f23815o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public List f23816p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public List f23817q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public List f23818r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public List f23819s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public List f23820t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public List f23821u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f23822v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f23823w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public t0 f23824x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f23825y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public List f23826z;

    static {
        k kVar = new k();
        G = kVar;
        kVar.p();
    }

    public k(i iVar) {
        super(iVar);
        this.f23810j = -1;
        this.f23812l = -1;
        this.f23815o = -1;
        this.f23822v = -1;
        this.E = (byte) -1;
        this.F = -1;
        this.f23802b = iVar.f3948a;
    }

    @Override // ce.x
    public final ce.b a() {
        return G;
    }

    @Override // ce.x
    public final boolean b() {
        byte b10 = this.E;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        if ((this.f23803c & 2) != 2) {
            this.E = (byte) 0;
            return false;
        }
        for (int i10 = 0; i10 < this.f23807g.size(); i10++) {
            if (!((y0) this.f23807g.get(i10)).b()) {
                this.E = (byte) 0;
                return false;
            }
        }
        for (int i11 = 0; i11 < this.f23808h.size(); i11++) {
            if (!((t0) this.f23808h.get(i11)).b()) {
                this.E = (byte) 0;
                return false;
            }
        }
        for (int i12 = 0; i12 < this.f23813m.size(); i12++) {
            if (!((t0) this.f23813m.get(i12)).b()) {
                this.E = (byte) 0;
                return false;
            }
        }
        for (int i13 = 0; i13 < this.f23816p.size(); i13++) {
            if (!((n) this.f23816p.get(i13)).b()) {
                this.E = (byte) 0;
                return false;
            }
        }
        for (int i14 = 0; i14 < this.f23817q.size(); i14++) {
            if (!((b0) this.f23817q.get(i14)).b()) {
                this.E = (byte) 0;
                return false;
            }
        }
        for (int i15 = 0; i15 < this.f23818r.size(); i15++) {
            if (!((j0) this.f23818r.get(i15)).b()) {
                this.E = (byte) 0;
                return false;
            }
        }
        for (int i16 = 0; i16 < this.f23819s.size(); i16++) {
            if (!((v0) this.f23819s.get(i16)).b()) {
                this.E = (byte) 0;
                return false;
            }
        }
        for (int i17 = 0; i17 < this.f23820t.size(); i17++) {
            if (!((w) this.f23820t.get(i17)).b()) {
                this.E = (byte) 0;
                return false;
            }
        }
        if ((this.f23803c & 16) == 16 && !this.f23824x.b()) {
            this.E = (byte) 0;
            return false;
        }
        for (int i18 = 0; i18 < this.f23826z.size(); i18++) {
            if (!((h) this.f23826z.get(i18)).b()) {
                this.E = (byte) 0;
                return false;
            }
        }
        if ((this.f23803c & 64) == 64 && !this.A.b()) {
            this.E = (byte) 0;
            return false;
        }
        for (int i19 = 0; i19 < this.D.size(); i19++) {
            if (!((l) this.D.get(i19)).b()) {
                this.E = (byte) 0;
                return false;
            }
        }
        if (i()) {
            this.E = (byte) 1;
            return true;
        }
        this.E = (byte) 0;
        return false;
    }

    @Override // ce.b
    public final int c() {
        int i10 = this.F;
        if (i10 != -1) {
            return i10;
        }
        int iE = (this.f23803c & 1) == 1 ? ce.g.e(1, this.f23804d) : 0;
        int iF = 0;
        for (int i11 = 0; i11 < this.f23809i.size(); i11++) {
            iF += ce.g.f(((Integer) this.f23809i.get(i11)).intValue());
        }
        int iG = iE + iF;
        if (!this.f23809i.isEmpty()) {
            iG = iG + 1 + ce.g.f(iF);
        }
        this.f23810j = iF;
        if ((this.f23803c & 2) == 2) {
            iG += ce.g.e(3, this.f23805e);
        }
        if ((this.f23803c & 4) == 4) {
            iG += ce.g.e(4, this.f23806f);
        }
        for (int i12 = 0; i12 < this.f23807g.size(); i12++) {
            iG += ce.g.g(5, (ce.b) this.f23807g.get(i12));
        }
        for (int i13 = 0; i13 < this.f23808h.size(); i13++) {
            iG += ce.g.g(6, (ce.b) this.f23808h.get(i13));
        }
        int iF2 = 0;
        for (int i14 = 0; i14 < this.f23811k.size(); i14++) {
            iF2 += ce.g.f(((Integer) this.f23811k.get(i14)).intValue());
        }
        int iG2 = iG + iF2;
        if (!this.f23811k.isEmpty()) {
            iG2 = iG2 + 1 + ce.g.f(iF2);
        }
        this.f23812l = iF2;
        for (int i15 = 0; i15 < this.f23816p.size(); i15++) {
            iG2 += ce.g.g(8, (ce.b) this.f23816p.get(i15));
        }
        for (int i16 = 0; i16 < this.f23817q.size(); i16++) {
            iG2 += ce.g.g(9, (ce.b) this.f23817q.get(i16));
        }
        for (int i17 = 0; i17 < this.f23818r.size(); i17++) {
            iG2 += ce.g.g(10, (ce.b) this.f23818r.get(i17));
        }
        for (int i18 = 0; i18 < this.f23819s.size(); i18++) {
            iG2 += ce.g.g(11, (ce.b) this.f23819s.get(i18));
        }
        for (int i19 = 0; i19 < this.f23820t.size(); i19++) {
            iG2 += ce.g.g(13, (ce.b) this.f23820t.get(i19));
        }
        int iF3 = 0;
        for (int i20 = 0; i20 < this.f23821u.size(); i20++) {
            iF3 += ce.g.f(((Integer) this.f23821u.get(i20)).intValue());
        }
        int iG3 = iG2 + iF3;
        if (!this.f23821u.isEmpty()) {
            iG3 = iG3 + 2 + ce.g.f(iF3);
        }
        this.f23822v = iF3;
        if ((this.f23803c & 8) == 8) {
            iG3 += ce.g.e(17, this.f23823w);
        }
        if ((this.f23803c & 16) == 16) {
            iG3 += ce.g.g(18, this.f23824x);
        }
        if ((this.f23803c & 32) == 32) {
            iG3 += ce.g.e(19, this.f23825y);
        }
        for (int i21 = 0; i21 < this.f23813m.size(); i21++) {
            iG3 += ce.g.g(20, (ce.b) this.f23813m.get(i21));
        }
        int iF4 = 0;
        for (int i22 = 0; i22 < this.f23814n.size(); i22++) {
            iF4 += ce.g.f(((Integer) this.f23814n.get(i22)).intValue());
        }
        int iG4 = iG3 + iF4;
        if (!this.f23814n.isEmpty()) {
            iG4 = iG4 + 2 + ce.g.f(iF4);
        }
        this.f23815o = iF4;
        for (int i23 = 0; i23 < this.f23826z.size(); i23++) {
            iG4 += ce.g.g(25, (ce.b) this.f23826z.get(i23));
        }
        if ((this.f23803c & 64) == 64) {
            iG4 += ce.g.g(30, this.A);
        }
        int iF5 = 0;
        for (int i24 = 0; i24 < this.B.size(); i24++) {
            iF5 += ce.g.f(((Integer) this.B.get(i24)).intValue());
        }
        int size = (this.B.size() * 2) + iG4 + iF5;
        if ((this.f23803c & 128) == 128) {
            size += ce.g.g(32, this.C);
        }
        for (int i25 = 0; i25 < this.D.size(); i25++) {
            size += ce.g.g(33, (ce.b) this.D.get(i25));
        }
        int size2 = this.f23802b.size() + j() + size;
        this.F = size2;
        return size2;
    }

    @Override // ce.b
    public final ce.k d() {
        return i.h();
    }

    @Override // ce.b
    public final ce.k e() {
        i iVarH = i.h();
        iVarH.i(this);
        return iVarH;
    }

    @Override // ce.b
    public final void f(ce.g gVar) throws IOException {
        c();
        androidx.media3.exoplayer.offline.u uVar = new androidx.media3.exoplayer.offline.u(this);
        if ((this.f23803c & 1) == 1) {
            gVar.F(1, this.f23804d);
        }
        if (this.f23809i.size() > 0) {
            gVar.O(18);
            gVar.O(this.f23810j);
        }
        for (int i10 = 0; i10 < this.f23809i.size(); i10++) {
            gVar.G(((Integer) this.f23809i.get(i10)).intValue());
        }
        if ((this.f23803c & 2) == 2) {
            gVar.F(3, this.f23805e);
        }
        if ((this.f23803c & 4) == 4) {
            gVar.F(4, this.f23806f);
        }
        for (int i11 = 0; i11 < this.f23807g.size(); i11++) {
            gVar.H(5, (ce.b) this.f23807g.get(i11));
        }
        for (int i12 = 0; i12 < this.f23808h.size(); i12++) {
            gVar.H(6, (ce.b) this.f23808h.get(i12));
        }
        if (this.f23811k.size() > 0) {
            gVar.O(58);
            gVar.O(this.f23812l);
        }
        for (int i13 = 0; i13 < this.f23811k.size(); i13++) {
            gVar.G(((Integer) this.f23811k.get(i13)).intValue());
        }
        for (int i14 = 0; i14 < this.f23816p.size(); i14++) {
            gVar.H(8, (ce.b) this.f23816p.get(i14));
        }
        for (int i15 = 0; i15 < this.f23817q.size(); i15++) {
            gVar.H(9, (ce.b) this.f23817q.get(i15));
        }
        for (int i16 = 0; i16 < this.f23818r.size(); i16++) {
            gVar.H(10, (ce.b) this.f23818r.get(i16));
        }
        for (int i17 = 0; i17 < this.f23819s.size(); i17++) {
            gVar.H(11, (ce.b) this.f23819s.get(i17));
        }
        for (int i18 = 0; i18 < this.f23820t.size(); i18++) {
            gVar.H(13, (ce.b) this.f23820t.get(i18));
        }
        if (this.f23821u.size() > 0) {
            gVar.O(130);
            gVar.O(this.f23822v);
        }
        for (int i19 = 0; i19 < this.f23821u.size(); i19++) {
            gVar.G(((Integer) this.f23821u.get(i19)).intValue());
        }
        if ((this.f23803c & 8) == 8) {
            gVar.F(17, this.f23823w);
        }
        if ((this.f23803c & 16) == 16) {
            gVar.H(18, this.f23824x);
        }
        if ((this.f23803c & 32) == 32) {
            gVar.F(19, this.f23825y);
        }
        for (int i20 = 0; i20 < this.f23813m.size(); i20++) {
            gVar.H(20, (ce.b) this.f23813m.get(i20));
        }
        if (this.f23814n.size() > 0) {
            gVar.O(170);
            gVar.O(this.f23815o);
        }
        for (int i21 = 0; i21 < this.f23814n.size(); i21++) {
            gVar.G(((Integer) this.f23814n.get(i21)).intValue());
        }
        for (int i22 = 0; i22 < this.f23826z.size(); i22++) {
            gVar.H(25, (ce.b) this.f23826z.get(i22));
        }
        if ((this.f23803c & 64) == 64) {
            gVar.H(30, this.A);
        }
        for (int i23 = 0; i23 < this.B.size(); i23++) {
            gVar.F(31, ((Integer) this.B.get(i23)).intValue());
        }
        if ((this.f23803c & 128) == 128) {
            gVar.H(32, this.C);
        }
        for (int i24 = 0; i24 < this.D.size(); i24++) {
            gVar.H(33, (ce.b) this.D.get(i24));
        }
        uVar.e1(19000, gVar);
        gVar.K(this.f23802b);
    }

    public final void p() {
        this.f23804d = 6;
        this.f23805e = 0;
        this.f23806f = 0;
        List list = Collections.EMPTY_LIST;
        this.f23807g = list;
        this.f23808h = list;
        this.f23809i = list;
        this.f23811k = list;
        this.f23813m = list;
        this.f23814n = list;
        this.f23816p = list;
        this.f23817q = list;
        this.f23818r = list;
        this.f23819s = list;
        this.f23820t = list;
        this.f23821u = list;
        this.f23823w = 0;
        this.f23824x = t0.f23947t;
        this.f23825y = 0;
        this.f23826z = list;
        this.A = z0.f24067g;
        this.B = list;
        this.C = g1.f23698e;
        this.D = list;
    }

    public k() {
        this.f23810j = -1;
        this.f23812l = -1;
        this.f23815o = -1;
        this.f23822v = -1;
        this.E = (byte) -1;
        this.F = -1;
        this.f23802b = ce.e.f3915a;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public k(ce.f r22, ce.i r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1602
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: wd.k.<init>(ce.f, ce.i):void");
    }
}
