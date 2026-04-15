package eb;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class j extends z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6453a;

    public /* synthetic */ j(int i10) {
        this.f6453a = i10;
    }

    @Override // eb.z
    public final Object a(mb.a aVar) throws IOException {
        switch (this.f6453a) {
            case 0:
                if (aVar.h0() != 9) {
                    return Double.valueOf(aVar.L());
                }
                aVar.c0();
                return null;
            case 1:
                if (aVar.h0() != 9) {
                    return Float.valueOf((float) aVar.L());
                }
                aVar.c0();
                return null;
            default:
                aVar.n0();
                return null;
        }
    }

    @Override // eb.z
    public final void b(mb.b bVar, Object obj) throws IOException {
        switch (this.f6453a) {
            case 0:
                Number number = (Number) obj;
                if (number != null) {
                    double dDoubleValue = number.doubleValue();
                    m.a(dDoubleValue);
                    bVar.O(dDoubleValue);
                } else {
                    bVar.y();
                }
                break;
            case 1:
                Number numberValueOf = (Number) obj;
                if (numberValueOf != null) {
                    float fFloatValue = numberValueOf.floatValue();
                    m.a(fFloatValue);
                    if (!(numberValueOf instanceof Float)) {
                        numberValueOf = Float.valueOf(fFloatValue);
                    }
                    bVar.X(numberValueOf);
                } else {
                    bVar.y();
                }
                break;
            default:
                bVar.y();
                break;
        }
    }

    public String toString() {
        switch (this.f6453a) {
            case 2:
                return "AnonymousOrNonStaticLocalClassAdapter";
            default:
                return super.toString();
        }
    }
}
