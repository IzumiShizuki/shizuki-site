package na;

import com.cnl.kikoeru.R;
import java.io.Serializable;
import pc.f0;
import x0.e1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class b extends ac.i implements ic.n {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ pc.u[] f15673i = {jc.z.f10839a.f(new jc.r(c.class, "name", "<v#0>", 1))};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Serializable f15674e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f15675f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f15676g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f15677h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(boolean z10, long j10, yb.c cVar) {
        super(2, cVar);
        this.f15676g = z10;
        this.f15677h = j10;
    }

    @Override // ac.a
    public final yb.c o(Object obj, yb.c cVar) {
        return new b(this.f15676g, this.f15677h, cVar);
    }

    @Override // ic.n
    public final Object q(Object obj, Object obj2) {
        return ((b) o((hf.y) obj, (yb.c) obj2)).u(ub.a0.f21526a);
    }

    @Override // ac.a
    public final Object u(Object obj) {
        Serializable serializableC;
        Serializable serializable;
        Throwable thA;
        int i10 = this.f15675f;
        if (i10 == 0) {
            ub.a.f(obj);
            if (this.f15676g) {
                String str = ag.z.f369a;
                serializableC = ag.z.a(this.f15677h, a9.i.f());
            } else {
                hg.b bVarP = f0.P(gg.c.a(), "username", "", jc.z.a(String.class));
                String str2 = ag.z.f369a;
                serializableC = ag.z.c(a9.i.f(), bg.d.f2853a, null, null, (String) bVarP.c(f15673i[0]), this.f15677h);
            }
            serializable = serializableC;
            if (!(serializable instanceof ub.m)) {
                e1 e1Var = h9.d.f8241a;
                this.f15674e = serializable;
                this.f15675f = 1;
                Object objH = h9.d.h(this);
                zb.a aVar = zb.a.f26667a;
                if (objH == aVar) {
                    return aVar;
                }
            }
            thA = ub.n.a(serializable);
            if (thA != null && !q.k(thA)) {
                ka.n.c(thA, 0L, null, null, 511);
            }
            return new ub.n(serializable);
        }
        if (i10 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        serializable = this.f15674e;
        ub.a.f(obj);
        ka.n.c(q.g(R.string.mark_success), 0L, null, null, 511);
        thA = ub.n.a(serializable);
        if (thA != null) {
            ka.n.c(thA, 0L, null, null, 511);
        }
        return new ub.n(serializable);
    }
}
