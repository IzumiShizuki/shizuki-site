package tc;

import java.lang.reflect.Member;
import java.lang.reflect.Type;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class a0 implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a0 f20613a = new a0();

    @Override // tc.g
    public final List a() {
        return vb.r.f22819a;
    }

    @Override // tc.g
    public final /* bridge */ /* synthetic */ Member b() {
        return null;
    }

    @Override // tc.g
    public final /* bridge */ boolean c() {
        return false;
    }

    @Override // tc.g
    public final Object d(Object[] objArr) {
        jc.l.e(objArr, "args");
        throw new UnsupportedOperationException("call/callBy are not supported for this declaration.");
    }

    @Override // tc.g
    public final Type n() {
        Class cls = Void.TYPE;
        jc.l.d(cls, "TYPE");
        return cls;
    }
}
