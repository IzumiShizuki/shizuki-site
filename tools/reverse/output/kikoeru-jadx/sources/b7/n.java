package b7;

import android.content.Context;
import android.os.Handler;
import com.tencent.bugly.beta.tinker.TinkerReport;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class n implements cb.s, te.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1983a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f1984b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f1985c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f1986d;

    @Override // te.c
    public boolean a(se.k0 k0Var, se.k0 k0Var2) {
        boolean z10 = this.f1984b;
        yc.b bVar = (yc.b) this.f1985c;
        yc.b bVar2 = (yc.b) this.f1986d;
        jc.l.e(k0Var, "c1");
        jc.l.e(k0Var2, "c2");
        if (k0Var.equals(k0Var2)) {
            return true;
        }
        yc.h hVarH = k0Var.h();
        yc.h hVarH2 = k0Var2.h();
        if (!(hVarH instanceof yc.q0) || !(hVarH2 instanceof yc.q0)) {
            return false;
        }
        ee.b bVar3 = new ee.b(0, bVar, bVar2);
        return ee.c.f6523a.d((yc.q0) hVarH, (yc.q0) hVarH2, z10, bVar3);
    }

    public boolean b(long j10) {
        Object obj;
        List list = (List) ((androidx.media3.exoplayer.offline.u) this.f1986d).f969c;
        int size = list.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                obj = null;
                break;
            }
            obj = list.get(i10);
            if (c2.s.d(((c2.v) obj).f3340a, j10)) {
                break;
            }
            i10++;
        }
        c2.v vVar = (c2.v) obj;
        if (vVar != null) {
            return vVar.f3347h;
        }
        return false;
    }

    public void c() {
        ((kf.f) this.f1985c).l(new CancellationException("onBack cancelled"), true);
        ((hf.r1) this.f1986d).g(null);
    }

    @Override // cb.s
    public void d(Object obj) {
        switch (this.f1983a) {
            case 1:
                c2 c2Var = (c2) this.f1986d;
                t1 t1Var = (t1) this.f1985c;
                boolean z10 = this.f1984b;
                s3.i(c2Var.f1693t, (u1) obj);
                p4.c0.F(c2Var.f1693t);
                if (z10) {
                    c2Var.o(t1Var);
                }
                break;
            default:
                c2 c2Var2 = ((o2) this.f1986d).f2008g;
                Handler handler = c2Var2.f1685l;
                t1 t1Var2 = (t1) this.f1985c;
                p4.c0.R(handler, new b5.h(c2Var2, t1Var2, new m1(this, (u1) obj, this.f1984b, t1Var2)));
                break;
        }
    }

    @Override // cb.s
    public void g(Throwable th2) {
        switch (this.f1983a) {
            case 1:
                c2 c2Var = (c2) this.f1986d;
                if (th2 instanceof UnsupportedOperationException) {
                    p4.c.C("MediaSessionImpl", "UnsupportedOperationException: Make sure to implement MediaSession.Callback.onPlaybackResumption() if you add a media button receiver to your manifest or if you implement the recent media item contract with your MediaLibraryService.", th2);
                } else {
                    p4.c.o("MediaSessionImpl", "Failure calling MediaSession.Callback.onPlaybackResumption(): " + th2.getMessage(), th2);
                }
                p4.c0.F(c2Var.f1693t);
                if (this.f1984b) {
                    c2Var.o((t1) this.f1985c);
                }
                break;
        }
    }

    public String toString() {
        switch (this.f1983a) {
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_ART /* 9 */:
                return "JavaTypeEnhancementState(jsr305=" + ((ld.u) this.f1985c) + ", getReportLevelForAnnotation=" + ((bd.a) this.f1986d) + ')';
            default:
                return super.toString();
        }
    }

    public n(yc.b bVar, yc.b bVar2, boolean z10) {
        this.f1983a = 7;
        this.f1984b = z10;
        this.f1985c = bVar;
        this.f1986d = bVar2;
    }

    public n(ld.u uVar, bd.a aVar) {
        this.f1983a = 9;
        this.f1985c = uVar;
        this.f1986d = aVar;
        this.f1984b = uVar.f12254d || aVar.a(ld.r.f12242a) == ld.a0.f12177b;
    }

    public n() {
        this.f1983a = 8;
        this.f1985c = new ReentrantLock();
        this.f1986d = new ArrayList();
    }

    public n(o.s sVar, androidx.media3.exoplayer.offline.u uVar) {
        this.f1983a = 3;
        this.f1985c = sVar;
        this.f1986d = uVar;
    }

    public n(Context context, Handler handler, v4.s sVar) {
        this.f1983a = 10;
        this.f1985c = context.getApplicationContext();
        this.f1986d = new v4.a(this, handler, sVar);
    }

    public n(hf.y yVar, boolean z10, ic.n nVar, e.k kVar) {
        this.f1983a = 5;
        this.f1984b = z10;
        this.f1985c = g8.a.c(-2, 4, kf.a.f11336a);
        this.f1986d = hf.a0.y(yVar, null, null, new e.j(kVar, nVar, this, (yb.c) null, 0), 3);
    }

    public n(Context context) {
        this.f1983a = 0;
        this.f1985c = context;
        this.f1986d = new b5.a(3);
    }

    public n(o2 o2Var, t1 t1Var, boolean z10) {
        this.f1983a = 2;
        this.f1986d = o2Var;
        this.f1985c = t1Var;
        this.f1984b = z10;
    }

    public n(c2 c2Var, t1 t1Var, boolean z10, m4.u0 u0Var) {
        this.f1983a = 1;
        this.f1986d = c2Var;
        this.f1985c = t1Var;
        this.f1984b = z10;
    }

    private final void e(Throwable th2) {
    }
}
