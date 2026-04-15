package j0;

import g2.c0;
import q1.a0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b extends jc.j implements ic.k {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ m f9585i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(m mVar) {
        super(1, jc.k.class, "localToScreen", "startInput$localToScreen(Landroidx/compose/foundation/text/input/internal/LegacyPlatformTextInputServiceAdapter$LegacyPlatformTextInputNode;[F)V", 0);
        this.f9585i = mVar;
    }

    @Override // ic.k
    public final Object a(Object obj) {
        float[] fArr = ((a0) obj).f17489a;
        c0 c0Var = (c0) this.f9585i.f9615r.getValue();
        if (c0Var != null) {
            if (!c0Var.h()) {
                c0Var = null;
            }
            if (c0Var != null) {
                c0Var.j(fArr);
            }
        }
        return ub.a0.f21526a;
    }
}
