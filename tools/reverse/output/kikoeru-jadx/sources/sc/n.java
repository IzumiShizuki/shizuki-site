package sc;

import java.lang.reflect.Field;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class n extends n7.e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Field f19834o;

    public n(Field field) {
        jc.l.e(field, "field");
        this.f19834o = field;
    }

    @Override // n7.e
    public final String d() {
        StringBuilder sb = new StringBuilder();
        Field field = this.f19834o;
        String name = field.getName();
        jc.l.d(name, "getName(...)");
        sb.append(ld.v.a(name));
        sb.append("()");
        Class<?> type = field.getType();
        jc.l.d(type, "getType(...)");
        sb.append(ed.d.b(type));
        return sb.toString();
    }
}
