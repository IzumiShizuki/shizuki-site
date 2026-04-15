package de;

import bd.y0;
import com.tencent.bugly.beta.tinker.TinkerReport;
import se.w;
import ub.a0;

/* JADX INFO: loaded from: classes.dex */
public final class d implements ic.k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final d f5882b = new d(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final d f5883c = new d(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final d f5884d = new d(2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final d f5885e = new d(3);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final d f5886f = new d(4);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final d f5887g = new d(5);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final d f5888h = new d(6);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final d f5889i = new d(7);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final d f5890j = new d(8);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final d f5891k = new d(9);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final d f5892l = new d(10);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final d f5893m = new d(11);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final d f5894n = new d(12);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final d f5895o = new d(13);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final d f5896p = new d(14);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final d f5897q = new d(15);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5898a;

    public /* synthetic */ d(int i10) {
        this.f5898a = i10;
    }

    @Override // ic.k
    public final Object a(Object obj) {
        int i10 = this.f5898a;
        q qVar = q.f5963b;
        vb.t tVar = vb.t.f22821a;
        a0 a0Var = a0.f21526a;
        switch (i10) {
            case 0:
                k kVar = (k) obj;
                i iVar = i.f5906c;
                jc.l.e(kVar, "$this$withOptions");
                kVar.e(tVar);
                return a0Var;
            case 1:
                k kVar2 = (k) obj;
                i iVar2 = i.f5906c;
                jc.l.e(kVar2, "$this$withOptions");
                kVar2.i();
                kVar2.e(j.f5912c);
                return a0Var;
            case 2:
                k kVar3 = (k) obj;
                i iVar3 = i.f5906c;
                jc.l.e(kVar3, "$this$withOptions");
                kVar3.h();
                return a0Var;
            case 3:
                k kVar4 = (k) obj;
                i iVar4 = i.f5906c;
                jc.l.e(kVar4, "$this$withOptions");
                kVar4.h();
                kVar4.e(tVar);
                return a0Var;
            case 4:
                k kVar5 = (k) obj;
                i iVar5 = i.f5906c;
                jc.l.e(kVar5, "$this$withOptions");
                kVar5.h();
                kVar5.e(tVar);
                kVar5.j();
                return a0Var;
            case 5:
                k kVar6 = (k) obj;
                i iVar6 = i.f5906c;
                jc.l.e(kVar6, "$this$withOptions");
                kVar6.e(tVar);
                kVar6.a(b.f5879c);
                kVar6.k(qVar);
                return a0Var;
            case 6:
                k kVar7 = (k) obj;
                i iVar7 = i.f5906c;
                jc.l.e(kVar7, "$this$withOptions");
                kVar7.h();
                kVar7.e(tVar);
                kVar7.a(b.f5879c);
                kVar7.f();
                kVar7.k(q.f5964c);
                kVar7.b();
                kVar7.d();
                kVar7.j();
                kVar7.g();
                return a0Var;
            case 7:
                k kVar8 = (k) obj;
                i iVar8 = i.f5906c;
                jc.l.e(kVar8, "$this$withOptions");
                kVar8.e(j.f5911b);
                return a0Var;
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_DALVIK /* 8 */:
                k kVar9 = (k) obj;
                i iVar9 = i.f5906c;
                jc.l.e(kVar9, "$this$withOptions");
                kVar9.e(j.f5912c);
                return a0Var;
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_ART /* 9 */:
                k kVar10 = (k) obj;
                i iVar10 = i.f5906c;
                jc.l.e(kVar10, "$this$withOptions");
                kVar10.a(b.f5879c);
                kVar10.k(qVar);
                return a0Var;
            case TinkerReport.KEY_APPLY_WITH_RETRY /* 10 */:
                k kVar11 = (k) obj;
                i iVar11 = i.f5906c;
                jc.l.e(kVar11, "$this$withOptions");
                kVar11.c();
                kVar11.a(b.f5878b);
                kVar11.e(j.f5912c);
                return a0Var;
            case 11:
                w wVar = (w) obj;
                i iVar12 = i.f5906c;
                jc.l.e(wVar, "it");
                return wVar;
            case 12:
                i iVar13 = i.f5906c;
                return "";
            case 13:
                w wVar2 = (w) obj;
                pc.u[] uVarArr = m.Y;
                jc.l.e(wVar2, "it");
                return wVar2;
            case 14:
                pc.u[] uVarArr2 = m.Y;
                jc.l.e((y0) obj, "it");
                return "...";
            default:
                String str = (String) obj;
                jc.l.e(str, "it");
                return str;
        }
    }
}
