package q6;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.SparseArray;
import ch.z;
import com.tencent.bugly.beta.tinker.TinkerReport;
import j2.h0;
import java.util.ArrayList;
import java.util.List;
import o6.k;
import o6.l;
import p4.c0;
import p4.r;
import p4.s;
import ya.a1;
import ya.g0;
import ya.i0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class h implements l {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final byte[] f17882h = {0, 7, 8, 15};

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final byte[] f17883i = {0, 119, -120, -1};

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final byte[] f17884j = {0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Paint f17885a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Paint f17886b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Canvas f17887c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b f17888d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a f17889e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final g f17890f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Bitmap f17891g;

    public h(List list) {
        s sVar = new s((byte[]) list.get(0));
        int iA = sVar.A();
        int iA2 = sVar.A();
        Paint paint = new Paint();
        this.f17885a = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        paint.setPathEffect(null);
        Paint paint2 = new Paint();
        this.f17886b = paint2;
        paint2.setStyle(Paint.Style.FILL);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        paint2.setPathEffect(null);
        this.f17887c = new Canvas();
        this.f17888d = new b(719, 575, 0, 719, 0, 575);
        this.f17889e = new a(0, new int[]{0, -1, -16777216, -8421505}, b(), c());
        this.f17890f = new g(iA, iA2);
    }

    public static byte[] a(int i10, int i11, r rVar) {
        byte[] bArr = new byte[i10];
        for (int i12 = 0; i12 < i10; i12++) {
            bArr[i12] = (byte) rVar.i(i11);
        }
        return bArr;
    }

    public static int[] b() {
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i10 = 1; i10 < 16; i10++) {
            if (i10 < 8) {
                iArr[i10] = d(TinkerReport.KEY_LOADED_EXCEPTION_RESOURCE_CHECK, (i10 & 1) != 0 ? TinkerReport.KEY_LOADED_EXCEPTION_RESOURCE_CHECK : 0, (i10 & 2) != 0 ? TinkerReport.KEY_LOADED_EXCEPTION_RESOURCE_CHECK : 0, (i10 & 4) != 0 ? TinkerReport.KEY_LOADED_EXCEPTION_RESOURCE_CHECK : 0);
            } else {
                iArr[i10] = d(TinkerReport.KEY_LOADED_EXCEPTION_RESOURCE_CHECK, (i10 & 1) != 0 ? 127 : 0, (i10 & 2) != 0 ? 127 : 0, (i10 & 4) == 0 ? 0 : 127);
            }
        }
        return iArr;
    }

    public static int[] c() {
        int[] iArr = new int[256];
        iArr[0] = 0;
        for (int i10 = 0; i10 < 256; i10++) {
            int i11 = TinkerReport.KEY_LOADED_EXCEPTION_RESOURCE_CHECK;
            if (i10 < 8) {
                int i12 = (i10 & 1) != 0 ? TinkerReport.KEY_LOADED_EXCEPTION_RESOURCE_CHECK : 0;
                int i13 = (i10 & 2) != 0 ? TinkerReport.KEY_LOADED_EXCEPTION_RESOURCE_CHECK : 0;
                if ((i10 & 4) == 0) {
                    i11 = 0;
                }
                iArr[i10] = d(63, i12, i13, i11);
            } else {
                int i14 = i10 & 136;
                if (i14 == 0) {
                    iArr[i10] = d(TinkerReport.KEY_LOADED_EXCEPTION_RESOURCE_CHECK, ((i10 & 1) != 0 ? 85 : 0) + ((i10 & 16) != 0 ? 170 : 0), ((i10 & 2) != 0 ? 85 : 0) + ((i10 & 32) != 0 ? 170 : 0), ((i10 & 4) == 0 ? 0 : 85) + ((i10 & 64) == 0 ? 0 : 170));
                } else if (i14 == 8) {
                    iArr[i10] = d(127, ((i10 & 1) != 0 ? 85 : 0) + ((i10 & 16) != 0 ? 170 : 0), ((i10 & 2) != 0 ? 85 : 0) + ((i10 & 32) != 0 ? 170 : 0), ((i10 & 4) == 0 ? 0 : 85) + ((i10 & 64) == 0 ? 0 : 170));
                } else if (i14 == 128) {
                    iArr[i10] = d(TinkerReport.KEY_LOADED_EXCEPTION_RESOURCE_CHECK, ((i10 & 1) != 0 ? 43 : 0) + 127 + ((i10 & 16) != 0 ? 85 : 0), ((i10 & 2) != 0 ? 43 : 0) + 127 + ((i10 & 32) != 0 ? 85 : 0), ((i10 & 4) == 0 ? 0 : 43) + 127 + ((i10 & 64) == 0 ? 0 : 85));
                } else if (i14 == 136) {
                    iArr[i10] = d(TinkerReport.KEY_LOADED_EXCEPTION_RESOURCE_CHECK, ((i10 & 1) != 0 ? 43 : 0) + ((i10 & 16) != 0 ? 85 : 0), ((i10 & 2) != 0 ? 43 : 0) + ((i10 & 32) != 0 ? 85 : 0), ((i10 & 4) == 0 ? 0 : 43) + ((i10 & 64) == 0 ? 0 : 85));
                }
            }
        }
        return iArr;
    }

    public static int d(int i10, int i11, int i12, int i13) {
        return (i10 << 24) | (i11 << 16) | (i12 << 8) | i13;
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x01d7 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0206 A[LOOP:3: B:87:0x0155->B:118:0x0206, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0202 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void e(byte[] r21, int[] r22, int r23, int r24, int r25, android.graphics.Paint r26, android.graphics.Canvas r27) {
        /*
            Method dump skipped, instruction units count: 554
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: q6.h.e(byte[], int[], int, int, int, android.graphics.Paint, android.graphics.Canvas):void");
    }

    public static a g(r rVar, int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16 = 8;
        int i17 = rVar.i(8);
        rVar.t(8);
        int i18 = 2;
        int i19 = i10 - 2;
        int[] iArr = {0, -1, -16777216, -8421505};
        int[] iArrB = b();
        int[] iArrC = c();
        while (i19 > 0) {
            int i20 = rVar.i(i16);
            int i21 = rVar.i(i16);
            int[] iArr2 = (i21 & 128) != 0 ? iArr : (i21 & 64) != 0 ? iArrB : iArrC;
            if ((i21 & 1) != 0) {
                i14 = rVar.i(i16);
                i15 = rVar.i(i16);
                i11 = rVar.i(i16);
                i13 = rVar.i(i16);
                i12 = i19 - 6;
            } else {
                int i22 = rVar.i(6) << i18;
                int i23 = rVar.i(4) << 4;
                i11 = rVar.i(4) << 4;
                i12 = i19 - 4;
                i13 = rVar.i(i18) << 6;
                i14 = i22;
                i15 = i23;
            }
            if (i14 == 0) {
                i15 = 0;
                i11 = 0;
                i13 = TinkerReport.KEY_LOADED_EXCEPTION_RESOURCE_CHECK;
            }
            double d10 = i14;
            double d11 = i15 - 128;
            double d12 = i11 - 128;
            iArr2[i20] = d((byte) (255 - (i13 & TinkerReport.KEY_LOADED_EXCEPTION_RESOURCE_CHECK)), c0.i((int) ((1.402d * d11) + d10), 0, TinkerReport.KEY_LOADED_EXCEPTION_RESOURCE_CHECK), c0.i((int) ((d10 - (0.34414d * d12)) - (d11 * 0.71414d)), 0, TinkerReport.KEY_LOADED_EXCEPTION_RESOURCE_CHECK), c0.i((int) ((d12 * 1.772d) + d10), 0, TinkerReport.KEY_LOADED_EXCEPTION_RESOURCE_CHECK));
            i19 = i12;
            i17 = i17;
            iArrC = iArrC;
            i16 = 8;
            i18 = 2;
        }
        return new a(i17, iArr, iArrB, iArrC);
    }

    public static c h(r rVar) {
        byte[] bArr;
        int i10 = rVar.i(16);
        rVar.t(4);
        int i11 = rVar.i(2);
        boolean zH = rVar.h();
        rVar.t(1);
        byte[] bArr2 = c0.f16553f;
        if (i11 != 1) {
            if (i11 == 0) {
                int i12 = rVar.i(16);
                int i13 = rVar.i(16);
                if (i12 > 0) {
                    bArr2 = new byte[i12];
                    rVar.l(bArr2, i12);
                }
                if (i13 > 0) {
                    bArr = new byte[i13];
                    rVar.l(bArr, i13);
                }
            }
            return new c(i10, zH, bArr2, bArr);
        }
        rVar.t(rVar.i(8) * 16);
        bArr = bArr2;
        return new c(i10, zH, bArr2, bArr);
    }

    @Override // o6.l
    public final /* synthetic */ o6.d f(byte[] bArr, int i10, int i11) {
        return h0.a(this, bArr, i11);
    }

    @Override // o6.l
    public final void reset() {
        g gVar = this.f17890f;
        gVar.f17875c.clear();
        gVar.f17876d.clear();
        gVar.f17877e.clear();
        gVar.f17878f.clear();
        gVar.f17879g.clear();
        gVar.f17880h = null;
        gVar.f17881i = null;
    }

    @Override // o6.l
    public final int u() {
        return 2;
    }

    @Override // o6.l
    public final void w(byte[] bArr, int i10, int i11, k kVar, p4.g gVar) {
        g gVar2;
        o6.a aVar;
        ArrayList arrayList;
        int i12;
        b bVar;
        g gVar3;
        e eVar;
        int i13;
        int i14;
        int i15;
        int i16;
        e eVar2;
        int i17;
        int i18;
        int i19;
        int i20;
        r rVar = new r(bArr, i10 + i11);
        rVar.q(i10);
        while (true) {
            int iB = rVar.b();
            gVar2 = this.f17890f;
            if (iB >= 48 && rVar.i(8) == 15) {
                int i21 = rVar.i(8);
                int i22 = rVar.i(16);
                int i23 = rVar.i(16);
                int iF = rVar.f() + i23;
                if (i23 * 8 > rVar.b()) {
                    p4.c.B("DvbParser", "Data field length exceeds limit");
                    rVar.t(rVar.b());
                } else {
                    switch (i21) {
                        case 16:
                            if (i22 == gVar2.f17873a) {
                                z zVar = gVar2.f17881i;
                                rVar.i(8);
                                int i24 = rVar.i(4);
                                int i25 = rVar.i(2);
                                rVar.t(2);
                                int i26 = i23 - 2;
                                SparseArray sparseArray = new SparseArray();
                                while (i26 > 0) {
                                    int i27 = rVar.i(8);
                                    rVar.t(8);
                                    i26 -= 6;
                                    sparseArray.put(i27, new d(rVar.i(16), rVar.i(16)));
                                }
                                z zVar2 = new z(i24, i25, sparseArray);
                                if (i25 != 0) {
                                    gVar2.f17881i = zVar2;
                                    gVar2.f17875c.clear();
                                    gVar2.f17876d.clear();
                                    gVar2.f17877e.clear();
                                } else if (zVar != null && zVar.f4284a != i24) {
                                    gVar2.f17881i = zVar2;
                                }
                            }
                            break;
                        case 17:
                            z zVar3 = gVar2.f17881i;
                            SparseArray sparseArray2 = gVar2.f17875c;
                            if (i22 == gVar2.f17873a && zVar3 != null) {
                                int i28 = rVar.i(8);
                                rVar.t(4);
                                boolean zH = rVar.h();
                                rVar.t(3);
                                int i29 = rVar.i(16);
                                int i30 = rVar.i(16);
                                rVar.i(3);
                                int i31 = rVar.i(3);
                                rVar.t(2);
                                int i32 = rVar.i(8);
                                int i33 = rVar.i(8);
                                int i34 = rVar.i(4);
                                int i35 = rVar.i(2);
                                rVar.t(2);
                                int i36 = i23 - 10;
                                SparseArray sparseArray3 = new SparseArray();
                                while (i36 > 0) {
                                    int i37 = rVar.i(16);
                                    int i38 = rVar.i(2);
                                    rVar.i(2);
                                    int i39 = rVar.i(12);
                                    rVar.t(4);
                                    int i40 = rVar.i(12);
                                    int i41 = i36 - 6;
                                    if (i38 == 1 || i38 == 2) {
                                        rVar.i(8);
                                        rVar.i(8);
                                        i36 -= 8;
                                    } else {
                                        i36 = i41;
                                    }
                                    sparseArray3.put(i37, new f(i39, i40));
                                }
                                e eVar3 = new e(i28, zH, i29, i30, i31, i32, i33, i34, i35, sparseArray3);
                                if (zVar3.f4285b == 0 && (eVar2 = (e) sparseArray2.get(i28)) != null) {
                                    SparseArray sparseArray4 = eVar2.f17870j;
                                    for (int i42 = 0; i42 < sparseArray4.size(); i42++) {
                                        eVar3.f17870j.put(sparseArray4.keyAt(i42), (f) sparseArray4.valueAt(i42));
                                    }
                                }
                                sparseArray2.put(eVar3.f17861a, eVar3);
                            }
                            break;
                        case 18:
                            if (i22 == gVar2.f17873a) {
                                a aVarG = g(rVar, i23);
                                gVar2.f17876d.put(aVarG.f17845a, aVarG);
                            } else if (i22 == gVar2.f17874b) {
                                a aVarG2 = g(rVar, i23);
                                gVar2.f17878f.put(aVarG2.f17845a, aVarG2);
                            }
                            break;
                        case 19:
                            if (i22 == gVar2.f17873a) {
                                c cVarH = h(rVar);
                                gVar2.f17877e.put(cVarH.f17855a, cVarH);
                            } else if (i22 == gVar2.f17874b) {
                                c cVarH2 = h(rVar);
                                gVar2.f17879g.put(cVarH2.f17855a, cVarH2);
                            }
                            break;
                        case 20:
                            if (i22 == gVar2.f17873a) {
                                rVar.t(4);
                                boolean zH2 = rVar.h();
                                rVar.t(3);
                                int i43 = rVar.i(16);
                                int i44 = rVar.i(16);
                                if (zH2) {
                                    int i45 = rVar.i(16);
                                    i17 = rVar.i(16);
                                    i20 = rVar.i(16);
                                    i18 = rVar.i(16);
                                    i19 = i45;
                                } else {
                                    i17 = i43;
                                    i18 = i44;
                                    i19 = 0;
                                    i20 = 0;
                                }
                                gVar2.f17880h = new b(i43, i44, i19, i17, i20, i18);
                            }
                            break;
                    }
                    rVar.u(iF - rVar.f());
                }
            }
        }
        z zVar4 = gVar2.f17881i;
        if (zVar4 == null) {
            g0 g0Var = i0.f25998b;
            aVar = new o6.a(-9223372036854775807L, -9223372036854775807L, a1.f25946e);
        } else {
            b bVar2 = gVar2.f17880h;
            if (bVar2 == null) {
                bVar2 = this.f17888d;
            }
            Bitmap bitmap = this.f17891g;
            Canvas canvas = this.f17887c;
            if (bitmap == null || bVar2.f17849a + 1 != bitmap.getWidth() || bVar2.f17850b + 1 != this.f17891g.getHeight()) {
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bVar2.f17849a + 1, bVar2.f17850b + 1, Bitmap.Config.ARGB_8888);
                this.f17891g = bitmapCreateBitmap;
                canvas.setBitmap(bitmapCreateBitmap);
            }
            ArrayList arrayList2 = new ArrayList();
            SparseArray sparseArray5 = (SparseArray) zVar4.f4286c;
            int i46 = 0;
            while (i46 < sparseArray5.size()) {
                canvas.save();
                d dVar = (d) sparseArray5.valueAt(i46);
                e eVar4 = (e) gVar2.f17875c.get(sparseArray5.keyAt(i46));
                int i47 = dVar.f17859a + bVar2.f17851c;
                int i48 = dVar.f17860b + bVar2.f17853e;
                int i49 = eVar4.f17863c;
                int i50 = eVar4.f17866f;
                int i51 = eVar4.f17864d;
                int i52 = i47 + i49;
                int i53 = i48 + i51;
                SparseArray sparseArray6 = sparseArray5;
                canvas.clipRect(i47, i48, Math.min(i52, bVar2.f17852d), Math.min(i53, bVar2.f17854f));
                a aVar2 = (a) gVar2.f17876d.get(i50);
                if (aVar2 == null && (aVar2 = (a) gVar2.f17878f.get(i50)) == null) {
                    aVar2 = this.f17889e;
                }
                SparseArray sparseArray7 = eVar4.f17870j;
                int i54 = i46;
                int i55 = 0;
                while (i55 < sparseArray7.size()) {
                    int iKeyAt = sparseArray7.keyAt(i55);
                    SparseArray sparseArray8 = sparseArray7;
                    f fVar = (f) sparseArray7.valueAt(i55);
                    int i56 = i48;
                    c cVar = (c) gVar2.f17877e.get(iKeyAt);
                    if (cVar == null) {
                        cVar = (c) gVar2.f17879g.get(iKeyAt);
                    }
                    c cVar2 = cVar;
                    if (cVar2 != null) {
                        Paint paint = cVar2.f17856b ? null : this.f17885a;
                        int i57 = i47;
                        int i58 = eVar4.f17865e;
                        gVar3 = gVar2;
                        int i59 = i57 + fVar.f17871a;
                        int i60 = i56 + fVar.f17872b;
                        int i61 = i51;
                        Paint paint2 = paint;
                        bVar = bVar2;
                        i14 = i49;
                        i13 = i57;
                        arrayList = arrayList2;
                        i12 = i56;
                        e eVar5 = eVar4;
                        int[] iArr = i58 == 3 ? aVar2.f17848d : i58 == 2 ? aVar2.f17847c : aVar2.f17846b;
                        eVar = eVar5;
                        i15 = i55;
                        i16 = i61;
                        e(cVar2.f17857c, iArr, i58, i59, i60, paint2, canvas);
                        e(cVar2.f17858d, iArr, i58, i59, i60 + 1, paint2, canvas);
                    } else {
                        arrayList = arrayList2;
                        i12 = i56;
                        bVar = bVar2;
                        gVar3 = gVar2;
                        eVar = eVar4;
                        i13 = i47;
                        i14 = i49;
                        i15 = i55;
                        i16 = i51;
                    }
                    i55 = i15 + 1;
                    i49 = i14;
                    i48 = i12;
                    eVar4 = eVar;
                    i47 = i13;
                    arrayList2 = arrayList;
                    sparseArray7 = sparseArray8;
                    bVar2 = bVar;
                    gVar2 = gVar3;
                    i51 = i16;
                }
                b bVar3 = bVar2;
                ArrayList arrayList3 = arrayList2;
                g gVar4 = gVar2;
                int i62 = i48;
                e eVar6 = eVar4;
                int i63 = i47;
                int i64 = i49;
                int i65 = i51;
                if (eVar6.f17862b) {
                    int i66 = eVar6.f17865e;
                    int i67 = i66 == 3 ? aVar2.f17848d[eVar6.f17867g] : i66 == 2 ? aVar2.f17847c[eVar6.f17868h] : aVar2.f17846b[eVar6.f17869i];
                    Paint paint3 = this.f17886b;
                    paint3.setColor(i67);
                    canvas.drawRect(i63, i62, i52, i53, paint3);
                }
                Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(this.f17891g, i63, i62, i64, i65);
                float f10 = bVar3.f17849a;
                float f11 = bVar3.f17850b;
                arrayList3.add(new o4.b(null, null, null, bitmapCreateBitmap2, i62 / f11, 0, 0, i63 / f10, 0, Integer.MIN_VALUE, -3.4028235E38f, i64 / f10, i65 / f11, false, -16777216, Integer.MIN_VALUE, 0.0f));
                canvas.drawColor(0, PorterDuff.Mode.CLEAR);
                canvas.restore();
                i46 = i54 + 1;
                bVar2 = bVar3;
                arrayList2 = arrayList3;
                sparseArray5 = sparseArray6;
                gVar2 = gVar4;
            }
            aVar = new o6.a(-9223372036854775807L, -9223372036854775807L, arrayList2);
        }
        gVar.accept(aVar);
    }
}
