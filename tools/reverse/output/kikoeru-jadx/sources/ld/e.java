package ld;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class e extends f0 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ int f12203l = 0;

    /* JADX WARN: Multi-variable type inference failed */
    public static final yc.t a(yc.t tVar) {
        jc.l.e(tVar, "functionDescriptor");
        be.e name = ((bd.p) tVar).getName();
        jc.l.d(name, "getName(...)");
        if (b(name)) {
            return (yc.t) ie.d.b(tVar, d.f12195b);
        }
        return null;
    }

    public static boolean b(be.e eVar) {
        jc.l.e(eVar, "<this>");
        return f0.f12218e.contains(eVar);
    }
}
