package pd;

import bd.s0;
import java.lang.reflect.Modifier;

/* JADX INFO: loaded from: classes.dex */
public final class l implements ic.k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final l f17045b = new l(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final l f17046c = new l(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final l f17047d = new l(2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final l f17048e = new l(3);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final l f17049f = new l(4);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17050a;

    public /* synthetic */ l(int i10) {
        this.f17050a = i10;
    }

    @Override // ic.k
    public final Object a(Object obj) {
        switch (this.f17050a) {
            case 0:
                int i10 = n.f17053v;
                jc.l.e((ed.w) obj, "it");
                return Boolean.valueOf(!Modifier.isStatic(r3.b().getModifiers()));
            case 1:
                s0 s0Var = (s0) obj;
                pc.u[] uVarArr = z.f17092m;
                jc.l.e(s0Var, "$this$selectMostSpecificInEachOverridableGroup");
                return s0Var;
            case 2:
                ed.w wVar = (ed.w) obj;
                int i11 = c0.f16999p;
                jc.l.e(wVar, "it");
                return Boolean.valueOf(Modifier.isStatic(wVar.b().getModifiers()));
            case 3:
                le.o oVar = (le.o) obj;
                int i12 = c0.f16999p;
                jc.l.e(oVar, "it");
                return oVar.g();
            default:
                int i13 = c0.f16999p;
                yc.h hVarH = ((se.w) obj).t().h();
                if (hVarH instanceof yc.e) {
                    return (yc.e) hVarH;
                }
                return null;
        }
    }
}
