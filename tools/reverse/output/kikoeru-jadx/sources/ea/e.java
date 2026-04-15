package ea;

import android.graphics.drawable.Drawable;
import i8.g;
import i8.h;
import ic.k;
import jc.l;
import ub.a0;
import x0.w0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6435a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f6436b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ w0 f6437c;

    public /* synthetic */ e(k kVar, w0 w0Var, int i10) {
        this.f6435a = i10;
        this.f6436b = kVar;
        this.f6437c = w0Var;
    }

    @Override // ic.k
    public final Object a(Object obj) {
        switch (this.f6435a) {
            case 0:
                h hVar = (h) obj;
                l.e(hVar, "it");
                this.f6437c.setValue(Boolean.valueOf(hVar instanceof i8.f));
                if (hVar instanceof g) {
                    Drawable drawable = ((g) hVar).f9419b.f19658a;
                    this.f6436b.a(new p1.b((((long) Float.floatToRawIntBits(drawable.getIntrinsicWidth())) << 32) | (((long) Float.floatToRawIntBits(drawable.getIntrinsicHeight())) & 4294967295L)));
                }
                break;
            default:
                String str = (String) obj;
                l.e(str, "it");
                this.f6437c.setValue(str);
                this.f6436b.a(str);
                break;
        }
        return a0.f21526a;
    }
}
