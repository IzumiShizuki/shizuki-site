package m0;

import android.view.View;
import android.view.WindowManager;
import com.cnl.kikoeru.R;
import com.tencent.bugly.beta.tinker.TinkerReport;
import java.lang.ref.WeakReference;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class l3 implements ic.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13230a;

    public /* synthetic */ l3(int i10) {
        this.f13230a = i10;
    }

    @Override // ic.k
    public final Object a(Object obj) {
        e7.a0 a0Var;
        WeakReference weakReference;
        View view;
        WindowManager.LayoutParams layoutParams;
        int i10 = this.f13230a;
        ub.a0 a0Var2 = ub.a0.f21526a;
        switch (i10) {
            case 0:
                q2.v.e((q2.k) obj, 0);
                return a0Var2;
            case 1:
                return Boolean.TRUE;
            case 2:
                float f10 = a5.f12653a;
                return a0Var2;
            case 3:
                r.g0 g0Var = (r.g0) obj;
                g0Var.f18411a = 1332;
                g0Var.a(Float.valueOf(0.0f), 0).f18400b = g5.f13023b;
                g0Var.a(Float.valueOf(290.0f), 666);
                return a0Var2;
            case 4:
                r.g0 g0Var2 = (r.g0) obj;
                g0Var2.f18411a = 1332;
                g0Var2.a(Float.valueOf(0.0f), 666).f18400b = g5.f13023b;
                g0Var2.a(Float.valueOf(290.0f), g0Var2.f18411a);
                return a0Var2;
            case 5:
                ((f3) obj).getClass();
                return true;
            case 6:
                pc.u[] uVarArr = q2.v.f17698a;
                q2.w wVar = q2.t.f17681l;
                pc.u uVar = q2.v.f17698a[5];
                wVar.a((q2.k) obj, Boolean.TRUE);
                return a0Var2;
            case 7:
                return new h3(h7.f13071a);
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_DALVIK /* 8 */:
                return Float.valueOf(((Float) obj).floatValue() * 0.7f);
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_ART /* 9 */:
                jc.l.e((n7.b) obj, "config");
                throw new ub.j();
            case TinkerReport.KEY_APPLY_WITH_RETRY /* 10 */:
                jc.l.e((z7.c) obj, "it");
                return a0Var2;
            case 11:
                z7.c cVar = (z7.c) obj;
                jc.l.e(cVar, "it");
                return Boolean.valueOf(cVar.Z());
            case 12:
                z7.c cVar2 = (z7.c) obj;
                jc.l.e(cVar2, "statement");
                wb.g gVar = new wb.g();
                while (cVar2.Z()) {
                    gVar.add(Integer.valueOf((int) cVar2.getLong(0)));
                }
                return ud.e.c(gVar);
            case 13:
                return a0Var2;
            case 14:
                jc.l.e((ka.g) obj, "it");
                WeakReference weakReference2 = a9.u.f266d;
                if (weakReference2 != null && (a0Var = (e7.a0) weakReference2.get()) != null) {
                    e7.a0.b(a0Var, "LoginScreen");
                }
                return a0Var2;
            case 15:
                xf.h hVar = (xf.h) obj;
                jc.l.e(hVar, "$this$Json");
                hVar.f24999a = true;
                hVar.f25000b = true;
                return a0Var2;
            case 16:
                jc.l.e((String) obj, "it");
                return a0Var2;
            case 17:
                ef.j jVar = (ef.j) obj;
                jc.l.e(jVar, "it");
                String strGroup = jVar.f6571a.group();
                jc.l.d(strGroup, "group(...)");
                return strGroup;
            case 18:
                ((Boolean) obj).getClass();
                j9.d.f10668a.getClass();
                if (j9.d.f10672e && (weakReference = j9.d.f10670c) != null && (view = (View) weakReference.get()) != null && (layoutParams = j9.d.f10671d) != null) {
                    Object systemService = view.getContext().getSystemService("window");
                    jc.l.c(systemService, "null cannot be cast to non-null type android.view.WindowManager");
                    WindowManager windowManager = (WindowManager) systemService;
                    layoutParams.flags = -2147483640;
                    if (((Boolean) pc.f0.P(gg.c.a(), "floatingLrcTouch", Boolean.FALSE, jc.z.a(Boolean.TYPE)).c(j9.d.f10669b[1])).booleanValue()) {
                        layoutParams.flags |= 16;
                    }
                    windowManager.updateViewLayout(view, j9.d.f10671d);
                }
                return a0Var2;
            case 19:
                y8.i iVar = (y8.i) obj;
                jc.l.e(iVar, "$this$PrefsScreen");
                iVar.a(na.q.g(R.string.lyrics), new l3(20));
                iVar.a(na.q.g(R.string.floating_lyrics), new l3(21));
                return a0Var2;
            case 20:
                y8.i iVar2 = (y8.i) obj;
                jc.l.e(iVar2, "$this$prefsGroup");
                iVar2.b(r9.b.f18938a);
                iVar2.b(r9.b.f18939b);
                iVar2.b(r9.b.f18940c);
                return a0Var2;
            case 21:
                y8.i iVar3 = (y8.i) obj;
                jc.l.e(iVar3, "$this$prefsGroup");
                iVar3.b(r9.b.f18941d);
                iVar3.b(r9.b.f18942e);
                iVar3.b(r9.b.f18943f);
                iVar3.b(r9.b.f18944g);
                return a0Var2;
            case 22:
                jc.l.e((q.m) obj, "$this$NavHost");
                return q.l0.b(r.d.r(0, 0, null, 7), 2);
            case 23:
                jc.l.e((q.m) obj, "$this$NavHost");
                return q.l0.c(r.d.r(0, 0, null, 7), 2);
            case 24:
                jc.l.e((q.m) obj, "$this$NavHost");
                return q.l0.b(r.d.r(0, 0, null, 7), 2);
            case 25:
                jc.l.e((q.m) obj, "$this$NavHost");
                return q.l0.c(r.d.r(0, 0, null, 7), 2);
            case 26:
                e7.x xVar = (e7.x) obj;
                jc.l.e(xVar, "$this$NavHost");
                ListIterator listIterator = r9.f.f18979c.listIterator(0);
                while (true) {
                    h1.z zVar = (h1.z) listIterator;
                    if (!zVar.hasNext()) {
                        return a0Var2;
                    }
                    r9.c cVar3 = (r9.c) zVar.next();
                    String str = cVar3.f18964a;
                    f1.f fVar = new f1.f(new a9.o(3, cVar3), 1878209965, true);
                    vb.r rVar = vb.r.f22819a;
                    android.support.v4.media.session.b.B(xVar, str, rVar, rVar, fVar);
                }
                break;
            case 27:
                return a0Var2;
            case 28:
                pc.u[] uVarArr2 = q2.v.f17698a;
                ((q2.k) obj).l(q2.t.f17691v, a0Var2);
                return a0Var2;
            default:
                pc.c cVar4 = (pc.c) obj;
                jc.l.e(cVar4, "it");
                sf.a aVarC = n7.e.C(cVar4);
                if (aVarC != null) {
                    return aVarC;
                }
                if (wf.z0.g(cVar4)) {
                    return new sf.d(cVar4);
                }
                return null;
        }
    }

    public /* synthetic */ l3(n7.v vVar) {
        this.f13230a = 9;
    }
}
