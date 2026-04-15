package q;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class d0 extends jc.m implements ic.k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f17268b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r.q1 f17269c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d0(r.q1 q1Var, int i10) {
        super(1);
        this.f17268b = i10;
        this.f17269c = q1Var;
    }

    @Override // ic.k
    public final Object a(Object obj) {
        switch (this.f17268b) {
            case 0:
                return Boolean.valueOf(!jc.l.a(obj, this.f17269c.f18542d.getValue()));
            case 1:
                return new r.s1(this.f17269c, 0);
            default:
                return new r.s1(this.f17269c, 1);
        }
    }
}
