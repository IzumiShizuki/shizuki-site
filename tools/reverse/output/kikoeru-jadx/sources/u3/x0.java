package u3;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.os.StrictMode;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;
import c7.e1;
import com.cnl.kikoeru.data.db.AppDatabase;
import i7.r1;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.RejectedExecutionException;
import r.y1;
import sc.f2;
import sc.l1;
import sc.q1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public class x0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static w1.f f21346d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static w1.f f21347e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static w1.f f21348f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static w1.f f21349g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static w1.f f21350h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static w1.f f21351i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static w1.f f21352j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static w1.f f21353k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static w1.f f21354l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static w1.f f21355m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static w1.f f21356n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static w1.f f21357o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static w1.f f21358p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static w1.f f21359q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static w1.f f21360r;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21361a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Window f21362b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f21363c;

    public x0(Window window, y1 y1Var, int i10) {
        this.f21361a = i10;
        switch (i10) {
            case 1:
                this.f21363c = window.getInsetsController();
                this.f21362b = window;
                break;
            default:
                this.f21362b = window;
                this.f21363c = y1Var;
                break;
        }
    }

    public static final Object I(AppDatabase appDatabase, ic.k kVar, ac.c cVar) {
        n7.y yVar;
        lf.w0 w0Var = new lf.w0(10, new r1(appDatabase, kVar, null), (yb.c) null);
        n7.x xVar = (n7.x) cVar.s().R(n7.x.f15588c);
        yb.e eVar = xVar != null ? xVar.f15589a : null;
        if (eVar != null) {
            return hf.a0.H(eVar, w0Var, cVar);
        }
        yb.h hVarS = cVar.s();
        hf.k kVar2 = new hf.k(1, ud.s.p(cVar));
        kVar2.r();
        try {
            yVar = appDatabase.f15578d;
        } catch (RejectedExecutionException e10) {
            kVar2.t(new IllegalStateException("Unable to acquire a thread to perform the database transaction.", e10));
        }
        if (yVar != null) {
            yVar.execute(new c7.c0(hVarS, kVar2, appDatabase, w0Var, 1));
            return kVar2.q();
        }
        jc.l.k("internalTransactionExecutor");
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:104:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0172  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(v1.b r18, java.lang.String r19, j1.q r20, j1.d r21, g2.p r22, float r23, q1.k r24, x0.o r25, int r26, int r27) {
        /*
            Method dump skipped, instruction units count: 396
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: u3.x0.a(v1.b, java.lang.String, j1.q, j1.d, g2.p, float, q1.k, x0.o, int, int):void");
    }

    public static final long b(float f10, float f11) {
        return (((long) Float.floatToRawIntBits(f11)) & 4294967295L) | (Float.floatToRawIntBits(f10) << 32);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0104  */
    /* JADX WARN: Type inference failed for: r0v40, types: [java.lang.Object, ub.h] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final tc.g c(sc.l1 r6, boolean r7) {
        /*
            Method dump skipped, instruction units count: 558
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: u3.x0.c(sc.l1, boolean):tc.g");
    }

    public static void d(SpannableStringBuilder spannableStringBuilder, Object obj, int i10, int i11) {
        for (Object obj2 : spannableStringBuilder.getSpans(i10, i11, obj.getClass())) {
            if (spannableStringBuilder.getSpanStart(obj2) == i10 && spannableStringBuilder.getSpanEnd(obj2) == i11 && spannableStringBuilder.getSpanFlags(obj2) == 33) {
                spannableStringBuilder.removeSpan(obj2);
            }
        }
        spannableStringBuilder.setSpan(obj, i10, i11, 33);
    }

    public static void e(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static ug.r f(ug.r rVar, ug.r rVar2) {
        hd.q0 q0Var = new hd.q0((byte) 0, 5);
        int size = rVar.size();
        for (int i10 = 0; i10 < size; i10++) {
            String strI = rVar.i(i10);
            String strK = rVar.k(i10);
            if ((!"Warning".equalsIgnoreCase(strI) || !ef.u.k0(strK, "1", false)) && ("Content-Length".equalsIgnoreCase(strI) || "Content-Encoding".equalsIgnoreCase(strI) || "Content-Type".equalsIgnoreCase(strI) || !v(strI) || rVar2.a(strI) == null)) {
                q0Var.j(strI, strK);
            }
        }
        int size2 = rVar2.size();
        for (int i11 = 0; i11 < size2; i11++) {
            String strI2 = rVar2.i(i11);
            if (!"Content-Length".equalsIgnoreCase(strI2) && !"Content-Encoding".equalsIgnoreCase(strI2) && !"Content-Type".equalsIgnoreCase(strI2) && v(strI2)) {
                q0Var.j(strI2, rVar2.k(i11));
            }
        }
        return q0Var.k();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final tc.w g(sc.l1 r4, boolean r5, java.lang.reflect.Field r6) {
        /*
            Method dump skipped, instruction units count: 223
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: u3.x0.g(sc.l1, boolean, java.lang.reflect.Field):tc.w");
    }

    public static final boolean h(l1 l1Var) {
        return !se.u0.e(l1Var.v().r().b());
    }

    public static boolean i(File file, InputStream inputStream) throws Throwable {
        FileOutputStream fileOutputStream;
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                fileOutputStream = new FileOutputStream(file, false);
            } catch (IOException e10) {
                e = e10;
            }
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            byte[] bArr = new byte[1024];
            while (true) {
                int i10 = inputStream.read(bArr);
                if (i10 == -1) {
                    e(fileOutputStream);
                    StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
                    return true;
                }
                fileOutputStream.write(bArr, 0, i10);
            }
        } catch (IOException e11) {
            e = e11;
            fileOutputStream2 = fileOutputStream;
            Log.e("TypefaceCompatUtil", "Error copying resource contents to temp file: " + e.getMessage());
            e(fileOutputStream2);
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
            return false;
        } catch (Throwable th3) {
            th = th3;
            fileOutputStream2 = fileOutputStream;
            e(fileOutputStream2);
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
            throw th;
        }
    }

    public static String j(byte[] bArr, boolean z10, Charset charset) {
        if (charset != null) {
            return new String(bArr, charset);
        }
        if (z10) {
            return new String(bArr, tg.b.f20754a);
        }
        try {
            return new String(bArr, "Cp437");
        } catch (UnsupportedEncodingException unused) {
            return new String(bArr);
        }
    }

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
    public static final void k(s1.d dVar, t1.b bVar) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        float f10;
        q1.o oVarZ = dVar.S().z();
        t1.b bVar2 = (t1.b) dVar.S().f3619c;
        t1.d dVar2 = bVar.f20139a;
        if (bVar.f20157s) {
            return;
        }
        bVar.a();
        if (!dVar2.i()) {
            try {
                bVar.f20139a.G(bVar.f20140b, bVar.f20141c, bVar, bVar.f20143e);
            } catch (Throwable unused) {
            }
        }
        boolean z14 = dVar2.L() > 0.0f;
        if (z14) {
            oVarZ.u();
        }
        Canvas canvasA = q1.c.a(oVarZ);
        boolean zIsHardwareAccelerated = canvasA.isHardwareAccelerated();
        if (!zIsHardwareAccelerated) {
            long j10 = bVar.f20158t;
            float f11 = (int) (j10 >> 32);
            float f12 = (int) (j10 & 4294967295L);
            long j11 = bVar.f20159u;
            float f13 = ((int) (j11 >> 32)) + f11;
            float f14 = ((int) (j11 & 4294967295L)) + f12;
            float fA = dVar2.a();
            q1.k kVarS = dVar2.s();
            int iN = dVar2.N();
            if (fA < 1.0f || iN != 3 || kVarS != null || dVar2.r() == 1) {
                p4.p pVarH = bVar.f20154p;
                if (pVarH == null) {
                    pVarH = q1.h0.h();
                    bVar.f20154p = pVarH;
                }
                pVarH.g(fA);
                pVarH.h(iN);
                pVarH.j(kVarS);
                canvasA = canvasA;
                f10 = f11;
                canvasA.saveLayer(f10, f12, f13, f14, (Paint) pVarH.f16600b);
            } else {
                canvasA.save();
                canvasA = canvasA;
                f10 = f11;
            }
            canvasA.translate(f10, f12);
            canvasA.concat(dVar2.J());
        }
        boolean z15 = !zIsHardwareAccelerated && bVar.f20161w;
        if (z15) {
            oVarZ.f();
            q1.h0 h0VarD = bVar.d();
            if (h0VarD instanceof q1.c0) {
                oVarZ.m(((q1.c0) h0VarD).f17495e);
            } else if (h0VarD instanceof q1.d0) {
                q1.h hVarA = bVar.f20151m;
                if (hVarA != null) {
                    hVarA.f17511a.rewind();
                } else {
                    hVarA = q1.j.a();
                    bVar.f20151m = hVarA;
                }
                q.t0.f(hVarA, ((q1.d0) h0VarD).f17497e);
                oVarZ.n(hVarA);
            } else {
                if (!(h0VarD instanceof q1.b0)) {
                    throw new ce.j0();
                }
                oVarZ.n(((q1.b0) h0VarD).f17493e);
            }
        }
        if (bVar2 != null) {
            a0.v vVar = bVar2.f20156r;
            if (!vVar.f152a) {
                q1.y.a("Only add dependencies during a tracking");
            }
            o.l0 l0Var = (o.l0) vVar.f155d;
            if (l0Var != null) {
                l0Var.a(bVar);
            } else if (((t1.b) vVar.f153b) != null) {
                int i10 = o.t0.f16044a;
                o.l0 l0Var2 = new o.l0();
                t1.b bVar3 = (t1.b) vVar.f153b;
                jc.l.b(bVar3);
                l0Var2.a(bVar3);
                l0Var2.a(bVar);
                vVar.f155d = l0Var2;
                vVar.f153b = null;
            } else {
                vVar.f153b = bVar;
            }
            o.l0 l0Var3 = (o.l0) vVar.f156e;
            if (l0Var3 != null) {
                z13 = !l0Var3.l(bVar);
            } else if (((t1.b) vVar.f154c) != bVar) {
                z13 = true;
            } else {
                vVar.f154c = null;
                z13 = false;
            }
            if (z13) {
                bVar.f20155q++;
            }
        }
        if (q1.c.a(oVarZ).isHardwareAccelerated() || dVar2.K()) {
            z10 = z14;
            z11 = zIsHardwareAccelerated;
            z12 = z15;
            dVar2.v(oVarZ);
        } else {
            s1.b bVar4 = bVar.f20153o;
            if (bVar4 == null) {
                bVar4 = new s1.b();
                bVar.f20153o = bVar4;
            }
            e1 e1Var = bVar4.f19346b;
            f3.c cVar = bVar.f20140b;
            f3.m mVar = bVar.f20141c;
            long jR = gh.g.R(bVar.f20159u);
            f3.c cVarB = e1Var.B();
            f3.m mVarC = e1Var.C();
            q1.o oVarZ2 = e1Var.z();
            z10 = z14;
            z11 = zIsHardwareAccelerated;
            long jD = e1Var.D();
            z12 = z15;
            t1.b bVar5 = (t1.b) e1Var.f3619c;
            e1Var.b0(cVar);
            e1Var.c0(mVar);
            e1Var.a0(oVarZ);
            e1Var.e0(jR);
            e1Var.f3619c = bVar;
            oVarZ.f();
            try {
                bVar.c(bVar4);
            } finally {
                oVarZ.r();
                e1Var.b0(cVarB);
                e1Var.c0(mVarC);
                e1Var.a0(oVarZ2);
                e1Var.e0(jD);
                e1Var.f3619c = bVar5;
            }
        }
        if (z12) {
            oVarZ.r();
        }
        if (z10) {
            oVarZ.h();
        }
        if (z11) {
            return;
        }
        canvasA.restore();
    }

    public static final Object l(l1 l1Var) {
        q1 q1VarV = l1Var.v();
        return n7.e.f(q1VarV.f19861h, q1VarV.r());
    }

    public static final be.b m(yd.f fVar, int i10) {
        jc.l.e(fVar, "<this>");
        return lc.b.v(fVar.a(i10), fVar.b(i10));
    }

    public static final w1.f n() {
        w1.f fVar = f21348f;
        if (fVar != null) {
            return fVar;
        }
        w1.e eVar = new w1.e("Filled.DoneOutline", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i10 = w1.g0.f23208a;
        q1.n0 n0Var = new q1.n0(q1.q.f17569b);
        hd.q0 q0Var = new hd.q0((byte) 0, 6);
        ArrayList arrayList = q0Var.f8447b;
        q0Var.u(19.77f, 5.03f);
        q0Var.t(1.4f, 1.4f);
        q0Var.s(8.43f, 19.17f);
        q0Var.t(-5.6f, -5.6f);
        q0Var.t(1.4f, -1.4f);
        q0Var.t(4.2f, 4.2f);
        q0Var.s(19.77f, 5.03f);
        arrayList.add(new w1.v(0.0f, -2.83f));
        q0Var.s(8.43f, 13.54f);
        q0Var.t(-4.2f, -4.2f);
        q0Var.s(0.0f, 13.57f);
        q0Var.s(8.43f, 22.0f);
        q0Var.s(24.0f, 6.43f);
        q0Var.s(19.77f, 2.2f);
        q0Var.l();
        w1.e.a(eVar, arrayList, 0, n0Var);
        w1.f fVarB = eVar.b();
        f21348f = fVarB;
        return fVarB;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, ub.h] */
    public static final Field o(pc.u uVar) {
        jc.l.e(uVar, "<this>");
        q1 q1VarC = f2.c(uVar);
        if (q1VarC != null) {
            return (Field) q1VarC.f19862i.getValue();
        }
        return null;
    }

    public static final Method p(pc.f fVar) {
        tc.g gVarI;
        jc.l.e(fVar, "<this>");
        sc.u uVarA = f2.a(fVar);
        Member memberB = (uVarA == null || (gVarI = uVarA.i()) == null) ? null : gVarI.b();
        if (memberB instanceof Method) {
            return (Method) memberB;
        }
        return null;
    }

    public static final int q(Layout layout, int i10, boolean z10) {
        if (i10 <= 0) {
            return 0;
        }
        if (i10 >= layout.getText().length()) {
            return layout.getLineCount() - 1;
        }
        int lineForOffset = layout.getLineForOffset(i10);
        int lineStart = layout.getLineStart(lineForOffset);
        int lineEnd = layout.getLineEnd(lineForOffset);
        if (lineStart == i10 || lineEnd == i10) {
            if (lineStart == i10) {
                if (z10) {
                    return lineForOffset - 1;
                }
            } else if (!z10) {
                return lineForOffset + 1;
            }
        }
        return lineForOffset;
    }

    public static final be.e r(yd.f fVar, int i10) {
        jc.l.e(fVar, "<this>");
        return be.e.d(fVar.getString(i10));
    }

    public static final w1.f s() {
        w1.f fVar = f21355m;
        if (fVar != null) {
            return fVar;
        }
        w1.e eVar = new w1.e("Filled.Search", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i10 = w1.g0.f23208a;
        q1.n0 n0Var = new q1.n0(q1.q.f17569b);
        hd.q0 q0Var = new hd.q0((byte) 0, 6);
        q0Var.u(15.5f, 14.0f);
        q0Var.r(-0.79f);
        q0Var.t(-0.28f, -0.27f);
        q0Var.m(15.41f, 12.59f, 16.0f, 11.11f, 16.0f, 9.5f);
        q0Var.m(16.0f, 5.91f, 13.09f, 3.0f, 9.5f, 3.0f);
        q0Var.v(3.0f, 5.91f, 3.0f, 9.5f);
        q0Var.v(5.91f, 16.0f, 9.5f, 16.0f);
        q0Var.n(1.61f, 0.0f, 3.09f, -0.59f, 4.23f, -1.57f);
        q0Var.t(0.27f, 0.28f);
        q0Var.z(0.79f);
        q0Var.t(5.0f, 4.99f);
        q0Var.s(20.49f, 19.0f);
        q0Var.t(-4.99f, -5.0f);
        q0Var.l();
        q0Var.u(9.5f, 14.0f);
        q0Var.m(7.01f, 14.0f, 5.0f, 11.99f, 5.0f, 9.5f);
        q0Var.v(7.01f, 5.0f, 9.5f, 5.0f);
        q0Var.v(14.0f, 7.01f, 14.0f, 9.5f);
        q0Var.v(11.99f, 14.0f, 9.5f, 14.0f);
        q0Var.l();
        w1.e.a(eVar, q0Var.f8447b, 0, n0Var);
        w1.f fVarB = eVar.b();
        f21355m = fVarB;
        return fVarB;
    }

    public static final w1.f t() {
        w1.f fVar = f21356n;
        if (fVar != null) {
            return fVar;
        }
        w1.e eVar = new w1.e("Filled.Star", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i10 = w1.g0.f23208a;
        q1.n0 n0Var = new q1.n0(q1.q.f17569b);
        hd.q0 q0Var = new hd.q0((byte) 0, 6);
        q0Var.u(12.0f, 17.27f);
        q0Var.s(18.18f, 21.0f);
        q0Var.t(-1.64f, -7.03f);
        q0Var.s(22.0f, 9.24f);
        q0Var.t(-7.19f, -0.61f);
        q0Var.s(12.0f, 2.0f);
        q0Var.s(9.19f, 8.63f);
        q0Var.s(2.0f, 9.24f);
        q0Var.t(5.46f, 4.73f);
        q0Var.s(5.82f, 21.0f);
        q0Var.l();
        w1.e.a(eVar, q0Var.f8447b, 0, n0Var);
        w1.f fVarB = eVar.b();
        f21356n = fVarB;
        return fVarB;
    }

    public static boolean v(String str) {
        return ("Connection".equalsIgnoreCase(str) || "Keep-Alive".equalsIgnoreCase(str) || "Proxy-Authenticate".equalsIgnoreCase(str) || "Proxy-Authorization".equalsIgnoreCase(str) || "TE".equalsIgnoreCase(str) || "Trailers".equalsIgnoreCase(str) || "Transfer-Encoding".equalsIgnoreCase(str) || "Upgrade".equalsIgnoreCase(str)) ? false : true;
    }

    public static final long w(long j10, long j11, float f10) {
        float fL = android.support.v4.media.session.b.L(Float.intBitsToFloat((int) (j10 >> 32)), Float.intBitsToFloat((int) (j11 >> 32)), f10);
        float fL2 = android.support.v4.media.session.b.L(Float.intBitsToFloat((int) (j10 & 4294967295L)), Float.intBitsToFloat((int) (j11 & 4294967295L)), f10);
        return (((long) Float.floatToRawIntBits(fL)) << 32) | (((long) Float.floatToRawIntBits(fL2)) & 4294967295L);
    }

    public static MappedByteBuffer x(Context context, Uri uri) {
        ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor;
        try {
            parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(uri, "r", null);
        } catch (IOException unused) {
        }
        if (parcelFileDescriptorOpenFileDescriptor == null) {
            if (parcelFileDescriptorOpenFileDescriptor != null) {
                parcelFileDescriptorOpenFileDescriptor.close();
                return null;
            }
            return null;
        }
        try {
            FileInputStream fileInputStream = new FileInputStream(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor());
            try {
                FileChannel channel = fileInputStream.getChannel();
                MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                fileInputStream.close();
                parcelFileDescriptorOpenFileDescriptor.close();
                return map;
            } finally {
            }
        } finally {
        }
    }

    public static final Object y(Set set, Enum r22, Enum r32, Enum r42, boolean z10) {
        if (!z10) {
            if (r42 != null) {
                set = vb.m.K0(ud.e.K(set, r42));
            }
            return vb.m.y0(set);
        }
        Enum r12 = set.contains(r22) ? r22 : set.contains(r32) ? r32 : null;
        if (jc.l.a(r12, r22) && jc.l.a(r42, r32)) {
            return null;
        }
        return r42 == null ? r12 : r42;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00e3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final sf.a z(d0.y r6, pc.v r7, boolean r8) {
        /*
            Method dump skipped, instruction units count: 236
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: u3.x0.z(d0.y, pc.v, boolean):sf.a");
    }

    public void A(boolean z10) {
        switch (this.f21361a) {
            case 1:
                Window window = this.f21362b;
                if (!z10) {
                    if (window != null) {
                        H(16);
                    }
                    ((WindowInsetsController) this.f21363c).setSystemBarsAppearance(0, 16);
                } else {
                    if (window != null) {
                        F(16);
                    }
                    ((WindowInsetsController) this.f21363c).setSystemBarsAppearance(16, 16);
                }
                break;
        }
    }

    public void C(boolean z10) {
        switch (this.f21361a) {
            case 1:
                Window window = this.f21362b;
                if (!z10) {
                    if (window != null) {
                        H(8192);
                    }
                    ((WindowInsetsController) this.f21363c).setSystemBarsAppearance(0, 8);
                } else {
                    if (window != null) {
                        F(8192);
                    }
                    ((WindowInsetsController) this.f21363c).setSystemBarsAppearance(8, 8);
                }
                break;
        }
    }

    public void E() {
        switch (this.f21361a) {
            case 0:
                this.f21362b.getDecorView().setTag(356039078, 2);
                H(2048);
                F(4096);
                break;
            default:
                Window window = this.f21362b;
                if (window == null) {
                    ((WindowInsetsController) this.f21363c).setSystemBarsBehavior(2);
                } else {
                    window.getDecorView().setTag(356039078, 2);
                    H(2048);
                    F(4096);
                }
                break;
        }
    }

    public final void F(int i10) {
        switch (this.f21361a) {
            case 0:
                View decorView = this.f21362b.getDecorView();
                decorView.setSystemUiVisibility(i10 | decorView.getSystemUiVisibility());
                break;
            default:
                View decorView2 = this.f21362b.getDecorView();
                decorView2.setSystemUiVisibility(i10 | decorView2.getSystemUiVisibility());
                break;
        }
    }

    public final void G(int i10) {
        switch (this.f21361a) {
            case 0:
                for (int i11 = 1; i11 <= 512; i11 <<= 1) {
                    if ((i10 & i11) != 0) {
                        if (i11 == 1) {
                            H(4);
                            this.f21362b.clearFlags(1024);
                        } else if (i11 == 2) {
                            H(2);
                        } else if (i11 == 8) {
                            ((y1) ((y1) this.f21363c).f18634b).h0();
                        }
                    }
                }
                break;
            default:
                ((WindowInsetsController) this.f21363c).show(i10 & (-9));
                break;
        }
    }

    public final void H(int i10) {
        switch (this.f21361a) {
            case 0:
                View decorView = this.f21362b.getDecorView();
                decorView.setSystemUiVisibility((~i10) & decorView.getSystemUiVisibility());
                break;
            default:
                View decorView2 = this.f21362b.getDecorView();
                decorView2.setSystemUiVisibility((~i10) & decorView2.getSystemUiVisibility());
                break;
        }
    }

    public final void u(int i10) {
        switch (this.f21361a) {
            case 0:
                for (int i11 = 1; i11 <= 512; i11 <<= 1) {
                    if ((i10 & i11) != 0) {
                        if (i11 == 1) {
                            F(4);
                        } else if (i11 == 2) {
                            F(2);
                        } else if (i11 == 8) {
                            ((y1) ((y1) this.f21363c).f18634b).Z();
                        }
                    }
                }
                break;
            default:
                ((WindowInsetsController) this.f21363c).hide(i10 & (-9));
                break;
        }
    }

    public final void B(boolean z10) {
    }

    public final void D(boolean z10) {
    }
}
