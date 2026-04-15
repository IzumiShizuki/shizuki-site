package ma;

import a9.i;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import com.cnl.kikoeru.MainApplication;
import com.tencent.bugly.beta.tinker.TinkerReport;
import ef.j;
import ef.l;
import java.util.Map;
import jc.z;
import pc.f0;
import q9.w;
import ub.a0;
import x0.w0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements ic.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15054a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w0 f15055b;

    public /* synthetic */ c(w0 w0Var, int i10) {
        this.f15054a = i10;
        this.f15055b = w0Var;
    }

    @Override // ic.a
    public final Object b() {
        switch (this.f15054a) {
            case 0:
                this.f15055b.setValue(Boolean.FALSE);
                break;
            case 1:
                this.f15055b.setValue(Boolean.FALSE);
                break;
            case 2:
                this.f15055b.setValue(Boolean.FALSE);
                break;
            case 3:
                Boolean bool = Boolean.FALSE;
                f0.P(gg.c.a(), "appLinkVerify", bool, z.a(Boolean.TYPE)).d(Boolean.TRUE);
                this.f15055b.setValue(bool);
                break;
            case 4:
                this.f15055b.setValue(Boolean.FALSE);
                break;
            case 5:
                try {
                    if (Build.VERSION.SDK_INT >= 31) {
                        MainApplication mainApplicationA = i.a();
                        Intent intent = new Intent("android.settings.APP_OPEN_BY_DEFAULT_SETTINGS", Uri.parse("package:" + i.a().getPackageName()));
                        intent.setFlags(268435456);
                        mainApplicationA.startActivity(intent);
                    }
                } catch (Throwable unused) {
                    MainApplication mainApplicationA2 = i.a();
                    Intent intent2 = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS", Uri.parse("package:" + i.a().getPackageName()));
                    intent2.setFlags(268435456);
                    mainApplicationA2.startActivity(intent2);
                }
                this.f15055b.setValue(Boolean.FALSE);
                break;
            case 6:
                j jVarA = l.a(w.f18121b, (String) this.f15055b.getValue());
                if (jVarA != null) {
                    String strGroup = jVarA.f6571a.group();
                    jc.l.d(strGroup, "group(...)");
                }
                break;
            case 7:
                this.f15055b.setValue(Boolean.FALSE);
                break;
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_DALVIK /* 8 */:
                this.f15055b.setValue(Boolean.FALSE);
                break;
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_ART /* 9 */:
                this.f15055b.setValue(Boolean.TRUE);
                break;
            case TinkerReport.KEY_APPLY_WITH_RETRY /* 10 */:
                this.f15055b.setValue(Boolean.FALSE);
                break;
            case 11:
                this.f15055b.setValue(Boolean.FALSE);
                break;
            case 12:
                this.f15055b.setValue(Boolean.FALSE);
                break;
            case 13:
                this.f15055b.setValue(Boolean.FALSE);
                break;
            case 14:
                this.f15055b.setValue(Boolean.FALSE);
                break;
            case 15:
                this.f15055b.setValue(Boolean.TRUE);
                break;
            case 16:
                this.f15055b.setValue(Boolean.TRUE);
                break;
            case 17:
                this.f15055b.setValue(Boolean.FALSE);
                break;
            case 18:
                this.f15055b.setValue(Boolean.FALSE);
                break;
            case 19:
                this.f15055b.setValue(Boolean.FALSE);
                break;
            case 20:
                this.f15055b.setValue(Boolean.TRUE);
                break;
            case 21:
                this.f15055b.setValue(Boolean.TRUE);
                break;
            case 22:
                this.f15055b.setValue(Boolean.FALSE);
                break;
            case 23:
                this.f15055b.setValue(Boolean.FALSE);
                break;
            case 24:
                this.f15055b.setValue(Boolean.FALSE);
                break;
            case 25:
                this.f15055b.setValue(Boolean.FALSE);
                break;
            case 26:
                this.f15055b.setValue(Boolean.TRUE);
                break;
            case 27:
                Object obj = ((Map) t9.e.f20581a.getValue()).get((t9.a) this.f15055b.getValue());
                jc.l.b(obj);
                break;
            case 28:
                this.f15055b.setValue(Boolean.TRUE);
                break;
            default:
                this.f15055b.setValue(Boolean.FALSE);
                break;
        }
        return a0.f21526a;
    }
}
