package s;

import android.view.View;
import android.widget.Magnifier;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class g1 implements e1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final g1 f19162b = new g1(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final g1 f19163c = new g1(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19164a;

    public /* synthetic */ g1(int i10) {
        this.f19164a = i10;
    }

    @Override // s.e1
    public final boolean a() {
        switch (this.f19164a) {
            case 0:
                return false;
            default:
                return true;
        }
    }

    @Override // s.e1
    public final d1 b(View view, f3.c cVar) {
        switch (this.f19164a) {
            case 0:
                return new f1(new Magnifier(view));
            default:
                return new h1(new Magnifier(view));
        }
    }
}
