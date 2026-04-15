package rb;

import android.os.FileObserver;
import cb.t;
import com.tencent.bugly.crashreport.crash.anr.h;
import com.tencent.bugly.proguard.X;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class a extends FileObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18986a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f18987b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(h hVar) {
        super("/data/anr/", 8);
        this.f18987b = hVar;
    }

    @Override // android.os.FileObserver
    public final void onEvent(int i10, String str) {
        int i11 = this.f18986a;
        h hVar = this.f18987b;
        switch (i11) {
            case 0:
                if (str != null) {
                    String strConcat = "/data/anr/".concat(str);
                    X.e("watching file %s", strConcat);
                    if (!strConcat.contains("trace")) {
                        X.e("not anr file %s", strConcat);
                    } else {
                        hVar.f4707f.a(new t(8, this, strConcat, false));
                    }
                    break;
                }
                break;
            default:
                if (str != null) {
                    X.e("startWatchingPrivateAnrDir %s", str);
                    if (!hVar.b(str)) {
                        X.a("trace file not caused by sigquit , ignore ", new Object[0]);
                    } else if (hVar.f4713l != null) {
                        hVar.f4713l.a(true);
                    }
                    break;
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(h hVar, String str) {
        super(str, 256);
        this.f18987b = hVar;
    }
}
