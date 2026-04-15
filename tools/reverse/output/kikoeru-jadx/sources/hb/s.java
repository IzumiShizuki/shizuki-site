package hb;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class s implements eb.a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g5.w f8351a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final eb.h f8352b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final gb.g f8353c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i f8354d;

    public s(g5.w wVar, eb.h hVar, gb.g gVar, i iVar) {
        List list = Collections.EMPTY_LIST;
        this.f8351a = wVar;
        this.f8352b = hVar;
        this.f8353c = gVar;
        this.f8354d = iVar;
    }

    public static void b(Class cls, String str, Field field, Field field2) {
        throw new IllegalArgumentException("Class " + cls.getName() + " declares multiple JSON fields named '" + str + "'; conflict is caused by fields " + jb.c.c(field) + " and " + jb.c.c(field2) + "\nSee " + "https://github.com/google/gson/blob/main/Troubleshooting.md#".concat("duplicate-fields"));
    }

    @Override // eb.a0
    public final eb.z a(eb.m mVar, lb.a aVar) {
        Class cls = aVar.f12165a;
        if (!Object.class.isAssignableFrom(cls)) {
            return null;
        }
        pc.f0 f0Var = jb.c.f10806a;
        if (!Modifier.isStatic(cls.getModifiers()) && (cls.isAnonymousClass() || cls.isLocalClass())) {
            return new eb.j(2);
        }
        List list = Collections.EMPTY_LIST;
        gb.d.f();
        return jb.c.f10806a.L(cls) ? new r(cls, c(mVar, aVar, cls, true)) : new p(this.f8351a.u(aVar), c(mVar, aVar, cls, false));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x015b  */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r14v5 */
    /* JADX WARN: Type inference failed for: r27v0 */
    /* JADX WARN: Type inference failed for: r27v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r27v2 */
    /* JADX WARN: Type inference failed for: r28v0, types: [hb.s] */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final hb.q c(eb.m r29, lb.a r30, java.lang.Class r31, boolean r32) {
        /*
            Method dump skipped, instruction units count: 443
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: hb.s.c(eb.m, lb.a, java.lang.Class, boolean):hb.q");
    }

    public final boolean d(Field field, boolean z10) {
        boolean z11;
        gb.g gVar = this.f8353c;
        gVar.getClass();
        if ((136 & field.getModifiers()) != 0 || field.isSynthetic() || gVar.b(field.getType(), z10)) {
            z11 = true;
        } else {
            List list = z10 ? gVar.f7477a : gVar.f7478b;
            if (!list.isEmpty()) {
                Iterator it = list.iterator();
                if (it.hasNext()) {
                    it.next().getClass();
                    throw new ClassCastException();
                }
            }
            z11 = false;
        }
        return !z11;
    }
}
