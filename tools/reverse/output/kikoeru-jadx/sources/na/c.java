package na;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.provider.MediaStore;
import ba.h0;
import ba.q0;
import bg.a2;
import com.cnl.kikoeru.MainApplication;
import j2.l1;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import m0.p3;
import pc.f0;
import x0.o2;
import x0.p1;
import x0.w0;
import y.d1;
import y.e1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f1.f f15678a = new f1.f(new la.k(8), 741332261, false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final f1.f f15679b = new f1.f(new la.k(9), -2014864822, false);

    public static final Long a(String str) {
        jc.l.e(str, "rj");
        if (!ef.u.k0(str, "RJ", false)) {
            return null;
        }
        String strSubstring = str.substring(2);
        jc.l.d(strSubstring, "substring(...)");
        return ef.u.m0(strSubstring);
    }

    public static final void b(w1.f fVar, ic.a aVar, x0.o oVar, int i10) {
        ic.a aVar2;
        x0.o oVar2;
        jc.l.e(aVar, "onClick");
        oVar.Y(1798146117);
        int i11 = (oVar.f(fVar) ? 4 : 2) | i10 | (oVar.h(aVar) ? 32 : 16);
        if (oVar.N(i11 & 1, (i11 & 19) != 18)) {
            aVar2 = aVar;
            oVar2 = oVar;
            p3.a(aVar2, null, false, f1.g.f(1800266281, new a9.r(14, fVar), oVar), oVar2, ((i11 >> 3) & 14) | 24576, 14);
        } else {
            aVar2 = aVar;
            oVar2 = oVar;
            oVar2.Q();
        }
        p1 p1VarR = oVar2.r();
        if (p1VarR != null) {
            p1VarR.f24421d = new h0(fVar, aVar2, i10, 14);
        }
    }

    public static final void c(e7.a0 a0Var, ic.o oVar, x0.o oVar2, int i10) {
        jc.l.e(a0Var, "navController");
        jc.l.e(oVar, "onDestinationChanged");
        oVar2.Y(1190222294);
        int i11 = (oVar2.h(a0Var) ? 4 : 2) | i10;
        if (oVar2.N(i11 & 1, (i11 & 19) != 18)) {
            boolean zH = oVar2.h(a0Var);
            Object objK = oVar2.K();
            if (zH || objK == x0.k.f24334a) {
                objK = new q0(16, a0Var, oVar);
                oVar2.h0(objK);
            }
            x0.v.c(a0Var, (ic.k) objK, oVar2);
        } else {
            oVar2.Q();
        }
        p1 p1VarR = oVar2.r();
        if (p1VarR != null) {
            p1VarR.f24421d = new h0(a0Var, oVar, i10, 15);
        }
    }

    public static final void d(File file) {
        if (file.exists()) {
            return;
        }
        file.mkdirs();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object e(long r4, ac.c r6, boolean r7) throws java.lang.Throwable {
        /*
            boolean r0 = r6 instanceof na.a
            if (r0 == 0) goto L13
            r0 = r6
            na.a r0 = (na.a) r0
            int r1 = r0.f15671e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f15671e = r1
            goto L18
        L13:
            na.a r0 = new na.a
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f15670d
            int r1 = r0.f15671e
            r2 = 1
            if (r1 == 0) goto L2d
            if (r1 != r2) goto L25
            ub.a.f(r6)
            goto L45
        L25:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2d:
            ub.a.f(r6)
            pf.e r6 = hf.l0.f8566a
            pf.d r6 = pf.d.f17138c
            na.b r1 = new na.b
            r3 = 0
            r1.<init>(r7, r4, r3)
            r0.f15671e = r2
            java.lang.Object r6 = hf.a0.H(r6, r1, r0)
            zb.a r4 = zb.a.f26667a
            if (r6 != r4) goto L45
            return r4
        L45:
            ub.n r6 = (ub.n) r6
            java.lang.Object r4 = r6.f21546a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: na.c.e(long, ac.c, boolean):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.io.Serializable f(java.io.File r5, java.lang.String r6, ac.c r7) {
        /*
            java.lang.String r0 = "Bearer "
            boolean r1 = r7 instanceof na.r
            if (r1 == 0) goto L15
            r1 = r7
            na.r r1 = (na.r) r1
            int r2 = r1.f15740f
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.f15740f = r2
            goto L1a
        L15:
            na.r r1 = new na.r
            r1.<init>(r7)
        L1a:
            java.lang.Object r7 = r1.f15739e
            int r2 = r1.f15740f
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            java.io.File r5 = r1.f15738d
            ub.a.f(r7)     // Catch: java.lang.Throwable -> L9f
            goto L6b
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            ub.a.f(r7)
            h8.h r7 = a9.i.b()     // Catch: java.lang.Throwable -> L9f
            s8.h r2 = new s8.h     // Catch: java.lang.Throwable -> L9f
            com.cnl.kikoeru.MainApplication r4 = a9.i.a()     // Catch: java.lang.Throwable -> L9f
            r2.<init>(r4)     // Catch: java.lang.Throwable -> L9f
            r2.f19591c = r6     // Catch: java.lang.Throwable -> L9f
            java.lang.String r6 = a9.i.f()     // Catch: java.lang.Throwable -> L9f
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L9f
            r4.<init>(r0)     // Catch: java.lang.Throwable -> L9f
            r4.append(r6)     // Catch: java.lang.Throwable -> L9f
            java.lang.String r6 = r4.toString()     // Catch: java.lang.Throwable -> L9f
            r2.a(r6)     // Catch: java.lang.Throwable -> L9f
            java.lang.Boolean r6 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L9f
            r2.f19600l = r6     // Catch: java.lang.Throwable -> L9f
            s8.i r6 = r2.b()     // Catch: java.lang.Throwable -> L9f
            r1.f15738d = r5     // Catch: java.lang.Throwable -> L9f
            r1.f15740f = r3     // Catch: java.lang.Throwable -> L9f
            java.lang.Object r7 = r7.b(r6, r1)     // Catch: java.lang.Throwable -> L9f
            zb.a r6 = zb.a.f26667a
            if (r7 != r6) goto L6b
            return r6
        L6b:
            s8.j r7 = (s8.j) r7     // Catch: java.lang.Throwable -> L9f
            boolean r6 = r7 instanceof s8.o     // Catch: java.lang.Throwable -> L9f
            if (r6 == 0) goto L95
            s8.o r7 = (s8.o) r7     // Catch: java.lang.Throwable -> L9f
            android.graphics.drawable.Drawable r6 = r7.f19658a     // Catch: java.lang.Throwable -> L9f
            android.graphics.Bitmap r6 = nd.h.w(r6)     // Catch: java.lang.Throwable -> L9f
            java.io.FileOutputStream r7 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L9f
            r7.<init>(r5)     // Catch: java.lang.Throwable -> L9f
            android.graphics.Bitmap$CompressFormat r5 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch: java.lang.Throwable -> L8e
            r0 = 95
            boolean r5 = r6.compress(r5, r0, r7)     // Catch: java.lang.Throwable -> L8e
            r7.close()     // Catch: java.lang.Throwable -> L9f
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)     // Catch: java.lang.Throwable -> L9f
            return r5
        L8e:
            r5 = move-exception
            throw r5     // Catch: java.lang.Throwable -> L90
        L90:
            r6 = move-exception
            a.a.w(r7, r5)     // Catch: java.lang.Throwable -> L9f
            throw r6     // Catch: java.lang.Throwable -> L9f
        L95:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L9f
            java.lang.String r6 = r7.toString()     // Catch: java.lang.Throwable -> L9f
            r5.<init>(r6)     // Catch: java.lang.Throwable -> L9f
            throw r5     // Catch: java.lang.Throwable -> L9f
        L9f:
            r5 = move-exception
            ub.m r5 = ub.a.b(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: na.c.f(java.io.File, java.lang.String, ac.c):java.io.Serializable");
    }

    public static final Bitmap g(FileDescriptor fileDescriptor) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        int i10 = 1;
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFileDescriptor(fileDescriptor, null, options);
        options.inJustDecodeBounds = false;
        int i11 = options.outHeight;
        int i12 = options.outWidth;
        if (i11 > 1920 || i12 > 1080) {
            int i13 = i11 / 2;
            int i14 = i12 / 2;
            while (i13 / i10 >= 1920 && i14 / i10 >= 1080) {
                i10 *= 2;
            }
        }
        options.inSampleSize = i10;
        Bitmap bitmapDecodeFileDescriptor = BitmapFactory.decodeFileDescriptor(fileDescriptor, null, options);
        if (bitmapDecodeFileDescriptor == null) {
            throw new IllegalStateException("bitmap too large");
        }
        Matrix matrix = new Matrix();
        float f10 = 1080;
        float f11 = 1920;
        float fMax = Math.max(f10 / bitmapDecodeFileDescriptor.getWidth(), f11 / bitmapDecodeFileDescriptor.getHeight());
        matrix.postScale(fMax, fMax);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmapDecodeFileDescriptor, 0, 0, bitmapDecodeFileDescriptor.getWidth(), bitmapDecodeFileDescriptor.getHeight(), matrix, true);
        jc.l.d(bitmapCreateBitmap, "createBitmap(...)");
        bitmapDecodeFileDescriptor.recycle();
        float width = (bitmapDecodeFileDescriptor.getWidth() * fMax) - f10;
        float f12 = 2;
        float f13 = width / f12;
        if (f13 < 0.0f) {
            f13 = 0.0f;
        }
        float height = ((fMax * bitmapDecodeFileDescriptor.getHeight()) - f11) / f12;
        Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(bitmapCreateBitmap, (int) f13, (int) (height >= 0.0f ? height : 0.0f), 1080, 1920);
        jc.l.d(bitmapCreateBitmap2, "createBitmap(...)");
        bitmapCreateBitmap.recycle();
        return bitmapCreateBitmap2;
    }

    public static void h(a0.j jVar, j7.b bVar, f1.f fVar) {
        jc.l.e(jVar, "<this>");
        jc.l.e(bVar, "items");
        a0.c.C(jVar, bVar.c(), null, new f1.f(new j(fVar, bVar, 1), 2095528928, true), 4);
    }

    public static void i(Uri uri) {
        MainApplication mainApplicationA = a9.i.a();
        jc.l.e(uri, "uri");
        jc.l.e(mainApplicationA, "ctx");
        Intent intent = new Intent("android.intent.action.VIEW", uri);
        intent.addFlags(268435456);
        mainApplicationA.startActivity(intent);
    }

    public static final e1 j(d1 d1Var, d1 d1Var2, x0.o oVar) {
        jc.l.e(d1Var2, "other");
        float fC = d1Var2.c() + d1Var.c();
        float fA = d1Var2.a() + d1Var.a();
        o2 o2Var = l1.f9872n;
        return new e1(androidx.compose.foundation.layout.a.e(d1Var2, (f3.m) oVar.j(o2Var)) + androidx.compose.foundation.layout.a.e(d1Var, (f3.m) oVar.j(o2Var)), fC, androidx.compose.foundation.layout.a.d(d1Var2, (f3.m) oVar.j(o2Var)) + androidx.compose.foundation.layout.a.d(d1Var, (f3.m) oVar.j(o2Var)), fA);
    }

    public static final byte[] k(b4.a aVar) throws IOException {
        boolean zC;
        InputStream inputStreamOpenInputStream;
        switch (aVar.f1501a) {
            case 0:
                zC = a.a.C((MainApplication) aVar.f1503c, aVar.f1502b);
                break;
            default:
                zC = a.a.C(aVar.f1503c, aVar.f1502b);
                break;
        }
        if (!zC || aVar.d() || (inputStreamOpenInputStream = a9.i.a().getContentResolver().openInputStream(aVar.c())) == null) {
            return null;
        }
        try {
            byte[] bArrR = f0.R(inputStreamOpenInputStream);
            inputStreamOpenInputStream.close();
            return bArrR;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                a.a.w(inputStreamOpenInputStream, th2);
                throw th3;
            }
        }
    }

    public static final String l(a2 a2Var) {
        jc.l.e(a2Var, "<this>");
        String str = a2Var.E;
        if (str != null) {
            if (ef.n.y0(str)) {
                str = null;
            }
            if (str != null) {
                return str;
            }
        }
        return w.a(a2Var.f2823f);
    }

    public static void m(File file) throws IOException {
        OutputStream outputStreamOpenOutputStream;
        MainApplication mainApplicationA = a9.i.a();
        jc.l.e(file, "data");
        jc.l.e(mainApplicationA, "ctx");
        String strJ = j2.h0.j(Environment.DIRECTORY_PICTURES, "/Kikoeru");
        Uri uri = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
        ContentResolver contentResolver = mainApplicationA.getContentResolver();
        ContentValues contentValues = new ContentValues();
        contentValues.put("_display_name", file.getName());
        contentValues.put("mime_type", "image/jpeg");
        if (Build.VERSION.SDK_INT >= 29) {
            contentValues.put("relative_path", strJ);
        }
        Uri uriInsert = contentResolver.insert(uri, contentValues);
        if (uriInsert == null || (outputStreamOpenOutputStream = mainApplicationA.getContentResolver().openOutputStream(uriInsert)) == null) {
            return;
        }
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                f0.u(fileInputStream, outputStreamOpenOutputStream);
                fileInputStream.close();
                outputStreamOpenOutputStream.close();
            } finally {
            }
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                a.a.w(outputStreamOpenOutputStream, th2);
                throw th3;
            }
        }
    }

    public static final ic.k n(x0.o oVar) {
        Object objK = oVar.K();
        yb.c cVar = null;
        Object obj = x0.k.f24334a;
        if (objK == obj) {
            objK = x0.v.v(null);
            oVar.h0(objK);
        }
        w0 w0Var = (w0) objK;
        h.a aVar = new h.a(1);
        Object objK2 = oVar.K();
        if (objK2 == obj) {
            objK2 = new aa.d(w0Var, 22);
            oVar.h0(objK2);
        }
        e.h hVarL = a.a.L(aVar, (ic.k) objK2, oVar, 48);
        boolean zH = oVar.h(hVarL);
        Object objK3 = oVar.K();
        if (zH || objK3 == obj) {
            objK3 = new n(w0Var, hVarL, cVar, 0);
            oVar.h0(objK3);
        }
        return (ic.k) objK3;
    }
}
