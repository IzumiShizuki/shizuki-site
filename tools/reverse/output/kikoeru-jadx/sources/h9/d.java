package h9;

import ac.i;
import android.net.Uri;
import androidx.lifecycle.q;
import androidx.media3.exoplayer.ExoPlayer;
import bg.a2;
import bg.z;
import h1.s;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import jc.l;
import m4.a0;
import m4.b0;
import m4.c0;
import m4.d0;
import m4.e0;
import m4.i0;
import m4.k0;
import m4.l0;
import m4.w;
import m4.y;
import m4.y0;
import ub.p;
import vb.m;
import vb.n;
import x0.e1;
import x0.v;
import ya.a1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e1 f8241a = v.v(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final e1 f8242b = v.v(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final s f8243c = new s();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final e1 f8244d = v.v(Boolean.FALSE);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final e1 f8245e = v.v(0);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final p f8246f = ub.a.d(new e.e(23));

    public static ArrayList a(List list, Uri uri) {
        l.e(list, "musicList");
        List<z> list2 = list;
        ArrayList arrayList = new ArrayList(n.K(list2, 10));
        for (z zVar : list2) {
            String str = zVar.f2996d;
            String str2 = zVar.f2998f;
            k0 k0Var = new k0();
            k0Var.f14318a = str;
            k0Var.f14320c = str;
            k0Var.f14322e = str;
            k0Var.f14319b = str2;
            k0Var.f14321d = str2;
            k0Var.f14323f = str2;
            k0Var.f14330m = uri;
            l0 l0Var = new l0(k0Var);
            w wVar = new w();
            m4.z zVar2 = new m4.z();
            List list3 = Collections.EMPTY_LIST;
            a1 a1Var = a1.f25946e;
            b0 b0Var = new b0();
            e0 e0Var = e0.f14187d;
            String strD = zVar.d();
            d0 d0Var = null;
            Uri uri2 = strD == null ? null : Uri.parse(strD);
            String strD2 = zVar.d();
            strD2.getClass();
            p4.c.i(((Uri) zVar2.f14645e) == null || ((UUID) zVar2.f14644d) != null);
            if (uri2 != null) {
                d0Var = new d0(uri2, null, ((UUID) zVar2.f14644d) != null ? new a0(zVar2) : null, null, list3, null, a1Var, -9223372036854775807L);
            }
            arrayList.add(new i0(strD2, new y(wVar), d0Var, new c0(b0Var), l0Var, e0Var));
        }
        return arrayList;
    }

    public static z b() {
        Integer num = (Integer) f8242b.getValue();
        if (num != null) {
            return (z) m.b0(num.intValue(), f8243c);
        }
        return null;
    }

    public static ExoPlayer c() {
        return (ExoPlayer) f8246f.getValue();
    }

    public static Long d() {
        a2 a2Var = (a2) f8241a.getValue();
        if (a2Var != null) {
            return Long.valueOf(a2Var.f2823f);
        }
        return null;
    }

    public static void e(int i10) {
        String str;
        f8242b.setValue(Integer.valueOf(i10));
        ((v4.v) c()).g2();
        y0 y0VarC = c();
        a2 a2Var = (a2) f8241a.getValue();
        ArrayList arrayListA = a(f8243c, (a2Var == null || (str = a2Var.I) == null) ? null : Uri.parse(str));
        q qVar = (q) y0VarC;
        qVar.getClass();
        ((v4.v) qVar).A0(arrayListA);
        ((v4.v) c()).c();
        ((q) c()).r1(i10, false, 0L);
        f(true);
    }

    public static void f(boolean z10) {
        if (((q) c()).o1() != z10) {
            if (z10) {
                ((q) c()).k();
            } else {
                ((q) c()).p1();
            }
        }
    }

    public static b g() {
        Long lD = d();
        z zVarB = b();
        String str = zVarB != null ? zVarB.f2996d : null;
        a2 a2Var = (a2) f8241a.getValue();
        String strL = a2Var != null ? na.c.l(a2Var) : null;
        if (lD == null || str == null || strL == null) {
            return null;
        }
        return new b(strL, str, na.w.m(str), lD.longValue());
    }

    public static Object h(i iVar) {
        pf.e eVar = hf.l0.f8566a;
        return hf.a0.H(pf.d.f17138c, new c(2, null, 0), iVar);
    }
}
