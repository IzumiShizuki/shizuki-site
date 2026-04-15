package e5;

import android.net.Uri;
import android.os.SystemClock;
import b7.q0;
import j5.u;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import m4.p0;
import p4.c0;
import s4.y;
import ya.i0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class b implements n5.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Uri f6143a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n5.o f6144b = new n5.o("DefaultHlsPlaylistTracker:MediaPlaylist");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final s4.h f6145c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public k f6146d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f6147e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f6148f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f6149g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f6150h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f6151i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public IOException f6152j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f6153k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ c f6154l;

    public b(c cVar, Uri uri) {
        this.f6154l = cVar;
        this.f6143a = uri;
        this.f6145c = ((s4.g) cVar.f6156a.f1208b).q();
    }

    public static boolean a(b bVar, long j10) {
        bVar.f6150h = SystemClock.elapsedRealtime() + j10;
        Uri uri = bVar.f6143a;
        c cVar = bVar.f6154l;
        if (!uri.equals(cVar.f6166k)) {
            return false;
        }
        List list = cVar.f6165j.f6242e;
        int size = list.size();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        for (int i10 = 0; i10 < size; i10++) {
            b bVar2 = (b) cVar.f6159d.get(((m) list.get(i10)).f6234a);
            bVar2.getClass();
            if (jElapsedRealtime > bVar2.f6150h) {
                Uri uri2 = bVar2.f6143a;
                cVar.f6166k = uri2;
                bVar2.e(cVar.b(uri2));
                return false;
            }
        }
        return true;
    }

    public final Uri b() {
        k kVar = this.f6146d;
        Uri uri = this.f6143a;
        if (kVar != null) {
            j jVar = kVar.f6229v;
            if (jVar.f6206a != -9223372036854775807L || jVar.f6210e) {
                Uri.Builder builderBuildUpon = uri.buildUpon();
                k kVar2 = this.f6146d;
                if (kVar2.f6229v.f6210e) {
                    builderBuildUpon.appendQueryParameter("_HLS_msn", String.valueOf(kVar2.f6218k + ((long) kVar2.f6225r.size())));
                    k kVar3 = this.f6146d;
                    if (kVar3.f6221n != -9223372036854775807L) {
                        i0 i0Var = kVar3.f6226s;
                        int size = i0Var.size();
                        if (!i0Var.isEmpty() && ((f) ya.q.k(i0Var)).f6189m) {
                            size--;
                        }
                        builderBuildUpon.appendQueryParameter("_HLS_part", String.valueOf(size));
                    }
                }
                j jVar2 = this.f6146d.f6229v;
                if (jVar2.f6206a != -9223372036854775807L) {
                    builderBuildUpon.appendQueryParameter("_HLS_skip", jVar2.f6207b ? "v2" : "YES");
                }
                return builderBuildUpon.build();
            }
        }
        return uri;
    }

    public final void c(boolean z10) {
        e(z10 ? b() : this.f6143a);
    }

    public final void d(Uri uri) {
        c cVar = this.f6154l;
        n5.q qVarJ = cVar.f6157b.J(cVar.f6165j, this.f6146d);
        Map map = Collections.EMPTY_MAP;
        p4.c.k(uri, "The uri must be set.");
        n5.r rVar = new n5.r(this.f6145c, new s4.m(uri, 0L, 1, null, map, 0L, -1L, null, 1), 4, qVarJ);
        this.f6144b.f(rVar, this, cVar.f6158c.u(rVar.f15377c));
    }

    public final void e(Uri uri) {
        this.f6150h = 0L;
        if (this.f6151i) {
            return;
        }
        n5.o oVar = this.f6144b;
        if (oVar.d() || oVar.c()) {
            return;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j10 = this.f6149g;
        if (jElapsedRealtime >= j10) {
            d(uri);
        } else {
            this.f6151i = true;
            this.f6154l.f6163h.postDelayed(new b5.h(13, this, uri), j10 - jElapsedRealtime);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:111:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x024f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(e5.k r73, j5.u r74) {
        /*
            Method dump skipped, instruction units count: 638
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e5.b.f(e5.k, j5.u):void");
    }

    @Override // n5.j
    public final void k(n5.l lVar, long j10, long j11) {
        n5.r rVar = (n5.r) lVar;
        o oVar = (o) rVar.f15380f;
        Uri uri = rVar.f15378d.f19399c;
        u uVar = new u(j11);
        if (oVar instanceof k) {
            f((k) oVar, uVar);
            this.f6154l.f6161f.B(uVar, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        } else {
            p0 p0VarB = p0.b("Loaded playlist has unexpected type.", null);
            this.f6152j = p0VarB;
            this.f6154l.f6161f.D(uVar, 4, p0VarB, true);
        }
        this.f6154l.f6158c.getClass();
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
        this.f6154l.f6161f.E(uVar, rVar.f15377c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, i10);
    }

    @Override // n5.j
    public final void s(n5.l lVar, long j10, long j11, boolean z10) {
        n5.r rVar = (n5.r) lVar;
        long j12 = rVar.f15375a;
        Uri uri = rVar.f15378d.f19399c;
        u uVar = new u(j11);
        c cVar = this.f6154l;
        cVar.f6158c.getClass();
        cVar.f6161f.A(uVar, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    @Override // n5.j
    public final q0 v(n5.l lVar, long j10, long j11, IOException iOException, int i10) {
        n5.r rVar = (n5.r) lVar;
        long j12 = rVar.f15375a;
        int i11 = rVar.f15377c;
        Uri uri = rVar.f15378d.f19399c;
        u uVar = new u(j11);
        boolean z10 = uri.getQueryParameter("_HLS_msn") != null;
        boolean z11 = iOException instanceof p;
        q0 q0Var = n5.o.f15370e;
        c cVar = this.f6154l;
        if (z10 || z11) {
            int i12 = iOException instanceof y ? ((y) iOException).f19484d : Integer.MAX_VALUE;
            if (z11 || i12 == 400 || i12 == 503) {
                this.f6149g = SystemClock.elapsedRealtime();
                c(false);
                ah.j jVar = cVar.f6161f;
                int i13 = c0.f16548a;
                jVar.D(uVar, i11, iOException, true);
                return q0Var;
            }
        }
        b7.m mVar = new b7.m(i10, 6, iOException);
        Iterator it = cVar.f6160e.iterator();
        boolean z12 = false;
        while (it.hasNext()) {
            z12 |= !((s) it.next()).b(this.f6143a, mVar, false);
        }
        m3.l lVar2 = cVar.f6158c;
        if (z12) {
            lVar2.getClass();
            long jV = m3.l.v(mVar);
            q0Var = jV != -9223372036854775807L ? new q0(0, false, jV) : n5.o.f15371f;
        }
        boolean zA = q0Var.a();
        cVar.f6161f.D(uVar, i11, iOException, !zA);
        if (!zA) {
            lVar2.getClass();
        }
        return q0Var;
    }
}
