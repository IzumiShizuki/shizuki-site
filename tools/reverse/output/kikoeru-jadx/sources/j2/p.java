package j2;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class p extends jc.m implements ic.k {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final p f9949c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final p f9950d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final p f9951e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final p f9952f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final p f9953g;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f9954b;

    static {
        int i10 = 1;
        f9949c = new p(i10, 0);
        f9950d = new p(i10, 1);
        f9951e = new p(i10, 2);
        f9952f = new p(i10, 3);
        f9953g = new p(i10, 4);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(int i10, int i11) {
        super(i10);
        this.f9954b = i11;
    }

    @Override // ic.k
    public final Object a(Object obj) {
        switch (this.f9954b) {
            case 0:
                return ub.a0.f21526a;
            case 1:
                return Boolean.TRUE;
            case 2:
                return Boolean.FALSE;
            case 3:
                x0.z zVar = AndroidCompositionLocals_androidKt.f720a;
                f1.k kVar = (f1.k) ((x0.j1) obj);
                kVar.getClass();
                x0.v.w(kVar, zVar);
                return ((Context) x0.v.w(kVar, AndroidCompositionLocals_androidKt.f721b)).getResources();
            default:
                return Boolean.valueOf(l0.q(obj));
        }
    }
}
