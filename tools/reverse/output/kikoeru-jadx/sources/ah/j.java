package ah;

import android.content.res.ColorStateList;
import android.graphics.Shader;
import android.os.Handler;
import android.util.SparseArray;
import b0.t;
import b7.c2;
import b7.c3;
import b7.n1;
import b7.o2;
import b7.t1;
import b7.w0;
import cb.s;
import ic.p;
import j2.z2;
import j5.d0;
import j5.f0;
import j5.g0;
import j5.h0;
import j5.i0;
import j5.u;
import j5.z;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import m4.q;
import p4.c0;
import r5.o;
import uf.k;
import ug.y;
import vb.l;
import vb.m;
import ya.f1;
import ya.j0;
import ya.k0;
import ya.m0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public class j implements s, r5.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f389a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f390b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f391c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f392d;

    public /* synthetic */ j(int i10, char c3) {
        this.f389a = i10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01f5, code lost:
    
        if (r11 == 1) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x01f8, code lost:
    
        if (r11 == 2) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x01fa, code lost:
    
        r1 = r0.f9792a;
        r0 = r0.f9793b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0200, code lost:
    
        if (r10 == 1) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0202, code lost:
    
        if (r10 == 2) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0204, code lost:
    
        r2 = android.graphics.Shader.TileMode.CLAMP;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0215, code lost:
    
        r2 = android.graphics.Shader.TileMode.MIRROR;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0218, code lost:
    
        r2 = android.graphics.Shader.TileMode.REPEAT;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x021b, code lost:
    
        r11 = new android.graphics.LinearGradient(r21, r22, r26, r27, r1, r0, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x021f, code lost:
    
        r11 = new android.graphics.SweepGradient(r8, r9, r0.f9792a, r0.f9793b);
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x022d, code lost:
    
        if (r25 <= 0.0f) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x022f, code lost:
    
        r1 = r0.f9792a;
        r0 = r0.f9793b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0236, code lost:
    
        if (r10 == 1) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0239, code lost:
    
        if (r10 == 2) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x023b, code lost:
    
        r2 = android.graphics.Shader.TileMode.CLAMP;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x024a, code lost:
    
        r2 = android.graphics.Shader.TileMode.MIRROR;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x024d, code lost:
    
        r2 = android.graphics.Shader.TileMode.REPEAT;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0250, code lost:
    
        r11 = new android.graphics.RadialGradient(r8, r9, r25, r1, r0, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x025c, code lost:
    
        return new ah.j(r11, (android.content.res.ColorStateList) null, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0264, code lost:
    
        throw new org.xmlpull.v1.XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01da, code lost:
    
        if (r13.size() <= 0) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01dc, code lost:
    
        r0 = new j2.d1(r13, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01e2, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01e3, code lost:
    
        if (r0 == null) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01e7, code lost:
    
        if (r20 == false) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01e9, code lost:
    
        r0 = new j2.d1(r6, r5, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01ef, code lost:
    
        r0 = new j2.d1(r6, r12);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static ah.j f(android.content.res.Resources r30, int r31, android.content.res.Resources.Theme r32) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            Method dump skipped, instruction units count: 653
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ah.j.f(android.content.res.Resources, int, android.content.res.Resources$Theme):ah.j");
    }

    public void A(u uVar, int i10, int i11, q qVar, int i12, Object obj, long j10, long j11) {
        h(new g0(this, uVar, new z(i10, i11, qVar, i12, obj, c0.c0(j10), c0.c0(j11)), 1));
    }

    public void B(u uVar, int i10, int i11, q qVar, int i12, Object obj, long j10, long j11) {
        h(new g0(this, uVar, new z(i10, i11, qVar, i12, obj, c0.c0(j10), c0.c0(j11)), 0));
    }

    public void C(u uVar, int i10, int i11, q qVar, int i12, Object obj, long j10, long j11, IOException iOException, boolean z10) {
        h(new h0(this, uVar, new z(i10, i11, qVar, i12, obj, c0.c0(j10), c0.c0(j11)), iOException, z10));
    }

    public void D(u uVar, int i10, IOException iOException, boolean z10) {
        C(uVar, i10, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, iOException, z10);
    }

    public void E(u uVar, int i10, int i11, q qVar, int i12, Object obj, long j10, long j11, int i13) {
        h(new f0(this, uVar, new z(i10, i11, qVar, i12, obj, c0.c0(j10), c0.c0(j11)), i13));
    }

    public j G(Object obj, Object obj2) {
        int i10 = (this.f390b + 1) * 2;
        Object[] objArr = (Object[]) this.f391c;
        if (i10 > objArr.length) {
            this.f391c = Arrays.copyOf(objArr, ya.c0.e(objArr.length, i10));
        }
        if (obj == null) {
            throw new NullPointerException("null key in entry: null=" + obj2);
        }
        if (obj2 == null) {
            throw new NullPointerException("null value in entry: " + obj + "=null");
        }
        Object[] objArr2 = (Object[]) this.f391c;
        int i11 = this.f390b;
        int i12 = i11 * 2;
        objArr2[i12] = obj;
        objArr2[i12 + 1] = obj2;
        this.f390b = i11 + 1;
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object H(vb.u r5, ac.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof i7.p
            if (r0 == 0) goto L13
            r0 = r6
            i7.p r0 = (i7.p) r0
            int r1 = r0.f9253i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f9253i = r1
            goto L18
        L13:
            i7.p r0 = new i7.p
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f9251g
            int r1 = r0.f9253i
            r2 = 1
            if (r1 == 0) goto L35
            if (r1 != r2) goto L2d
            rf.c r5 = r0.f9250f
            vb.u r1 = r0.f9249e
            ah.j r0 = r0.f9248d
            ub.a.f(r6)
            r6 = r5
            r5 = r1
            goto L4e
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            ub.a.f(r6)
            java.lang.Object r6 = r4.f392d
            rf.c r6 = (rf.c) r6
            r0.f9248d = r4
            r0.f9249e = r5
            r0.f9250f = r6
            r0.f9253i = r2
            java.lang.Object r0 = r6.g(r0)
            zb.a r1 = zb.a.f26667a
            if (r0 != r1) goto L4d
            return r1
        L4d:
            r0 = r4
        L4e:
            r1 = 0
            int r2 = r5.f22822a     // Catch: java.lang.Throwable -> L64
            r0.f390b = r2     // Catch: java.lang.Throwable -> L64
            java.lang.Object r0 = r0.f391c     // Catch: java.lang.Throwable -> L64
            i7.q r0 = (i7.q) r0     // Catch: java.lang.Throwable -> L64
            java.lang.Object r5 = r5.f22823b     // Catch: java.lang.Throwable -> L64
            i7.k0 r5 = (i7.k0) r5     // Catch: java.lang.Throwable -> L64
            r0.a(r5)     // Catch: java.lang.Throwable -> L64
            r6.b(r1)
            ub.a0 r5 = ub.a0.f21526a
            return r5
        L64:
            r5 = move-exception
            r6.b(r1)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ah.j.H(vb.u, ac.c):java.lang.Object");
    }

    public void I() {
        l.q0((int[]) this.f391c, 0, 0, 6);
        ((vb.j) this.f392d).clear();
    }

    public void J() {
        int i10 = this.f390b * 2;
        Object[] objArrCopyOf = Arrays.copyOf((Object[]) this.f391c, i10);
        jc.l.d(objArrCopyOf, "copyOf(...)");
        this.f391c = objArrCopyOf;
        int[] iArr = new int[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            iArr[i11] = -1;
        }
        l.l0(0, 0, 14, (int[]) this.f392d, iArr);
        this.f392d = iArr;
    }

    public void K(int i10, int i11) {
        if (!(i10 >= 0)) {
            x.a.a("Negative lanes are not supported");
        }
        m(i10);
        ((int[]) this.f391c)[i10 - this.f390b] = i11 + 1;
    }

    public List L(CharSequence charSequence) {
        charSequence.getClass();
        xa.h hVar = (xa.h) this.f392d;
        hVar.getClass();
        xa.g gVar = new xa.g(hVar, this, charSequence);
        ArrayList arrayList = new ArrayList();
        while (gVar.hasNext()) {
            arrayList.add((String) gVar.next());
        }
        return Collections.unmodifiableList(arrayList);
    }

    public void M(int i10, long j10, long j11) {
        z zVar = new z(1, i10, null, 3, null, c0.c0(j10), c0.c0(j11));
        d0 d0Var = (d0) this.f391c;
        d0Var.getClass();
        h(new w0(this, d0Var, zVar, 4));
    }

    public void N(int i10, p pVar) {
        int i11 = i10 & 67108863;
        long[] jArr = (long[]) this.f391c;
        int i12 = this.f390b;
        for (int i13 = 0; i13 < jArr.length - 2 && i13 < i12; i13 += 3) {
            if ((((int) jArr[i13 + 2]) & 67108863) == i11) {
                long j10 = jArr[i13];
                long j11 = jArr[i13 + 1];
                pVar.l(Integer.valueOf((int) (j10 >> 32)), Integer.valueOf((int) j10), Integer.valueOf((int) (j11 >> 32)), Integer.valueOf((int) j11));
                return;
            }
        }
    }

    public void a(int i10, t tVar) {
        if (i10 < 0) {
            x.a.a("size should be >=0");
        }
        if (i10 == 0) {
            return;
        }
        b0.i iVar = new b0.i(this.f390b, i10, tVar);
        this.f390b += i10;
        ((z0.e) this.f391c).b(iVar);
    }

    public boolean b(int i10, int i11) {
        int iU = u(i10);
        return iU == i11 || iU == -1 || iU == -2;
    }

    public k0 c() {
        f1 f1Var;
        j0 j0Var = (j0) this.f392d;
        if (j0Var != null) {
            throw j0Var.a();
        }
        int i10 = this.f390b;
        Object[] objArrCopyOf = (Object[]) this.f391c;
        if (i10 == 0) {
            f1Var = f1.f25977g;
        } else if (i10 == 1) {
            Objects.requireNonNull(objArrCopyOf[0]);
            Objects.requireNonNull(objArrCopyOf[1]);
            f1Var = new f1(1, null, objArrCopyOf);
        } else {
            ud.s.i(i10, objArrCopyOf.length >> 1);
            Object objF = f1.f(objArrCopyOf, i10, m0.o(i10), 0);
            if (objF instanceof Object[]) {
                Object[] objArr = (Object[]) objF;
                this.f392d = (j0) objArr[2];
                Object obj = objArr[0];
                int iIntValue = ((Integer) objArr[1]).intValue();
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, iIntValue * 2);
                objF = obj;
                i10 = iIntValue;
            }
            f1Var = new f1(i10, objF, objArrCopyOf);
        }
        j0 j0Var2 = (j0) this.f392d;
        if (j0Var2 == null) {
            return f1Var;
        }
        throw j0Var2.a();
    }

    @Override // cb.s
    public void d(Object obj) {
        List list = (List) obj;
        c2 c2Var = ((o2) this.f392d).f2008g;
        Handler handler = c2Var.f1685l;
        t1 t1Var = (t1) this.f391c;
        c0.R(handler, new b5.h(c2Var, t1Var, new n1(this.f390b, 1, this, list, t1Var)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00b0, code lost:
    
        if (r13 == r16) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00be, code lost:
    
        return r5.h.f18823d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:?, code lost:
    
        return new r5.h(-2, r13, r7 + r3);
     */
    @Override // r5.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public r5.h e(r5.o r23, long r24) {
        /*
            Method dump skipped, instruction units count: 274
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ah.j.e(r5.o, long):r5.h");
    }

    public void h(p4.g gVar) {
        for (i0 i0Var : (CopyOnWriteArrayList) this.f392d) {
            c0.R(i0Var.f10303a, new b5.h(14, gVar, i0Var.f10304b));
        }
    }

    public void i(int i10) {
        ByteArrayOutputStream byteArrayOutputStream = (ByteArrayOutputStream) this.f392d;
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        int length = byteArray.length - i10;
        int i11 = 0;
        while (i11 < length) {
            int i12 = i11 + 16;
            ((Mac) this.f391c).update(byteArray, i11, i12 <= length ? 16 : length - i11);
            i11 = i12;
        }
        byteArrayOutputStream.reset();
    }

    public void j(int i10, q qVar, int i11, Object obj, long j10) {
        h(new b7.i0(14, this, new z(1, i10, qVar, i11, obj, c0.c0(j10), -9223372036854775807L)));
    }

    @Override // r5.i
    public void k() {
        switch (this.f389a) {
            case 15:
                break;
            default:
                p4.s sVar = (p4.s) this.f392d;
                byte[] bArr = c0.f16553f;
                sVar.getClass();
                sVar.E(bArr, bArr.length);
                break;
        }
    }

    public void l(int i10, int i11) {
        if (i10 > 131072) {
            x.a.a("Requested item capacity " + i10 + " is larger than max supported: 131072!");
        }
        int[] iArr = (int[]) this.f391c;
        if (iArr.length < i10) {
            int length = iArr.length;
            while (length < i10) {
                length *= 2;
            }
            int[] iArr2 = new int[length];
            l.l0(i11, 0, 12, (int[]) this.f391c, iArr2);
            this.f391c = iArr2;
        }
    }

    public void m(int i10) {
        vb.j jVar = (vb.j) this.f392d;
        int i11 = this.f390b;
        int i12 = i10 - i11;
        if (i12 < 0 || i12 >= 131072) {
            int iMax = Math.max(i10 - (((int[]) this.f391c).length / 2), 0);
            this.f390b = iMax;
            int i13 = iMax - i11;
            if (i13 >= 0) {
                int[] iArr = (int[]) this.f391c;
                if (i13 < iArr.length) {
                    l.h0(0, i13, iArr.length, iArr, iArr);
                }
                int[] iArr2 = (int[]) this.f391c;
                Arrays.fill(iArr2, Math.max(0, iArr2.length - i13), ((int[]) this.f391c).length, 0);
            } else {
                int i14 = -i13;
                int[] iArr3 = (int[]) this.f391c;
                if (iArr3.length + i14 < 131072) {
                    l(iArr3.length + i14 + 1, i14);
                } else {
                    if (i14 < iArr3.length) {
                        l.h0(i14, 0, iArr3.length - i14, iArr3, iArr3);
                    }
                    int[] iArr4 = (int[]) this.f391c;
                    Arrays.fill(iArr4, 0, Math.min(iArr4.length, i14), 0);
                }
            }
        } else {
            l(i12 + 1, 0);
        }
        while (!jVar.isEmpty() && ((c0.j) jVar.first()).f3078a < this.f390b) {
            jVar.removeFirst();
        }
        while (!jVar.isEmpty() && ((c0.j) jVar.last()).f3078a > this.f390b + ((int[]) this.f391c).length) {
            jVar.removeLast();
        }
    }

    public long n(o oVar) {
        int iO;
        b0.a aVar = (b0.a) this.f392d;
        r5.t tVar = (r5.t) this.f391c;
        while (oVar.j() < oVar.getLength() - 6) {
            int i10 = this.f390b;
            long j10 = oVar.j();
            byte[] bArr = new byte[2];
            int i11 = 0;
            boolean zB = false;
            oVar.z(bArr, 0, 2);
            if ((((bArr[0] & 255) << 8) | (bArr[1] & 255)) != i10) {
                oVar.q();
                oVar.k((int) (j10 - oVar.getPosition()));
            } else {
                p4.s sVar = new p4.s(16);
                System.arraycopy(bArr, 0, sVar.f16611a, 0, 2);
                byte[] bArr2 = sVar.f16611a;
                while (i11 < 14 && (iO = oVar.o(bArr2, 2 + i11, 14 - i11)) != -1) {
                    i11 += iO;
                }
                sVar.F(i11);
                oVar.q();
                oVar.k((int) (j10 - oVar.getPosition()));
                zB = r5.b.b(sVar, tVar, i10, aVar);
            }
            if (zB) {
                break;
            }
            oVar.k(1);
        }
        if (oVar.j() < oVar.getLength() - 6) {
            return aVar.f1169a;
        }
        oVar.k((int) (oVar.getLength() - oVar.j()));
        return tVar.f18873j;
    }

    public int o(int i10, int i11) {
        do {
            i10--;
            if (-1 >= i10) {
                return -1;
            }
        } while (!b(i10, i11));
        return i10;
    }

    public b0.i p(int i10) {
        if (i10 < 0 || i10 >= this.f390b) {
            StringBuilder sbO = j2.h0.o(i10, "Index ", ", size ");
            sbO.append(this.f390b);
            x.a.e(sbO.toString());
        }
        b0.i iVar = (b0.i) this.f392d;
        if (iVar != null) {
            int i11 = iVar.f1263a;
            if (i10 < iVar.f1264b + i11 && i11 <= i10) {
                return iVar;
            }
        }
        z0.e eVar = (z0.e) this.f391c;
        b0.i iVar2 = (b0.i) eVar.f26372a[b0.g0.e(i10, eVar)];
        this.f392d = iVar2;
        return iVar2;
    }

    public Object q(int i10) {
        SparseArray sparseArray = (SparseArray) this.f391c;
        if (this.f390b == -1) {
            this.f390b = 0;
        }
        while (true) {
            int i11 = this.f390b;
            if (i11 <= 0 || i10 >= sparseArray.keyAt(i11)) {
                break;
            }
            this.f390b--;
        }
        while (this.f390b < sparseArray.size() - 1 && i10 >= sparseArray.keyAt(this.f390b + 1)) {
            this.f390b++;
        }
        return sparseArray.valueAt(this.f390b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int[] r(int i10) {
        int i11;
        vb.j jVar = (vb.j) this.f392d;
        Integer numValueOf = Integer.valueOf(i10);
        int iA = jVar.a();
        ud.b.D(jVar.size(), iA);
        int i12 = iA - 1;
        int i13 = 0;
        while (true) {
            if (i13 > i12) {
                i11 = -(i13 + 1);
                break;
            }
            i11 = (i13 + i12) >>> 1;
            int iJ = ud.b.j(Integer.valueOf(((c0.j) jVar.get(i11)).f3078a), numValueOf);
            if (iJ >= 0) {
                if (iJ <= 0) {
                    break;
                }
                i12 = i11 - 1;
            } else {
                i13 = i11 + 1;
            }
        }
        c0.j jVar2 = (c0.j) m.b0(i11, jVar);
        if (jVar2 != null) {
            return jVar2.f3079b;
        }
        return null;
    }

    public int s(Object obj) {
        o.f0 f0Var = (o.f0) this.f391c;
        int iD = f0Var.d(obj);
        if (iD >= 0) {
            return f0Var.f15955c[iD];
        }
        return -1;
    }

    public Object t(int i10) {
        Object[] objArr = (Object[]) this.f392d;
        int i11 = i10 - this.f390b;
        if (i11 < 0) {
            return null;
        }
        jc.l.e(objArr, "<this>");
        if (i11 <= objArr.length - 1) {
            return objArr[i11];
        }
        return null;
    }

    public String toString() {
        switch (this.f389a) {
            case 0:
                StringBuilder sb = new StringBuilder();
                if (((y) this.f391c) == y.f21934c) {
                    sb.append("HTTP/1.0");
                } else {
                    sb.append("HTTP/1.1");
                }
                sb.append(' ');
                sb.append(this.f390b);
                sb.append(' ');
                sb.append((String) this.f392d);
                return sb.toString();
            case 20:
                return v();
            default:
                return super.toString();
        }
    }

    public int u(int i10) {
        int i11 = this.f390b;
        if (i10 < i11) {
            return -1;
        }
        if (i10 >= ((int[]) this.f391c).length + i11) {
            return -1;
        }
        return r1[i10 - i11] - 1;
    }

    public String v() {
        StringBuilder sb = new StringBuilder("$");
        int i10 = this.f390b + 1;
        for (int i11 = 0; i11 < i10; i11++) {
            Object obj = ((Object[]) this.f391c)[i11];
            if (obj instanceof uf.g) {
                uf.g gVar = (uf.g) obj;
                if (!jc.l.a(gVar.j(), k.f21706c)) {
                    int i12 = ((int[]) this.f392d)[i11];
                    if (i12 >= 0) {
                        sb.append(".");
                        sb.append(gVar.q(i12));
                    }
                } else if (((int[]) this.f392d)[i11] != -1) {
                    sb.append("[");
                    sb.append(((int[]) this.f392d)[i11]);
                    sb.append("]");
                }
            } else if (obj != yf.l.f26291a) {
                sb.append("['");
                sb.append(obj);
                sb.append("']");
            }
        }
        return sb.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.io.Serializable w(ac.c r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof i7.o
            if (r0 == 0) goto L13
            r0 = r9
            i7.o r0 = (i7.o) r0
            int r1 = r0.f9234h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f9234h = r1
            goto L18
        L13:
            i7.o r0 = new i7.o
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.f9232f
            int r1 = r0.f9234h
            r2 = 1
            if (r1 == 0) goto L31
            if (r1 != r2) goto L29
            rf.c r1 = r0.f9231e
            ah.j r0 = r0.f9230d
            ub.a.f(r9)
            goto L49
        L29:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L31:
            ub.a.f(r9)
            java.lang.Object r9 = r8.f392d
            r1 = r9
            rf.c r1 = (rf.c) r1
            r0.f9230d = r8
            r0.f9231e = r1
            r0.f9234h = r2
            java.lang.Object r9 = r1.g(r0)
            zb.a r0 = zb.a.f26667a
            if (r9 != r0) goto L48
            return r0
        L48:
            r0 = r8
        L49:
            r9 = 0
            java.lang.Object r3 = r0.f391c     // Catch: java.lang.Throwable -> L87
            i7.q r3 = (i7.q) r3     // Catch: java.lang.Throwable -> L87
            java.util.List r3 = r3.b()     // Catch: java.lang.Throwable -> L87
            int r0 = r0.f390b     // Catch: java.lang.Throwable -> L87
            int r4 = r3.size()     // Catch: java.lang.Throwable -> L87
            int r0 = r0 - r4
            int r0 = r0 + r2
            java.lang.Iterable r3 = (java.lang.Iterable) r3     // Catch: java.lang.Throwable -> L87
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L87
            r4 = 10
            int r4 = vb.n.K(r3, r4)     // Catch: java.lang.Throwable -> L87
            r2.<init>(r4)     // Catch: java.lang.Throwable -> L87
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Throwable -> L87
            r4 = 0
        L6c:
            boolean r5 = r3.hasNext()     // Catch: java.lang.Throwable -> L87
            if (r5 == 0) goto L8d
            java.lang.Object r5 = r3.next()     // Catch: java.lang.Throwable -> L87
            int r6 = r4 + 1
            if (r4 < 0) goto L89
            i7.k0 r5 = (i7.k0) r5     // Catch: java.lang.Throwable -> L87
            vb.u r7 = new vb.u     // Catch: java.lang.Throwable -> L87
            int r4 = r4 + r0
            r7.<init>(r4, r5)     // Catch: java.lang.Throwable -> L87
            r2.add(r7)     // Catch: java.lang.Throwable -> L87
            r4 = r6
            goto L6c
        L87:
            r0 = move-exception
            goto L91
        L89:
            ud.b.H()     // Catch: java.lang.Throwable -> L87
            throw r9     // Catch: java.lang.Throwable -> L87
        L8d:
            r1.b(r9)
            return r2
        L91:
            r1.b(r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ah.j.w(ac.c):java.io.Serializable");
    }

    public void x(byte[] bArr) {
        try {
            ((Mac) this.f391c).init(new SecretKeySpec(bArr, "HmacSHA1"));
        } catch (InvalidKeyException e10) {
            throw new RuntimeException(e10);
        }
    }

    public void y(int i10, int i11, int i12, int i13, int i14, int i15, boolean z10, boolean z11) {
        long[] jArr = (long[]) this.f391c;
        int i16 = this.f390b;
        int i17 = i16 + 3;
        this.f390b = i17;
        int length = jArr.length;
        if (length <= i17) {
            int iMax = Math.max(length * 2, i17);
            long[] jArrCopyOf = Arrays.copyOf(jArr, iMax);
            jc.l.d(jArrCopyOf, "copyOf(...)");
            this.f391c = jArrCopyOf;
            long[] jArrCopyOf2 = Arrays.copyOf((long[]) this.f392d, iMax);
            jc.l.d(jArrCopyOf2, "copyOf(...)");
            this.f392d = jArrCopyOf2;
        }
        long[] jArr2 = (long[]) this.f391c;
        jArr2[i16] = (((long) i11) << 32) | (((long) i12) & 4294967295L);
        jArr2[i16 + 1] = (((long) i13) << 32) | (((long) i14) & 4294967295L);
        int i18 = i15 & 67108863;
        jArr2[i16 + 2] = ((z11 ? 1L : 0L) << 63) | ((z10 ? 1L : 0L) << 62) | (((long) 1) << 61) | (((long) Math.min(0, 511)) << 52) | (((long) i18) << 26) | ((long) (i10 & 67108863));
        if (i15 < 0) {
            return;
        }
        for (int i19 = i16 - 3; i19 >= 0; i19 -= 3) {
            int i20 = i19 + 2;
            long j10 = jArr2[i20];
            if ((((int) j10) & 67108863) == i18) {
                jArr2[i20] = (j10 & (-2301339409586323457L)) | (((long) Math.min(i16 - i19, 511)) << 52);
                return;
            }
        }
    }

    public boolean z() {
        ColorStateList colorStateList;
        return ((Shader) this.f391c) == null && (colorStateList = (ColorStateList) this.f392d) != null && colorStateList.isStateful();
    }

    public /* synthetic */ j(Object obj, int i10, Serializable serializable, int i11) {
        this.f389a = i11;
        this.f391c = obj;
        this.f390b = i10;
        this.f392d = serializable;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00e5 A[LOOP:1: B:27:0x00c3->B:33:0x00e5, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public j(oc.d r13, b0.g0 r14) {
        /*
            Method dump skipped, instruction units count: 241
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ah.j.<init>(oc.d, b0.g0):void");
    }

    private final /* synthetic */ void F() {
    }

    @Override // cb.s
    public void g(Throwable th2) {
    }

    public j(c3 c3Var) {
        this.f389a = 8;
        this.f391c = new SparseArray();
        this.f392d = c3Var;
        this.f390b = -1;
    }

    public j(Shader shader, ColorStateList colorStateList, int i10) {
        this.f389a = 12;
        this.f391c = shader;
        this.f392d = colorStateList;
        this.f390b = i10;
    }

    public j(r5.t tVar, int i10) {
        this.f389a = 15;
        this.f391c = tVar;
        this.f390b = i10;
        this.f392d = new b0.a();
    }

    public j(int i10, p4.y yVar) {
        this.f389a = 18;
        this.f390b = i10;
        this.f391c = yVar;
        this.f392d = new p4.s();
    }

    public j(byte b10, int i10) {
        this.f389a = i10;
        switch (i10) {
            case 4:
                this.f391c = new int[16];
                this.f392d = new vb.j();
                return;
            case 6:
                this.f391c = new i7.q();
                this.f392d = new rf.c();
                this.f390b = -1;
                return;
            case 11:
                this.f392d = new ByteArrayOutputStream(4096);
                try {
                    Mac mac = Mac.getInstance("HmacSHA1");
                    this.f391c = mac;
                    this.f390b = mac.getMacLength();
                    return;
                } catch (NoSuchAlgorithmException e10) {
                    throw new RuntimeException(e10);
                }
            default:
                this.f391c = new z0.e(new b0.i[16]);
                return;
        }
    }

    public j(s4.g gVar) {
        this.f389a = 17;
        k5.d dVar = new k5.d(0);
        dVar.f11044c = new m3.l(17);
        this.f392d = dVar;
        this.f391c = gVar;
        this.f390b = 1;
    }

    public j(xa.h hVar) {
        this.f389a = 16;
        this.f392d = hVar;
        this.f391c = xa.c.f24879a;
        this.f390b = Integer.MAX_VALUE;
    }

    public j(CopyOnWriteArrayList copyOnWriteArrayList, int i10, d0 d0Var) {
        this.f389a = 7;
        this.f392d = copyOnWriteArrayList;
        this.f390b = i10;
        this.f391c = d0Var;
    }

    public j(z2 z2Var) {
        this.f389a = 9;
        this.f391c = z2Var;
    }

    public j(int i10) {
        this.f389a = 19;
        this.f391c = new Object[i10 * 2];
        this.f390b = 0;
    }

    public j(o2 o2Var, t1 t1Var, int i10) {
        this.f389a = 3;
        this.f392d = o2Var;
        this.f391c = t1Var;
        this.f390b = i10;
    }
}
