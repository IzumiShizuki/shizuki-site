package wd;

import java.io.IOException;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class j0 extends ce.m {
    public static final j0 C;
    public static final a D = new a(13);
    public byte A;
    public int B;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ce.e f23777b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f23778c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f23779d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f23780e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f23781f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public t0 f23782g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f23783h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public List f23784i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public t0 f23785j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f23786k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public List f23787l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public List f23788m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f23789n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public List f23790o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public b1 f23791p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f23792q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f23793r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public List f23794s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public List f23795t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public List f23796u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public List f23797v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public List f23798w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public List f23799x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public List f23800y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public List f23801z;

    static {
        j0 j0Var = new j0();
        C = j0Var;
        j0Var.p();
    }

    public j0(i0 i0Var) {
        super(i0Var);
        this.f23789n = -1;
        this.A = (byte) -1;
        this.B = -1;
        this.f23777b = i0Var.f3948a;
    }

    @Override // ce.x
    public final ce.b a() {
        return C;
    }

    @Override // ce.x
    public final boolean b() {
        byte b10 = this.A;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        int i10 = this.f23778c;
        if ((i10 & 4) != 4) {
            this.A = (byte) 0;
            return false;
        }
        if ((i10 & 8) == 8 && !this.f23782g.b()) {
            this.A = (byte) 0;
            return false;
        }
        for (int i11 = 0; i11 < this.f23784i.size(); i11++) {
            if (!((y0) this.f23784i.get(i11)).b()) {
                this.A = (byte) 0;
                return false;
            }
        }
        if ((this.f23778c & 32) == 32 && !this.f23785j.b()) {
            this.A = (byte) 0;
            return false;
        }
        for (int i12 = 0; i12 < this.f23787l.size(); i12++) {
            if (!((t0) this.f23787l.get(i12)).b()) {
                this.A = (byte) 0;
                return false;
            }
        }
        for (int i13 = 0; i13 < this.f23790o.size(); i13++) {
            if (!((b1) this.f23790o.get(i13)).b()) {
                this.A = (byte) 0;
                return false;
            }
        }
        if ((this.f23778c & 128) == 128 && !this.f23791p.b()) {
            this.A = (byte) 0;
            return false;
        }
        for (int i14 = 0; i14 < this.f23795t.size(); i14++) {
            if (!((l) this.f23795t.get(i14)).b()) {
                this.A = (byte) 0;
                return false;
            }
        }
        for (int i15 = 0; i15 < this.f23796u.size(); i15++) {
            if (!((h) this.f23796u.get(i15)).b()) {
                this.A = (byte) 0;
                return false;
            }
        }
        for (int i16 = 0; i16 < this.f23797v.size(); i16++) {
            if (!((h) this.f23797v.get(i16)).b()) {
                this.A = (byte) 0;
                return false;
            }
        }
        for (int i17 = 0; i17 < this.f23798w.size(); i17++) {
            if (!((h) this.f23798w.get(i17)).b()) {
                this.A = (byte) 0;
                return false;
            }
        }
        for (int i18 = 0; i18 < this.f23799x.size(); i18++) {
            if (!((h) this.f23799x.get(i18)).b()) {
                this.A = (byte) 0;
                return false;
            }
        }
        for (int i19 = 0; i19 < this.f23800y.size(); i19++) {
            if (!((h) this.f23800y.get(i19)).b()) {
                this.A = (byte) 0;
                return false;
            }
        }
        for (int i20 = 0; i20 < this.f23801z.size(); i20++) {
            if (!((h) this.f23801z.get(i20)).b()) {
                this.A = (byte) 0;
                return false;
            }
        }
        if (i()) {
            this.A = (byte) 1;
            return true;
        }
        this.A = (byte) 0;
        return false;
    }

    @Override // ce.b
    public final int c() {
        int i10 = this.B;
        if (i10 != -1) {
            return i10;
        }
        int iE = (this.f23778c & 2) == 2 ? ce.g.e(1, this.f23780e) : 0;
        if ((this.f23778c & 4) == 4) {
            iE += ce.g.e(2, this.f23781f);
        }
        if ((this.f23778c & 8) == 8) {
            iE += ce.g.g(3, this.f23782g);
        }
        for (int i11 = 0; i11 < this.f23784i.size(); i11++) {
            iE += ce.g.g(4, (ce.b) this.f23784i.get(i11));
        }
        if ((this.f23778c & 32) == 32) {
            iE += ce.g.g(5, this.f23785j);
        }
        if ((this.f23778c & 128) == 128) {
            iE += ce.g.g(6, this.f23791p);
        }
        if ((this.f23778c & 256) == 256) {
            iE += ce.g.e(7, this.f23792q);
        }
        if ((this.f23778c & 512) == 512) {
            iE += ce.g.e(8, this.f23793r);
        }
        if ((this.f23778c & 16) == 16) {
            iE += ce.g.e(9, this.f23783h);
        }
        if ((this.f23778c & 64) == 64) {
            iE += ce.g.e(10, this.f23786k);
        }
        if ((this.f23778c & 1) == 1) {
            iE += ce.g.e(11, this.f23779d);
        }
        for (int i12 = 0; i12 < this.f23787l.size(); i12++) {
            iE += ce.g.g(12, (ce.b) this.f23787l.get(i12));
        }
        int iF = 0;
        for (int i13 = 0; i13 < this.f23788m.size(); i13++) {
            iF += ce.g.f(((Integer) this.f23788m.get(i13)).intValue());
        }
        int iG = iE + iF;
        if (!this.f23788m.isEmpty()) {
            iG = iG + 1 + ce.g.f(iF);
        }
        this.f23789n = iF;
        for (int i14 = 0; i14 < this.f23796u.size(); i14++) {
            iG += ce.g.g(14, (ce.b) this.f23796u.get(i14));
        }
        for (int i15 = 0; i15 < this.f23797v.size(); i15++) {
            iG += ce.g.g(15, (ce.b) this.f23797v.get(i15));
        }
        for (int i16 = 0; i16 < this.f23798w.size(); i16++) {
            iG += ce.g.g(16, (ce.b) this.f23798w.get(i16));
        }
        for (int i17 = 0; i17 < this.f23790o.size(); i17++) {
            iG += ce.g.g(17, (ce.b) this.f23790o.get(i17));
        }
        int iF2 = 0;
        for (int i18 = 0; i18 < this.f23794s.size(); i18++) {
            iF2 += ce.g.f(((Integer) this.f23794s.get(i18)).intValue());
        }
        int size = (this.f23794s.size() * 2) + iG + iF2;
        for (int i19 = 0; i19 < this.f23795t.size(); i19++) {
            size += ce.g.g(32, (ce.b) this.f23795t.get(i19));
        }
        for (int i20 = 0; i20 < this.f23799x.size(); i20++) {
            size += ce.g.g(33, (ce.b) this.f23799x.get(i20));
        }
        for (int i21 = 0; i21 < this.f23800y.size(); i21++) {
            size += ce.g.g(34, (ce.b) this.f23800y.get(i21));
        }
        for (int i22 = 0; i22 < this.f23801z.size(); i22++) {
            size += ce.g.g(35, (ce.b) this.f23801z.get(i22));
        }
        int size2 = this.f23777b.size() + j() + size;
        this.B = size2;
        return size2;
    }

    @Override // ce.b
    public final ce.k d() {
        return i0.h();
    }

    @Override // ce.b
    public final ce.k e() {
        i0 i0VarH = i0.h();
        i0VarH.i(this);
        return i0VarH;
    }

    @Override // ce.b
    public final void f(ce.g gVar) throws IOException {
        c();
        androidx.media3.exoplayer.offline.u uVar = new androidx.media3.exoplayer.offline.u(this);
        if ((this.f23778c & 2) == 2) {
            gVar.F(1, this.f23780e);
        }
        if ((this.f23778c & 4) == 4) {
            gVar.F(2, this.f23781f);
        }
        if ((this.f23778c & 8) == 8) {
            gVar.H(3, this.f23782g);
        }
        for (int i10 = 0; i10 < this.f23784i.size(); i10++) {
            gVar.H(4, (ce.b) this.f23784i.get(i10));
        }
        if ((this.f23778c & 32) == 32) {
            gVar.H(5, this.f23785j);
        }
        if ((this.f23778c & 128) == 128) {
            gVar.H(6, this.f23791p);
        }
        if ((this.f23778c & 256) == 256) {
            gVar.F(7, this.f23792q);
        }
        if ((this.f23778c & 512) == 512) {
            gVar.F(8, this.f23793r);
        }
        if ((this.f23778c & 16) == 16) {
            gVar.F(9, this.f23783h);
        }
        if ((this.f23778c & 64) == 64) {
            gVar.F(10, this.f23786k);
        }
        if ((this.f23778c & 1) == 1) {
            gVar.F(11, this.f23779d);
        }
        for (int i11 = 0; i11 < this.f23787l.size(); i11++) {
            gVar.H(12, (ce.b) this.f23787l.get(i11));
        }
        if (this.f23788m.size() > 0) {
            gVar.O(106);
            gVar.O(this.f23789n);
        }
        for (int i12 = 0; i12 < this.f23788m.size(); i12++) {
            gVar.G(((Integer) this.f23788m.get(i12)).intValue());
        }
        for (int i13 = 0; i13 < this.f23796u.size(); i13++) {
            gVar.H(14, (ce.b) this.f23796u.get(i13));
        }
        for (int i14 = 0; i14 < this.f23797v.size(); i14++) {
            gVar.H(15, (ce.b) this.f23797v.get(i14));
        }
        for (int i15 = 0; i15 < this.f23798w.size(); i15++) {
            gVar.H(16, (ce.b) this.f23798w.get(i15));
        }
        for (int i16 = 0; i16 < this.f23790o.size(); i16++) {
            gVar.H(17, (ce.b) this.f23790o.get(i16));
        }
        for (int i17 = 0; i17 < this.f23794s.size(); i17++) {
            gVar.F(31, ((Integer) this.f23794s.get(i17)).intValue());
        }
        for (int i18 = 0; i18 < this.f23795t.size(); i18++) {
            gVar.H(32, (ce.b) this.f23795t.get(i18));
        }
        for (int i19 = 0; i19 < this.f23799x.size(); i19++) {
            gVar.H(33, (ce.b) this.f23799x.get(i19));
        }
        for (int i20 = 0; i20 < this.f23800y.size(); i20++) {
            gVar.H(34, (ce.b) this.f23800y.get(i20));
        }
        for (int i21 = 0; i21 < this.f23801z.size(); i21++) {
            gVar.H(35, (ce.b) this.f23801z.get(i21));
        }
        uVar.e1(19000, gVar);
        gVar.K(this.f23777b);
    }

    public final void p() {
        this.f23779d = 518;
        this.f23780e = 2054;
        this.f23781f = 0;
        t0 t0Var = t0.f23947t;
        this.f23782g = t0Var;
        this.f23783h = 0;
        List list = Collections.EMPTY_LIST;
        this.f23784i = list;
        this.f23785j = t0Var;
        this.f23786k = 0;
        this.f23787l = list;
        this.f23788m = list;
        this.f23790o = list;
        this.f23791p = b1.f23573n;
        this.f23792q = 0;
        this.f23793r = 0;
        this.f23794s = list;
        this.f23795t = list;
        this.f23796u = list;
        this.f23797v = list;
        this.f23798w = list;
        this.f23799x = list;
        this.f23800y = list;
        this.f23801z = list;
    }

    public j0() {
        this.f23789n = -1;
        this.A = (byte) -1;
        this.B = -1;
        this.f23777b = ce.e.f3915a;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:136:0x036d  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x037b  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0389  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0397  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x03a3  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x03af  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x03bb  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x03c7  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x03d3  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x03df  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x03ed  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x03fb  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0046  */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r8v19, types: [wd.s0] */
    /* JADX WARN: Type inference failed for: r8v26, types: [wd.a1] */
    /* JADX WARN: Type inference failed for: r8v9, types: [wd.s0] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public j0(ce.f r23, ce.i r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1330
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: wd.j0.<init>(ce.f, ce.i):void");
    }
}
