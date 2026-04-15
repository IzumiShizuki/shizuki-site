package oa;

import j2.h0;
import java.io.Serializable;
import jc.l;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class g implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final app.nekogram.translator.c f16297a;

    public g(app.nekogram.translator.c cVar) {
        l.e(cVar, "translator");
        this.f16297a = cVar;
    }

    @Override // oa.e
    public final Serializable a(String str, String str2, String str3) {
        l.e(str, "text");
        l.e(str2, "src");
        l.e(str3, "dst");
        return h0.b(this, str, str2, str3, this.f16297a instanceof app.nekogram.translator.g ? 2500 : 5000);
    }

    @Override // oa.e
    public final Serializable b(String str, String str2, String str3) {
        app.nekogram.translator.c cVar = this.f16297a;
        l.e(str, "text");
        l.e(str2, "src");
        l.e(str3, "dst");
        try {
            if (str2.equals("zh-CN")) {
                str2 = "zh";
            }
            if (str3.equals("zh-CN")) {
                str3 = "zh";
            }
            return cVar.c(str, cVar.b(cVar.a(str2)), cVar.a(str3)).f1134b;
        } catch (Throwable th2) {
            return ub.a.b(th2);
        }
    }
}
