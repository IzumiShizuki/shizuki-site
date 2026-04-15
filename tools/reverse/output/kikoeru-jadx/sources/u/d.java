package u;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class d extends jc.m implements ic.k {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final d f20856c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final d f20857d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final d f20858e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final d f20859f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final d f20860g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final d f20861h;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f20862b;

    static {
        int i10 = 1;
        f20856c = new d(i10, 0);
        f20857d = new d(i10, 1);
        f20858e = new d(i10, 2);
        f20859f = new d(i10, 3);
        f20860g = new d(i10, 4);
        f20861h = new d(i10, 5);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(int i10, int i11) {
        super(i10);
        this.f20862b = i11;
    }

    @Override // ic.k
    public final Object a(Object obj) {
        switch (this.f20862b) {
            case 0:
                x0.o2 o2Var = AndroidCompositionLocals_androidKt.f721b;
                f1.k kVar = (f1.k) ((x0.j1) obj);
                kVar.getClass();
                if (!((Context) x0.v.w(kVar, o2Var)).getPackageManager().hasSystemFeature("android.software.leanback")) {
                    c.f20829a.getClass();
                }
                break;
            case 1:
                long j10 = ((p1.b) obj).f16481a;
                break;
            case 2:
                break;
            case 3:
                ((Number) obj).longValue();
                break;
            case 4:
                break;
            case 5:
                ((Number) obj).floatValue();
                break;
            default:
                c2.t tVar = (c2.t) obj;
                c2.s.f(tVar, false);
                tVar.a();
                break;
        }
        return ub.a0.f21526a;
    }
}
