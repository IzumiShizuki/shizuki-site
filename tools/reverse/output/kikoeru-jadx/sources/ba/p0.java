package ba;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class p0 implements ic.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2446a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x0.w0 f2447b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ x0.w0 f2448c;

    public /* synthetic */ p0(x0.w0 w0Var, x0.w0 w0Var2, int i10) {
        this.f2446a = i10;
        this.f2447b = w0Var;
        this.f2448c = w0Var2;
    }

    @Override // ic.k
    public final Object a(Object obj) {
        switch (this.f2446a) {
            case 0:
                String str = (String) obj;
                jc.l.e(str, "it");
                this.f2447b.setValue(Boolean.TRUE);
                this.f2448c.setValue(str);
                break;
            case 1:
                float fFloatValue = ((Float) obj).floatValue();
                x0.w0 w0Var = this.f2447b;
                if (!((Boolean) w0Var.getValue()).booleanValue()) {
                    w0Var.setValue(Boolean.TRUE);
                }
                this.f2448c.setValue(Long.valueOf((long) fFloatValue));
                break;
            default:
                q1.i0 i0Var = (q1.i0) obj;
                jc.l.e(i0Var, "$this$graphicsLayer");
                x0.w0 w0Var2 = this.f2447b;
                i0Var.l(Float.intBitsToFloat((int) (((p1.b) w0Var2.getValue()).f16481a >> 32)));
                i0Var.m(Float.intBitsToFloat((int) (((p1.b) w0Var2.getValue()).f16481a & 4294967295L)));
                x0.w0 w0Var3 = this.f2448c;
                i0Var.f(((Number) w0Var3.getValue()).floatValue());
                i0Var.g(((Number) w0Var3.getValue()).floatValue());
                break;
        }
        return ub.a0.f21526a;
    }
}
