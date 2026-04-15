package m9;

import com.cnl.kikoeru.R;
import na.q;
import ub.a0;
import x0.w0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i implements ic.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15023a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w0 f15024b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ w0 f15025c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ w0 f15026d;

    public /* synthetic */ i(w0 w0Var, w0 w0Var2, w0 w0Var3, int i10) {
        this.f15023a = i10;
        this.f15024b = w0Var;
        this.f15025c = w0Var2;
        this.f15026d = w0Var3;
    }

    @Override // ic.a
    public final Object b() {
        switch (this.f15023a) {
            case 0:
                if (ef.n.y0((String) this.f15025c.getValue()) || ef.n.y0((String) this.f15026d.getValue())) {
                    q.i(q.g(R.string.un_pwd_empty));
                } else {
                    this.f15024b.setValue(Boolean.TRUE);
                }
                return a0.f21526a;
            case 1:
                w0 w0Var = this.f15025c;
                if (!((Boolean) w0Var.getValue()).booleanValue() || System.currentTimeMillis() - ((Number) this.f15026d.getValue()).longValue() >= 100) {
                    this.f15024b.setValue(Boolean.FALSE);
                } else {
                    w0Var.setValue(Boolean.FALSE);
                }
                return a0.f21526a;
            case 2:
                this.f15024b.setValue(Boolean.FALSE);
                this.f15025c.setValue(Boolean.TRUE);
                this.f15026d.setValue(Long.valueOf(System.currentTimeMillis()));
                break;
            case 3:
                w0 w0Var2 = this.f15025c;
                if (!((Boolean) w0Var2.getValue()).booleanValue() || System.currentTimeMillis() - ((Number) this.f15026d.getValue()).longValue() >= 100) {
                    this.f15024b.setValue(Boolean.FALSE);
                } else {
                    w0Var2.setValue(Boolean.FALSE);
                }
                return a0.f21526a;
            default:
                this.f15024b.setValue(Boolean.FALSE);
                this.f15025c.setValue(Boolean.TRUE);
                this.f15026d.setValue(Long.valueOf(System.currentTimeMillis()));
                break;
        }
        return a0.f21526a;
    }
}
