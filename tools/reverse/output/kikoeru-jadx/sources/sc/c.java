package sc;

import com.tencent.bugly.beta.tinker.TinkerReport;
import java.lang.reflect.Method;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class c implements ic.k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c f19763b = new c(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c f19764c = new c(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final c f19765d = new c(2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final c f19766e = new c(3);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final c f19767f = new c(4);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final c f19768g = new c(5);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final c f19769h = new c(6);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final c f19770i = new c(7);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final c f19771j = new c(8);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final c f19772k = new c(9);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final c f19773l = new c(10);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final c f19774m = new c(11);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final c f19775n = new c(12);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final c f19776o = new c(13);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19777a;

    public /* synthetic */ c(int i10) {
        this.f19777a = i10;
    }

    @Override // ic.k
    public final Object a(Object obj) {
        int i10 = this.f19777a;
        vb.r rVar = vb.r.f22819a;
        switch (i10) {
            case 0:
                Class cls = (Class) obj;
                e eVar = d.f19781a;
                jc.l.e(cls, "it");
                return new d0(cls);
            case 1:
                Class cls2 = (Class) obj;
                e eVar2 = d.f19781a;
                jc.l.e(cls2, "it");
                return new x0(cls2);
            case 2:
                Class cls3 = (Class) obj;
                e eVar3 = d.f19781a;
                jc.l.e(cls3, "it");
                return n7.d.l(d.a(cls3), rVar, false, rVar);
            case 3:
                Class cls4 = (Class) obj;
                e eVar4 = d.f19781a;
                jc.l.e(cls4, "it");
                return n7.d.l(d.a(cls4), rVar, true, rVar);
            case 4:
                e eVar5 = d.f19781a;
                jc.l.e((Class) obj, "it");
                return new ConcurrentHashMap();
            case 5:
                Class<?> returnType = ((Method) obj).getReturnType();
                jc.l.d(returnType, "getReturnType(...)");
                return ed.d.b(returnType);
            case 6:
                Class cls5 = (Class) obj;
                jc.l.b(cls5);
                return ed.d.b(cls5);
            case 7:
                yc.k0 k0Var = (yc.k0) obj;
                ef.l lVar = i0.f19810a;
                jc.l.e(k0Var, "descriptor");
                return de.i.f5908e.u(k0Var) + " | " + d2.b(k0Var).d();
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_DALVIK /* 8 */:
                yc.t tVar = (yc.t) obj;
                ef.l lVar2 = i0.f19810a;
                jc.l.e(tVar, "descriptor");
                return de.i.f5908e.u(tVar) + " | " + d2.c(tVar).a();
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_ART /* 9 */:
                pc.n nVar = (pc.n) obj;
                jc.l.e(nVar, "parameter");
                StringBuilder sb = new StringBuilder();
                a1 a1Var = (a1) nVar;
                String strB = a1Var.b();
                if (strB == null) {
                    strB = "_";
                }
                sb.append(strB);
                sb.append(": ");
                sb.append(a1Var.c());
                return sb.toString();
            case TinkerReport.KEY_APPLY_WITH_RETRY /* 10 */:
                pc.n nVar2 = (pc.n) obj;
                jc.l.e(nVar2, "it");
                return nh.a.A(((a1) nVar2).c());
            case 11:
                pc.n nVar3 = (pc.n) obj;
                jc.l.e(nVar3, "it");
                return nh.a.A(((a1) nVar3).c());
            case 12:
                be.e eVar6 = (be.e) obj;
                jc.l.e(eVar6, "it");
                return lc.b.M(eVar6);
            default:
                Class cls6 = (Class) obj;
                jc.l.b(cls6);
                return ed.d.b(cls6);
        }
    }
}
