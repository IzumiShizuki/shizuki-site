package ac;

import jc.l;
import jc.z;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class i extends c implements jc.i {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f307d;

    public i(int i10, yb.c cVar) {
        super(cVar);
        this.f307d = i10;
    }

    @Override // jc.i
    public final int c() {
        return this.f307d;
    }

    @Override // ac.a
    public final String toString() {
        if (this.f300a != null) {
            return super.toString();
        }
        String strH = z.f10839a.h(this);
        l.d(strH, "renderLambdaToString(...)");
        return strH;
    }
}
