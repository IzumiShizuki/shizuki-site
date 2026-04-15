package m8;

import android.webkit.MimeTypeMap;
import ef.n;
import g5.w;
import java.io.File;
import lh.y;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class h implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final File f14952a;

    public h(File file) {
        this.f14952a = file;
    }

    @Override // m8.g
    public final Object a(yb.c cVar) {
        String str = y.f12619b;
        File file = this.f14952a;
        j8.m mVar = new j8.m(w.w(file), lh.l.f12595a, null, null);
        MimeTypeMap singleton = MimeTypeMap.getSingleton();
        String name = file.getName();
        jc.l.d(name, "getName(...)");
        return new m(mVar, singleton.getMimeTypeFromExtension(n.Q0('.', name, "")), j8.f.f10615c);
    }
}
