package i9;

import android.net.Uri;
import bg.a2;
import h1.s;
import java.util.Collection;
import jc.a0;
import jc.z;
import n7.b0;
import na.w;
import pc.f0;
import pc.u;
import q.t0;
import v4.v;
import x0.e1;
import xf.r;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final o f9489a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ u[] f9490b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final hg.b f9491c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final hg.b f9492d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final hg.b f9493e;

    static {
        jc.o oVar = new jc.o(o.class, "workSave", "getWorkSave()Ljava/lang/String;", 0);
        a0 a0Var = z.f10839a;
        f9490b = new u[]{a0Var.e(oVar), t0.G(o.class, "nowPlayingSave", "getNowPlayingSave()I", 0, a0Var), t0.G(o.class, "musicListSave", "getMusicListSave()Ljava/lang/String;", 0, a0Var)};
        f9489a = new o();
        f9491c = f0.P(gg.c.a(), "workSave", "", z.a(String.class));
        f9492d = f0.P(gg.c.a(), "nowPlayingSave", 0, z.a(Integer.TYPE));
        f9493e = f0.P(gg.c.a(), "musicListSave", "", z.a(String.class));
    }

    public static String a() {
        return (String) f9493e.c(f9490b[2]);
    }

    public static String b() {
        return (String) f9491c.c(f9490b[0]);
    }

    public static void c(v vVar) {
        String str;
        int length = b().length();
        o oVar = f9489a;
        if (length > 0) {
            e1 e1Var = h9.d.f8241a;
            oVar.getClass();
            String strB = b();
            r rVar = w.f15765a;
            rVar.getClass();
            e1Var.setValue(rVar.a(strB, b0.o(a2.Companion.serializer())));
        }
        e1 e1Var2 = h9.d.f8242b;
        e1Var2.setValue(Integer.valueOf(((Number) f9492d.c(f9490b[1])).intValue()));
        if (a().length() > 0) {
            s sVar = h9.d.f8243c;
            sVar.clear();
            oVar.getClass();
            String strA = a();
            r rVar2 = w.f15765a;
            rVar2.getClass();
            sVar.addAll((Collection) rVar2.a(strA, new wf.d(bg.z.Companion.serializer(), 0)));
        }
        Integer num = (Integer) e1Var2.getValue();
        a2 a2Var = (a2) h9.d.f8241a.getValue();
        vVar.A0(h9.d.a(h9.d.f8243c, (a2Var == null || (str = a2Var.I) == null) ? null : Uri.parse(str)));
        vVar.c();
        if (num == null || num.intValue() == 0) {
            return;
        }
        vVar.r1(num.intValue(), false, 0L);
    }

    public static void d() {
        String strB;
        a2 a2Var = (a2) h9.d.f8241a.getValue();
        if (a2Var != null) {
            r rVar = w.f15765a;
            rVar.getClass();
            strB = rVar.b(a2.Companion.serializer(), a2Var);
        } else {
            strB = null;
        }
        u[] uVarArr = f9490b;
        if (strB != null && !strB.equals(b())) {
            f9491c.e(strB, uVarArr[0]);
        }
        Integer num = (Integer) h9.d.f8242b.getValue();
        if (num != null) {
            u uVar = uVarArr[1];
            hg.b bVar = f9492d;
            if (num.intValue() != ((Number) bVar.c(uVar)).intValue()) {
                bVar.e(num, uVarArr[1]);
            }
        }
        s sVar = h9.d.f8243c;
        r rVar2 = w.f15765a;
        rVar2.getClass();
        String strB2 = rVar2.b(new wf.d(bg.z.Companion.serializer(), 0), sVar);
        if (strB2.equals(a())) {
            return;
        }
        f9493e.e(strB2, uVarArr[2]);
    }
}
