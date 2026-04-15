package ka;

import com.tencent.bugly.beta.tinker.TinkerReport;
import j2.h0;
import m0.c2;
import x0.e1;
import x0.v;
import x0.w0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e1 f11270a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j1.q f11271b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f11272c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ic.k f11273d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f11274e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f11275f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f11276g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final w0 f11277h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final w0 f11278i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final c2 f11279j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f11280k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f11281l;

    public k(e1 e1Var, j1.q qVar, long j10, ic.k kVar, String str, String str2) {
        Boolean bool = Boolean.FALSE;
        e1 e1VarV = v.v(bool);
        e1 e1VarV2 = v.v(bool);
        c2 c2Var = new c2(new g1.d(26));
        this.f11270a = e1Var;
        this.f11271b = qVar;
        this.f11272c = j10;
        this.f11273d = kVar;
        this.f11274e = str;
        this.f11275f = str2;
        this.f11276g = TinkerReport.KEY_LOADED_UNKNOWN_EXCEPTION;
        this.f11277h = e1VarV;
        this.f11278i = e1VarV2;
        this.f11279j = c2Var;
        this.f11280k = false;
        this.f11281l = false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return jc.l.a(this.f11270a, kVar.f11270a) && jc.l.a(this.f11271b, kVar.f11271b) && this.f11272c == kVar.f11272c && jc.l.a(this.f11273d, kVar.f11273d) && jc.l.a(this.f11274e, kVar.f11274e) && jc.l.a(this.f11275f, kVar.f11275f) && this.f11276g == kVar.f11276g && jc.l.a(this.f11277h, kVar.f11277h) && jc.l.a(this.f11278i, kVar.f11278i) && jc.l.a(this.f11279j, kVar.f11279j) && this.f11280k == kVar.f11280k && this.f11281l == kVar.f11281l;
    }

    public final int hashCode() {
        int iHashCode = (this.f11271b.hashCode() + (this.f11270a.hashCode() * 31)) * 31;
        long j10 = this.f11272c;
        int i10 = (iHashCode + ((int) (j10 ^ (j10 >>> 32)))) * 961;
        ic.k kVar = this.f11273d;
        return (((((this.f11279j.hashCode() + ((this.f11278i.hashCode() + ((this.f11277h.hashCode() + ((h0.e(h0.e((i10 + (kVar == null ? 0 : kVar.hashCode())) * 31, 31, this.f11274e), 961, this.f11275f) + this.f11276g) * 31)) * 31)) * 31)) * 31) + (this.f11280k ? 1231 : 1237)) * 31) + (this.f11281l ? 1231 : 1237)) * 31;
    }

    public final String toString() {
        boolean z10 = this.f11281l;
        StringBuilder sb = new StringBuilder("MoeSnackBarData(message=");
        sb.append(this.f11270a);
        sb.append(", modifier=");
        sb.append(this.f11271b);
        sb.append(", duration=");
        sb.append(this.f11272c);
        sb.append(", onCancel=null, onConfirm=");
        sb.append(this.f11273d);
        h0.w(sb, ", cancelLabel=", this.f11274e, ", confirmLabel=", this.f11275f);
        sb.append(", onDismiss=null, animationDuration=");
        sb.append(this.f11276g);
        sb.append(", show=");
        sb.append(this.f11277h);
        sb.append(", shouldClear=");
        sb.append(this.f11278i);
        sb.append(", dismissState=");
        sb.append(this.f11279j);
        sb.append(", isCancelPressed=");
        sb.append(this.f11280k);
        sb.append(", isConfirmPressed=");
        sb.append(z10);
        sb.append(", content=null)");
        return sb.toString();
    }
}
