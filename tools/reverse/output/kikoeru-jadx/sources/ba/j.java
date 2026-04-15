package ba;

import com.tencent.bugly.beta.tinker.TinkerReport;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j implements ic.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2393a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ic.a f2394b;

    public /* synthetic */ j(int i10, ic.a aVar) {
        this.f2393a = i10;
        this.f2394b = aVar;
    }

    @Override // ic.a
    public final Object b() {
        switch (this.f2393a) {
            case 0:
                b0.f2307c.setValue(Boolean.valueOf(!b0.c()));
                this.f2394b.b();
                return ub.a0.f21526a;
            case 1:
                b0.f2308d.setValue(Boolean.valueOf(!((Boolean) r0.getValue()).booleanValue()));
                this.f2394b.b();
                return ub.a0.f21526a;
            case 2:
                this.f2394b.b();
                return ub.a0.f21526a;
            case 3:
                this.f2394b.b();
                return ub.a0.f21526a;
            case 4:
                this.f2394b.b();
                return ub.a0.f21526a;
            case 5:
                this.f2394b.b();
                return ub.a0.f21526a;
            case 6:
                this.f2394b.b();
                return Boolean.TRUE;
            case 7:
                this.f2394b.b();
                return Boolean.TRUE;
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_DALVIK /* 8 */:
                this.f2394b.b();
                return Boolean.TRUE;
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_ART /* 9 */:
                ic.a aVar = this.f2394b;
                if (aVar != null) {
                    aVar.b();
                }
                return ub.a0.f21526a;
            case TinkerReport.KEY_APPLY_WITH_RETRY /* 10 */:
                ic.a aVar2 = this.f2394b;
                if (aVar2 != null) {
                    aVar2.b();
                }
                return ub.a0.f21526a;
            case 11:
                try {
                    return (List) this.f2394b.b();
                } catch (SSLPeerUnverifiedException unused) {
                    return vb.r.f22819a;
                }
            default:
                this.f2394b.b();
                return ub.a0.f21526a;
        }
    }
}
