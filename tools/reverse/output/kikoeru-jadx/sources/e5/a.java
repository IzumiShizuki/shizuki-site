package e5;

import android.net.Uri;
import android.os.SystemClock;
import b7.q0;
import java.util.HashMap;
import java.util.List;
import p4.c0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class a implements s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c f6142a;

    public a(c cVar) {
        this.f6142a = cVar;
    }

    @Override // e5.s
    public final void a() {
        this.f6142a.f6160e.remove(this);
    }

    @Override // e5.s
    public final boolean b(Uri uri, b7.m mVar, boolean z10) {
        b bVar;
        c cVar = this.f6142a;
        HashMap map = cVar.f6159d;
        if (cVar.f6167l == null) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            n nVar = cVar.f6165j;
            int i10 = c0.f16548a;
            List list = nVar.f6242e;
            int i11 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                b bVar2 = (b) map.get(((m) list.get(i12)).f6234a);
                if (bVar2 != null && jElapsedRealtime < bVar2.f6150h) {
                    i11++;
                }
            }
            eg.g gVar = new eg.g(1, 0, cVar.f6165j.f6242e.size(), i11);
            cVar.f6158c.getClass();
            q0 q0VarT = m3.l.t(gVar, mVar);
            if (q0VarT != null && q0VarT.f2038b == 2 && (bVar = (b) map.get(uri)) != null) {
                b.a(bVar, q0VarT.f2037a);
            }
        }
        return false;
    }
}
