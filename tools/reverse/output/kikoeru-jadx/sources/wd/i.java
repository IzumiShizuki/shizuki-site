package wd;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class i extends ce.l {
    public List A;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f23724d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f23725e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f23726f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f23727g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public List f23728h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public List f23729i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public List f23730j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public List f23731k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public List f23732l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public List f23733m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public List f23734n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public List f23735o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public List f23736p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public List f23737q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public List f23738r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public List f23739s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f23740t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public t0 f23741u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f23742v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public List f23743w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public z0 f23744x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public List f23745y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public g1 f23746z;

    public static i h() {
        i iVar = new i();
        iVar.f23725e = 6;
        List list = Collections.EMPTY_LIST;
        iVar.f23728h = list;
        iVar.f23729i = list;
        iVar.f23730j = list;
        iVar.f23731k = list;
        iVar.f23732l = list;
        iVar.f23733m = list;
        iVar.f23734n = list;
        iVar.f23735o = list;
        iVar.f23736p = list;
        iVar.f23737q = list;
        iVar.f23738r = list;
        iVar.f23739s = list;
        iVar.f23741u = t0.f23947t;
        iVar.f23743w = list;
        iVar.f23744x = z0.f24067g;
        iVar.f23745y = list;
        iVar.f23746z = g1.f23698e;
        iVar.A = list;
        return iVar;
    }

    @Override // ce.k
    public final ce.b c() {
        k kVarG = g();
        if (kVarG.b()) {
            return kVarG;
        }
        throw new ce.j0();
    }

    public final Object clone() {
        i iVarH = h();
        iVarH.i(g());
        return iVarH;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x001b  */
    @Override // ce.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final ce.k d(ce.f r3, ce.i r4) throws java.lang.Throwable {
        /*
            r2 = this;
            r0 = 0
            wd.a r1 = wd.k.H     // Catch: java.lang.Throwable -> Lf ce.s -> L11
            r1.getClass()     // Catch: java.lang.Throwable -> Lf ce.s -> L11
            wd.k r1 = new wd.k     // Catch: java.lang.Throwable -> Lf ce.s -> L11
            r1.<init>(r3, r4)     // Catch: java.lang.Throwable -> Lf ce.s -> L11
            r2.i(r1)
            return r2
        Lf:
            r3 = move-exception
            goto L19
        L11:
            r3 = move-exception
            ce.b r4 = r3.f3972a     // Catch: java.lang.Throwable -> Lf
            wd.k r4 = (wd.k) r4     // Catch: java.lang.Throwable -> Lf
            throw r3     // Catch: java.lang.Throwable -> L17
        L17:
            r3 = move-exception
            r0 = r4
        L19:
            if (r0 == 0) goto L1e
            r2.i(r0)
        L1e:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: wd.i.d(ce.f, ce.i):ce.k");
    }

    @Override // ce.k
    public final /* bridge */ /* synthetic */ ce.k e(ce.p pVar) {
        i((k) pVar);
        return this;
    }

    public final k g() {
        k kVar = new k(this);
        int i10 = this.f23724d;
        int i11 = (i10 & 1) != 1 ? 0 : 1;
        kVar.f23804d = this.f23725e;
        if ((i10 & 2) == 2) {
            i11 |= 2;
        }
        kVar.f23805e = this.f23726f;
        if ((i10 & 4) == 4) {
            i11 |= 4;
        }
        kVar.f23806f = this.f23727g;
        if ((i10 & 8) == 8) {
            this.f23728h = Collections.unmodifiableList(this.f23728h);
            this.f23724d &= -9;
        }
        kVar.f23807g = this.f23728h;
        if ((this.f23724d & 16) == 16) {
            this.f23729i = Collections.unmodifiableList(this.f23729i);
            this.f23724d &= -17;
        }
        kVar.f23808h = this.f23729i;
        if ((this.f23724d & 32) == 32) {
            this.f23730j = Collections.unmodifiableList(this.f23730j);
            this.f23724d &= -33;
        }
        kVar.f23809i = this.f23730j;
        if ((this.f23724d & 64) == 64) {
            this.f23731k = Collections.unmodifiableList(this.f23731k);
            this.f23724d &= -65;
        }
        kVar.f23811k = this.f23731k;
        if ((this.f23724d & 128) == 128) {
            this.f23732l = Collections.unmodifiableList(this.f23732l);
            this.f23724d &= -129;
        }
        kVar.f23813m = this.f23732l;
        if ((this.f23724d & 256) == 256) {
            this.f23733m = Collections.unmodifiableList(this.f23733m);
            this.f23724d &= -257;
        }
        kVar.f23814n = this.f23733m;
        if ((this.f23724d & 512) == 512) {
            this.f23734n = Collections.unmodifiableList(this.f23734n);
            this.f23724d &= -513;
        }
        kVar.f23816p = this.f23734n;
        if ((this.f23724d & 1024) == 1024) {
            this.f23735o = Collections.unmodifiableList(this.f23735o);
            this.f23724d &= -1025;
        }
        kVar.f23817q = this.f23735o;
        if ((this.f23724d & 2048) == 2048) {
            this.f23736p = Collections.unmodifiableList(this.f23736p);
            this.f23724d &= -2049;
        }
        kVar.f23818r = this.f23736p;
        if ((this.f23724d & 4096) == 4096) {
            this.f23737q = Collections.unmodifiableList(this.f23737q);
            this.f23724d &= -4097;
        }
        kVar.f23819s = this.f23737q;
        if ((this.f23724d & 8192) == 8192) {
            this.f23738r = Collections.unmodifiableList(this.f23738r);
            this.f23724d &= -8193;
        }
        kVar.f23820t = this.f23738r;
        if ((this.f23724d & 16384) == 16384) {
            this.f23739s = Collections.unmodifiableList(this.f23739s);
            this.f23724d &= -16385;
        }
        kVar.f23821u = this.f23739s;
        if ((i10 & 32768) == 32768) {
            i11 |= 8;
        }
        kVar.f23823w = this.f23740t;
        if ((i10 & 65536) == 65536) {
            i11 |= 16;
        }
        kVar.f23824x = this.f23741u;
        if ((i10 & 131072) == 131072) {
            i11 |= 32;
        }
        kVar.f23825y = this.f23742v;
        if ((this.f23724d & 262144) == 262144) {
            this.f23743w = Collections.unmodifiableList(this.f23743w);
            this.f23724d &= -262145;
        }
        kVar.f23826z = this.f23743w;
        if ((i10 & 524288) == 524288) {
            i11 |= 64;
        }
        kVar.A = this.f23744x;
        if ((this.f23724d & 1048576) == 1048576) {
            this.f23745y = Collections.unmodifiableList(this.f23745y);
            this.f23724d &= -1048577;
        }
        kVar.B = this.f23745y;
        if ((i10 & 2097152) == 2097152) {
            i11 |= 128;
        }
        kVar.C = this.f23746z;
        if ((this.f23724d & 4194304) == 4194304) {
            this.A = Collections.unmodifiableList(this.A);
            this.f23724d &= -4194305;
        }
        kVar.D = this.A;
        kVar.f23803c = i11;
        return kVar;
    }

    public final void i(k kVar) {
        g1 g1Var;
        z0 z0Var;
        t0 t0Var;
        if (kVar == k.G) {
            return;
        }
        int i10 = kVar.f23803c;
        if ((i10 & 1) == 1) {
            int i11 = kVar.f23804d;
            this.f23724d = 1 | this.f23724d;
            this.f23725e = i11;
        }
        if ((i10 & 2) == 2) {
            int i12 = kVar.f23805e;
            this.f23724d = 2 | this.f23724d;
            this.f23726f = i12;
        }
        if ((i10 & 4) == 4) {
            int i13 = kVar.f23806f;
            this.f23724d = 4 | this.f23724d;
            this.f23727g = i13;
        }
        if (!kVar.f23807g.isEmpty()) {
            if (this.f23728h.isEmpty()) {
                this.f23728h = kVar.f23807g;
                this.f23724d &= -9;
            } else {
                if ((this.f23724d & 8) != 8) {
                    this.f23728h = new ArrayList(this.f23728h);
                    this.f23724d |= 8;
                }
                this.f23728h.addAll(kVar.f23807g);
            }
        }
        if (!kVar.f23808h.isEmpty()) {
            if (this.f23729i.isEmpty()) {
                this.f23729i = kVar.f23808h;
                this.f23724d &= -17;
            } else {
                if ((this.f23724d & 16) != 16) {
                    this.f23729i = new ArrayList(this.f23729i);
                    this.f23724d |= 16;
                }
                this.f23729i.addAll(kVar.f23808h);
            }
        }
        if (!kVar.f23809i.isEmpty()) {
            if (this.f23730j.isEmpty()) {
                this.f23730j = kVar.f23809i;
                this.f23724d &= -33;
            } else {
                if ((this.f23724d & 32) != 32) {
                    this.f23730j = new ArrayList(this.f23730j);
                    this.f23724d |= 32;
                }
                this.f23730j.addAll(kVar.f23809i);
            }
        }
        if (!kVar.f23811k.isEmpty()) {
            if (this.f23731k.isEmpty()) {
                this.f23731k = kVar.f23811k;
                this.f23724d &= -65;
            } else {
                if ((this.f23724d & 64) != 64) {
                    this.f23731k = new ArrayList(this.f23731k);
                    this.f23724d |= 64;
                }
                this.f23731k.addAll(kVar.f23811k);
            }
        }
        if (!kVar.f23813m.isEmpty()) {
            if (this.f23732l.isEmpty()) {
                this.f23732l = kVar.f23813m;
                this.f23724d &= -129;
            } else {
                if ((this.f23724d & 128) != 128) {
                    this.f23732l = new ArrayList(this.f23732l);
                    this.f23724d |= 128;
                }
                this.f23732l.addAll(kVar.f23813m);
            }
        }
        if (!kVar.f23814n.isEmpty()) {
            if (this.f23733m.isEmpty()) {
                this.f23733m = kVar.f23814n;
                this.f23724d &= -257;
            } else {
                if ((this.f23724d & 256) != 256) {
                    this.f23733m = new ArrayList(this.f23733m);
                    this.f23724d |= 256;
                }
                this.f23733m.addAll(kVar.f23814n);
            }
        }
        if (!kVar.f23816p.isEmpty()) {
            if (this.f23734n.isEmpty()) {
                this.f23734n = kVar.f23816p;
                this.f23724d &= -513;
            } else {
                if ((this.f23724d & 512) != 512) {
                    this.f23734n = new ArrayList(this.f23734n);
                    this.f23724d |= 512;
                }
                this.f23734n.addAll(kVar.f23816p);
            }
        }
        if (!kVar.f23817q.isEmpty()) {
            if (this.f23735o.isEmpty()) {
                this.f23735o = kVar.f23817q;
                this.f23724d &= -1025;
            } else {
                if ((this.f23724d & 1024) != 1024) {
                    this.f23735o = new ArrayList(this.f23735o);
                    this.f23724d |= 1024;
                }
                this.f23735o.addAll(kVar.f23817q);
            }
        }
        if (!kVar.f23818r.isEmpty()) {
            if (this.f23736p.isEmpty()) {
                this.f23736p = kVar.f23818r;
                this.f23724d &= -2049;
            } else {
                if ((this.f23724d & 2048) != 2048) {
                    this.f23736p = new ArrayList(this.f23736p);
                    this.f23724d |= 2048;
                }
                this.f23736p.addAll(kVar.f23818r);
            }
        }
        if (!kVar.f23819s.isEmpty()) {
            if (this.f23737q.isEmpty()) {
                this.f23737q = kVar.f23819s;
                this.f23724d &= -4097;
            } else {
                if ((this.f23724d & 4096) != 4096) {
                    this.f23737q = new ArrayList(this.f23737q);
                    this.f23724d |= 4096;
                }
                this.f23737q.addAll(kVar.f23819s);
            }
        }
        if (!kVar.f23820t.isEmpty()) {
            if (this.f23738r.isEmpty()) {
                this.f23738r = kVar.f23820t;
                this.f23724d &= -8193;
            } else {
                if ((this.f23724d & 8192) != 8192) {
                    this.f23738r = new ArrayList(this.f23738r);
                    this.f23724d |= 8192;
                }
                this.f23738r.addAll(kVar.f23820t);
            }
        }
        if (!kVar.f23821u.isEmpty()) {
            if (this.f23739s.isEmpty()) {
                this.f23739s = kVar.f23821u;
                this.f23724d &= -16385;
            } else {
                if ((this.f23724d & 16384) != 16384) {
                    this.f23739s = new ArrayList(this.f23739s);
                    this.f23724d |= 16384;
                }
                this.f23739s.addAll(kVar.f23821u);
            }
        }
        int i14 = kVar.f23803c;
        if ((i14 & 8) == 8) {
            int i15 = kVar.f23823w;
            this.f23724d |= 32768;
            this.f23740t = i15;
        }
        if ((i14 & 16) == 16) {
            t0 t0Var2 = kVar.f23824x;
            if ((this.f23724d & 65536) != 65536 || (t0Var = this.f23741u) == t0.f23947t) {
                this.f23741u = t0Var2;
            } else {
                s0 s0VarR = t0.r(t0Var);
                s0VarR.i(t0Var2);
                this.f23741u = s0VarR.g();
            }
            this.f23724d |= 65536;
        }
        if ((kVar.f23803c & 32) == 32) {
            int i16 = kVar.f23825y;
            this.f23724d |= 131072;
            this.f23742v = i16;
        }
        if (!kVar.f23826z.isEmpty()) {
            if (this.f23743w.isEmpty()) {
                this.f23743w = kVar.f23826z;
                this.f23724d &= -262145;
            } else {
                if ((this.f23724d & 262144) != 262144) {
                    this.f23743w = new ArrayList(this.f23743w);
                    this.f23724d |= 262144;
                }
                this.f23743w.addAll(kVar.f23826z);
            }
        }
        if ((kVar.f23803c & 64) == 64) {
            z0 z0Var2 = kVar.A;
            if ((this.f23724d & 524288) != 524288 || (z0Var = this.f23744x) == z0.f24067g) {
                this.f23744x = z0Var2;
            } else {
                g gVarI = z0.i(z0Var);
                gVarI.j(z0Var2);
                this.f23744x = gVarI.g();
            }
            this.f23724d |= 524288;
        }
        if (!kVar.B.isEmpty()) {
            if (this.f23745y.isEmpty()) {
                this.f23745y = kVar.B;
                this.f23724d &= -1048577;
            } else {
                if ((this.f23724d & 1048576) != 1048576) {
                    this.f23745y = new ArrayList(this.f23745y);
                    this.f23724d |= 1048576;
                }
                this.f23745y.addAll(kVar.B);
            }
        }
        if ((kVar.f23803c & 128) == 128) {
            g1 g1Var2 = kVar.C;
            if ((this.f23724d & 2097152) != 2097152 || (g1Var = this.f23746z) == g1.f23698e) {
                this.f23746z = g1Var2;
            } else {
                o oVar = new o(2);
                oVar.f23878d = Collections.EMPTY_LIST;
                oVar.m(g1Var);
                oVar.m(g1Var2);
                this.f23746z = oVar.i();
            }
            this.f23724d |= 2097152;
        }
        if (!kVar.D.isEmpty()) {
            if (this.A.isEmpty()) {
                this.A = kVar.D;
                this.f23724d &= -4194305;
            } else {
                if ((this.f23724d & 4194304) != 4194304) {
                    this.A = new ArrayList(this.A);
                    this.f23724d |= 4194304;
                }
                this.A.addAll(kVar.D);
            }
        }
        f(kVar);
        this.f3948a = this.f3948a.i(kVar.f23802b);
    }
}
