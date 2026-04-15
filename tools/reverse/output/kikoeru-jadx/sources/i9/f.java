package i9;

import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.os.Build;
import bg.p0;
import com.cnl.kikoeru.R;
import com.tencent.bugly.beta.tinker.TinkerReport;
import java.io.File;
import m0.c1;
import m0.d9;
import m0.e9;
import m0.h1;
import m0.k5;
import m0.l3;
import m0.r1;
import m0.t3;
import m0.v5;
import m0.x2;
import m0.y5;
import n7.w;
import na.q;
import pc.u;
import t4.v;
import t4.y;
import ub.a0;
import wf.n1;
import x0.o2;
import x0.z;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f implements ic.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9476a;

    public /* synthetic */ f(int i10) {
        this.f9476a = i10;
    }

    @Override // ic.a
    public final Object b() {
        int i10 = this.f9476a;
        int i11 = 10;
        a0 a0Var = a0.f21526a;
        int i12 = 0;
        switch (i10) {
            case 0:
                return new y(new File(a9.i.a().getFilesDir(), "download"), new v(), (r4.b) g.f9478b.getValue());
            case 1:
                t4.e eVar = new t4.e();
                eVar.f20418a = (y) g.f9479c.getValue();
                eVar.f20422e = (e) g.f9477a.getValue();
                eVar.f20420c = null;
                eVar.f20421d = true;
                eVar.f20423f = 2;
                return eVar;
            case 2:
                t4.e eVar2 = (t4.e) g.f9480d.getValue();
                s4.g gVar = eVar2.f20422e;
                return eVar2.b(gVar != null ? gVar.q() : null, eVar2.f20423f);
            case 3:
                if (Build.VERSION.SDK_INT < 26) {
                    return null;
                }
                AudioFocusRequest.Builder audioAttributes = b7.l.g().setAudioAttributes(new AudioAttributes.Builder().setUsage(1).setContentType(2).build());
                g1.d dVar = n.f9487a;
                return audioAttributes.setOnAudioFocusChangeListener(new j(i12)).build();
            case 4:
                z zVar = j4.a.f10201a;
                return null;
            case 5:
                h2.g gVar2 = la.j.f12014b;
                return Boolean.FALSE;
            case 6:
                return c1.d(0L, 0L, 0L, 4095);
            case 7:
                z zVar2 = h1.f13043a;
                return Float.valueOf(1.0f);
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_DALVIK /* 8 */:
                o2 o2Var = x2.f13883a;
                return r1.f13544a;
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_ART /* 9 */:
                return new f3.f(0);
            case TinkerReport.KEY_APPLY_WITH_RETRY /* 10 */:
                return a0Var;
            case 11:
                o2 o2Var2 = t3.f13651a;
                return Boolean.TRUE;
            case 12:
                return new k5();
            case 13:
                o2 o2Var3 = v5.f13759a;
                return null;
            case 14:
                float f10 = 4;
                return new y5(g0.g.a(f10), g0.g.a(f10), g0.g.a(0));
            case 15:
                throw null;
            case 16:
                return e9.f12959a;
            case 17:
                return new d9(null, 16383);
            case 18:
                ef.l lVar = g9.a.f7454a;
                q.e("https://www.asmr-300.com");
                return a0Var;
            case 19:
                return a0Var;
            case 20:
                return Boolean.TRUE;
            case 21:
                u[] uVarArr = n9.e.f15668c;
                d9.m mVarS = a9.i.c().s();
                mVarS.getClass();
                return new d9.f(new w("SELECT * FROM DownloadBean ORDER BY timestamp DESC", new l3(i11)), mVarS, mVarS.f5579a, new String[]{"DownloadBean"}, 2);
            case 22:
                return new String[]{q.g(R.string.privacy_private), q.g(R.string.privacy_protect), q.g(R.string.privacy_public)};
            case 23:
                String str = a9.i.a().getPackageManager().getPackageInfo(a9.i.a().getPackageName(), 0).versionName;
                return str == null ? "" : str;
            case 24:
                return Integer.valueOf(a9.i.a().getPackageManager().getPackageInfo(a9.i.a().getPackageName(), 0).versionCode);
            case 25:
                return new wf.d(na.d.f15680a, 0);
            case 26:
                oh.b bVar = new oh.b();
                bVar.f16469e = true;
                bVar.f16473i = null;
                bVar.f16472h = new ph.b[3];
                bVar.c();
                return bVar;
            case 27:
                d9.o oVarT = a9.i.c().t();
                oVarT.getClass();
                return new d9.f(new w("SELECT * FROM HistoryBean ORDER BY timestamp DESC", new l3(i11)), oVarT, oVarT.f5585a, new String[]{"HistoryBean"}, 3);
            case 28:
                return new wf.d(n1.f24152a, 0);
            default:
                return new q9.q(p0.f2950a, bg.u.f2974a, null, false, null);
        }
    }

    public /* synthetic */ f(n7.k kVar) {
        this.f9476a = 19;
    }
}
