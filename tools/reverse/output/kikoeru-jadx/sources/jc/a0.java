package jc;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public class a0 {
    public pc.c b(Class cls) {
        return new f(cls);
    }

    public pc.e c(Class cls) {
        return new q(cls);
    }

    public String h(i iVar) {
        String string = iVar.getClass().getGenericInterfaces()[0].toString();
        return string.startsWith("kotlin.jvm.functions.") ? string.substring(21) : string;
    }

    public String i(m mVar) {
        return h(mVar);
    }

    public pc.v j(pc.c cVar, List list) {
        return new d0(cVar, list);
    }

    public pc.f a(j jVar) {
        return jVar;
    }

    public pc.i d(n nVar) {
        return nVar;
    }

    public pc.k e(o oVar) {
        return oVar;
    }

    public pc.r f(r rVar) {
        return rVar;
    }

    public pc.t g(s sVar) {
        return sVar;
    }
}
