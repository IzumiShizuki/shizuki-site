package hb;

import java.util.Calendar;
import java.util.GregorianCalendar;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class k implements eb.a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8321a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f8322b;

    public /* synthetic */ k(int i10, Object obj) {
        this.f8321a = i10;
        this.f8322b = obj;
    }

    @Override // eb.a0
    public final eb.z a(eb.m mVar, lb.a aVar) {
        switch (this.f8321a) {
            case 0:
                if (aVar.f12165a == Number.class) {
                    return (l) this.f8322b;
                }
                return null;
            case 1:
                if (aVar.f12165a == Object.class) {
                    return new m(mVar, (eb.y) this.f8322b);
                }
                return null;
            default:
                Class cls = aVar.f12165a;
                if (cls == Calendar.class || cls == GregorianCalendar.class) {
                    return (l0) this.f8322b;
                }
                return null;
        }
    }

    public String toString() {
        switch (this.f8321a) {
            case 2:
                return "Factory[type=" + Calendar.class.getName() + "+" + GregorianCalendar.class.getName() + ",adapter=" + ((l0) this.f8322b) + "]";
            default:
                return super.toString();
        }
    }
}
