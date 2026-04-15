package yf;

import d0.y;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class s extends ua.l implements xf.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xf.c f26315a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w f26316b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h7.k f26317c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final y f26318d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f26319e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public app.nekogram.translator.r f26320f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final xf.j f26321g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final i f26322h;

    public s(xf.c cVar, w wVar, h7.k kVar, uf.g gVar, app.nekogram.translator.r rVar) {
        jc.l.e(gVar, "descriptor");
        this.f26315a = cVar;
        this.f26316b = wVar;
        this.f26317c = kVar;
        this.f26318d = cVar.f24989b;
        this.f26319e = -1;
        this.f26320f = rVar;
        xf.j jVar = cVar.f24988a;
        this.f26321g = jVar;
        this.f26322h = jVar.f25006c ? null : new i(gVar);
    }

    @Override // ua.l, vf.b
    public final short A() {
        h7.k kVar = this.f26317c;
        long jL = kVar.l();
        short s10 = (short) jL;
        if (jL == s10) {
            return s10;
        }
        h7.k.q(kVar, "Failed to parse short for input '" + jL + '\'', 0, null, 6);
        throw null;
    }

    @Override // ua.l, vf.b
    public final float B() {
        h7.k kVar = this.f26317c;
        String strN = kVar.n();
        try {
            float f10 = Float.parseFloat(strN);
            if (Math.abs(f10) <= Float.MAX_VALUE) {
                return f10;
            }
            k.q(kVar, Float.valueOf(f10));
            throw null;
        } catch (IllegalArgumentException unused) {
            h7.k.q(kVar, a0.c.G('\'', "Failed to parse type 'float' for input '", strN), 0, null, 6);
            throw null;
        }
    }

    @Override // ua.l, vf.b
    public final double D() {
        h7.k kVar = this.f26317c;
        String strN = kVar.n();
        try {
            double d10 = Double.parseDouble(strN);
            if (Math.abs(d10) <= Double.MAX_VALUE) {
                return d10;
            }
            k.q(kVar, Double.valueOf(d10));
            throw null;
        } catch (IllegalArgumentException unused) {
            h7.k.q(kVar, a0.c.G('\'', "Failed to parse type 'double' for input '", strN), 0, null, 6);
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x015c, code lost:
    
        r1 = r3.f390b;
        r5 = (int[]) r3.f392d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0165, code lost:
    
        if (r5[r1] != (-2)) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0167, code lost:
    
        r5[r1] = -1;
        r3.f390b = r1 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x016d, code lost:
    
        r1 = r3.f390b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0170, code lost:
    
        if (r1 == (-1)) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0172, code lost:
    
        r3.f390b = r1 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0175, code lost:
    
        r1 = ef.n.B0(r4.subSequence(0, r2.f8197b).toString(), 0, 6, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x01b7, code lost:
    
        throw new yf.h("Encountered an unknown key '" + r6 + "' at offset " + r1 + " at path: " + r3.v() + "\nUse 'ignoreUnknownKeys = true' in 'Json {}' builder or '@JsonIgnoreUnknownKeys' annotation to ignore unknown keys.\nJSON input: " + ((java.lang.Object) yf.k.m(r4, r1)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x011d, code lost:
    
        if (r8 == null) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x011f, code lost:
    
        r1 = r8.f26288a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0123, code lost:
    
        if (r9 >= 64) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0125, code lost:
    
        r1.f24198c |= 1 << r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x012c, code lost:
    
        r12 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x012f, code lost:
    
        r2 = (r9 >>> 6) - 1;
        r1 = r1.f24199d;
        r1[r2] = r1[r2] | (1 << (r9 & 63));
     */
    @Override // vf.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int b(uf.g r24) {
        /*
            Method dump skipped, instruction units count: 738
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yf.s.b(uf.g):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x011f  */
    @Override // ua.l, vf.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(sf.a r11) {
        /*
            Method dump skipped, instruction units count: 323
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yf.s.d(sf.a):java.lang.Object");
    }

    @Override // ua.l, vf.b
    public final boolean e() {
        boolean z10;
        boolean z11;
        h7.k kVar = this.f26317c;
        int iA = kVar.A();
        String str = (String) kVar.f8201f;
        if (iA == str.length()) {
            h7.k.q(kVar, "EOF", 0, null, 6);
            throw null;
        }
        if (str.charAt(iA) == '\"') {
            iA++;
            z10 = true;
        } else {
            z10 = false;
        }
        int iZ = kVar.z(iA);
        if (iZ >= str.length() || iZ == -1) {
            h7.k.q(kVar, "EOF", 0, null, 6);
            throw null;
        }
        int i10 = iZ + 1;
        int iCharAt = str.charAt(iZ) | ' ';
        if (iCharAt == 102) {
            kVar.g(i10, "alse");
            z11 = false;
        } else {
            if (iCharAt != 116) {
                h7.k.q(kVar, "Expected valid boolean literal prefix, but had '" + kVar.n() + '\'', 0, null, 6);
                throw null;
            }
            kVar.g(i10, "rue");
            z11 = true;
        }
        if (!z10) {
            return z11;
        }
        if (kVar.f8197b == str.length()) {
            h7.k.q(kVar, "EOF", 0, null, 6);
            throw null;
        }
        if (str.charAt(kVar.f8197b) == '\"') {
            kVar.f8197b++;
            return z11;
        }
        h7.k.q(kVar, "Expected closing quotation mark", 0, null, 6);
        throw null;
    }

    @Override // ua.l, vf.b
    public final vf.b f(uf.g gVar) {
        jc.l.e(gVar, "descriptor");
        return u.a(gVar) ? new g(this.f26317c, this.f26315a) : this;
    }

    @Override // ua.l, vf.a
    public final Object g(uf.g gVar, int i10, sf.a aVar, Object obj) {
        ah.j jVar = (ah.j) this.f26317c.f8198c;
        jc.l.e(gVar, "descriptor");
        jc.l.e(aVar, "deserializer");
        boolean z10 = this.f26316b == w.f26337e && (i10 & 1) == 0;
        if (z10) {
            int[] iArr = (int[]) jVar.f392d;
            int i11 = jVar.f390b;
            if (iArr[i11] == -2) {
                ((Object[]) jVar.f391c)[i11] = l.f26291a;
            }
        }
        Object objG = super.g(gVar, i10, aVar, obj);
        if (z10) {
            int[] iArr2 = (int[]) jVar.f392d;
            int i12 = jVar.f390b;
            if (iArr2[i12] != -2) {
                int i13 = i12 + 1;
                jVar.f390b = i13;
                if (i13 == ((Object[]) jVar.f391c).length) {
                    jVar.J();
                }
            }
            Object[] objArr = (Object[]) jVar.f391c;
            int i14 = jVar.f390b;
            objArr[i14] = objG;
            ((int[]) jVar.f392d)[i14] = -2;
        }
        return objG;
    }

    @Override // ua.l, vf.b
    public final char h() {
        h7.k kVar = this.f26317c;
        String strN = kVar.n();
        if (strN.length() == 1) {
            return strN.charAt(0);
        }
        h7.k.q(kVar, a0.c.G('\'', "Expected single char, but got '", strN), 0, null, 6);
        throw null;
    }

    @Override // ua.l, vf.b
    public final vf.a i(uf.g gVar) {
        jc.l.e(gVar, "descriptor");
        xf.c cVar = this.f26315a;
        w wVarP = k.p(gVar, cVar);
        h7.k kVar = this.f26317c;
        ah.j jVar = (ah.j) kVar.f8198c;
        int i10 = jVar.f390b + 1;
        jVar.f390b = i10;
        if (i10 == ((Object[]) jVar.f391c).length) {
            jVar.J();
        }
        ((Object[]) jVar.f391c)[i10] = gVar;
        kVar.k(wVarP.f26341a);
        if (kVar.x() != 4) {
            int iOrdinal = wVarP.ordinal();
            return (iOrdinal == 1 || iOrdinal == 2 || iOrdinal == 3) ? new s(cVar, wVarP, kVar, gVar, this.f26320f) : (this.f26316b == wVarP && cVar.f24988a.f25006c) ? this : new s(cVar, wVarP, kVar, gVar, this.f26320f);
        }
        h7.k.q(kVar, "Unexpected leading comma", 0, null, 6);
        throw null;
    }

    @Override // ua.l, vf.a
    public final void j(uf.g gVar) {
        jc.l.e(gVar, "descriptor");
        if (gVar.p() == 0 && k.k(gVar, this.f26315a)) {
            while (b(gVar) != -1) {
            }
        }
        h7.k kVar = this.f26317c;
        if (kVar.B()) {
            k.l(kVar, "");
            throw null;
        }
        kVar.k(this.f26316b.f26342b);
        ah.j jVar = (ah.j) kVar.f8198c;
        int i10 = jVar.f390b;
        int[] iArr = (int[]) jVar.f392d;
        if (iArr[i10] == -2) {
            iArr[i10] = -1;
            jVar.f390b = i10 - 1;
        }
        int i11 = jVar.f390b;
        if (i11 != -1) {
            jVar.f390b = i11 - 1;
        }
    }

    @Override // ua.l, vf.b
    public final int k(uf.g gVar) {
        jc.l.e(gVar, "enumDescriptor");
        h7.k kVar = this.f26317c;
        return k.j(gVar, this.f26315a, kVar.m(), " at path " + ((ah.j) kVar.f8198c).v());
    }

    @Override // xf.k
    public final xf.m l() {
        return new b7.m(this.f26315a.f24988a, this.f26317c).q();
    }

    @Override // ua.l, vf.b
    public final int m() {
        h7.k kVar = this.f26317c;
        long jL = kVar.l();
        int i10 = (int) jL;
        if (jL == i10) {
            return i10;
        }
        h7.k.q(kVar, "Failed to parse int for input '" + jL + '\'', 0, null, 6);
        throw null;
    }

    @Override // vf.a
    public final y p() {
        return this.f26318d;
    }

    @Override // ua.l, vf.b
    public final String r() {
        return this.f26317c.m();
    }

    @Override // ua.l, vf.b
    public final long u() {
        return this.f26317c.l();
    }

    @Override // ua.l, vf.b
    public final boolean v() {
        i iVar = this.f26322h;
        return ((iVar != null ? iVar.f26289b : false) || this.f26317c.C(true)) ? false : true;
    }

    @Override // ua.l, vf.b
    public final byte z() {
        h7.k kVar = this.f26317c;
        long jL = kVar.l();
        byte b10 = (byte) jL;
        if (jL == b10) {
            return b10;
        }
        h7.k.q(kVar, "Failed to parse byte for input '" + jL + '\'', 0, null, 6);
        throw null;
    }
}
