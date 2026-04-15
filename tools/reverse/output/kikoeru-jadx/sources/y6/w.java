package y6;

import m7.k0;
import q.t0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class w implements f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f25845a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p4.r f25846b = new p4.r(new byte[10], 10);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f25847c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f25848d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public p4.y f25849e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f25850f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f25851g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f25852h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f25853i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f25854j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f25855k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f25856l;

    public w(h hVar) {
        this.f25845a = hVar;
    }

    @Override // y6.f0
    public final void a() {
        this.f25847c = 0;
        this.f25848d = 0;
        this.f25852h = false;
        this.f25845a.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // y6.f0
    public final void b(int i10, p4.s sVar) {
        int i11;
        p4.c.j(this.f25849e);
        int i12 = i10 & 1;
        h hVar = this.f25845a;
        int i13 = 2;
        ?? r82 = 0;
        if (i12 != 0) {
            int i14 = this.f25847c;
            if (i14 != 0 && i14 != 1) {
                if (i14 == 2) {
                    p4.c.B("PesReader", "Unexpected start indicator reading extended header");
                } else {
                    if (i14 != 3) {
                        throw new IllegalStateException();
                    }
                    if (this.f25854j != -1) {
                        p4.c.B("PesReader", "Unexpected start indicator: expected " + this.f25854j + " more bytes");
                    }
                    hVar.d(sVar.f16613c == 0);
                }
            }
            this.f25847c = 1;
            this.f25848d = 0;
        }
        int i15 = i10;
        while (sVar.a() > 0) {
            int i16 = this.f25847c;
            if (i16 != 0) {
                p4.r rVar = this.f25846b;
                if (i16 != 1) {
                    if (i16 == i13) {
                        if (d(sVar, rVar.f16606d, Math.min(10, this.f25853i)) && d(sVar, null, this.f25853i)) {
                            rVar.q(r82);
                            this.f25856l = -9223372036854775807L;
                            if (this.f25850f) {
                                rVar.t(4);
                                long jI = ((long) rVar.i(3)) << 30;
                                rVar.t(1);
                                long jI2 = ((long) (rVar.i(15) << 15)) | jI;
                                rVar.t(1);
                                long jI3 = jI2 | ((long) rVar.i(15));
                                rVar.t(1);
                                if (!this.f25852h && this.f25851g) {
                                    rVar.t(4);
                                    long jI4 = ((long) rVar.i(3)) << 30;
                                    rVar.t(1);
                                    long jI5 = jI4 | ((long) (rVar.i(15) << 15));
                                    rVar.t(1);
                                    long jI6 = jI5 | ((long) rVar.i(15));
                                    rVar.t(1);
                                    this.f25849e.b(jI6);
                                    this.f25852h = true;
                                }
                                this.f25856l = this.f25849e.b(jI3);
                            }
                            i15 |= this.f25855k ? 4 : 0;
                            hVar.e(i15, this.f25856l);
                            this.f25847c = 3;
                            this.f25848d = 0;
                        }
                    } else {
                        if (i16 != 3) {
                            throw new IllegalStateException();
                        }
                        int iA = sVar.a();
                        int i17 = this.f25854j;
                        int i18 = i17 == -1 ? 0 : iA - i17;
                        if (i18 > 0) {
                            iA -= i18;
                            sVar.F(sVar.f16612b + iA);
                        }
                        hVar.b(sVar);
                        int i19 = this.f25854j;
                        if (i19 != -1) {
                            int i20 = i19 - iA;
                            this.f25854j = i20;
                            if (i20 == 0) {
                                hVar.d(r82);
                                this.f25847c = 1;
                                this.f25848d = r82;
                            }
                        }
                    }
                } else if (d(sVar, rVar.f16606d, 9)) {
                    rVar.q(0);
                    int i21 = rVar.i(24);
                    if (i21 != 1) {
                        t0.J(i21, "Unexpected start code prefix: ", "PesReader");
                        this.f25854j = -1;
                        i11 = 0;
                    } else {
                        rVar.t(8);
                        int i22 = rVar.i(16);
                        rVar.t(5);
                        this.f25855k = rVar.h();
                        rVar.t(2);
                        this.f25850f = rVar.h();
                        this.f25851g = rVar.h();
                        rVar.t(6);
                        int i23 = rVar.i(8);
                        this.f25853i = i23;
                        if (i22 == 0) {
                            this.f25854j = -1;
                        } else {
                            int i24 = (i22 - 3) - i23;
                            this.f25854j = i24;
                            if (i24 < 0) {
                                p4.c.B("PesReader", "Found negative packet payload size: " + this.f25854j);
                                this.f25854j = -1;
                            }
                        }
                        i11 = 2;
                    }
                    this.f25847c = i11;
                    this.f25848d = 0;
                }
            } else {
                sVar.H(sVar.a());
            }
            i13 = 2;
            r82 = 0;
        }
    }

    @Override // y6.f0
    public final void c(p4.y yVar, r5.q qVar, k0 k0Var) {
        this.f25849e = yVar;
        this.f25845a.c(qVar, k0Var);
    }

    public final boolean d(p4.s sVar, byte[] bArr, int i10) {
        int iMin = Math.min(sVar.a(), i10 - this.f25848d);
        if (iMin <= 0) {
            return true;
        }
        if (bArr == null) {
            sVar.H(iMin);
        } else {
            sVar.e(bArr, this.f25848d, iMin);
        }
        int i11 = this.f25848d + iMin;
        this.f25848d = i11;
        return i11 == i10;
    }
}
