package f9;

import ac.i;
import c9.g;
import com.cnl.kikoeru.data.db.AppDatabase;
import com.tencent.bugly.beta.tinker.TinkerReport;
import d9.t;
import d9.v;
import ic.k;
import java.util.List;
import na.w;
import ua.l;
import ub.a0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class e extends i implements k {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f6954e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ AppDatabase f6955f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(AppDatabase appDatabase, yb.c cVar, int i10) {
        super(1, cVar);
        this.f6954e = i10;
        this.f6955f = appDatabase;
    }

    @Override // ic.k
    public final Object a(Object obj) {
        yb.c cVar = (yb.c) obj;
        switch (this.f6954e) {
            case 0:
                e eVar = new e(this.f6955f, cVar, 0);
                a0 a0Var = a0.f21526a;
                eVar.u(a0Var);
                return a0Var;
            case 1:
                e eVar2 = new e(this.f6955f, cVar, 1);
                a0 a0Var2 = a0.f21526a;
                eVar2.u(a0Var2);
                return a0Var2;
            default:
                e eVar3 = new e(this.f6955f, cVar, 2);
                a0 a0Var3 = a0.f21526a;
                eVar3.u(a0Var3);
                return a0Var3;
        }
    }

    @Override // ac.a
    public final Object u(Object obj) {
        switch (this.f6954e) {
            case 0:
                ub.a.f(obj);
                AppDatabase appDatabase = this.f6955f;
                for (c9.c cVar : appDatabase.s().a()) {
                    appDatabase.s().b(c9.c.a(cVar, 0, w.a(cVar.f3777c), 8183));
                }
                break;
            case 1:
                ub.a.f(obj);
                AppDatabase appDatabase2 = this.f6955f;
                for (c9.d dVar : (List) l.W(appDatabase2.t().f5585a, true, false, new d9.i(4))) {
                    appDatabase2.t().a(c9.d.a(dVar, 0, w.a(dVar.f3790c), 8183));
                }
                break;
            default:
                ub.a.f(obj);
                AppDatabase appDatabase3 = this.f6955f;
                for (g gVar : (List) l.W(((v) appDatabase3.f4311p.getValue()).f5608a, true, false, new d9.i(7))) {
                    v vVar = (v) appDatabase3.f4311p.getValue();
                    l.W(vVar.f5608a, false, true, new t(vVar, g.a(gVar, 0, w.a(gVar.f3816b), TinkerReport.KEY_APPLIED_DEXOPT_FORMAT), 1));
                }
                break;
        }
        return a0.f21526a;
    }
}
