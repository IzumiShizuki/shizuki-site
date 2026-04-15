package k6;

import java.io.EOFException;
import java.util.List;
import m4.n0;
import p4.s;
import r5.h0;
import r5.m;
import r5.n;
import r5.o;
import r5.q;
import r5.v;
import r5.x;
import r5.z;
import ya.a1;
import ya.g0;
import ya.i0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class d implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f11125a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s f11126b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z f11127c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final v f11128d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final x f11129e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final m f11130f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public q f11131g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public h0 f11132h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public h0 f11133i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f11134j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public n0 f11135k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f11136l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f11137m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f11138n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f11139o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f11140p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public f f11141q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f11142r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f11143s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f11144t;

    public d(int i10) {
        this(-9223372036854775807L);
    }

    public final void b() {
        f fVar = this.f11141q;
        if ((fVar instanceof a) && ((a) fVar).e()) {
            long j10 = this.f11139o;
            if (j10 == -1 || j10 == this.f11141q.d()) {
                return;
            }
            a aVar = (a) this.f11141q;
            this.f11141q = new a(this.f11139o, aVar.f11117h, aVar.f11118i, aVar.f11119j, aVar.f11120k);
            q qVar = this.f11131g;
            qVar.getClass();
            qVar.a(this.f11141q);
            this.f11132h.getClass();
            this.f11141q.m();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x001b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean d(r5.o r9) {
        /*
            r8 = this;
            k6.f r0 = r8.f11141q
            r1 = 1
            if (r0 == 0) goto L1b
            long r2 = r0.d()
            r4 = -1
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 == 0) goto L1b
            long r4 = r9.j()
            r6 = 4
            long r2 = r2 - r6
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 <= 0) goto L1b
            goto L27
        L1b:
            p4.s r0 = r8.f11126b     // Catch: java.io.EOFException -> L27
            byte[] r0 = r0.f16611a     // Catch: java.io.EOFException -> L27
            r2 = 0
            r3 = 4
            boolean r9 = r9.i(r0, r2, r3, r1)     // Catch: java.io.EOFException -> L27
            r9 = r9 ^ r1
            return r9
        L27:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: k6.d.d(r5.o):boolean");
    }

    public final boolean e(o oVar, boolean z10) throws Throwable {
        int i10;
        int iJ;
        int iH;
        int i11 = z10 ? 32768 : 131072;
        oVar.q();
        if (oVar.getPosition() == 0) {
            s sVar = this.f11129e.f18893a;
            n0 n0VarV = null;
            int i12 = 0;
            while (true) {
                try {
                    oVar.z(sVar.f16611a, 0, 10);
                    sVar.G(0);
                    if (sVar.x() != 4801587) {
                        break;
                    }
                    sVar.H(3);
                    int iT = sVar.t();
                    int i13 = iT + 10;
                    if (n0VarV == null) {
                        byte[] bArr = new byte[i13];
                        System.arraycopy(sVar.f16611a, 0, bArr, 0, 10);
                        oVar.z(bArr, 10, iT);
                        n0VarV = new f6.h(null).V(bArr, i13);
                    } else {
                        oVar.k(iT);
                    }
                    i12 += i13;
                } catch (EOFException unused) {
                }
            }
            oVar.q();
            oVar.k(i12);
            this.f11135k = n0VarV;
            if (n0VarV != null) {
                this.f11128d.b(n0VarV);
            }
            iJ = (int) oVar.j();
            if (!z10) {
                oVar.r(iJ);
            }
            i10 = 0;
        } else {
            i10 = 0;
            iJ = 0;
        }
        int i14 = 0;
        int i15 = 0;
        while (true) {
            if (!d(oVar)) {
                s sVar2 = this.f11126b;
                sVar2.G(0);
                int iG = sVar2.g();
                if ((i10 == 0 || ((-128000) & iG) == (((long) i10) & (-128000))) && (iH = r5.b.h(iG)) != -1) {
                    i14++;
                    if (i14 != 1) {
                        if (i14 == 4) {
                            break;
                        }
                    } else {
                        this.f11127c.a(iG);
                        i10 = iG;
                    }
                    oVar.k(iH - 4);
                } else {
                    int i16 = i15 + 1;
                    if (i15 == i11) {
                        if (z10) {
                            return false;
                        }
                        b();
                        throw new EOFException();
                    }
                    if (z10) {
                        oVar.q();
                        oVar.k(iJ + i16);
                    } else {
                        oVar.r(1);
                    }
                    i15 = i16;
                    i10 = 0;
                    i14 = 0;
                }
            } else if (i14 <= 0) {
                b();
                throw new EOFException();
            }
        }
        if (z10) {
            oVar.r(iJ + i15);
        } else {
            oVar.q();
        }
        this.f11134j = i10;
        return true;
    }

    @Override // r5.n
    public final boolean f(o oVar) {
        return e(oVar, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0305  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0358 A[LOOP:2: B:159:0x0356->B:160:0x0358, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0387  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x038d  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0395  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x041a  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0433  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0453  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x04c1  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x04e6  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /* JADX WARN: Type inference failed for: r2v55 */
    /* JADX WARN: Type inference failed for: r2v56, types: [r5.b0] */
    /* JADX WARN: Type inference failed for: r2v57 */
    /* JADX WARN: Type inference failed for: r2v58, types: [k6.f, r5.b0] */
    /* JADX WARN: Type inference failed for: r2v78 */
    /* JADX WARN: Type inference failed for: r2v79 */
    /* JADX WARN: Type inference failed for: r30v16 */
    /* JADX WARN: Type inference failed for: r30v5 */
    /* JADX WARN: Type inference failed for: r30v6, types: [r5.b0] */
    /* JADX WARN: Type inference failed for: r30v7 */
    /* JADX WARN: Type inference failed for: r37v0 */
    /* JADX WARN: Type inference failed for: r37v1, types: [long[]] */
    /* JADX WARN: Type inference failed for: r37v3 */
    /* JADX WARN: Type inference failed for: r3v34, types: [r5.q] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // r5.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int g(r5.o r52, b0.a r53) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1333
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k6.d.g(r5.o, b0.a):int");
    }

    @Override // r5.n
    public final void h(q qVar) {
        this.f11131g = qVar;
        h0 h0VarU = qVar.u(0, 1);
        this.f11132h = h0VarU;
        this.f11133i = h0VarU;
        this.f11131g.n();
    }

    @Override // r5.n
    public final void i(long j10, long j11) {
        this.f11134j = 0;
        this.f11136l = -9223372036854775807L;
        this.f11137m = 0L;
        this.f11140p = 0;
        this.f11144t = j11;
        if (this.f11141q instanceof b) {
            throw null;
        }
    }

    @Override // r5.n
    public final List j() {
        g0 g0Var = i0.f25998b;
        return a1.f25946e;
    }

    public d(long j10) {
        this.f11125a = j10;
        this.f11126b = new s(10);
        this.f11127c = new z();
        this.f11128d = new v();
        this.f11136l = -9223372036854775807L;
        this.f11129e = new x(0);
        m mVar = new m();
        this.f11130f = mVar;
        this.f11133i = mVar;
        this.f11139o = -1L;
    }

    @Override // r5.n
    public final void a() {
    }

    @Override // r5.n
    public final n c() {
        return this;
    }
}
