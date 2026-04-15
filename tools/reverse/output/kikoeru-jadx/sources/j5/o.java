package j5;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o implements xa.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10373a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f10374b;

    public /* synthetic */ o(int i10, Object obj) {
        this.f10373a = i10;
        this.f10374b = obj;
    }

    @Override // xa.i
    public final Object get() {
        switch (this.f10373a) {
            case 0:
                try {
                    return (c0) ((Class) this.f10374b).getConstructor(null).newInstance(null);
                } catch (Exception e10) {
                    throw new IllegalStateException(e10);
                }
            case 1:
                return (v4.j) this.f10374b;
            case 2:
                return (q) this.f10374b;
            case 3:
                return (i9.h) this.f10374b;
            default:
                return Boolean.valueOf(((AtomicBoolean) this.f10374b).get());
        }
    }
}
