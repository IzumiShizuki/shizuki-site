package a9;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import b7.b1;
import ba.f1;
import ba.z0;
import bg.o1;
import bg.s0;
import com.cnl.kikoeru.MainActivity;
import com.cnl.kikoeru.R;
import com.tencent.bugly.beta.tinker.TinkerReport;
import d9.v;
import hf.y;
import i7.e0;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import jc.z;
import la.l0;
import pc.f0;
import q.g1;
import ub.a0;
import ug.b0;
import ug.d0;
import vb.w;
import x0.e1;
import x0.p1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class k extends ac.i implements ic.n {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f244e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f245f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(int i10, Object obj, yb.c cVar) {
        super(2, cVar);
        this.f244e = i10;
        this.f245f = obj;
    }

    @Override // ac.a
    public final yb.c o(Object obj, yb.c cVar) {
        switch (this.f244e) {
            case 0:
                return new k(0, (Intent) this.f245f, cVar);
            case 1:
                return new k(1, (MainActivity) this.f245f, cVar);
            case 2:
                return new k(2, (Uri) this.f245f, cVar);
            case 3:
                return new k(3, (z0) this.f245f, cVar);
            case 4:
                return new k(4, (da.b) this.f245f, cVar);
            case 5:
                return new k(5, (e0) this.f245f, cVar);
            case 6:
                return new k(6, (j3.s) this.f245f, cVar);
            case 7:
                return new k(7, (s0) this.f245f, cVar);
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_DALVIK /* 8 */:
                return new k(8, (j9.f) this.f245f, cVar);
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_ART /* 9 */:
                return new k(9, (k8.d) this.f245f, cVar);
            case TinkerReport.KEY_APPLY_WITH_RETRY /* 10 */:
                return new k(10, (ka.k) this.f245f, cVar);
            case 11:
                return new k(11, (bg.t) this.f245f, cVar);
            case 12:
                return new k(12, (j2.f) this.f245f, cVar);
            case 13:
                return new k(13, (m9.c) this.f245f, cVar);
            case 14:
                return new k(14, (ma.e) this.f245f, cVar);
            case 15:
                return new k(15, (g1) this.f245f, cVar);
            case 16:
                return new k(16, (o1.r) this.f245f, cVar);
            case 17:
                return new k(17, (bg.p) this.f245f, cVar);
            case 18:
                return new k(18, (c9.a) this.f245f, cVar);
            default:
                return new k(19, (c9.b) this.f245f, cVar);
        }
    }

    @Override // ic.n
    public final Object q(Object obj, Object obj2) {
        switch (this.f244e) {
            case 0:
                k kVar = (k) o((y) obj, (yb.c) obj2);
                a0 a0Var = a0.f21526a;
                kVar.u(a0Var);
                return a0Var;
            case 1:
                k kVar2 = (k) o((y) obj, (yb.c) obj2);
                a0 a0Var2 = a0.f21526a;
                kVar2.u(a0Var2);
                return a0Var2;
            case 2:
                k kVar3 = (k) o((y) obj, (yb.c) obj2);
                a0 a0Var3 = a0.f21526a;
                kVar3.u(a0Var3);
                return a0Var3;
            case 3:
                return ((k) o((y) obj, (yb.c) obj2)).u(a0.f21526a);
            case 4:
                k kVar4 = (k) o((y) obj, (yb.c) obj2);
                a0 a0Var4 = a0.f21526a;
                kVar4.u(a0Var4);
                return a0Var4;
            case 5:
                k kVar5 = (k) o((lf.g) obj, (yb.c) obj2);
                a0 a0Var5 = a0.f21526a;
                kVar5.u(a0Var5);
                return a0Var5;
            case 6:
                k kVar6 = (k) o((y) obj, (yb.c) obj2);
                a0 a0Var6 = a0.f21526a;
                kVar6.u(a0Var6);
                return a0Var6;
            case 7:
                return ((k) o((y) obj, (yb.c) obj2)).u(a0.f21526a);
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_DALVIK /* 8 */:
                return ((k) o((y) obj, (yb.c) obj2)).u(a0.f21526a);
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_ART /* 9 */:
                return ((k) o((y) obj, (yb.c) obj2)).u(a0.f21526a);
            case TinkerReport.KEY_APPLY_WITH_RETRY /* 10 */:
                k kVar7 = (k) o((y) obj, (yb.c) obj2);
                a0 a0Var7 = a0.f21526a;
                kVar7.u(a0Var7);
                return a0Var7;
            case 11:
                k kVar8 = (k) o((y) obj, (yb.c) obj2);
                a0 a0Var8 = a0.f21526a;
                kVar8.u(a0Var8);
                return a0Var8;
            case 12:
                k kVar9 = (k) o((y) obj, (yb.c) obj2);
                a0 a0Var9 = a0.f21526a;
                kVar9.u(a0Var9);
                return a0Var9;
            case 13:
                k kVar10 = (k) o((y) obj, (yb.c) obj2);
                a0 a0Var10 = a0.f21526a;
                kVar10.u(a0Var10);
                return a0Var10;
            case 14:
                k kVar11 = (k) o((y) obj, (yb.c) obj2);
                a0 a0Var11 = a0.f21526a;
                kVar11.u(a0Var11);
                return a0Var11;
            case 15:
                k kVar12 = (k) o((y) obj, (yb.c) obj2);
                a0 a0Var12 = a0.f21526a;
                kVar12.u(a0Var12);
                return a0Var12;
            case 16:
                k kVar13 = (k) o((y) obj, (yb.c) obj2);
                a0 a0Var13 = a0.f21526a;
                kVar13.u(a0Var13);
                return a0Var13;
            case 17:
                return ((k) o((y) obj, (yb.c) obj2)).u(a0.f21526a);
            case 18:
                k kVar14 = (k) o((y) obj, (yb.c) obj2);
                a0 a0Var14 = a0.f21526a;
                kVar14.u(a0Var14);
                return a0Var14;
            default:
                k kVar15 = (k) o((y) obj, (yb.c) obj2);
                a0 a0Var15 = a0.f21526a;
                kVar15.u(a0Var15);
                return a0Var15;
        }
    }

    @Override // ac.a
    public final Object u(Object obj) {
        e7.a0 a0Var;
        String strB;
        Object objB;
        d0 d0VarF;
        String strB2;
        int i10 = 2;
        int i11 = 1;
        switch (this.f244e) {
            case 0:
                ub.a.f(obj);
                Intent intent = (Intent) this.f245f;
                try {
                    WeakReference weakReference = u.f266d;
                    if (weakReference != null && (a0Var = (e7.a0) weakReference.get()) != null) {
                        a0Var.a(intent);
                    }
                    break;
                } catch (Throwable th2) {
                    ub.a.b(th2);
                }
                return a0.f21526a;
            case 1:
                ub.a.f(obj);
                try {
                    MainActivity.i((MainActivity) this.f245f);
                    break;
                } catch (Throwable th3) {
                    ub.a.b(th3);
                }
                return a0.f21526a;
            case 2:
                a0 a0Var2 = a0.f21526a;
                ub.a.f(obj);
                Uri uri = (Uri) this.f245f;
                try {
                    File file = new File(i.a().getFilesDir(), "customBackground");
                    ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = i.a().getContentResolver().openFileDescriptor(uri, "r");
                    if (parcelFileDescriptorOpenFileDescriptor != null) {
                        try {
                            FileDescriptor fileDescriptor = parcelFileDescriptorOpenFileDescriptor.getFileDescriptor();
                            jc.l.d(fileDescriptor, "getFileDescriptor(...)");
                            Bitmap bitmapG = na.c.g(fileDescriptor);
                            FileOutputStream fileOutputStream = new FileOutputStream(file);
                            try {
                                bitmapG.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
                                fileOutputStream.close();
                                hg.b bVarP = f0.P(gg.c.a(), "defaultBackground", "", z.a(String.class));
                                String absolutePath = file.getAbsolutePath();
                                jc.l.d(absolutePath, "getAbsolutePath(...)");
                                bVarP.d(absolutePath);
                                parcelFileDescriptorOpenFileDescriptor.close();
                                objB = a0Var2;
                            } finally {
                            }
                        } finally {
                        }
                    }
                } catch (Throwable th4) {
                    objB = ub.a.b(th4);
                }
                Throwable thA = ub.n.a(objB);
                if (thA != null) {
                    thA.printStackTrace();
                    f0.P(gg.c.a(), "defaultBackground", "", z.a(String.class)).d("");
                    ka.n.c(na.q.g(R.string.modify_default_cover_failed), 0L, null, null, 511);
                }
                p1 p1Var = ka.b.f11244f;
                if (p1Var != null) {
                    p1Var.c();
                }
                return a0Var2;
            case 3:
                ub.a.f(obj);
                List list = (List) ua.l.W(i.c().r().f5571a, true, false, new d9.i(i11));
                boolean zA = jc.l.a(ba.y.f2508c, list);
                boolean z10 = !zA;
                if (!zA) {
                    jc.l.e(list, "<set-?>");
                    ba.y.f2508c = list;
                    z0 z0Var = (z0) this.f245f;
                    ub.p pVar = z0Var.f2525d;
                    if (z0Var.f2528g == null) {
                        ((f1) pVar.getValue()).b();
                    } else {
                        ((f1) pVar.getValue()).b();
                        ((f1) z0Var.f2526e.getValue()).b();
                        ((f1) z0Var.f2527f.getValue()).b();
                    }
                }
                return Boolean.valueOf(z10);
            case 4:
                ub.a.f(obj);
                Collections.fill(((da.b) this.f245f).f5636a, s2.a.f19357b);
                return a0.f21526a;
            case 5:
                ub.a.f(obj);
                ((e0) this.f245f).getClass();
                return a0.f21526a;
            case 6:
                ub.a.f(obj);
                ((j3.s) this.f245f).show();
                return a0.f21526a;
            case 7:
                ub.a.f(obj);
                String str = ag.z.f369a;
                Serializable serializableB = ag.z.b(i.f(), ((s0) this.f245f).f2964c);
                Throwable thA2 = ub.n.a(serializableB);
                if (thA2 != null) {
                    thA2.printStackTrace();
                }
                String str2 = (String) (serializableB instanceof ub.m ? null : serializableB);
                return str2 == null ? "" : str2;
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_DALVIK /* 8 */:
                ub.a.f(obj);
                e1 e1Var = h9.d.f8241a;
                j9.f fVar = (j9.f) this.f245f;
                h9.b bVarG = h9.d.g();
                if (bVarG == null) {
                    return null;
                }
                v vVar = (v) i.c().f4311p.getValue();
                c9.g gVar = new c9.g(0, bVarG.f8234a, (String) bVarG.f8235b, (String) bVarG.f8236c, fVar.f10688b, "", "");
                vVar.getClass();
                ua.l.W(vVar.f5608a, false, true, new d9.t(vVar, gVar, i10));
                return a0.f21526a;
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_ART /* 9 */:
                ub.a.f(obj);
                k8.d dVar = (k8.d) this.f245f;
                synchronized (dVar) {
                    if (!dVar.f11215l || dVar.f11216m) {
                        return a0.f21526a;
                    }
                    try {
                        dVar.B();
                        break;
                    } catch (IOException unused) {
                        dVar.f11217n = true;
                    }
                    try {
                        if ((dVar.f11212i >= 2000 ? 1 : 0) != 0) {
                            dVar.G();
                        }
                        break;
                    } catch (IOException unused2) {
                        dVar.f11218o = true;
                        dVar.f11213j = g8.a.k(new lh.d());
                    }
                    return a0.f21526a;
                }
            case TinkerReport.KEY_APPLY_WITH_RETRY /* 10 */:
                ub.a.f(obj);
                ka.n.f11286a.add((ka.k) this.f245f);
                return a0.f21526a;
            case 11:
                ub.a.f(obj);
                bg.t tVar = (bg.t) this.f245f;
                t9.a aVar = tVar instanceof bg.c ? t9.a.f20567c : tVar instanceof o1 ? t9.a.f20568d : tVar instanceof bg.e1 ? t9.a.f20569e : tVar instanceof la.a ? t9.a.f20570f : ((tVar instanceof l0) || (tVar instanceof la.b)) ? t9.a.f20566b : t9.a.f20565a;
                d9.j jVarR = i.c().r();
                ua.l.W(jVarR.f5571a, false, true, new d9.h(jVarR, new c9.b(0, aVar.name(), tVar.name()), i));
                ka.n.c(na.q.g(R.string.mark_success), 0L, null, null, 511);
                return a0.f21526a;
            case 12:
                ub.a.f(obj);
                return a0.f21526a;
            case 13:
                ub.a.f(obj);
                fg.f fVarD = i.d();
                Boolean bool = Boolean.TRUE;
                fVarD.setValue(bool);
                i.e().setValue(bool);
                d9.g gVar2 = (d9.g) i.c().f4312q.getValue();
                m9.c cVar = (m9.c) this.f245f;
                String str3 = (String) cVar.f14989b.getValue();
                hg.b bVar = cVar.f14990c;
                pc.u[] uVarArr = m9.c.f14988h;
                gVar2.a(new c9.a(0, str3, (String) bVar.c(uVarArr[0]), (String) cVar.f14991d.c(uVarArr[1]), (String) cVar.f14992e.c(uVarArr[2]), System.currentTimeMillis()));
                return a0.f21526a;
            case 14:
                ub.a.f(obj);
                ma.e eVar = (ma.e) this.f245f;
                eVar.f15060b.setValue(null);
                eVar.f15061c.setValue(null);
                eVar.f15062d.setValue("");
                return a0.f21526a;
            case 15:
                ub.a.f(obj);
                g1 g1Var = (g1) this.f245f;
                if (g1Var.f17308g.isEmpty()) {
                    g1Var.f17303b.f17422j.k(g1Var.f17302a);
                }
                return a0.f21526a;
            case 16:
                ub.a.f(obj);
                o1.r.b((o1.r) this.f245f);
                return a0.f21526a;
            case 17:
                a0 a0Var3 = a0.f21526a;
                ub.a.f(obj);
                bg.p pVar2 = (bg.p) this.f245f;
                String str4 = pVar2.f2937a;
                String str5 = pVar2.f2943g;
                int i12 = pVar2.f2939c;
                String str6 = pVar2.f2942f;
                if (str4.length() == 0) {
                    String str7 = ag.z.f369a;
                    String strF = i.f();
                    vb.r rVar = vb.r.f22819a;
                    jc.l.e(strF, "token");
                    jc.l.e(str6, "name");
                    jc.l.e(str5, "description");
                    i4.d dVar2 = new i4.d(5);
                    ud.s.w(dVar2, "name", str6);
                    ud.s.v(dVar2, "privacy", Integer.valueOf(i12));
                    ud.s.w(dVar2, "locale", "zh-CN");
                    ud.s.w(dVar2, "description", str5);
                    dVar2.d("works", new xf.e(new ArrayList(vb.n.K(rVar, 10))));
                    xf.y yVarC = dVar2.c();
                    String strConcat = ag.z.f369a.concat("/api/playlist/create-playlist");
                    if (jc.l.a(yVarC.f25022a, a0Var3)) {
                        strB2 = "";
                    } else {
                        xf.b bVar2 = xf.c.f24987d;
                        strB2 = bVar2.b(n7.e.A(bVar2.f24989b, z.a(xf.y.class)), yVarC);
                    }
                    ch.l lVarD = a0.c.D(strConcat);
                    lVarD.w("authorization", "Bearer ".concat(strF));
                    ug.z zVar = b0.f21724a;
                    ef.l lVar = ug.v.f21877c;
                    lVarD.z(ud.e.q(strB2, w.h("application/json")));
                    try {
                        d0VarF = ag.z.f370b.a(new b1(lVarD)).f();
                    } catch (Throwable th5) {
                        objB = ub.a.b(th5);
                    }
                    try {
                        ug.f0 f0Var = d0VarF.f21762g;
                        jc.l.b(f0Var);
                        String strN = f0Var.n();
                        if (d0VarF.f21759d != 200) {
                            throw new IllegalStateException(strN.toString());
                        }
                        xf.r rVar2 = ag.z.f371c;
                        objB = rVar2.a(strN, n7.e.A(rVar2.f24989b, z.a(bg.p.class)));
                        d0VarF.close();
                        if (!(objB instanceof ub.m)) {
                            ka.n.c(na.q.g(R.string.playlist_create_success), 0L, null, null, 511);
                        }
                        Throwable thA3 = ub.n.a(objB);
                        if (thA3 != null && !na.q.k(thA3)) {
                            ka.n.c(thA3, 3000L, null, null, 510);
                        }
                    } finally {
                    }
                } else {
                    String str8 = ag.z.f369a;
                    String strF2 = i.f();
                    jc.l.e(strF2, "token");
                    String str9 = pVar2.f2937a;
                    jc.l.e(str9, "id");
                    jc.l.e(str6, "name");
                    jc.l.e(str5, "description");
                    i4.d dVar3 = new i4.d(5);
                    ud.s.w(dVar3, "id", str9);
                    i4.d dVar4 = new i4.d(5);
                    ud.s.w(dVar4, "name", str6);
                    ud.s.v(dVar4, "privacy", Integer.valueOf(i12));
                    ud.s.w(dVar4, "description", str5);
                    dVar3.d("data", dVar4.c());
                    xf.y yVarC2 = dVar3.c();
                    String strConcat2 = ag.z.f369a.concat("/api/playlist/edit-playlist-metadata");
                    if (jc.l.a(yVarC2.f25022a, a0Var3)) {
                        strB = "";
                    } else {
                        xf.b bVar3 = xf.c.f24987d;
                        strB = bVar3.b(n7.e.A(bVar3.f24989b, z.a(xf.y.class)), yVarC2);
                    }
                    ch.l lVarD2 = a0.c.D(strConcat2);
                    lVarD2.w("authorization", "Bearer ".concat(strF2));
                    ug.z zVar2 = b0.f21724a;
                    ef.l lVar2 = ug.v.f21877c;
                    lVarD2.z(ud.e.q(strB, w.h("application/json")));
                    try {
                        d0VarF = ag.z.f370b.a(new b1(lVarD2)).f();
                    } catch (Throwable th6) {
                        objB = ub.a.b(th6);
                    }
                    try {
                        ug.f0 f0Var2 = d0VarF.f21762g;
                        jc.l.b(f0Var2);
                        String strN2 = f0Var2.n();
                        if (d0VarF.f21759d != 200) {
                            throw new IllegalStateException(strN2.toString());
                        }
                        xf.r rVar3 = ag.z.f371c;
                        objB = rVar3.a(strN2, n7.e.A(rVar3.f24989b, z.a(bg.p.class)));
                        d0VarF.close();
                        if (!(objB instanceof ub.m)) {
                            ka.n.c(na.q.g(R.string.playlist_edit_success), 0L, null, null, 511);
                        }
                        Throwable thA4 = ub.n.a(objB);
                        if (thA4 != null && !na.q.k(thA4)) {
                            ka.n.c(thA4, 3000L, null, null, 510);
                        }
                    } finally {
                        try {
                            throw th;
                        } finally {
                        }
                    }
                }
                return new ub.n(objB);
            case 18:
                ub.a.f(obj);
                d9.g gVar3 = (d9.g) i.c().f4312q.getValue();
                c9.a aVar2 = (c9.a) this.f245f;
                gVar3.getClass();
                jc.l.e(aVar2, "bean");
                ua.l.W(gVar3.f5563a, false, true, new d9.a(gVar3, aVar2, i));
                return a0.f21526a;
            default:
                ub.a.f(obj);
                d9.j jVarR2 = i.c().r();
                c9.b bVar4 = (c9.b) this.f245f;
                jVarR2.getClass();
                jc.l.e(bVar4, "bean");
                ua.l.W(jVarR2.f5571a, false, true, new d9.h(jVarR2, bVar4, i10));
                return a0.f21526a;
        }
    }
}
