package se;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class h0 extends ye.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final m0.w f19950b = new m0.w(20);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final h0 f19951c = new h0(vb.r.f22819a);

    public h0(List list) {
        this.f26214a = ye.j.f26232a;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            g gVar = (g) it.next();
            gVar.getClass();
            String strX = jc.z.f10839a.b(g.class).x();
            jc.l.b(strX);
            int iD = f19950b.D(strX);
            int iA = this.f26214a.a();
            if (iA != 0) {
                if (iA == 1) {
                    ye.a aVar = this.f26214a;
                    try {
                        jc.l.c(aVar, "null cannot be cast to non-null type org.jetbrains.kotlin.util.OneElementArrayMap<T of org.jetbrains.kotlin.util.AttributeArrayOwner>");
                        ye.o oVar = (ye.o) aVar;
                        int i10 = oVar.f26243b;
                        if (i10 == iD) {
                            this.f26214a = new ye.o(iD, gVar);
                        } else {
                            ye.c cVar = new ye.c();
                            cVar.f26212a = new Object[20];
                            cVar.f26213b = 0;
                            cVar.i(i10, oVar.f26242a);
                            this.f26214a = cVar;
                        }
                    } catch (ClassCastException e10) {
                        throw new IllegalStateException(ye.d.a(aVar, 1, "OneElementArrayMap"), e10);
                    }
                }
                this.f26214a.i(iD, gVar);
            } else {
                ye.a aVar2 = this.f26214a;
                if (!(aVar2 instanceof ye.j)) {
                    throw new IllegalStateException(ye.d.a(aVar2, 0, "EmptyArrayMap"));
                }
                this.f26214a = new ye.o(iD, gVar);
            }
        }
    }
}
