package k9;

import ac.i;
import bg.a2;
import com.cnl.kikoeru.R;
import h9.d;
import hf.y;
import ic.n;
import java.io.Serializable;
import jc.r;
import jc.z;
import na.q;
import pc.f0;
import pc.u;
import ub.a0;
import ub.m;
import x0.e1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class b extends i implements n {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ u[] f11228h = {z.f10839a.f(new r(c.class, "name", "<v#0>", 0))};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Serializable f11229e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Serializable f11230f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f11231g;

    @Override // ac.a
    public final yb.c o(Object obj, yb.c cVar) {
        return new b(2, cVar);
    }

    @Override // ic.n
    public final Object q(Object obj, Object obj2) {
        return ((b) o((y) obj, (yb.c) obj2)).u(a0.f21526a);
    }

    @Override // ac.a
    public final Object u(Object obj) {
        Serializable serializableA;
        int i10 = this.f11231g;
        a0 a0Var = a0.f21526a;
        zb.a aVar = zb.a.f26667a;
        if (i10 == 0) {
            ub.a.f(obj);
            a2 a2Var = (a2) d.f8241a.getValue();
            if (a2Var != null) {
                if (a2Var.f2830m == null && a2Var.f2840w == null && a2Var.f2837t == null) {
                    hg.b bVarP = f0.P(gg.c.a(), "username", "", z.a(String.class));
                    String str = ag.z.f369a;
                    serializableA = ag.z.c(a9.i.f(), bg.d.f2853a, null, null, (String) bVarP.c(f11228h[0]), a2Var.f2823f);
                    if (!(serializableA instanceof m)) {
                        String strG = q.g(R.string.mark_success);
                        this.f11229e = null;
                        this.f11230f = serializableA;
                        this.f11231g = 2;
                        if (q.j(strG, this) != aVar) {
                        }
                    }
                } else {
                    String str2 = ag.z.f369a;
                    serializableA = ag.z.a(a2Var.f2823f, a9.i.f());
                    if (!(serializableA instanceof m)) {
                        String strG2 = q.g(R.string.delete_success);
                        this.f11229e = serializableA;
                        this.f11230f = null;
                        this.f11231g = 1;
                        if (q.j(strG2, this) != aVar) {
                        }
                    }
                }
            }
        }
        if (i10 == 1) {
            serializableA = this.f11229e;
        } else {
            if (i10 != 2) {
                if (i10 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ub.a.f(obj);
                return a0Var;
            }
            serializableA = this.f11230f;
        }
        ub.a.f(obj);
        Throwable thA = ub.n.a(serializableA);
        if (thA != null) {
            thA.printStackTrace();
            ka.n.c(q.g(R.string.edit_failed), 0L, null, null, 511);
        }
        e1 e1Var = d.f8241a;
        this.f11229e = null;
        this.f11230f = null;
        this.f11231g = 3;
        return d.h(this) == aVar ? aVar : a0Var;
    }
}
