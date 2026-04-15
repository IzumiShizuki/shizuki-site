package i3;

import androidx.lifecycle.x;
import i2.j0;
import ub.a0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class k extends jc.m implements ic.n {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final k f8976c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final k f8977d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final k f8978e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final k f8979f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final k f8980g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final k f8981h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final k f8982i;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f8983b;

    static {
        int i10 = 2;
        f8976c = new k(i10, 0);
        f8977d = new k(i10, 1);
        f8978e = new k(i10, 2);
        f8979f = new k(i10, 3);
        f8980g = new k(i10, 4);
        f8981h = new k(i10, 5);
        f8982i = new k(i10, 6);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(int i10, int i11) {
        super(i10);
        this.f8983b = i11;
    }

    @Override // ic.n
    public final Object q(Object obj, Object obj2) {
        int i10;
        switch (this.f8983b) {
            case 0:
                androidx.compose.ui.viewinterop.a.c((j0) obj).setUpdateBlock((ic.k) obj2);
                return a0.f21526a;
            case 1:
                androidx.compose.ui.viewinterop.a.c((j0) obj).setReleaseBlock((ic.k) obj2);
                return a0.f21526a;
            case 2:
                androidx.compose.ui.viewinterop.a.c((j0) obj).setModifier((j1.q) obj2);
                return a0.f21526a;
            case 3:
                androidx.compose.ui.viewinterop.a.c((j0) obj).setDensity((f3.c) obj2);
                return a0.f21526a;
            case 4:
                androidx.compose.ui.viewinterop.a.c((j0) obj).setLifecycleOwner((x) obj2);
                return a0.f21526a;
            case 5:
                androidx.compose.ui.viewinterop.a.c((j0) obj).setSavedStateRegistryOwner((w7.e) obj2);
                return a0.f21526a;
            default:
                q qVarC = androidx.compose.ui.viewinterop.a.c((j0) obj);
                int iOrdinal = ((f3.m) obj2).ordinal();
                if (iOrdinal != 0) {
                    i10 = 1;
                    if (iOrdinal != 1) {
                        throw new ce.j0();
                    }
                } else {
                    i10 = 0;
                }
                qVarC.setLayoutDirection(i10);
                return a0.f21526a;
        }
    }
}
