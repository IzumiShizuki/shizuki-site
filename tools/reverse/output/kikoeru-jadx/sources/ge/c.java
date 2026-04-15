package ge;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class c extends g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f7524b = 1;

    public /* synthetic */ c(Object obj) {
        super(obj);
    }

    @Override // ge.g
    public final se.w a(yc.y yVar) {
        switch (this.f7524b) {
            case 0:
                jc.l.e(yVar, "module");
                vc.i iVarG = yVar.g();
                iVarG.getClass();
                return iVarG.s(vc.k.f22847f);
            case 1:
                jc.l.e(yVar, "module");
                vc.i iVarG2 = yVar.g();
                iVarG2.getClass();
                return iVarG2.s(vc.k.f22854m);
            default:
                jc.l.e(yVar, "module");
                vc.i iVarG3 = yVar.g();
                iVarG3.getClass();
                return iVarG3.s(vc.k.f22852k);
        }
    }

    @Override // ge.g
    public String toString() {
        switch (this.f7524b) {
            case 1:
                return ((Number) this.f7527a).doubleValue() + ".toDouble()";
            case 2:
                return ((Number) this.f7527a).floatValue() + ".toFloat()";
            default:
                return super.toString();
        }
    }

    public c(double d10) {
        super(Double.valueOf(d10));
    }

    public c(float f10) {
        super(Float.valueOf(f10));
    }
}
