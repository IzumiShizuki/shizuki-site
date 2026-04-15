package ba;

import bg.a2;
import bg.o1;
import com.cnl.kikoeru.R;
import com.tencent.bugly.beta.tinker.TinkerReport;
import java.nio.charset.Charset;
import x0.n2;
import x0.z1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements ic.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2312a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2313b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f2314c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f2315d;

    public /* synthetic */ c(Object obj, Object obj2, Object obj3, int i10) {
        this.f2312a = i10;
        this.f2313b = obj;
        this.f2314c = obj2;
        this.f2315d = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ic.a
    public final Object b() {
        int i10 = this.f2312a;
        int i11 = 0;
        int i12 = 2;
        int i13 = 3;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        Object[] objArr5 = 0;
        Object[] objArr6 = 0;
        Object[] objArr7 = 0;
        Object[] objArr8 = 0;
        Object[] objArr9 = 0;
        ub.a0 a0Var = ub.a0.f21526a;
        Object obj = this.f2315d;
        Object obj2 = this.f2314c;
        Object obj3 = this.f2313b;
        switch (i10) {
            case 0:
                x0.w0 w0Var = (x0.w0) obj3;
                o1.i iVar = (o1.i) obj2;
                if (((String) ((n2) obj).getValue()).length() > 0) {
                    w0Var.setValue(new y2.y(0L, (String) null, 7));
                } else {
                    j2.h0.c(iVar);
                }
                return a0Var;
            case 1:
                hf.a0.y((hf.y) obj2, null, null, new u0((z0) obj, (x0.w0) obj3, objArr == true ? 1 : 0, i11), 3);
                return a0Var;
            case 2:
                String str = (String) obj3;
                String str2 = (String) obj2;
                f1 f1Var = (f1) obj;
                i1 i1Var = new i1(str2, str.length() != 0 ? new a0(str2, str) : null, false, f1Var.f2356b);
                f1Var.f2357c = i1Var;
                return i1Var;
            case 3:
                hf.a0.y((hf.y) obj3, null, null, new u0((da.m0) obj2, (a2) obj, objArr2 == true ? 1 : 0, i13), 3);
                return a0Var;
            case 4:
                ((ic.k) obj2).a((String) obj);
                ((x0.w0) obj3).setValue(Boolean.FALSE);
                return a0Var;
            case 5:
                ha.g gVar = (ha.g) obj2;
                String str3 = (String) obj;
                if (((String) obj3).length() <= 0) {
                    return str3;
                }
                lh.i iVar2 = (lh.i) gVar.f8271b.getValue();
                Charset charsetForName = Charset.forName((String) gVar.f8272c.getValue());
                jc.l.d(charsetForName, "forName(...)");
                return iVar2.n(charsetForName);
            case 6:
                hf.a0.y((hf.y) obj3, null, null, new u0((ha.g) obj2, (n2) obj, objArr3 == true ? 1 : 0, 8), 3);
                return a0Var;
            case 7:
                ((x0.w0) obj3).setValue(((a2) obj2).f2818a);
                ((x0.w0) obj).setValue(Boolean.TRUE);
                return a0Var;
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_DALVIK /* 8 */:
                ((x0.w0) obj3).setValue((o1) obj2);
                ((x0.w0) obj).setValue(Boolean.TRUE);
                return a0Var;
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_ART /* 9 */:
                ((x0.w0) obj3).setValue((bg.e1) obj2);
                ((x0.w0) obj).setValue(Boolean.TRUE);
                return a0Var;
            case TinkerReport.KEY_APPLY_WITH_RETRY /* 10 */:
                ((x0.w0) obj3).setValue((la.a) obj2);
                ((x0.w0) obj).setValue(Boolean.TRUE);
                return a0Var;
            case 11:
                la.l.k((x0.w0) obj3, (bg.t) obj2, (String) obj);
                return a0Var;
            case 12:
                ((x0.w0) obj3).setValue(Boolean.FALSE);
                pf.e eVar = hf.l0.f8566a;
                hf.a0.y((hf.y) obj2, pf.d.f17138c, null, new a9.k(11, (bg.t) obj, objArr4 == true ? 1 : 0), 2);
                return a0Var;
            case 13:
                ((x0.w0) obj3).setValue(Boolean.FALSE);
                ((la.b) ((bg.t) obj2)).f11903d.a(((la.x0) obj).f12148b);
                return a0Var;
            case 14:
                hf.a0.y((hf.y) obj2, null, null, new m9.j((m9.c) obj, (x0.w0) obj3, objArr5 == true ? 1 : 0, i12), 3);
                return a0Var;
            case 15:
                ((x0.w0) obj3).setValue((String) obj2);
                ((x0.w0) obj).setValue(Boolean.FALSE);
                return a0Var;
            case 16:
                hf.a0.y((hf.y) obj2, null, null, new lf.w0((bg.p) obj, (x0.w0) obj3, objArr6 == true ? 1 : 0, 15), 3);
                return a0Var;
            case 17:
                ic.k kVar = (ic.k) obj2;
                bg.p pVar = (bg.p) obj;
                ((x0.w0) obj3).setValue(Boolean.FALSE);
                if (kVar != null) {
                    kVar.a(pVar.f2937a);
                }
                return a0Var;
            case 18:
                ((x0.w0) obj3).setValue(Integer.valueOf(((vb.u) obj2).f22822a));
                ((x0.w0) obj).setValue(Boolean.FALSE);
                return a0Var;
            case 19:
                x0.w0 w0Var2 = (x0.w0) obj3;
                ic.k kVar2 = (ic.k) obj2;
                String str4 = (String) ((n2) obj).getValue();
                if (str4 != null) {
                    w0Var2.setValue(Boolean.FALSE);
                    kVar2.a(str4);
                }
                return a0Var;
            case 20:
                hf.a0.y((hf.y) obj2, null, null, new q9.n((q9.r0) obj, (x0.w0) obj3, objArr7 == true ? 1 : 0, 1), 3);
                return a0Var;
            case 21:
                hf.y yVar = (hf.y) obj2;
                x0.w0 w0Var3 = (x0.w0) obj3;
                e7.a0 a0Var2 = (e7.a0) obj;
                if (((hf.d1) w0Var3.getValue()) != null) {
                    ka.n.c(na.q.g(R.string.loading), 0L, null, null, 511);
                } else {
                    pf.e eVar2 = hf.l0.f8566a;
                    w0Var3.setValue(hf.a0.y(yVar, pf.d.f17138c, null, new f7.o(yVar, a0Var2, w0Var3, null), 2));
                }
                return a0Var;
            case 22:
                ((s0.i) obj3).i((ic.a) obj2, (f3.m) obj);
                return a0Var;
            case 23:
                c9.a aVar = (c9.a) obj3;
                fg.f fVar = (fg.f) obj2;
                fg.f fVar2 = (fg.f) obj;
                String str5 = aVar.f3767b;
                String str6 = aVar.f3768c;
                if (!jc.l.a(str5, (String) fVar.getValue()) || !jc.l.a(str6, (String) fVar2.getValue())) {
                    fVar.setValue(aVar.f3767b);
                    fVar2.setValue(str6);
                    pc.f0.P(gg.c.a(), "password", "", jc.z.a(String.class)).d(aVar.f3769d);
                    ((hg.b) a9.i.f231b.getValue()).d(aVar.f3770e);
                    String str7 = ag.z.f369a;
                    String str8 = (String) fVar.getValue();
                    jc.l.e(str8, "<set-?>");
                    ag.z.f369a = str8;
                    fg.f fVarD = a9.i.d();
                    Boolean bool = Boolean.TRUE;
                    fVarD.setValue(bool);
                    a9.i.e().setValue(bool);
                    y.f2506a.setValue(bool);
                }
                return a0Var;
            case 24:
                c9.a aVar2 = (c9.a) obj;
                ((x0.w0) obj3).setValue(Boolean.FALSE);
                jc.l.e(aVar2, "bean");
                k4.a aVarH = androidx.lifecycle.m0.h((s9.a) obj2);
                pf.e eVar3 = hf.l0.f8566a;
                hf.a0.y(aVarH, pf.d.f17138c, null, new a9.k(18, aVar2, objArr8 == true ? 1 : 0), 2);
                return a0Var;
            case 25:
                ((x0.w0) obj3).setValue((t9.a) obj2);
                ((x0.w0) obj).setValue(Boolean.FALSE);
                return a0Var;
            case 26:
                ((x0.w0) obj3).setValue(Boolean.FALSE);
                ((ic.k) obj2).a(new q1.q(((ta.c) ((x0.w0) obj).getValue()).b()));
                return a0Var;
            case 27:
                x0.o oVar = (x0.o) obj3;
                y0.a aVar3 = (y0.a) obj2;
                z1 z1Var = (z1) obj;
                y0.b bVar = oVar.M;
                y0.a aVar4 = bVar.f25297b;
                try {
                    bVar.f25297b = aVar3;
                    z1 z1Var2 = oVar.G;
                    int[] iArr = oVar.f24389o;
                    o.y yVar2 = oVar.f24396v;
                    oVar.f24389o = null;
                    oVar.f24396v = null;
                    try {
                        oVar.G = z1Var;
                        boolean z10 = bVar.f25300e;
                        try {
                            bVar.f25300e = false;
                            throw null;
                        } catch (Throwable th2) {
                            bVar.f25300e = z10;
                            throw th2;
                        }
                    } catch (Throwable th3) {
                        oVar.G = z1Var2;
                        oVar.f24389o = iArr;
                        oVar.f24396v = yVar2;
                        throw th3;
                    }
                } catch (Throwable th4) {
                    bVar.f25297b = aVar4;
                    throw th4;
                }
            default:
                na.q.i(na.q.g(R.string.choose_export_folder));
                hf.a0.y((hf.y) obj3, null, null, new e.j(obj2, obj, (yb.c) (objArr9 == true ? 1 : 0), 22), 3);
                return a0Var;
        }
    }

    public /* synthetic */ c(Object obj, Object obj2, x0.w0 w0Var, int i10) {
        this.f2312a = i10;
        this.f2314c = obj;
        this.f2315d = obj2;
        this.f2313b = w0Var;
    }

    public /* synthetic */ c(Object obj, x0.w0 w0Var, Object obj2, int i10) {
        this.f2312a = i10;
        this.f2314c = obj;
        this.f2313b = w0Var;
        this.f2315d = obj2;
    }

    public /* synthetic */ c(s0.i iVar, ic.a aVar, String str, f3.m mVar) {
        this.f2312a = 22;
        this.f2313b = iVar;
        this.f2314c = aVar;
        this.f2315d = mVar;
    }

    public /* synthetic */ c(x0.o oVar, y0.a aVar, z1 z1Var, x0.v0 v0Var) {
        this.f2312a = 27;
        this.f2313b = oVar;
        this.f2314c = aVar;
        this.f2315d = z1Var;
    }
}
