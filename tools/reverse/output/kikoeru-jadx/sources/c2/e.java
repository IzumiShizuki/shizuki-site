package c2;

import i2.c2;
import i7.p2;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class e extends jc.m implements ic.k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f3259b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ jc.u f3260c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(p2 p2Var, m1.d dVar, jc.u uVar) {
        super(1);
        this.f3259b = 2;
        this.f3260c = uVar;
    }

    @Override // ic.k
    public final Object a(Object obj) {
        switch (this.f3259b) {
            case 0:
                if (!((g) obj).f3268q) {
                    return c2.f8657a;
                }
                this.f3260c.f10834a = false;
                return c2.f8659c;
            case 1:
                if (((l0.p) obj).f11590f.f20344a.f20326a.f20320b.length() > 0) {
                    this.f3260c.f10834a = false;
                }
                return ub.a0.f21526a;
            default:
                m1.d dVar = (m1.d) obj;
                if (!dVar.f9703n) {
                    return c2.f8658b;
                }
                if (dVar.f14024p != null) {
                    f2.a.b("DragAndDropTarget self reference must be null at the start of a drag and drop session");
                }
                dVar.f14024p = null;
                jc.u uVar = this.f3260c;
                uVar.f10834a = uVar.f10834a;
                return c2.f8657a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(jc.u uVar, int i10) {
        super(1);
        this.f3259b = i10;
        this.f3260c = uVar;
    }
}
