package la;

import com.cnl.kikoeru.R;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class q0 extends ac.i implements ic.n {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f12081e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ fg.f f12082f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q0(fg.f fVar, yb.c cVar, int i10) {
        super(2, cVar);
        this.f12081e = i10;
        this.f12082f = fVar;
    }

    @Override // ac.a
    public final yb.c o(Object obj, yb.c cVar) {
        switch (this.f12081e) {
            case 0:
                return new q0(this.f12082f, cVar, 0);
            default:
                return new q0(this.f12082f, cVar, 1);
        }
    }

    @Override // ic.n
    public final Object q(Object obj, Object obj2) {
        hf.y yVar = (hf.y) obj;
        yb.c cVar = (yb.c) obj2;
        switch (this.f12081e) {
            case 0:
                q0 q0Var = (q0) o(yVar, cVar);
                ub.a0 a0Var = ub.a0.f21526a;
                q0Var.u(a0Var);
                return a0Var;
            default:
                q0 q0Var2 = (q0) o(yVar, cVar);
                ub.a0 a0Var2 = ub.a0.f21526a;
                q0Var2.u(a0Var2);
                return a0Var2;
        }
    }

    @Override // ac.a
    public final Object u(Object obj) {
        int i10 = this.f12081e;
        ub.a0 a0Var = ub.a0.f21526a;
        fg.f fVar = this.f12082f;
        switch (i10) {
            case 0:
                ub.a.f(obj);
                if (((Boolean) fVar.getValue()).booleanValue()) {
                    ka.j.d(na.q.g(R.string.first_vote_warn_text), na.q.g(R.string.first_vote_warn_title), new fg.d(fVar, 1), new j3.q(4), null, 444);
                }
                break;
            default:
                ub.a.f(obj);
                ub.p pVar = v9.b.f22799a;
                if (((Boolean) fVar.getValue()).booleanValue()) {
                    ka.j.d("本页面内容涉及危险操作，请谨慎操作。导出的数据库包含账号密码等敏感信息，请妥善保存。", "警告", new fg.d(fVar, 2), null, null, 500);
                }
                break;
        }
        return a0Var;
    }
}
