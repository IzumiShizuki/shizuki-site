package g9;

import a9.i;
import android.content.Intent;
import com.cnl.kikoeru.MainApplication;
import com.cnl.kikoeru.R;
import e.e;
import ef.l;
import fg.f;
import j2.h0;
import java.util.List;
import na.q;
import ub.p;
import ud.b;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l f7454a = new l("https?://(?:.*asmr\\.one)|(?:.*asmr-[123]00\\.com)/work/RJ(\\d+)");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final l f7455b = new l("https?://.*dlsite.com/\\w+/work/=/product_id/RJ(\\d+).html");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final p f7456c = ub.a.d(new e(16));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final p f7457d = ub.a.d(new e(17));

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final List f7458e = b.x("https://api.asmr.one", "https://api.asmr-100.com", "https://api.asmr-200.com", "https://api.asmr-300.com");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final p f7459f = ub.a.d(new e(18));

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f7460g = "kikoeru android app 3.0.9(67)";

    public static f a() {
        return (f) f7456c.getValue();
    }

    public static boolean b() {
        return f7458e.contains(a().getValue());
    }

    public static boolean c() {
        return ((Boolean) f7459f.getValue()).booleanValue();
    }

    public static void d(long j10) {
        String strI = h0.i(j10, "https://www.asmr-300.com/work/");
        MainApplication mainApplicationA = i.a();
        jc.l.e(strI, "text");
        jc.l.e(mainApplicationA, "ctx");
        Intent intent = new Intent("android.intent.action.SEND");
        intent.putExtra("android.intent.extra.TEXT", strI);
        intent.addFlags(268435456);
        intent.setType("text/plain");
        Intent intentCreateChooser = Intent.createChooser(intent, q.g(R.string.choose_target_app));
        intentCreateChooser.addFlags(268435456);
        mainApplicationA.startActivity(intentCreateChooser);
    }
}
