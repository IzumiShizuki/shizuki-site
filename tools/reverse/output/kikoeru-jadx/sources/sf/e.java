package sf;

import java.util.List;
import java.util.Map;
import ub.a0;
import wf.n1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e implements ic.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20016a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f20017b;

    public /* synthetic */ e(f fVar, int i10) {
        this.f20016a = i10;
        this.f20017b = fVar;
    }

    @Override // ic.k
    public final Object a(Object obj) {
        uf.a aVar = (uf.a) obj;
        switch (this.f20016a) {
            case 0:
                jc.l.e(aVar, "$this$buildSerialDescriptor");
                uf.a.a(aVar, "type", n1.f24153b);
                StringBuilder sb = new StringBuilder("kotlinx.serialization.Sealed<");
                f fVar = this.f20017b;
                sb.append(fVar.f20018a.y());
                sb.append('>');
                e eVar = new e(fVar, 1);
                uf.a.a(aVar, "value", ud.e.f(sb.toString(), uf.i.f21703b, new uf.g[0], eVar));
                List list = fVar.f20019b;
                jc.l.e(list, "<set-?>");
                aVar.f21671b = list;
                break;
            default:
                jc.l.e(aVar, "$this$buildSerialDescriptor");
                for (Map.Entry entry : this.f20017b.f20022e.entrySet()) {
                    uf.a.a(aVar, (String) entry.getKey(), ((a) entry.getValue()).a());
                }
                break;
        }
        return a0.f21526a;
    }
}
