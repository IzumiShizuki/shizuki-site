package a9;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteTransactionListener;
import android.os.CancellationSignal;
import android.os.StatFs;
import android.view.inputmethod.InputMethodManager;
import b7.b1;
import bg.e2;
import com.cnl.kikoeru.MainApplication;
import com.cnl.kikoeru.data.db.AppDatabase;
import com.tencent.bugly.beta.tinker.TinkerReport;
import g5.w;
import hf.l0;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.UUID;
import jc.z;
import lh.y;
import m0.l3;
import pc.f0;
import q9.i0;
import ub.a0;
import ug.x;
import x0.p1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g implements ic.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f227a;

    public /* synthetic */ g(int i10) {
        this.f227a = i10;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, ub.h] */
    @Override // ic.a
    public final Object b() throws IOException {
        Class<?> returnType;
        int i10 = this.f227a;
        int i11 = 2;
        a0 a0Var = a0.f21526a;
        Class cls = Boolean.TYPE;
        int i12 = 1;
        int i13 = 0;
        switch (i10) {
            case 0:
                return f0.P(gg.c.a(), "token", "", z.a(String.class));
            case 1:
                q8.a aVar = new q8.a(i.a());
                aVar.f17911b = 0.25d;
                return aVar.a();
            case 2:
                lh.u uVar = lh.l.f12595a;
                pf.e eVar = l0.f8566a;
                pf.d dVar = pf.d.f17138c;
                File cacheDir = i.a().getCacheDir();
                jc.l.d(cacheDir, "getCacheDir(...)");
                File fileI0 = fc.b.i0(cacheDir, "coil_cache");
                String str = y.f12619b;
                y yVarW = w.w(fileI0);
                ub.p pVar = na.q.f15736a;
                long j10 = 1024;
                long jL = ((long) 1) * j10 * j10 * j10;
                if (jL <= 0) {
                    throw new IllegalArgumentException("size must be > 0.");
                }
                if (0.0d > 0.0d) {
                    try {
                        File file = yVarW.toFile();
                        file.mkdir();
                        StatFs statFs = new StatFs(file.getAbsolutePath());
                        jL = nh.b.l((long) (0.0d * statFs.getBlockCountLong() * statFs.getBlockSizeLong()), 10485760L, 262144000L);
                    } catch (Exception unused) {
                        jL = 10485760;
                    }
                }
                return new k8.f(jL, dVar, uVar, yVarW);
            case 3:
                byte[] bArr = new byte[16];
                gf.a.f7538a.nextBytes(bArr);
                byte b10 = (byte) (bArr[6] & 15);
                bArr[6] = b10;
                bArr[6] = (byte) (b10 | 64);
                byte b11 = (byte) (bArr[8] & 63);
                bArr[8] = b11;
                bArr[8] = (byte) (b11 | 128);
                long jY = lc.b.y(bArr, 0);
                long jY2 = lc.b.y(bArr, 8);
                return f0.P(gg.c.a(), "recommenderUuid", ((jY == 0 && jY2 == 0) ? gf.b.f7539c : new gf.b(jY, jY2)).toString(), z.a(String.class));
            case 4:
                return lc.b.G("refreshRepoPage", Boolean.FALSE, gg.c.a(), false, z.a(cls));
            case 5:
                return lc.b.G("refreshFavPage", Boolean.FALSE, gg.c.a(), false, z.a(cls));
            case 6:
                return f0.P(gg.c.a(), "forceSoftwareDecode", Boolean.FALSE, z.a(cls));
            case 7:
                MainApplication mainApplication = MainApplication.f4295a;
                if (mainApplication != null) {
                    return mainApplication;
                }
                jc.l.k("INSTANCE");
                throw null;
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_DALVIK /* 8 */:
                AppDatabase appDatabase = MainApplication.f4297c;
                if (appDatabase != null) {
                    return appDatabase;
                }
                jc.l.k("DATABASE");
                throw null;
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_ART /* 9 */:
                return hf.a0.d();
            case TinkerReport.KEY_APPLY_WITH_RETRY /* 10 */:
                b1 b1Var = new b1(i.a());
                b1Var.f1654f = ub.a.d(new g(11));
                b1Var.f1652d = ub.a.d(new g(i12));
                b1Var.f1653e = ub.a.d(new g(i11));
                return b1Var.n();
            case 11:
                ef.l lVar = new ef.l("https://.+/api/cover/RJ(\\d{6,8}).+");
                int i14 = ff.a.f7057d;
                String strValueOf = String.valueOf(ff.a.h(ff.f.m(30, ff.c.DAYS), ff.c.SECONDS));
                ug.w wVar = new ug.w();
                wVar.f21883c.add(new h(i13, lVar));
                wVar.f21884d.add(new h(i12, strValueOf));
                return new x(wVar);
            case 12:
                throw new IllegalStateException("Not Provide");
            case 13:
                throw new IllegalStateException("Not Provide");
            case 14:
                throw new IllegalStateException("AppNavController Not Provide");
            case 15:
                f0.P(gg.c.a(), "defaultBackground", "", z.a(String.class)).d("");
                p1 p1Var = ka.b.f11244f;
                if (p1Var != null) {
                    p1Var.c();
                }
                return a0Var;
            case 16:
                try {
                    Method declaredMethod = SQLiteDatabase.class.getDeclaredMethod("getThreadSession", null);
                    declaredMethod.setAccessible(true);
                    return declaredMethod;
                } catch (Throwable unused2) {
                    return null;
                }
            case 17:
                try {
                    Method method = (Method) b8.b.f2235c.getValue();
                    if (method == null || (returnType = method.getReturnType()) == null) {
                        return null;
                    }
                    Class<?> cls2 = Integer.TYPE;
                    return returnType.getDeclaredMethod("beginTransaction", cls2, SQLiteTransactionListener.class, cls2, CancellationSignal.class);
                } catch (Throwable unused3) {
                    return null;
                }
            case 18:
                File file2 = new File(i.a().getFilesDir(), "metadata");
                na.c.d(file2);
                return file2;
            case 19:
                return lc.b.G("searchOrder", g9.a.b() ? e2.f2877b : e2.f2876a, gg.c.a(), false, z.a(e2.class));
            case 20:
                return lc.b.G("searchSort", bg.u.f2974a, gg.c.a(), false, z.a(bg.u.class));
            case 21:
                return lc.b.G("searchSubtitle", Boolean.FALSE, gg.c.a(), false, z.a(cls));
            case 22:
                return lc.b.G("searchTranslate", Boolean.TRUE, gg.c.a(), false, z.a(cls));
            case 23:
                d9.x xVar = (d9.x) i.c().f4307l.getValue();
                xVar.getClass();
                return new d9.f(new n7.w("SELECT content FROM SearchHistoryBean ORDER BY timestamp DESC", new l3(10)), xVar, xVar.f5614a, new String[]{"SearchHistoryBean"}, 4);
            case 24:
                InputStream inputStreamOpen = i.a().getAssets().open("subtitle.txt");
                try {
                    jc.l.b(inputStreamOpen);
                    String strV = android.support.v4.media.session.b.V(new InputStreamReader(inputStreamOpen, ef.a.f6541a));
                    inputStreamOpen.close();
                    return ef.n.K0(strV, new String[]{"\n"});
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        a.a.w(inputStreamOpen, th2);
                        throw th3;
                    }
                }
            case 25:
                return ((Boolean) h9.d.f8244d.getValue()).booleanValue() ? n7.e.u() : nh.a.r();
            case 26:
                h9.d.f(!((androidx.lifecycle.q) h9.d.c()).o1());
                return a0Var;
            case 27:
                try {
                    Field declaredField = InputMethodManager.class.getDeclaredField("mServedView");
                    declaredField.setAccessible(true);
                    Field declaredField2 = InputMethodManager.class.getDeclaredField("mNextServedView");
                    declaredField2.setAccessible(true);
                    Field declaredField3 = InputMethodManager.class.getDeclaredField("mH");
                    declaredField3.setAccessible(true);
                    return new d.z(declaredField3, declaredField, declaredField2);
                } catch (NoSuchFieldException unused4) {
                    return d.y.f5261a;
                }
            case 28:
                return new i0(5);
            default:
                return UUID.randomUUID().toString();
        }
    }
}
