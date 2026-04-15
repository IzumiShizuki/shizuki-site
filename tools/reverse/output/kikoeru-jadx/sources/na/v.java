package na;

import b7.b1;
import com.cnl.kikoeru.MainApplication;
import com.cnl.kikoeru.R;
import da.p0;
import java.util.List;
import pc.f0;
import q.t0;
import ug.d0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final v f15761a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ pc.u[] f15762b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f15763c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final hg.b f15764d;

    static {
        jc.o oVar = new jc.o(v.class, "lastCheckVersion", "getLastCheckVersion()Ljava/lang/String;", 0);
        jc.a0 a0Var = jc.z.f10839a;
        f15762b = new pc.u[]{a0Var.e(oVar), t0.G(v.class, "lastCheckVersionTime", "getLastCheckVersionTime()J", 0, a0Var)};
        f15761a = new v();
        f15763c = "https://api.github.com/repos/loli-ball/KikoeruRelease/releases/latest";
        f0.P(gg.c.a(), "lastCheckVersion", "", jc.z.a(String.class));
        f15764d = f0.P(gg.c.a(), "lastCheckVersion", 0L, jc.z.a(Long.TYPE));
    }

    public static final void a(v vVar, boolean z10) {
        int iG;
        vVar.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        pc.u[] uVarArr = f15762b;
        pc.u uVar = uVarArr[1];
        hg.b bVar = f15764d;
        long jLongValue = jCurrentTimeMillis - ((Number) bVar.c(uVar)).longValue();
        int i10 = ff.a.f7057d;
        if (jLongValue < ff.a.d(ff.f.m(1, ff.c.DAYS))) {
            return;
        }
        bVar.e(Long.valueOf(System.currentTimeMillis()), uVarArr[1]);
        String str = (String) q.f15736a.getValue();
        ug.x xVar = MainApplication.f4296b;
        if (xVar == null) {
            jc.l.k("DEFAULT_OKHTTP_CLIENT");
            throw null;
        }
        ch.l lVar = new ch.l(10);
        lVar.B(f15763c);
        d0 d0VarF = xVar.a(new b1(lVar)).f();
        try {
            String strN = d0VarF.f21762g.n();
            xf.r rVar = w.f15765a;
            rVar.getClass();
            u uVar2 = (u) rVar.a(strN, u.Companion.serializer());
            d0VarF.close();
            String str2 = uVar2.f15750h;
            List listK0 = ef.n.K0(str2, new String[]{"."});
            List listK02 = ef.n.K0(str, new String[]{"."});
            oc.c it = ud.b.q(listK0).iterator();
            while (true) {
                if (!it.f16312c) {
                    iG = 0;
                    break;
                }
                int iNextInt = it.nextInt();
                iG = jc.l.g(Integer.parseInt((String) listK0.get(iNextInt)), Integer.parseInt((String) listK02.get(iNextInt)));
                if (iG != 0) {
                    break;
                }
            }
            if (iG > 0) {
                ka.j.d("", null, null, new j3.q(4), new f1.f(new p0(uVar2, !(Integer.parseInt((String) vb.m.Y(ef.n.K0(str2, new String[]{"."}))) > Integer.parseInt((String) vb.m.Y(ef.n.K0(str, new String[]{"."}))))), -1101612113, true), 191);
            } else if (z10) {
                ka.n.c(q.g(R.string.already_newest), 0L, null, null, 511);
            }
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                a.a.w(d0VarF, th2);
                throw th3;
            }
        }
    }
}
