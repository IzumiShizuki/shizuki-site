package ba;

import android.database.SQLException;
import java.util.ArrayList;
import java.util.Set;
import x0.n2;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class s implements ic.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2466a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f2467b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f2468c;

    public /* synthetic */ s(Object obj, boolean z10, int i10) {
        this.f2466a = i10;
        this.f2468c = obj;
        this.f2467b = z10;
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [ic.a, jc.j] */
    @Override // ic.a
    public final Object b() {
        switch (this.f2466a) {
            case 0:
                n2 n2Var = (n2) this.f2468c;
                if (((ka.q) b9.f.f2284d.getValue()) != ka.q.f11306d) {
                    return vb.r.f22819a;
                }
                Set setKeySet = (this.f2467b ? b9.f.f2281a : b9.f.f2282b).keySet();
                ArrayList arrayList = new ArrayList();
                for (Object obj : setKeySet) {
                    if (ef.n.n0((String) obj, (String) n2Var.getValue(), true)) {
                        arrayList.add(obj);
                    }
                }
                return arrayList;
            case 1:
                e.c cVar = (e.c) this.f2468c;
                cVar.f5180a = this.f2467b;
                ?? r0 = cVar.f5182c;
                if (r0 != 0) {
                    r0.b();
                }
                return ub.a0.f21526a;
            case 2:
                o1.r rVar = (o1.r) this.f2468c;
                if (this.f2467b) {
                    o1.r.b(rVar);
                }
                return ub.a0.f21526a;
            case 3:
                p7.e eVar = (p7.e) this.f2468c;
                String str = this.f2467b ? "reader" : "writer";
                StringBuilder sb = new StringBuilder();
                sb.append("Timed out attempting to acquire a " + str + " connection.");
                sb.append("\n\nWriter pool:\n");
                eVar.f16863b.d(sb);
                sb.append("Reader pool:");
                sb.append('\n');
                eVar.f16862a.d(sb);
                try {
                    ud.n.D(5, sb.toString());
                    throw null;
                } catch (SQLException e10) {
                    e10.printStackTrace();
                    return ub.a0.f21526a;
                }
            case 4:
                return Boolean.valueOf(this.f2467b || ((t0.j) this.f2468c).f20127e.e() > 0.5f);
            default:
                x0.w0 w0Var = (x0.w0) this.f2468c;
                if (this.f2467b) {
                    w0Var.setValue(Boolean.valueOf(!((Boolean) w0Var.getValue()).booleanValue()));
                }
                return ub.a0.f21526a;
        }
    }

    public /* synthetic */ s(boolean z10, Object obj, int i10) {
        this.f2466a = i10;
        this.f2467b = z10;
        this.f2468c = obj;
    }
}
