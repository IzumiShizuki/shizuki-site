package e5;

import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import b0.c1;
import b7.c3;
import b7.q0;
import j5.u;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import m4.o0;
import m4.p0;
import p4.c0;
import s4.v;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class c implements n5.j {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final c3 f6155o = new c3(11);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c1 f6156a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r f6157b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m3.l f6158c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ah.j f6161f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public n5.o f6162g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Handler f6163h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public c5.l f6164i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public n f6165j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Uri f6166k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public k f6167l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f6168m;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final CopyOnWriteArrayList f6160e = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashMap f6159d = new HashMap();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f6169n = -9223372036854775807L;

    public c(c1 c1Var, m3.l lVar, r rVar) {
        this.f6156a = c1Var;
        this.f6157b = rVar;
        this.f6158c = lVar;
    }

    public final k a(boolean z10, Uri uri) {
        HashMap map = this.f6159d;
        k kVar = ((b) map.get(uri)).f6146d;
        if (kVar != null && z10) {
            if (!uri.equals(this.f6166k)) {
                List list = this.f6165j.f6242e;
                int i10 = 0;
                while (true) {
                    if (i10 >= list.size()) {
                        break;
                    }
                    if (uri.equals(((m) list.get(i10)).f6234a)) {
                        k kVar2 = this.f6167l;
                        if (kVar2 == null || !kVar2.f6222o) {
                            this.f6166k = uri;
                            b bVar = (b) map.get(uri);
                            k kVar3 = bVar.f6146d;
                            if (kVar3 == null || !kVar3.f6222o) {
                                bVar.e(b(uri));
                            } else {
                                this.f6167l = kVar3;
                                this.f6164i.v(kVar3);
                            }
                        }
                    } else {
                        i10++;
                    }
                }
            }
            b bVar2 = (b) map.get(uri);
            k kVar4 = bVar2.f6146d;
            if (!bVar2.f6153k) {
                bVar2.f6153k = true;
                if (kVar4 != null && !kVar4.f6222o) {
                    bVar2.c(true);
                }
            }
        }
        return kVar;
    }

    public final Uri b(Uri uri) {
        g gVar;
        k kVar = this.f6167l;
        if (kVar == null || !kVar.f6229v.f6210e || (gVar = (g) kVar.f6227t.get(uri)) == null) {
            return uri;
        }
        Uri.Builder builderBuildUpon = uri.buildUpon();
        builderBuildUpon.appendQueryParameter("_HLS_msn", String.valueOf(gVar.f6191b));
        int i10 = gVar.f6192c;
        if (i10 != -1) {
            builderBuildUpon.appendQueryParameter("_HLS_part", String.valueOf(i10));
        }
        return builderBuildUpon.build();
    }

    public final boolean c(Uri uri) {
        int i10;
        b bVar = (b) this.f6159d.get(uri);
        if (bVar.f6146d == null) {
            return false;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long jMax = Math.max(30000L, c0.c0(bVar.f6146d.f6228u));
        k kVar = bVar.f6146d;
        return kVar.f6222o || (i10 = kVar.f6211d) == 2 || i10 == 1 || bVar.f6147e + jMax > jElapsedRealtime;
    }

    @Override // n5.j
    public final void k(n5.l lVar, long j10, long j11) {
        n nVar;
        n5.r rVar = (n5.r) lVar;
        o oVar = (o) rVar.f15380f;
        boolean z10 = oVar instanceof k;
        if (z10) {
            String str = oVar.f6249a;
            n nVar2 = n.f6240l;
            Uri uri = Uri.parse(str);
            m4.p pVar = new m4.p();
            pVar.f14476a = "0";
            pVar.f14487l = o0.p("application/x-mpegURL");
            List listSingletonList = Collections.singletonList(new m(uri, new m4.q(pVar), null, null, null, null));
            List list = Collections.EMPTY_LIST;
            nVar = new n("", list, listSingletonList, list, list, list, list, null, null, false, Collections.EMPTY_MAP, list);
        } else {
            nVar = (n) oVar;
        }
        this.f6165j = nVar;
        this.f6166k = ((m) nVar.f6242e.get(0)).f6234a;
        this.f6160e.add(new a(this));
        List list2 = nVar.f6241d;
        int size = list2.size();
        for (int i10 = 0; i10 < size; i10++) {
            Uri uri2 = (Uri) list2.get(i10);
            this.f6159d.put(uri2, new b(this, uri2));
        }
        Uri uri3 = rVar.f15378d.f19399c;
        u uVar = new u(j11);
        b bVar = (b) this.f6159d.get(this.f6166k);
        if (z10) {
            bVar.f((k) oVar, uVar);
        } else {
            bVar.c(false);
        }
        this.f6158c.getClass();
        this.f6161f.B(uVar, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    @Override // n5.j
    public final void r(n5.l lVar, long j10, long j11, int i10) {
        u uVar;
        n5.r rVar = (n5.r) lVar;
        if (i10 == 0) {
            long j12 = rVar.f15375a;
            uVar = new u(rVar.f15376b);
        } else {
            long j13 = rVar.f15375a;
            Uri uri = rVar.f15378d.f19399c;
            uVar = new u(j11);
        }
        this.f6161f.E(uVar, rVar.f15377c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, i10);
    }

    @Override // n5.j
    public final void s(n5.l lVar, long j10, long j11, boolean z10) {
        n5.r rVar = (n5.r) lVar;
        long j12 = rVar.f15375a;
        Uri uri = rVar.f15378d.f19399c;
        u uVar = new u(j11);
        this.f6158c.getClass();
        this.f6161f.A(uVar, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    @Override // n5.j
    public final q0 v(n5.l lVar, long j10, long j11, IOException iOException, int i10) {
        long jMin;
        n5.r rVar = (n5.r) lVar;
        long j12 = rVar.f15375a;
        Uri uri = rVar.f15378d.f19399c;
        u uVar = new u(j11);
        int i11 = rVar.f15377c;
        this.f6158c.getClass();
        if ((iOException instanceof p0) || (iOException instanceof FileNotFoundException) || (iOException instanceof v) || (iOException instanceof n5.n)) {
            jMin = -9223372036854775807L;
            break;
        }
        int i12 = s4.j.f19426b;
        for (Throwable cause = iOException; cause != null; cause = cause.getCause()) {
            if ((cause instanceof s4.j) && ((s4.j) cause).f19427a == 2008) {
                jMin = -9223372036854775807L;
                break;
            }
        }
        jMin = Math.min((i10 - 1) * 1000, 5000);
        boolean z10 = jMin == -9223372036854775807L;
        this.f6161f.D(uVar, i11, iOException, z10);
        return z10 ? n5.o.f15371f : new q0(0, false, jMin);
    }
}
