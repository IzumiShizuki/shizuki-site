package nd;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.Spanned;
import androidx.lifecycle.r;
import bd.y0;
import com.tencent.bugly.beta.tinker.TinkerReport;
import hd.q0;
import hf.a0;
import hf.w1;
import ic.k;
import j1.q;
import j2.h0;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import jc.l;
import m0.b1;
import m0.c1;
import m0.t6;
import m0.v1;
import m4.p0;
import pc.f0;
import pd.c0;
import q.k0;
import q1.n0;
import sc.z1;
import se.w;
import ud.s;
import vb.m;
import vb.n;
import vc.i;
import w1.g0;
import w1.j;
import w1.u;
import w1.z;
import x0.o;
import x0.o2;
import x0.p1;
import yc.m0;
import yc.t;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static w1.f f15787a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static w1.f f15788b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static w1.f f15789c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static w1.f f15790d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static w1.f f15791e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static w1.f f15792f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static w1.f f15793g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static w1.f f15794h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static w1.f f15795i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static w1.f f15796j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static w1.f f15797k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static w1.f f15798l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static w1.f f15799m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static w1.f f15800n;

    public static final void a(int i10, k kVar, q qVar, ta.c cVar, o oVar) {
        l.e(kVar, "onValueChange");
        l.e(cVar, "currentColor");
        oVar.Y(621684011);
        int i11 = (oVar.f(qVar) ? 4 : 2) | i10 | (oVar.f(kVar) ? 32 : 16) | (oVar.f(cVar) ? 256 : 128);
        if ((i11 & 731) == 146 && oVar.z()) {
            oVar.Q();
        } else {
            float f10 = cVar.f20599c;
            o2 o2Var = c1.f12773a;
            v1 v1VarP = f0.p(((b1) oVar.j(o2Var)).f(), ((b1) oVar.j(o2Var)).f(), oVar, 1018);
            oVar.X(1157296644);
            boolean zF = oVar.f(kVar);
            Object objK = oVar.K();
            if (zF || objK == x0.k.f24334a) {
                objK = new k0(kVar, 4);
                oVar.h0(objK);
            }
            oVar.p(false);
            t6.b(f10, (k) objK, qVar, false, null, 0, null, v1VarP, oVar, (i11 << 6) & 896, 248);
        }
        p1 p1VarR = oVar.r();
        if (p1VarR == null) {
            return;
        }
        p1VarR.f24421d = new ua.a(qVar, kVar, cVar, i10);
    }

    public static final p1.d b(float f10, float f11, float f12, float f13, long j10) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j10 & 4294967295L));
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(fIntBitsToFloat2)));
        return new p1.d(f10, f11, f12, f13, jFloatToRawIntBits, jFloatToRawIntBits, jFloatToRawIntBits, jFloatToRawIntBits);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x003c -> B:18:0x003f). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(c2.i0 r7, ac.a r8) {
        /*
            boolean r0 = r8 instanceof t.d
            if (r0 == 0) goto L13
            r0 = r8
            t.d r0 = (t.d) r0
            int r1 = r0.f20068f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f20068f = r1
            goto L18
        L13:
            t.d r0 = new t.d
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f20067e
            int r1 = r0.f20068f
            r2 = 1
            if (r1 == 0) goto L2f
            if (r1 != r2) goto L27
            c2.i0 r7 = r0.f20066d
            ub.a.f(r8)
            goto L3f
        L27:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L2f:
            ub.a.f(r8)
        L32:
            r0.f20066d = r7
            r0.f20068f = r2
            java.lang.Object r8 = a0.c.y(r7, r0)
            zb.a r1 = zb.a.f26667a
            if (r8 != r1) goto L3f
            return r1
        L3f:
            c2.l r8 = (c2.l) r8
            int r1 = r8.f3312d
            java.lang.Object r8 = r8.f3309a
            r1 = r1 & 66
            if (r1 == 0) goto L32
            r1 = r8
            java.util.Collection r1 = (java.util.Collection) r1
            int r1 = r1.size()
            r3 = 0
            r4 = 0
        L52:
            if (r4 >= r1) goto L6b
            java.lang.Object r5 = r8.get(r4)
            c2.t r5 = (c2.t) r5
            boolean r6 = r5.b()
            if (r6 != 0) goto L32
            boolean r6 = r5.f3329h
            if (r6 != 0) goto L32
            boolean r5 = r5.f3325d
            if (r5 == 0) goto L32
            int r4 = r4 + 1
            goto L52
        L6b:
            java.lang.Object r7 = r8.get(r3)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: nd.h.c(c2.i0, ac.a):java.lang.Object");
    }

    public static final ArrayList d(ArrayList arrayList, Collection collection, t tVar) {
        l.e(collection, "oldValueParameters");
        arrayList.size();
        collection.size();
        ArrayList<ub.k> arrayListM0 = m.M0(arrayList, collection);
        ArrayList arrayList2 = new ArrayList(n.K(arrayListM0, 10));
        for (ub.k kVar : arrayListM0) {
            w wVar = (w) kVar.f21543a;
            y0 y0Var = (y0) kVar.f21544b;
            int i10 = y0Var.f2709f;
            zc.h annotations = y0Var.getAnnotations();
            be.e name = y0Var.getName();
            l.d(name, "getName(...)");
            boolean zE1 = y0Var.E1();
            boolean z10 = y0Var.f2711h;
            boolean z11 = y0Var.f2712i;
            w wVarF = y0Var.f2713j != null ? ie.d.j(tVar).g().f(wVar) : null;
            m0 m0VarM = y0Var.m();
            l.d(m0VarM, "getSource(...)");
            arrayList2.add(new y0(tVar, null, i10, annotations, name, wVar, zE1, z10, z11, wVarF, m0VarM));
        }
        return arrayList2;
    }

    public static final long e() {
        return Thread.currentThread().getId();
    }

    public static Bitmap f(byte[] bArr, int i10, int i11) throws IOException {
        BitmapFactory.Options options;
        int i12 = 0;
        int iE = 1;
        if (i11 != -1) {
            options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeByteArray(bArr, 0, i10, options);
            options.inJustDecodeBounds = false;
            options.inSampleSize = 1;
            for (int iMax = Math.max(options.outWidth, options.outHeight); iMax > i11; iMax /= 2) {
                options.inSampleSize *= 2;
            }
        } else {
            options = null;
        }
        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, i10, options);
        if (options != null) {
            options.inSampleSize = 1;
        }
        if (bitmapDecodeByteArray == null) {
            throw p0.a(new IllegalStateException(), "Could not decode image data");
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        try {
            e4.g gVar = new e4.g(byteArrayInputStream);
            byteArrayInputStream.close();
            e4.c cVarC = gVar.c("Orientation");
            if (cVarC != null) {
                try {
                    iE = cVarC.e(gVar.f6136f);
                } catch (NumberFormatException unused) {
                }
            }
            switch (iE) {
                case 3:
                case 4:
                    i12 = TinkerReport.KEY_APPLIED_VERSION_CHECK;
                    break;
                case 5:
                case TinkerReport.KEY_CRASH_CAUSE_XPOSED_DALVIK /* 8 */:
                    i12 = 270;
                    break;
                case 6:
                case 7:
                    i12 = 90;
                    break;
            }
            if (i12 == 0) {
                return bitmapDecodeByteArray;
            }
            Matrix matrix = new Matrix();
            matrix.postRotate(i12);
            return Bitmap.createBitmap(bitmapDecodeByteArray, 0, 0, bitmapDecodeByteArray.getWidth(), bitmapDecodeByteArray.getHeight(), matrix, false);
        } finally {
        }
    }

    public static final w1.f g() {
        w1.f fVar = f15789c;
        if (fVar != null) {
            return fVar;
        }
        w1.e eVar = new w1.e("Filled.Download", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i10 = g0.f23208a;
        n0 n0Var = new n0(q1.q.f17569b);
        q0 q0Var = new q0((byte) 0, 6);
        q0Var.u(5.0f, 20.0f);
        q0Var.r(14.0f);
        q0Var.z(-2.0f);
        q0Var.q(5.0f);
        q0Var.y(20.0f);
        q0Var.l();
        q0Var.u(19.0f, 9.0f);
        q0Var.r(-4.0f);
        q0Var.y(3.0f);
        q0Var.q(9.0f);
        q0Var.z(6.0f);
        q0Var.q(5.0f);
        q0Var.t(7.0f, 7.0f);
        q0Var.s(19.0f, 9.0f);
        q0Var.l();
        w1.e.a(eVar, q0Var.f8447b, 0, n0Var);
        w1.f fVarB = eVar.b();
        f15789c = fVarB;
        return fVarB;
    }

    public static final w1.f h() {
        w1.f fVar = f15790d;
        if (fVar != null) {
            return fVar;
        }
        w1.e eVar = new w1.e("Filled.FileDownloadOff", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i10 = g0.f23208a;
        n0 n0Var = new n0(q1.q.f17569b);
        q0 q0Var = new q0((byte) 0, 6);
        q0Var.u(9.0f, 6.17f);
        q0Var.y(3.0f);
        q0Var.r(6.0f);
        q0Var.z(6.0f);
        q0Var.r(4.0f);
        q0Var.t(-3.59f, 3.59f);
        q0Var.s(9.0f, 6.17f);
        q0Var.l();
        q0Var.u(21.19f, 21.19f);
        q0Var.s(2.81f, 2.81f);
        q0Var.s(1.39f, 4.22f);
        q0Var.s(6.17f, 9.0f);
        q0Var.q(5.0f);
        q0Var.t(7.0f, 7.0f);
        q0Var.t(0.59f, -0.59f);
        q0Var.s(15.17f, 18.0f);
        q0Var.q(5.0f);
        q0Var.z(2.0f);
        q0Var.r(12.17f);
        q0Var.t(2.61f, 2.61f);
        q0Var.s(21.19f, 21.19f);
        q0Var.l();
        w1.e.a(eVar, q0Var.f8447b, 0, n0Var);
        w1.f fVarB = eVar.b();
        f15790d = fVarB;
        return fVarB;
    }

    public static final w1.f i() {
        w1.f fVar = f15792f;
        if (fVar != null) {
            return fVar;
        }
        w1.e eVar = new w1.e("Filled.Image", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i10 = g0.f23208a;
        n0 n0Var = new n0(q1.q.f17569b);
        q0 q0Var = new q0((byte) 0, 6);
        q0Var.u(21.0f, 19.0f);
        q0Var.y(5.0f);
        q0Var.n(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        q0Var.q(5.0f);
        q0Var.n(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        q0Var.z(14.0f);
        q0Var.n(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        q0Var.r(14.0f);
        q0Var.n(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        q0Var.l();
        q0Var.u(8.5f, 13.5f);
        q0Var.t(2.5f, 3.01f);
        q0Var.s(14.5f, 12.0f);
        q0Var.t(4.5f, 6.0f);
        q0Var.q(5.0f);
        q0Var.t(3.5f, -4.5f);
        q0Var.l();
        w1.e.a(eVar, q0Var.f8447b, 0, n0Var);
        w1.f fVarB = eVar.b();
        f15792f = fVarB;
        return fVarB;
    }

    public static final w1.f j() {
        w1.f fVar = f15793g;
        if (fVar != null) {
            return fVar;
        }
        w1.e eVar = new w1.e("Filled.MoreVert", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i10 = g0.f23208a;
        n0 n0Var = new n0(q1.q.f17569b);
        q0 q0VarH = h0.h(12.0f, 8.0f);
        q0VarH.n(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        q0VarH.w(-0.9f, -2.0f, -2.0f, -2.0f);
        q0VarH.w(-2.0f, 0.9f, -2.0f, 2.0f);
        q0VarH.w(0.9f, 2.0f, 2.0f, 2.0f);
        q0VarH.l();
        q0VarH.u(12.0f, 10.0f);
        q0VarH.n(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        q0VarH.w(0.9f, 2.0f, 2.0f, 2.0f);
        q0VarH.w(2.0f, -0.9f, 2.0f, -2.0f);
        q0VarH.w(-0.9f, -2.0f, -2.0f, -2.0f);
        q0VarH.l();
        q0VarH.u(12.0f, 16.0f);
        q0VarH.n(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        q0VarH.w(0.9f, 2.0f, 2.0f, 2.0f);
        q0VarH.w(2.0f, -0.9f, 2.0f, -2.0f);
        q0VarH.w(-0.9f, -2.0f, -2.0f, -2.0f);
        q0VarH.l();
        w1.e.a(eVar, q0VarH.f8447b, 0, n0Var);
        w1.f fVarB = eVar.b();
        f15793g = fVarB;
        return fVarB;
    }

    public static final c0 k(yc.e eVar) {
        yc.e eVar2;
        yc.h hVarH;
        l.e(eVar, "<this>");
        int i10 = ie.d.f9520a;
        Iterator it = eVar.E().t().i().iterator();
        while (true) {
            if (!it.hasNext()) {
                eVar2 = null;
                break;
            }
            w wVar = (w) it.next();
            if (!i.x(wVar)) {
                hVarH = wVar.t().h();
                if (ee.e.m(hVarH, yc.f.f26109a) || ee.e.m(hVarH, yc.f.f26111c)) {
                    break;
                }
            }
        }
        l.c(hVarH, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
        eVar2 = (yc.e) hVarH;
        if (eVar2 == null) {
            return null;
        }
        le.o oVarK0 = eVar2.k0();
        c0 c0Var = oVarK0 instanceof c0 ? (c0) oVarK0 : null;
        return c0Var == null ? k(eVar2) : c0Var;
    }

    public static final w1.f l() {
        w1.f fVar = f15794h;
        if (fVar != null) {
            return fVar;
        }
        w1.e eVar = new w1.e("Filled.PlayArrow", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i10 = g0.f23208a;
        n0 n0Var = new n0(q1.q.f17569b);
        ArrayList arrayList = new ArrayList(32);
        arrayList.add(new w1.n(8.0f, 5.0f));
        arrayList.add(new z(14.0f));
        arrayList.add(new u(11.0f, -7.0f));
        arrayList.add(j.f23242c);
        w1.e.a(eVar, arrayList, 0, n0Var);
        w1.f fVarB = eVar.b();
        f15794h = fVarB;
        return fVarB;
    }

    public static final w1.f m() {
        w1.f fVar = f15796j;
        if (fVar != null) {
            return fVar;
        }
        w1.e eVar = new w1.e("Filled.Settings", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i10 = g0.f23208a;
        n0 n0Var = new n0(q1.q.f17569b);
        q0 q0VarH = h0.h(19.14f, 12.94f);
        q0VarH.n(0.04f, -0.3f, 0.06f, -0.61f, 0.06f, -0.94f);
        q0VarH.n(0.0f, -0.32f, -0.02f, -0.64f, -0.07f, -0.94f);
        q0VarH.t(2.03f, -1.58f);
        q0VarH.n(0.18f, -0.14f, 0.23f, -0.41f, 0.12f, -0.61f);
        q0VarH.t(-1.92f, -3.32f);
        q0VarH.n(-0.12f, -0.22f, -0.37f, -0.29f, -0.59f, -0.22f);
        q0VarH.t(-2.39f, 0.96f);
        q0VarH.n(-0.5f, -0.38f, -1.03f, -0.7f, -1.62f, -0.94f);
        q0VarH.s(14.4f, 2.81f);
        q0VarH.n(-0.04f, -0.24f, -0.24f, -0.41f, -0.48f, -0.41f);
        q0VarH.r(-3.84f);
        q0VarH.n(-0.24f, 0.0f, -0.43f, 0.17f, -0.47f, 0.41f);
        q0VarH.s(9.25f, 5.35f);
        q0VarH.m(8.66f, 5.59f, 8.12f, 5.92f, 7.63f, 6.29f);
        q0VarH.s(5.24f, 5.33f);
        q0VarH.n(-0.22f, -0.08f, -0.47f, 0.0f, -0.59f, 0.22f);
        q0VarH.s(2.74f, 8.87f);
        q0VarH.m(2.62f, 9.08f, 2.66f, 9.34f, 2.86f, 9.48f);
        q0VarH.t(2.03f, 1.58f);
        q0VarH.m(4.84f, 11.36f, 4.8f, 11.69f, 4.8f, 12.0f);
        q0VarH.w(0.02f, 0.64f, 0.07f, 0.94f);
        q0VarH.t(-2.03f, 1.58f);
        q0VarH.n(-0.18f, 0.14f, -0.23f, 0.41f, -0.12f, 0.61f);
        q0VarH.t(1.92f, 3.32f);
        q0VarH.n(0.12f, 0.22f, 0.37f, 0.29f, 0.59f, 0.22f);
        q0VarH.t(2.39f, -0.96f);
        q0VarH.n(0.5f, 0.38f, 1.03f, 0.7f, 1.62f, 0.94f);
        q0VarH.t(0.36f, 2.54f);
        q0VarH.n(0.05f, 0.24f, 0.24f, 0.41f, 0.48f, 0.41f);
        q0VarH.r(3.84f);
        q0VarH.n(0.24f, 0.0f, 0.44f, -0.17f, 0.47f, -0.41f);
        q0VarH.t(0.36f, -2.54f);
        q0VarH.n(0.59f, -0.24f, 1.13f, -0.56f, 1.62f, -0.94f);
        q0VarH.t(2.39f, 0.96f);
        q0VarH.n(0.22f, 0.08f, 0.47f, 0.0f, 0.59f, -0.22f);
        q0VarH.t(1.92f, -3.32f);
        q0VarH.n(0.12f, -0.22f, 0.07f, -0.47f, -0.12f, -0.61f);
        q0VarH.s(19.14f, 12.94f);
        q0VarH.l();
        q0VarH.u(12.0f, 15.6f);
        q0VarH.n(-1.98f, 0.0f, -3.6f, -1.62f, -3.6f, -3.6f);
        q0VarH.w(1.62f, -3.6f, 3.6f, -3.6f);
        q0VarH.w(3.6f, 1.62f, 3.6f, 3.6f);
        q0VarH.v(13.98f, 15.6f, 12.0f, 15.6f);
        q0VarH.l();
        w1.e.a(eVar, q0VarH.f8447b, 0, n0Var);
        w1.f fVarB = eVar.b();
        f15796j = fVarB;
        return fVarB;
    }

    public static final w1.f n() {
        w1.f fVar = f15797k;
        if (fVar != null) {
            return fVar;
        }
        w1.e eVar = new w1.e("Filled.Subtitles", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i10 = g0.f23208a;
        n0 n0Var = new n0(q1.q.f17569b);
        q0 q0Var = new q0((byte) 0, 6);
        q0Var.u(20.0f, 4.0f);
        q0Var.s(4.0f, 4.0f);
        q0Var.n(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        q0Var.z(12.0f);
        q0Var.n(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        q0Var.r(16.0f);
        q0Var.n(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        q0Var.s(22.0f, 6.0f);
        q0Var.n(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        q0Var.l();
        q0Var.u(4.0f, 12.0f);
        q0Var.r(4.0f);
        q0Var.z(2.0f);
        h0.t(q0Var, 4.0f, 14.0f, -2.0f);
        q0Var.u(14.0f, 18.0f);
        q0Var.s(4.0f, 18.0f);
        q0Var.z(-2.0f);
        q0Var.r(10.0f);
        q0Var.z(2.0f);
        q0Var.l();
        q0Var.u(20.0f, 18.0f);
        q0Var.r(-4.0f);
        q0Var.z(-2.0f);
        q0Var.r(4.0f);
        q0Var.z(2.0f);
        q0Var.l();
        q0Var.u(20.0f, 14.0f);
        q0Var.s(10.0f, 14.0f);
        q0Var.z(-2.0f);
        q0Var.r(10.0f);
        q0Var.z(2.0f);
        q0Var.l();
        w1.e.a(eVar, q0Var.f8447b, 0, n0Var);
        w1.f fVarB = eVar.b();
        f15797k = fVarB;
        return fVarB;
    }

    public static final boolean o(Spanned spanned, Class cls) {
        return spanned.nextSpanTransition(-1, spanned.length(), cls) != spanned.length();
    }

    public static boolean p(byte b10, int i10) {
        return ((1 << i10) & ((long) b10)) != 0;
    }

    public static final boolean q(p1.d dVar) {
        long j10 = dVar.f16491e;
        return (j10 >>> 32) == (4294967295L & j10) && j10 == dVar.f16492f && j10 == dVar.f16493g && j10 == dVar.f16494h;
    }

    public static z1 r(yc.c cVar, ic.a aVar) {
        if (aVar != null) {
            return new z1(cVar, aVar);
        }
        throw new IllegalArgumentException("Argument for @NotNull parameter 'initializer' of kotlin/reflect/jvm/internal/ReflectProperties.lazySoft must not be null");
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0061 A[PHI: r15
      0x0061: PHI (r15v6 int) = (r15v5 int), (r15v5 int), (r15v12 int) binds: [B:32:0x0065, B:37:0x0072, B:29:0x0060] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00bc A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object s(i7.c2 r11, n7.w r12, int r13, s7.e r14, ac.c r15) {
        /*
            Method dump skipped, instruction units count: 256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: nd.h.s(i7.c2, n7.w, int, s7.e, ac.c):java.lang.Object");
    }

    public static final Object t(ic.n nVar) {
        Thread.interrupted();
        return a0.C(yb.i.f26088a, new r(nVar, null));
    }

    public static final double u(double d10, double d11) {
        return Math.copySign(Math.pow(Math.abs(d10), d11), d10);
    }

    public static final Object v(nf.q qVar, boolean z10, nf.q qVar2, ic.n nVar) throws Throwable {
        Object sVar;
        Object objX;
        try {
            if (nVar instanceof ac.a) {
                jc.c0.c(2, nVar);
                sVar = nVar.q(qVar2, qVar);
            } else {
                sVar = s.E(nVar, qVar2, qVar);
            }
        } catch (hf.h0 e10) {
            Throwable th2 = e10.f8545a;
            qVar.W(new hf.s(th2, false));
            throw th2;
        } catch (Throwable th3) {
            sVar = new hf.s(th3, false);
        }
        zb.a aVar = zb.a.f26667a;
        if (sVar == aVar || (objX = qVar.X(sVar)) == a0.f8512e) {
            return aVar;
        }
        qVar.o0();
        if (!(objX instanceof hf.s)) {
            return a0.F(objX);
        }
        if (!z10) {
            Throwable th4 = ((hf.s) objX).f8586a;
            if ((th4 instanceof w1) && ((w1) th4).f8607a == qVar) {
                if (sVar instanceof hf.s) {
                    throw ((hf.s) sVar).f8586a;
                }
                return sVar;
            }
        }
        throw ((hf.s) objX).f8586a;
    }

    public static Bitmap w(Drawable drawable) {
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            if (bitmapDrawable.getBitmap() != null) {
                return (intrinsicWidth == bitmapDrawable.getBitmap().getWidth() && intrinsicHeight == bitmapDrawable.getBitmap().getHeight()) ? bitmapDrawable.getBitmap() : Bitmap.createScaledBitmap(bitmapDrawable.getBitmap(), intrinsicWidth, intrinsicHeight, true);
            }
            throw new IllegalArgumentException("bitmap is null");
        }
        Rect bounds = drawable.getBounds();
        int i10 = bounds.left;
        int i11 = bounds.top;
        int i12 = bounds.right;
        int i13 = bounds.bottom;
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, Bitmap.Config.ARGB_8888);
        drawable.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
        drawable.draw(new Canvas(bitmapCreateBitmap));
        drawable.setBounds(i10, i11, i12, i13);
        return bitmapCreateBitmap;
    }
}
