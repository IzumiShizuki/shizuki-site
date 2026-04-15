package a9;

import e7.a0;
import e7.m0;
import e7.x;
import java.lang.ref.WeakReference;
import java.util.List;
import q.t1;
import x0.o2;
import x0.p1;
import x0.v;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class u {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static WeakReference f266d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final o2 f263a = new o2(new g(12));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final o2 f264b = new o2(new g(13));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final o2 f265c = new o2(new g(14));

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f267e = "TEXT_SCREEN_SHARED_TEXT";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static String f268f = "";

    public static final void a(int i10, x0.o oVar) {
        oVar.Y(216944652);
        if (oVar.N(i10 & 1, i10 != 0)) {
            a0 a0VarW = g8.a.W(new m0[0], oVar);
            boolean zH = oVar.h(a0VarW);
            Object objK = oVar.K();
            if (zH || objK == x0.k.f24334a) {
                objK = new e(a0VarW, null, 1);
                oVar.h0(objK);
            }
            v.e((ic.n) objK, a0VarW, oVar);
            t1.a(null, f1.g.f(-822268086, new q(a0VarW, 0), oVar), oVar, 48);
        } else {
            oVar.Q();
        }
        p1 p1VarR = oVar.r();
        if (p1VarR != null) {
            p1VarR.f24421d = new a(i10, 2);
        }
    }

    public static void b(x xVar, String str, List list, List list2, f1.f fVar, int i10) {
        int i11 = i10 & 2;
        vb.r rVar = vb.r.f22819a;
        if (i11 != 0) {
            list = rVar;
        }
        if ((i10 & 4) != 0) {
            list2 = rVar;
        }
        jc.l.e(xVar, "<this>");
        android.support.v4.media.session.b.B(xVar, str, list, list2, new f1.f(new o(0, fVar), -349287240, true));
    }
}
