package t9;

import a9.t;
import com.cnl.kikoeru.R;
import com.tencent.bugly.beta.tinker.TinkerReport;
import hd.q0;
import hf.y;
import ic.n;
import ic.o;
import j2.h0;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import jc.l;
import jc.z;
import m0.z8;
import na.q;
import na.w;
import pc.f0;
import q1.n0;
import q9.j0;
import ub.a0;
import w1.g0;
import w1.i0;
import x0.k;
import x0.r0;
import x0.v;
import x0.w0;
import y.k1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20585a;

    public /* synthetic */ h(int i10) {
        this.f20585a = i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x029d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object f(java.lang.Object r30, java.lang.Object r31, java.lang.Object r32) {
        /*
            Method dump skipped, instruction units count: 736
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: t9.h.f(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    private final Object h(Object obj, Object obj2, Object obj3) {
        x0.o oVar = (x0.o) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        l.e((y8.i) obj, "$this$prefsItem");
        if (oVar.N(iIntValue & 1, (iIntValue & 17) != 16)) {
            Object objK = oVar.K();
            r0 r0Var = k.f24334a;
            if (objK == r0Var) {
                objK = v.m(oVar);
                oVar.h0(objK);
            }
            y yVar = (y) objK;
            ic.k kVarN = na.c.n(oVar);
            Object objK2 = oVar.K();
            if (objK2 == r0Var) {
                objK2 = lc.b.G("documentUri", "", gg.c.a(), false, z.a(String.class));
                oVar.h0(objK2);
            }
            fg.f fVar = (fg.f) objK2;
            String strG = q.g(R.string.export_path);
            String str = (String) fVar.getValue();
            boolean zH = oVar.h(yVar) | oVar.h(kVarN);
            Object objK3 = oVar.K();
            if (zH || objK3 == r0Var) {
                objK3 = new ba.c((Object) yVar, (Object) kVarN, (Object) fVar, 28);
                oVar.h0(objK3);
            }
            z8.a.a(strG, null, str, false, false, (ic.a) objK3, 0L, false, null, null, oVar, 0, 986);
        } else {
            oVar.Q();
        }
        return a0.f21526a;
    }

    /* JADX WARN: Type inference failed for: r1v131, types: [java.lang.Object, java.util.Map] */
    @Override // ic.o
    public final Object g(Object obj, Object obj2, Object obj3) {
        int i10 = this.f20585a;
        int i11 = 6;
        yb.c cVar = null;
        int i12 = 2;
        r0 r0Var = k.f24334a;
        a0 a0Var = a0.f21526a;
        int i13 = 1;
        switch (i10) {
            case 0:
                x0.o oVar = (x0.o) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                l.e((k1) obj, "$this$TextButton");
                if (oVar.N(iIntValue & 1, (iIntValue & 17) != 16)) {
                    z8.b(q.g(R.string.btn_confirm), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, oVar, 0, 0, 131070);
                } else {
                    oVar.Q();
                }
                return a0Var;
            case 1:
                x0.o oVar2 = (x0.o) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                l.e((k1) obj, "$this$TextButton");
                if (oVar2.N(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    z8.b(q.g(R.string.btn_cancel), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, oVar2, 0, 0, 131070);
                } else {
                    oVar2.Q();
                }
                return a0Var;
            case 2:
                x0.o oVar3 = (x0.o) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                l.e((y8.i) obj, "$this$prefsItem");
                if (oVar3.N(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    i0 i0VarC = w1.b.c(nh.a.n(), oVar3);
                    Object objK = oVar3.K();
                    if (objK == r0Var) {
                        objK = new j0(13);
                        oVar3.h0(objK);
                    }
                    ka.b.g(null, i0VarC, 0L, "删除kikoeru.db", null, (ic.a) objK, oVar3, 199744, 21);
                } else {
                    oVar3.Q();
                }
                return a0Var;
            case 3:
                x0.o oVar4 = (x0.o) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                l.e((y8.i) obj, "$this$prefsItem");
                if (oVar4.N(1 & iIntValue4, (iIntValue4 & 17) != 16)) {
                    Object objK2 = oVar4.K();
                    if (objK2 == r0Var) {
                        objK2 = v.m(oVar4);
                        oVar4.h0(objK2);
                    }
                    y yVar = (y) objK2;
                    h.a aVar = new h.a(i12);
                    boolean zH = oVar4.h(yVar);
                    Object objK3 = oVar4.K();
                    if (zH || objK3 == r0Var) {
                        objK3 = new aa.e(yVar, i11);
                        oVar4.h0(objK3);
                    }
                    e.h hVarL = a.a.L(aVar, (ic.k) objK3, oVar4, 0);
                    i0 i0VarC2 = w1.b.c(nd.h.g(), oVar4);
                    boolean zH2 = oVar4.h(hVarL);
                    Object objK4 = oVar4.K();
                    if (zH2 || objK4 == r0Var) {
                        objK4 = new aa.c(hVarL, 2);
                        oVar4.h0(objK4);
                    }
                    ka.b.g(null, i0VarC2, 0L, "导入kikoeru.db", null, (ic.a) objK4, oVar4, 3136, 21);
                } else {
                    oVar4.Q();
                }
                return a0Var;
            case 4:
                x0.o oVar5 = (x0.o) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                l.e((y8.i) obj, "$this$prefsItem");
                if (oVar5.N(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    i0 i0VarC3 = w1.b.c(nh.a.w(), oVar5);
                    Object objK5 = oVar5.K();
                    if (objK5 == r0Var) {
                        objK5 = new j0(11);
                        oVar5.h0(objK5);
                    }
                    ka.b.g(null, i0VarC3, 0L, "导出kikoeru.db", null, (ic.a) objK5, oVar5, 199744, 21);
                } else {
                    oVar5.Q();
                }
                return a0Var;
            case 5:
                x0.o oVar6 = (x0.o) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                l.e((y8.i) obj, "$this$prefsItem");
                if (oVar6.N(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                    Object objK6 = oVar6.K();
                    if (objK6 == r0Var) {
                        objK6 = v.v(0L);
                        oVar6.h0(objK6);
                    }
                    w0 w0Var = (w0) objK6;
                    Object objK7 = oVar6.K();
                    if (objK7 == r0Var) {
                        objK7 = new p9.e(w0Var, cVar, i12);
                        oVar6.h0(objK7);
                    }
                    v.e((n) objK7, a0Var, oVar6);
                    z8.a.a(h0.x("mmkv.default 大小：", w.l(((Number) w0Var.getValue()).longValue())), null, "包含所有偏好设置，当前登陆的账号信息", false, false, null, 0L, false, v9.a.f22788a, null, oVar6, 100663680, 762);
                } else {
                    oVar6.Q();
                }
                return a0Var;
            case 6:
                x0.o oVar7 = (x0.o) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                l.e((y8.i) obj, "$this$prefsItem");
                if (oVar7.N(iIntValue7 & 1, (iIntValue7 & 17) != 16)) {
                    i0 i0VarC4 = w1.b.c(nh.a.n(), oVar7);
                    Object objK8 = oVar7.K();
                    if (objK8 == r0Var) {
                        objK8 = new j0(12);
                        oVar7.h0(objK8);
                    }
                    ka.b.g(null, i0VarC4, 0L, "删除mmkv.default", null, (ic.a) objK8, oVar7, 199744, 21);
                } else {
                    oVar7.Q();
                }
                return a0Var;
            case 7:
                x0.o oVar8 = (x0.o) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                l.e((y8.i) obj, "$this$prefsItem");
                if (oVar8.N(iIntValue8 & 1, (iIntValue8 & 17) != 16)) {
                    Object objK9 = oVar8.K();
                    if (objK9 == r0Var) {
                        objK9 = v.m(oVar8);
                        oVar8.h0(objK9);
                    }
                    y yVar2 = (y) objK9;
                    h.a aVar2 = new h.a(i12);
                    boolean zH3 = oVar8.h(yVar2);
                    Object objK10 = oVar8.K();
                    if (zH3 || objK10 == r0Var) {
                        objK10 = new aa.e(yVar2, 5);
                        oVar8.h0(objK10);
                    }
                    e.h hVarL2 = a.a.L(aVar2, (ic.k) objK10, oVar8, 0);
                    i0 i0VarC5 = w1.b.c(nd.h.g(), oVar8);
                    boolean zH4 = oVar8.h(hVarL2);
                    Object objK11 = oVar8.K();
                    if (zH4 || objK11 == r0Var) {
                        objK11 = new aa.c(hVarL2, 1);
                        oVar8.h0(objK11);
                    }
                    ka.b.g(null, i0VarC5, 0L, "导入mmkv.default", null, (ic.a) objK11, oVar8, 3136, 21);
                } else {
                    oVar8.Q();
                }
                return a0Var;
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_DALVIK /* 8 */:
                x0.o oVar9 = (x0.o) obj2;
                int iIntValue9 = ((Integer) obj3).intValue();
                l.e((y8.i) obj, "$this$prefsItem");
                if (oVar9.N(iIntValue9 & 1, (iIntValue9 & 17) != 16)) {
                    i0 i0VarC6 = w1.b.c(nh.a.w(), oVar9);
                    Object objK12 = oVar9.K();
                    if (objK12 == r0Var) {
                        objK12 = new j0(14);
                        oVar9.h0(objK12);
                    }
                    ka.b.g(null, i0VarC6, 0L, "导出mmkv.default", null, (ic.a) objK12, oVar9, 199744, 21);
                } else {
                    oVar9.Q();
                }
                return a0Var;
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_ART /* 9 */:
                x0.o oVar10 = (x0.o) obj2;
                int iIntValue10 = ((Integer) obj3).intValue();
                l.e((y8.i) obj, "$this$prefsItem");
                if (oVar10.N(iIntValue10 & 1, (iIntValue10 & 17) != 16)) {
                    Object objK13 = oVar10.K();
                    if (objK13 == r0Var) {
                        objK13 = v.v(0L);
                        oVar10.h0(objK13);
                    }
                    w0 w0Var2 = (w0) objK13;
                    Object objK14 = oVar10.K();
                    if (objK14 == r0Var) {
                        objK14 = new p9.e(w0Var2, cVar, i13);
                        oVar10.h0(objK14);
                    }
                    v.e((n) objK14, a0Var, oVar10);
                    z8.a.a(h0.x("kikoeru.db 大小：", w.l(((Number) w0Var2.getValue()).longValue())), null, "包含下载文件目录，历史记录，屏蔽记录，账号信息，本地字幕", false, false, null, 0L, false, v9.a.f22793f, null, oVar10, 100663680, 762);
                } else {
                    oVar10.Q();
                }
                return a0Var;
            case TinkerReport.KEY_APPLY_WITH_RETRY /* 10 */:
                x0.o oVar11 = (x0.o) obj2;
                int iIntValue11 = ((Integer) obj3).intValue();
                l.e((y8.i) obj, "$this$prefsItem");
                if (oVar11.N(1 & iIntValue11, (iIntValue11 & 17) != 16)) {
                    Object objK15 = oVar11.K();
                    if (objK15 == r0Var) {
                        objK15 = v.m(oVar11);
                        oVar11.h0(objK15);
                    }
                    y yVar3 = (y) objK15;
                    w1.f fVarB = n7.d.f15442d;
                    if (fVarB == null) {
                        w1.e eVar = new w1.e("Filled.DeleteSweep", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                        int i14 = g0.f23208a;
                        n0 n0Var = new n0(q1.q.f17569b);
                        q0 q0Var = new q0((byte) 0, 6);
                        q0Var.u(15.0f, 16.0f);
                        q0Var.r(4.0f);
                        q0Var.z(2.0f);
                        q0Var.r(-4.0f);
                        q0Var.l();
                        q0Var.u(15.0f, 8.0f);
                        q0Var.r(7.0f);
                        q0Var.z(2.0f);
                        q0Var.r(-7.0f);
                        q0Var.l();
                        q0Var.u(15.0f, 12.0f);
                        q0Var.r(6.0f);
                        q0Var.z(2.0f);
                        q0Var.r(-6.0f);
                        q0Var.l();
                        q0Var.u(3.0f, 18.0f);
                        q0Var.n(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
                        q0Var.r(6.0f);
                        q0Var.n(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
                        q0Var.s(13.0f, 8.0f);
                        h0.t(q0Var, 3.0f, 8.0f, 10.0f);
                        q0Var.u(14.0f, 5.0f);
                        q0Var.r(-3.0f);
                        q0Var.t(-1.0f, -1.0f);
                        q0Var.s(6.0f, 4.0f);
                        q0Var.s(5.0f, 5.0f);
                        q0Var.s(2.0f, 5.0f);
                        q0Var.z(2.0f);
                        q0Var.r(12.0f);
                        q0Var.l();
                        w1.e.a(eVar, q0Var.f8447b, 0, n0Var);
                        fVarB = eVar.b();
                        n7.d.f15442d = fVarB;
                    }
                    i0 i0VarC7 = w1.b.c(fVarB, oVar11);
                    boolean zH5 = oVar11.h(yVar3);
                    Object objK16 = oVar11.K();
                    if (zH5 || objK16 == r0Var) {
                        objK16 = new ba.d(yVar3, 7, z);
                        oVar11.h0(objK16);
                    }
                    ka.b.g(null, i0VarC7, 0L, "删除所有本地字幕", null, (ic.a) objK16, oVar11, 3136, 21);
                } else {
                    oVar11.Q();
                }
                return a0Var;
            case 11:
                x0.o oVar12 = (x0.o) obj2;
                int iIntValue12 = ((Integer) obj3).intValue();
                l.e((k1) obj, "$this$TextButton");
                if (oVar12.N(iIntValue12 & 1, (iIntValue12 & 17) != 16)) {
                    z8.b(q.g(R.string.btn_cancel), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, oVar12, 0, 0, 131070);
                } else {
                    oVar12.Q();
                }
                return a0Var;
            case 12:
                x0.o oVar13 = (x0.o) obj2;
                int iIntValue13 = ((Integer) obj3).intValue();
                l.e((k1) obj, "$this$TextButton");
                if (oVar13.N(iIntValue13 & 1, (iIntValue13 & 17) != 16)) {
                    z8.b(q.g(R.string.btn_confirm), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, oVar13, 0, 0, 131070);
                } else {
                    oVar13.Q();
                }
                return a0Var;
            case 13:
                x0.o oVar14 = (x0.o) obj2;
                int iIntValue14 = ((Integer) obj3).intValue();
                l.e((y8.i) obj, "$this$prefsItem");
                if (oVar14.N(iIntValue14 & 1, (iIntValue14 & 17) != 16)) {
                    String strG = q.g(R.string.translate_engine);
                    Object objK17 = oVar14.K();
                    if (objK17 == r0Var) {
                        Set<String> setKeySet = oa.f.f16296c.keySet();
                        ArrayList arrayList = new ArrayList(vb.n.K(setKeySet, 10));
                        for (String str : setKeySet) {
                            arrayList.add(new ub.k(str, str));
                        }
                        objK17 = vb.w.A(arrayList);
                        oVar14.h0(objK17);
                    }
                    z8.c.a("translateEngine", strG, null, "google", true, 0L, false, (Map) objK17, oVar14, 1597446);
                    oVar14.W(500600386);
                    hg.a aVarA = gg.c.a();
                    jc.y yVar4 = new jc.y();
                    oVar14.W(1849434622);
                    Object objK18 = oVar14.K();
                    if (objK18 == r0Var) {
                        objK18 = lc.b.G("translateEngine", "google", aVarA, true, z.a(String.class));
                        oVar14.h0(objK18);
                    }
                    fg.f fVar = (fg.f) objK18;
                    oVar14.p(false);
                    yVar4.f10838a = fVar;
                    v.c(fVar, new t(yVar4, 7), oVar14);
                    fg.f fVar2 = (fg.f) yVar4.f10838a;
                    oVar14.p(false);
                    if (l.a(fVar2.getValue(), "deeplApi")) {
                        oVar14.W(234248741);
                        z8.e.a("deeplApiKey", "DeepLFreeApiKey", null, null, "", null, null, null, 0L, 0L, false, false, false, oVar14, 196662, 16348);
                    } else {
                        oVar14.W(232237306);
                    }
                    oVar14.p(false);
                } else {
                    oVar14.Q();
                }
                return a0Var;
            case 14:
                x0.o oVar15 = (x0.o) obj2;
                int iIntValue15 = ((Integer) obj3).intValue();
                l.e((y8.i) obj, "$this$prefsItem");
                if (oVar15.N(iIntValue15 & 1, (iIntValue15 & 17) != 16)) {
                    Object objK19 = oVar15.K();
                    if (objK19 == r0Var) {
                        objK19 = v.v(f0.P(gg.c.a(), "doh", Boolean.FALSE, z.a(Boolean.TYPE)).a());
                        oVar15.h0(objK19);
                    }
                    w0 w0Var3 = (w0) objK19;
                    String strG2 = q.g(R.string.doh);
                    Object objK20 = oVar15.K();
                    if (objK20 == r0Var) {
                        objK20 = new w9.c(w0Var3, 1);
                        oVar15.h0(objK20);
                    }
                    z8.n.a("doh", "DOH", null, strG2, false, (ic.k) objK20, 0L, false, oVar15, 221238, TinkerReport.KEY_LOADED_INTERPRET_TYPE_INTERPRET_OK);
                    z8.e.a("dohUrl", q.g(R.string.doh_url), null, null, "https://dns.alidns.com/dns-query", null, null, null, 0L, 0L, ((Boolean) w0Var3.getValue()).booleanValue(), false, false, oVar15, 196614, 14300);
                } else {
                    oVar15.Q();
                }
                return a0Var;
            case 15:
                x0.o oVar16 = (x0.o) obj2;
                int iIntValue16 = ((Integer) obj3).intValue();
                l.e((y8.i) obj, "$this$prefsItem");
                if (oVar16.N(iIntValue16 & 1, (iIntValue16 & 17) != 16)) {
                    z8.n.a("autoOpenSingleChildDir", q.g(R.string.auto_open_single_dir), null, null, true, null, 0L, false, oVar16, 24582, 492);
                } else {
                    oVar16.Q();
                }
                return a0Var;
            case 16:
                x0.o oVar17 = (x0.o) obj2;
                int iIntValue17 = ((Integer) obj3).intValue();
                l.e((y8.i) obj, "$this$prefsItem");
                if (oVar17.N(iIntValue17 & 1, (iIntValue17 & 17) != 16)) {
                    z8.n.a("autoOpenAudioDir", q.g(R.string.auto_open_audio_dir), null, null, true, null, 0L, false, oVar17, 24582, 492);
                } else {
                    oVar17.Q();
                }
                return a0Var;
            case 17:
                x0.o oVar18 = (x0.o) obj2;
                int iIntValue18 = ((Integer) obj3).intValue();
                l.e((y8.i) obj, "$this$prefsItem");
                if (oVar18.N(iIntValue18 & 1, (iIntValue18 & 17) != 16)) {
                    z8.n.a("hideLrcFiles", q.g(R.string.hide_lrc_files), null, null, false, null, 0L, false, oVar18, 24582, 492);
                } else {
                    oVar18.Q();
                }
                return a0Var;
            case 18:
                x0.o oVar19 = (x0.o) obj2;
                int iIntValue19 = ((Integer) obj3).intValue();
                l.e((y8.i) obj, "$this$prefsItem");
                if (oVar19.N(iIntValue19 & 1, (iIntValue19 & 17) != 16)) {
                    z8.n.a("useExternalVideoPlayer", q.g(R.string.use_external_video_player), null, null, false, null, 0L, false, oVar19, 24582, 492);
                } else {
                    oVar19.Q();
                }
                return a0Var;
            case 19:
                x0.o oVar20 = (x0.o) obj2;
                int iIntValue20 = ((Integer) obj3).intValue();
                l.e((y8.i) obj, "$this$prefsItem");
                if (oVar20.N(iIntValue20 & 1, (iIntValue20 & 17) != 16)) {
                    z8.n.a("disableLargeIconInNotification", q.g(R.string.disable_notification_icon), null, q.g(R.string.disable_notification_icon_summary), false, null, 0L, false, oVar20, 24582, 484);
                } else {
                    oVar20.Q();
                }
                return a0Var;
            case 20:
                x0.o oVar21 = (x0.o) obj2;
                int iIntValue21 = ((Integer) obj3).intValue();
                l.e((y8.i) obj, "$this$prefsItem");
                if (oVar21.N(iIntValue21 & 1, (iIntValue21 & 17) != 16)) {
                    z8.n.a("checkClipboardUrl", q.g(R.string.auto_check_clipboard_url), null, null, true, null, 0L, false, oVar21, 24582, 492);
                } else {
                    oVar21.Q();
                }
                return a0Var;
            case 21:
                x0.o oVar22 = (x0.o) obj2;
                int iIntValue22 = ((Integer) obj3).intValue();
                l.e((y8.i) obj, "$this$prefsItem");
                if (oVar22.N(iIntValue22 & 1, (iIntValue22 & 17) != 16)) {
                    z8.n.a("enableLongClickItemCopy", q.g(R.string.enable_long_click_item_copy), null, null, true, null, 0L, false, oVar22, 24582, 492);
                } else {
                    oVar22.Q();
                }
                return a0Var;
            case 22:
                return f(obj, obj2, obj3);
            case 23:
                x0.o oVar23 = (x0.o) obj2;
                int iIntValue23 = ((Integer) obj3).intValue();
                l.e((y8.i) obj, "$this$prefsItem");
                if (oVar23.N(iIntValue23 & 1, (iIntValue23 & 17) != 16)) {
                    z8.n.a("disableLocalDownloadMetadata", q.g(R.string.disable_local_metadata), null, q.g(R.string.disable_local_metadata_summary), false, null, 0L, false, oVar23, 24582, 484);
                } else {
                    oVar23.Q();
                }
                return a0Var;
            case 24:
                x0.o oVar24 = (x0.o) obj2;
                int iIntValue24 = ((Integer) obj3).intValue();
                l.e((y8.i) obj, "$this$prefsItem");
                if (oVar24.N(iIntValue24 & 1, (iIntValue24 & 17) != 16)) {
                    String strG3 = q.g(R.string.refresh_offline);
                    Object objK21 = oVar24.K();
                    if (objK21 == r0Var) {
                        objK21 = new j0(20);
                        oVar24.h0(objK21);
                    }
                    z8.a.a(strG3, null, null, false, false, (ic.a) objK21, 0L, false, null, null, oVar24, 196608, 990);
                } else {
                    oVar24.Q();
                }
                return a0Var;
            case 25:
                x0.o oVar25 = (x0.o) obj2;
                int iIntValue25 = ((Integer) obj3).intValue();
                l.e((y8.i) obj, "$this$prefsItem");
                if (oVar25.N(iIntValue25 & 1, (iIntValue25 & 17) != 16)) {
                    String strG4 = q.g(R.string.refresh_history);
                    Object objK22 = oVar25.K();
                    if (objK22 == r0Var) {
                        objK22 = new j0(19);
                        oVar25.h0(objK22);
                    }
                    z8.a.a(strG4, null, null, false, false, (ic.a) objK22, 0L, false, null, null, oVar25, 196608, 990);
                } else {
                    oVar25.Q();
                }
                return a0Var;
            case 26:
                x0.o oVar26 = (x0.o) obj2;
                int iIntValue26 = ((Integer) obj3).intValue();
                l.e((y8.i) obj, "$this$prefsItem");
                if (oVar26.N(iIntValue26 & 1, (iIntValue26 & 17) != 16)) {
                    String strG5 = q.g(R.string.translate_src);
                    Object objK23 = oVar26.K();
                    if (objK23 == r0Var) {
                        List<String> list = oa.f.f16294a;
                        ArrayList arrayList2 = new ArrayList(vb.n.K(list, 10));
                        for (String str2 : list) {
                            arrayList2.add(new ub.k(str2, str2));
                        }
                        objK23 = vb.w.A(arrayList2);
                        oVar26.h0(objK23);
                    }
                    z8.c.a("translateSrc", strG5, null, "ja", true, 0L, false, (Map) objK23, oVar26, 1597446);
                } else {
                    oVar26.Q();
                }
                return a0Var;
            case 27:
                x0.o oVar27 = (x0.o) obj2;
                int iIntValue27 = ((Integer) obj3).intValue();
                l.e((y8.i) obj, "$this$prefsItem");
                if (oVar27.N(iIntValue27 & 1, (iIntValue27 & 17) != 16)) {
                    String strG6 = q.g(R.string.translate_dst);
                    Object objK24 = oVar27.K();
                    if (objK24 == r0Var) {
                        List<String> list2 = oa.f.f16294a;
                        ArrayList arrayList3 = new ArrayList();
                        for (String str3 : list2) {
                            ub.k kVar = l.a(str3, "auto") ? null : new ub.k(str3, str3);
                            if (kVar != null) {
                                arrayList3.add(kVar);
                            }
                        }
                        objK24 = vb.w.A(arrayList3);
                        oVar27.h0(objK24);
                    }
                    z8.c.a("translateDst", strG6, null, "zh-CN", true, 0L, false, (Map) objK24, oVar27, 1597446);
                } else {
                    oVar27.Q();
                }
                return a0Var;
            case 28:
                return h(obj, obj2, obj3);
            default:
                x0.o oVar28 = (x0.o) obj2;
                int iIntValue28 = ((Integer) obj3).intValue();
                l.e((y8.i) obj, "$this$prefsItem");
                if (oVar28.N(iIntValue28 & 1, (iIntValue28 & 17) != 16)) {
                    y.d.d(androidx.compose.foundation.layout.c.d(j1.n.f9689a, 16), oVar28);
                } else {
                    oVar28.Q();
                }
                return a0Var;
        }
    }
}
