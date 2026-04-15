package y4;

import android.net.Uri;
import b7.q0;
import j5.u;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Objects;
import m4.p0;
import n5.p;
import n5.r;
import p4.c0;
import s4.v;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class d implements n5.j, p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25475a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f25476b;

    public /* synthetic */ d(g gVar, int i10) {
        this.f25475a = i10;
        this.f25476b = gVar;
    }

    public void a() {
        long j10;
        g gVar = this.f25476b;
        synchronized (o5.b.f16239b) {
            try {
                j10 = o5.b.f16240c ? o5.b.f16241d : -9223372036854775807L;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        gVar.L = j10;
        gVar.y(true);
    }

    @Override // n5.p
    public void b() throws IOException {
        g gVar = this.f25476b;
        gVar.A.b();
        androidx.media3.exoplayer.offline.e eVar = gVar.C;
        if (eVar != null) {
            throw eVar;
        }
    }

    @Override // n5.j
    public void k(n5.l lVar, long j10, long j11) {
        long j12;
        switch (this.f25475a) {
            case 2:
                r rVar = (r) lVar;
                g gVar = this.f25476b;
                long j13 = rVar.f15375a;
                Uri uri = rVar.f15378d.f19399c;
                u uVar = new u(j11);
                gVar.f25493m.getClass();
                gVar.f25497q.B(uVar, rVar.f15377c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
                z4.c cVar = (z4.c) rVar.f15380f;
                z4.c cVar2 = gVar.H;
                int size = cVar2 == null ? 0 : cVar2.f26401m.size();
                long j14 = cVar.b(0).f26422b;
                int i10 = 0;
                while (i10 < size && gVar.H.b(i10).f26422b < j14) {
                    i10++;
                }
                if (cVar.f26392d) {
                    if (size - i10 > cVar.f26401m.size()) {
                        p4.c.B("DashMediaSource", "Loaded out of sync manifest");
                    } else {
                        long j15 = gVar.N;
                        j12 = -9223372036854775807L;
                        if (j15 == -9223372036854775807L || cVar.f26396h * 1000 > j15) {
                            gVar.M = 0;
                        } else {
                            p4.c.B("DashMediaSource", "Loaded stale dynamic manifest: " + cVar.f26396h + ", " + gVar.N);
                        }
                    }
                    int i11 = gVar.M;
                    gVar.M = i11 + 1;
                    if (i11 < gVar.f25493m.u(rVar.f15377c)) {
                        gVar.D.postDelayed(gVar.f25502v, Math.min((gVar.M - 1) * 1000, 5000));
                        return;
                    } else {
                        gVar.C = new androidx.media3.exoplayer.offline.e();
                        return;
                    }
                }
                j12 = -9223372036854775807L;
                gVar.H = cVar;
                gVar.I = cVar.f26392d & gVar.I;
                gVar.J = j10 - j11;
                gVar.K = j10;
                gVar.O += i10;
                synchronized (gVar.f25500t) {
                    try {
                        if (rVar.f15376b.f19443a == gVar.F) {
                            Uri uri2 = gVar.H.f26399k;
                            if (uri2 == null) {
                                uri2 = rVar.f15378d.f19399c;
                            }
                            gVar.F = uri2;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                    break;
                }
                z4.c cVar3 = gVar.H;
                if (!cVar3.f26392d || gVar.L != j12) {
                    gVar.y(true);
                    return;
                }
                ff.g gVar2 = cVar3.f26397i;
                if (gVar2 == null) {
                    gVar.v();
                    return;
                }
                String str = gVar2.f7077b;
                int i12 = c0.f16548a;
                if (Objects.equals(str, "urn:mpeg:dash:utc:direct:2014") || Objects.equals(str, "urn:mpeg:dash:utc:direct:2012")) {
                    try {
                        gVar.L = c0.Q(gVar2.f7078c) - gVar.K;
                        gVar.y(true);
                        return;
                    } catch (p0 e10) {
                        gVar.x(e10);
                        return;
                    }
                }
                if (Objects.equals(str, "urn:mpeg:dash:utc:http-iso:2014") || Objects.equals(str, "urn:mpeg:dash:utc:http-iso:2012")) {
                    gVar.z(gVar2, new f());
                    return;
                }
                if (Objects.equals(str, "urn:mpeg:dash:utc:http-xsdate:2014") || Objects.equals(str, "urn:mpeg:dash:utc:http-xsdate:2012")) {
                    gVar.z(gVar2, new r5.p(16));
                    return;
                } else if (Objects.equals(str, "urn:mpeg:dash:utc:ntp:2014") || Objects.equals(str, "urn:mpeg:dash:utc:ntp:2012")) {
                    gVar.v();
                    return;
                } else {
                    gVar.x(new IOException("Unsupported UTC timing scheme"));
                    return;
                }
            default:
                r rVar2 = (r) lVar;
                g gVar3 = this.f25476b;
                long j16 = rVar2.f15375a;
                Uri uri3 = rVar2.f15378d.f19399c;
                u uVar2 = new u(j11);
                gVar3.f25493m.getClass();
                gVar3.f25497q.B(uVar2, rVar2.f15377c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
                gVar3.L = ((Long) rVar2.f15380f).longValue() - j10;
                gVar3.y(true);
                return;
        }
    }

    @Override // n5.j
    public void r(n5.l lVar, long j10, long j11, int i10) {
        u uVar;
        switch (this.f25475a) {
            case 2:
                r rVar = (r) lVar;
                if (i10 == 0) {
                    long j12 = rVar.f15375a;
                    uVar = new u(rVar.f15376b);
                } else {
                    long j13 = rVar.f15375a;
                    Uri uri = rVar.f15378d.f19399c;
                    uVar = new u(j11);
                }
                this.f25476b.f25497q.E(uVar, rVar.f15377c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, i10);
                break;
        }
    }

    @Override // n5.j
    public void s(n5.l lVar, long j10, long j11, boolean z10) {
        switch (this.f25475a) {
            case 2:
                this.f25476b.w((r) lVar, j11);
                break;
            default:
                this.f25476b.w((r) lVar, j11);
                break;
        }
    }

    @Override // n5.j
    public q0 v(n5.l lVar, long j10, long j11, IOException iOException, int i10) {
        long jMin;
        int i11 = this.f25475a;
        g gVar = this.f25476b;
        switch (i11) {
            case 2:
                r rVar = (r) lVar;
                long j12 = rVar.f15375a;
                Uri uri = rVar.f15378d.f19399c;
                u uVar = new u(j11);
                int i12 = rVar.f15377c;
                gVar.f25493m.getClass();
                if ((iOException instanceof p0) || (iOException instanceof FileNotFoundException) || (iOException instanceof v) || (iOException instanceof n5.n)) {
                    jMin = -9223372036854775807L;
                } else {
                    int i13 = s4.j.f19426b;
                    for (Throwable cause = iOException; cause != null; cause = cause.getCause()) {
                        if ((cause instanceof s4.j) && ((s4.j) cause).f19427a == 2008) {
                            jMin = -9223372036854775807L;
                        }
                    }
                    jMin = Math.min((i10 - 1) * 1000, 5000);
                }
                q0 q0Var = jMin == -9223372036854775807L ? n5.o.f15371f : new q0(0, false, jMin);
                gVar.f25497q.D(uVar, i12, iOException, true ^ q0Var.a());
                return q0Var;
            default:
                r rVar2 = (r) lVar;
                ah.j jVar = gVar.f25497q;
                long j13 = rVar2.f15375a;
                Uri uri2 = rVar2.f15378d.f19399c;
                jVar.D(new u(j11), rVar2.f15377c, iOException, true);
                gVar.f25493m.getClass();
                gVar.x(iOException);
                return n5.o.f15370e;
        }
    }

    private final /* synthetic */ void c(n5.l lVar, long j10, long j11, int i10) {
    }
}
