package androidx.compose.ui.platform;

import a0.f0;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Vibrator;
import android.view.View;
import b0.i0;
import b0.o1;
import cg.c;
import com.cnl.kikoeru.R;
import g1.g;
import g1.h;
import g1.i;
import ic.n;
import j2.d2;
import j2.l1;
import j2.m0;
import j2.m1;
import j2.n0;
import j2.o0;
import j2.p;
import j2.p1;
import j2.q1;
import j2.v;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import jc.l;
import kotlin.Metadata;
import o2.d;
import ub.a0;
import w7.e;
import x0.k;
import x0.n1;
import x0.o;
import x0.o2;
import x0.w0;
import x0.z;
import y1.a;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\" \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00008FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0002\u0010\u0003¨\u0006\t²\u0006\u000e\u0010\b\u001a\u00020\u00078\n@\nX\u008a\u008e\u0002"}, d2 = {"Lx0/m1;", "Landroidx/lifecycle/x;", "getLocalLifecycleOwner", "()Lx0/m1;", "getLocalLifecycleOwner$annotations", "()V", "LocalLifecycleOwner", "Landroid/content/res/Configuration;", "configuration", "ui_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class AndroidCompositionLocals_androidKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final z f720a = new z(m0.f9884c);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final o2 f721b = new o2(m0.f9885d);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final z f722c = new z(p.f9952f);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final o2 f723d = new o2(m0.f9886e);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final o2 f724e = new o2(m0.f9887f);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final o2 f725f = new o2(m0.f9888g);

    public static final void a(v vVar, n nVar, o oVar, int i10) {
        w0 w0Var;
        char c3;
        LinkedHashMap linkedHashMap;
        boolean z10;
        oVar.Y(-520299287);
        int i11 = (oVar.h(vVar) ? 4 : 2) | i10 | (oVar.h(nVar) ? 32 : 16);
        if (oVar.N(i11 & 1, (i11 & 19) != 18)) {
            Context context = vVar.getContext();
            Object objK = oVar.K();
            Object obj = k.f24334a;
            if (objK == obj) {
                objK = x0.v.v(new Configuration(context.getResources().getConfiguration()));
                oVar.h0(objK);
            }
            w0 w0Var2 = (w0) objK;
            Object objK2 = oVar.K();
            if (objK2 == obj) {
                objK2 = new c(w0Var2, 4);
                oVar.h0(objK2);
            }
            vVar.setConfigurationChangeObserver((ic.k) objK2);
            Object objK3 = oVar.K();
            if (objK3 == obj) {
                objK3 = new j2.w0();
                oVar.h0(objK3);
            }
            j2.w0 w0Var3 = (j2.w0) objK3;
            j2.n viewTreeOwners = vVar.getViewTreeOwners();
            if (viewTreeOwners == null) {
                throw new IllegalStateException("Called when the ViewTreeOwnersAvailability is not yet in Available state");
            }
            e eVar = viewTreeOwners.f9918b;
            Object objK4 = oVar.K();
            if (objK4 == obj) {
                Object parent = vVar.getParent();
                l.c(parent, "null cannot be cast to non-null type android.view.View");
                View view = (View) parent;
                Object tag = view.getTag(R.id.compose_view_saveable_id_tag);
                c3 = 4;
                String strValueOf = tag instanceof String ? (String) tag : null;
                if (strValueOf == null) {
                    strValueOf = String.valueOf(view.getId());
                }
                String str = g.class.getSimpleName() + ':' + strValueOf;
                v2.e eVarE = eVar.e();
                Bundle bundleP = eVarE.p(str);
                if (bundleP != null) {
                    linkedHashMap = new LinkedHashMap();
                    for (String str2 : bundleP.keySet()) {
                        ArrayList parcelableArrayList = bundleP.getParcelableArrayList(str2);
                        l.c(parcelableArrayList, "null cannot be cast to non-null type java.util.ArrayList<kotlin.Any?>");
                        linkedHashMap.put(str2, parcelableArrayList);
                        w0Var2 = w0Var2;
                    }
                } else {
                    linkedHashMap = null;
                }
                w0Var = w0Var2;
                p pVar = p.f9953g;
                o2 o2Var = i.f7146a;
                h hVar = new h(linkedHashMap, pVar);
                try {
                    eVarE.y(str, new d.h(2, hVar));
                    z10 = true;
                } catch (IllegalArgumentException unused) {
                    z10 = false;
                }
                Object p1Var = new p1(hVar, new q1(z10, eVarE, str));
                oVar.h0(p1Var);
                objK4 = p1Var;
            } else {
                w0Var = w0Var2;
                c3 = 4;
            }
            Object obj2 = (p1) objK4;
            boolean zH = oVar.h(obj2);
            Object objK5 = oVar.K();
            if (zH || objK5 == obj) {
                objK5 = new f0(21, obj2);
                oVar.h0(objK5);
            }
            x0.v.c(a0.f21526a, (ic.k) objK5, oVar);
            Object objK6 = oVar.K();
            if (objK6 == obj) {
                objK6 = (Build.VERSION.SDK_INT < 31 || !((Vibrator) context.getSystemService(Vibrator.class)).areAllPrimitivesSupported(1, 7, 2)) ? new d2() : new m1(vVar.getView(), 0);
                oVar.h0(objK6);
            }
            a aVar = (a) objK6;
            Configuration configuration = (Configuration) w0Var.getValue();
            Object objK7 = oVar.K();
            if (objK7 == obj) {
                objK7 = new o2.c();
                oVar.h0(objK7);
            }
            o2.c cVar = (o2.c) objK7;
            Object objK8 = oVar.K();
            Object obj3 = objK8;
            if (objK8 == obj) {
                Configuration configuration2 = new Configuration();
                if (configuration != null) {
                    configuration2.setTo(configuration);
                }
                oVar.h0(configuration2);
                obj3 = configuration2;
            }
            Configuration configuration3 = (Configuration) obj3;
            Object objK9 = oVar.K();
            if (objK9 == obj) {
                objK9 = new n0(configuration3, cVar);
                oVar.h0(objK9);
            }
            n0 n0Var = (n0) objK9;
            boolean zH2 = oVar.h(context);
            Object objK10 = oVar.K();
            if (zH2 || objK10 == obj) {
                objK10 = new o1(13, context, n0Var);
                oVar.h0(objK10);
            }
            x0.v.c(cVar, (ic.k) objK10, oVar);
            Object objK11 = oVar.K();
            if (objK11 == obj) {
                objK11 = new d();
                oVar.h0(objK11);
            }
            d dVar = (d) objK11;
            Object objK12 = oVar.K();
            if (objK12 == obj) {
                objK12 = new o0(dVar);
                oVar.h0(objK12);
            }
            o0 o0Var = (o0) objK12;
            boolean zH3 = oVar.h(context);
            Object objK13 = oVar.K();
            if (zH3 || objK13 == obj) {
                objK13 = new o1(14, context, o0Var);
                oVar.h0(objK13);
            }
            x0.v.c(dVar, (ic.k) objK13, oVar);
            x0.m1 m1Var = l1.f9880v;
            boolean zBooleanValue = ((Boolean) oVar.j(m1Var)).booleanValue() | vVar.getScrollCaptureInProgress$ui_release();
            n1 n1VarA = f720a.a((Configuration) w0Var.getValue());
            n1 n1VarA2 = f721b.a(context);
            n1 n1VarA3 = g4.a.f7345a.a(viewTreeOwners.f9917a);
            n1 n1VarA4 = x7.a.f24831a.a(eVar);
            n1 n1VarA5 = i.f7146a.a(obj2);
            n1 n1VarA6 = f725f.a(vVar.getView());
            n1 n1VarA7 = f723d.a(cVar);
            n1 n1VarA8 = f724e.a(dVar);
            n1 n1VarA9 = m1Var.a(Boolean.valueOf(zBooleanValue));
            n1 n1VarA10 = l1.f9870l.a(aVar);
            n1[] n1VarArr = new n1[10];
            n1VarArr[0] = n1VarA;
            n1VarArr[1] = n1VarA2;
            n1VarArr[2] = n1VarA3;
            n1VarArr[3] = n1VarA4;
            n1VarArr[c3] = n1VarA5;
            n1VarArr[5] = n1VarA6;
            n1VarArr[6] = n1VarA7;
            n1VarArr[7] = n1VarA8;
            n1VarArr[8] = n1VarA9;
            n1VarArr[9] = n1VarA10;
            x0.v.b(n1VarArr, f1.g.f(1059770793, new c0.c(vVar, w0Var3, nVar, 3), oVar), oVar, 56);
        } else {
            oVar.Q();
        }
        x0.p1 p1VarR = oVar.r();
        if (p1VarR != null) {
            p1VarR.f24421d = new i0(vVar, nVar, i10, 11);
        }
    }

    public static final void b(String str) {
        throw new IllegalStateException(("CompositionLocal " + str + " not present").toString());
    }

    public static final x0.m1 getLocalLifecycleOwner() {
        return g4.a.f7345a;
    }
}
