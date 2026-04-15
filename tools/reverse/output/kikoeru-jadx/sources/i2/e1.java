package i2;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class e1 extends jc.m implements ic.k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f8685b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ z0.e f8686c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e1(int i10, z0.e eVar) {
        super(1);
        this.f8685b = i10;
        this.f8686c = eVar;
    }

    @Override // ic.k
    public final Object a(Object obj) {
        switch (this.f8685b) {
            case 0:
                this.f8686c.b((j1.o) obj);
                return Boolean.TRUE;
            default:
                z0.e eVar = this.f8686c;
                Object[] objArr = eVar.f26372a;
                int i10 = eVar.f26374c;
                for (int i11 = 0; i11 < i10; i11++) {
                    ((g2.w0) objArr[i11]).j();
                }
                return ub.a0.f21526a;
        }
    }
}
