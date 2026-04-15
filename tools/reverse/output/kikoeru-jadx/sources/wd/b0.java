package wd;

import java.io.IOException;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class b0 extends ce.m {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final b0 f23548y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final a f23549z = new a(10);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ce.e f23550b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f23551c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f23552d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f23553e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f23554f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public t0 f23555g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f23556h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public List f23557i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public t0 f23558j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f23559k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public List f23560l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public List f23561m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f23562n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public List f23563o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public List f23564p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public z0 f23565q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public List f23566r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public p f23567s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public List f23568t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public List f23569u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public List f23570v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public byte f23571w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f23572x;

    static {
        b0 b0Var = new b0();
        f23548y = b0Var;
        b0Var.p();
    }

    public b0(a0 a0Var) {
        super(a0Var);
        this.f23562n = -1;
        this.f23571w = (byte) -1;
        this.f23572x = -1;
        this.f23550b = a0Var.f3948a;
    }

    @Override // ce.x
    public final ce.b a() {
        return f23548y;
    }

    @Override // ce.x
    public final boolean b() {
        byte b10 = this.f23571w;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        int i10 = this.f23551c;
        if ((i10 & 4) != 4) {
            this.f23571w = (byte) 0;
            return false;
        }
        if ((i10 & 8) == 8 && !this.f23555g.b()) {
            this.f23571w = (byte) 0;
            return false;
        }
        for (int i11 = 0; i11 < this.f23557i.size(); i11++) {
            if (!((y0) this.f23557i.get(i11)).b()) {
                this.f23571w = (byte) 0;
                return false;
            }
        }
        if ((this.f23551c & 32) == 32 && !this.f23558j.b()) {
            this.f23571w = (byte) 0;
            return false;
        }
        for (int i12 = 0; i12 < this.f23560l.size(); i12++) {
            if (!((t0) this.f23560l.get(i12)).b()) {
                this.f23571w = (byte) 0;
                return false;
            }
        }
        for (int i13 = 0; i13 < this.f23563o.size(); i13++) {
            if (!((b1) this.f23563o.get(i13)).b()) {
                this.f23571w = (byte) 0;
                return false;
            }
        }
        for (int i14 = 0; i14 < this.f23564p.size(); i14++) {
            if (!((b1) this.f23564p.get(i14)).b()) {
                this.f23571w = (byte) 0;
                return false;
            }
        }
        if ((this.f23551c & 128) == 128 && !this.f23565q.b()) {
            this.f23571w = (byte) 0;
            return false;
        }
        if ((this.f23551c & 256) == 256 && !this.f23567s.b()) {
            this.f23571w = (byte) 0;
            return false;
        }
        for (int i15 = 0; i15 < this.f23568t.size(); i15++) {
            if (!((l) this.f23568t.get(i15)).b()) {
                this.f23571w = (byte) 0;
                return false;
            }
        }
        for (int i16 = 0; i16 < this.f23569u.size(); i16++) {
            if (!((h) this.f23569u.get(i16)).b()) {
                this.f23571w = (byte) 0;
                return false;
            }
        }
        for (int i17 = 0; i17 < this.f23570v.size(); i17++) {
            if (!((h) this.f23570v.get(i17)).b()) {
                this.f23571w = (byte) 0;
                return false;
            }
        }
        if (i()) {
            this.f23571w = (byte) 1;
            return true;
        }
        this.f23571w = (byte) 0;
        return false;
    }

    @Override // ce.b
    public final int c() {
        int i10 = this.f23572x;
        if (i10 != -1) {
            return i10;
        }
        int iE = (this.f23551c & 2) == 2 ? ce.g.e(1, this.f23553e) : 0;
        if ((this.f23551c & 4) == 4) {
            iE += ce.g.e(2, this.f23554f);
        }
        if ((this.f23551c & 8) == 8) {
            iE += ce.g.g(3, this.f23555g);
        }
        for (int i11 = 0; i11 < this.f23557i.size(); i11++) {
            iE += ce.g.g(4, (ce.b) this.f23557i.get(i11));
        }
        if ((this.f23551c & 32) == 32) {
            iE += ce.g.g(5, this.f23558j);
        }
        for (int i12 = 0; i12 < this.f23564p.size(); i12++) {
            iE += ce.g.g(6, (ce.b) this.f23564p.get(i12));
        }
        if ((this.f23551c & 16) == 16) {
            iE += ce.g.e(7, this.f23556h);
        }
        if ((this.f23551c & 64) == 64) {
            iE += ce.g.e(8, this.f23559k);
        }
        if ((this.f23551c & 1) == 1) {
            iE += ce.g.e(9, this.f23552d);
        }
        for (int i13 = 0; i13 < this.f23560l.size(); i13++) {
            iE += ce.g.g(10, (ce.b) this.f23560l.get(i13));
        }
        int iF = 0;
        for (int i14 = 0; i14 < this.f23561m.size(); i14++) {
            iF += ce.g.f(((Integer) this.f23561m.get(i14)).intValue());
        }
        int iG = iE + iF;
        if (!this.f23561m.isEmpty()) {
            iG = iG + 1 + ce.g.f(iF);
        }
        this.f23562n = iF;
        for (int i15 = 0; i15 < this.f23569u.size(); i15++) {
            iG += ce.g.g(12, (ce.b) this.f23569u.get(i15));
        }
        for (int i16 = 0; i16 < this.f23563o.size(); i16++) {
            iG += ce.g.g(13, (ce.b) this.f23563o.get(i16));
        }
        if ((this.f23551c & 128) == 128) {
            iG += ce.g.g(30, this.f23565q);
        }
        int iF2 = 0;
        for (int i17 = 0; i17 < this.f23566r.size(); i17++) {
            iF2 += ce.g.f(((Integer) this.f23566r.get(i17)).intValue());
        }
        int size = (this.f23566r.size() * 2) + iG + iF2;
        if ((this.f23551c & 256) == 256) {
            size += ce.g.g(32, this.f23567s);
        }
        for (int i18 = 0; i18 < this.f23568t.size(); i18++) {
            size += ce.g.g(33, (ce.b) this.f23568t.get(i18));
        }
        for (int i19 = 0; i19 < this.f23570v.size(); i19++) {
            size += ce.g.g(34, (ce.b) this.f23570v.get(i19));
        }
        int size2 = this.f23550b.size() + j() + size;
        this.f23572x = size2;
        return size2;
    }

    @Override // ce.b
    public final ce.k d() {
        return a0.h();
    }

    @Override // ce.b
    public final ce.k e() {
        a0 a0VarH = a0.h();
        a0VarH.i(this);
        return a0VarH;
    }

    @Override // ce.b
    public final void f(ce.g gVar) throws IOException {
        c();
        androidx.media3.exoplayer.offline.u uVar = new androidx.media3.exoplayer.offline.u(this);
        if ((this.f23551c & 2) == 2) {
            gVar.F(1, this.f23553e);
        }
        if ((this.f23551c & 4) == 4) {
            gVar.F(2, this.f23554f);
        }
        if ((this.f23551c & 8) == 8) {
            gVar.H(3, this.f23555g);
        }
        for (int i10 = 0; i10 < this.f23557i.size(); i10++) {
            gVar.H(4, (ce.b) this.f23557i.get(i10));
        }
        if ((this.f23551c & 32) == 32) {
            gVar.H(5, this.f23558j);
        }
        for (int i11 = 0; i11 < this.f23564p.size(); i11++) {
            gVar.H(6, (ce.b) this.f23564p.get(i11));
        }
        if ((this.f23551c & 16) == 16) {
            gVar.F(7, this.f23556h);
        }
        if ((this.f23551c & 64) == 64) {
            gVar.F(8, this.f23559k);
        }
        if ((this.f23551c & 1) == 1) {
            gVar.F(9, this.f23552d);
        }
        for (int i12 = 0; i12 < this.f23560l.size(); i12++) {
            gVar.H(10, (ce.b) this.f23560l.get(i12));
        }
        if (this.f23561m.size() > 0) {
            gVar.O(90);
            gVar.O(this.f23562n);
        }
        for (int i13 = 0; i13 < this.f23561m.size(); i13++) {
            gVar.G(((Integer) this.f23561m.get(i13)).intValue());
        }
        for (int i14 = 0; i14 < this.f23569u.size(); i14++) {
            gVar.H(12, (ce.b) this.f23569u.get(i14));
        }
        for (int i15 = 0; i15 < this.f23563o.size(); i15++) {
            gVar.H(13, (ce.b) this.f23563o.get(i15));
        }
        if ((this.f23551c & 128) == 128) {
            gVar.H(30, this.f23565q);
        }
        for (int i16 = 0; i16 < this.f23566r.size(); i16++) {
            gVar.F(31, ((Integer) this.f23566r.get(i16)).intValue());
        }
        if ((this.f23551c & 256) == 256) {
            gVar.H(32, this.f23567s);
        }
        for (int i17 = 0; i17 < this.f23568t.size(); i17++) {
            gVar.H(33, (ce.b) this.f23568t.get(i17));
        }
        for (int i18 = 0; i18 < this.f23570v.size(); i18++) {
            gVar.H(34, (ce.b) this.f23570v.get(i18));
        }
        uVar.e1(19000, gVar);
        gVar.K(this.f23550b);
    }

    public final void p() {
        this.f23552d = 6;
        this.f23553e = 6;
        this.f23554f = 0;
        t0 t0Var = t0.f23947t;
        this.f23555g = t0Var;
        this.f23556h = 0;
        List list = Collections.EMPTY_LIST;
        this.f23557i = list;
        this.f23558j = t0Var;
        this.f23559k = 0;
        this.f23560l = list;
        this.f23561m = list;
        this.f23563o = list;
        this.f23564p = list;
        this.f23565q = z0.f24067g;
        this.f23566r = list;
        this.f23567s = p.f23885e;
        this.f23568t = list;
        this.f23569u = list;
        this.f23570v = list;
    }

    public b0() {
        this.f23562n = -1;
        this.f23571w = (byte) -1;
        this.f23572x = -1;
        this.f23550b = ce.e.f3915a;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0335  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0341  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x034d  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0359  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0365  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0371  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x037d  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x038c  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x039a  */
    /* JADX WARN: Type inference failed for: r11v19, types: [wd.s0] */
    /* JADX WARN: Type inference failed for: r11v52, types: [wd.g] */
    /* JADX WARN: Type inference failed for: r11v9, types: [wd.s0] */
    /* JADX WARN: Type inference failed for: r12v33, types: [wd.o] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public b0(ce.f r22, ce.i r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1176
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: wd.b0.<init>(ce.f, ce.i):void");
    }
}
