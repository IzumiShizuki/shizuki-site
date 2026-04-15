package m8;

import android.net.Uri;
import ub.p;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class i implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f14953a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p f14954b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f14955c;

    public i(p pVar, p pVar2, boolean z10) {
        this.f14953a = pVar;
        this.f14954b = pVar2;
        this.f14955c = z10;
    }

    @Override // m8.f
    public final g a(Object obj, s8.m mVar) {
        Uri uri = (Uri) obj;
        if (!jc.l.a(uri.getScheme(), "http") && !jc.l.a(uri.getScheme(), "https")) {
            return null;
        }
        return new l(uri.toString(), mVar, this.f14953a, this.f14954b, this.f14955c);
    }
}
