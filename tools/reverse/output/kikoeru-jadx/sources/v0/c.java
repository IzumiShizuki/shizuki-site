package v0;

import com.tencent.bugly.beta.tinker.TinkerReport;
import com.tencent.bugly.beta.tinker.TinkerUtils;
import x0.o2;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final o2 f22176a = new o2(b.f22165c);

    static {
        ub.a.d(b.f22166d);
    }

    public static final long a(a aVar, int i10) {
        switch (w0.c.b(i10)) {
            case 0:
                return aVar.f22142n;
            case 1:
                return aVar.f22151w;
            case 2:
                return aVar.f22153y;
            case 3:
                return aVar.f22150v;
            case 4:
                return aVar.f22133e;
            case 5:
                return aVar.f22149u;
            case 6:
                return aVar.f22143o;
            case 7:
                return aVar.f22152x;
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_DALVIK /* 8 */:
                return aVar.f22154z;
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_ART /* 9 */:
                return aVar.f22130b;
            case TinkerReport.KEY_APPLY_WITH_RETRY /* 10 */:
                return aVar.f22132d;
            case 11:
            case 12:
            case 15:
            case 16:
            case 21:
            case 22:
            case 27:
            case 28:
            case 32:
            case 33:
            default:
                return q1.q.f17575h;
            case 13:
                return aVar.f22135g;
            case 14:
                return aVar.f22137i;
            case 17:
                return aVar.f22145q;
            case 18:
                return aVar.f22147s;
            case 19:
                return aVar.f22139k;
            case 20:
                return aVar.f22141m;
            case 23:
                return aVar.A;
            case 24:
                return aVar.B;
            case 25:
                return aVar.f22129a;
            case 26:
                return aVar.f22131c;
            case 29:
                return aVar.C;
            case 30:
                return aVar.f22134f;
            case 31:
                return aVar.f22136h;
            case 34:
                return aVar.f22144p;
            case 35:
                return aVar.D;
            case 36:
                return aVar.F;
            case 37:
                return aVar.G;
            case 38:
                return aVar.H;
            case 39:
                return aVar.I;
            case 40:
                return aVar.J;
            case 41:
                return aVar.E;
            case 42:
                return aVar.f22148t;
            case 43:
                return aVar.f22146r;
            case 44:
                return aVar.f22138j;
            case TinkerUtils.MIN_MEMORY_HEAP_SIZE /* 45 */:
                return aVar.f22140l;
        }
    }
}
