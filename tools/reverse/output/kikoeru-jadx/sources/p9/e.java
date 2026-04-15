package p9;

import ac.i;
import android.content.pm.verify.domain.DomainVerificationUserState;
import hf.y;
import ic.n;
import java.io.File;
import java.util.Collection;
import ub.a0;
import x0.w0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class e extends i implements n {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f16951e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ w0 f16952f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(w0 w0Var, yb.c cVar, int i10) {
        super(2, cVar);
        this.f16951e = i10;
        this.f16952f = w0Var;
    }

    @Override // ac.a
    public final yb.c o(Object obj, yb.c cVar) {
        switch (this.f16951e) {
            case 0:
                return new e(this.f16952f, cVar, 0);
            case 1:
                return new e(this.f16952f, cVar, 1);
            default:
                return new e(this.f16952f, cVar, 2);
        }
    }

    @Override // ic.n
    public final Object q(Object obj, Object obj2) {
        y yVar = (y) obj;
        yb.c cVar = (yb.c) obj2;
        switch (this.f16951e) {
            case 0:
                e eVar = (e) o(yVar, cVar);
                a0 a0Var = a0.f21526a;
                eVar.u(a0Var);
                return a0Var;
            case 1:
                e eVar2 = (e) o(yVar, cVar);
                a0 a0Var2 = a0.f21526a;
                eVar2.u(a0Var2);
                return a0Var2;
            default:
                e eVar3 = (e) o(yVar, cVar);
                a0 a0Var3 = a0.f21526a;
                eVar3.u(a0Var3);
                return a0Var3;
        }
    }

    @Override // ac.a
    public final Object u(Object obj) {
        DomainVerificationUserState domainVerificationUserState;
        int i10 = this.f16951e;
        a0 a0Var = a0.f21526a;
        w0 w0Var = this.f16952f;
        switch (i10) {
            case 0:
                ub.a.f(obj);
                if (a.f16939j) {
                    a.f16939j = false;
                    if (!((Boolean) a0.c.F(Boolean.TYPE, gg.c.a(), "appLinkVerify", Boolean.FALSE)).booleanValue() && (domainVerificationUserState = p4.a0.b(a9.i.a().getSystemService(p4.a0.l())).getDomainVerificationUserState(a9.i.a().getPackageName())) != null) {
                        Collection<Integer> collectionValues = domainVerificationUserState.getHostToStateMap().values();
                        if (!(collectionValues instanceof Collection) || !collectionValues.isEmpty()) {
                            for (Integer num : collectionValues) {
                                if (num == null || num.intValue() != 2) {
                                    if (num == null || num.intValue() != 1) {
                                        w0Var.setValue(Boolean.TRUE);
                                        break;
                                    }
                                }
                            }
                        }
                    }
                }
                break;
            case 1:
                ub.a.f(obj);
                w0Var.setValue(Long.valueOf(a9.i.a().getDatabasePath("kikoeru").length()));
                break;
            default:
                ub.a.f(obj);
                w0Var.setValue(Long.valueOf(((File) v9.b.f22800b.getValue()).length() + v9.b.c().length()));
                break;
        }
        return a0Var;
    }
}
