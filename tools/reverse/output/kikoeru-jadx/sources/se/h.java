package se;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ pc.u[] f19948a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final q4.k f19949b;

    static {
        jc.s sVar = new jc.s(h.class, "annotationsAttribute", "getAnnotationsAttribute(Lorg/jetbrains/kotlin/types/TypeAttributes;)Lorg/jetbrains/kotlin/types/AnnotationsTypeAttribute;", 1);
        jc.a0 a0Var = jc.z.f10839a;
        f19948a = new pc.u[]{a0Var.g(sVar)};
        m0.w wVar = h0.f19950b;
        pc.c cVarB = a0Var.b(g.class);
        wVar.getClass();
        String strX = cVarB.x();
        jc.l.b(strX);
        f19949b = new q4.k(wVar.D(strX));
    }

    public static final zc.h a(h0 h0Var) {
        zc.h hVar;
        jc.l.e(h0Var, "<this>");
        pc.u uVar = f19948a[0];
        q4.k kVar = f19949b;
        kVar.getClass();
        jc.l.e(uVar, "property");
        g gVar = (g) h0Var.f26214a.get(kVar.f17734a);
        return (gVar == null || (hVar = gVar.f19945a) == null) ? zc.g.f26696a : hVar;
    }
}
