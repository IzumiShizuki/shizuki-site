package ed;

import java.lang.reflect.Field;
import java.lang.reflect.Member;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class u extends w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Field f6514a;

    public u(Field field) {
        jc.l.e(field, "member");
        this.f6514a = field;
    }

    @Override // ed.w
    public final Member b() {
        return this.f6514a;
    }
}
