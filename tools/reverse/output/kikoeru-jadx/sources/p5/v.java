package p5;

import android.os.SystemClock;
import java.util.NoSuchElementException;
import m4.o0;
import m4.u1;
import p4.c0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m0.w f16752a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r f16753b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final mh.f f16754c = new mh.f();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ce.g f16755d = new ce.g((byte) 0, 2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ce.g f16756e = new ce.g((byte) 0, 2);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final m4.j f16757f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f16758g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public u1 f16759h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f16760i;

    public v(m0.w wVar, r rVar) {
        this.f16752a = wVar;
        this.f16753b = rVar;
        m4.j jVar = new m4.j((byte) 0, 3);
        int iHighestOneBit = Integer.bitCount(16) != 1 ? Integer.highestOneBit(15) << 1 : 16;
        jVar.f14296b = 0;
        jVar.f14297c = 0;
        jVar.f14299e = new long[iHighestOneBit];
        jVar.f14298d = iHighestOneBit - 1;
        this.f16757f = jVar;
        this.f16758g = -9223372036854775807L;
        this.f16759h = u1.f14594d;
    }

    public final void a(long j10, long j11) {
        int iA;
        final m0.w wVar = this.f16752a;
        c cVar = (c) wVar.f13783c;
        do {
            m4.j jVar = this.f16757f;
            int i10 = jVar.f14297c;
            if (i10 == 0) {
                return;
            }
            if (i10 == 0) {
                throw new NoSuchElementException();
            }
            long j12 = ((long[]) jVar.f14299e)[jVar.f14296b];
            Long l10 = (Long) this.f16756e.y(j12);
            r rVar = this.f16753b;
            if (l10 != null && l10.longValue() != this.f16760i) {
                this.f16760i = l10.longValue();
                rVar.d(2);
            }
            iA = this.f16753b.a(j12, j10, j11, this.f16760i, false, this.f16754c);
            if (iA == 0 || iA == 1) {
                long jG = jVar.g();
                u1 u1Var = (u1) this.f16755d.y(jG);
                if (u1Var != null && !u1Var.equals(u1.f14594d) && !u1Var.equals(this.f16759h)) {
                    this.f16759h = u1Var;
                    m4.p pVar = new m4.p();
                    pVar.f14495t = u1Var.f14598a;
                    pVar.f14496u = u1Var.f14599b;
                    pVar.f14488m = o0.p("video/raw");
                    wVar.f13782b = new m4.q(pVar);
                    cVar.f16642h.execute(new b5.h(21, wVar, u1Var));
                }
                int i11 = rVar.f16720d;
                rVar.f16720d = 3;
                rVar.f16727k.getClass();
                rVar.f16722f = c0.N(SystemClock.elapsedRealtime());
                m4.q qVar = (m4.q) wVar.f13782b;
                m4.q qVar2 = qVar == null ? new m4.q(new m4.p()) : qVar;
                q qVar3 = cVar.f16643i;
                cVar.f16636b.getClass();
                qVar3.c(jG, System.nanoTime(), qVar2, null);
                ((g) cVar.f16638d.remove()).getClass();
                throw null;
            }
            if (iA == 2 || iA == 3) {
                jVar.g();
                final int i12 = 1;
                cVar.f16642h.execute(new Runnable() { // from class: p5.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i12) {
                            case 0:
                                ((c) wVar.f13783c).f16641g.getClass();
                                break;
                            default:
                                ((c) wVar.f13783c).f16641g.getClass();
                                break;
                        }
                    }
                });
                ((g) cVar.f16638d.remove()).getClass();
                throw null;
            }
        } while (iA == 4);
        if (iA != 5) {
            throw new IllegalStateException(String.valueOf(iA));
        }
    }
}
