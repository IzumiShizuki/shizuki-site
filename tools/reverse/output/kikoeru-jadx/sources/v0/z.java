package v0;

import com.tencent.bugly.beta.tinker.TinkerReport;
import x0.o2;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final o2 f22347a = new o2(b.f22169g);

    public static final q1.l0 a(int i10, x0.o oVar) {
        y yVar = (y) oVar.j(f22347a);
        switch (w0.c.b(i10)) {
            case 0:
                return yVar.f22346e;
            case 1:
                return b(yVar.f22346e);
            case 2:
                return yVar.f22342a;
            case 3:
                return b(yVar.f22342a);
            case 4:
                return g0.g.f7122a;
            case 5:
                return yVar.f22345d;
            case 6:
                g0.f fVar = yVar.f22345d;
                float f10 = (float) 0.0d;
                return g0.f.b(fVar, new g0.c(f10), null, new g0.c(f10), 6);
            case 7:
                return b(yVar.f22345d);
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_DALVIK /* 8 */:
                return yVar.f22344c;
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_ART /* 9 */:
                return q1.h0.f17515a;
            case TinkerReport.KEY_APPLY_WITH_RETRY /* 10 */:
                return yVar.f22343b;
            default:
                throw new ce.j0();
        }
    }

    public static final g0.f b(g0.f fVar) {
        float f10 = (float) 0.0d;
        return g0.f.b(fVar, null, new g0.c(f10), new g0.c(f10), 3);
    }
}
